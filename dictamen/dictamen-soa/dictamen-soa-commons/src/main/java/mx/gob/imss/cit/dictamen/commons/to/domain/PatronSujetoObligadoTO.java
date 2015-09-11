package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class PatronSujetoObligadoTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4150194205696786211L;


	private long cveIdPatronSujetoObligado;


	private BigDecimal cveIdModalidad;


	private BigDecimal cveIdTipoContribModalidad;


	private BigDecimal cveIdTipoInteresado;


	private BigDecimal cveIdTipoPagoModalidad;


	private String desAfectacion;


	private String desNombreComercial;


	private String desUsosBienes;

	private Date fecRegistroActualizado;


	private Date fecRegistroAlta;


	private Date fecRegistroBaja;


	private BigDecimal indMigrDom;


	private BigDecimal indPatronConfirmado;


	private List<PatronGeneralTO> ditPatronGenerals;


	private PersonaFisicaTO ditPersonaFisica;


	private PersonaMoralTO ditPersonaMoral;


	private List<RepresentanteLegalTO> ditRepresentanteLegals;


	private List<PatronDictamenTO> ndtPatronDictamens;


	private List<R2DespachoTO> ndtR2Despachos;


	/**
	 * @return the cveIdPatronSujetoObligado
	 */
	public long getCveIdPatronSujetoObligado() {
		return cveIdPatronSujetoObligado;
	}


	/**
	 * @param cveIdPatronSujetoObligado the cveIdPatronSujetoObligado to set
	 */
	public void setCveIdPatronSujetoObligado(long cveIdPatronSujetoObligado) {
		this.cveIdPatronSujetoObligado = cveIdPatronSujetoObligado;
	}


	/**
	 * @return the cveIdModalidad
	 */
	public BigDecimal getCveIdModalidad() {
		return cveIdModalidad;
	}


	/**
	 * @param cveIdModalidad the cveIdModalidad to set
	 */
	public void setCveIdModalidad(BigDecimal cveIdModalidad) {
		this.cveIdModalidad = cveIdModalidad;
	}


	/**
	 * @return the cveIdTipoContribModalidad
	 */
	public BigDecimal getCveIdTipoContribModalidad() {
		return cveIdTipoContribModalidad;
	}


	/**
	 * @param cveIdTipoContribModalidad the cveIdTipoContribModalidad to set
	 */
	public void setCveIdTipoContribModalidad(BigDecimal cveIdTipoContribModalidad) {
		this.cveIdTipoContribModalidad = cveIdTipoContribModalidad;
	}


	/**
	 * @return the cveIdTipoInteresado
	 */
	public BigDecimal getCveIdTipoInteresado() {
		return cveIdTipoInteresado;
	}


	/**
	 * @param cveIdTipoInteresado the cveIdTipoInteresado to set
	 */
	public void setCveIdTipoInteresado(BigDecimal cveIdTipoInteresado) {
		this.cveIdTipoInteresado = cveIdTipoInteresado;
	}


	/**
	 * @return the cveIdTipoPagoModalidad
	 */
	public BigDecimal getCveIdTipoPagoModalidad() {
		return cveIdTipoPagoModalidad;
	}


	/**
	 * @param cveIdTipoPagoModalidad the cveIdTipoPagoModalidad to set
	 */
	public void setCveIdTipoPagoModalidad(BigDecimal cveIdTipoPagoModalidad) {
		this.cveIdTipoPagoModalidad = cveIdTipoPagoModalidad;
	}


	/**
	 * @return the desAfectacion
	 */
	public String getDesAfectacion() {
		return desAfectacion;
	}


	/**
	 * @param desAfectacion the desAfectacion to set
	 */
	public void setDesAfectacion(String desAfectacion) {
		this.desAfectacion = desAfectacion;
	}


	/**
	 * @return the desNombreComercial
	 */
	public String getDesNombreComercial() {
		return desNombreComercial;
	}


	/**
	 * @param desNombreComercial the desNombreComercial to set
	 */
	public void setDesNombreComercial(String desNombreComercial) {
		this.desNombreComercial = desNombreComercial;
	}


	/**
	 * @return the desUsosBienes
	 */
	public String getDesUsosBienes() {
		return desUsosBienes;
	}


	/**
	 * @param desUsosBienes the desUsosBienes to set
	 */
	public void setDesUsosBienes(String desUsosBienes) {
		this.desUsosBienes = desUsosBienes;
	}


	/**
	 * @return the fecRegistroActualizado
	 */
	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado;
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
		return fecRegistroAlta;
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
		return fecRegistroBaja;
	}


	/**
	 * @param fecRegistroBaja the fecRegistroBaja to set
	 */
	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}


	/**
	 * @return the indMigrDom
	 */
	public BigDecimal getIndMigrDom() {
		return indMigrDom;
	}


	/**
	 * @param indMigrDom the indMigrDom to set
	 */
	public void setIndMigrDom(BigDecimal indMigrDom) {
		this.indMigrDom = indMigrDom;
	}


	/**
	 * @return the indPatronConfirmado
	 */
	public BigDecimal getIndPatronConfirmado() {
		return indPatronConfirmado;
	}


	/**
	 * @param indPatronConfirmado the indPatronConfirmado to set
	 */
	public void setIndPatronConfirmado(BigDecimal indPatronConfirmado) {
		this.indPatronConfirmado = indPatronConfirmado;
	}


	/**
	 * @return the ditPatronGenerals
	 */
	public List<PatronGeneralTO> getDitPatronGenerals() {
		return ditPatronGenerals;
	}


	/**
	 * @param ditPatronGenerals the ditPatronGenerals to set
	 */
	public void setDitPatronGenerals(List<PatronGeneralTO> ditPatronGenerals) {
		this.ditPatronGenerals = ditPatronGenerals;
	}


	/**
	 * @return the ditPersonaFisica
	 */
	public PersonaFisicaTO getDitPersonaFisica() {
		return ditPersonaFisica;
	}


	/**
	 * @param ditPersonaFisica the ditPersonaFisica to set
	 */
	public void setDitPersonaFisica(PersonaFisicaTO ditPersonaFisica) {
		this.ditPersonaFisica = ditPersonaFisica;
	}


	/**
	 * @return the ditPersonaMoral
	 */
	public PersonaMoralTO getDitPersonaMoral() {
		return ditPersonaMoral;
	}


	/**
	 * @param ditPersonaMoral the ditPersonaMoral to set
	 */
	public void setDitPersonaMoral(PersonaMoralTO ditPersonaMoral) {
		this.ditPersonaMoral = ditPersonaMoral;
	}


	/**
	 * @return the ditRepresentanteLegals
	 */
	public List<RepresentanteLegalTO> getDitRepresentanteLegals() {
		return ditRepresentanteLegals;
	}


	/**
	 * @param ditRepresentanteLegals the ditRepresentanteLegals to set
	 */
	public void setDitRepresentanteLegals(
			List<RepresentanteLegalTO> ditRepresentanteLegals) {
		this.ditRepresentanteLegals = ditRepresentanteLegals;
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
	 * @return the ndtR2Despachos
	 */
	public List<R2DespachoTO> getNdtR2Despachos() {
		return ndtR2Despachos;
	}


	/**
	 * @param ndtR2Despachos the ndtR2Despachos to set
	 */
	public void setNdtR2Despachos(List<R2DespachoTO> ndtR2Despachos) {
		this.ndtR2Despachos = ndtR2Despachos;
	}

	
}
