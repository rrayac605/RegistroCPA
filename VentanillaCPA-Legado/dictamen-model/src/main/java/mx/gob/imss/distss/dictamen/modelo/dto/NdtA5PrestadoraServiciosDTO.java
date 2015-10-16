package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdtA5PrestadoraServiciosDTO implements Serializable {

	private static final long serialVersionUID = 2617636591102470852L;

	private Long cveIdA5PrestadoraServicios;
	private String cveIdUsuario;
	private String desFolioSipress;
	private String desObjetoContrato;
	private Date fecConclusionContrato;
	private Date fecInicioContrato;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Long impCostoAnualNomina;
	private String indElementosPsp;
	private String indResponsableDireccion;
	private String nomNombreRazonsocialBen;
	private Long numTrabajadores;
	private String regPatronalBeneficiario;
	private String rfcBeneficiario;

	public Long getCveIdA5PrestadoraServicios() {
		return cveIdA5PrestadoraServicios;
	}

	public void setCveIdA5PrestadoraServicios(Long cveIdA5PrestadoraServicios) {
		this.cveIdA5PrestadoraServicios = cveIdA5PrestadoraServicios;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDesFolioSipress() {
		return desFolioSipress;
	}

	public void setDesFolioSipress(String desFolioSipress) {
		this.desFolioSipress = desFolioSipress;
	}

	public String getDesObjetoContrato() {
		return desObjetoContrato;
	}

	public void setDesObjetoContrato(String desObjetoContrato) {
		this.desObjetoContrato = desObjetoContrato;
	}

	public Date getFecConclusionContrato() {
		return fecConclusionContrato;
	}

	public void setFecConclusionContrato(Date fecConclusionContrato) {
		this.fecConclusionContrato = fecConclusionContrato;
	}

	public Date getFecInicioContrato() {
		return fecInicioContrato;
	}

	public void setFecInicioContrato(Date fecInicioContrato) {
		this.fecInicioContrato = fecInicioContrato;
	}

	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado;
	}

	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	public Date getFecRegistroAlta() {
		return fecRegistroAlta;
	}

	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	public Date getFecRegistroBaja() {
		return fecRegistroBaja;
	}

	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	public Long getImpCostoAnualNomina() {
		return impCostoAnualNomina;
	}

	public void setImpCostoAnualNomina(Long impCostoAnualNomina) {
		this.impCostoAnualNomina = impCostoAnualNomina;
	}

	public String getIndElementosPsp() {
		return indElementosPsp;
	}

	public void setIndElementosPsp(String indElementosPsp) {
		this.indElementosPsp = indElementosPsp;
	}

	public String getIndResponsableDireccion() {
		return indResponsableDireccion;
	}

	public void setIndResponsableDireccion(String indResponsableDireccion) {
		this.indResponsableDireccion = indResponsableDireccion;
	}

	public String getNomNombreRazonsocialBen() {
		return nomNombreRazonsocialBen;
	}

	public void setNomNombreRazonsocialBen(String nomNombreRazonsocialBen) {
		this.nomNombreRazonsocialBen = nomNombreRazonsocialBen;
	}

	public Long getNumTrabajadores() {
		return numTrabajadores;
	}

	public void setNumTrabajadores(Long numTrabajadores) {
		this.numTrabajadores = numTrabajadores;
	}

	public String getRegPatronalBeneficiario() {
		return regPatronalBeneficiario;
	}

	public void setRegPatronalBeneficiario(String regPatronalBeneficiario) {
		this.regPatronalBeneficiario = regPatronalBeneficiario;
	}

	public String getRfcBeneficiario() {
		return rfcBeneficiario;
	}

	public void setRfcBeneficiario(String rfcBeneficiario) {
		this.rfcBeneficiario = rfcBeneficiario;
	}

}
