package mx.gob.imss.cit.dictamen.commons.to;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class FormaContactoTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3314304279945674509L;

	private long cveIdFormaContacto;

	private BigDecimal cveIdTipoContacto;

	private String desFormaContacto;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private List<AsociacionContactoTO> ndtAsociacionContactos;

	private List<ColegioContactoTO> ndtColegioContactos;

	private List<DespachoContactoTO> ndtDespachoContactos;

	private List<TipFormaContactoTO> ndtTipFormaContactos;

	/**
	 * @return the cveIdFormaContacto
	 */
	public long getCveIdFormaContacto() {
		return cveIdFormaContacto;
	}

	/**
	 * @param cveIdFormaContacto the cveIdFormaContacto to set
	 */
	public void setCveIdFormaContacto(long cveIdFormaContacto) {
		this.cveIdFormaContacto = cveIdFormaContacto;
	}

	/**
	 * @return the cveIdTipoContacto
	 */
	public BigDecimal getCveIdTipoContacto() {
		return cveIdTipoContacto;
	}

	/**
	 * @param cveIdTipoContacto the cveIdTipoContacto to set
	 */
	public void setCveIdTipoContacto(BigDecimal cveIdTipoContacto) {
		this.cveIdTipoContacto = cveIdTipoContacto;
	}

	/**
	 * @return the desFormaContacto
	 */
	public String getDesFormaContacto() {
		return desFormaContacto;
	}

	/**
	 * @param desFormaContacto the desFormaContacto to set
	 */
	public void setDesFormaContacto(String desFormaContacto) {
		this.desFormaContacto = desFormaContacto;
	}



	/**
	 * @return the fecRegistroActualizado
	 */
	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado != null ? (Date) fecRegistroActualizado.clone() : null;
	}

	/**
	 * @param fecRegistroActualizado the fecRegistroActualizado to set
	 */
	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	/**
	 * @return the fecRegistroAlta
	 */
	public Date getFecRegistroAlta() {
		return fecRegistroAlta != null ? (Date) fecRegistroAlta.clone() : null;
	}

	/**
	 * @param fecRegistroAlta the fecRegistroAlta to set
	 */
	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	/**
	 * @return the fecRegistroBaja
	 */
	public Date getFecRegistroBaja() {
		return fecRegistroBaja != null ? (Date) fecRegistroBaja.clone() : null;
	}

	/**
	 * @param fecRegistroBaja the fecRegistroBaja to set
	 */
	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	/**
	 * @return the ndtAsociacionContactos
	 */
	public List<AsociacionContactoTO> getNdtAsociacionContactos() {
		return ndtAsociacionContactos;
	}

	/**
	 * @param ndtAsociacionContactos the ndtAsociacionContactos to set
	 */
	public void setNdtAsociacionContactos(
			List<AsociacionContactoTO> ndtAsociacionContactos) {
		this.ndtAsociacionContactos = ndtAsociacionContactos;
	}

	/**
	 * @return the ndtColegioContactos
	 */
	public List<ColegioContactoTO> getNdtColegioContactos() {
		return ndtColegioContactos;
	}

	/**
	 * @param ndtColegioContactos the ndtColegioContactos to set
	 */
	public void setNdtColegioContactos(List<ColegioContactoTO> ndtColegioContactos) {
		this.ndtColegioContactos = ndtColegioContactos;
	}

	/**
	 * @return the ndtDespachoContactos
	 */
	public List<DespachoContactoTO> getNdtDespachoContactos() {
		return ndtDespachoContactos;
	}

	/**
	 * @param ndtDespachoContactos the ndtDespachoContactos to set
	 */
	public void setNdtDespachoContactos(
			List<DespachoContactoTO> ndtDespachoContactos) {
		this.ndtDespachoContactos = ndtDespachoContactos;
	}

	/**
	 * @return the ndtTipFormaContactos
	 */
	public List<TipFormaContactoTO> getNdtTipFormaContactos() {
		return ndtTipFormaContactos;
	}

	/**
	 * @param ndtTipFormaContactos the ndtTipFormaContactos to set
	 */
	public void setNdtTipFormaContactos(
			List<TipFormaContactoTO> ndtTipFormaContactos) {
		this.ndtTipFormaContactos = ndtTipFormaContactos;
	}

	
	
}
