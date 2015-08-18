package mx.gob.imss.cit.dictamen.web.beans;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.pages.CapturaDespachoContadorPage;


@ManagedBean(name = "capturaDespachoContador")
@ViewScoped
public class CapturaDespachoContadorBean  extends BaseBean{
	
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(CapturaDespachoContadorBean.class);
	
	@ManagedProperty(value = "#{capturaDespachoContadorPage}")
	private  CapturaDespachoContadorPage  capturaDespachoContadorPage;
}
