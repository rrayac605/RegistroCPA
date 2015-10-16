package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdtA71CeProcesoDTO implements Serializable {

	private static final long serialVersionUID = 8765887986140422599L;

	private Long cveIdA71CeProceso;
	private String cveIdUsuario;
	private String desProcesoFinalXct;
	private String desProcesoInicialXct;
	private String desProcesoIntermedioXct;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private String regPatronal;

	public Long getCveIdA71CeProceso() {
		return cveIdA71CeProceso;
	}

	public void setCveIdA71CeProceso(Long cveIdA71CeProceso) {
		this.cveIdA71CeProceso = cveIdA71CeProceso;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDesProcesoFinalXct() {
		return desProcesoFinalXct;
	}

	public void setDesProcesoFinalXct(String desProcesoFinalXct) {
		this.desProcesoFinalXct = desProcesoFinalXct;
	}

	public String getDesProcesoInicialXct() {
		return desProcesoInicialXct;
	}

	public void setDesProcesoInicialXct(String desProcesoInicialXct) {
		this.desProcesoInicialXct = desProcesoInicialXct;
	}

	public String getDesProcesoIntermedioXct() {
		return desProcesoIntermedioXct;
	}

	public void setDesProcesoIntermedioXct(String desProcesoIntermedioXct) {
		this.desProcesoIntermedioXct = desProcesoIntermedioXct;
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

	public String getRegPatronal() {
		return regPatronal;
	}

	public void setRegPatronal(String regPatronal) {
		this.regPatronal = regPatronal;
	}

}
