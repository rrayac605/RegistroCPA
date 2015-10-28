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
	private DespachoDTO despacho;
	private boolean independiente;
	private boolean perteneceDespacho;
	private boolean trabajadores;
	private int nTrabajadores;
	private CatalogoDTO cargo;
	private ColegioDTO colegio;

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

	/**
	 * @return the despacho
	 */
	public DespachoDTO getDespacho() {
		return despacho;
	}

	/**
	 * @param despacho
	 *            the despacho to set
	 */
	public void setDespacho(DespachoDTO despacho) {
		this.despacho = despacho;
	}

	/**
	 * @return the independiente
	 */
	public boolean isIndependiente() {
		return independiente;
	}

	/**
	 * @param independiente
	 *            the independiente to set
	 */
	public void setIndependiente(boolean independiente) {
		this.independiente = independiente;
	}

	/**
	 * @return the perteneceDespacho
	 */
	public boolean isPerteneceDespacho() {
		return perteneceDespacho;
	}

	/**
	 * @param perteneceDespacho
	 *            the perteneceDespacho to set
	 */
	public void setPerteneceDespacho(boolean perteneceDespacho) {
		this.perteneceDespacho = perteneceDespacho;
	}

	/**
	 * @return the trabajadores
	 */
	public boolean isTrabajadores() {
		return trabajadores;
	}

	/**
	 * @param trabajadores
	 *            the trabajadores to set
	 */
	public void setTrabajadores(boolean trabajadores) {
		this.trabajadores = trabajadores;
	}

	/**
	 * @return the nTrabajadores
	 */
	public int getnTrabajadores() {
		return nTrabajadores;
	}

	/**
	 * @param nTrabajadores
	 *            the nTrabajadores to set
	 */
	public void setnTrabajadores(int nTrabajadores) {
		this.nTrabajadores = nTrabajadores;
	}

	/**
	 * @return the cargo
	 */
	public CatalogoDTO getCargo() {
		return cargo;
	}

	/**
	 * @param cargo
	 *            the cargo to set
	 */
	public void setCargo(CatalogoDTO cargo) {
		this.cargo = cargo;
	}

	/**
	 * @return the colegio
	 */
	public ColegioDTO getColegio() {
		return colegio;
	}

	/**
	 * @param colegio
	 *            the colegio to set
	 */
	public void setColegio(ColegioDTO colegio) {
		this.colegio = colegio;
	}

}
