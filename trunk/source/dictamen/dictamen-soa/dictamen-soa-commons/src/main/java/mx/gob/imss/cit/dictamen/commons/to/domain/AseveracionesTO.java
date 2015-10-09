package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class AseveracionesTO extends BaseTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8568475544294582202L;
	private Long cveIdAseveracion;
	private String desTipoAseveracion;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Date fecRegistroActualizado;
	private List<AseveracionesTO> ndtCargaDocumentos;
	public Long getCveIdAseveracion() {
		return cveIdAseveracion;
	}
	public void setCveIdAseveracion(Long cveIdAseveracion) {
		this.cveIdAseveracion = cveIdAseveracion;
	}
	public String getDesTipoAseveracion() {
		return desTipoAseveracion;
	}
	public void setDesTipoAseveracion(String desTipoAseveracion) {
		this.desTipoAseveracion = desTipoAseveracion;
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
	/**
	 * @return the ndtCargaDocumentos
	 */
	public List<AseveracionesTO> getNdtCargaDocumentos() {
		return ndtCargaDocumentos;
	}
	/**
	 * @param ndtCargaDocumentos the ndtCargaDocumentos to set
	 */
	public void setNdtCargaDocumentos(List<AseveracionesTO> ndtCargaDocumentos) {
		this.ndtCargaDocumentos = ndtCargaDocumentos;
	}
	
}
