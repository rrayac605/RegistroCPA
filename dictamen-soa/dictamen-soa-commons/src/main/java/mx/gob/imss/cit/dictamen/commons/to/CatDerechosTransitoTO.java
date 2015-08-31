package mx.gob.imss.cit.dictamen.commons.to;

import java.util.List;

public class CatDerechosTransitoTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2576263141412656551L;

	private long cveCdt;

	private String nombre;

	private List<DomiciliosCarreterasTO> dgDomiciliosCarreteras;

	/**
	 * @return the cveCdt
	 */
	public long getCveCdt() {
		return cveCdt;
	}

	/**
	 * @param cveCdt the cveCdt to set
	 */
	public void setCveCdt(long cveCdt) {
		this.cveCdt = cveCdt;
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
