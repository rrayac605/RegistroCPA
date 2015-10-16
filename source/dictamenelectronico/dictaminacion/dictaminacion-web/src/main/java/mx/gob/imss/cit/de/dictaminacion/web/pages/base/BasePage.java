package mx.gob.imss.cit.de.dictaminacion.web.pages.base;


import java.io.Serializable;

/**
 * The Class BasePage.
 */
public class BasePage implements Serializable {

	/** Serializacion. */
	private static final long serialVersionUID = 1L;
	
	private String ventanaAnterior;


    public String getVentanaAnterior() {
        return ventanaAnterior;
    }

    public void setVentanaAnterior(String ventanaAnterior) {
        this.ventanaAnterior = ventanaAnterior;
    }
}
