package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the NDT_PATRON_DICTAMEN_CPA database table.
 * 
 */
@Entity
@Table(name="NDT_PATRON_DICTAMEN_CPA")
@NamedQuery(name="NdtPatronDictamenCpaDO.findAll", query="SELECT n FROM NdtPatronDictamenCpaDO n")
public class NdtPatronDictamenCpaDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_PATRON_CPA_DICTAMEN")
	private long cveIdPatronCpaDictamen;

	@Column(name="CVE_ID_USUARIO")
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_SOLICITUD_PATRON_CPA")
	private Date fecSolicitudPatronCpa;

	//bi-directional many-to-one association to NdtContadorPublicoAutDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_CPA")
	private NdtContadorPublicoAutDO ndtContadorPublicoAut;

	//bi-directional many-to-one association to NdtPatronDictamenDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_DICTAMEN")
	private NdtPatronDictamenDO ndtPatronDictamen;

	public NdtPatronDictamenCpaDO() {
	}

	public long getCveIdPatronCpaDictamen() {
		return this.cveIdPatronCpaDictamen;
	}

	public void setCveIdPatronCpaDictamen(long cveIdPatronCpaDictamen) {
		this.cveIdPatronCpaDictamen = cveIdPatronCpaDictamen;
	}

	public String getCveIdUsuario() {
		return this.cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
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

	public Date getFecSolicitudPatronCpa() {
		return this.fecSolicitudPatronCpa;
	}

	public void setFecSolicitudPatronCpa(Date fecSolicitudPatronCpa) {
		this.fecSolicitudPatronCpa = fecSolicitudPatronCpa;
	}

	public NdtContadorPublicoAutDO getNdtContadorPublicoAut() {
		return this.ndtContadorPublicoAut;
	}

	public void setNdtContadorPublicoAut(NdtContadorPublicoAutDO ndtContadorPublicoAut) {
		this.ndtContadorPublicoAut = ndtContadorPublicoAut;
	}

	public NdtPatronDictamenDO getNdtPatronDictamen() {
		return this.ndtPatronDictamen;
	}

	public void setNdtPatronDictamen(NdtPatronDictamenDO ndtPatronDictamen) {
		this.ndtPatronDictamen = ndtPatronDictamen;
	}

}