package mx.gob.imss.cit.dictamen.web.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.integration.api.dto.MedioContactoDTO;
import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.pages.MedioContactoPage;

@ManagedBean(name = "medioContactoBean")
@ViewScoped
public class MedioContactoBean extends BaseBean {

	private static final long serialVersionUID = 7107693419877419759L;

	@ManagedProperty(value = "#{medioContactoPage}")
	private MedioContactoPage medioContactoPage;

	private final static String[] tipos;

	private final static String[] valores;

	static {
		tipos = new String[2];
		tipos[0] = "CORREO ELECTRONICO";
		tipos[1] = "TELEFONO FIJO";

		valores = new String[2];
		valores[0] = "less247@gmail.com";
		valores[1] = "01-63794936";

	}
	
	@PostConstruct
	public void init(){
		createMedios(2);
	}

	public void createMedios(int size) {
		List<MedioContactoDTO> list = new ArrayList<MedioContactoDTO>();
		MedioContactoDTO medioContactoDTO = null;
		for (int i = 0; i < size; i++) {
			medioContactoDTO = new MedioContactoDTO();
			medioContactoDTO.setDescripcion(valores[i]);
			medioContactoDTO.setTipoMedioContacto(tipos[i]);
			
			list.add(medioContactoDTO);
		}
		
		medioContactoPage.setMedios1(list);
	}

	public MedioContactoPage getMedioContactoPage() {
		return medioContactoPage;
	}

	public void setMedioContactoPage(MedioContactoPage medioContactoPage) {
		this.medioContactoPage = medioContactoPage;
	}
}