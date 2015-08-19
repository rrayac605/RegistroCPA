package mx.gob.imss.cit.dictamen.commons.to;

import java.util.Date;
import java.util.List;

public class TipoDocumentoProbatorioTO extends BaseTO {


	/**
	 * 
	 */
	private static final long serialVersionUID = 6659749025370724008L;

	private long cveIdTipoDocumentoProbator;

	private String desTipoDocumentoProbatorio;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private List<DocumentoPorTipoTO> ditDocumentoPorTipos;

	/**
	 * @return the cveIdTipoDocumentoProbator
	 */
	public long getCveIdTipoDocumentoProbator() {
		return cveIdTipoDocumentoProbator;
	}

	/**
	 * @param cveIdTipoDocumentoProbator the cveIdTipoDocumentoProbator to set
	 */
	public void setCveIdTipoDocumentoProbator(long cveIdTipoDocumentoProbator) {
		this.cveIdTipoDocumentoProbator = cveIdTipoDocumentoProbator;
	}

	/**
	 * @return the desTipoDocumentoProbatorio
	 */
	public String getDesTipoDocumentoProbatorio() {
		return desTipoDocumentoProbatorio;
	}

	/**
	 * @param desTipoDocumentoProbatorio the desTipoDocumentoProbatorio to set
	 */
	public void setDesTipoDocumentoProbatorio(String desTipoDocumentoProbatorio) {
		this.desTipoDocumentoProbatorio = desTipoDocumentoProbatorio;
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
