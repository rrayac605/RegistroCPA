/**
 * 
 */
package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;


/**
 * @author ajfuente
 *
 */
public class ContadorPublicoTO extends BaseTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long cveIdCpa;

	private String cveIdUsuario;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private BigDecimal numRegistroCpa;

	private String numTramiteNotaria;

	private String urlAcuseNotaria;


	private List<AcreditacionTO> ndtAcreditacions;

	private PersonaTO ditPersona;

	private EstadoCpaTO ndcEstadoCpa;

	private List<TipoSancionTO> ndcTipoSancions;

	private List<PatronDictamenCpaTO> ndtPatronDictamenCpas;

	private List<R1DatosPersonaleTO> ndtR1DatosPersonales;

	private List<R2DespachoTO> ndtR2Despachos;

	private List<R3ColegioXcontadorTO> ndtR3ColegioXcontadors;

	private List<RegBajaReactivTO> ndtRegBajaReactivs;

	/**
	 * @return the cveIdCpa
	 */
	public long getCveIdCpa() {
		return cveIdCpa;
	}

	/**
	 * @param cveIdCpa the cveIdCpa to set
	 */
	public void setCveIdCpa(long cveIdCpa) {
		this.cveIdCpa = cveIdCpa;
	}

	/**
	 * @return the cveIdUsuario
	 */
	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	/**
	 * @param cveIdUsuario the cveIdUsuario to set
	 */
	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
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
	 * @return the numRegistroCpa
	 */
	public BigDecimal getNumRegistroCpa() {
		return numRegistroCpa;
	}

	/**
	 * @param numRegistroCpa the numRegistroCpa to set
	 */
	public void setNumRegistroCpa(BigDecimal numRegistroCpa) {
		this.numRegistroCpa = numRegistroCpa;
	}

	/**
	 * @return the numTramiteNotaria
	 */
	public String getNumTramiteNotaria() {
		return numTramiteNotaria;
	}

	/**
	 * @param numTramiteNotaria the numTramiteNotaria to set
	 */
	public void setNumTramiteNotaria(String numTramiteNotaria) {
		this.numTramiteNotaria = numTramiteNotaria;
	}

	/**
	 * @return the urlAcuseNotaria
	 */
	public String getUrlAcuseNotaria() {
		return urlAcuseNotaria;
	}

	/**
	 * @param urlAcuseNotaria the urlAcuseNotaria to set
	 */
	public void setUrlAcuseNotaria(String urlAcuseNotaria) {
		this.urlAcuseNotaria = urlAcuseNotaria;
	}

	/**
	 * @return the ndtAcreditacions
	 */
	public List<AcreditacionTO> getNdtAcreditacions() {
		return ndtAcreditacions;
	}

	/**
	 * @param ndtAcreditacions the ndtAcreditacions to set
	 */
	public void setNdtAcreditacions(List<AcreditacionTO> ndtAcreditacions) {
		this.ndtAcreditacions = ndtAcreditacions;
	}

	/**
	 * @return the ditPersona
	 */
	public PersonaTO getDitPersona() {
		return ditPersona;
	}

	/**
	 * @param ditPersona the ditPersona to set
	 */
	public void setDitPersona(PersonaTO ditPersona) {
		this.ditPersona = ditPersona;
	}

	/**
	 * @return the ndcEstadoCpa
	 */
	public EstadoCpaTO getNdcEstadoCpa() {
		return ndcEstadoCpa;
	}

	/**
	 * @param ndcEstadoCpa the ndcEstadoCpa to set
	 */
	public void setNdcEstadoCpa(EstadoCpaTO ndcEstadoCpa) {
		this.ndcEstadoCpa = ndcEstadoCpa;
	}

	/**
	 * @return the ndcTipoSancions
	 */
	public List<TipoSancionTO> getNdcTipoSancions() {
		return ndcTipoSancions;
	}

	/**
	 * @param ndcTipoSancions the ndcTipoSancions to set
	 */
	public void setNdcTipoSancions(List<TipoSancionTO> ndcTipoSancions) {
		this.ndcTipoSancions = ndcTipoSancions;
	}

	/**
	 * @return the ndtPatronDictamenCpas
	 */
	public List<PatronDictamenCpaTO> getNdtPatronDictamenCpas() {
		return ndtPatronDictamenCpas;
	}

	/**
	 * @param ndtPatronDictamenCpas the ndtPatronDictamenCpas to set
	 */
	public void setNdtPatronDictamenCpas(
			List<PatronDictamenCpaTO> ndtPatronDictamenCpas) {
		this.ndtPatronDictamenCpas = ndtPatronDictamenCpas;
	}

	/**
	 * @return the ndtR1DatosPersonales
	 */
	public List<R1DatosPersonaleTO> getNdtR1DatosPersonales() {
		return ndtR1DatosPersonales;
	}

	/**
	 * @param ndtR1DatosPersonales the ndtR1DatosPersonales to set
	 */
	public void setNdtR1DatosPersonales(
			List<R1DatosPersonaleTO> ndtR1DatosPersonales) {
		this.ndtR1DatosPersonales = ndtR1DatosPersonales;
	}

	/**
	 * @return the ndtR2Despachos
	 */
	public List<R2DespachoTO> getNdtR2Despachos() {
		return ndtR2Despachos;
	}

	/**
	 * @param ndtR2Despachos the ndtR2Despachos to set
	 */
	public void setNdtR2Despachos(List<R2DespachoTO> ndtR2Despachos) {
		this.ndtR2Despachos = ndtR2Despachos;
	}

	/**
	 * @return the ndtR3ColegioXcontadors
	 */
	public List<R3ColegioXcontadorTO> getNdtR3ColegioXcontadors() {
		return ndtR3ColegioXcontadors;
	}

	/**
	 * @param ndtR3ColegioXcontadors the ndtR3ColegioXcontadors to set
	 */
	public void setNdtR3ColegioXcontadors(
			List<R3ColegioXcontadorTO> ndtR3ColegioXcontadors) {
		this.ndtR3ColegioXcontadors = ndtR3ColegioXcontadors;
	}

	/**
	 * @return the ndtRegBajaReactivs
	 */
	public List<RegBajaReactivTO> getNdtRegBajaReactivs() {
		return ndtRegBajaReactivs;
	}

	/**
	 * @param ndtRegBajaReactivs the ndtRegBajaReactivs to set
	 */
	public void setNdtRegBajaReactivs(List<RegBajaReactivTO> ndtRegBajaReactivs) {
		this.ndtRegBajaReactivs = ndtRegBajaReactivs;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveIdCpa ^ (cveIdCpa >>> 32));
		result = prime * result + ((cveIdUsuario == null) ? 0 : cveIdUsuario.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((numRegistroCpa == null) ? 0 : numRegistroCpa.hashCode());
		result = prime * result + ((numTramiteNotaria == null) ? 0 : numTramiteNotaria.hashCode());
		result = prime * result + ((urlAcuseNotaria == null) ? 0 : urlAcuseNotaria.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContadorPublicoTO other = (ContadorPublicoTO) obj;
		if (cveIdCpa != other.cveIdCpa)
			return false;
		if (cveIdUsuario == null) {
			if (other.cveIdUsuario != null)
				return false;
		} else if (!cveIdUsuario.equals(other.cveIdUsuario))
			return false;
		if (fecRegistroActualizado == null) {
			if (other.fecRegistroActualizado != null)
				return false;
		} else if (!fecRegistroActualizado.equals(other.fecRegistroActualizado))
			return false;
		if (fecRegistroAlta == null) {
			if (other.fecRegistroAlta != null)
				return false;
		} else if (!fecRegistroAlta.equals(other.fecRegistroAlta))
			return false;
		if (fecRegistroBaja == null) {
			if (other.fecRegistroBaja != null)
				return false;
		} else if (!fecRegistroBaja.equals(other.fecRegistroBaja))
			return false;
		if (numRegistroCpa == null) {
			if (other.numRegistroCpa != null)
				return false;
		} else if (!numRegistroCpa.equals(other.numRegistroCpa))
			return false;
		if (numTramiteNotaria == null) {
			if (other.numTramiteNotaria != null)
				return false;
		} else if (!numTramiteNotaria.equals(other.numTramiteNotaria))
			return false;
		if (urlAcuseNotaria == null) {
			if (other.urlAcuseNotaria != null)
				return false;
		} else if (!urlAcuseNotaria.equals(other.urlAcuseNotaria))
			return false;
		return true;
	}
	
}
