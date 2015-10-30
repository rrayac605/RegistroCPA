package mx.gob.imss.cit.de.dictaminacion.batch.validation.to;

import java.util.Date;

/**
 * 
 * @author anhernandez
 *
 */
public class AtestiguamientoTO {
	private Long idAseveracion;
	private Long orden;
	private Long idAtestiguamiento;
	private String desAtestiguamiento;
	private Date registroAlta;
	private Date registroActualizado;
	private Date registroBaja;
	public Long getIdAseveracion() {
		return idAseveracion;
	}
	public void setIdAseveracion(Long idAseveracion) {
		this.idAseveracion = idAseveracion;
	}
	public Long getOrden() {
		return orden;
	}
	public void setOrden(Long orden) {
		this.orden = orden;
	}
	public Long getIdAtestiguamiento() {
		return idAtestiguamiento;
	}
	public void setIdAtestiguamiento(Long idAtestiguamiento) {
		this.idAtestiguamiento = idAtestiguamiento;
	}
	public String getDesAtestiguamiento() {
		return desAtestiguamiento;
	}
	public void setDesAtestiguamiento(String desAtestiguamiento) {
		this.desAtestiguamiento = desAtestiguamiento;
	}
	public Date getRegistroAlta() {
		return registroAlta;
	}
	public void setRegistroAlta(Date registroAlta) {
		this.registroAlta = registroAlta;
	}
	public Date getRegistroActualizado() {
		return registroActualizado;
	}
	public void setRegistroActualizado(Date registroActualizado) {
		this.registroActualizado = registroActualizado;
	}
	public Date getRegistroBaja() {
		return registroBaja;
	}
	public void setRegistroBaja(Date registroBaja) {
		this.registroBaja = registroBaja;
	}
	
	
}
