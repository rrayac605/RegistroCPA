package mx.gob.imss.cit.dictamen.contador.web.beans.activacion;

import java.util.HashMap;
import java.util.Map;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;




import mx.gob.imss.cit.dictamen.contador.integration.api.ContadorPublicoIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.DictamenIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DomicilioFiscalDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.PersonaMoralBDTUDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.PersonaMoralDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.exception.DictamenContadorNegocioException;
import mx.gob.imss.cit.dictamen.contador.web.beans.InformacionPatronalBean;
import mx.gob.imss.cit.dictamen.contador.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.contador.web.navigation.ActivacionNavigation;
import mx.gob.imss.cit.dictamen.contador.web.pages.activacion.ActivacionContadorPage;
import mx.gob.imss.cit.dictamen.contador.web.pages.activacion.ActivacionDespachoPage;
import mx.gob.imss.cit.dictamen.contador.web.util.FacesUtils;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;

@ManagedBean(name = "activacionDespachoBean")
@ViewScoped
public class ActivacionDespachoBean extends BaseBean {

	private static final Logger LOGGER = Logger.getLogger(ActivacionDespachoBean.class);

	
	private static final long serialVersionUID = -4696391496237240996L;
    
	private Integer selectedTipoProfesion;
	private Integer selectedTieneTrabajador;
	private Integer selectedPuestoCPA;


	private boolean activarTieneTrabajador=false;
	private boolean activarNumTrabajador=false;
	private boolean activarDatoDespacho=false;
    private boolean activarContadorValido=false;
    private boolean activarProcesar=true;
    
	@ManagedProperty(value = "#{activacionDespachoPage}")
	private ActivacionDespachoPage activacionDespachoPage;
	
	@ManagedProperty(value = "#{activacionContadorPage}")
	private ActivacionContadorPage activacionContadorPage;
	
	private Map<String,Integer> mapTipoProfesion = new HashMap<String,Integer>();
    private Map<String,Integer> mapTieneTrabajador = new HashMap<String,Integer>();
    private Map<String,Integer> mapPuestoCPA = new HashMap<String,Integer>();


	@EJB(mappedName="contadorPublicoIntegrator", name="contadorPublicoIntegrator")
	private ContadorPublicoIntegrator contadorPublicoIntegrator;
	
	@EJB(mappedName="dictamenIntegrator", name="dictamenIntegrator")
	private DictamenIntegrator dictamenIntegrator;

	@PostConstruct
	public void init(){
		this.setVentanaInicio(ActivacionNavigation.ACTIVACION_SOLICITUD);
		selectedTipoProfesion = 0;
		mapTipoProfesion.put( "Despacho",1);
		mapTipoProfesion.put( "Independiente",2);
		
		selectedTieneTrabajador = 0;
		mapTieneTrabajador.put("Si", 1);
		mapTieneTrabajador.put("No", 2);
		
		selectedPuestoCPA = 0;
		mapPuestoCPA.put("Director", 0);
		mapPuestoCPA.put("Socio", 1);
		mapPuestoCPA.put("Gerente", 2);
		mapPuestoCPA.put("Auditor", 3);

	    if(this.activacionContadorPage.isValido()){
			PersonaMoralDTO personaMoralDTO = new PersonaMoralDTO();
			DomicilioFiscalDTO domicilioFiscalDTO = new DomicilioFiscalDTO();
			personaMoralDTO.setDomicilioFiscalDTO(domicilioFiscalDTO);
			activacionDespachoPage.setPersonaMoralDTO(personaMoralDTO);
	    }
	}
	
	public String accionInicio(){
		  this.activacionDespachoPage.setValido(false);
		  return this.getVentanaInicio();
	}
	
