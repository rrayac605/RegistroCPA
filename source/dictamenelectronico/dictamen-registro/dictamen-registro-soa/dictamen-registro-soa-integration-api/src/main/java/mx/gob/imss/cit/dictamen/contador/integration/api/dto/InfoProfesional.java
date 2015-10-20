package mx.gob.imss.cit.dictamen.contador.integration.api.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author ariverav
 *
 */
public class InfoProfesional implements Serializable {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = -1077245428892780398L;
	private String cedula;
	private String institucion;
	private Date fechaExpCedula;

	/**
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}

	/**
	 * @param cedula
	 *            the cedula to set
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	/**
	 * @return the institucion
	 */
	public String getInstitucion() {
		return institucion;
	}

	/**
	 * @param institucion
	 *            the institucion to set
	 */
	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	/**
	 * @return the fechaExpCedula
	 */
	public Date getFechaExpCedula() {
		return fechaExpCedula;
	}

	/**
	 * @param fechaExpCedula
	 *            the fechaExpCedula to set
	 */
	public void setFechaExpCedula(Date fechaExpCedula) {
		this.fechaExpCedula = fechaExpCedula;
	}
}
