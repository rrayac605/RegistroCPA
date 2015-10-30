package mx.gob.imss.cit.de.dictaminacion.web.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.de.dictaminacion.web.beans.base.BaseBean;
import mx.gob.imss.cit.de.dictaminacion.web.enums.TipoOpinion;
import mx.gob.imss.cit.de.dictaminacion.web.pages.OpinionPage;
import mx.gob.imss.cit.de.dictaminacion.web.util.StringWrapper;

import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;

@ManagedBean(name = "opinionBean")
@ViewScoped
public class OpinionBean extends BaseBean {

	@ManagedProperty(value = "#{opinionPage}")
	private OpinionPage opinionPage;

	private static final long serialVersionUID = 4288671818118232192L;
	private static final Logger LOGGER = LoggerFactory.getLogger(OpinionBean.class);

	public TipoOpinion[] getTiposOpinion() {
		return TipoOpinion.values();
	}

	public void guardarOpinion() {
		LOGGER.info("Guardar opinion");
	}

	public void guardarRubro() {
		LOGGER.info("Guardar rubro");
		opinionPage.getRubros().add(opinionPage.getRubro());
		opinionPage.setRubro(new StringWrapper());
	}

	public void eliminarRubro(int index) {
		LOGGER.info("Eliminar rubro " + index);
		opinionPage.getRubros().remove(index);
	}

	public void guardarConcepto() {
		LOGGER.info("Guardar concepto");
		opinionPage.getConceptos().add(opinionPage.getConcepto());
		opinionPage.setConcepto(new StringWrapper());
	}

	public void eliminarConcepto(int index) {
		LOGGER.info("Eliminar concepto " + index);
		opinionPage.getConceptos().remove(index);
	}

	public void cambioTipoOpinion() {
		LOGGER.info("Cambio tipo opinion");
		opinionPage.setOpcionPagoSeleccionada("SIN_PAGO");
		opinionPage.setTipoPagoSeleccionado(null);
	}

	public OpinionPage getOpinionPage() {
		return opinionPage;
	}

	public void setOpinionPage(OpinionPage opinionPage) {
		this.opinionPage = opinionPage;
	}

}
