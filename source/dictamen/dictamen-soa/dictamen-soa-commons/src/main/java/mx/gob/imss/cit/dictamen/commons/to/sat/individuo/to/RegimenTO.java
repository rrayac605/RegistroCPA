package mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class RegimenTO extends BaseTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String claveRegimen;
	private String descripcionRegimen;
	private String fechaAltaReg;
	private String fechabajaReg;
	private String fechaEfectoAReg;
	private String fechaEfectoBReg;
	public String getClaveRegimen() {
		return claveRegimen;
	}
	public void setClaveRegimen(String claveRegimen) {
		this.claveRegimen = claveRegimen;
	}
	public String getDescripcionRegimen() {
		return descripcionRegimen;
	}
	public void setDescripcionRegimen(String descripcionRegimen) {
		this.descripcionRegimen = descripcionRegimen;
	}
	public String getFechaAltaReg() {
		return fechaAltaReg;
	}
	public void setFechaAltaReg(String fechaAltaReg) {
		this.fechaAltaReg = fechaAltaReg;
	}
	public String getFechabajaReg() {
		return fechabajaReg;
	}
	public void setFechabajaReg(String fechabajaReg) {
		this.fechabajaReg = fechabajaReg;
	}
	public String getFechaEfectoAReg() {
		return fechaEfectoAReg;
	}
	public void setFechaEfectoAReg(String fechaEfectoAReg) {
		this.fechaEfectoAReg = fechaEfectoAReg;
	}
	public String getFechaEfectoBReg() {
		return fechaEfectoBReg;
	}
	public void setFechaEfectoBReg(String fechaEfectoBReg) {
		this.fechaEfectoBReg = fechaEfectoBReg;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((claveRegimen == null) ? 0 : claveRegimen.hashCode());
		result = prime * result + ((descripcionRegimen == null) ? 0 : descripcionRegimen.hashCode());
		result = prime * result + ((fechaAltaReg == null) ? 0 : fechaAltaReg.hashCode());
		result = prime * result + ((fechaEfectoAReg == null) ? 0 : fechaEfectoAReg.hashCode());
		result = prime * result + ((fechaEfectoBReg == null) ? 0 : fechaEfectoBReg.hashCode());
		result = prime * result + ((fechabajaReg == null) ? 0 : fechabajaReg.hashCode());
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
		RegimenTO other = (RegimenTO) obj;
		if (claveRegimen == null) {
			if (other.claveRegimen != null)
				return false;
		} else if (!claveRegimen.equals(other.claveRegimen))
			return false;
		if (descripcionRegimen == null) {
			if (other.descripcionRegimen != null)
				return false;
		} else if (!descripcionRegimen.equals(other.descripcionRegimen))
			return false;
		if (fechaAltaReg == null) {
			if (other.fechaAltaReg != null)
				return false;
		} else if (!fechaAltaReg.equals(other.fechaAltaReg))
			return false;
		if (fechaEfectoAReg == null) {
			if (other.fechaEfectoAReg != null)
				return false;
		} else if (!fechaEfectoAReg.equals(other.fechaEfectoAReg))
			return false;
		if (fechaEfectoBReg == null) {
			if (other.fechaEfectoBReg != null)
				return false;
		} else if (!fechaEfectoBReg.equals(other.fechaEfectoBReg))
			return false;
		if (fechabajaReg == null) {
			if (other.fechabajaReg != null)
				return false;
		} else if (!fechabajaReg.equals(other.fechabajaReg))
			return false;
		return true;
	}
	
}
