package mx.gob.imss.cit.dictamen.contador.web.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.contador.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.contador.web.pages.LoginPage;

import org.apache.log4j.Logger;
@ManagedBean(name = "loginBean")
@ViewScoped
public class LoginBean extends BaseBean {
	private static Logger LOGGER=Logger.getLogger(LoginBean.class) ;

	
	private static final long serialVersionUID = -8964007952486868511L;
    
	@ManagedProperty(value = "#{loginPage}")
	private LoginPage loginPage;

    
	public void init(){
		loginPage.setCurp("RIVA890228HVZVLS08");
		LOGGER.info("LoginBean");
		LOGGER.info("CURP:"+loginPage.getCurp());

	}
	public LoginPage getLoginPage() {
		return loginPage;
	}

	public void setLoginPage(LoginPage loginPage) {
		this.loginPage = loginPage;
	}
	
	

	
	
}
