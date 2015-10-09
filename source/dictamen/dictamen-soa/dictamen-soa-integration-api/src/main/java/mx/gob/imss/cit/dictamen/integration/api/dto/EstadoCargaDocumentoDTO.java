package mx.gob.imss.cit.dictamen.integration.api.dto;

import mx.gob.imss.cit.dictamen.integration.api.dto.base.BaseDTO;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class EstadoCargaDocumentoDTO  extends BaseDTO{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1791293925243000471L;
	private Long cveIdEstadoCargoDoc;
	private String desStatusCargaAseveraciones;
	

	/**
	 * @return the cveIdEstadoCargoDoc
	 */
	public Long getCveIdEstadoCargoDoc() {
		return cveIdEstadoCargoDoc;
	}

	/**
	 * @param cveIdEstadoCargoDoc the cveIdEstadoCargoDoc to set
	 */
	public void setCveIdEstadoCargoDoc(Long cveIdEstadoCargoDoc) {
		this.cveIdEstadoCargoDoc = cveIdEstadoCargoDoc;
	}

	/**
	 * @return the desStatusCargaAseveraciones
	 */
	public String getDesStatusCargaAseveraciones() {
		return desStatusCargaAseveraciones;
	}

	/**
	 * @param desStatusCargaAseveraciones the desStatusCargaAseveraciones to set
	 */
	public void setDesStatusCargaAseveraciones(
			String desStatusCargaAseveraciones) {
		this.desStatusCargaAseveraciones = desStatusCargaAseveraciones;
	}
	
}

