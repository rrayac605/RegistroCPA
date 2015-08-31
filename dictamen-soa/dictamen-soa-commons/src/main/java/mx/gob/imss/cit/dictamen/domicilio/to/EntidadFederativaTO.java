package mx.gob.imss.cit.dictamen.domicilio.to;

import java.util.ArrayList;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.BaseTO;

public class EntidadFederativaTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String clave;
	private String claveRenapo;
	private Long idRenapo;
	private List<MunicipioTO> municipios = new ArrayList<MunicipioTO>();
	private String nombre;
	
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getClaveRenapo() {
		return claveRenapo;
	}
	public void setClaveRenapo(String claveRenapo) {
		this.claveRenapo = claveRenapo;
	}
	public Long getIdRenapo() {
		return idRenapo;
	}
	public void setIdRenapo(Long idRenapo) {
		this.idRenapo = idRenapo;
	}
	public List<MunicipioTO> getMunicipios() {
		return municipios;
	}
	public void setMunicipios(List<MunicipioTO> municipios) {
		this.municipios = municipios;
	}
	public void addMunicipio(MunicipioTO municipio){
		this.municipios.add(municipio);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clave == null) ? 0 : clave.hashCode());
		result = prime * result + ((claveRenapo == null) ? 0 : claveRenapo.hashCode());
		result = prime * result + ((idRenapo == null) ? 0 : idRenapo.hashCode());
		result = prime * result + ((municipios == null) ? 0 : municipios.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EntidadFederativaTO other = (EntidadFederativaTO) obj;
		if (clave == null) {
			if (other.clave != null)
				return false;
		} else if (!clave.equals(other.clave))
			return false;
		if (claveRenapo == null) {
			if (other.claveRenapo != null)
				return false;
		} else if (!claveRenapo.equals(other.claveRenapo))
			return false;
		if (idRenapo == null) {
			if (other.idRenapo != null)
				return false;
		} else if (!idRenapo.equals(other.idRenapo))
			return false;
		if (municipios == null) {
			if (other.municipios != null)
				return false;
		} else if (!municipios.equals(other.municipios))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
}
