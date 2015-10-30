package mx.gob.imss.cit.de.dictaminacion.batch.validation.enums;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public enum BatchAseveracionesEnum {
	A1(1),
	A2(2),
	A3(3),
	A4(4),
	A5(5),
	A6(6),
	A7(7),
	A8(8),
	A9(9),
	A10(10),
	A11(11),
	A12(12),
	A13(13),
	A14(14),
	A15(15),
	A16(16),
	A17(17),
	A18(18),
	A19(19);
	
	private int idAseveracion;
	
	private BatchAseveracionesEnum(int idAseveracion){
		this.idAseveracion=idAseveracion;
	}

	public int getIdAseveracion() {
		return idAseveracion;
	}		
}

