package mx.gob.imss.cit.dictamen.commons.to;

import java.util.Date;
import java.util.List;

public class CatPeriodoTO extends BaseTO {
	private long cvePeriodo;

	private String descripcion;

	private Date fecha;

	private List<CatLocalidadTO> dgCatLocalidads;

	/**
	 * @return the cvePeriodo
	 */
	public long getCvePeriodo() {
		return cvePeriodo;
	}

	/**
	 * @param cvePeriodo the cvePeriodo to set
	 */
	public void setCvePeriodo(long cvePeriodo) {
		this.cvePeriodo = cvePeriodo;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha != null ? (Date) fecha.clone() : null;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
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

	
	

}
