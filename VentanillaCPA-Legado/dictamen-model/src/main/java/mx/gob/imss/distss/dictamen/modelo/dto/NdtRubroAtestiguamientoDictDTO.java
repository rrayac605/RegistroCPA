package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class NdtRubroAtestiguamientoDictDTO implements Serializable {

	private static final long serialVersionUID = -3085519377708316809L;

	private Long cveIdRubroAtestigDictamen;
	private String cveIdUsuario;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Long indAplica;
	private List<NdtAtestigPreguntasRespuestDTO> listNdtAtestigPreguntasRespuests;
	private NdcRubroDTO ndcRubro;

	public Long getCveIdRubroAtestigDictamen() {
		return cveIdRubroAtestigDictamen;
	}

	public void setCveIdRubroAtestigDictamen(Long cveIdRubroAtestigDictamen) {
		this.cveIdRubroAtestigDictamen = cveIdRubroAtestigDictamen;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
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

	public Long getIndAplica() {
		return indAplica;
	}

	public void setIndAplica(Long indAplica) {
		this.indAplica = indAplica;
	}

	public List<NdtAtestigPreguntasRespuestDTO> getListNdtAtestigPreguntasRespuests() {
		return listNdtAtestigPreguntasRespuests;
	}

	public void setListNdtAtestigPreguntasRespuests(List<NdtAtestigPreguntasRespuestDTO> listNdtAtestigPreguntasRespuests) {
		this.listNdtAtestigPreguntasRespuests = listNdtAtestigPreguntasRespuests;
	}

	public NdcRubroDTO getNdcRubro() {
		return ndcRubro;
	}

	public void setNdcRubro(NdcRubroDTO ndcRubro) {
		this.ndcRubro = ndcRubro;
	}

}
