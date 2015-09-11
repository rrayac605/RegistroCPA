package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class CatAmbitoTO extends BaseTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3349752109744281808L;

	private long ambito;

	private String nombre;


	private List<CatLocalidadTO> dgCatLocalidads;

	private List<VialidadTO> dgVialidads;

	/**
	 * @return the ambito
	 */
	public long getAmbito() {
		return ambito;
	}

	/**
	 * @param ambito the ambito to set
	 */
	public void setAmbito(long ambito) {
		this.ambito = ambito;
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

	/**
	 * @return the dgCatLocalidads
	 */
	public List<CatLocalidadTO> getDgCatLocalidads() {
		return dgCatLocalidads;
	}

	/**
	 * @param dgCatLocalidads the dgCatLocalidads to set
	 */
	public void setDgCatLocalidads(List<CatLocalidadTO> dgCatLocalidads) {
		this.dgCatLocalidads = dgCatLocalidads;
	}

	/**
	 * @return the dgVialidads
	 */
	public List<VialidadTO> getDgVialidads() {
		return dgVialidads;
	}

	/**
	 * @param dgVialidads the dgVialidads to set
	 */
	public void setDgVialidads(List<VialidadTO> dgVialidads) {
		this.dgVialidads = dgVialidads;
	}
	
	
	
}
