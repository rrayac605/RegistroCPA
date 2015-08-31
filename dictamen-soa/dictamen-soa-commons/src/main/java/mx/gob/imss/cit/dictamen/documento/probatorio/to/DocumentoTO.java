package mx.gob.imss.cit.dictamen.documento.probatorio.to;

import mx.gob.imss.cit.dictamen.commons.to.BaseTO;

public class DocumentoTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Long cveIdDocumento;
	protected String desDocumento;
	/**
	 * @return the cveIdDocumento
	 */
	public Long getCveIdDocumento() {
		return cveIdDocumento;
	}
	/**
	 * @param cveIdDocumento the cveIdDocumento to set
	 */
	public void setCveIdDocumento(Long cveIdDocumento) {
		this.cveIdDocumento = cveIdDocumento;
	}
	/**
	 * @return the desDocumento
	 */
	public String getDesDocumento() {
		return desDocumento;
	}
	/**
	 * @param desDocumento the desDocumento to set
	 */
	public void setDesDocumento(String desDocumento) {
		this.desDocumento = desDocumento;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cveIdDocumento == null) ? 0 : cveIdDocumento.hashCode());
		result = prime * result + ((desDocumento == null) ? 0 : desDocumento.hashCode());
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
		DocumentoTO other = (DocumentoTO) obj;
		if (cveIdDocumento == null) {
			if (other.cveIdDocumento != null)
				return false;
		} else if (!cveIdDocumento.equals(other.cveIdDocumento))
			return false;
		if (desDocumento == null) {
			if (other.desDocumento != null)
				return false;
		} else if (!desDocumento.equals(other.desDocumento))
			return false;
		return true;
	}
	
}
