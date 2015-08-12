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

	

}