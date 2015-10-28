package mx.gob.imss.cit.dictamen.contador.web.pages;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * 
 * @author ariverav
 *
 */

@ManagedBean(name = "registroColegioPage")
@SessionScoped
public class RegistroColegioPage implements Serializable {

	private static final long serialVersionUID = 8062316858910768001L;
	private String rfcBusqueda;

	/**
	 * @return the rfcBusqueda
	 */
	public String getRfcBusqueda() {
		return rfcBusqueda;
	}

	/**
	 * @param rfcBusqueda
	 *            the rfcBusqueda to set
	 */
	public void setRfcBusqueda(String rfcBusqueda) {
		this.rfcBusqueda = rfcBusqueda;
	}

}
