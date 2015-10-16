package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdtA72CeBienDTO implements Serializable {

	private static final long serialVersionUID = -5734411456789110689L;

	private Long cveIdA72CeBien;
	private String cveIdUsuario;
	private String desBienElaboradoSp;
	private String desMateriaPrimaUtilizada;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private String regPatronal;

	public Long getCveIdA72CeBien() {
		return cveIdA72CeBien;
	}

	public void setCveIdA72CeBien(Long cveIdA72CeBien) {
		this.cveIdA72CeBien = cveIdA72CeBien;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDesBienElaboradoSp() {
		return desBienElaboradoSp;
	}

	public void setDesBienElaboradoSp(String desBienElaboradoSp) {
		this.desBienElaboradoSp = desBienElaboradoSp;
	}

	public String getDesMateriaPrimaUtilizada() {
		return desMateriaPrimaUtilizada;
	}

	public void setDesMateriaPrimaUtilizada(String desMateriaPrimaUtilizada) {
		this.desMateriaPrimaUtilizada = desMateriaPrimaUtilizada;
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
