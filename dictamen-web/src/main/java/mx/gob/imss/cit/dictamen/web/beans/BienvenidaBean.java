package mx.gob.imss.cit.dictamen.web.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import mx.gob.imss.cit.dictamen.integration.api.RegistrarContadorPublicoIntegrator;
import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.constants.NavigationConstants;
import mx.gob.imss.cit.dictamen.web.pages.BienvenidaPage;

import org.apache.log4j.Logger;

@ManagedBean(name = "bienvenidaBean")
@ViewScoped
public class BienvenidaBean extends BaseBean {

	private static final Logger LOGGER = Logger.getLogger(BienvenidaBean.class);

	private static final long serialVersionUID = 7107693419877419759L;

	@ManagedProperty(value = "#{bienvenidaPage}")
	private BienvenidaPage bienvenidaPage;

	@EJB(lookup = "java:global/dictamen-soa-app-1.0/dictamen-soa-integration-1.0/RegistrarContadorPublicoIntegratorImpl")
	private RegistrarContadorPublicoIntegrator registrarContadorPublicoIntegrator;

	@ManagedProperty(value = "#{configuracionCatalogoBean}")
	private ConfiguracionCatalogoBean configuracionCatalogoBean;

	@ManagedProperty(value = "#{firmaElectronicaBean}")
	private FirmaElectronicaBean firmaElectronicaBean;

	public void enviarRegistro(ActionEvent actionEvent) {
		LOGGER.info("################### ANTES DE INVOCAR EJB ###############################");
		registrarContadorPublicoIntegrator.executeRegistrarContador(null);
	}

	public BienvenidaPage getBienvenidaPage() {
		return bienvenidaPage;
	}

	public void setBienvenidaPage(BienvenidaPage bienvenidaPage) {
		this.bienvenidaPage = bienvenidaPage;
	}

	public String enviarVentanilla() {
		configuracionCatalogoBean.initConfiguracion();
		return NavigationConstants.VENTANILLA_CATALOGOS;
	}

	public String enviarFirmaElectronica() {
		return firmaElectronicaBean.initPaginaPrueba();
	}

	public void setConfiguracionCatalogoBean(
			ConfiguracionCatalogoBean configuracionCatalogoBean) {
		this.configuracionCatalogoBean = configuracionCatalogoBean;
	}

	/**
	 * @param firmaElectronicaBean
	 *            the firmaElectronicaBean to set
	 */
	public void setFirmaElectronicaBean(
			FirmaElectronicaBean firmaElectronicaBean) {
		this.firmaElectronicaBean = firmaElectronicaBean;
	}
}