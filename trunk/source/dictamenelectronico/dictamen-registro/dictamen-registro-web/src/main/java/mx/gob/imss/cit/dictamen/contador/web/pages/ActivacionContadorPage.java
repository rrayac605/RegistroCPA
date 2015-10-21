package mx.gob.imss.cit.dictamen.contador.web.pages;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.gob.imss.cit.dictamen.contador.integration.api.dto.PersonaDTO;


@ManagedBean(name = "activacionContadorPage")
@SessionScoped
public class ActivacionContadorPage implements Serializable {

	private static final long serialVersionUID = -8976265295241536809L;
	
	private PersonaDTO personaDTO;

	public PersonaDTO getPersonaDTO() {
		return personaDTO;
	}

	public void setPersonaDTO(PersonaDTO personaDTO) {
		this.personaDTO = personaDTO;
	}



}
