package mx.gob.imss.cit.dictamen.contador.web.beans.base;

import java.io.Serializable;

public class BaseBean implements Serializable {

	private static final long serialVersionUID = -2254891415691841496L;
    
    private String ventanaInicio = "login";

	public String getVentanaInicio() {
		return ventanaInicio;
	}

	public void setVentanaInicio(String ventanaInicio) {
		this.ventanaInicio = ventanaInicio;
	}
}
