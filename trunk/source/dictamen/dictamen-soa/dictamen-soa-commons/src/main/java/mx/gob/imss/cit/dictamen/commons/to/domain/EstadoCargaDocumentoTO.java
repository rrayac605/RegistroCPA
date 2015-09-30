package mx.gob.imss.cit.dictamen.commons.to.domain;

import mx.gob.imss.cit.dictamen.commons.enums.EstadoCargaDocumentoEnum;
import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class EstadoCargaDocumentoTO extends BaseTO{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8136616077473296323L;
	private int cveIdStatusCarga;

	public int getCveIdStatusCarga() {
		return cveIdStatusCarga;
	}

	public void setCveIdStatusCarga(EstadoCargaDocumentoEnum estatus) {
		this.cveIdStatusCarga = estatus.getId();
	}
	
}

