package mx.gob.imss.cit.dictamen.commons.to;

import java.math.BigDecimal;
import java.util.Date;

public class ActaConstitutivaTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7433283757952728405L;

	private long cveIdActConstitutiva;

	private String desObservaciones;

	private Date fecExpedicionActa;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private BigDecimal indRegPubTramite;

	private String numActa;

	private String numEscritura;

	private String numFoja;

	private String numFolioMercantil;

	private String numLibro;

	private String numNotaria;

	private String numPartida;

	private String numRegistro;

	private String numSeccion;

	private String numVolumen;

	private CatMunicipioTO dgCatMunicipio;

	private PersonaMoralTO ditPersonaMoral;

	/**
	 * @return the cveIdActConstitutiva
	 */
	public long getCveIdActConstitutiva() {
		return cveIdActConstitutiva;
	}

	/**
	 * @param cveIdActConstitutiva the cveIdActConstitutiva to set
	 */
	public void setCveIdActConstitutiva(long cveIdActConstitutiva) {
		this.cveIdActConstitutiva = cveIdActConstitutiva;
	}

	/**
	 * @return the desObservaciones
	 */
	public String getDesObservaciones() {
		return desObservaciones;
	}

	/**
	 * @param desObservaciones the desObservaciones to set
	 */
	public void setDesObservaciones(String desObservaciones) {
		this.desObservaciones = desObservaciones;
	}

	/**
	 * @return the fecExpedicionActa
	 */
	public Date getFecExpedicionActa() {
		return fecExpedicionActa != null ? (Date) fecExpedicionActa.clone() : null;		
	}

	/**
	 * @param fecExpedicionActa the fecExpedicionActa to set
	 */
	public void setFecExpedicionActa(Date fecExpedicionActa) {
		this.fecExpedicionActa = fecExpedicionActa;
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
	 * @return the indRegPubTramite
	 */
	public BigDecimal getIndRegPubTramite() {
		return indRegPubTramite;
	}

	/**
	 * @param indRegPubTramite the indRegPubTramite to set
	 */
	public void setIndRegPubTramite(BigDecimal indRegPubTramite) {
		this.indRegPubTramite = indRegPubTramite;
	}

	/**
	 * @return the numActa
	 */
	public String getNumActa() {
		return numActa;
	}

	/**
	 * @param numActa the numActa to set
	 */
	public void setNumActa(String numActa) {
		this.numActa = numActa;
	}

	/**
	 * @return the numEscritura
	 */
	public String getNumEscritura() {
		return numEscritura;
	}

	/**
	 * @param numEscritura the numEscritura to set
	 */
	public void setNumEscritura(String numEscritura) {
		this.numEscritura = numEscritura;
	}

	/**
	 * @return the numFoja
	 */
	public String getNumFoja() {
		return numFoja;
	}

	/**
	 * @param numFoja the numFoja to set
	 */
	public void setNumFoja(String numFoja) {
		this.numFoja = numFoja;
	}

	/**
	 * @return the numFolioMercantil
	 */
	public String getNumFolioMercantil() {
		return numFolioMercantil;
	}

	/**
	 * @param numFolioMercantil the numFolioMercantil to set
	 */
	public void setNumFolioMercantil(String numFolioMercantil) {
		this.numFolioMercantil = numFolioMercantil;
	}

	/**
	 * @return the numLibro
	 */
	public String getNumLibro() {
		return numLibro;
	}

	/**
	 * @param numLibro the numLibro to set
	 */
	public void setNumLibro(String numLibro) {
		this.numLibro = numLibro;
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
	 * @return the numPartida
	 */
	public String getNumPartida() {
		return numPartida;
	}

	/**
	 * @param numPartida the numPartida to set
	 */
	public void setNumPartida(String numPartida) {
		this.numPartida = numPartida;
	}

	/**
	 * @return the numRegistro
	 */
	public String getNumRegistro() {
		return numRegistro;
	}

	/**
	 * @param numRegistro the numRegistro to set
	 */
	public void setNumRegistro(String numRegistro) {
		this.numRegistro = numRegistro;
	}

	/**
	 * @return the numSeccion
	 */
	public String getNumSeccion() {
		return numSeccion;
	}

	/**
	 * @param numSeccion the numSeccion to set
	 */
	public void setNumSeccion(String numSeccion) {
		this.numSeccion = numSeccion;
	}

	/**
	 * @return the numVolumen
	 */
	public String getNumVolumen() {
		return numVolumen;
	}

	/**
	 * @param numVolumen the numVolumen to set
	 */
	public void setNumVolumen(String numVolumen) {
		this.numVolumen = numVolumen;
	}

	/**
	 * @return the dgCatMunicipio
	 */
	public CatMunicipioTO getDgCatMunicipio() {
		return dgCatMunicipio;
	}

	/**
	 * @param dgCatMunicipio the dgCatMunicipio to set
	 */
	public void setDgCatMunicipio(CatMunicipioTO dgCatMunicipio) {
		this.dgCatMunicipio = dgCatMunicipio;
	}

	/**
	 * @return the ditPersonaMoral
	 */
	public PersonaMoralTO getDitPersonaMoral() {
		return ditPersonaMoral;
	}

	/**
	 * @param ditPersonaMoral the ditPersonaMoral to set
	 */
	public void setDitPersonaMoral(PersonaMoralTO ditPersonaMoral) {
		this.ditPersonaMoral = ditPersonaMoral;
	}

	
	
}
