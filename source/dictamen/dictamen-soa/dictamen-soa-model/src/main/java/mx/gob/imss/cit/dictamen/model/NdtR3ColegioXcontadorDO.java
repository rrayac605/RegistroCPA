package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the NDT_R3_COLEGIO_XCONTADOR database table.
 * 
 */
@Entity
@Table(name="NDT_R3_COLEGIO_XCONTADOR")
@NamedQuery(name="NdtR3ColegioXcontadorDO.findAll", query="SELECT n FROM NdtR3ColegioXcontadorDO n")
public class NdtR3ColegioXcontadorDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_COLEGIO_CPA")
	private long cveIdColegioCpa;

	@Column(name="CVE_ID_USUARIO")
	private String cveIdUsuario;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_SOLICITUD_R3")
	private Date fecSolicitudR3;

	@Column(name="NUM_TRAMITE_NOTARIA")
	private String numTramiteNotaria;

	@Column(name="URL_ACUSE_NOTARIA")
	private String urlAcuseNotaria;

	//bi-directional many-to-one association to DitTramiteDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_TRAMITE")
	private DitTramiteDO ditTramite;

	//bi-directional many-to-one association to NdcColegioDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_COLEGIO")
	private NdcColegioDO ndcColegio;

	//bi-directional many-to-one association to NdtContadorPublicoAutDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_CPA")
	private NdtContadorPublicoAutDO ndtContadorPublicoAut;

	public NdtR3ColegioXcontadorDO() {
	}

	public long getCveIdColegioCpa() {
		return this.cveIdColegioCpa;
	}

	public void setCveIdColegioCpa(long cveIdColegioCpa) {
		this.cveIdColegioCpa = cveIdColegioCpa;
	}

	public String getCveIdUsuario() {
		return this.cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
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

	public Date getFecSolicitudR3() {
		return this.fecSolicitudR3;
	}

	public void setFecSolicitudR3(Date fecSolicitudR3) {
		this.fecSolicitudR3 = fecSolicitudR3;
	}

	public String getNumTramiteNotaria() {
		return this.numTramiteNotaria;
	}

	public void setNumTramiteNotaria(String numTramiteNotaria) {
		this.numTramiteNotaria = numTramiteNotaria;
	}

	public String getUrlAcuseNotaria() {
		return this.urlAcuseNotaria;
	}

	public void setUrlAcuseNotaria(String urlAcuseNotaria) {
		this.urlAcuseNotaria = urlAcuseNotaria;
	}

	public DitTramiteDO getDitTramite() {
		return this.ditTramite;
	}

	public void setDitTramite(DitTramiteDO ditTramite) {
		this.ditTramite = ditTramite;
	}

	public NdcColegioDO getNdcColegio() {
		return this.ndcColegio;
	}

	public void setNdcColegio(NdcColegioDO ndcColegio) {
		this.ndcColegio = ndcColegio;
	}

	public NdtContadorPublicoAutDO getNdtContadorPublicoAut() {
		return this.ndtContadorPublicoAut;
	}

	public void setNdtContadorPublicoAut(NdtContadorPublicoAutDO ndtContadorPublicoAut) {
		this.ndtContadorPublicoAut = ndtContadorPublicoAut;
	}

}