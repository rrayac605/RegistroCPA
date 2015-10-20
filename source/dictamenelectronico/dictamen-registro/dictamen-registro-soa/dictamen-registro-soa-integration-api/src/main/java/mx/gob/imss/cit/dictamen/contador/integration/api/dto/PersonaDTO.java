package mx.gob.imss.cit.dictamen.contador.integration.api.dto;

import java.io.Serializable;

public class PersonaDTO implements Serializable {

	private static final long serialVersionUID = -2718740947785813L;

	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String curp;
	private String nombreCompleto;
	private String correoElectronico;
	private String telefono;
	private Long idPersona;
	
	public Long getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}
	private ContadorPublicoAutDTO contadorPublicoAutDTO;

	
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public ContadorPublicoAutDTO getContadorPublicoAutDTO() {
		return contadorPublicoAutDTO;
	}
	public void setContadorPublicoAutDTO(ContadorPublicoAutDTO contadorPublicoAutDTO) {
		this.contadorPublicoAutDTO = contadorPublicoAutDTO;
	}
	
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
