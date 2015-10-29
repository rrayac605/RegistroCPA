package mx.gob.imss.cit.de.dictaminacion.web.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.de.dictaminacion.integration.api.CedulaPrestacionesIntegrator;
import mx.gob.imss.cit.de.dictaminacion.integration.api.exception.DictamenNegocioException;
import mx.gob.imss.cit.de.dictaminacion.web.beans.base.BaseBean;
import mx.gob.imss.cit.de.dictaminacion.web.enums.MensajesNotificacionesEnum;
import mx.gob.imss.cit.de.dictaminacion.web.pages.CedulaPrestacionesPage;
import mx.gob.imss.cit.de.dictaminacion.web.pages.DatosPatronalesPage;
import mx.gob.imss.cit.de.dictaminacion.web.pages.ExamenPage;
import mx.gob.imss.cit.de.dictaminacion.web.util.CleanBeanUtil;
import mx.gob.imss.cit.de.dictaminacion.web.util.FacesUtils;

import org.apache.log4j.Logger;

@ManagedBean (name = "cedulaPrestacionesBean")
@ViewScoped
public class CedulaPrestacionesBean extends BaseBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3814699927113712527L;
	private Logger LOG = Logger.getLogger(MenuCedulasBean.class);

	@EJB
	private CedulaPrestacionesIntegrator cedulaPrestacionesIntegrator;

	@ManagedProperty(value = "#{cedulaPrestacionesPage}")
	private CedulaPrestacionesPage cedulaPrestacionesPage;

	@ManagedProperty(value = "#{datosPatronalesPage}")
	private DatosPatronalesPage datosPatronalesPage;
	
	@ManagedProperty(value = "#{examenPage}")
	private ExamenPage examenPage;
	
	public String init() throws DictamenNegocioException {
		CleanBeanUtil.cleanFields(cedulaPrestacionesPage);
		
		try{
			System.out.println("clave patron" + getDatosPatronalesPage().getDatosPatron().getCveIdPatronDictamen());
			//System.out.println("clave atestiguamiento" + getExamenPage().getAtestiguamientoDTO().getCveIdAtestiguamiento());
			
			cedulaPrestacionesPage.setCedulaPrestacionesList(cedulaPrestacionesIntegrator.obtenerCedulaPrestaciones(datosPatronalesPage.getDatosPatron().getCveIdPatronDictamen(), 2L));

		}catch (Exception e) {
			LOG.error(e.getMessage(), e);
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_CARGAR_CEDULA_PRESTACIONES.getCode());
		}
		return "";		
	}
	public CedulaPrestacionesPage getCedulaPrestacionesPage() {
		return cedulaPrestacionesPage;
	}

	public void setCedulaPrestacionesPage(
			CedulaPrestacionesPage cedulaPrestacionesPage) {
		this.cedulaPrestacionesPage = cedulaPrestacionesPage;
	}

	public DatosPatronalesPage getDatosPatronalesPage() {
		return datosPatronalesPage;
	}

	public void setDatosPatronalesPage(DatosPatronalesPage datosPatronalesPage) {
		this.datosPatronalesPage = datosPatronalesPage;
	}

	public ExamenPage getExamenPage() {
		return examenPage;
	}

	public void setExamenPage(ExamenPage examenPage) {
		this.examenPage = examenPage;
	}

}

