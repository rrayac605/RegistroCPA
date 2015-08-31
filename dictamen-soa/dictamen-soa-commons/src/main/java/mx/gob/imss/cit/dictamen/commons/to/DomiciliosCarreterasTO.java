package mx.gob.imss.cit.dictamen.commons.to;

import java.math.BigDecimal;

public class DomiciliosCarreterasTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2805352405945905630L;

	private long domicilioId;

	private String cadenamiento;

	private BigDecimal codigo;

	private String destino;

	private String nomvial;

	private String origen;

	private CatAdministracionTO dgCatAdministracion;

	private CatDerechosTransitoTO dgCatDerechosTransito;

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
	 * @return the codigo
	 */
	public BigDecimal getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(BigDecimal codigo) {
		this.codigo = codigo;
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
	 * @return the dgCatAdministracion
	 */
	public CatAdministracionTO getDgCatAdministracion() {
		return dgCatAdministracion;
	}

	/**
	 * @param dgCatAdministracion the dgCatAdministracion to set
	 */
	public void setDgCatAdministracion(CatAdministracionTO dgCatAdministracion) {
		this.dgCatAdministracion = dgCatAdministracion;
	}

	/**
	 * @return the dgCatDerechosTransito
	 */
	public CatDerechosTransitoTO getDgCatDerechosTransito() {
		return dgCatDerechosTransito;
	}

	/**
	 * @param dgCatDerechosTransito the dgCatDerechosTransito to set
	 */
	public void setDgCatDerechosTransito(CatDerechosTransitoTO dgCatDerechosTransito) {
		this.dgCatDerechosTransito = dgCatDerechosTransito;
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
