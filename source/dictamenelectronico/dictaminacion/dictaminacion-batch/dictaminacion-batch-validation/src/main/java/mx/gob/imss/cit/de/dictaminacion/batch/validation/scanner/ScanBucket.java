package mx.gob.imss.cit.de.dictaminacion.batch.validation.scanner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.gob.imss.cit.de.dictaminacion.batch.validation.dao.AtestiguamientoDAO;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.dao.AtestiguamientoDictamenDAO;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.dao.RutasDAO;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.enums.AtestiguamientoEnum;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.AtestiguamientoDictamenTO;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.AtestiguamientoTO;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.RutaTO;

@Component
public class ScanBucket {
	private Logger LOG=Logger.getLogger(ScanBucket.class);
    private SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    private String rutaOrigen;
    private String rutaDestino;
    private String rutaProcesamiento;
    private String bucketName;
    private String delay;
    private String rutaAWSCredentials;
    private String[] extension;
	private String fields = "regPatronal, nomPrimerApellidoTrabajador, nomSegundoApellidoTrabajador, nomNombreTrabajador, numNssTrabajador, rfcTrabajador, curpTrabajador, impSueldosSalarios, impGratificaciones, impViaticos, impTiempoExtra, impPrimaVacacional, impPrimaDominical, impPtu, impReembolsoGm, impFondoAhorro, impCajaAhorro, impValesDespensa, impAyudaGf, impContribucionPatron, impPremioPuntualidad, impPremioAsistencia, impPrimaSeguroVida, impSeguroGmm, impValesRestaurant, impValesGasolina, impValesRopa, impAyudaRenta, impAyudaEscolar, impAyudaAnteojos, impAyudaTransporte, impCuotaSindical, impSubsidioIncapacidad, impBecaTrabajadorHijo, impOtrosIngresosXsalario, impPagoOtroEmpleador, impJubPenRetiro, impOtrosPagosXseparacion, impTotal";
	private String prototype = "a1";
    private RutasDAO rutasDAO; 
    private AtestiguamientoDAO atestiguamientoDAO;
    private AtestiguamientoDictamenDAO atestiguamientoDictamenDAO;
	
    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private Job job;
    
    @PostConstruct
    public void init(){
		LOG.info("Origen: "+rutaOrigen);
		LOG.info("Destino: "+rutaDestino);
	}
	  
    public void run() throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException {
    	JobParameters parameters;
    	
    	List<RutaTO> rutas=rutasDAO.obtieneRutas();
    	for(int i=0;i<rutas.size();i++){
    		File file = new File(rutas.get(i).getRuta());
    		if (file.exists()){
    			
        		rutasDAO.borrarBitacora(rutas.get(i).getIdBitacora());
        		rutasDAO.borrarTablaAseveracion(rutas.get(i).getCveIdPatronDictamen(), rutas.get(i).getCveIdAseveracion());
        		rutasDAO.actualizaStatus(3, rutas.get(i).getCveIdPatronDictamen(), rutas.get(i).getCveIdAseveracion());
        		AtestiguamientoTO atestiguamiento=atestiguamientoDAO.obtieneAtestiguamiento(rutas.get(i).getIdAseveracionPadre()!=0 
        				? rutas.get(i).getIdAseveracionPadre():rutas.get(i).getCveIdAseveracion());
        		
        		List<AtestiguamientoDictamenTO> atestiguamientosDictamen=atestiguamientoDictamenDAO
        			.validaAtesDictamenByPatronDictamen(rutas.get(i).getCveIdPatronDictamen(), atestiguamiento.getIdAtestiguamiento());
        		
        		if(atestiguamientosDictamen.size()>0){
        			
        			atestiguamientoDictamenDAO.actualizaEstatus(1L, rutas.get(i).getCveIdPatronDictamen(),atestiguamiento.getIdAtestiguamiento());
        			
        		}else{
        			AtestiguamientoDictamenTO atestiguamientoDictamenTO=new AtestiguamientoDictamenTO();
        			
        			atestiguamientoDictamenTO.setIdPatronDictamen(rutas.get(i).getCveIdPatronDictamen());
        			atestiguamientoDictamenTO.setIdAtestiguamiento(atestiguamiento.getIdAtestiguamiento());
        			atestiguamientoDictamenTO.setRegistroAlta(new Date());
        			atestiguamientoDictamenTO.setIdUsuario("11111");
        			atestiguamientoDictamenTO.setIdEstadoAtestiguamiento(1L);
        			
        			atestiguamientoDictamenDAO.insertaAtestiguamientoDictamen(atestiguamientoDictamenTO);
        			
        			atestiguamientoDictamenTO.setIdAtestiguamiento(AtestiguamientoEnum.B10.getIdAtestiguamiento());
        			atestiguamientoDictamenDAO.insertaAtestiguamientoDictamen(atestiguamientoDictamenTO);
        			
        			
        		}
        		
        		System.out.println("AtestiguamientoID"+atestiguamiento.getIdAtestiguamiento());
        		
        		File processFile = this.moveFile(file, file.getAbsolutePath().replaceFirst("DictamenFiles", "DictamenProceso"), file.getParent().replaceFirst("DictamenFiles", "DictamenProceso"));    		    		
        		JobParametersBuilder parametersBuilder = new JobParametersBuilder();
    			parametersBuilder.addString("origen", processFile.getAbsolutePath()).toJobParameters();
    			parametersBuilder.addString("destino", processFile.getAbsolutePath().replaceFirst("DictamenProceso", "DictamenDestino")).toJobParameters();
    			parametersBuilder.addString("date", new Date().toString());
    			parametersBuilder.addString("delay", delay);
    			parametersBuilder.addString("fields", this.fields);
    			parametersBuilder.addString("prototype", this.prototype);
    			parametersBuilder.addLong("idAseveracion", Long.valueOf(rutas.get(i).getCveIdAseveracion()));
    			parametersBuilder.addLong("cveIdBitacoraCargaAsev", Long.valueOf(rutas.get(i).getIdBitacora()));
    			parametersBuilder.addLong("cveIdPatronDictamen", Long.valueOf(rutas.get(i).getCveIdPatronDictamen()));
    			parameters = parametersBuilder.toJobParameters();
    			JobExecution execution = jobLauncher.run(job, parameters);
    			LOG.info("Exit Status : " + execution.getStatus());    			
    		}
    	}    	 

	  LOG.debug("The time is now " + dateFormat.format(new Date()));
    }
    
