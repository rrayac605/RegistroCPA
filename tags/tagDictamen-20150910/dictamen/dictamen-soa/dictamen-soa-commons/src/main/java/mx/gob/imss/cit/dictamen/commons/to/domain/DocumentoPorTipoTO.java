package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class DocumentoPorTipoTO extends BaseTO {


	/**
	 * 
	 */
	private static final long serialVersionUID = 7178280170590439679L;

	private long cveIdDoctoProbPorTipo;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private DocumentoTO dicDocumento;

	private TipoDocumentoProbatorioTO dicTipoDocumentoProbatorio;


	private List<DoctosProbCpaTO> ndtDoctosProbCpas;


	/**
	 * @return the cveIdDoctoProbPorTipo
	 */
	public long getCveIdDoctoProbPorTipo() {
		return cveIdDoctoProbPorTipo;
	}


	/**
	 * @param cveIdDoctoProbPorTipo the cveIdDoctoProbPorTipo to set
	 */
	public void setCveIdDoctoProbPorTipo(long cveIdDoctoProbPorTipo) {
		this.cveIdDoctoProbPorTipo = cveIdDoctoProbPorTipo;
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
	 * @return the dicDocumento
	 */
	public DocumentoTO getDicDocumento() {
		return dicDocumento;
	}


	/**
	 * @param dicDocumento the dicDocumento to set
	 */
	public void setDicDocumento(DocumentoTO dicDocumento) {
		this.dicDocumento = dicDocumento;
	}


	/**
	 * @return the dicTipoDocumentoProbatorio
	 */
	public TipoDocumentoProbatorioTO getDicTipoDocumentoProbatorio() {
		return dicTipoDocumentoProbatorio;
	}


	/**
	 * @param dicTipoDocumentoProbatorio the dicTipoDocumentoProbatorio to set
	 */
	public void setDicTipoDocumentoProbatorio(
			TipoDocumentoProbatorioTO dicTipoDocumentoProbatorio) {
		this.dicTipoDocumentoProbatorio = dicTipoDocumentoProbatorio;
	}


	/**
	 * @return the ndtDoctosProbCpas
	 */
	public List<DoctosProbCpaTO> getNdtDoctosProbCpas() {
		return ndtDoctosProbCpas;
	}


	/**
	 * @param ndtDoctosProbCpas the ndtDoctosProbCpas to set
	 */
	public void setNdtDoctosProbCpas(List<DoctosProbCpaTO> ndtDoctosProbCpas) {
		this.ndtDoctosProbCpas = ndtDoctosProbCpas;
	}



}
