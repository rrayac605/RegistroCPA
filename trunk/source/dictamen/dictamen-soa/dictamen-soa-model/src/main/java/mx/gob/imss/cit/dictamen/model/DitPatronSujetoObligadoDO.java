package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIT_PATRON_SUJETO_OBLIGADO database table.
 * 
 */
@Entity
@Table(name="DIT_PATRON_SUJETO_OBLIGADO")
@NamedQuery(name="DitPatronSujetoObligadoDO.findAll", query="SELECT d FROM DitPatronSujetoObligadoDO d")
public class DitPatronSujetoObligadoDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_PATRON_SUJETO_OBLIGADO")
	private long cveIdPatronSujetoObligado;

	@Column(name="CVE_ID_MODALIDAD")
	private BigDecimal cveIdModalidad;

	@Column(name="CVE_ID_TIPO_CONTRIB_MODALIDAD")
	private BigDecimal cveIdTipoContribModalidad;

	@Column(name="CVE_ID_TIPO_INTERESADO")
	private BigDecimal cveIdTipoInteresado;

	@Column(name="CVE_ID_TIPO_PAGO_MODALIDAD")
	private BigDecimal cveIdTipoPagoModalidad;

	@Column(name="DES_AFECTACION")
	private String desAfectacion;

	@Column(name="DES_NOMBRE_COMERCIAL")
	private String desNombreComercial;

	@Column(name="DES_USOS_BIENES")
	private String desUsosBienes;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="IND_MIGR_DOM")
	private BigDecimal indMigrDom;

	@Column(name="IND_PATRON_CONFIRMADO")
	private BigDecimal indPatronConfirmado;

	//bi-directional many-to-one association to DitPatronGeneralDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPatronSujetoObligado")
	private List<DitPatronGeneralDO> ditPatronGenerals;

	//bi-directional many-to-one association to DitPersonaFisicaDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA_FISICA")
	private DitPersonaFisicaDO ditPersonaFisica;

	//bi-directional many-to-one association to DitPersonaMoralDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA_MORAL")
	private DitPersonaMoralDO ditPersonaMoral;

	//bi-directional many-to-one association to DitRepresentanteLegalDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPatronSujetoObligado")
	private List<DitRepresentanteLegalDO> ditRepresentanteLegals;

	//bi-directional many-to-one association to NdtPatronDictamenDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPatronSujetoObligado")
	private List<NdtPatronDictamenDO> ndtPatronDictamens;

	//bi-directional many-to-one association to NdtR2DespachoDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPatronSujetoObligado")
	private List<NdtR2DespachoDO> ndtR2Despachos;

	public DitPatronSujetoObligadoDO() {
	}

	public long getCveIdPatronSujetoObligado() {
		return this.cveIdPatronSujetoObligado;
	}

	public void setCveIdPatronSujetoObligado(long cveIdPatronSujetoObligado) {
		this.cveIdPatronSujetoObligado = cveIdPatronSujetoObligado;
	}

	public BigDecimal getCveIdModalidad() {
		return this.cveIdModalidad;
	}

	public void setCveIdModalidad(BigDecimal cveIdModalidad) {
		this.cveIdModalidad = cveIdModalidad;
	}

	public BigDecimal getCveIdTipoContribModalidad() {
		return this.cveIdTipoContribModalidad;
	}

	public void setCveIdTipoContribModalidad(BigDecimal cveIdTipoContribModalidad) {
		this.cveIdTipoContribModalidad = cveIdTipoContribModalidad;
	}

	public BigDecimal getCveIdTipoInteresado() {
		return this.cveIdTipoInteresado;
	}

	public void setCveIdTipoInteresado(BigDecimal cveIdTipoInteresado) {
		this.cveIdTipoInteresado = cveIdTipoInteresado;
	}

	public BigDecimal getCveIdTipoPagoModalidad() {
		return this.cveIdTipoPagoModalidad;
	}

	public void setCveIdTipoPagoModalidad(BigDecimal cveIdTipoPagoModalidad) {
		this.cveIdTipoPagoModalidad = cveIdTipoPagoModalidad;
	}

	public String getDesAfectacion() {
		return this.desAfectacion;
	}

	public void setDesAfectacion(String desAfectacion) {
		this.desAfectacion = desAfectacion;
	}

	public String getDesNombreComercial() {
		return this.desNombreComercial;
	}

	public void setDesNombreComercial(String desNombreComercial) {
		this.desNombreComercial = desNombreComercial;
	}

	public String getDesUsosBienes() {
		return this.desUsosBienes;
	}

	public void setDesUsosBienes(String desUsosBienes) {
		this.desUsosBienes = desUsosBienes;
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

	public BigDecimal getIndMigrDom() {
		return this.indMigrDom;
	}

	public void setIndMigrDom(BigDecimal indMigrDom) {
		this.indMigrDom = indMigrDom;
	}

	public BigDecimal getIndPatronConfirmado() {
		return this.indPatronConfirmado;
	}

	public void setIndPatronConfirmado(BigDecimal indPatronConfirmado) {
		this.indPatronConfirmado = indPatronConfirmado;
	}

	public List<DitPatronGeneralDO> getDitPatronGenerals() {
		return this.ditPatronGenerals;
	}

	public void setDitPatronGenerals(List<DitPatronGeneralDO> ditPatronGenerals) {
		this.ditPatronGenerals = ditPatronGenerals;
	}

	public DitPersonaFisicaDO getDitPersonaFisica() {
		return this.ditPersonaFisica;
	}

	public void setDitPersonaFisica(DitPersonaFisicaDO ditPersonaFisica) {
		this.ditPersonaFisica = ditPersonaFisica;
	}

	public DitPersonaMoralDO getDitPersonaMoral() {
		return this.ditPersonaMoral;
	}

	public void setDitPersonaMoral(DitPersonaMoralDO ditPersonaMoral) {
		this.ditPersonaMoral = ditPersonaMoral;
	}

	public List<DitRepresentanteLegalDO> getDitRepresentanteLegals() {
		return this.ditRepresentanteLegals;
	}

	public void setDitRepresentanteLegals(List<DitRepresentanteLegalDO> ditRepresentanteLegals) {
		this.ditRepresentanteLegals = ditRepresentanteLegals;
	}

	public List<NdtPatronDictamenDO> getNdtPatronDictamens() {
		return this.ndtPatronDictamens;
	}

	public void setNdtPatronDictamens(List<NdtPatronDictamenDO> ndtPatronDictamens) {
		this.ndtPatronDictamens = ndtPatronDictamens;
	}
	public List<NdtR2DespachoDO> getNdtR2Despachos() {
		return this.ndtR2Despachos;
	}

	public void setNdtR2Despachos(List<NdtR2DespachoDO> ndtR2Despachos) {
		this.ndtR2Despachos = ndtR2Despachos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cveIdModalidad == null) ? 0 : cveIdModalidad.hashCode());
		result = prime * result + (int) (cveIdPatronSujetoObligado ^ (cveIdPatronSujetoObligado >>> 32));
		result = prime * result + ((cveIdTipoContribModalidad == null) ? 0 : cveIdTipoContribModalidad.hashCode());
		result = prime * result + ((cveIdTipoInteresado == null) ? 0 : cveIdTipoInteresado.hashCode());
		result = prime * result + ((cveIdTipoPagoModalidad == null) ? 0 : cveIdTipoPagoModalidad.hashCode());
		result = prime * result + ((desAfectacion == null) ? 0 : desAfectacion.hashCode());
		result = prime * result + ((desNombreComercial == null) ? 0 : desNombreComercial.hashCode());
		result = prime * result + ((desUsosBienes == null) ? 0 : desUsosBienes.hashCode());
		result = prime * result + ((ditPatronGenerals == null) ? 0 : ditPatronGenerals.hashCode());
		result = prime * result + ((ditPersonaFisica == null) ? 0 : ditPersonaFisica.hashCode());
		result = prime * result + ((ditPersonaMoral == null) ? 0 : ditPersonaMoral.hashCode());
		result = prime * result + ((ditRepresentanteLegals == null) ? 0 : ditRepresentanteLegals.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((indMigrDom == null) ? 0 : indMigrDom.hashCode());
		result = prime * result + ((indPatronConfirmado == null) ? 0 : indPatronConfirmado.hashCode());
		result = prime * result + ((ndtPatronDictamens == null) ? 0 : ndtPatronDictamens.hashCode());
		result = prime * result + ((ndtR2Despachos == null) ? 0 : ndtR2Despachos.hashCode());
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
		DitPatronSujetoObligadoDO other = (DitPatronSujetoObligadoDO) obj;
		if (cveIdModalidad == null) {
			if (other.cveIdModalidad != null)
				return false;
		} else if (!cveIdModalidad.equals(other.cveIdModalidad))
			return false;
		if (cveIdPatronSujetoObligado != other.cveIdPatronSujetoObligado)
			return false;
		if (cveIdTipoContribModalidad == null) {
			if (other.cveIdTipoContribModalidad != null)
				return false;
		} else if (!cveIdTipoContribModalidad.equals(other.cveIdTipoContribModalidad))
			return false;
		if (cveIdTipoInteresado == null) {
			if (other.cveIdTipoInteresado != null)
				return false;
		} else if (!cveIdTipoInteresado.equals(other.cveIdTipoInteresado))
			return false;
		if (cveIdTipoPagoModalidad == null) {
			if (other.cveIdTipoPagoModalidad != null)
				return false;
		} else if (!cveIdTipoPagoModalidad.equals(other.cveIdTipoPagoModalidad))
			return false;
		if (desAfectacion == null) {
			if (other.desAfectacion != null)
				return false;
		} else if (!desAfectacion.equals(other.desAfectacion))
			return false;
		if (desNombreComercial == null) {
			if (other.desNombreComercial != null)
				return false;
		} else if (!desNombreComercial.equals(other.desNombreComercial))
			return false;
		if (desUsosBienes == null) {
			if (other.desUsosBienes != null)
				return false;
		} else if (!desUsosBienes.equals(other.desUsosBienes))
			return false;
		if (ditPatronGenerals == null) {
			if (other.ditPatronGenerals != null)
				return false;
		} else if (!ditPatronGenerals.equals(other.ditPatronGenerals))
			return false;
		if (ditPersonaFisica == null) {
			if (other.ditPersonaFisica != null)
				return false;
		} else if (!ditPersonaFisica.equals(other.ditPersonaFisica))
			return false;
		if (ditPersonaMoral == null) {
			if (other.ditPersonaMoral != null)
				return false;
		} else if (!ditPersonaMoral.equals(other.ditPersonaMoral))
			return false;
		if (ditRepresentanteLegals == null) {
			if (other.ditRepresentanteLegals != null)
				return false;
		} else if (!ditRepresentanteLegals.equals(other.ditRepresentanteLegals))
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
		if (indMigrDom == null) {
			if (other.indMigrDom != null)
				return false;
		} else if (!indMigrDom.equals(other.indMigrDom))
			return false;
		if (indPatronConfirmado == null) {
			if (other.indPatronConfirmado != null)
				return false;
		} else if (!indPatronConfirmado.equals(other.indPatronConfirmado))
			return false;
		if (ndtPatronDictamens == null) {
			if (other.ndtPatronDictamens != null)
				return false;
		} else if (!ndtPatronDictamens.equals(other.ndtPatronDictamens))
			return false;
		if (ndtR2Despachos == null) {
			if (other.ndtR2Despachos != null)
				return false;
		} else if (!ndtR2Despachos.equals(other.ndtR2Despachos))
			return false;
		return true;
	}
	
	
	

}