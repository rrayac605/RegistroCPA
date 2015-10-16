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
    private AseveracionesDTO cveIdAseveracion; 
    private Date fecFechaCarga;
    private EstadoCargaDocumentoDTO cveIdEstadoCargoDoc;
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

	public Date getFecFechaCarga() {
		return fecFechaCarga;
	}
	public void setFecFechaCarga(Date fecFechaCarga) {
		this.fecFechaCarga = fecFechaCarga;
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
	/**
	 * @return the cveIdAseveracion
	 */
	public AseveracionesDTO getCveIdAseveracion() {
		return cveIdAseveracion;
	}
	/**
	 * @param cveIdAseveracion the cveIdAseveracion to set
	 */
	public void setCveIdAseveracion(AseveracionesDTO cveIdAseveracion) {
		this.cveIdAseveracion = cveIdAseveracion;
	}
	/**
	 * @return the cveIdEstadoCargoDoc
	 */
	public EstadoCargaDocumentoDTO getCveIdEstadoCargoDoc() {
		return cveIdEstadoCargoDoc;
	}
	/**
	 * @param cveIdEstadoCargoDoc the cveIdEstadoCargoDoc to set
	 */
	public void setCveIdEstadoCargoDoc(EstadoCargaDocumentoDTO cveIdEstadoCargoDoc) {
		this.cveIdEstadoCargoDoc = cveIdEstadoCargoDoc;
	}

}