	public void accionBuscarCPA(){
       String rfc = activacionDespachoPage.getPersonaMoralDTO().getRfc();
	   LOGGER.info("RFC="+activacionDespachoPage.getPersonaMoralDTO().getRfc());
	   PersonaMoralDTO personaMoralDTO = contadorPublicoIntegrator.consultarPersonaMoralPorRFC(rfc);
	   
	   if(personaMoralDTO!=null){
		   
		   try {
			   LOGGER.info("despacho.consultado.bdtu.rfc="+rfc);
			   PersonaMoralBDTUDTO personaMoralBDTUDTO = dictamenIntegrator.consultarPersonaMoralPorRFC(rfc);
			   if(personaMoralBDTUDTO!=null){
				   LOGGER.info("accionBuscarCPA.despacho.idPersona="+personaMoralBDTUDTO.getIdPersona());
				   activacionDespachoPage.setPersonaMoralDTO(personaMoralDTO);;
				   this.setActivarContadorValido(true);
		    	   this.setActivarProcesar(false);
		    	   
		    	   activacionDespachoPage.setPersonaMoralBDTUDTO(personaMoralBDTUDTO);
			   }else{
				   FacesUtils.getFacesContext().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Activacion:"," No se encontraron coincidencias en BDTU con el RFC proporcionado:"+rfc+". Favor de verificarlo con el Despacho al que pertenece e intente nuevamente"));
				   this.setActivarContadorValido(false);

			   }
	
		} catch (DictamenContadorNegocioException e) {
			LOGGER.info(e.getMessage(),e);
		}
		   
    
	   }else{
		   
		   FacesUtils.getFacesContext().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Activacion:"," No se encontraron coincidencias en SAT con el RFC proporcionado:"+rfc+". Favor de verificarlo con el Despacho al que pertenece e intente nuevamente"));
		   this.setActivarContadorValido(false);
	   
	   }
	   
	}
	public void selectTrabajadorCargo(){
	    LOGGER.info("selectedTieneTrabajador="+selectedTieneTrabajador);
	    switch(selectedTieneTrabajador){
        case 0:
        	this.setActivarDatoDespacho(false);
            this.setActivarNumTrabajador(false);
     	    this.setActivarContadorValido(false);
     	    this.setActivarProcesar(true);

        break;
        case 1:
            this.setActivarNumTrabajador(true);
        	this.setActivarDatoDespacho(false);
     	    this.setActivarContadorValido(false);
     	    this.setActivarProcesar(false);

    	    LOGGER.info("1.selectedTieneTrabajador.ActivarNumTrabajador="+activarNumTrabajador);

        break;
        case 2:
            this.setActivarNumTrabajador(false);
        	this.setActivarDatoDespacho(false);
     	    this.setActivarContadorValido(false);
     	    this.setActivarProcesar(false);


        break;
    }
	    LOGGER.info("selectedTieneTrabajador.ActivarNumTrabajador="+activarNumTrabajador);
	    
	}
	public String accionAtras(){
		this.activacionDespachoPage.setValido(false);
	    return "activacion_contador";
	}
	
	public void selectTipoProfesion(){
	    LOGGER.info("selectTipoProfesion="+selectedTipoProfesion);
	    switch(selectedTipoProfesion){
	        case 0:
	        	this.setActivarDatoDespacho(false);
	        	this.setActivarTieneTrabajador(false);
	            this.setActivarNumTrabajador(false);
	     	    this.setActivarContadorValido(false);

	     	    this.setActivarProcesar(true);

	        break;
	        case 1:
	        	this.setActivarDatoDespacho(true);
	        	this.setActivarTieneTrabajador(false);
	            this.setActivarNumTrabajador(false);
	     	    this.setActivarContadorValido(false);
	     	    this.setActivarProcesar(true);



	        break;
	        case 2:
	        	this.setActivarDatoDespacho(false);
	        	this.setActivarTieneTrabajador(true);
	            this.setActivarNumTrabajador(false);
	     	    this.setActivarContadorValido(false);
	     	    this.setActivarProcesar(true);

	        break;
	    }
	}
	
