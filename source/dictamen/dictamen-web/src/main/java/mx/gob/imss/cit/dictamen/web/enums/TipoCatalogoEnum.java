package mx.gob.imss.cit.dictamen.web.enums;

public enum TipoCatalogoEnum {
	CONTADORES(1L,"conta","Contadores Publicos Autorizados"),
	DESPACHOS(2L,"despa","Despachos"),
	COLEGIOS(3L,"coles","Colegios y Asociaciones")
	;
	
	private Long id;
	private String clv;
	private String desc;
	
	private TipoCatalogoEnum(Long id,String clv,String desc){
		this.id=id;
		this.clv=clv;
		this.desc=desc;
	}

	public Long getId() {
		return id;
	}

	public String getClv() {
		return clv;
	}

	public String getDesc() {
		return desc;
	}
	
	
	
}
