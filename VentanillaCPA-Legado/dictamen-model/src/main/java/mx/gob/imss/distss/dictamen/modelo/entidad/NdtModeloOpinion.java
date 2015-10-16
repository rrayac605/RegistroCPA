package mx.gob.imss.distss.dictamen.modelo.entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="NDT_MODELO_OPINION")
@NamedQuery(name="NdtModeloOpinion.findAll", query="SELECT n FROM NdtModeloOpinion n")
public class NdtModeloOpinion implements Serializable {
	
	private static final long serialVersionUID = 6744016626507889254L;
	
	@Id
	@Column(name="CVE_ID_MODELO_OPINION", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtModeloOpinion_Id_Seq_Gen", sequenceName = "SEQ_NDTMODELOOPINION")
    @GeneratedValue(generator = "NdtModeloOpinion_Id_Seq_Gen")
	private Long cveIdModeloOpinion;

	@Column(name="CVE_ID_USUARIO", length=20)
	private String cveIdUsuario;

	@Column(name="DES_CONCEPTOS", length=250)
	private String desConceptos;

	@Column(name="DES_LIMITACIONES_INFORMACION", length=3000)
	private String desLimitacionesInformacion;

	@Column(name="DES_MOTIVO_SALVEDAD", length=3000)
	private String desMotivoSalvedad;

	@Column(name="DES_OBSERVACIONES", length=3000)
	private String desObservaciones;

	@Column(name="DES_RUBROS", length=250)
	private String desRubros;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_FECHA_CONVENIO")
	private Date fecFechaConvenio;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_FECHA_PAGO_PRIMERPAGO")
	private Date fecFechaPagoPrimerpago;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="NUM_NUMERO_CONVENIO", length=100)
	private String numNumeroConvenio;

	@Column(name="NUM_PARCIALIDADES")
	private Long numParcialidades;

	//bi-directional many-to-one association to NdcFormaPago
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_FORMA_PAGO")
	private NdcFormaPago ndcFormaPago;

	//bi-directional many-to-one association to NdcTipoModeloOpinion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_TIPO_OPINION")
	private NdcTipoModeloOpinion ndcTipoModeloOpinion;

	//bi-directional many-to-one association to NdcTipoPago
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_TIPO_PAGO")
	private NdcTipoPago ndcTipoPago;

	//bi-directional many-to-one association to NdtPatronDictamen
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_PATRON_DICTAMEN")
	private NdtPatronDictamen ndtPatronDictamen;

	public NdtModeloOpinion() {
	}

	public Long getCveIdModeloOpinion() {
		return cveIdModeloOpinion;
	}

	public void setCveIdModeloOpinion(Long cveIdModeloOpinion) {
		this.cveIdModeloOpinion = cveIdModeloOpinion;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDesConceptos() {
		return desConceptos;
	}

	public void setDesConceptos(String desConceptos) {
		this.desConceptos = desConceptos;
	}

	public String getDesLimitacionesInformacion() {
		return desLimitacionesInformacion;
	}

	public void setDesLimitacionesInformacion(String desLimitacionesInformacion) {
		this.desLimitacionesInformacion = desLimitacionesInformacion;
	}

	public String getDesMotivoSalvedad() {
		return desMotivoSalvedad;
	}

	public void setDesMotivoSalvedad(String desMotivoSalvedad) {
		this.desMotivoSalvedad = desMotivoSalvedad;
	}

	public String getDesObservaciones() {
		return desObservaciones;
	}

	public void setDesObservaciones(String desObservaciones) {
		this.desObservaciones = desObservaciones;
	}

	public String getDesRubros() {
		return desRubros;
	}

	public void setDesRubros(String desRubros) {
		this.desRubros = desRubros;
	}

	public Date getFecFechaConvenio() {
		return fecFechaConvenio;
	}

	public void setFecFechaConvenio(Date fecFechaConvenio) {
		this.fecFechaConvenio = fecFechaConvenio;
	}

	public Date getFecFechaPagoPrimerpago() {
		return fecFechaPagoPrimerpago;
	}

	public void setFecFechaPagoPrimerpago(Date fecFechaPagoPrimerpago) {
		this.fecFechaPagoPrimerpago = fecFechaPagoPrimerpago;
	}

	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado;
	}

	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	public Date getFecRegistroAlta() {
		return fecRegistroAlta;
	}

	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	public Date getFecRegistroBaja() {
		return fecRegistroBaja;
	}

	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	public String getNumNumeroConvenio() {
		return numNumeroConvenio;
	}

	public void setNumNumeroConvenio(String numNumeroConvenio) {
		this.numNumeroConvenio = numNumeroConvenio;
	}

	public Long getNumParcialidades() {
		return numParcialidades;
	}

	public void setNumParcialidades(Long numParcialidades) {
		this.numParcialidades = numParcialidades;
	}

	public NdcFormaPago getNdcFormaPago() {
		return ndcFormaPago;
	}

	public void setNdcFormaPago(NdcFormaPago ndcFormaPago) {
		this.ndcFormaPago = ndcFormaPago;
	}

	public NdcTipoModeloOpinion getNdcTipoModeloOpinion() {
		return ndcTipoModeloOpinion;
	}

	public void setNdcTipoModeloOpinion(NdcTipoModeloOpinion ndcTipoModeloOpinion) {
		this.ndcTipoModeloOpinion = ndcTipoModeloOpinion;
	}

	public NdcTipoPago getNdcTipoPago() {
		return ndcTipoPago;
	}

	public void setNdcTipoPago(NdcTipoPago ndcTipoPago) {
		this.ndcTipoPago = ndcTipoPago;
	}

	public NdtPatronDictamen getNdtPatronDictamen() {
		return ndtPatronDictamen;
	}

	public void setNdtPatronDictamen(NdtPatronDictamen ndtPatronDictamen) {
		this.ndtPatronDictamen = ndtPatronDictamen;
	}

}