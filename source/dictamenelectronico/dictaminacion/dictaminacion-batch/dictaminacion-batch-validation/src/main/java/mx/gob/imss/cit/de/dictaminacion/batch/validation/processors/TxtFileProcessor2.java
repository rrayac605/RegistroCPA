package mx.gob.imss.cit.de.dictaminacion.batch.validation.processors;

import java.util.Date;
import java.util.List;

import org.springframework.batch.item.ItemProcessor;

import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.A1TO;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.LinesTO;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class TxtFileProcessor2 implements ItemProcessor<A1TO, A1TO> {
	private LinesTO linesTO;
	
	@Override
	public A1TO process(A1TO paramI) throws Exception {
		System.out.println("Lineas procesadas: "+linesTO.getProcessedLines());
		System.out.println("Lineas invalidas: "+linesTO.getInvalidLines());
		System.out.println("Linea actual: "+paramI.getLineNumber());
		List<Integer> invalidLines = linesTO.getInvalidLines();
		if(invalidLines.contains(paramI.getLineNumber())){
			throw new Exception();
		}else {
			  paramI.setCveIdA1PercepTrab("1");
			  paramI.setFecRegistroActualizado(new Date());
			  paramI.setFecRegistroAlta(new Date());
		      paramI.setCveIdPatronDictamen("63");
		      paramI.setCveIdUsuario("MASC870401GQ8");
			return paramI;
		}		
	}

	public LinesTO getLinesTO() {
		return linesTO;
	}

	public void setLinesTO(LinesTO linesTO) {
		this.linesTO = linesTO;
	}

}

