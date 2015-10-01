package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class RubroTO extends BaseTO{

	private static final long serialVersionUID = -5269246747882446456L;
	private Long cveIdRubro;
    private String desRubro;
    private Date fecAltaRegistro;
    private Date fecActualizadoRegistro;
    private Date fecBajaRegistro;
    private Integer indOrden;
    private AtestiguamientoTO cveIdAtestiguamiento;
    private List<PreguntaTO> ndcPreguntaDOList;

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
	public Date getFecAltaRegistro() {
		return fecAltaRegistro;
	}
	public void setFecAltaRegistro(Date fecAltaRegistro) {
		this.fecAltaRegistro = fecAltaRegistro;
	}
	public Date getFecActualizadoRegistro() {
		return fecActualizadoRegistro;
	}
	public void setFecActualizadoRegistro(Date fecActualizadoRegistro) {
		this.fecActualizadoRegistro = fecActualizadoRegistro;
	}
	public Date getFecBajaRegistro() {
		return fecBajaRegistro;
	}
	public void setFecBajaRegistro(Date fecBajaRegistro) {
		this.fecBajaRegistro = fecBajaRegistro;
	}
	public Integer getIndOrden() {
		return indOrden;
	}
	public void setIndOrden(Integer indOrden) {
		this.indOrden = indOrden;
	}
	public AtestiguamientoTO getCveIdAtestiguamiento() {
		return cveIdAtestiguamiento;
	}
	public void setCveIdAtestiguamiento(AtestiguamientoTO cveIdAtestiguamiento) {
		this.cveIdAtestiguamiento = cveIdAtestiguamiento;
	}
	public List<PreguntaTO> getNdcPreguntaDOList() {
		return ndcPreguntaDOList;
	}
	public void setNdcPreguntaDOList(List<PreguntaTO> ndcPreguntaDOList) {
		this.ndcPreguntaDOList = ndcPreguntaDOList;
	}
	
	
}
