package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class NdcTipoRespuestaDTO implements Serializable {

	private static final long serialVersionUID = -4222744908409632306L;

	private Long cveIdRespuesta;
	private String desTipoRespuesta;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private List<NdcOpcionPreguntaDTO> listNdcOpcionPreguntas;

	public Long getCveIdRespuesta() {
		return cveIdRespuesta;
	}

	public void setCveIdRespuesta(Long cveIdRespuesta) {
		this.cveIdRespuesta = cveIdRespuesta;
	}

	public String getDesTipoRespuesta() {
		return desTipoRespuesta;
	}

	public void setDesTipoRespuesta(String desTipoRespuesta) {
		this.desTipoRespuesta = desTipoRespuesta;
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

	public List<NdcOpcionPreguntaDTO> getListNdcOpcionPreguntas() {
		return listNdcOpcionPreguntas;
	}

	public void setListNdcOpcionPreguntas(List<NdcOpcionPreguntaDTO> listNdcOpcionPreguntas) {
		this.listNdcOpcionPreguntas = listNdcOpcionPreguntas;
	}

}
