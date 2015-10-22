package mx.gob.imss.cit.dictamen.contador.web.pages;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.gob.imss.cit.dictamen.contador.integration.api.dto.PersonaMoralDTO;

@ManagedBean(name = "activacionDespachoPage")
@SessionScoped
public class ActivacionDespachoPage implements Serializable {

	private static final long serialVersionUID = -8271240655465166496L;
    
	private PersonaMoralDTO personaMoralDTO;

	public PersonaMoralDTO getPersonaMoralDTO() {
		return personaMoralDTO;
	}

	public void setPersonaMoralDTO(PersonaMoralDTO personaMoralDTO) {
		this.personaMoralDTO = personaMoralDTO;
	}
}
