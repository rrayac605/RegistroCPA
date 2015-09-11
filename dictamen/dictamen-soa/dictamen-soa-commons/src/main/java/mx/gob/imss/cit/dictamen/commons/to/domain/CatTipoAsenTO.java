package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class CatTipoAsenTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5792370606365383618L;

	private long cveTipoAsen;

	private String nombre;

	private List<AsentamientoTO> dgAsentamientos;

	/**
	 * @return the cveTipoAsen
	 */
	public long getCveTipoAsen() {
		return cveTipoAsen;
	}

	/**
	 * @param cveTipoAsen the cveTipoAsen to set
	 */
	public void setCveTipoAsen(long cveTipoAsen) {
		this.cveTipoAsen = cveTipoAsen;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the dgAsentamientos
	 */
	public List<AsentamientoTO> getDgAsentamientos() {
		return dgAsentamientos;
	}

	/**
	 * @param dgAsentamientos the dgAsentamientos to set
	 */
	public void setDgAsentamientos(List<AsentamientoTO> dgAsentamientos) {
		this.dgAsentamientos = dgAsentamientos;
	}



	
	
}
