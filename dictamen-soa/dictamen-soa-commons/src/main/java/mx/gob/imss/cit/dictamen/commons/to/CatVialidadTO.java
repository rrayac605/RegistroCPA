package mx.gob.imss.cit.dictamen.commons.to;

import java.util.List;

public class CatVialidadTO extends BaseTO {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8576700563953940865L;

	private long cveTipoVial;

	private String descripcion;
	
	private List<VialidadTO> dgVialidads;

	/**
	 * @return the cveTipoVial
	 */
	public long getCveTipoVial() {
		return cveTipoVial;
	}

	/**
	 * @param cveTipoVial the cveTipoVial to set
	 */
	public void setCveTipoVial(long cveTipoVial) {
		this.cveTipoVial = cveTipoVial;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the dgVialidads
	 */
	public List<VialidadTO> getDgVialidads() {
		return dgVialidads;
	}

	/**
	 * @param dgVialidads the dgVialidads to set
	 */
	public void setDgVialidads(List<VialidadTO> dgVialidads) {
		this.dgVialidads = dgVialidads;
	}


}
