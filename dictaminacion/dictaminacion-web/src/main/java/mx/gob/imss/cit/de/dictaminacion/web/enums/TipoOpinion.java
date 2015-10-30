package mx.gob.imss.cit.de.dictaminacion.web.enums;

public enum TipoOpinion {

	SIN_SALVEDAD("Sin Salvedad"),
	CON_SALVEDAD("Con Salvedad"),
	NEGATIVA("Negativa"),
	ABSTENCION("Abstención");

	private String descripcion;

	private TipoOpinion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getValor() {
		return this.name();
	}

}
