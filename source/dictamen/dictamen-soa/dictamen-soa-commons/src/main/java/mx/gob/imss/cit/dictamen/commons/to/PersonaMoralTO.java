package mx.gob.imss.cit.dictamen.commons.to;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class PersonaMoralTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3514845657059401096L;

	private long cveIdPersonaMoral;

	private String denominacionRazonSocial;

	private String desCamaraOrganizacion;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private BigDecimal indAcreditado;

	private BigDecimal indConcursoMer;

	private String nombreComercial;

	private String rfc;

	private List<ActaConstitutivaTO> ditActaConstitutivas;

	private List<DatosCertificadoFielTO> ditDatosCertificadoFiels;

	private List<DatosPersonaSatTO> ditDatosPersonaSats;

	private List<HistEstadoPersonaMoralTO> ditHistEstadoPersonaMorals;

	private List<IdentificadorMoralTO> ditIdentificadorMorals;

	private List<PatronSujetoObligadoTO> ditPatronSujetoObligados;

	private List<PersonamContactoTO> ditPersonamContactos;

	private List<PersonamContactoFiscalTO> ditPersonamContactoFiscals;

	private List<PersonamDomTO> ditPersonamDoms;

	private List<PersonamDomFiscalTO> ditPersonamDomFiscals;

	private TipoSociedadTO dicTipoSociedad;

	private List<RepresentanteLegalTO> ditRepresentanteLegals;

	private List<SindicatoTO> ditSindicatos;

	private List<SituacionSatTO> ditSituacionSats;

	private List<SocioTO> ditSocios1;

	private List<SocioTO> ditSocios2;

	private List<TramiteTO> ditTramites;

	private List<AsociacionTO> ndtAsociacions;

	private List<ColegioContadorTO> ndtColegioContadors;

	/**
	 * @return the cveIdPersonaMoral
	 */
	public long getCveIdPersonaMoral() {
		return cveIdPersonaMoral;
	}

	/**
	 * @param cveIdPersonaMoral the cveIdPersonaMoral to set
	 */
	public void setCveIdPersonaMoral(long cveIdPersonaMoral) {
		this.cveIdPersonaMoral = cveIdPersonaMoral;
	}

	/**
	 * @return the denominacionRazonSocial
	 */
	public String getDenominacionRazonSocial() {
		return denominacionRazonSocial;
	}

	/**
	 * @param denominacionRazonSocial the denominacionRazonSocial to set
	 */
	public void setDenominacionRazonSocial(String denominacionRazonSocial) {
		this.denominacionRazonSocial = denominacionRazonSocial;
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
	 * @return the indConcursoMer
	 */
	public BigDecimal getIndConcursoMer() {
		return indConcursoMer;
	}

	/**
	 * @param indConcursoMer the indConcursoMer to set
	 */
	public void setIndConcursoMer(BigDecimal indConcursoMer) {
		this.indConcursoMer = indConcursoMer;
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
	 * @return the ditActaConstitutivas
	 */
	public List<ActaConstitutivaTO> getDitActaConstitutivas() {
		return ditActaConstitutivas;
	}

	/**
	 * @param ditActaConstitutivas the ditActaConstitutivas to set
	 */
	public void setDitActaConstitutivas(
			List<ActaConstitutivaTO> ditActaConstitutivas) {
		this.ditActaConstitutivas = ditActaConstitutivas;
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
	 * @return the ditHistEstadoPersonaMorals
	 */
	public List<HistEstadoPersonaMoralTO> getDitHistEstadoPersonaMorals() {
		return ditHistEstadoPersonaMorals;
	}

	/**
	 * @param ditHistEstadoPersonaMorals the ditHistEstadoPersonaMorals to set
	 */
	public void setDitHistEstadoPersonaMorals(
			List<HistEstadoPersonaMoralTO> ditHistEstadoPersonaMorals) {
		this.ditHistEstadoPersonaMorals = ditHistEstadoPersonaMorals;
	}

	/**
	 * @return the ditIdentificadorMorals
	 */
	public List<IdentificadorMoralTO> getDitIdentificadorMorals() {
		return ditIdentificadorMorals;
	}

	/**
	 * @param ditIdentificadorMorals the ditIdentificadorMorals to set
	 */
	public void setDitIdentificadorMorals(
			List<IdentificadorMoralTO> ditIdentificadorMorals) {
		this.ditIdentificadorMorals = ditIdentificadorMorals;
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
	 * @return the ditPersonamContactos
	 */
	public List<PersonamContactoTO> getDitPersonamContactos() {
		return ditPersonamContactos;
	}

	/**
	 * @param ditPersonamContactos the ditPersonamContactos to set
	 */
	public void setDitPersonamContactos(
			List<PersonamContactoTO> ditPersonamContactos) {
		this.ditPersonamContactos = ditPersonamContactos;
	}

	/**
	 * @return the ditPersonamContactoFiscals
	 */
	public List<PersonamContactoFiscalTO> getDitPersonamContactoFiscals() {
		return ditPersonamContactoFiscals;
	}

	/**
	 * @param ditPersonamContactoFiscals the ditPersonamContactoFiscals to set
	 */
	public void setDitPersonamContactoFiscals(
			List<PersonamContactoFiscalTO> ditPersonamContactoFiscals) {
		this.ditPersonamContactoFiscals = ditPersonamContactoFiscals;
	}

	/**
	 * @return the ditPersonamDoms
	 */
	public List<PersonamDomTO> getDitPersonamDoms() {
		return ditPersonamDoms;
	}

	/**
	 * @param ditPersonamDoms the ditPersonamDoms to set
	 */
	public void setDitPersonamDoms(List<PersonamDomTO> ditPersonamDoms) {
		this.ditPersonamDoms = ditPersonamDoms;
	}

	/**
	 * @return the ditPersonamDomFiscals
	 */
	public List<PersonamDomFiscalTO> getDitPersonamDomFiscals() {
		return ditPersonamDomFiscals;
	}

	/**
	 * @param ditPersonamDomFiscals the ditPersonamDomFiscals to set
	 */
	public void setDitPersonamDomFiscals(
			List<PersonamDomFiscalTO> ditPersonamDomFiscals) {
		this.ditPersonamDomFiscals = ditPersonamDomFiscals;
	}

	/**
	 * @return the dicTipoSociedad
	 */
	public TipoSociedadTO getDicTipoSociedad() {
		return dicTipoSociedad;
	}

	/**
	 * @param dicTipoSociedad the dicTipoSociedad to set
	 */
	public void setDicTipoSociedad(TipoSociedadTO dicTipoSociedad) {
		this.dicTipoSociedad = dicTipoSociedad;
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
	 * @return the ditSindicatos
	 */
	public List<SindicatoTO> getDitSindicatos() {
		return ditSindicatos;
	}

	/**
	 * @param ditSindicatos the ditSindicatos to set
	 */
	public void setDitSindicatos(List<SindicatoTO> ditSindicatos) {
		this.ditSindicatos = ditSindicatos;
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
	 * @return the ditSocios1
	 */
	public List<SocioTO> getDitSocios1() {
		return ditSocios1;
	}

	/**
	 * @param ditSocios1 the ditSocios1 to set
	 */
	public void setDitSocios1(List<SocioTO> ditSocios1) {
		this.ditSocios1 = ditSocios1;
	}

	/**
	 * @return the ditSocios2
	 */
	public List<SocioTO> getDitSocios2() {
		return ditSocios2;
	}

	/**
	 * @param ditSocios2 the ditSocios2 to set
	 */
	public void setDitSocios2(List<SocioTO> ditSocios2) {
		this.ditSocios2 = ditSocios2;
	}

	/**
	 * @return the ditTramites
	 */
	public List<TramiteTO> getDitTramites() {
		return ditTramites;
	}

	/**
	 * @param ditTramites the ditTramites to set
	 */
	public void setDitTramites(List<TramiteTO> ditTramites) {
		this.ditTramites = ditTramites;
	}

	/**
	 * @return the ndtAsociacions
	 */
	public List<AsociacionTO> getNdtAsociacions() {
		return ndtAsociacions;
	}

	/**
	 * @param ndtAsociacions the ndtAsociacions to set
	 */
	public void setNdtAsociacions(List<AsociacionTO> ndtAsociacions) {
		this.ndtAsociacions = ndtAsociacions;
	}

	/**
	 * @return the ndtColegioContadors
	 */
	public List<ColegioContadorTO> getNdtColegioContadors() {
		return ndtColegioContadors;
	}

	/**
	 * @param ndtColegioContadors the ndtColegioContadors to set
	 */
	public void setNdtColegioContadors(List<ColegioContadorTO> ndtColegioContadors) {
		this.ndtColegioContadors = ndtColegioContadors;
	}

}
