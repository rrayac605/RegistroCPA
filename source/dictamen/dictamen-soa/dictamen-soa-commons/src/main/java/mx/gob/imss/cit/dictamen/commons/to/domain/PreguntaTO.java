package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class PreguntaTO extends BaseTO {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6522227905470930975L;
	private Long cveIdPregunta;
    private String desPregunta;
    private Date fecRegistroAlta;
    private Date fecRegistroActualizado;
    private Date fecRegistroBaja;
    private Integer indOrden;
    private RubroTO cveIdRubro;
    private PreguntaTO cveIdPreguntaPadre;
    private List<OpcionPreguntaTO> ndcOpcionPreguntaDOList;
    
    
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
	public Date getFecRegistroAlta() {
		return fecRegistroAlta;
	}
	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}
	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado;
	}
	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}
	public Date getFecRegistroBaja() {
		return fecRegistroBaja;
	}
	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}
	public Integer getIndOrden() {
		return indOrden;
	}
	public void setIndOrden(Integer indOrden) {
		this.indOrden = indOrden;
	}
	public RubroTO getCveIdRubro() {
		return cveIdRubro;
	}
	public void setCveIdRubro(RubroTO cveIdRubro) {
		this.cveIdRubro = cveIdRubro;
	}
	public PreguntaTO getCveIdPreguntaPadre() {
		return cveIdPreguntaPadre;
	}
	public void setCveIdPreguntaPadre(PreguntaTO cveIdPreguntaPadre) {
		this.cveIdPreguntaPadre = cveIdPreguntaPadre;
	}
	public List<OpcionPreguntaTO> getNdcOpcionPreguntaDOList() {
		return ndcOpcionPreguntaDOList;
	}
	public void setNdcOpcionPreguntaDOList(List<OpcionPreguntaTO> ndcOpcionPreguntaDOList) {
		this.ndcOpcionPreguntaDOList = ndcOpcionPreguntaDOList;
	}
    
    
    
}
