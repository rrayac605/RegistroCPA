package mx.gob.imss.cit.dictamen.commons.to;

import java.util.Date;

public class R1DatosPersonaleTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2596094260035622446L;

	private long cveIdR1DatosPersonales;

	private String cedulaProfesional;

	private String cveIdUsuario;

	private String desTituloExpedidoPor;

	private Date fecExpedicionCedprof;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private Date fecSolicitudR1;

	private String numTramiteNotaria;

	private String urlAcuseNotaria;

	private SubdelegacionTO dicSubdelegacion;

	private TramiteTO ditTramite;

	private ContadorPublicoTO ndtContadorPublicoAut;

	/**
	 * @return the cveIdR1DatosPersonales
	 */
	public long getCveIdR1DatosPersonales() {
		return cveIdR1DatosPersonales;
	}

	/**
	 * @param cveIdR1DatosPersonales the cveIdR1DatosPersonales to set
	 */
	public void setCveIdR1DatosPersonales(long cveIdR1DatosPersonales) {
		this.cveIdR1DatosPersonales = cveIdR1DatosPersonales;
	}

	/**
	 * @return the cedulaProfesional
	 */
	public String getCedulaProfesional() {
		return cedulaProfesional;
	}

	/**
	 * @param cedulaProfesional the cedulaProfesional to set
	 */
	public void setCedulaProfesional(String cedulaProfesional) {
		this.cedulaProfesional = cedulaProfesional;
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
	 * @return the desTituloExpedidoPor
	 */
	public String getDesTituloExpedidoPor() {
		return desTituloExpedidoPor;
	}

	/**
	 * @param desTituloExpedidoPor the desTituloExpedidoPor to set
	 */
	public void setDesTituloExpedidoPor(String desTituloExpedidoPor) {
		this.desTituloExpedidoPor = desTituloExpedidoPor;
	}

	/**
	 * @return the fecExpedicionCedprof
	 */
	public Date getFecExpedicionCedprof() {
		return fecExpedicionCedprof != null ? (Date) fecExpedicionCedprof.clone() : null;
	}

	/**
	 * @param fecExpedicionCedprof the fecExpedicionCedprof to set
	 */
	public void setFecExpedicionCedprof(Date fecExpedicionCedprof) {
		this.fecExpedicionCedprof = fecExpedicionCedprof;
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
	 * @return the fecSolicitudR1
	 */
	public Date getFecSolicitudR1() {
		return fecSolicitudR1 != null ? (Date) fecSolicitudR1.clone() : null;		
	}

	/**
	 * @param fecSolicitudR1 the fecSolicitudR1 to set
	 */
	public void setFecSolicitudR1(Date fecSolicitudR1) {
		this.fecSolicitudR1 = fecSolicitudR1;
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
	 * @return the dicSubdelegacion
	 */
	public SubdelegacionTO getDicSubdelegacion() {
		return dicSubdelegacion;
	}

	/**
	 * @param dicSubdelegacion the dicSubdelegacion to set
	 */
	public void setDicSubdelegacion(SubdelegacionTO dicSubdelegacion) {
		this.dicSubdelegacion = dicSubdelegacion;
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
