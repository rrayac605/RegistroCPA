package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class NdcPreguntaDTO implements Serializable {

	private static final long serialVersionUID = -8380083272527410356L;

	private Long cveIdPregunta;
	private String desPregunta;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Long indOrden;
	private List<NdcOpcionPreguntaDTO> listNdcOpcionPreguntas;
	private NdcPreguntaDTO ndcPregunta;
	private List<NdcPreguntaDTO> listNdcPreguntas;
	private NdcRubroDTO ndcRubro;

	public Long getCveIdPregunta() {
		return cveIdPregunta;
	}

	public void setCveIdPregunta(Long cveIdPregunta) {
		this.cveIdPregunta = cveIdPregunta;
	}

	public String getDesPregunta() {
		return desPregunta;
	}

	public void setDesPregunta(String desPregunta) {
		this.desPregunta = desPregunta;
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

	public Long getIndOrden() {
		return indOrden;
	}

	public void setIndOrden(Long indOrden) {
		this.indOrden = indOrden;
	}

	public List<NdcOpcionPreguntaDTO> getListNdcOpcionPreguntas() {
		return listNdcOpcionPreguntas;
	}

	public void setListNdcOpcionPreguntas(
			List<NdcOpcionPreguntaDTO> listNdcOpcionPreguntas) {
		this.listNdcOpcionPreguntas = listNdcOpcionPreguntas;
	}

	public NdcPreguntaDTO getNdcPregunta() {
		return ndcPregunta;
	}

	public void setNdcPregunta(NdcPreguntaDTO ndcPregunta) {
		this.ndcPregunta = ndcPregunta;
	}

	public List<NdcPreguntaDTO> getListNdcPreguntas() {
		return listNdcPreguntas;
	}

	public void setListNdcPreguntas(List<NdcPreguntaDTO> listNdcPreguntas) {
		this.listNdcPreguntas = listNdcPreguntas;
	}

	public NdcRubroDTO getNdcRubro() {
		return ndcRubro;
	}

	public void setNdcRubro(NdcRubroDTO ndcRubro) {
		this.ndcRubro = ndcRubro;
	}

}
