package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.math.BigInteger;
import java.util.Date;
import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class PreguntaTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5456592500183571783L;
	private Long cveIdPregunta;
	private RubroTO cveIdRubro;
	private String desPregunta;
	private PreguntaTO cveIdPreguntaPadre;
	private Date fecRegistroAlta;
    private Date fecRegistroActualizado;
    private Date fecRegistroBaja;
    private BigInteger indOrden;
	public Long getCveIdPregunta() {
		return cveIdPregunta;
	}
	public void setCveIdPregunta(Long cveIdPregunta) {
		this.cveIdPregunta = cveIdPregunta;
	}
	public RubroTO getCveIdRubro() {
		return cveIdRubro;
	}
	public void setCveIdRubro(RubroTO cveIdRubro) {
		this.cveIdRubro = cveIdRubro;
	}
	public String getDesPregunta() {
		return desPregunta;
	}
	public void setDesPregunta(String desPregunta) {
		this.desPregunta = desPregunta;
	}
	public PreguntaTO getCveIdPreguntaPadre() {
		return cveIdPreguntaPadre;
	}
	public void setCveIdPreguntaPadre(PreguntaTO cveIdPreguntaPadre) {
		this.cveIdPreguntaPadre = cveIdPreguntaPadre;
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
	public BigInteger getIndOrden() {
		return indOrden;
	}
	public void setIndOrden(BigInteger indOrden) {
		this.indOrden = indOrden;
	}

}
