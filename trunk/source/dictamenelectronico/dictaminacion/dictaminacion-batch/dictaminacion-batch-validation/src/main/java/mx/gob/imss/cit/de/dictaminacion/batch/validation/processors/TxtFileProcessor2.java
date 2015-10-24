package mx.gob.imss.cit.de.dictaminacion.batch.validation.processors;

import java.lang.reflect.Field;
import java.util.List;

import org.springframework.batch.item.ItemProcessor;

import mx.gob.imss.cit.de.dictaminacion.batch.validation.dao.RutasDAO;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.LinesTO;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class TxtFileProcessor2 implements ItemProcessor<Object, Object> {
	private LinesTO linesTO;
	private RutasDAO rutasDAO;
	private Long cveIdPatronDictamen;
	private Long cveIdAseveracion;
	
	@Override
	public Object process(Object paramI) throws Exception {
		int lineNumber = 0;
		
		Object someObject = paramI;
		for (Field field : someObject.getClass().getDeclaredFields()) {
		    field.setAccessible(true); // You might want to set modifier to public first.
		    Object value = field.get(someObject); 
		    if (value != null) {
		    	if (field.getName().compareTo("lineNumber")==0){
		    		lineNumber=(Integer) value;
		    	}
		        System.out.println(field.getName() + "=" + value);
		    }
		}

		System.out.println("Lineas procesadas: "+linesTO.getProcessedLines());
		System.out.println("Lineas invalidas: "+linesTO.getInvalidLines());
		System.out.println("Linea actual: "+lineNumber);
		
		List<Integer> invalidLines = linesTO.getInvalidLines();
		if(invalidLines.size()>0){
			rutasDAO.actualizaStatus(4, cveIdPatronDictamen, cveIdAseveracion);
			if(linesTO.getProcessedLines()+1==lineNumber){
				linesTO = new LinesTO();
			}
			return null;
		}
		else {	  
			  if(invalidLines.size()==0){
				  rutasDAO.actualizaStatus(1, cveIdPatronDictamen, cveIdAseveracion);
			  }
			return paramI;
		}

	}

	public LinesTO getLinesTO() {
		return linesTO;
	}

	public void setLinesTO(LinesTO linesTO) {
		this.linesTO = linesTO;
	}

	public RutasDAO getRutasDAO() {
		return rutasDAO;
	}

	public void setRutasDAO(RutasDAO rutasDAO) {
		this.rutasDAO = rutasDAO;
	}

	public Long getCveIdPatronDictamen() {
		return cveIdPatronDictamen;
	}

	public void setCveIdPatronDictamen(Long cveIdPatronDictamen) {
		this.cveIdPatronDictamen = cveIdPatronDictamen;
	}

	public Long getCveIdAseveracion() {
		return cveIdAseveracion;
	}

	public void setCveIdAseveracion(Long cveIdAseveracion) {
		this.cveIdAseveracion = cveIdAseveracion;
	}


}

