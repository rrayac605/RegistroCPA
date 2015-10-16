package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class NdtAtestiguamientoDictamenDTO implements Serializable {

	private static final long serialVersionUID = 1705948890326580751L;

	private Long cveIdAtestigDictamen;
	private Long cveIdDictamen;
	private String cveIdUsuario;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private NdcAtestiguamientoDTO ndcAtestiguamiento;
	private List<NdtRubroAtestiguamientoDictDTO> listNdtRubroAtestiguamientoDicts;

	public Long getCveIdAtestigDictamen() {
		return cveIdAtestigDictamen;
	}

	public void setCveIdAtestigDictamen(Long cveIdAtestigDictamen) {
		this.cveIdAtestigDictamen = cveIdAtestigDictamen;
	}

	public Long getCveIdDictamen() {
		return cveIdDictamen;
	}

	public void setCveIdDictamen(Long cveIdDictamen) {
		this.cveIdDictamen = cveIdDictamen;
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

	public NdcAtestiguamientoDTO getNdcAtestiguamiento() {
		return ndcAtestiguamiento;
	}

	public void setNdcAtestiguamiento(NdcAtestiguamientoDTO ndcAtestiguamiento) {
		this.ndcAtestiguamiento = ndcAtestiguamiento;
	}

	public List<NdtRubroAtestiguamientoDictDTO> getListNdtRubroAtestiguamientoDicts() {
		return listNdtRubroAtestiguamientoDicts;
	}

	public void setListNdtRubroAtestiguamientoDicts(List<NdtRubroAtestiguamientoDictDTO> listNdtRubroAtestiguamientoDicts) {
		this.listNdtRubroAtestiguamientoDicts = listNdtRubroAtestiguamientoDicts;
	}

}
