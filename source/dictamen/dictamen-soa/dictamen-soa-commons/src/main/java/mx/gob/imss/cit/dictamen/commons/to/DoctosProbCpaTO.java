package mx.gob.imss.cit.dictamen.commons.to;

import java.util.Date;

public class DoctosProbCpaTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7315171758832361394L;

	private long cveIdDoctosProbCpa;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private byte[] refDocumentoDigitalizado;

	private DocumentoPorTipoTO ditDocumentoPorTipo;

	private RegBajaReactivTO ndtRegBajaReactiv;

	/**
	 * @return the cveIdDoctosProbCpa
	 */
	public long getCveIdDoctosProbCpa() {
		return cveIdDoctosProbCpa;
	}

	/**
	 * @param cveIdDoctosProbCpa the cveIdDoctosProbCpa to set
	 */
	public void setCveIdDoctosProbCpa(long cveIdDoctosProbCpa) {
		this.cveIdDoctosProbCpa = cveIdDoctosProbCpa;
	}


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
	 * @return the refDocumentoDigitalizado
	 */
	public byte[] getRefDocumentoDigitalizado() {
		return refDocumentoDigitalizado;
	}

	/**
	 * @param refDocumentoDigitalizado the refDocumentoDigitalizado to set
	 */
	public void setRefDocumentoDigitalizado(byte[] refDocumentoDigitalizado) {
		this.refDocumentoDigitalizado = refDocumentoDigitalizado;
	}

	/**
	 * @return the ditDocumentoPorTipo
	 */
	public DocumentoPorTipoTO getDitDocumentoPorTipo() {
		return ditDocumentoPorTipo;
	}

	/**
	 * @param ditDocumentoPorTipo the ditDocumentoPorTipo to set
	 */
	public void setDitDocumentoPorTipo(DocumentoPorTipoTO ditDocumentoPorTipo) {
		this.ditDocumentoPorTipo = ditDocumentoPorTipo;
	}

	/**
	 * @return the ndtRegBajaReactiv
	 */
	public RegBajaReactivTO getNdtRegBajaReactiv() {
		return ndtRegBajaReactiv;
	}

	/**
	 * @param ndtRegBajaReactiv the ndtRegBajaReactiv to set
	 */
	public void setNdtRegBajaReactiv(RegBajaReactivTO ndtRegBajaReactiv) {
		this.ndtRegBajaReactiv = ndtRegBajaReactiv;
	}

	
	
}
