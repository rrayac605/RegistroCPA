package mx.gob.imss.cit.dictamen.contador.web.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.contador.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.contador.web.util.EnumPantallasContador;
@ManagedBean(name = "contadorBean")
@ViewScoped
public class ContadorBean extends BaseBean {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = -917860651049653638L;

	// ************************* REDIRECTS ************************//
	// ************************************************************//
	
	public String redirectSolicitud(){
		return EnumPantallasContador.SOLICITUD_REGISTRO.getNombre();
	}

	// ****************** GETTERS AND SETTERS *********************//
	// ************************************************************//

}
