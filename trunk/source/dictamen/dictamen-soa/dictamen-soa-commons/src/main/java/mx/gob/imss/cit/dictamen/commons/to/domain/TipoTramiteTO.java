package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class TipoTramiteTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2984740050079788172L;

	private long cveIdTipoTramite;

	private String desTipoTramite;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private byte[] refGuiaDetallada;

	private byte[] refGuiaRapida;

	private String refSigla;

	private BigDecimal tipTipoConclusion;

	private BigDecimal tipTipoTramite;

	private List<ModuloTO> dicModulos;

	private List<TramiteTO> ditTramites;

	/**
	 * @return the cveIdTipoTramite
	 */
	public long getCveIdTipoTramite() {
		return cveIdTipoTramite;
	}

	/**
	 * @param cveIdTipoTramite the cveIdTipoTramite to set
	 */
	public void setCveIdTipoTramite(long cveIdTipoTramite) {
		this.cveIdTipoTramite = cveIdTipoTramite;
	}

	/**
	 * @return the desTipoTramite
	 */
	public String getDesTipoTramite() {
		return desTipoTramite;
	}

	/**
	 * @param desTipoTramite the desTipoTramite to set
	 */
	public void setDesTipoTramite(String desTipoTramite) {
		this.desTipoTramite = desTipoTramite;
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
	 * @return the refGuiaDetallada
	 */
	public byte[] getRefGuiaDetallada() {
		return refGuiaDetallada;
	}

	/**
	 * @param refGuiaDetallada the refGuiaDetallada to set
	 */
	public void setRefGuiaDetallada(byte[] refGuiaDetallada) {
		this.refGuiaDetallada = refGuiaDetallada;
	}

	/**
	 * @return the refGuiaRapida
	 */
	public byte[] getRefGuiaRapida() {
		return refGuiaRapida;
	}

	/**
	 * @param refGuiaRapida the refGuiaRapida to set
	 */
	public void setRefGuiaRapida(byte[] refGuiaRapida) {
		this.refGuiaRapida = refGuiaRapida;
	}

	/**
	 * @return the refSigla
	 */
	public String getRefSigla() {
		return refSigla;
	}

	/**
	 * @param refSigla the refSigla to set
	 */
	public void setRefSigla(String refSigla) {
		this.refSigla = refSigla;
	}

	/**
	 * @return the tipTipoConclusion
	 */
	public BigDecimal getTipTipoConclusion() {
		return tipTipoConclusion;
	}

	/**
	 * @param tipTipoConclusion the tipTipoConclusion to set
	 */
	public void setTipTipoConclusion(BigDecimal tipTipoConclusion) {
		this.tipTipoConclusion = tipTipoConclusion;
	}

	/**
	 * @return the tipTipoTramite
	 */
	public BigDecimal getTipTipoTramite() {
		return tipTipoTramite;
	}

	/**
	 * @param tipTipoTramite the tipTipoTramite to set
	 */
	public void setTipTipoTramite(BigDecimal tipTipoTramite) {
		this.tipTipoTramite = tipTipoTramite;
	}

	/**
	 * @return the dicModulos
	 */
	public List<ModuloTO> getDicModulos() {
		return dicModulos;
	}

	/**
	 * @param dicModulos the dicModulos to set
	 */
	public void setDicModulos(List<ModuloTO> dicModulos) {
		this.dicModulos = dicModulos;
	}

	/**
	 * @return the ditTramites
	 */
	public List<TramiteTO> getDitTramites() {
		return ditTramites;
	}

	/**
	 * @param ditTramites the ditTramites to set
	 */
	public void setDitTramites(List<TramiteTO> ditTramites) {
		this.ditTramites = ditTramites;
	}



}
