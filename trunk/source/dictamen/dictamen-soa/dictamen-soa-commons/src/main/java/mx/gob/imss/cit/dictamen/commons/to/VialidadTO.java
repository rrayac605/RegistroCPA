package mx.gob.imss.cit.dictamen.commons.to;


public class VialidadTO extends BaseTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4448733882338469423L;

	private long cveVia;

	private String agregada;

	private String nomVia;

	private CatAmbitoTO dgCatAmbito;

	private CatLocalidadTO dgCatLocalidad;

	private CatVialidadTO dgCatVialidad;

	/**
	 * @return the cveVia
	 */
	public long getCveVia() {
		return cveVia;
	}

	/**
	 * @param cveVia the cveVia to set
	 */
	public void setCveVia(long cveVia) {
		this.cveVia = cveVia;
	}

	/**
	 * @return the agregada
	 */
	public String getAgregada() {
		return agregada;
	}

	/**
	 * @param agregada the agregada to set
	 */
	public void setAgregada(String agregada) {
		this.agregada = agregada;
	}

	/**
	 * @return the nomVia
	 */
	public String getNomVia() {
		return nomVia;
	}

	/**
	 * @param nomVia the nomVia to set
	 */
	public void setNomVia(String nomVia) {
		this.nomVia = nomVia;
	}

	/**
	 * @return the dgCatAmbito
	 */
	public CatAmbitoTO getDgCatAmbito() {
		return dgCatAmbito;
	}

	/**
	 * @param dgCatAmbito the dgCatAmbito to set
	 */
	public void setDgCatAmbito(CatAmbitoTO dgCatAmbito) {
		this.dgCatAmbito = dgCatAmbito;
	}

	/**
	 * @return the dgCatLocalidad
	 */
	public CatLocalidadTO getDgCatLocalidad() {
		return dgCatLocalidad;
	}

	/**
	 * @param dgCatLocalidad the dgCatLocalidad to set
	 */
	public void setDgCatLocalidad(CatLocalidadTO dgCatLocalidad) {
		this.dgCatLocalidad = dgCatLocalidad;
	}

	/**
	 * @return the dgCatVialidad
	 */
	public CatVialidadTO getDgCatVialidad() {
		return dgCatVialidad;
	}

	/**
	 * @param dgCatVialidad the dgCatVialidad to set
	 */
	public void setDgCatVialidad(CatVialidadTO dgCatVialidad) {
		this.dgCatVialidad = dgCatVialidad;
	}
	
	
	
	
}
