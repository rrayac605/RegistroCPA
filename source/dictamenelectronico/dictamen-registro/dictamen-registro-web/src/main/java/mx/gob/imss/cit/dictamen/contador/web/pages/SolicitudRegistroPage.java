package mx.gob.imss.cit.dictamen.contador.web.pages;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.gob.imss.cit.dictamen.contador.integration.api.dto.ContadorPublicoAutDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DatosContactoDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DomicilioDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.InfoProfesional;

/**
 * 
 * @author ariverav
 *
 */

@ManagedBean(name = "solicitudRegistroPage")
@SessionScoped
public class SolicitudRegistroPage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6176789088095528825L;

	private Long folio;
	private ContadorPublicoAutDTO contador;
	private Date fechaActual;
	private String headerDialog;
	private String mensajeDialog;

	public SolicitudRegistroPage() {
		contador = new ContadorPublicoAutDTO();
		contador.setContacto(new DatosContactoDTO());
		contador.setDomicilio(new DomicilioDTO());
		contador.setInfoProf(new InfoProfesional());
	}

	/**
	 * @return the folio
	 */
	public Long getFolio() {
		return folio;
	}

	/**
	 * @param folio
	 *            the folio to set
	 */
	public void setFolio(Long folio) {
		this.folio = folio;
	}

	/**
	 * @return the contador
	 */
	public ContadorPublicoAutDTO getContador() {
		return contador;
	}

	/**
	 * @param contador
	 *            the contador to set
	 */
	public void setContador(ContadorPublicoAutDTO contador) {
		this.contador = contador;
	}

	/**
	 * @return the fechaActual
	 */
	public Date getFechaActual() {
		return fechaActual;
	}

	/**
	 * @param fechaActual
	 *            the fechaActual to set
	 */
	public void setFechaActual(Date fechaActual) {
		this.fechaActual = fechaActual;
	}

	/**
	 * @return the headerDialog
	 */
	public String getHeaderDialog() {
		return headerDialog;
	}

	/**
	 * @param headerDialog
	 *            the headerDialog to set
	 */
	public void setHeaderDialog(String headerDialog) {
		this.headerDialog = headerDialog;
	}

	/**
	 * @return the mensajeDialog
	 */
	public String getMensajeDialog() {
		return mensajeDialog;
	}

	/**
	 * @param mensajeDialog
	 *            the mensajeDialog to set
	 */
	public void setMensajeDialog(String mensajeDialog) {
		this.mensajeDialog = mensajeDialog;
	}

}
