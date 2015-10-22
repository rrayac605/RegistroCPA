package mx.gob.imss.cit.dictamen.contador.commons.to.domain;

import java.io.Serializable;
import java.util.Date;

public class PersonaMedioContactoTO implements Serializable {

	private static final long serialVersionUID = -2090229666327268798L;


	private Long idPersonafContacto;
    private Long cveIdPersona;
    private Date fechaAlta;
    private String descripcion;
    private Long idMedioContacto;
    
    public Long getIdPersonafContacto() {
		return idPersonafContacto;
	}
	public void setIdPersonafContacto(Long idPersonafContacto) {
		this.idPersonafContacto = idPersonafContacto;
	}
	public Long getCveIdPersona() {
		return cveIdPersona;
	}
	public void setCveIdPersona(Long cveIdPersona) {
		this.cveIdPersona = cveIdPersona;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Long getIdMedioContacto() {
		return idMedioContacto;
	}
	public void setIdMedioContacto(Long idMedioContacto) {
		this.idMedioContacto = idMedioContacto;
	}
    
}