    private File moveFile(File origen, String destino, String parentDirectory){
    	
    	InputStream inStream = null;
    	OutputStream outStream = null;
    	
    	try{
    	File processDirectory = new File(parentDirectory);
    	if (! processDirectory.exists()){
    		System.out.println(processDirectory.mkdirs());
        }
    	
    	File processFile = new File(destino);
    	
	    inStream = new FileInputStream(origen);
	    outStream = new FileOutputStream(destino);
    	
	    byte[] buffer = new byte[1024];
		
	    int length;
	    while ((length = inStream.read(buffer)) > 0){	 
	    	outStream.write(buffer, 0, length);	 
	    }
	 
	    inStream.close();
	    outStream.close();
	    origen.delete();
	    return (processFile);
    	}catch (IOException e){
    		return null;
    	}
    }
	  
	public String getRutaOrigen() {
		return rutaOrigen;
	}

	public void setRutaOrigen(String rutaOrigen) {
		this.rutaOrigen = rutaOrigen;
	}

	public String getRutaDestino() {
		return rutaDestino;
	}

	public void setRutaDestino(String rutaDestino) {
		this.rutaDestino = rutaDestino;
	}

	public String getRutaProcesamiento() {
		return rutaProcesamiento;
	}

	public void setRutaProcesamiento(String rutaProcesamiento) {
		this.rutaProcesamiento = rutaProcesamiento;
	}

	public String getBucketName() {
		return bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public String getRutaAWSCredentials() {
		return rutaAWSCredentials;
	}

	public void setRutaAWSCredentials(String rutaAWSCredentials) {
		this.rutaAWSCredentials = rutaAWSCredentials;
	}

	public String[] getExtension() {
		return extension;
	}

	public void setExtension(String[] extension) {
		this.extension = extension;
	}

	public void setRutasDAO(RutasDAO rutasDAO) {
		this.rutasDAO = rutasDAO;
	}

	public RutasDAO getRutasDAO() {
		return rutasDAO;
	}

	public AtestiguamientoDAO getAtestiguamientoDAO() {
		return atestiguamientoDAO;
	}

	public void setAtestiguamientoDAO(AtestiguamientoDAO atestiguamientoDAO) {
		this.atestiguamientoDAO = atestiguamientoDAO;
	}

	public AtestiguamientoDictamenDAO getAtestiguamientoDictamenDAO() {
		return atestiguamientoDictamenDAO;
	}

	public void setAtestiguamientoDictamenDAO(
			AtestiguamientoDictamenDAO atestiguamientoDictamenDAO) {
		this.atestiguamientoDictamenDAO = atestiguamientoDictamenDAO;
	}
	
	
    
}

