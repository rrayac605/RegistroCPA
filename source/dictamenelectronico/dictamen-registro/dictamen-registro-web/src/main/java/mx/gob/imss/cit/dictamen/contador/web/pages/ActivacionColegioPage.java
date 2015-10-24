package mx.gob.imss.cit.dictamen.contador.web.pages;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.gob.imss.cit.dictamen.contador.integration.api.dto.PersonaMoralBDTUDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.PersonaMoralDTO;

@ManagedBean(name = "activacionColegioPage")
@SessionScoped
public class ActivacionColegioPage implements Serializable {

	private static final long serialVersionUID = -880660913319004337L;

	private PersonaMoralDTO personaMoralDTO;
    private PersonaMoralBDTUDTO personaMoralBDTUDTO;



	private boolean valido=false;
    
	public boolean isValido() {
		return valido;
	}

	public void setValido(boolean valido) {
		this.valido = valido;
	}

	public PersonaMoralDTO getPersonaMoralDTO() {
		return personaMoralDTO;
	}

	public void setPersonaMoralDTO(PersonaMoralDTO personaMoralDTO) {
		this.personaMoralDTO = personaMoralDTO;
	}

    public PersonaMoralBDTUDTO getPersonaMoralBDTUDTO() {
		return personaMoralBDTUDTO;
	}

	public void setPersonaMoralBDTUDTO(PersonaMoralBDTUDTO personaMoralBDTUDTO) {
		this.personaMoralBDTUDTO = personaMoralBDTUDTO;
	}
}
