package mx.gob.imss.cit.de.dictaminacion.web.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.de.dictaminacion.web.beans.base.BaseBean;
import mx.gob.imss.cit.de.dictaminacion.web.constants.NavigationConstants;


@ManagedBean(name = "menuCedulasBean")
@ViewScoped
public class MenuCedulasBean extends BaseBean{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5942079161332361563L;
	/**
	 * El logger de la clase
	 */
	private Logger LOG=Logger.getLogger(MenuCedulasBean.class) ;
	
	/**
	 * 
	 * @return
	 */
	public String editarCedulaRemuneraciones(){
		LOG.info("Editar Cedula Remuneraciones....");
		
		return NavigationConstants.PAGE_CEDULA_REMUNERACIONES;
	}
	

}
