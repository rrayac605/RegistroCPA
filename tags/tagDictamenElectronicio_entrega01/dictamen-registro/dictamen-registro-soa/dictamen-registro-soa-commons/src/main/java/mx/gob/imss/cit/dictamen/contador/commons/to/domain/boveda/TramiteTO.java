package mx.gob.imss.cit.dictamen.contador.commons.to.domain.boveda;

import java.io.Serializable;

public class TramiteTO  implements Serializable {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 7483121074265556434L;
	/**
	 * Org
	 */
	private String org;
	/**
	 * Zona
	 */
	private String zona;
	/**
	 * Tipo de tramite
	 */
	private String tramite;
	/**
	 * Fecha
	 */
	private String fecha;
	/**
	 * Folio
	 */
	private String folio;
	/**
	 * Actor
	 */
	private String actor;

	/**
	 * @return the org
	 */
	public String getOrg() {
		return org;
	}

	/**
	 * @param org
	 *            the org to set
	 */
	public void setOrg(String org) {
		this.org = org;
	}

	/**
	 * @return the zona
	 */
	public String getZona() {
		return zona;
	}

	/**
	 * @param zona
	 *            the zona to set
	 */
	public void setZona(String zona) {
		this.zona = zona;
	}

	/**
	 * @return the tramite
	 */
	public String getTramite() {
		return tramite;
	}

	/**
	 * @param tramite
	 *            the tramite to set
	 */
	public void setTramite(String tramite) {
		this.tramite = tramite;
	}

	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @param fecha
	 *            the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the folio
	 */
	public String getFolio() {
		return folio;
	}

	/**
	 * @param folio
	 *            the folio to set
	 */
	public void setFolio(String folio) {
		this.folio = folio;
	}

	/**
	 * @return the actores
	 */
	public String getActor() {
		return actor;
	}

	/**
	 * @param actores
	 *            the actores to set
	 */
	public void setActor(String actores) {
		this.actor = actores;
	}

}

