package mx.gob.imss.cit.dictamen.commons.to;

import java.util.Date;

public class AcreditacionTO extends BaseTO {


	/**
	 * 
	 */
	private static final long serialVersionUID = -5379994428690970316L;

	private long cveIdCpaAcreditacion;

	private String cveIdUsuario;

	private Date fecAcreditacionCp;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private Date fecSolicitud;

	private String numTramiteNotaria;

	private String urlAcuseNotaria;

	private TramiteTO ditTramite;

	private ColegioTO ndcColegio;

	private ContadorPublicoTO ndtContadorPublicoAut;

	/**
	 * @return the cveIdCpaAcreditacion
	 */
	public long getCveIdCpaAcreditacion() {
		return cveIdCpaAcreditacion;
	}

	/**
	 * @param cveIdCpaAcreditacion the cveIdCpaAcreditacion to set
	 */
	public void setCveIdCpaAcreditacion(long cveIdCpaAcreditacion) {
		this.cveIdCpaAcreditacion = cveIdCpaAcreditacion;
	}

	/**
	 * @return the cveIdUsuario
	 */
	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	/**
	 * @param cveIdUsuario the cveIdUsuario to set
	 */
	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	/**
	 * @return the fecAcreditacionCp
	 */
	public Date getFecAcreditacionCp() {
		return fecAcreditacionCp != null ? (Date) fecAcreditacionCp.clone() : null;
	}

	/**
	 * @param fecAcreditacionCp the fecAcreditacionCp to set
	 */
	public void setFecAcreditacionCp(Date fecAcreditacionCp) {
		this.fecAcreditacionCp = fecAcreditacionCp;
	}


	/**
	 * @return the fecRegistroActualizado
	 */
	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado != null ? (Date) fecRegistroActualizado.clone() : null;
	}

	/**
	 * @param fecRegistroActualizado the fecRegistroActualizado to set
	 */
	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	/**
	 * @return the fecRegistroAlta
	 */
	public Date getFecRegistroAlta() {
		return fecRegistroAlta != null ? (Date) fecRegistroAlta.clone() : null;
	}

	/**
	 * @param fecRegistroAlta the fecRegistroAlta to set
	 */
	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	/**
	 * @return the fecRegistroBaja
	 */
	public Date getFecRegistroBaja() {
		return fecRegistroBaja != null ? (Date) fecRegistroBaja.clone() : null;
	}

	/**
	 * @param fecRegistroBaja the fecRegistroBaja to set
	 */
	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	/**
	 * @return the fecSolicitud
	 */
	public Date getFecSolicitud() {
		return fecSolicitud != null ? (Date) fecSolicitud.clone() : null;
	}

	/**
	 * @param fecSolicitud the fecSolicitud to set
	 */
	public void setFecSolicitud(Date fecSolicitud) {
		this.fecSolicitud = fecSolicitud;
	}

	/**
	 * @return the numTramiteNotaria
	 */
	public String getNumTramiteNotaria() {
		return numTramiteNotaria;
	}

	/**
	 * @param numTramiteNotaria the numTramiteNotaria to set
	 */
	public void setNumTramiteNotaria(String numTramiteNotaria) {
		this.numTramiteNotaria = numTramiteNotaria;
	}

	/**
	 * @return the urlAcuseNotaria
	 */
	public String getUrlAcuseNotaria() {
		return urlAcuseNotaria;
	}

	/**
	 * @param urlAcuseNotaria the urlAcuseNotaria to set
	 */
	public void setUrlAcuseNotaria(String urlAcuseNotaria) {
		this.urlAcuseNotaria = urlAcuseNotaria;
	}

	/**
	 * @return the ditTramite
	 */
	public TramiteTO getDitTramite() {
		return ditTramite;
	}

	/**
	 * @param ditTramite the ditTramite to set
	 */
	public void setDitTramite(TramiteTO ditTramite) {
		this.ditTramite = ditTramite;
	}

	/**
	 * @return the ndcColegio
	 */
	public ColegioTO getNdcColegio() {
		return ndcColegio;
	}

	/**
	 * @param ndcColegio the ndcColegio to set
	 */
	public void setNdcColegio(ColegioTO ndcColegio) {
		this.ndcColegio = ndcColegio;
	}

	/**
	 * @return the ndtContadorPublicoAut
	 */
	public ContadorPublicoTO getNdtContadorPublicoAut() {
		return ndtContadorPublicoAut;
	}

	/**
	 * @param ndtContadorPublicoAut the ndtContadorPublicoAut to set
	 */
	public void setNdtContadorPublicoAut(ContadorPublicoTO ndtContadorPublicoAut) {
		this.ndtContadorPublicoAut = ndtContadorPublicoAut;
	}	
	
	
}
