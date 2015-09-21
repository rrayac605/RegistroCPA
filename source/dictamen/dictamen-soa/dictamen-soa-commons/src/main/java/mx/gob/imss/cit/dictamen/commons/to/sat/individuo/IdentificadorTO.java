package mx.gob.imss.cit.dictamen.commons.to.sat.individuo;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class IdentificadorTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String identificadora;
	private Long idIdentificador;
	private PersonaTO persona;
	private TipoIdentificadorTO tipoIdentificador;
	private Long vigente;
	/**
	 * @return the identificadora
	 */
	public String getIdentificadora() {
		return identificadora;
	}
	/**
	 * @param identificadora the identificadora to set
	 */
	public void setIdentificadora(String identificadora) {
		this.identificadora = identificadora;
	}
	/**
	 * @return the idIdentificador
	 */
	public Long getIdIdentificador() {
		return idIdentificador;
	}
	/**
	 * @param idIdentificador the idIdentificador to set
	 */
	public void setIdIdentificador(Long idIdentificador) {
		this.idIdentificador = idIdentificador;
	}
	/**
	 * @return the persona
	 */
	public PersonaTO getPersona() {
		return persona;
	}
	/**
	 * @param persona the persona to set
	 */
	public void setPersona(PersonaTO persona) {
		this.persona = persona;
	}
	/**
	 * @return the tipoIdentificador
	 */
	public TipoIdentificadorTO getTipoIdentificador() {
		return tipoIdentificador;
	}
	/**
	 * @param tipoIdentificador the tipoIdentificador to set
	 */
	public void setTipoIdentificador(TipoIdentificadorTO tipoIdentificador) {
		this.tipoIdentificador = tipoIdentificador;
	}
	/**
	 * @return the vigente
	 */
	public Long getVigente() {
		return vigente;
	}
	/**
	 * @param vigente the vigente to set
	 */
	public void setVigente(Long vigente) {
		this.vigente = vigente;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idIdentificador == null) ? 0 : idIdentificador.hashCode());
		result = prime * result + ((identificadora == null) ? 0 : identificadora.hashCode());
		result = prime * result + ((persona == null) ? 0 : persona.hashCode());
		result = prime * result + ((tipoIdentificador == null) ? 0 : tipoIdentificador.hashCode());
		result = prime * result + ((vigente == null) ? 0 : vigente.hashCode());
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
		IdentificadorTO other = (IdentificadorTO) obj;
		if (idIdentificador == null) {
			if (other.idIdentificador != null)
				return false;
		} else if (!idIdentificador.equals(other.idIdentificador))
			return false;
		if (identificadora == null) {
			if (other.identificadora != null)
				return false;
		} else if (!identificadora.equals(other.identificadora))
			return false;
		if (persona == null) {
			if (other.persona != null)
				return false;
		} else if (!persona.equals(other.persona))
			return false;
		if (tipoIdentificador == null) {
			if (other.tipoIdentificador != null)
				return false;
		} else if (!tipoIdentificador.equals(other.tipoIdentificador))
			return false;
		if (vigente == null) {
			if (other.vigente != null)
				return false;
		} else if (!vigente.equals(other.vigente))
			return false;
		return true;
	}
}
