package mx.gob.imss.cit.dictamen.contador.commons.to.domain.boveda;

import java.io.Serializable;

public class UsuarioTO  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5631118485020624018L;
	/**
	 * Id del paciente
	 */
	protected String idPaciente;
	/**
	 * Password
	 */
	protected String password;
	/**
	 * Rol
	 */
	protected String role;
	/**
	 * Usuario
	 */
	protected String usuario;
	/**
	 * Rfc
	 */
	protected String rfc;

	/**
	 * Org
	 */
	protected String org;
	/**
	 * Zona
	 */
	protected String zona;
	/**
	 * Tipo id
	 */
	protected String tipoId;
	/**
	 * id
	 */
	protected String id;
	/**
	 * Owner
	 */
	protected Boolean isOwner;

	public String getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(String value) {
		this.idPaciente = value;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String value) {
		this.password = value;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String value) {
		this.role = value;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String value) {
		this.usuario = value;
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
	 * @return the org
	 */
	public String getOrg() {
		return org;
	}

	/**
	 * @param org
	 *            the org to set
	 */
	public void setOrg(String org) {
		this.org = org;
	}

	/**
	 * @return the zona
	 */
	public String getZona() {
		return zona;
	}

	/**
	 * @param zona
	 *            the zona to set
	 */
	public void setZona(String zona) {
		this.zona = zona;
	}

	/**
	 * @return the tipoId
	 */
	public String getTipoId() {
		return tipoId;
	}

	/**
	 * @param tipoId
	 *            the tipoId to set
	 */
	public void setTipoId(String tipoId) {
		this.tipoId = tipoId;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the isOwner
	 */
	public Boolean getIsOwner() {
		return isOwner;
	}

	/**
	 * @param isOwner
	 *            the isOwner to set
	 */
	public void setIsOwner(Boolean isOwner) {
		this.isOwner = isOwner;
	}
}
