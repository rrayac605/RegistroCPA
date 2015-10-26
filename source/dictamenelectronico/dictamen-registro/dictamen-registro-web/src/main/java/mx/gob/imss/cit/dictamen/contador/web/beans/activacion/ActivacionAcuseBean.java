package mx.gob.imss.cit.dictamen.contador.web.beans.activacion;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.contador.web.beans.base.BaseBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ManagedBean(name = "activacionAcuseBean")
@ViewScoped
public class ActivacionAcuseBean extends BaseBean{

	private static final long serialVersionUID = -7431536406907320285L;
	private static final Logger LOGGER = LoggerFactory.getLogger(ActivacionAcuseBean.class);
    
	public String accionSiguiente(){
	      return "activacion_firma";
	}

	public String accionAtras(){
		  return "activacion_colegio";
	}
}
