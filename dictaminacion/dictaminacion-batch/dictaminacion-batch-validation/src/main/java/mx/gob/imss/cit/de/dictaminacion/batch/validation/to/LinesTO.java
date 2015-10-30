package mx.gob.imss.cit.de.dictaminacion.batch.validation.to;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class LinesTO {
	private List<Integer> invalidLines = new ArrayList<Integer>();
	private int processedLines;
			
	public List<Integer> getInvalidLines() {
		return invalidLines;
	}
	public void setInvalidLines(List<Integer> invalidLines) {
		this.invalidLines = invalidLines;
	}
	public int getProcessedLines() {
		return processedLines;
	}
	public void setProcessedLines(int processedLines) {
		this.processedLines = processedLines;
	}
	
}

