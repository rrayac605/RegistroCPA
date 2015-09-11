package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class CatAdministracionTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5263355890671345583L;

	private long cveCac;

	private String nombre;

	private List<DomiciliosCarreterasTO> dgDomiciliosCarreteras;

	/**
	 * @return the cveCac
	 */
	public long getCveCac() {
		return cveCac;
	}

	/**
	 * @param cveCac the cveCac to set
	 */
	public void setCveCac(long cveCac) {
		this.cveCac = cveCac;
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
	 * @return the dgDomiciliosCarreteras
	 */
	public List<DomiciliosCarreterasTO> getDgDomiciliosCarreteras() {
		return dgDomiciliosCarreteras;
	}

	/**
	 * @param dgDomiciliosCarreteras the dgDomiciliosCarreteras to set
	 */
	public void setDgDomiciliosCarreteras(
			List<DomiciliosCarreterasTO> dgDomiciliosCarreteras) {
		this.dgDomiciliosCarreteras = dgDomiciliosCarreteras;
	}

	
	
	
}
