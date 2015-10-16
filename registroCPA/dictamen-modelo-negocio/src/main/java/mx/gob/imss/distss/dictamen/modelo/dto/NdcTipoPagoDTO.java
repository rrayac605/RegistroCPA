package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class NdcTipoPagoDTO implements Serializable {

	private static final long serialVersionUID = -1667507334748841360L;

	private Long cveIdTipoPago;
	private String desTipoPago;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private List<NdcFormaPagoDTO> listNdcFormaPagos;

	public Long getCveIdTipoPago() {
		return cveIdTipoPago;
	}

	public void setCveIdTipoPago(Long cveIdTipoPago) {
		this.cveIdTipoPago = cveIdTipoPago;
	}

	public String getDesTipoPago() {
		return desTipoPago;
	}

	public void setDesTipoPago(String desTipoPago) {
		this.desTipoPago = desTipoPago;
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

	public List<NdcFormaPagoDTO> getListNdcFormaPagos() {
		return listNdcFormaPagos;
	}

	public void setListNdcFormaPagos(List<NdcFormaPagoDTO> listNdcFormaPagos) {
		this.listNdcFormaPagos = listNdcFormaPagos;
	}

}
