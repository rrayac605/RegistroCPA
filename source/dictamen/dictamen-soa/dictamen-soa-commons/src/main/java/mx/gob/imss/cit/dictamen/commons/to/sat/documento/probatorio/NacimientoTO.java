package mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class NacimientoTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer anio;
	private String crip;
	/**
	 * @return the anio
	 */
	public Integer getAnio() {
		return anio;
	}
	/**
	 * @param anio the anio to set
	 */
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
	/**
	 * @return the crip
	 */
	public String getCrip() {
		return crip;
	}
	/**
	 * @param crip the crip to set
	 */
	public void setCrip(String crip) {
		this.crip = crip;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anio == null) ? 0 : anio.hashCode());
		result = prime * result + ((crip == null) ? 0 : crip.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NacimientoTO other = (NacimientoTO) obj;
		if (anio == null) {
			if (other.anio != null)
				return false;
		} else if (!anio.equals(other.anio))
			return false;
		if (crip == null) {
			if (other.crip != null)
				return false;
		} else if (!crip.equals(other.crip))
			return false;
		return true;
	}
	
}
