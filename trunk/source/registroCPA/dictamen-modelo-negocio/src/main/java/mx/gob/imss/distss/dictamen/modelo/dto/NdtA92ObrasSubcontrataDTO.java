package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdtA92ObrasSubcontrataDTO implements Serializable {

	private static final long serialVersionUID = 4658132679629839267L;

	private Long cveIdA92ObrasSubcontrata;
	private String cveIdUsuario;
	private String desFaseConstruccion;
	private Date fecAlEjecucion;
	private Date fecDelEjecucion;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Long impContratado;
	private String nomNombreRazonsocial;
	private String numRegObraImss;
	private String numRegObraImssSubcontra;
	private Long numSuperficieM2;
	private Long numTrabajadoresParticipantes;
	private String regPatronal;
	private String rfc;

	public Long getCveIdA92ObrasSubcontrata() {
		return cveIdA92ObrasSubcontrata;
	}

	public void setCveIdA92ObrasSubcontrata(Long cveIdA92ObrasSubcontrata) {
		this.cveIdA92ObrasSubcontrata = cveIdA92ObrasSubcontrata;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDesFaseConstruccion() {
		return desFaseConstruccion;
	}

	public void setDesFaseConstruccion(String desFaseConstruccion) {
		this.desFaseConstruccion = desFaseConstruccion;
	}

	public Date getFecAlEjecucion() {
		return fecAlEjecucion;
	}

	public void setFecAlEjecucion(Date fecAlEjecucion) {
		this.fecAlEjecucion = fecAlEjecucion;
	}

	public Date getFecDelEjecucion() {
		return fecDelEjecucion;
	}

	public void setFecDelEjecucion(Date fecDelEjecucion) {
		this.fecDelEjecucion = fecDelEjecucion;
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

	public Long getImpContratado() {
		return impContratado;
	}

	public void setImpContratado(Long impContratado) {
		this.impContratado = impContratado;
	}

	public String getNomNombreRazonsocial() {
		return nomNombreRazonsocial;
	}

	public void setNomNombreRazonsocial(String nomNombreRazonsocial) {
		this.nomNombreRazonsocial = nomNombreRazonsocial;
	}

	public String getNumRegObraImss() {
		return numRegObraImss;
	}

	public void setNumRegObraImss(String numRegObraImss) {
		this.numRegObraImss = numRegObraImss;
	}

	public String getNumRegObraImssSubcontra() {
		return numRegObraImssSubcontra;
	}

	public void setNumRegObraImssSubcontra(String numRegObraImssSubcontra) {
		this.numRegObraImssSubcontra = numRegObraImssSubcontra;
	}

	public Long getNumSuperficieM2() {
		return numSuperficieM2;
	}

	public void setNumSuperficieM2(Long numSuperficieM2) {
		this.numSuperficieM2 = numSuperficieM2;
	}

	public Long getNumTrabajadoresParticipantes() {
		return numTrabajadoresParticipantes;
	}

	public void setNumTrabajadoresParticipantes(
			Long numTrabajadoresParticipantes) {
		this.numTrabajadoresParticipantes = numTrabajadoresParticipantes;
	}

	public String getRegPatronal() {
		return regPatronal;
	}

	public void setRegPatronal(String regPatronal) {
		this.regPatronal = regPatronal;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

}
