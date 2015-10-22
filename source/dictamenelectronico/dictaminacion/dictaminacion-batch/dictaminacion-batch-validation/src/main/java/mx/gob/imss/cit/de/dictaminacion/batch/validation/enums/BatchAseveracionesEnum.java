package mx.gob.imss.cit.de.dictaminacion.batch.validation.enums;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public enum BatchAseveracionesEnum {
	A1(1),
	A2(2);
	
	private int idAseveracion;
	
	private BatchAseveracionesEnum(int idAseveracion){
		this.idAseveracion=idAseveracion;
	}

	public int getIdAseveracion() {
		return idAseveracion;
	}		
}

