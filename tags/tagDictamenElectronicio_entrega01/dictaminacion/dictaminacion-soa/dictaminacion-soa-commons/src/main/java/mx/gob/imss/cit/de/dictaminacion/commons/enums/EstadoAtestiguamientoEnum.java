package mx.gob.imss.cit.de.dictaminacion.commons.enums;

public enum EstadoAtestiguamientoEnum {
	INICIADO(1L),
	VALIDADO(2L),
	;
	
	private Long id;
	
	
	private EstadoAtestiguamientoEnum(Long id){
		this.id = id;
	}
	
	public Long getId(){
	    return id;
	}
}
