package mx.gob.imss.cit.de.dictaminacion.batch.validation.processors;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.ItemProcessor;

import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.A1TO;
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
		
			System.out.println("Lineas procesadas: "+linesTO.getProcessedLines());
			System.out.println("Lineas invalidas: "+linesTO.getInvalidLines());
			
			linesTO.setProcessedLines(linesTO.getProcessedLines()+1);					
			if (!((A1TO)paramI).getBitacoraErroresTO().getDesErrores().isEmpty()){
				System.out.println("bitacoraErrores");
				invalidLines.add(((A1TO)paramI).getLineNumber());
				linesTO.setInvalidLines(invalidLines);
				return ((A1TO)paramI).getBitacoraErroresTO();
			}else{		
				System.out.println("No hubo errores");
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

