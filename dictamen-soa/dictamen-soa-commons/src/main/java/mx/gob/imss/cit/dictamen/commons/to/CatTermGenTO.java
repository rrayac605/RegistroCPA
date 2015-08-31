package mx.gob.imss.cit.dictamen.commons.to;

import java.util.List;

public class CatTermGenTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8475111541744274718L;

	private long cveTer;

	private String nombre;

	private List<DomiciliosCaminosTO> dgDomiciliosCaminos;

	private List<DomiciliosCarreterasTO> dgDomiciliosCarreteras;

	/**
	 * @return the cveTer
	 */
	public long getCveTer() {
		return cveTer;
	}

	/**
	 * @param cveTer the cveTer to set
	 */
	public void setCveTer(long cveTer) {
		this.cveTer = cveTer;
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
