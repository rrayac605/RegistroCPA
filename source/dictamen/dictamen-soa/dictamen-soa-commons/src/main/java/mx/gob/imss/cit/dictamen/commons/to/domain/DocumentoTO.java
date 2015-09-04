package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class DocumentoTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5353305976181213702L;

	private long cveIdDocumento;

	private String desDocumento;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;
	
	private List<DocumentoPorTipoTO> ditDocumentoPorTipos;

	/**
	 * @return the cveIdDocumento
	 */
	public long getCveIdDocumento() {
		return cveIdDocumento;
	}

	/**
	 * @param cveIdDocumento the cveIdDocumento to set
	 */
	public void setCveIdDocumento(long cveIdDocumento) {
		this.cveIdDocumento = cveIdDocumento;
	}

	/**
	 * @return the desDocumento
	 */
	public String getDesDocumento() {
		return desDocumento;
	}

	/**
	 * @param desDocumento the desDocumento to set
	 */
	public void setDesDocumento(String desDocumento) {
		this.desDocumento = desDocumento;
	}

	/**


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
	 * @return the ditDocumentoPorTipos
	 */
	public List<DocumentoPorTipoTO> getDitDocumentoPorTipos() {
		return ditDocumentoPorTipos;
	}

	/**
	 * @param ditDocumentoPorTipos the ditDocumentoPorTipos to set
	 */
	public void setDitDocumentoPorTipos(
			List<DocumentoPorTipoTO> ditDocumentoPorTipos) {
		this.ditDocumentoPorTipos = ditDocumentoPorTipos;
	}

	
	
	
}
