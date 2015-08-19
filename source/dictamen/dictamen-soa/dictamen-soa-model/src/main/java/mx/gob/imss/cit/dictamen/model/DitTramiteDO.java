package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIT_TRAMITE database table.
 * 
 */
@Entity
@Table(name="DIT_TRAMITE")
@NamedQuery(name="DitTramiteDO.findAll", query="SELECT d FROM DitTramiteDO d")
public class DitTramiteDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_TRAMITE")
	private long cveIdTramite;

	@Column(name="CVE_ID_RAZON_RESULTADO")
	private BigDecimal cveIdRazonResultado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_CONCLUSION")
	private Date fecConclusion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_EFECTO")
	private Date fecEfecto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_PRESENTACION")
	private Date fecPresentacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_TRAMITE")
	private Date fecTramite;

	@Column(name="IND_RATIFICADO")
	private BigDecimal indRatificado;

	@Column(name="IND_RESULTADO")
	private BigDecimal indResultado;

	@Column(name="NUM_SEC_NOTARIA")
	private String numSecNotaria;

	@Column(name="REF_CADENA_ORIGINAL")
	private String refCadenaOriginal;

	@Column(name="REF_OBSERVACION")
	private String refObservacion;

	@Column(name="REF_SELLO_DIGITAL")
	private String refSelloDigital;

	//bi-directional many-to-one association to DicEstadoTramiteDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_ESTADO_TRAMITE")
	private DicEstadoTramiteDO dicEstadoTramite;

	//bi-directional many-to-one association to DicTipoTramiteDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_TIPO_TRAMITE")
	private DicTipoTramiteDO dicTipoTramite;

	//bi-directional many-to-many association to DitPersonaMoralDO
	@ManyToMany
	@JoinTable(
		name="DIT_TRAMITE_PERSONA_MORAL"
		, joinColumns={
			@JoinColumn(name="CVE_ID_TRAMITE")
			}
		, inverseJoinColumns={
			@JoinColumn(name="CVE_ID_PERSONA_MORAL")
			}
		)
	private List<DitPersonaMoralDO> ditPersonaMorals;

	//bi-directional many-to-one association to DitSolicitudDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_SOLICITUD")
	private DitSolicitudDO ditSolicitud;

	//bi-directional many-to-one association to NdtAcreditacionDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditTramite")
	private List<NdtAcreditacionDO> ndtAcreditacions;

	//bi-directional many-to-one association to NdtR1DatosPersonaleDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditTramite")
	private List<NdtR1DatosPersonaleDO> ndtR1DatosPersonales;

	//bi-directional many-to-one association to NdtR1DomFiscalDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditTramite")
	private List<NdtR1DomFiscalDO> ndtR1DomFiscals;

	//bi-directional many-to-one association to NdtR2DespachoDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditTramite")
	private List<NdtR2DespachoDO> ndtR2Despachos;

	//bi-directional many-to-one association to NdtR3ColegioXcontadorDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditTramite")
	private List<NdtR3ColegioXcontadorDO> ndtR3ColegioXcontadors;

	//bi-directional many-to-one association to NdtRegBajaReactivDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditTramite")
	private List<NdtRegBajaReactivDO> ndtRegBajaReactivs;

	public DitTramiteDO() {
	}

	public long getCveIdTramite() {
		return this.cveIdTramite;
	}

	public void setCveIdTramite(long cveIdTramite) {
		this.cveIdTramite = cveIdTramite;
	}

	public BigDecimal getCveIdRazonResultado() {
		return this.cveIdRazonResultado;
	}

	public void setCveIdRazonResultado(BigDecimal cveIdRazonResultado) {
		this.cveIdRazonResultado = cveIdRazonResultado;
	}

	public Date getFecConclusion() {
		return this.fecConclusion;
	}

	public void setFecConclusion(Date fecConclusion) {
		this.fecConclusion = fecConclusion;
	}

	public Date getFecEfecto() {
		return this.fecEfecto;
	}

	public void setFecEfecto(Date fecEfecto) {
		this.fecEfecto = fecEfecto;
	}

	public Date getFecPresentacion() {
		return this.fecPresentacion;
	}

	public void setFecPresentacion(Date fecPresentacion) {
		this.fecPresentacion = fecPresentacion;
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

	public Date getFecTramite() {
		return this.fecTramite;
	}

	public void setFecTramite(Date fecTramite) {
		this.fecTramite = fecTramite;
	}

	public BigDecimal getIndRatificado() {
		return this.indRatificado;
	}

	public void setIndRatificado(BigDecimal indRatificado) {
		this.indRatificado = indRatificado;
	}

	public BigDecimal getIndResultado() {
		return this.indResultado;
	}

	public void setIndResultado(BigDecimal indResultado) {
		this.indResultado = indResultado;
	}

	public String getNumSecNotaria() {
		return this.numSecNotaria;
	}

	public void setNumSecNotaria(String numSecNotaria) {
		this.numSecNotaria = numSecNotaria;
	}

	public String getRefCadenaOriginal() {
		return this.refCadenaOriginal;
	}

	public void setRefCadenaOriginal(String refCadenaOriginal) {
		this.refCadenaOriginal = refCadenaOriginal;
	}

	public String getRefObservacion() {
		return this.refObservacion;
	}

	public void setRefObservacion(String refObservacion) {
		this.refObservacion = refObservacion;
	}

	public String getRefSelloDigital() {
		return this.refSelloDigital;
	}

	public void setRefSelloDigital(String refSelloDigital) {
		this.refSelloDigital = refSelloDigital;
	}

	public DicEstadoTramiteDO getDicEstadoTramite() {
		return this.dicEstadoTramite;
	}

	public void setDicEstadoTramite(DicEstadoTramiteDO dicEstadoTramite) {
		this.dicEstadoTramite = dicEstadoTramite;
	}

	public DicTipoTramiteDO getDicTipoTramite() {
		return this.dicTipoTramite;
	}

	public void setDicTipoTramite(DicTipoTramiteDO dicTipoTramite) {
		this.dicTipoTramite = dicTipoTramite;
	}

	public List<DitPersonaMoralDO> getDitPersonaMorals() {
		return this.ditPersonaMorals;
	}

	public void setDitPersonaMorals(List<DitPersonaMoralDO> ditPersonaMorals) {
		this.ditPersonaMorals = ditPersonaMorals;
	}

	public DitSolicitudDO getDitSolicitud() {
		return this.ditSolicitud;
	}

	public void setDitSolicitud(DitSolicitudDO ditSolicitud) {
		this.ditSolicitud = ditSolicitud;
	}

	public List<NdtAcreditacionDO> getNdtAcreditacions() {
		return this.ndtAcreditacions;
	}

	public void setNdtAcreditacions(List<NdtAcreditacionDO> ndtAcreditacions) {
		this.ndtAcreditacions = ndtAcreditacions;
	}

	

	public List<NdtR1DatosPersonaleDO> getNdtR1DatosPersonales() {
		return this.ndtR1DatosPersonales;
	}

	public void setNdtR1DatosPersonales(List<NdtR1DatosPersonaleDO> ndtR1DatosPersonales) {
		this.ndtR1DatosPersonales = ndtR1DatosPersonales;
	}

	

	public List<NdtR1DomFiscalDO> getNdtR1DomFiscals() {
		return this.ndtR1DomFiscals;
	}

	public void setNdtR1DomFiscals(List<NdtR1DomFiscalDO> ndtR1DomFiscals) {
		this.ndtR1DomFiscals = ndtR1DomFiscals;
	}

	

	public List<NdtR2DespachoDO> getNdtR2Despachos() {
		return this.ndtR2Despachos;
	}

	public void setNdtR2Despachos(List<NdtR2DespachoDO> ndtR2Despachos) {
		this.ndtR2Despachos = ndtR2Despachos;
	}

	

	public List<NdtR3ColegioXcontadorDO> getNdtR3ColegioXcontadors() {
		return this.ndtR3ColegioXcontadors;
	}

	public void setNdtR3ColegioXcontadors(List<NdtR3ColegioXcontadorDO> ndtR3ColegioXcontadors) {
		this.ndtR3ColegioXcontadors = ndtR3ColegioXcontadors;
	}

	
	public List<NdtRegBajaReactivDO> getNdtRegBajaReactivs() {
		return this.ndtRegBajaReactivs;
	}

	public void setNdtRegBajaReactivs(List<NdtRegBajaReactivDO> ndtRegBajaReactivs) {
		this.ndtRegBajaReactivs = ndtRegBajaReactivs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cveIdRazonResultado == null) ? 0 : cveIdRazonResultado.hashCode());
		result = prime * result + (int) (cveIdTramite ^ (cveIdTramite >>> 32));
		result = prime * result + ((dicEstadoTramite == null) ? 0 : dicEstadoTramite.hashCode());
		result = prime * result + ((dicTipoTramite == null) ? 0 : dicTipoTramite.hashCode());
		result = prime * result + ((ditPersonaMorals == null) ? 0 : ditPersonaMorals.hashCode());
		result = prime * result + ((ditSolicitud == null) ? 0 : ditSolicitud.hashCode());
		result = prime * result + ((fecConclusion == null) ? 0 : fecConclusion.hashCode());
		result = prime * result + ((fecEfecto == null) ? 0 : fecEfecto.hashCode());
		result = prime * result + ((fecPresentacion == null) ? 0 : fecPresentacion.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((fecTramite == null) ? 0 : fecTramite.hashCode());
		result = prime * result + ((indRatificado == null) ? 0 : indRatificado.hashCode());
		result = prime * result + ((indResultado == null) ? 0 : indResultado.hashCode());
		result = prime * result + ((ndtAcreditacions == null) ? 0 : ndtAcreditacions.hashCode());
		result = prime * result + ((ndtR1DatosPersonales == null) ? 0 : ndtR1DatosPersonales.hashCode());
		result = prime * result + ((ndtR1DomFiscals == null) ? 0 : ndtR1DomFiscals.hashCode());
		result = prime * result + ((ndtR2Despachos == null) ? 0 : ndtR2Despachos.hashCode());
		result = prime * result + ((ndtR3ColegioXcontadors == null) ? 0 : ndtR3ColegioXcontadors.hashCode());
		result = prime * result + ((ndtRegBajaReactivs == null) ? 0 : ndtRegBajaReactivs.hashCode());
		result = prime * result + ((numSecNotaria == null) ? 0 : numSecNotaria.hashCode());
		result = prime * result + ((refCadenaOriginal == null) ? 0 : refCadenaOriginal.hashCode());
		result = prime * result + ((refObservacion == null) ? 0 : refObservacion.hashCode());
		result = prime * result + ((refSelloDigital == null) ? 0 : refSelloDigital.hashCode());
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
		DitTramiteDO other = (DitTramiteDO) obj;
		if (cveIdRazonResultado == null) {
			if (other.cveIdRazonResultado != null)
				return false;
		} else if (!cveIdRazonResultado.equals(other.cveIdRazonResultado))
			return false;
		if (cveIdTramite != other.cveIdTramite)
			return false;
		if (dicEstadoTramite == null) {
			if (other.dicEstadoTramite != null)
				return false;
		} else if (!dicEstadoTramite.equals(other.dicEstadoTramite))
			return false;
		if (dicTipoTramite == null) {
			if (other.dicTipoTramite != null)
				return false;
		} else if (!dicTipoTramite.equals(other.dicTipoTramite))
			return false;
		if (ditPersonaMorals == null) {
			if (other.ditPersonaMorals != null)
				return false;
		} else if (!ditPersonaMorals.equals(other.ditPersonaMorals))
			return false;
		if (ditSolicitud == null) {
			if (other.ditSolicitud != null)
				return false;
		} else if (!ditSolicitud.equals(other.ditSolicitud))
			return false;
		if (fecConclusion == null) {
			if (other.fecConclusion != null)
				return false;
		} else if (!fecConclusion.equals(other.fecConclusion))
			return false;
		if (fecEfecto == null) {
			if (other.fecEfecto != null)
				return false;
		} else if (!fecEfecto.equals(other.fecEfecto))
			return false;
		if (fecPresentacion == null) {
			if (other.fecPresentacion != null)
				return false;
		} else if (!fecPresentacion.equals(other.fecPresentacion))
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
		if (fecTramite == null) {
			if (other.fecTramite != null)
				return false;
		} else if (!fecTramite.equals(other.fecTramite))
			return false;
		if (indRatificado == null) {
			if (other.indRatificado != null)
				return false;
		} else if (!indRatificado.equals(other.indRatificado))
			return false;
		if (indResultado == null) {
			if (other.indResultado != null)
				return false;
		} else if (!indResultado.equals(other.indResultado))
			return false;
		if (ndtAcreditacions == null) {
			if (other.ndtAcreditacions != null)
				return false;
		} else if (!ndtAcreditacions.equals(other.ndtAcreditacions))
			return false;
		if (ndtR1DatosPersonales == null) {
			if (other.ndtR1DatosPersonales != null)
				return false;
		} else if (!ndtR1DatosPersonales.equals(other.ndtR1DatosPersonales))
			return false;
		if (ndtR1DomFiscals == null) {
			if (other.ndtR1DomFiscals != null)
				return false;
		} else if (!ndtR1DomFiscals.equals(other.ndtR1DomFiscals))
			return false;
		if (ndtR2Despachos == null) {
			if (other.ndtR2Despachos != null)
				return false;
		} else if (!ndtR2Despachos.equals(other.ndtR2Despachos))
			return false;
		if (ndtR3ColegioXcontadors == null) {
			if (other.ndtR3ColegioXcontadors != null)
				return false;
		} else if (!ndtR3ColegioXcontadors.equals(other.ndtR3ColegioXcontadors))
			return false;
		if (ndtRegBajaReactivs == null) {
			if (other.ndtRegBajaReactivs != null)
				return false;
		} else if (!ndtRegBajaReactivs.equals(other.ndtRegBajaReactivs))
			return false;
		if (numSecNotaria == null) {
			if (other.numSecNotaria != null)
				return false;
		} else if (!numSecNotaria.equals(other.numSecNotaria))
			return false;
		if (refCadenaOriginal == null) {
			if (other.refCadenaOriginal != null)
				return false;
		} else if (!refCadenaOriginal.equals(other.refCadenaOriginal))
			return false;
		if (refObservacion == null) {
			if (other.refObservacion != null)
				return false;
		} else if (!refObservacion.equals(other.refObservacion))
			return false;
		if (refSelloDigital == null) {
			if (other.refSelloDigital != null)
				return false;
		} else if (!refSelloDigital.equals(other.refSelloDigital))
			return false;
		return true;
	}

	

}