package mx.gob.imss.cit.dictamen.commons.to.domain;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;


public class DomiciliosCaminosTO extends BaseTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5329786684774256598L;

	private long domicilioId;

	private String cadenamiento;

	private String destino;

	private String nomvial;

	private String origen;

	private CatMargenTO dgCatMargen;

	private CatTermGenTO dgCatTermGen;

	private DomicilioGeograficoTO dgDomicilioGeografico;

	/**
	 * @return the domicilioId
	 */
	public long getDomicilioId() {
		return domicilioId;
	}

	/**
	 * @param domicilioId the domicilioId to set
	 */
	public void setDomicilioId(long domicilioId) {
		this.domicilioId = domicilioId;
	}

	/**
	 * @return the cadenamiento
	 */
	public String getCadenamiento() {
		return cadenamiento;
	}

	/**
	 * @param cadenamiento the cadenamiento to set
	 */
	public void setCadenamiento(String cadenamiento) {
		this.cadenamiento = cadenamiento;
	}

	/**
	 * @return the destino
	 */
	public String getDestino() {
		return destino;
	}

	/**
	 * @param destino the destino to set
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}

	/**
	 * @return the nomvial
	 */
	public String getNomvial() {
		return nomvial;
	}

	/**
	 * @param nomvial the nomvial to set
	 */
	public void setNomvial(String nomvial) {
		this.nomvial = nomvial;
	}

	/**
	 * @return the origen
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	/**
	 * @return the dgCatMargen
	 */
	public CatMargenTO getDgCatMargen() {
		return dgCatMargen;
	}

	/**
	 * @param dgCatMargen the dgCatMargen to set
	 */
	public void setDgCatMargen(CatMargenTO dgCatMargen) {
		this.dgCatMargen = dgCatMargen;
	}

	/**
	 * @return the dgCatTermGen
	 */
	public CatTermGenTO getDgCatTermGen() {
		return dgCatTermGen;
	}

	/**
	 * @param dgCatTermGen the dgCatTermGen to set
	 */
	public void setDgCatTermGen(CatTermGenTO dgCatTermGen) {
		this.dgCatTermGen = dgCatTermGen;
	}

	/**
	 * @return the dgDomicilioGeografico
	 */
	public DomicilioGeograficoTO getDgDomicilioGeografico() {
		return dgDomicilioGeografico;
	}

	/**
	 * @param dgDomicilioGeografico the dgDomicilioGeografico to set
	 */
	public void setDgDomicilioGeografico(DomicilioGeograficoTO dgDomicilioGeografico) {
		this.dgDomicilioGeografico = dgDomicilioGeografico;
	}

	
	
}
