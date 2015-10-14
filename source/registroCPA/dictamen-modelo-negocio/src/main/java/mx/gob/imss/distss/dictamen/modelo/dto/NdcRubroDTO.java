package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class NdcRubroDTO implements Serializable {

	private static final long serialVersionUID = 1732981819642570811L;

	private Long cveIdRubro;
	private String desRubro;
	private Date fecActualizadoRegistro;
	private Date fecAltaRegistro;
	private Date fecBajaRegistro;
	private Long indOrden;
	private List<NdcPreguntaDTO> listNdcPreguntas;
	private NdcAtestiguamientoDTO ndcAtestiguamiento;

	public Long getCveIdRubro() {
		return cveIdRubro;
	}

	public void setCveIdRubro(Long cveIdRubro) {
		this.cveIdRubro = cveIdRubro;
	}

	public String getDesRubro() {
		return desRubro;
	}

	public void setDesRubro(String desRubro) {
		this.desRubro = desRubro;
	}

	public Date getFecActualizadoRegistro() {
		return fecActualizadoRegistro;
	}

	public void setFecActualizadoRegistro(Date fecActualizadoRegistro) {
		this.fecActualizadoRegistro = fecActualizadoRegistro;
	}

	public Date getFecAltaRegistro() {
		return fecAltaRegistro;
	}

	public void setFecAltaRegistro(Date fecAltaRegistro) {
		this.fecAltaRegistro = fecAltaRegistro;
	}

	public Date getFecBajaRegistro() {
		return fecBajaRegistro;
	}

	public void setFecBajaRegistro(Date fecBajaRegistro) {
		this.fecBajaRegistro = fecBajaRegistro;
	}

	public Long getIndOrden() {
		return indOrden;
	}

	public void setIndOrden(Long indOrden) {
		this.indOrden = indOrden;
	}

	public List<NdcPreguntaDTO> getListNdcPreguntas() {
		return listNdcPreguntas;
	}

	public void setListNdcPreguntas(List<NdcPreguntaDTO> listNdcPreguntas) {
		this.listNdcPreguntas = listNdcPreguntas;
	}

	public NdcAtestiguamientoDTO getNdcAtestiguamiento() {
		return ndcAtestiguamiento;
	}

	public void setNdcAtestiguamiento(NdcAtestiguamientoDTO ndcAtestiguamiento) {
		this.ndcAtestiguamiento = ndcAtestiguamiento;
	}

}
