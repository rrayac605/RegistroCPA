package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;

import org.apache.commons.lang.StringUtils;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 5796819754719334958L;

	private String nombre;
	private String aPaterno;
	private String aMaterno;
	private String curp;
	private String correo;
	private String subDeleg;
	private String deleg;
	private String perfil;
	private String usuario;
	private String umf;
	private String idPersona;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getaPaterno() {
		return aPaterno;
	}

	public void setaPaterno(String aPaterno) {
		this.aPaterno = aPaterno;
	}

	public String getaMaterno() {
		return aMaterno;
	}

	public void setaMaterno(String aMaterno) {
		this.aMaterno = aMaterno;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getSubDeleg() {
		return subDeleg;
	}

	public void setSubDeleg(String subDeleg) {
		this.subDeleg = subDeleg;
	}

	public String getDeleg() {
		return deleg;
	}

	public void setDeleg(String deleg) {
		this.deleg = deleg;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getNombreCompleto() {
		StringBuffer nombreCompleto = new StringBuffer();
		
		if (StringUtils.isNotEmpty(this.nombre)) {
			nombreCompleto.append(this.nombre.trim());
		}
		if (StringUtils.isNotEmpty(this.aPaterno)) {
			nombreCompleto.append(" ");
			nombreCompleto.append(this.aPaterno.trim());
		}
		if (this.aMaterno != null && StringUtils.isNotEmpty(this.aMaterno) && !this.aMaterno.trim().equals("NULL") 
				&& !this.aMaterno.trim().equals("null")) {
			nombreCompleto.append(" ");
			nombreCompleto.append(this.aMaterno.trim());
		}
		
		return nombreCompleto.toString();
	}

	public String getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(String idPersona) {
		this.idPersona = idPersona;
	}

	public String getUmf() {
		return umf;
	}

	public void setUmf(String umf) {
		this.umf = umf;
	}

}
