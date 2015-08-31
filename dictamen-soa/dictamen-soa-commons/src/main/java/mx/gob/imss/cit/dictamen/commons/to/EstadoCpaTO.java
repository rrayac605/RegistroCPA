package mx.gob.imss.cit.dictamen.commons.to;

import java.util.Date;
import java.util.List;

public class EstadoCpaTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5865615369496600503L;

	private long cveIdEstadoCpa;

	private String desEstadoCpa;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private List<ContadorPublicoTO> ndtContadorPublicoAuts;

	private List<RegBajaReactivTO> ndtRegBajaReactivs;

	/**
	 * @return the cveIdEstadoCpa
	 */
	public long getCveIdEstadoCpa() {
		return cveIdEstadoCpa;
	}

	/**
	 * @param cveIdEstadoCpa the cveIdEstadoCpa to set
	 */
	public void setCveIdEstadoCpa(long cveIdEstadoCpa) {
		this.cveIdEstadoCpa = cveIdEstadoCpa;
	}

	/**
	 * @return the desEstadoCpa
	 */
	public String getDesEstadoCpa() {
		return desEstadoCpa;
	}

	/**
	 * @param desEstadoCpa the desEstadoCpa to set
	 */
	public void setDesEstadoCpa(String desEstadoCpa) {
		this.desEstadoCpa = desEstadoCpa;
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
	 * @return the ndtContadorPublicoAuts
	 */
	public List<ContadorPublicoTO> getNdtContadorPublicoAuts() {
		return ndtContadorPublicoAuts;
	}

	/**
	 * @param ndtContadorPublicoAuts the ndtContadorPublicoAuts to set
	 */
	public void setNdtContadorPublicoAuts(
			List<ContadorPublicoTO> ndtContadorPublicoAuts) {
		this.ndtContadorPublicoAuts = ndtContadorPublicoAuts;
	}

	/**
	 * @return the ndtRegBajaReactivs
	 */
	public List<RegBajaReactivTO> getNdtRegBajaReactivs() {
		return ndtRegBajaReactivs;
	}

	/**
	 * @param ndtRegBajaReactivs the ndtRegBajaReactivs to set
	 */
	public void setNdtRegBajaReactivs(List<RegBajaReactivTO> ndtRegBajaReactivs) {
		this.ndtRegBajaReactivs = ndtRegBajaReactivs;
	}

	
	
}
