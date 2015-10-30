package mx.gob.imss.cit.de.dictaminacion.web.pages;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.ModeloOpinionDTO;
import mx.gob.imss.cit.de.dictaminacion.web.pages.base.BasePage;
import mx.gob.imss.cit.de.dictaminacion.web.util.StringWrapper;

@ManagedBean(name = "opinionPage")
@SessionScoped
public class OpinionPage extends BasePage {

	private ModeloOpinionDTO modeloOpinionDTO = new ModeloOpinionDTO();
	private String tipoOpinionSeleccionada;
	private String opcionPagoSeleccionada = "SIN_PAGO";
	private String tipoPagoSeleccionado;
	private StringWrapper rubro = new StringWrapper();
	private List<StringWrapper> rubros = new ArrayList<StringWrapper>();
	private StringWrapper concepto = new StringWrapper();
	private List<StringWrapper> conceptos = new ArrayList<StringWrapper>();

	private static final long serialVersionUID = 8940489464226445290L;

	public ModeloOpinionDTO getModeloOpinionDTO() {
		return modeloOpinionDTO;
	}

	public void setModeloOpinionDTO(ModeloOpinionDTO modeloOpinionDTO) {
		this.modeloOpinionDTO = modeloOpinionDTO;
	}

	public String getTipoOpinionSeleccionada() {
		return tipoOpinionSeleccionada;
	}

	public void setTipoOpinionSeleccionada(String tipoOpinionSeleccionada) {
		this.tipoOpinionSeleccionada = tipoOpinionSeleccionada;
	}

	public String getOpcionPagoSeleccionada() {
		return opcionPagoSeleccionada;
	}

	public void setOpcionPagoSeleccionada(String opcionPagoSeleccionada) {
		this.opcionPagoSeleccionada = opcionPagoSeleccionada;
	}

	public String getTipoPagoSeleccionado() {
		return tipoPagoSeleccionado;
	}

	public void setTipoPagoSeleccionado(String tipoPagoSeleccionado) {
		this.tipoPagoSeleccionado = tipoPagoSeleccionado;
	}

	public StringWrapper getRubro() {
		return rubro;
	}

	public void setRubro(StringWrapper rubro) {
		this.rubro = rubro;
	}

	public List<StringWrapper> getRubros() {
		return rubros;
	}

	public void setRubros(List<StringWrapper> rubros) {
		this.rubros = rubros;
	}

	public StringWrapper getConcepto() {
		return concepto;
	}

	public void setConcepto(StringWrapper concepto) {
		this.concepto = concepto;
	}

	public List<StringWrapper> getConceptos() {
		return conceptos;
	}

	public void setConceptos(List<StringWrapper> conceptos) {
		this.conceptos = conceptos;
	}

}
