package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class RubroAtestiguamientoDictTO extends BaseTO{

	private static final long serialVersionUID = 6254254626875035668L;
	private Long cveIdRubroAtestigDictamen;
    private Short indAplica;
    private Date fecRegistroAlta;
    private Date fecRegistroBaja;
    private Date fecRegistroActualizado;
    private String cveIdUsuario;
    private AtestiguamientoDictamenTO cveIdAtestigDictamen;
    private RubroTO cveIdRubro;
    private List<AtestigPreguntasRespuestTO> ndtAtestigPreguntasRespuestDOList;
    
	public Long getCveIdRubroAtestigDictamen() {
		return cveIdRubroAtestigDictamen;
	}
	public void setCveIdRubroAtestigDictamen(Long cveIdRubroAtestigDictamen) {
		this.cveIdRubroAtestigDictamen = cveIdRubroAtestigDictamen;
	}
	public Short getIndAplica() {
		return indAplica;
	}
	public void setIndAplica(Short indAplica) {
		this.indAplica = indAplica;
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
	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado;
	}
	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}
	public String getCveIdUsuario() {
		return cveIdUsuario;
	}
	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}
	public AtestiguamientoDictamenTO getCveIdAtestigDictamen() {
		return cveIdAtestigDictamen;
	}
	public void setCveIdAtestigDictamen(AtestiguamientoDictamenTO cveIdAtestigDictamen) {
		this.cveIdAtestigDictamen = cveIdAtestigDictamen;
	}
	public RubroTO getCveIdRubro() {
		return cveIdRubro;
	}
	public void setCveIdRubro(RubroTO cveIdRubro) {
		this.cveIdRubro = cveIdRubro;
	}
	public List<AtestigPreguntasRespuestTO> getNdtAtestigPreguntasRespuestDOList() {
		return ndtAtestigPreguntasRespuestDOList;
	}
	public void setNdtAtestigPreguntasRespuestDOList(List<AtestigPreguntasRespuestTO> ndtAtestigPreguntasRespuestDOList) {
		this.ndtAtestigPreguntasRespuestDOList = ndtAtestigPreguntasRespuestDOList;
	}
    
    
}
