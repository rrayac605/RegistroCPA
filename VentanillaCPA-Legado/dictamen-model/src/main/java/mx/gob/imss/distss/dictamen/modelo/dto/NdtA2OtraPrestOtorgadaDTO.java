package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdtA2OtraPrestOtorgadaDTO implements Serializable {

	private static final long serialVersionUID = 2263213337297995249L;

	private Long cveIdA2Otraspresotorgadas;
	private String cveIdUsuario;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Long impAlimentacion;
	private Long impAportacionAdicionalRcv;
	private Long impCuotaObrera;
	private Long impCuotaPatronalInfonavit;
	private Long impFondoPensiones;
	private Long impGastosPrevisionSocial;
	private Long impHabitacion;
	private Long impInstrumentosTrabajo;
	private Long impOtrasPrestaciones;
	private Long impTotal;

	public Long getCveIdA2Otraspresotorgadas() {
		return cveIdA2Otraspresotorgadas;
	}

	public void setCveIdA2Otraspresotorgadas(Long cveIdA2Otraspresotorgadas) {
		this.cveIdA2Otraspresotorgadas = cveIdA2Otraspresotorgadas;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
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

	public Long getImpAlimentacion() {
		return impAlimentacion;
	}

	public void setImpAlimentacion(Long impAlimentacion) {
		this.impAlimentacion = impAlimentacion;
	}

	public Long getImpAportacionAdicionalRcv() {
		return impAportacionAdicionalRcv;
	}

	public void setImpAportacionAdicionalRcv(Long impAportacionAdicionalRcv) {
		this.impAportacionAdicionalRcv = impAportacionAdicionalRcv;
	}

	public Long getImpCuotaObrera() {
		return impCuotaObrera;
	}

	public void setImpCuotaObrera(Long impCuotaObrera) {
		this.impCuotaObrera = impCuotaObrera;
	}

	public Long getImpCuotaPatronalInfonavit() {
		return impCuotaPatronalInfonavit;
	}

	public void setImpCuotaPatronalInfonavit(Long impCuotaPatronalInfonavit) {
		this.impCuotaPatronalInfonavit = impCuotaPatronalInfonavit;
	}

	public Long getImpFondoPensiones() {
		return impFondoPensiones;
	}

	public void setImpFondoPensiones(Long impFondoPensiones) {
		this.impFondoPensiones = impFondoPensiones;
	}

	public Long getImpGastosPrevisionSocial() {
		return impGastosPrevisionSocial;
	}

	public void setImpGastosPrevisionSocial(Long impGastosPrevisionSocial) {
		this.impGastosPrevisionSocial = impGastosPrevisionSocial;
	}

	public Long getImpHabitacion() {
		return impHabitacion;
	}

	public void setImpHabitacion(Long impHabitacion) {
		this.impHabitacion = impHabitacion;
	}

	public Long getImpInstrumentosTrabajo() {
		return impInstrumentosTrabajo;
	}

	public void setImpInstrumentosTrabajo(Long impInstrumentosTrabajo) {
		this.impInstrumentosTrabajo = impInstrumentosTrabajo;
	}

	public Long getImpOtrasPrestaciones() {
		return impOtrasPrestaciones;
	}

	public void setImpOtrasPrestaciones(Long impOtrasPrestaciones) {
		this.impOtrasPrestaciones = impOtrasPrestaciones;
	}

	public Long getImpTotal() {
		return impTotal;
	}

	public void setImpTotal(Long impTotal) {
		this.impTotal = impTotal;
	}

}
