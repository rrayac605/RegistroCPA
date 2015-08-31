package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIT_PERSONA_MORAL database table.
 * 
 */
@Entity
@Table(name="DIT_PERSONA_MORAL")
@NamedQuery(name="DitPersonaMoralDO.findAll", query="SELECT d FROM DitPersonaMoralDO d")
public class DitPersonaMoralDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_PERSONA_MORAL")
	private long cveIdPersonaMoral;

	@Column(name="DENOMINACION_RAZON_SOCIAL")
	private String denominacionRazonSocial;

	@Column(name="DES_CAMARA_ORGANIZACION")
	private String desCamaraOrganizacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="IND_ACREDITADO")
	private BigDecimal indAcreditado;

	@Column(name="IND_CONCURSO_MER")
	private BigDecimal indConcursoMer;

	@Column(name="NOMBRE_COMERCIAL")
	private String nombreComercial;

	private String rfc;

	//bi-directional many-to-one association to DitActaConstitutivaDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersonaMoral")
	private List<DitActaConstitutivaDO> ditActaConstitutivas;

	//bi-directional many-to-one association to DitDatosCertificadoFielDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersonaMoral")
	private List<DitDatosCertificadoFielDO> ditDatosCertificadoFiels;

	//bi-directional many-to-one association to DitDatosPersonaSatDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersonaMoral")
	private List<DitDatosPersonaSatDO> ditDatosPersonaSats;

	//bi-directional many-to-one association to DitHistEstadoPersonaMoralDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersonaMoral")
	private List<DitHistEstadoPersonaMoralDO> ditHistEstadoPersonaMorals;

	//bi-directional many-to-one association to DitIdentificadorMoralDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersonaMoral")
	private List<DitIdentificadorMoralDO> ditIdentificadorMorals;

	//bi-directional many-to-one association to DitPatronSujetoObligadoDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersonaMoral")
	private List<DitPatronSujetoObligadoDO> ditPatronSujetoObligados;

	//bi-directional many-to-one association to DitPersonamContactoDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersonaMoral")
	private List<DitPersonamContactoDO> ditPersonamContactos;

	//bi-directional many-to-one association to DitPersonamContactoFiscalDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersonaMoral")
	private List<DitPersonamContactoFiscalDO> ditPersonamContactoFiscals;

	//bi-directional many-to-one association to DitPersonamDomDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersonaMoral")
	private List<DitPersonamDomDO> ditPersonamDoms;

	//bi-directional many-to-one association to DitPersonamDomFiscalDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersonaMoral")
	private List<DitPersonamDomFiscalDO> ditPersonamDomFiscals;

	//bi-directional many-to-one association to DicTipoSociedadDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_TIPO_SOCIEDAD")
	private DicTipoSociedadDO dicTipoSociedad;

	//bi-directional many-to-one association to DitRepresentanteLegalDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersonaMoral")
	private List<DitRepresentanteLegalDO> ditRepresentanteLegals;

	//bi-directional many-to-one association to DitSindicatoDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersonaMoral")
	private List<DitSindicatoDO> ditSindicatos;

	//bi-directional many-to-one association to DitSituacionSatDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersonaMoral")
	private List<DitSituacionSatDO> ditSituacionSats;

	//bi-directional many-to-one association to DitSocioDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersonaMoral1")
	private List<DitSocioDO> ditSocios1;

	//bi-directional many-to-one association to DitSocioDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersonaMoral2")
	private List<DitSocioDO> ditSocios2;

	//bi-directional many-to-many association to DitTramiteDO
	@ManyToMany(mappedBy="ditPersonaMorals")
	private List<DitTramiteDO> ditTramites;

	//bi-directional many-to-one association to NdtAsociacionDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersonaMoral")
	private List<NdtAsociacionDO> ndtAsociacions;

	//bi-directional many-to-one association to NdtColegioContadorDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersonaMoral")
	private List<NdtColegioContadorDO> ndtColegioContadors;

	public DitPersonaMoralDO() {
	}

	public long getCveIdPersonaMoral() {
		return this.cveIdPersonaMoral;
	}

	public void setCveIdPersonaMoral(long cveIdPersonaMoral) {
		this.cveIdPersonaMoral = cveIdPersonaMoral;
	}

	public String getDenominacionRazonSocial() {
		return this.denominacionRazonSocial;
	}

	public void setDenominacionRazonSocial(String denominacionRazonSocial) {
		this.denominacionRazonSocial = denominacionRazonSocial;
	}

	public String getDesCamaraOrganizacion() {
		return this.desCamaraOrganizacion;
	}

	public void setDesCamaraOrganizacion(String desCamaraOrganizacion) {
		this.desCamaraOrganizacion = desCamaraOrganizacion;
	}

	public Date getFecRegistroActualizado() {
		return this.fecRegistroActualizado;
	}

	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	public Date getFecRegistroAlta() {
		return this.fecRegistroAlta;
	}

	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	public Date getFecRegistroBaja() {
		return this.fecRegistroBaja;
	}

	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	public BigDecimal getIndAcreditado() {
		return this.indAcreditado;
	}

	public void setIndAcreditado(BigDecimal indAcreditado) {
		this.indAcreditado = indAcreditado;
	}

	public BigDecimal getIndConcursoMer() {
		return this.indConcursoMer;
	}

	public void setIndConcursoMer(BigDecimal indConcursoMer) {
		this.indConcursoMer = indConcursoMer;
	}

	public String getNombreComercial() {
		return this.nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getRfc() {
		return this.rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public List<DitActaConstitutivaDO> getDitActaConstitutivas() {
		return this.ditActaConstitutivas;
	}

	public void setDitActaConstitutivas(List<DitActaConstitutivaDO> ditActaConstitutivas) {
		this.ditActaConstitutivas = ditActaConstitutivas;
	}
	public List<DitDatosCertificadoFielDO> getDitDatosCertificadoFiels() {
		return this.ditDatosCertificadoFiels;
	}

	public void setDitDatosCertificadoFiels(List<DitDatosCertificadoFielDO> ditDatosCertificadoFiels) {
		this.ditDatosCertificadoFiels = ditDatosCertificadoFiels;
	}

	public List<DitDatosPersonaSatDO> getDitDatosPersonaSats() {
		return this.ditDatosPersonaSats;
	}

	public void setDitDatosPersonaSats(List<DitDatosPersonaSatDO> ditDatosPersonaSats) {
		this.ditDatosPersonaSats = ditDatosPersonaSats;
	}

	public List<DitHistEstadoPersonaMoralDO> getDitHistEstadoPersonaMorals() {
		return this.ditHistEstadoPersonaMorals;
	}

	public void setDitHistEstadoPersonaMorals(List<DitHistEstadoPersonaMoralDO> ditHistEstadoPersonaMorals) {
		this.ditHistEstadoPersonaMorals = ditHistEstadoPersonaMorals;
	}

	public List<DitIdentificadorMoralDO> getDitIdentificadorMorals() {
		return this.ditIdentificadorMorals;
	}

	public void setDitIdentificadorMorals(List<DitIdentificadorMoralDO> ditIdentificadorMorals) {
		this.ditIdentificadorMorals = ditIdentificadorMorals;
	}

	public List<DitPatronSujetoObligadoDO> getDitPatronSujetoObligados() {
		return this.ditPatronSujetoObligados;
	}

	public void setDitPatronSujetoObligados(List<DitPatronSujetoObligadoDO> ditPatronSujetoObligados) {
		this.ditPatronSujetoObligados = ditPatronSujetoObligados;
	}

	public List<DitPersonamContactoDO> getDitPersonamContactos() {
		return this.ditPersonamContactos;
	}

	public void setDitPersonamContactos(List<DitPersonamContactoDO> ditPersonamContactos) {
		this.ditPersonamContactos = ditPersonamContactos;
	}

	public List<DitPersonamContactoFiscalDO> getDitPersonamContactoFiscals() {
		return this.ditPersonamContactoFiscals;
	}

	public void setDitPersonamContactoFiscals(List<DitPersonamContactoFiscalDO> ditPersonamContactoFiscals) {
		this.ditPersonamContactoFiscals = ditPersonamContactoFiscals;
	}

	public List<DitPersonamDomDO> getDitPersonamDoms() {
		return this.ditPersonamDoms;
	}

	public void setDitPersonamDoms(List<DitPersonamDomDO> ditPersonamDoms) {
		this.ditPersonamDoms = ditPersonamDoms;
	}public List<DitPersonamDomFiscalDO> getDitPersonamDomFiscals() {
		return this.ditPersonamDomFiscals;
	}

	public void setDitPersonamDomFiscals(List<DitPersonamDomFiscalDO> ditPersonamDomFiscals) {
		this.ditPersonamDomFiscals = ditPersonamDomFiscals;
	}
	
	public DicTipoSociedadDO getDicTipoSociedad() {
		return this.dicTipoSociedad;
	}

	public void setDicTipoSociedad(DicTipoSociedadDO dicTipoSociedad) {
		this.dicTipoSociedad = dicTipoSociedad;
	}

	public List<DitRepresentanteLegalDO> getDitRepresentanteLegals() {
		return this.ditRepresentanteLegals;
	}

	public void setDitRepresentanteLegals(List<DitRepresentanteLegalDO> ditRepresentanteLegals) {
		this.ditRepresentanteLegals = ditRepresentanteLegals;
	}public List<DitSindicatoDO> getDitSindicatos() {
		return this.ditSindicatos;
	}

	public void setDitSindicatos(List<DitSindicatoDO> ditSindicatos) {
		this.ditSindicatos = ditSindicatos;
	}

	public List<DitSituacionSatDO> getDitSituacionSats() {
		return this.ditSituacionSats;
	}

	public void setDitSituacionSats(List<DitSituacionSatDO> ditSituacionSats) {
		this.ditSituacionSats = ditSituacionSats;
	}

	public List<DitSocioDO> getDitSocios1() {
		return this.ditSocios1;
	}

	public void setDitSocios1(List<DitSocioDO> ditSocios1) {
		this.ditSocios1 = ditSocios1;
	}

	public List<DitSocioDO> getDitSocios2() {
		return this.ditSocios2;
	}

	public void setDitSocios2(List<DitSocioDO> ditSocios2) {
		this.ditSocios2 = ditSocios2;
	}

	public List<DitTramiteDO> getDitTramites() {
		return this.ditTramites;
	}

	public void setDitTramites(List<DitTramiteDO> ditTramites) {
		this.ditTramites = ditTramites;
	}

	public List<NdtAsociacionDO> getNdtAsociacions() {
		return this.ndtAsociacions;
	}

	public void setNdtAsociacions(List<NdtAsociacionDO> ndtAsociacions) {
		this.ndtAsociacions = ndtAsociacions;
	}

	public List<NdtColegioContadorDO> getNdtColegioContadors() {
		return this.ndtColegioContadors;
	}

	public void setNdtColegioContadors(List<NdtColegioContadorDO> ndtColegioContadors) {
		this.ndtColegioContadors = ndtColegioContadors;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveIdPersonaMoral ^ (cveIdPersonaMoral >>> 32));
		result = prime * result + ((denominacionRazonSocial == null) ? 0 : denominacionRazonSocial.hashCode());
		result = prime * result + ((desCamaraOrganizacion == null) ? 0 : desCamaraOrganizacion.hashCode());
		result = prime * result + ((dicTipoSociedad == null) ? 0 : dicTipoSociedad.hashCode());
		result = prime * result + ((ditActaConstitutivas == null) ? 0 : ditActaConstitutivas.hashCode());
		result = prime * result + ((ditDatosCertificadoFiels == null) ? 0 : ditDatosCertificadoFiels.hashCode());
		result = prime * result + ((ditDatosPersonaSats == null) ? 0 : ditDatosPersonaSats.hashCode());
		result = prime * result + ((ditHistEstadoPersonaMorals == null) ? 0 : ditHistEstadoPersonaMorals.hashCode());
		result = prime * result + ((ditIdentificadorMorals == null) ? 0 : ditIdentificadorMorals.hashCode());
		result = prime * result + ((ditPatronSujetoObligados == null) ? 0 : ditPatronSujetoObligados.hashCode());
		result = prime * result + ((ditPersonamContactoFiscals == null) ? 0 : ditPersonamContactoFiscals.hashCode());
		result = prime * result + ((ditPersonamContactos == null) ? 0 : ditPersonamContactos.hashCode());
		result = prime * result + ((ditPersonamDomFiscals == null) ? 0 : ditPersonamDomFiscals.hashCode());
		result = prime * result + ((ditPersonamDoms == null) ? 0 : ditPersonamDoms.hashCode());
		result = prime * result + ((ditRepresentanteLegals == null) ? 0 : ditRepresentanteLegals.hashCode());
		result = prime * result + ((ditSindicatos == null) ? 0 : ditSindicatos.hashCode());
		result = prime * result + ((ditSituacionSats == null) ? 0 : ditSituacionSats.hashCode());
		result = prime * result + ((ditSocios1 == null) ? 0 : ditSocios1.hashCode());
		result = prime * result + ((ditSocios2 == null) ? 0 : ditSocios2.hashCode());
		result = prime * result + ((ditTramites == null) ? 0 : ditTramites.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((indAcreditado == null) ? 0 : indAcreditado.hashCode());
		result = prime * result + ((indConcursoMer == null) ? 0 : indConcursoMer.hashCode());
		result = prime * result + ((ndtAsociacions == null) ? 0 : ndtAsociacions.hashCode());
		result = prime * result + ((ndtColegioContadors == null) ? 0 : ndtColegioContadors.hashCode());
		result = prime * result + ((nombreComercial == null) ? 0 : nombreComercial.hashCode());
		result = prime * result + ((rfc == null) ? 0 : rfc.hashCode());
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
		DitPersonaMoralDO other = (DitPersonaMoralDO) obj;
		if (cveIdPersonaMoral != other.cveIdPersonaMoral)
			return false;
		if (denominacionRazonSocial == null) {
			if (other.denominacionRazonSocial != null)
				return false;
		} else if (!denominacionRazonSocial.equals(other.denominacionRazonSocial))
			return false;
		if (desCamaraOrganizacion == null) {
			if (other.desCamaraOrganizacion != null)
				return false;
		} else if (!desCamaraOrganizacion.equals(other.desCamaraOrganizacion))
			return false;
		if (dicTipoSociedad == null) {
			if (other.dicTipoSociedad != null)
				return false;
		} else if (!dicTipoSociedad.equals(other.dicTipoSociedad))
			return false;
		if (ditActaConstitutivas == null) {
			if (other.ditActaConstitutivas != null)
				return false;
		} else if (!ditActaConstitutivas.equals(other.ditActaConstitutivas))
			return false;
		if (ditDatosCertificadoFiels == null) {
			if (other.ditDatosCertificadoFiels != null)
				return false;
		} else if (!ditDatosCertificadoFiels.equals(other.ditDatosCertificadoFiels))
			return false;
		if (ditDatosPersonaSats == null) {
			if (other.ditDatosPersonaSats != null)
				return false;
		} else if (!ditDatosPersonaSats.equals(other.ditDatosPersonaSats))
			return false;
		if (ditHistEstadoPersonaMorals == null) {
			if (other.ditHistEstadoPersonaMorals != null)
				return false;
		} else if (!ditHistEstadoPersonaMorals.equals(other.ditHistEstadoPersonaMorals))
			return false;
		if (ditIdentificadorMorals == null) {
			if (other.ditIdentificadorMorals != null)
				return false;
		} else if (!ditIdentificadorMorals.equals(other.ditIdentificadorMorals))
			return false;
		if (ditPatronSujetoObligados == null) {
			if (other.ditPatronSujetoObligados != null)
				return false;
		} else if (!ditPatronSujetoObligados.equals(other.ditPatronSujetoObligados))
			return false;
		if (ditPersonamContactoFiscals == null) {
			if (other.ditPersonamContactoFiscals != null)
				return false;
		} else if (!ditPersonamContactoFiscals.equals(other.ditPersonamContactoFiscals))
			return false;
		if (ditPersonamContactos == null) {
			if (other.ditPersonamContactos != null)
				return false;
		} else if (!ditPersonamContactos.equals(other.ditPersonamContactos))
			return false;
		if (ditPersonamDomFiscals == null) {
			if (other.ditPersonamDomFiscals != null)
				return false;
		} else if (!ditPersonamDomFiscals.equals(other.ditPersonamDomFiscals))
			return false;
		if (ditPersonamDoms == null) {
			if (other.ditPersonamDoms != null)
				return false;
		} else if (!ditPersonamDoms.equals(other.ditPersonamDoms))
			return false;
		if (ditRepresentanteLegals == null) {
			if (other.ditRepresentanteLegals != null)
				return false;
		} else if (!ditRepresentanteLegals.equals(other.ditRepresentanteLegals))
			return false;
		if (ditSindicatos == null) {
			if (other.ditSindicatos != null)
				return false;
		} else if (!ditSindicatos.equals(other.ditSindicatos))
			return false;
		if (ditSituacionSats == null) {
			if (other.ditSituacionSats != null)
				return false;
		} else if (!ditSituacionSats.equals(other.ditSituacionSats))
			return false;
		if (ditSocios1 == null) {
			if (other.ditSocios1 != null)
				return false;
		} else if (!ditSocios1.equals(other.ditSocios1))
			return false;
		if (ditSocios2 == null) {
			if (other.ditSocios2 != null)
				return false;
		} else if (!ditSocios2.equals(other.ditSocios2))
			return false;
		if (ditTramites == null) {
			if (other.ditTramites != null)
				return false;
		} else if (!ditTramites.equals(other.ditTramites))
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
		if (indAcreditado == null) {
			if (other.indAcreditado != null)
				return false;
		} else if (!indAcreditado.equals(other.indAcreditado))
			return false;
		if (indConcursoMer == null) {
			if (other.indConcursoMer != null)
				return false;
		} else if (!indConcursoMer.equals(other.indConcursoMer))
			return false;
		if (ndtAsociacions == null) {
			if (other.ndtAsociacions != null)
				return false;
		} else if (!ndtAsociacions.equals(other.ndtAsociacions))
			return false;
		if (ndtColegioContadors == null) {
			if (other.ndtColegioContadors != null)
				return false;
		} else if (!ndtColegioContadors.equals(other.ndtColegioContadors))
			return false;
		if (nombreComercial == null) {
			if (other.nombreComercial != null)
				return false;
		} else if (!nombreComercial.equals(other.nombreComercial))
			return false;
		if (rfc == null) {
			if (other.rfc != null)
				return false;
		} else if (!rfc.equals(other.rfc))
			return false;
		return true;
	}
	
	
}