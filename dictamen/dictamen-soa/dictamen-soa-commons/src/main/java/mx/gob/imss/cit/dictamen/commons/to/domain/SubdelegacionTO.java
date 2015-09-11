package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class SubdelegacionTO extends BaseTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5308289857895039649L;

	private long cveIdSubdelegacion;

	private String anioIniOper;

	private String claveSubdelegacion;

	private String desSubdelegacion;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private DomicilioGeograficoTO dgDomicilioGeografico;

	private DelegacionTO dicDelegacion;

	private List<SolicitudTO> ditSolicituds;

	private List<PatronDictamenTO> ndtPatronDictamens;

	private List<R1DatosPersonaleTO> ndtR1DatosPersonales;

	private List<R1DomFiscalTO> ndtR1DomFiscals;

	/**
	 * @return the cveIdSubdelegacion
	 */
	public long getCveIdSubdelegacion() {
		return cveIdSubdelegacion;
	}

	/**
	 * @param cveIdSubdelegacion the cveIdSubdelegacion to set
	 */
	public void setCveIdSubdelegacion(long cveIdSubdelegacion) {
		this.cveIdSubdelegacion = cveIdSubdelegacion;
	}

	/**
	 * @return the anioIniOper
	 */
	public String getAnioIniOper() {
		return anioIniOper;
	}

	/**
	 * @param anioIniOper the anioIniOper to set
	 */
	public void setAnioIniOper(String anioIniOper) {
		this.anioIniOper = anioIniOper;
	}

	/**
	 * @return the claveSubdelegacion
	 */
	public String getClaveSubdelegacion() {
		return claveSubdelegacion;
	}

	/**
	 * @param claveSubdelegacion the claveSubdelegacion to set
	 */
	public void setClaveSubdelegacion(String claveSubdelegacion) {
		this.claveSubdelegacion = claveSubdelegacion;
	}

	/**
	 * @return the desSubdelegacion
	 */
	public String getDesSubdelegacion() {
		return desSubdelegacion;
	}

	/**
	 * @param desSubdelegacion the desSubdelegacion to set
	 */
	public void setDesSubdelegacion(String desSubdelegacion) {
		this.desSubdelegacion = desSubdelegacion;
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
	 * @return the dgDomicilioGeografico
	 */
	public DomicilioGeograficoTO getDgDomicilioGeografico() {
		return dgDomicilioGeografico;
	}

	/**
	 * @param dgDomicilioGeografico the dgDomicilioGeografico to set
	 */
	public void setDgDomicilioGeografico(DomicilioGeograficoTO dgDomicilioGeografico) {
		this.dgDomicilioGeografico = dgDomicilioGeografico;
	}

	/**
	 * @return the dicDelegacion
	 */
	public DelegacionTO getDicDelegacion() {
		return dicDelegacion;
	}

	/**
	 * @param dicDelegacion the dicDelegacion to set
	 */
	public void setDicDelegacion(DelegacionTO dicDelegacion) {
		this.dicDelegacion = dicDelegacion;
	}

	/**
	 * @return the ditSolicituds
	 */
	public List<SolicitudTO> getDitSolicituds() {
		return ditSolicituds;
	}

	/**
	 * @param ditSolicituds the ditSolicituds to set
	 */
	public void setDitSolicituds(List<SolicitudTO> ditSolicituds) {
		this.ditSolicituds = ditSolicituds;
	}

	/**
	 * @return the ndtPatronDictamens
	 */
	public List<PatronDictamenTO> getNdtPatronDictamens() {
		return ndtPatronDictamens;
	}

	/**
	 * @param ndtPatronDictamens the ndtPatronDictamens to set
	 */
	public void setNdtPatronDictamens(List<PatronDictamenTO> ndtPatronDictamens) {
		this.ndtPatronDictamens = ndtPatronDictamens;
	}

	/**
	 * @return the ndtR1DatosPersonales
	 */
	public List<R1DatosPersonaleTO> getNdtR1DatosPersonales() {
		return ndtR1DatosPersonales;
	}

	/**
	 * @param ndtR1DatosPersonales the ndtR1DatosPersonales to set
	 */
	public void setNdtR1DatosPersonales(
			List<R1DatosPersonaleTO> ndtR1DatosPersonales) {
		this.ndtR1DatosPersonales = ndtR1DatosPersonales;
	}

	/**
	 * @return the ndtR1DomFiscals
	 */
	public List<R1DomFiscalTO> getNdtR1DomFiscals() {
		return ndtR1DomFiscals;
	}

	/**
	 * @param ndtR1DomFiscals the ndtR1DomFiscals to set
	 */
	public void setNdtR1DomFiscals(List<R1DomFiscalTO> ndtR1DomFiscals) {
		this.ndtR1DomFiscals = ndtR1DomFiscals;
	}

	
}
