package mx.gob.imss.cit.dictamen.web.pages;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.gob.imss.cit.dictamen.integration.api.dto.MedioContactoDTO;
import mx.gob.imss.cit.dictamen.web.pages.base.BasePage;

@ManagedBean(name = "medioContactoPage")
@SessionScoped
public class MedioContactoPage extends BasePage {

	/**
	 * Serial Version UID de la clase
	 */
	private static final long serialVersionUID = 1L;

	private List<MedioContactoDTO> medios1;

	private MedioContactoDTO selectedMedio;
	private List<MedioContactoDTO> selectedMedios;

	private String medioContacto;
	private String descripcion;
	private String institucion;
	private String cedula;

	@PostConstruct
	public void init() {
		medioContacto = "CORREO ELECTRÓNICO";
	}

	public List<MedioContactoDTO> getMedios1() {
		return medios1;
	}

	public void setMedios1(List<MedioContactoDTO> medios1) {
		this.medios1 = medios1;
	}

	public MedioContactoDTO getSelectedMedio() {
		return selectedMedio;
	}

	public void setSelectedMedio(MedioContactoDTO selectedMedio) {
		this.selectedMedio = selectedMedio;
	}

	public List<MedioContactoDTO> getSelectedMedios() {
		return selectedMedios;
	}

	public void setSelectedMedios(List<MedioContactoDTO> selectedMedios) {
		this.selectedMedios = selectedMedios;
	}

	public String getMedioContacto() {
		return medioContacto;
	}

	public void setMedioContacto(String medioContacto) {
		this.medioContacto = medioContacto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
}