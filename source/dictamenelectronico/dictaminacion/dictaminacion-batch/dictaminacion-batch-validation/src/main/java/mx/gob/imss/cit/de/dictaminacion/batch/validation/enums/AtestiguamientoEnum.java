package mx.gob.imss.cit.de.dictaminacion.batch.validation.enums;

public enum AtestiguamientoEnum {

	B10(20L),
	;
	
	private Long idAtestiguamiento;
	
	private AtestiguamientoEnum(Long idAtestiguamiento){
		this.idAtestiguamiento=idAtestiguamiento;
	}

	public Long getIdAtestiguamiento() {
		return idAtestiguamiento;
	}	
}
