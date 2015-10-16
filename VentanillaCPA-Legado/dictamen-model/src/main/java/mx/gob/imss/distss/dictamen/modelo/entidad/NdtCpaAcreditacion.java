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
@Table(name="NDT_CPA_ACREDITACION")
@NamedQuery(name="NdtCpaAcreditacion.findAll", query="SELECT n FROM NdtCpaAcreditacion n")
public class NdtCpaAcreditacion implements Serializable {
	
	private static final long serialVersionUID = -5529592295144837376L;
	
	@Id
	@Column(name="CVE_ID_ACREDITACION", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtCpaAcreditacion_Id_Seq_Gen", sequenceName = "SEQ_NDTCPAACREDITACION")
    @GeneratedValue(generator = "NdtCpaAcreditacion_Id_Seq_Gen")
	private Long cveIdAcreditacion;

	@Column(name="CVE_ID_USUARIO", length=18)
	private String cveIdUsuario;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_ACREDITACION_CP")
	private Date fecAcreditacionCp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_DOCUMENTO1")
	private Date fecDocumento1;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_DOCUMENTO2")
	private Date fecDocumento2;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_PRESENTACION_ACREDITACION")
	private Date fecPresentacionAcreditacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="IND_ACRED_MEMBRESIA")
	private Long indAcredMembresia;

	//bi-directional many-to-one association to NdtColegio
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_COLEGIO")
	private NdtColegio ndtColegio;

	//bi-directional many-to-one association to NdtContadorPublicoAut
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_CPA", nullable=false)
	private NdtContadorPublicoAut ndtContadorPublicoAut;

	//bi-directional many-to-one association to NdtCpaTramite
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_CPA_TRAMITE")
	private NdtCpaTramite ndtCpaTramite;

	public NdtCpaAcreditacion() {
	}

	public Long getCveIdAcreditacion() {
		return cveIdAcreditacion;
	}

	public void setCveIdAcreditacion(Long cveIdAcreditacion) {
		this.cveIdAcreditacion = cveIdAcreditacion;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public Date getFecAcreditacionCp() {
		return fecAcreditacionCp;
	}

	public void setFecAcreditacionCp(Date fecAcreditacionCp) {
		this.fecAcreditacionCp = fecAcreditacionCp;
	}

	public Date getFecDocumento1() {
		return fecDocumento1;
	}

	public void setFecDocumento1(Date fecDocumento1) {
		this.fecDocumento1 = fecDocumento1;
	}

	public Date getFecDocumento2() {
		return fecDocumento2;
	}

	public void setFecDocumento2(Date fecDocumento2) {
		this.fecDocumento2 = fecDocumento2;
	}

	public Date getFecPresentacionAcreditacion() {
		return fecPresentacionAcreditacion;
	}

	public void setFecPresentacionAcreditacion(Date fecPresentacionAcreditacion) {
		this.fecPresentacionAcreditacion = fecPresentacionAcreditacion;
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

	public Long getIndAcredMembresia() {
		return indAcredMembresia;
	}

	public void setIndAcredMembresia(Long indAcredMembresia) {
		this.indAcredMembresia = indAcredMembresia;
	}

	public NdtColegio getNdtColegio() {
		return ndtColegio;
	}

	public void setNdtColegio(NdtColegio ndtColegio) {
		this.ndtColegio = ndtColegio;
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