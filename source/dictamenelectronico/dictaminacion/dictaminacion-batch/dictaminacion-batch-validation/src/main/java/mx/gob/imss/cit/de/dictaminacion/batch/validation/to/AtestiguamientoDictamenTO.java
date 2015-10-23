package mx.gob.imss.cit.de.dictaminacion.batch.validation.to;

import java.util.Date;

public class AtestiguamientoDictamenTO {
	
	private Long idAtestigDictamen;
	private Long idPatronDictamen;
	private Long idAtestiguamiento;
	private Date registroAlta;
	private Date registroBaja;
	private Date registroActualizado;
	private String idUsuario;
	private Long idEstadoAtestiguamiento;
	
	public Long getIdAtestigDictamen() {
		return idAtestigDictamen;
	}
	public void setIdAtestigDictamen(Long idAtestigDictamen) {
		this.idAtestigDictamen = idAtestigDictamen;
	}
	public Long getIdPatronDictamen() {
		return idPatronDictamen;
	}
	public void setIdPatronDictamen(Long iPatronDictamen) {
		this.idPatronDictamen = iPatronDictamen;
	}
	public Long getIdAtestiguamiento() {
		return idAtestiguamiento;
	}
	public void setIdAtestiguamiento(Long idAtestiguamiento) {
		this.idAtestiguamiento = idAtestiguamiento;
	}
	public Date getRegistroAlta() {
		return registroAlta;
	}
	public void setRegistroAlta(Date registroAlta) {
		this.registroAlta = registroAlta;
	}
	public Date getRegistroBaja() {
		return registroBaja;
	}
	public void setRegistroBaja(Date registroBaja) {
		this.registroBaja = registroBaja;
	}
	public Date getRegistroActualizado() {
		return registroActualizado;
	}
	public void setRegistroActualizado(Date registroActualizado) {
		this.registroActualizado = registroActualizado;
	}
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Long getIdEstadoAtestiguamiento() {
		return idEstadoAtestiguamiento;
	}
	public void setIdEstadoAtestiguamiento(Long idEstadoAtestiguamiento) {
		this.idEstadoAtestiguamiento = idEstadoAtestiguamiento;
	}
	
	

}
