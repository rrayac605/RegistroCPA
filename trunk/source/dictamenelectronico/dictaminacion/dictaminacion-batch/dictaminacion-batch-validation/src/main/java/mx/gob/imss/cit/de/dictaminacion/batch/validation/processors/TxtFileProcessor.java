package mx.gob.imss.cit.de.dictaminacion.batch.validation.processors;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.ItemProcessor;

import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.A1TO;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.A2TO;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.BitacoraErroresTO;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.LinesTO;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class TxtFileProcessor implements ItemProcessor<Object, BitacoraErroresTO> {
	private LinesTO linesTO;
	List<Integer> invalidLines = new ArrayList<Integer>();
	
	@Override
	public BitacoraErroresTO process(Object paramI) throws Exception {
//			for (Field field : someObject.getClass().getDeclaredFields()) {
//			    field.setAccessible(true); // You might want to set modifier to public first.
//			    Object value = field.get(someObject); 
//			    if (value != null) {
//			    	if (field.getName().compareTo("lineNumber")==0){
//			    		lineNumber=(Integer) value;
//			    	}
//			        System.out.println(field.getName() + "=" + value);
//			    }
//			}
		
			System.out.println("Lineas procesadas: "+linesTO.getProcessedLines());
			System.out.println("Lineas invalidas: "+linesTO.getInvalidLines());			
			
			linesTO.setProcessedLines(linesTO.getProcessedLines()+1);
			if (paramI instanceof A1TO){
				if (!((A1TO)paramI).getBitacoraErroresTO().getDesErrores().isEmpty()){
					System.out.println("bitacoraErrores");
					invalidLines.add(((A1TO)paramI).getLineNumber());
					linesTO.setInvalidLines(invalidLines);
					return ((A1TO)paramI).getBitacoraErroresTO();
				}else{		
					System.out.println("No hubo errores");
					return null;
				}
			}else if (paramI instanceof A1TO){
				if (!((A2TO)paramI).getBitacoraErroresTO().getDesErrores().isEmpty()){
					System.out.println("bitacoraErrores");
					invalidLines.add(((A2TO)paramI).getLineNumber());
					linesTO.setInvalidLines(invalidLines);
					return ((A2TO)paramI).getBitacoraErroresTO();
				}else{		
					System.out.println("No hubo errores");
					return null;
				}
			}else{
				return null;
			}	

	}

	public List<Integer> getInvalidLines() {
		return invalidLines;
	}

	public void setInvalidLines(List<Integer> invalidLines) {
		this.invalidLines = invalidLines;
	}

	public LinesTO getLinesTO() {
		return linesTO;
	}

	public void setLinesTO(LinesTO linesTO) {
		this.linesTO = linesTO;
	}

}

