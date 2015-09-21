package mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class TipoPoderTO extends BaseTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4032988784435275172L;
	private String desTipoPoder;
	private Integer idTipoPoder;
	public String getDesTipoPoder() {
		return desTipoPoder;
	}
	public void setDesTipoPoder(String desTipoPoder) {
		this.desTipoPoder = desTipoPoder;
	}
	public Integer getIdTipoPoder() {
		return idTipoPoder;
	}
	public void setIdTipoPoder(Integer idTipoPoder) {
		this.idTipoPoder = idTipoPoder;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((desTipoPoder == null) ? 0 : desTipoPoder.hashCode());
		result = prime * result + ((idTipoPoder == null) ? 0 : idTipoPoder.hashCode());
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
		TipoPoderTO other = (TipoPoderTO) obj;
		if (desTipoPoder == null) {
			if (other.desTipoPoder != null)
				return false;
		} else if (!desTipoPoder.equals(other.desTipoPoder))
			return false;
		if (idTipoPoder == null) {
			if (other.idTipoPoder != null)
				return false;
		} else if (!idTipoPoder.equals(other.idTipoPoder))
			return false;
		return true;
	}
	
	

}
