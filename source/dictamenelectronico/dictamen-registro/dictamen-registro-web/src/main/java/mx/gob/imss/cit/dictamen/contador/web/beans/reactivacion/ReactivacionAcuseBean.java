package mx.gob.imss.cit.dictamen.contador.web.beans.reactivacion;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.dictamen.contador.web.beans.base.BaseBean;


@ManagedBean(name = "reactivacionAcuseBean")
@ViewScoped
public class ReactivacionAcuseBean extends BaseBean{

	private static final long serialVersionUID = -7431536406907320285L;
	private static final Logger LOGGER = Logger.getLogger(ReactivacionAcuseBean.class);
    
	public String accionSiguiente(){
	      return "activacion_firma";
	}

	public String accionAtras(){
		  return "activacion_colegio";
	}
}
