package mx.gob.imss.cit.dictamen.contador.web.pages;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "activacionReportePage")
@SessionScoped
public class ActivacionReportePage implements Serializable {

	private static final long serialVersionUID = -4577860939908385720L;

    private boolean valido=false;

	public boolean isValido() {
		return valido;
	}

	public void setValido(boolean valido) {
		this.valido = valido;
	}
}
