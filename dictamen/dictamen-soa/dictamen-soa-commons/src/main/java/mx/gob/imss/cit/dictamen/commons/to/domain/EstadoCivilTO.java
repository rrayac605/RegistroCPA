package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class EstadoCivilTO extends BaseTO  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2924075364488566894L;

	private long cveIdEstadoCivil;

	private String desEstadoCivil;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private List<PersonaTO> ditPersonas;

	/**
	 * @return the cveIdEstadoCivil
	 */
	public long getCveIdEstadoCivil() {
		return cveIdEstadoCivil;
	}

	/**
	 * @param cveIdEstadoCivil the cveIdEstadoCivil to set
	 */
	public void setCveIdEstadoCivil(long cveIdEstadoCivil) {
		this.cveIdEstadoCivil = cveIdEstadoCivil;
	}

	/**
	 * @return the desEstadoCivil
	 */
	public String getDesEstadoCivil() {
		return desEstadoCivil;
	}

	/**
	 * @param desEstadoCivil the desEstadoCivil to set
	 */
	public void setDesEstadoCivil(String desEstadoCivil) {
		this.desEstadoCivil = desEstadoCivil;
	}



	/**
	 * @return the fecRegistroActualizado
	 */
	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado != null ? (Date) fecRegistroActualizado.clone() : null;
	}

	/**
	 * @param fecRegistroActualizado the fecRegistroActualizado to set
	 */
	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	/**
	 * @return the fecRegistroAlta
	 */
	public Date getFecRegistroAlta() {
		return fecRegistroAlta != null ? (Date) fecRegistroAlta.clone() : null;
	}

	/**
	 * @param fecRegistroAlta the fecRegistroAlta to set
	 */
	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	/**
	 * @return the fecRegistroBaja
	 */
	public Date getFecRegistroBaja() {
		return fecRegistroBaja != null ? (Date) fecRegistroBaja.clone() : null;
	}

	/**
	 * @param fecRegistroBaja the fecRegistroBaja to set
	 */
	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}


	/**
	 * @return the ditPersonas
	 */
	public List<PersonaTO> getDitPersonas() {
		return ditPersonas;
	}

	/**
	 * @param ditPersonas the ditPersonas to set
	 */
	public void setDitPersonas(List<PersonaTO> ditPersonas) {
		this.ditPersonas = ditPersonas;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
