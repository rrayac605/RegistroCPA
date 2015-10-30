package mx.gob.imss.cit.de.dictaminacion.commons.to.domain;

import mx.gob.imss.cit.de.dictaminacion.commons.to.base.BaseTO;

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

