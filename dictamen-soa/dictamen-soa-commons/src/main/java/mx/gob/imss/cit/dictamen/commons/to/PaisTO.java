package mx.gob.imss.cit.dictamen.commons.to;

import java.util.Date;

public class PaisTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2065766024699628243L;


	private long cveIdPais;

	private String desNacionalidad;

	private String desPais;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private String siglas;

	public long getCveIdPais() {
		return cveIdPais;
	}

	public void setCveIdPais(long cveIdPais) {
		this.cveIdPais = cveIdPais;
	}

	public String getDesNacionalidad() {
		return desNacionalidad;
	}

	public void setDesNacionalidad(String desNacionalidad) {
		this.desNacionalidad = desNacionalidad;
	}

	public String getDesPais() {
		return desPais;
	}

	public void setDesPais(String desPais) {
		this.desPais = desPais;
	}

	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado != null ? (Date) fecRegistroActualizado.clone() : null;
	}

	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	public Date getFecRegistroAlta() {
		return fecRegistroAlta != null ? (Date) fecRegistroAlta.clone() : null;
	}

	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	public Date getFecRegistroBaja() {
		return fecRegistroBaja != null ? (Date) fecRegistroBaja.clone() : null;
	}

	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	public String getSiglas() {
		return siglas;
	}

	public void setSiglas(String siglas) {
		this.siglas = siglas;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PaisTO [cveIdPais=" + cveIdPais + ", desNacionalidad="
				+ desNacionalidad + ", desPais=" + desPais
				+ ", fecRegistroActualizado=" + fecRegistroActualizado
				+ ", fecRegistroAlta=" + fecRegistroAlta + ", fecRegistroBaja="
				+ fecRegistroBaja + ", siglas=" + siglas + "]";
	}

	
	
}
