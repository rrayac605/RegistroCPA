package mx.gob.imss.cit.dictamen.contador.web.pages;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.ContactoDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DatosPersonalesDTO;


@ManagedBean(name = "activacionContadorPage")
@SessionScoped
public class ActivacionContadorPage implements Serializable {

	private static final long serialVersionUID = -8976265295241536809L;
	
    private DatosPersonalesDTO datosPersonalesDTO;
    private ContactoDTO contactoDTO;
    private boolean valido=false;
    


	public ContactoDTO getContactoDTO() {
		return contactoDTO;
	}

	public void setContactoDTO(ContactoDTO contactoDTO) {
		this.contactoDTO = contactoDTO;
	}

	public DatosPersonalesDTO getDatosPersonalesDTO() {
		return datosPersonalesDTO;
	}

	public void setDatosPersonalesDTO(DatosPersonalesDTO datosPersonalesDTO) {
		this.datosPersonalesDTO = datosPersonalesDTO;
	}


	public boolean isValido() {
		return valido;
	}

	public void setValido(boolean valido) {
		this.valido = valido;
	}

}
