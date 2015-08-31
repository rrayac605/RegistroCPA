package mx.gob.imss.cit.dictamen.individuo.to;

import mx.gob.imss.cit.dictamen.commons.to.BaseTO;

public class TipoIdentificadorTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String desIdentificador;
	private Long idTipoIdentificador;
	/**
	 * @return the desIdentificador
	 */
	public String getDesIdentificador() {
		return desIdentificador;
	}
	/**
	 * @param desIdentificador the desIdentificador to set
	 */
	public void setDesIdentificador(String desIdentificador) {
		this.desIdentificador = desIdentificador;
	}
	/**
	 * @return the idTipoIdentificador
	 */
	public Long getIdTipoIdentificador() {
		return idTipoIdentificador;
	}
	/**
	 * @param idTipoIdentificador the idTipoIdentificador to set
	 */
	public void setIdTipoIdentificador(Long idTipoIdentificador) {
		this.idTipoIdentificador = idTipoIdentificador;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((desIdentificador == null) ? 0 : desIdentificador.hashCode());
		result = prime * result + ((idTipoIdentificador == null) ? 0 : idTipoIdentificador.hashCode());
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
		TipoIdentificadorTO other = (TipoIdentificadorTO) obj;
		if (desIdentificador == null) {
			if (other.desIdentificador != null)
				return false;
		} else if (!desIdentificador.equals(other.desIdentificador))
			return false;
		if (idTipoIdentificador == null) {
			if (other.idTipoIdentificador != null)
				return false;
		} else if (!idTipoIdentificador.equals(other.idTipoIdentificador))
			return false;
		return true;
	}
	
	
}
