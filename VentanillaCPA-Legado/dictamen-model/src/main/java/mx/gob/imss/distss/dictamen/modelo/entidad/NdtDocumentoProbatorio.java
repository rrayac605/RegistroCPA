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
@Table(name="NDT_DOCUMENTO_PROBATORIO")
@NamedQuery(name="NdtDocumentoProbatorio.findAll", query="SELECT n FROM NdtDocumentoProbatorio n")
public class NdtDocumentoProbatorio implements Serializable {
	
	private static final long serialVersionUID = -3966277965534976366L;
	
	@Id
	@Column(name="CVE_ID_DOCTO_PROBATORIO", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtDocumentoProbatorio_Id_Seq_Gen", sequenceName = "SEQ_NDTDOCUMENTOPROBATORIO")
    @GeneratedValue(generator = "NdtDocumentoProbatorio_Id_Seq_Gen")
	private Long cveIdDoctoProbatorio;

	@Column(name="CVE_ID_DOCTO_PROB_POR_TIPO")
	private Long cveIdDoctoProbPorTipo;

	@Column(name="CVE_ID_USUARIO", length=18)
	private String cveIdUsuario;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="URL_DOCUMENTO_PROB", length=250)
	private String urlDocumentoProb;

	//bi-directional many-to-one association to NdtContadorPublicoAut
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_CPA")
	private NdtContadorPublicoAut ndtContadorPublicoAut;

	//bi-directional many-to-one association to NdtCpaTramite
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_CPA_TRAMITE")
	private NdtCpaTramite ndtCpaTramite;

	public NdtDocumentoProbatorio() {
	}

	public Long getCveIdDoctoProbatorio() {
		return cveIdDoctoProbatorio;
	}

	public void setCveIdDoctoProbatorio(Long cveIdDoctoProbatorio) {
		this.cveIdDoctoProbatorio = cveIdDoctoProbatorio;
	}

	public Long getCveIdDoctoProbPorTipo() {
		return cveIdDoctoProbPorTipo;
	}

	public void setCveIdDoctoProbPorTipo(Long cveIdDoctoProbPorTipo) {
		this.cveIdDoctoProbPorTipo = cveIdDoctoProbPorTipo;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
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

	public String getUrlDocumentoProb() {
		return urlDocumentoProb;
	}

	public void setUrlDocumentoProb(String urlDocumentoProb) {
		this.urlDocumentoProb = urlDocumentoProb;
	}

	public NdtContadorPublicoAut getNdtContadorPublicoAut() {
		return ndtContadorPublicoAut;
	}

	public void setNdtContadorPublicoAut(NdtContadorPublicoAut ndtContadorPublicoAut) {
		this.ndtContadorPublicoAut = ndtContadorPublicoAut;
	}

	public NdtCpaTramite getNdtCpaTramite() {
		return ndtCpaTramite;
	}

	public void setNdtCpaTramite(NdtCpaTramite ndtCpaTramite) {
		this.ndtCpaTramite = ndtCpaTramite;
	}

}