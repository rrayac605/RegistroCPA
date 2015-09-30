package mx.gob.imss.cit.dictamen.integration.api.dto;

import java.util.Date;

import mx.gob.imss.cit.dictamen.integration.api.dto.base.BaseDTO;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class CargaDocumentoDTO extends BaseDTO{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2440312503048372155L;
	private Long cveIdBitacoraCargaAsev;
    private Long cveIdPatronDictamen;   
    private Integer cveIdAseveracion;
    private Date fecFechaCarga;
    private EstadoCargaDocumentoDTO cveIdStatusCarga;
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
	public Long getCveIdPatronDictamen() {
		return cveIdPatronDictamen;
	}
	public void setCveIdPatronDictamen(Long cveIdPatronDictamen) {
		this.cveIdPatronDictamen = cveIdPatronDictamen;
	}
	public Integer getCveIdAseveracion() {
		return cveIdAseveracion;
	}
	public void setCveIdAseveracion(Integer cveIdAseveracion) {
		this.cveIdAseveracion = cveIdAseveracion;
	}
	public Date getFecFechaCarga() {
		return fecFechaCarga;
	}
	public void setFecFechaCarga(Date fecFechaCarga) {
		this.fecFechaCarga = fecFechaCarga;
	}
	public EstadoCargaDocumentoDTO getCveIdStatusCarga() {
		return cveIdStatusCarga;
	}
	public void setCveIdStatusCarga(EstadoCargaDocumentoDTO cveIdStatusCarga) {
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
}

