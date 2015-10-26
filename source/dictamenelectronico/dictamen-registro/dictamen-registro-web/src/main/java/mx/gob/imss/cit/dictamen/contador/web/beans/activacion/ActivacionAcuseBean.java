package mx.gob.imss.cit.dictamen.contador.web.beans.activacion;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.dictamen.contador.web.beans.base.BaseBean;


@ManagedBean(name = "activacionAcuseBean")
@ViewScoped
public class ActivacionAcuseBean extends BaseBean{

	private static final long serialVersionUID = -7431536406907320285L;
	private static final Logger LOGGER = Logger.getLogger(ActivacionAcuseBean.class);
    
	public String accionSiguiente(){
	      return "activacion_firma";
	}

	public String accionAtras(){
		  return "activacion_colegio";
	}
}
