package mx.gob.imss.cit.dictamen.ventanilla.web.pages;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "loginPage")
@SessionScoped
public class LoginPage implements Serializable {

private static final long serialVersionUID = -1489530509629791911L;

public String curp;

public String getCurp() {
	return curp;
}

public void setCurp(String curp) {
	this.curp = curp;
}


   
}
