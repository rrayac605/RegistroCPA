package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdcFormaPagoDTO implements Serializable {

	private static final long serialVersionUID = -6406411186558989480L;

	private Long cveIdFormaPago;
	private String desFormaPago;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private NdcTipoPagoDTO ndcTipoPago;

	public Long getCveIdFormaPago() {
		return cveIdFormaPago;
	}

	public void setCveIdFormaPago(Long cveIdFormaPago) {
		this.cveIdFormaPago = cveIdFormaPago;
	}

	public String getDesFormaPago() {
		return desFormaPago;
	}

	public void setDesFormaPago(String desFormaPago) {
		this.desFormaPago = desFormaPago;
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

	public NdcTipoPagoDTO getNdcTipoPago() {
		return ndcTipoPago;
	}

	public void setNdcTipoPago(NdcTipoPagoDTO ndcTipoPago) {
		this.ndcTipoPago = ndcTipoPago;
	}

}
