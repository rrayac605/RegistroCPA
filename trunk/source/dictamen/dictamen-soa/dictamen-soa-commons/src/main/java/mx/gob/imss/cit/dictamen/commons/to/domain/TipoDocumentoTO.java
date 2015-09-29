package mx.gob.imss.cit.dictamen.commons.to.domain;

import mx.gob.imss.cit.dictamen.commons.enums.TipoDocumentoEnum;
import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class TipoDocumentoTO extends BaseTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3211260553745848242L;
	private Long cveIdTipoDocumento;
	
	public Long getCveIdTipoDocumento() {
		return cveIdTipoDocumento;
	}
	public void setCveIdTipoDocumento(TipoDocumentoEnum cveIdTipoDocumento) {
		this.cveIdTipoDocumento = cveIdTipoDocumento.getId();
	}
	
}

