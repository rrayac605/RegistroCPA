package mx.gob.imss.cit.dictamen.commons.to;

import java.math.BigDecimal;
import java.util.Date;

public class SocioTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 226011865295599798L;

	private long cveIdSocio;

	private String desDenomRazonSocial;

	private Date fecContrato;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private BigDecimal indExtranjero;

	private BigDecimal indResidenciaExtranjero;

	private BigDecimal indTipoSocio;

	private String nomNombre;

	private String nomPrimerApellido;

	private String nomSegundoApellido;

	private String numInstrumento;

	private String numNotaria;

	private CatEstadoTO dgCatEstado;

	private PersonaFisicaTO ditPersonaFisica;

	private PersonaMoralTO ditPersonaMoral1;

	private PersonaMoralTO ditPersonaMoral2;

	/**
	 * @return the cveIdSocio
	 */
	public long getCveIdSocio() {
		return cveIdSocio;
	}

	/**
	 * @param cveIdSocio the cveIdSocio to set
	 */
	public void setCveIdSocio(long cveIdSocio) {
		this.cveIdSocio = cveIdSocio;
	}

	/**
	 * @return the desDenomRazonSocial
	 */
	public String getDesDenomRazonSocial() {
		return desDenomRazonSocial;
	}

	/**
	 * @param desDenomRazonSocial the desDenomRazonSocial to set
	 */
	public void setDesDenomRazonSocial(String desDenomRazonSocial) {
		this.desDenomRazonSocial = desDenomRazonSocial;
	}

	/**
	 * @return the fecContrato
	 */
	public Date getFecContrato() {
		return fecContrato != null ? (Date) fecContrato.clone() : null;	
	}

	/**
	 * @param fecContrato the fecContrato to set
	 */
	public void setFecContrato(Date fecContrato) {
		this.fecContrato = fecContrato;
	}



	/**
	 * @return the fecRegistroActualizado
	 */
	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado != null ? (Date) fecRegistroActualizado.clone() : null;
	}

	/**
	 * @param fecRegistroActualizado the fecRegistroActualizado to set
	 */
	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	/**
	 * @return the fecRegistroAlta
	 */
	public Date getFecRegistroAlta() {
		return fecRegistroAlta != null ? (Date) fecRegistroAlta.clone() : null;
	}

	/**
	 * @param fecRegistroAlta the fecRegistroAlta to set
	 */
	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	/**
	 * @return the fecRegistroBaja
	 */
	public Date getFecRegistroBaja() {
		return fecRegistroBaja != null ? (Date) fecRegistroBaja.clone() : null;
	}

	/**
	 * @param fecRegistroBaja the fecRegistroBaja to set
	 */
	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}


	/**
	 * @return the indExtranjero
	 */
	public BigDecimal getIndExtranjero() {
		return indExtranjero;
	}

	/**
	 * @param indExtranjero the indExtranjero to set
	 */
	public void setIndExtranjero(BigDecimal indExtranjero) {
		this.indExtranjero = indExtranjero;
	}

	/**
	 * @return the indResidenciaExtranjero
	 */
	public BigDecimal getIndResidenciaExtranjero() {
		return indResidenciaExtranjero;
	}

	/**
	 * @param indResidenciaExtranjero the indResidenciaExtranjero to set
	 */
	public void setIndResidenciaExtranjero(BigDecimal indResidenciaExtranjero) {
		this.indResidenciaExtranjero = indResidenciaExtranjero;
	}

	/**
	 * @return the indTipoSocio
	 */
	public BigDecimal getIndTipoSocio() {
		return indTipoSocio;
	}

	/**
	 * @param indTipoSocio the indTipoSocio to set
	 */
	public void setIndTipoSocio(BigDecimal indTipoSocio) {
		this.indTipoSocio = indTipoSocio;
	}

	/**
	 * @return the nomNombre
	 */
	public String getNomNombre() {
		return nomNombre;
	}

	/**
	 * @param nomNombre the nomNombre to set
	 */
	public void setNomNombre(String nomNombre) {
		this.nomNombre = nomNombre;
	}

	/**
	 * @return the nomPrimerApellido
	 */
	public String getNomPrimerApellido() {
		return nomPrimerApellido;
	}

	/**
	 * @param nomPrimerApellido the nomPrimerApellido to set
	 */
	public void setNomPrimerApellido(String nomPrimerApellido) {
		this.nomPrimerApellido = nomPrimerApellido;
	}

	/**
	 * @return the nomSegundoApellido
	 */
	public String getNomSegundoApellido() {
		return nomSegundoApellido;
	}

	/**
	 * @param nomSegundoApellido the nomSegundoApellido to set
	 */
	public void setNomSegundoApellido(String nomSegundoApellido) {
		this.nomSegundoApellido = nomSegundoApellido;
	}

	/**
	 * @return the numInstrumento
	 */
	public String getNumInstrumento() {
		return numInstrumento;
	}

	/**
	 * @param numInstrumento the numInstrumento to set
	 */
	public void setNumInstrumento(String numInstrumento) {
		this.numInstrumento = numInstrumento;
	}

	/**
	 * @return the numNotaria
	 */
	public String getNumNotaria() {
		return numNotaria;
	}

	/**
	 * @param numNotaria the numNotaria to set
	 */
	public void setNumNotaria(String numNotaria) {
		this.numNotaria = numNotaria;
	}

	/**
	 * @return the dgCatEstado
	 */
	public CatEstadoTO getDgCatEstado() {
		return dgCatEstado;
	}

	/**
	 * @param dgCatEstado the dgCatEstado to set
	 */
	public void setDgCatEstado(CatEstadoTO dgCatEstado) {
		this.dgCatEstado = dgCatEstado;
	}

	/**
	 * @return the ditPersonaFisica
	 */
	public PersonaFisicaTO getDitPersonaFisica() {
		return ditPersonaFisica;
	}

	/**
	 * @param ditPersonaFisica the ditPersonaFisica to set
	 */
	public void setDitPersonaFisica(PersonaFisicaTO ditPersonaFisica) {
		this.ditPersonaFisica = ditPersonaFisica;
	}

	/**
	 * @return the ditPersonaMoral1
	 */
	public PersonaMoralTO getDitPersonaMoral1() {
		return ditPersonaMoral1;
	}

	/**
	 * @param ditPersonaMoral1 the ditPersonaMoral1 to set
	 */
	public void setDitPersonaMoral1(PersonaMoralTO ditPersonaMoral1) {
		this.ditPersonaMoral1 = ditPersonaMoral1;
	}

	/**
	 * @return the ditPersonaMoral2
	 */
	public PersonaMoralTO getDitPersonaMoral2() {
		return ditPersonaMoral2;
	}

	/**
	 * @param ditPersonaMoral2 the ditPersonaMoral2 to set
	 */
	public void setDitPersonaMoral2(PersonaMoralTO ditPersonaMoral2) {
		this.ditPersonaMoral2 = ditPersonaMoral2;
	}

	
	
}
