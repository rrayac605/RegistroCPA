package mx.gob.imss.cit.dictamen.contador.integration.api.dto;

import java.io.Serializable;

/**
 * 
 * @author ariverav
 *
 */
public class ContadorPublicoAutDTO implements Serializable {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = -5589203476692561447L;

	private String curp;
	private String rfc;
	private String nombre;
	private DomicilioDTO domicilio;
	private DatosContactoDTO contacto;
	private InfoProfesional infoProf;

	/**
	 * @return the curp
	 */
	public String getCurp() {
		return curp;
	}

	/**
	 * @param curp
	 *            the curp to set
	 */
	public void setCurp(String curp) {
		this.curp = curp;
	}

	/**
	 * @return the rfc
	 */
	public String getRfc() {
		return rfc;
	}

	/**
	 * @param rfc
	 *            the rfc to set
	 */
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the domicilio
	 */
	public DomicilioDTO getDomicilio() {
		return domicilio;
	}

	/**
	 * @param domicilio
	 *            the domicilio to set
	 */
	public void setDomicilio(DomicilioDTO domicilio) {
		this.domicilio = domicilio;
	}

	/**
	 * @return the contacto
	 */
	public DatosContactoDTO getContacto() {
		return contacto;
	}

	/**
	 * @param contacto
	 *            the contacto to set
	 */
	public void setContacto(DatosContactoDTO contacto) {
		this.contacto = contacto;
	}

	/**
	 * @return the infoProf
	 */
	public InfoProfesional getInfoProf() {
		return infoProf;
	}

	/**
	 * @param infoProf
	 *            the infoProf to set
	 */
	public void setInfoProf(InfoProfesional infoProf) {
		this.infoProf = infoProf;
	}

}
