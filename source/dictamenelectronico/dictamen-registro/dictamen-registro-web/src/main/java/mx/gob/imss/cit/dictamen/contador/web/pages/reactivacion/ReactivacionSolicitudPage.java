package mx.gob.imss.cit.dictamen.contador.web.pages.reactivacion;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.gob.imss.cit.dictamen.contador.integration.api.dto.PersonaDTO;

@ManagedBean(name = "activacionSolicitudPage")
@SessionScoped
public class ReactivacionSolicitudPage implements Serializable {

	private static final long serialVersionUID = -6700865680077669328L;
	
	private PersonaDTO personaDTO;
	private boolean valido=false;
	
	public boolean isValido() {
		return valido;
	}
	public void setValido(boolean valido) {
		this.valido = valido;
	}
	public PersonaDTO getPersonaDTO() {
		return personaDTO;
	}
	public void setPersonaDTO(PersonaDTO personaDTO) {
		this.personaDTO = personaDTO;
	}

	
}
