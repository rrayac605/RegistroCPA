package mx.gob.imss.cit.dictamen.commons.to.sat.domicilio;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class TipoTerminoGeneralTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long clave;
	private String String;
	/**
	 * @return the clave
	 */
	public Long getClave() {
		return clave;
	}
	/**
	 * @param clave the clave to set
	 */
	public void setClave(Long clave) {
		this.clave = clave;
	}
	/**
	 * @return the string
	 */
	public String getString() {
		return String;
	}
	/**
	 * @param string the string to set
	 */
	public void setString(String string) {
		String = string;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((String == null) ? 0 : String.hashCode());
		result = prime * result + ((clave == null) ? 0 : clave.hashCode());
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
		TipoTerminoGeneralTO other = (TipoTerminoGeneralTO) obj;
		if (String == null) {
			if (other.String != null)
				return false;
		} else if (!String.equals(other.String))
			return false;
		if (clave == null) {
			if (other.clave != null)
				return false;
		} else if (!clave.equals(other.clave))
			return false;
		return true;
	}
	
	

}
