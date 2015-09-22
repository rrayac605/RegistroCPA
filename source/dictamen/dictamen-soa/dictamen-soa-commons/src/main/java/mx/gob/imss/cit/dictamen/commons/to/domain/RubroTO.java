package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.math.BigInteger;
import java.util.Date;


import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class RubroTO extends BaseTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3863533582583699591L;
	private Long cveIdRubro;
	private AtestiguamientoTO cveIdAtestiguamiento;
	private String desRubro;
	private Date fecAltaRegistro;
    private Date fecActualizadoRegistro;
    private Date fecBajaRegistro;
    private BigInteger indOrden;
    
	public Long getCveIdRubro() {
		return cveIdRubro;
	}
	public void setCveIdRubro(Long cveIdRubro) {
		this.cveIdRubro = cveIdRubro;
	}
	public AtestiguamientoTO getCveIdAtestiguamiento() {
		return cveIdAtestiguamiento;
	}
	public void setCveIdAtestiguamiento(AtestiguamientoTO cveIdAtestiguamiento) {
		this.cveIdAtestiguamiento = cveIdAtestiguamiento;
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
	public BigInteger getIndOrden() {
		return indOrden;
	}
	public void setIndOrden(BigInteger indOrden) {
		this.indOrden = indOrden;
	}
    
}
