package mx.gob.imss.cit.dictamen.commons.to;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class PersonaFisicaTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7843850564337951417L;

	private long cveIdPersonaFisica;

	private String desCamaraOrganizacion;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private BigDecimal indAcreditado;

	private String nombreComercial;

	private String rfc;

	private List<DatosCertificadoFielTO> ditDatosCertificadoFiels;

	private List<DatosPersonaSatTO> ditDatosPersonaSats;

	private List<PatronSujetoObligadoTO> ditPatronSujetoObligados;

	private List<PersonafDomFiscalTO> ditPersonafDomFiscals;

	private PersonaTO ditPersona;

	private List<RepresentanteLegalTO> ditRepresentanteLegals;

	private List<SituacionSatTO> ditSituacionSats;

	private List<SocioTO> ditSocios;

	/**
	 * @return the cveIdPersonaFisica
	 */
	public long getCveIdPersonaFisica() {
		return cveIdPersonaFisica;
	}

	/**
	 * @param cveIdPersonaFisica the cveIdPersonaFisica to set
	 */
	public void setCveIdPersonaFisica(long cveIdPersonaFisica) {
		this.cveIdPersonaFisica = cveIdPersonaFisica;
	}

	/**
	 * @return the desCamaraOrganizacion
	 */
	public String getDesCamaraOrganizacion() {
		return desCamaraOrganizacion;
	}

	/**
	 * @param desCamaraOrganizacion the desCamaraOrganizacion to set
	 */
	public void setDesCamaraOrganizacion(String desCamaraOrganizacion) {
		this.desCamaraOrganizacion = desCamaraOrganizacion;
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
	 * @return the indAcreditado
	 */
	public BigDecimal getIndAcreditado() {
		return indAcreditado;
	}

	/**
	 * @param indAcreditado the indAcreditado to set
	 */
	public void setIndAcreditado(BigDecimal indAcreditado) {
		this.indAcreditado = indAcreditado;
	}

	/**
	 * @return the nombreComercial
	 */
	public String getNombreComercial() {
		return nombreComercial;
	}

	/**
	 * @param nombreComercial the nombreComercial to set
	 */
	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	/**
	 * @return the rfc
	 */
	public String getRfc() {
		return rfc;
	}

	/**
	 * @param rfc the rfc to set
	 */
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	/**
	 * @return the ditDatosCertificadoFiels
	 */
	public List<DatosCertificadoFielTO> getDitDatosCertificadoFiels() {
		return ditDatosCertificadoFiels;
	}

	/**
	 * @param ditDatosCertificadoFiels the ditDatosCertificadoFiels to set
	 */
	public void setDitDatosCertificadoFiels(
			List<DatosCertificadoFielTO> ditDatosCertificadoFiels) {
		this.ditDatosCertificadoFiels = ditDatosCertificadoFiels;
	}

	/**
	 * @return the ditDatosPersonaSats
	 */
	public List<DatosPersonaSatTO> getDitDatosPersonaSats() {
		return ditDatosPersonaSats;
	}

	/**
	 * @param ditDatosPersonaSats the ditDatosPersonaSats to set
	 */
	public void setDitDatosPersonaSats(List<DatosPersonaSatTO> ditDatosPersonaSats) {
		this.ditDatosPersonaSats = ditDatosPersonaSats;
	}

	/**
	 * @return the ditPatronSujetoObligados
	 */
	public List<PatronSujetoObligadoTO> getDitPatronSujetoObligados() {
		return ditPatronSujetoObligados;
	}

	/**
	 * @param ditPatronSujetoObligados the ditPatronSujetoObligados to set
	 */
	public void setDitPatronSujetoObligados(
			List<PatronSujetoObligadoTO> ditPatronSujetoObligados) {
		this.ditPatronSujetoObligados = ditPatronSujetoObligados;
	}

	/**
	 * @return the ditPersonafDomFiscals
	 */
	public List<PersonafDomFiscalTO> getDitPersonafDomFiscals() {
		return ditPersonafDomFiscals;
	}

	/**
	 * @param ditPersonafDomFiscals the ditPersonafDomFiscals to set
	 */
	public void setDitPersonafDomFiscals(
			List<PersonafDomFiscalTO> ditPersonafDomFiscals) {
		this.ditPersonafDomFiscals = ditPersonafDomFiscals;
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
	 * @return the ditRepresentanteLegals
	 */
	public List<RepresentanteLegalTO> getDitRepresentanteLegals() {
		return ditRepresentanteLegals;
	}

	/**
	 * @param ditRepresentanteLegals the ditRepresentanteLegals to set
	 */
	public void setDitRepresentanteLegals(
			List<RepresentanteLegalTO> ditRepresentanteLegals) {
		this.ditRepresentanteLegals = ditRepresentanteLegals;
	}

	/**
	 * @return the ditSituacionSats
	 */
	public List<SituacionSatTO> getDitSituacionSats() {
		return ditSituacionSats;
	}

	/**
	 * @param ditSituacionSats the ditSituacionSats to set
	 */
	public void setDitSituacionSats(List<SituacionSatTO> ditSituacionSats) {
		this.ditSituacionSats = ditSituacionSats;
	}

	/**
	 * @return the ditSocios
	 */
	public List<SocioTO> getDitSocios() {
		return ditSocios;
	}

	/**
	 * @param ditSocios the ditSocios to set
	 */
	public void setDitSocios(List<SocioTO> ditSocios) {
		this.ditSocios = ditSocios;
	}



}
