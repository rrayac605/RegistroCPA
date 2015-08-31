package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIT_PERSONA_FISICA database table.
 * 
 */
@Entity
@Table(name="DIT_PERSONA_FISICA")
@NamedQuery(name="DitPersonaFisicaDO.findAll", query="SELECT d FROM DitPersonaFisicaDO d")
public class DitPersonaFisicaDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_PERSONA_FISICA")
	private long cveIdPersonaFisica;

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

	@Column(name="NOMBRE_COMERCIAL")
	private String nombreComercial;

	private String rfc;

	//bi-directional many-to-one association to DitDatosCertificadoFielDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersonaFisica")
	private List<DitDatosCertificadoFielDO> ditDatosCertificadoFiels;

	//bi-directional many-to-one association to DitDatosPersonaSatDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersonaFisica")
	private List<DitDatosPersonaSatDO> ditDatosPersonaSats;

	//bi-directional many-to-one association to DitPatronSujetoObligadoDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersonaFisica")
	private List<DitPatronSujetoObligadoDO> ditPatronSujetoObligados;

	//bi-directional many-to-one association to DitPersonafDomFiscalDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersonaFisica")
	private List<DitPersonafDomFiscalDO> ditPersonafDomFiscals;

	//bi-directional many-to-one association to DitPersonaDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA")
	private DitPersonaDO ditPersona;

	//bi-directional many-to-one association to DitRepresentanteLegalDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersonaFisica")
	private List<DitRepresentanteLegalDO> ditRepresentanteLegals;

	//bi-directional many-to-one association to DitSituacionSatDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersonaFisica")
	private List<DitSituacionSatDO> ditSituacionSats;

	//bi-directional many-to-one association to DitSocioDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersonaFisica")
	private List<DitSocioDO> ditSocios;

	public DitPersonaFisicaDO() {
	}

	public long getCveIdPersonaFisica() {
		return this.cveIdPersonaFisica;
	}

	public void setCveIdPersonaFisica(long cveIdPersonaFisica) {
		this.cveIdPersonaFisica = cveIdPersonaFisica;
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

	public List<DitPatronSujetoObligadoDO> getDitPatronSujetoObligados() {
		return this.ditPatronSujetoObligados;
	}

	public void setDitPatronSujetoObligados(List<DitPatronSujetoObligadoDO> ditPatronSujetoObligados) {
		this.ditPatronSujetoObligados = ditPatronSujetoObligados;
	}

	public List<DitPersonafDomFiscalDO> getDitPersonafDomFiscals() {
		return this.ditPersonafDomFiscals;
	}

	public void setDitPersonafDomFiscals(List<DitPersonafDomFiscalDO> ditPersonafDomFiscals) {
		this.ditPersonafDomFiscals = ditPersonafDomFiscals;
	}

	public DitPersonaDO getDitPersona() {
		return this.ditPersona;
	}

	public void setDitPersona(DitPersonaDO ditPersona) {
		this.ditPersona = ditPersona;
	}

	public List<DitRepresentanteLegalDO> getDitRepresentanteLegals() {
		return this.ditRepresentanteLegals;
	}

	public void setDitRepresentanteLegals(List<DitRepresentanteLegalDO> ditRepresentanteLegals) {
		this.ditRepresentanteLegals = ditRepresentanteLegals;
	}

	public List<DitSituacionSatDO> getDitSituacionSats() {
		return this.ditSituacionSats;
	}

	public void setDitSituacionSats(List<DitSituacionSatDO> ditSituacionSats) {
		this.ditSituacionSats = ditSituacionSats;
	}

	public List<DitSocioDO> getDitSocios() {
		return this.ditSocios;
	}

	public void setDitSocios(List<DitSocioDO> ditSocios) {
		this.ditSocios = ditSocios;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveIdPersonaFisica ^ (cveIdPersonaFisica >>> 32));
		result = prime * result + ((desCamaraOrganizacion == null) ? 0 : desCamaraOrganizacion.hashCode());
		result = prime * result + ((ditDatosCertificadoFiels == null) ? 0 : ditDatosCertificadoFiels.hashCode());
		result = prime * result + ((ditDatosPersonaSats == null) ? 0 : ditDatosPersonaSats.hashCode());
		result = prime * result + ((ditPatronSujetoObligados == null) ? 0 : ditPatronSujetoObligados.hashCode());
		result = prime * result + ((ditPersona == null) ? 0 : ditPersona.hashCode());
		result = prime * result + ((ditPersonafDomFiscals == null) ? 0 : ditPersonafDomFiscals.hashCode());
		result = prime * result + ((ditRepresentanteLegals == null) ? 0 : ditRepresentanteLegals.hashCode());
		result = prime * result + ((ditSituacionSats == null) ? 0 : ditSituacionSats.hashCode());
		result = prime * result + ((ditSocios == null) ? 0 : ditSocios.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((indAcreditado == null) ? 0 : indAcreditado.hashCode());
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
		DitPersonaFisicaDO other = (DitPersonaFisicaDO) obj;
		if (cveIdPersonaFisica != other.cveIdPersonaFisica)
			return false;
		if (desCamaraOrganizacion == null) {
			if (other.desCamaraOrganizacion != null)
				return false;
		} else if (!desCamaraOrganizacion.equals(other.desCamaraOrganizacion))
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
		if (ditPatronSujetoObligados == null) {
			if (other.ditPatronSujetoObligados != null)
				return false;
		} else if (!ditPatronSujetoObligados.equals(other.ditPatronSujetoObligados))
			return false;
		if (ditPersona == null) {
			if (other.ditPersona != null)
				return false;
		} else if (!ditPersona.equals(other.ditPersona))
			return false;
		if (ditPersonafDomFiscals == null) {
			if (other.ditPersonafDomFiscals != null)
				return false;
		} else if (!ditPersonafDomFiscals.equals(other.ditPersonafDomFiscals))
			return false;
		if (ditRepresentanteLegals == null) {
			if (other.ditRepresentanteLegals != null)
				return false;
		} else if (!ditRepresentanteLegals.equals(other.ditRepresentanteLegals))
			return false;
		if (ditSituacionSats == null) {
			if (other.ditSituacionSats != null)
				return false;
		} else if (!ditSituacionSats.equals(other.ditSituacionSats))
			return false;
		if (ditSocios == null) {
			if (other.ditSocios != null)
				return false;
		} else if (!ditSocios.equals(other.ditSocios))
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