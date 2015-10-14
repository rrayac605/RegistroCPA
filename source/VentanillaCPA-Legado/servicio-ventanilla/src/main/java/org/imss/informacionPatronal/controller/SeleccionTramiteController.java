package org.imss.informacionPatronal.controller;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.ConfigurableNavigationHandler;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;

@ManagedBean(name = "seleccionTramiteController")
@ViewScoped
public class SeleccionTramiteController {

	private String msgEstatus;

	@PostConstruct
	public void init() {
		System.out.println("PostContruct");
	}

	public void seleccionTramite(ActionEvent actionEvent) {
		System.out.println("SeleccionTramite");

		Map<String, String> params = FacesContext.getCurrentInstance()
				.getExternalContext().getRequestParameterMap();
		String tramite = params.get("id");

		ConfigurableNavigationHandler handler = (ConfigurableNavigationHandler) FacesContext
				.getCurrentInstance().getApplication().getNavigationHandler();

		if (tramite.equals("dic")) {
			handler.performNavigation("views/datosPatron/datosPatron.xhtml?faces-redirect=true");
		} else if (tramite.equals("bandejaCont")) {
			handler.performNavigation("views/bandejaConsulta/bandejaConsultaContador.xhtml?faces-redirect=true");
		} else if (tramite.equals("bandejaCol")) {
			handler.performNavigation("views/bandejaConsultaColegio/bandejaConsultaColegio.xhtml?faces-redirect=true");
		} else if (tramite.equals("bandejaDesp")) {
			handler.performNavigation("views/bandejaConsultaDespacho/bandejaConsultaDespacho.xhtml?faces-redirect=true");
		} else if (tramite.equals("aceptSol")) {
			handler.performNavigation("views/aceptacionSolicitud/aceptacionSolicitud.xhtml?faces-redirect=true");
		} else {
			this.setMsgEstatus("Estatus Invalido");
			RequestContext.getCurrentInstance().execute(
					"PF(\'estatusInvalidoDialogo\').show()");
		}
	}

	public void redireccion() {
		System.out.println("Redireccion");
	}

	public String getMsgEstatus() {
		return msgEstatus;
	}

	public void setMsgEstatus(String msgEstatus) {
		this.msgEstatus = msgEstatus;
	}

}
