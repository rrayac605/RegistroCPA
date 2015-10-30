package mx.gob.imss.cit.dictamen.ventanilla.web.pages.base;

import java.io.Serializable;

public class PagesBaseBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String ventanaAnterior;


    public String getVentanaAnterior() {
        return ventanaAnterior;
    }

    public void setVentanaAnterior(String ventanaAnterior) {
        this.ventanaAnterior = ventanaAnterior;
    }
}
