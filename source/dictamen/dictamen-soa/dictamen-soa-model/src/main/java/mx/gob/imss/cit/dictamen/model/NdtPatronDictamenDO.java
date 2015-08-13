package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the NDT_PATRON_DICTAMEN database table.
 * 
 */
@Entity
@Table(name="NDT_PATRON_DICTAMEN")
@NamedQuery(name="NdtPatronDictamenDO.findAll", query="SELECT n FROM NdtPatronDictamenDO n")
public class NdtPatronDictamenDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "CVE_ID_DICTAMEN", nullable = false)
    @SequenceGenerator(name = "NdtPatronDictamen_Id_Seq_Gen", sequenceName = "SEQ_NDTPATRONDICTAMEN")
    @GeneratedValue(generator = "NdtPatronDictamen_Id_Seq_Gen")
	private long cveIdDictamen;

	@Column(name="CVE_ID_USUARIO")
	private String cveIdUsuario;

	@Column(name="DES_NUMERO_FOLIO_DICTAMEN")
	private String desNumeroFolioDictamen;

	@Column(name="DES_OBSERVACIONES")
	private String desObservaciones;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_PERIODO_FIN_DICTAMINAEJER")
	private Date fecPeriodoFinDictaminaejer;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_PERIODO_INICIO_DICTAMINAEJ")
	private Date fecPeriodoInicioDictaminaej;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_AUTORIZADO")
	private Date fecRegistroAutorizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="IND_EMPRESA_VALUADA")
	private BigDecimal indEmpresaValuada;

	@Column(name="IND_PATRON_OBLIGADO")
	private BigDecimal indPatronObligado;

	@Column(name="IND_PATRON_SUSTITUIDO")
	private BigDecimal indPatronSustituido;

	@Column(name="IND_PATRON_SUSTITUTO")
	private BigDecimal indPatronSustituto;

	//bi-directional many-to-one association to DicSubdelegacionDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_SUBDELEGACION")
	private DicSubdelegacionDO dicSubdelegacion;

	//bi-directional many-to-one association to DitPatronSujetoObligadoDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PATRON_SUJETO_OBLIGADO")
	private DitPatronSujetoObligadoDO ditPatronSujetoObligado;

	//bi-directional many-to-one association to NdcTipoAfiliacionDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_TIPO_AFILIACION")
	private NdcTipoAfiliacionDO ndcTipoAfiliacion;

	//bi-directional many-to-one association to NdcTipoConvenioCotizacionDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_TIPO_CONVENIO_COT")
	private NdcTipoConvenioCotizacionDO ndcTipoConvenioCotizacion;

	//bi-directional many-to-one association to NdtPatronDictamenCpaDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ndtPatronDictamen")
	private List<NdtPatronDictamenCpaDO> ndtPatronDictamenCpas;

	public NdtPatronDictamenDO() {
	}

	public long getCveIdDictamen() {
		return this.cveIdDictamen;
	}

	public void setCveIdDictamen(long cveIdDictamen) {
		this.cveIdDictamen = cveIdDictamen;
	}

	public String getCveIdUsuario() {
		return this.cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDesNumeroFolioDictamen() {
		return this.desNumeroFolioDictamen;
	}

	public void setDesNumeroFolioDictamen(String desNumeroFolioDictamen) {
		this.desNumeroFolioDictamen = desNumeroFolioDictamen;
	}

	public String getDesObservaciones() {
		return this.desObservaciones;
	}

	public void setDesObservaciones(String desObservaciones) {
		this.desObservaciones = desObservaciones;
	}

	public Date getFecPeriodoFinDictaminaejer() {
		return this.fecPeriodoFinDictaminaejer;
	}

	public void setFecPeriodoFinDictaminaejer(Date fecPeriodoFinDictaminaejer) {
		this.fecPeriodoFinDictaminaejer = fecPeriodoFinDictaminaejer;
	}

	public Date getFecPeriodoInicioDictaminaej() {
		return this.fecPeriodoInicioDictaminaej;
	}

	public void setFecPeriodoInicioDictaminaej(Date fecPeriodoInicioDictaminaej) {
		this.fecPeriodoInicioDictaminaej = fecPeriodoInicioDictaminaej;
	}

	public Date getFecRegistroAlta() {
		return this.fecRegistroAlta;
	}

	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	public Date getFecRegistroAutorizado() {
		return this.fecRegistroAutorizado;
	}

	public void setFecRegistroAutorizado(Date fecRegistroAutorizado) {
		this.fecRegistroAutorizado = fecRegistroAutorizado;
	}

	public Date getFecRegistroBaja() {
		return this.fecRegistroBaja;
	}

	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	public BigDecimal getIndEmpresaValuada() {
		return this.indEmpresaValuada;
	}

	public void setIndEmpresaValuada(BigDecimal indEmpresaValuada) {
		this.indEmpresaValuada = indEmpresaValuada;
	}

	public BigDecimal getIndPatronObligado() {
		return this.indPatronObligado;
	}

	public void setIndPatronObligado(BigDecimal indPatronObligado) {
		this.indPatronObligado = indPatronObligado;
	}

	public BigDecimal getIndPatronSustituido() {
		return this.indPatronSustituido;
	}

	public void setIndPatronSustituido(BigDecimal indPatronSustituido) {
		this.indPatronSustituido = indPatronSustituido;
	}

	public BigDecimal getIndPatronSustituto() {
		return this.indPatronSustituto;
	}

	public void setIndPatronSustituto(BigDecimal indPatronSustituto) {
		this.indPatronSustituto = indPatronSustituto;
	}

	public DicSubdelegacionDO getDicSubdelegacion() {
		return this.dicSubdelegacion;
	}

	public void setDicSubdelegacion(DicSubdelegacionDO dicSubdelegacion) {
		this.dicSubdelegacion = dicSubdelegacion;
	}

	public DitPatronSujetoObligadoDO getDitPatronSujetoObligado() {
		return this.ditPatronSujetoObligado;
	}

	public void setDitPatronSujetoObligado(DitPatronSujetoObligadoDO ditPatronSujetoObligado) {
		this.ditPatronSujetoObligado = ditPatronSujetoObligado;
	}

	public NdcTipoAfiliacionDO getNdcTipoAfiliacion() {
		return this.ndcTipoAfiliacion;
	}

	public void setNdcTipoAfiliacion(NdcTipoAfiliacionDO ndcTipoAfiliacion) {
		this.ndcTipoAfiliacion = ndcTipoAfiliacion;
	}

	public NdcTipoConvenioCotizacionDO getNdcTipoConvenioCotizacion() {
		return this.ndcTipoConvenioCotizacion;
	}

	public void setNdcTipoConvenioCotizacion(NdcTipoConvenioCotizacionDO ndcTipoConvenioCotizacion) {
		this.ndcTipoConvenioCotizacion = ndcTipoConvenioCotizacion;
	}

	public List<NdtPatronDictamenCpaDO> getNdtPatronDictamenCpas() {
		return this.ndtPatronDictamenCpas;
	}

	public void setNdtPatronDictamenCpas(List<NdtPatronDictamenCpaDO> ndtPatronDictamenCpas) {
		this.ndtPatronDictamenCpas = ndtPatronDictamenCpas;
	}

}