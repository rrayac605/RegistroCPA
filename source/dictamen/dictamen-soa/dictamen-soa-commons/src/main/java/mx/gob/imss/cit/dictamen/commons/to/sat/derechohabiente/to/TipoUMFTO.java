package mx.gob.imss.cit.dictamen.commons.to.sat.derechohabiente.to;

import java.math.BigInteger;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class TipoUMFTO extends BaseTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3310895686497094023L;
	private String descripcion;
	private BigInteger idTipoUMF;
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public BigInteger getIdTipoUMF() {
		return idTipoUMF;
	}
	public void setIdTipoUMF(BigInteger idTipoUMF) {
		this.idTipoUMF = idTipoUMF;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((idTipoUMF == null) ? 0 : idTipoUMF.hashCode());
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
		TipoUMFTO other = (TipoUMFTO) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (idTipoUMF == null) {
			if (other.idTipoUMF != null)
				return false;
		} else if (!idTipoUMF.equals(other.idTipoUMF))
			return false;
		return true;
	}	
}
