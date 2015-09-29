package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class CargaAseveracionesTO extends BaseTO{
    /**
	 * 
	 */
	private static final long serialVersionUID = -1168040479090090867L;
	private Long cveIdBitacoraCargaAsev;
    private PatronDictamenTO cveIdPatronDictamen;   
    private AseveracionesTO cveIdAseveracion;
    private TipoDocumentoTO cveIdTipoDocumento;
    private Date fecFechaCarga;
    private StatusCargaAseveracionesTO cveIdStatusCarga;
    private Date fecRegistroAlta;
    private Date fecRegistroBaja;
    private Date fecRegistroActualizado;
    private String cveIdUsuario;    
    
	public Long getCveIdBitacoraCargaAsev() {
		return cveIdBitacoraCargaAsev;
	}
	public void setCveIdBitacoraCargaAsev(Long cveIdBitacoraCargaAsev) {
		this.cveIdBitacoraCargaAsev = cveIdBitacoraCargaAsev;
	}
	public PatronDictamenTO getCveIdPatronDictamen() {
		return cveIdPatronDictamen;
	}
	public void setCveIdPatronDictamen(PatronDictamenTO cveIdPatronDictamen) {
		this.cveIdPatronDictamen = cveIdPatronDictamen;
	}
	public AseveracionesTO getCveIdAseveracion() {
		return cveIdAseveracion;
	}
	public void setCveIdAseveracion(AseveracionesTO cveIdAseveracion) {
		this.cveIdAseveracion = cveIdAseveracion;
	}
	public Date getFecFechaCarga() {
		return fecFechaCarga;
	}
	public void setFecFechaCarga(Date fecFechaCarga) {
		this.fecFechaCarga = fecFechaCarga;
	}
	public StatusCargaAseveracionesTO getCveIdStatusCarga() {
		return cveIdStatusCarga;
	}
	public void setCveIdStatusCarga(StatusCargaAseveracionesTO cveIdStatusCarga) {
		this.cveIdStatusCarga = cveIdStatusCarga;
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
	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado;
	}
	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}
	public String getCveIdUsuario() {
		return cveIdUsuario;
	}
	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}
	public TipoDocumentoTO getCveIdTipoDocumento() {
		return cveIdTipoDocumento;
	}
	public void setCveIdTipoDocumento(TipoDocumentoTO cveIdTipoDocumento) {
		this.cveIdTipoDocumento = cveIdTipoDocumento;
	}
	
}

