package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdtAtestigPreguntasRespuestDTO implements Serializable {

	private static final long serialVersionUID = 2607996632092267380L;

	private Long cveIdAtestiguamientos;
	private String cveIdUsuario;
	private String desObservaciones;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private NdcOpcionPreguntaDTO ndcOpcionPregunta;

	public Long getCveIdAtestiguamientos() {
		return cveIdAtestiguamientos;
	}

	public void setCveIdAtestiguamientos(Long cveIdAtestiguamientos) {
		this.cveIdAtestiguamientos = cveIdAtestiguamientos;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDesObservaciones() {
		return desObservaciones;
	}

	public void setDesObservaciones(String desObservaciones) {
		this.desObservaciones = desObservaciones;
	}

	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado;
	}

	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	public Date getFecRegistroAlta() {
		return fecRegistroAlta;
	}

	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	public Date getFecRegistroBaja() {
		return fecRegistroBaja;
	}

	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	public NdcOpcionPreguntaDTO getNdcOpcionPregunta() {
		return ndcOpcionPregunta;
	}

	public void setNdcOpcionPregunta(NdcOpcionPreguntaDTO ndcOpcionPregunta) {
		this.ndcOpcionPregunta = ndcOpcionPregunta;
	}

}