	public boolean isActivarNumTrabajador() {
		return activarNumTrabajador;
	}
	public void setActivarNumTrabajador(boolean activarNumTrabajador) {
		this.activarNumTrabajador = activarNumTrabajador;
	}
	
	public String siguiente(){
		  this.activacionDespachoPage.setValido(true);

		  LOGGER.info("Redirect=activacion_colegio");
		  return "activacion_colegio";
	}


	public Map<String,Integer> getMapTipoProfesion() {
		return mapTipoProfesion;
	}
	public void setMapTipoProfesion(Map<String,Integer> mapTipoProfesion) {
		this.mapTipoProfesion = mapTipoProfesion;
	}
	
	public Integer getSelectedTipoProfesion() {
		return selectedTipoProfesion;
	}

	public void setSelectedTipoProfesion(Integer selectedTipoProfesion) {
		this.selectedTipoProfesion = selectedTipoProfesion;
	}

	public Integer getSelectedTieneTrabajador() {
		return selectedTieneTrabajador;
	}

	public void setSelectedTieneTrabajador(Integer selectedTieneTrabajador) {
		this.selectedTieneTrabajador = selectedTieneTrabajador;
	}

	public Map<String, Integer> getMapTieneTrabajador() {
		return mapTieneTrabajador;
	}

	public void setMapTieneTrabajador(Map<String, Integer> mapTieneTrabajador) {
		this.mapTieneTrabajador = mapTieneTrabajador;
	}
	
	public boolean isActivarTieneTrabajador() {
		return activarTieneTrabajador;
	}

	public void setActivarTieneTrabajador(boolean activarTieneTrabajador) {
		this.activarTieneTrabajador = activarTieneTrabajador;
	}

	public boolean isActivarDatoDespacho() {
		return activarDatoDespacho;
	}

	public void setActivarDatoDespacho(boolean activarDatoDespacho) {
		this.activarDatoDespacho = activarDatoDespacho;
	}

	public Map<String, Integer> getMapPuestoCPA() {
		return mapPuestoCPA;
	}
	public void setMapPuestoCPA(Map<String, Integer> mapPuestoCPA) {
		this.mapPuestoCPA = mapPuestoCPA;
	}

	public ActivacionDespachoPage getActivacionDespachoPage() {
		return activacionDespachoPage;
	}
	public void setActivacionDespachoPage(
			ActivacionDespachoPage activacionDespachoPage) {
		this.activacionDespachoPage = activacionDespachoPage;
	}
	
	public Integer getSelectedPuestoCPA() {
		return selectedPuestoCPA;
	}
	public void setSelectedPuestoCPA(Integer selectedPuestoCPA) {
		this.selectedPuestoCPA = selectedPuestoCPA;
	}
	

	public boolean isActivarContadorValido() {
		return activarContadorValido;
	}
	public void setActivarContadorValido(boolean activarContadorValido) {
		this.activarContadorValido = activarContadorValido;
	}
	
	public ContadorPublicoIntegrator getContadorPublicoIntegrator() {
		return contadorPublicoIntegrator;
	}
	public void setContadorPublicoIntegrator(
			ContadorPublicoIntegrator contadorPublicoIntegrator) {
		this.contadorPublicoIntegrator = contadorPublicoIntegrator;
	}

	public boolean isActivarProcesar() {
		return activarProcesar;
	}
	public void setActivarProcesar(boolean activarProcesar) {
		this.activarProcesar = activarProcesar;
	}

	public DictamenIntegrator getDictamenIntegrator() {
		return dictamenIntegrator;
	}
	public void setDictamenIntegrator(DictamenIntegrator dictamenIntegrator) {
		this.dictamenIntegrator = dictamenIntegrator;
	}
	

	public ActivacionContadorPage getActivacionContadorPage() {
		return activacionContadorPage;
	}

	public void setActivacionContadorPage(
			ActivacionContadorPage activacionContadorPage) {
		this.activacionContadorPage = activacionContadorPage;
	}
}
