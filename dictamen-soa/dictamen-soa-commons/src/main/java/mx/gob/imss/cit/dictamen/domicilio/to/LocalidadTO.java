package mx.gob.imss.cit.dictamen.domicilio.to;

import java.util.ArrayList;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.BaseTO;

public class LocalidadTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<AsentamientoTO> asentaminetos = new ArrayList<AsentamientoTO>();
	private String clave;
	private MunicipioTO municipio;
	private String nombre;
	
	public List<AsentamientoTO> getAsentaminetos() {
		return asentaminetos;
	}
	public void setAsentaminetos(List<AsentamientoTO> asentaminetos) {
		this.asentaminetos = asentaminetos;
	}
	public void addAsentamiento(AsentamientoTO asentamiento){
		this.asentaminetos.add(asentamiento);
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public MunicipioTO getMunicipio() {
		return municipio;
	}
	public void setMunicipio(MunicipioTO municipio) {
		this.municipio = municipio;
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
		result = prime * result + ((asentaminetos == null) ? 0 : asentaminetos.hashCode());
		result = prime * result + ((clave == null) ? 0 : clave.hashCode());
		result = prime * result + ((municipio == null) ? 0 : municipio.hashCode());
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
		LocalidadTO other = (LocalidadTO) obj;
		if (asentaminetos == null) {
			if (other.asentaminetos != null)
				return false;
		} else if (!asentaminetos.equals(other.asentaminetos))
			return false;
		if (clave == null) {
			if (other.clave != null)
				return false;
		} else if (!clave.equals(other.clave))
			return false;
		if (municipio == null) {
			if (other.municipio != null)
				return false;
		} else if (!municipio.equals(other.municipio))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
}
