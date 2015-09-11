package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class CatMargenTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5546566445854130039L;

	private long cveMargen;

	private String descripcion;

	private List<DomiciliosCaminosTO> dgDomiciliosCaminos;

	/**
	 * @return the cveMargen
	 */
	public long getCveMargen() {
		return cveMargen;
	}

	/**
	 * @param cveMargen the cveMargen to set
	 */
	public void setCveMargen(long cveMargen) {
		this.cveMargen = cveMargen;
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
	 * @return the dgDomiciliosCaminos
	 */
	public List<DomiciliosCaminosTO> getDgDomiciliosCaminos() {
		return dgDomiciliosCaminos;
	}

	/**
	 * @param dgDomiciliosCaminos the dgDomiciliosCaminos to set
	 */
	public void setDgDomiciliosCaminos(List<DomiciliosCaminosTO> dgDomiciliosCaminos) {
		this.dgDomiciliosCaminos = dgDomiciliosCaminos;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
