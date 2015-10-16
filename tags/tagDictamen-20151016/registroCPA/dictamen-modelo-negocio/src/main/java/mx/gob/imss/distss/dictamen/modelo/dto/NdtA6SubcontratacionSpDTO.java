package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdtA6SubcontratacionSpDTO implements Serializable {

	private static final long serialVersionUID = 1152048379863008176L;

	private Long cveIdA6SubcontratacionSp;
	private String cveIdUsuario;
	private String desFolioSipress;
	private String desObjetoContratoPsp;
	private Date fecConclusionContrato;
	private Date fecInicioContrato;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private String indElementosPsp;
	private String indResponsableDireccion;
	private String nomNombreRazonsocialPsp;
	private Long numTrabajadores;
	private String regPatronalPsp;
	private String rfcPsp;

	public Long getCveIdA6SubcontratacionSp() {
		return cveIdA6SubcontratacionSp;
	}

	public void setCveIdA6SubcontratacionSp(Long cveIdA6SubcontratacionSp) {
		this.cveIdA6SubcontratacionSp = cveIdA6SubcontratacionSp;
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

	public String getDesObjetoContratoPsp() {
		return desObjetoContratoPsp;
	}

	public void setDesObjetoContratoPsp(String desObjetoContratoPsp) {
		this.desObjetoContratoPsp = desObjetoContratoPsp;
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

	public String getNomNombreRazonsocialPsp() {
		return nomNombreRazonsocialPsp;
	}

	public void setNomNombreRazonsocialPsp(String nomNombreRazonsocialPsp) {
		this.nomNombreRazonsocialPsp = nomNombreRazonsocialPsp;
	}

	public Long getNumTrabajadores() {
		return numTrabajadores;
	}

	public void setNumTrabajadores(Long numTrabajadores) {
		this.numTrabajadores = numTrabajadores;
	}

	public String getRegPatronalPsp() {
		return regPatronalPsp;
	}

	public void setRegPatronalPsp(String regPatronalPsp) {
		this.regPatronalPsp = regPatronalPsp;
	}

	public String getRfcPsp() {
		return rfcPsp;
	}

	public void setRfcPsp(String rfcPsp) {
		this.rfcPsp = rfcPsp;
	}

}
