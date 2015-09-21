package mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to;

import java.util.ArrayList;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class MunicipioTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String clave;
	private EntidadFederativaTO entidadFederativa;
	private List<LocalidadTO> localidades = new ArrayList<LocalidadTO>();
	private String nombre;
	/**
	 * @return the clave
	 */
	public String getClave() {
		return clave;
	}
	/**
	 * @param clave the clave to set
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}
	/**
	 * @return the entidadFederativa
	 */
	public EntidadFederativaTO getEntidadFederativa() {
		return entidadFederativa;
	}
	/**
	 * @param entidadFederativa the entidadFederativa to set
	 */
	public void setEntidadFederativa(EntidadFederativaTO entidadFederativa) {
		this.entidadFederativa = entidadFederativa;
	}
	/**
	 * @return the localidades
	 */
	public List<LocalidadTO> getLocalidades() {
		return localidades;
	}
	/**
	 * @param localidades the localidades to set
	 */
	public void setLocalidades(List<LocalidadTO> localidades) {
		this.localidades = localidades;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clave == null) ? 0 : clave.hashCode());
		result = prime * result + ((entidadFederativa == null) ? 0 : entidadFederativa.hashCode());
		result = prime * result + ((localidades == null) ? 0 : localidades.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		MunicipioTO other = (MunicipioTO) obj;
		if (clave == null) {
			if (other.clave != null)
				return false;
		} else if (!clave.equals(other.clave))
			return false;
		if (entidadFederativa == null) {
			if (other.entidadFederativa != null)
				return false;
		} else if (!entidadFederativa.equals(other.entidadFederativa))
			return false;
		if (localidades == null) {
			if (other.localidades != null)
				return false;
		} else if (!localidades.equals(other.localidades))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
}
