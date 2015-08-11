package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the DIT_ACTA_CONSTITUTIVA database table.
 * 
 */
@Entity
@Table(name="DIT_ACTA_CONSTITUTIVA")
@NamedQuery(name="DitActaConstitutivaDO.findAll", query="SELECT d FROM DitActaConstitutivaDO d")
public class DitActaConstitutivaDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_ACT_CONSTITUTIVA")
	private long cveIdActConstitutiva;

	@Column(name="DES_OBSERVACIONES")
	private String desObservaciones;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_EXPEDICION_ACTA")
	private Date fecExpedicionActa;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="IND_REG_PUB_TRAMITE")
	private BigDecimal indRegPubTramite;

	@Column(name="NUM_ACTA")
	private String numActa;

	@Column(name="NUM_ESCRITURA")
	private String numEscritura;

	@Column(name="NUM_FOJA")
	private String numFoja;

	@Column(name="NUM_FOLIO_MERCANTIL")
	private String numFolioMercantil;

	@Column(name="NUM_LIBRO")
	private String numLibro;

	@Column(name="NUM_NOTARIA")
	private String numNotaria;

	@Column(name="NUM_PARTIDA")
	private String numPartida;

	@Column(name="NUM_REGISTRO")
	private String numRegistro;

	@Column(name="NUM_SECCION")
	private String numSeccion;

	@Column(name="NUM_VOLUMEN")
	private String numVolumen;

	//bi-directional many-to-one association to DgCatMunicipioDO
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CVE_ENT", referencedColumnName="CVE_ENT"),
		@JoinColumn(name="CVE_MUN", referencedColumnName="CVE_MUN")
		})
	private DgCatMunicipioDO dgCatMunicipio;

	//bi-directional many-to-one association to DitPersonaMoralDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA_MORAL")
	private DitPersonaMoralDO ditPersonaMoral;

	public DitActaConstitutivaDO() {
	}

	public long getCveIdActConstitutiva() {
		return this.cveIdActConstitutiva;
	}

	public void setCveIdActConstitutiva(long cveIdActConstitutiva) {
		this.cveIdActConstitutiva = cveIdActConstitutiva;
	}

	public String getDesObservaciones() {
		return this.desObservaciones;
	}

	public void setDesObservaciones(String desObservaciones) {
		this.desObservaciones = desObservaciones;
	}

	public Date getFecExpedicionActa() {
		return this.fecExpedicionActa;
	}

	public void setFecExpedicionActa(Date fecExpedicionActa) {
		this.fecExpedicionActa = fecExpedicionActa;
	}

	public Date getFecRegistroActualizado() {
		return this.fecRegistroActualizado;
	}

	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	public Date getFecRegistroAlta() {
		return this.fecRegistroAlta;
	}

	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	public Date getFecRegistroBaja() {
		return this.fecRegistroBaja;
	}

	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	public BigDecimal getIndRegPubTramite() {
		return this.indRegPubTramite;
	}

	public void setIndRegPubTramite(BigDecimal indRegPubTramite) {
		this.indRegPubTramite = indRegPubTramite;
	}

	public String getNumActa() {
		return this.numActa;
	}

	public void setNumActa(String numActa) {
		this.numActa = numActa;
	}

	public String getNumEscritura() {
		return this.numEscritura;
	}

	public void setNumEscritura(String numEscritura) {
		this.numEscritura = numEscritura;
	}

	public String getNumFoja() {
		return this.numFoja;
	}

	public void setNumFoja(String numFoja) {
		this.numFoja = numFoja;
	}

	public String getNumFolioMercantil() {
		return this.numFolioMercantil;
	}

	public void setNumFolioMercantil(String numFolioMercantil) {
		this.numFolioMercantil = numFolioMercantil;
	}

	public String getNumLibro() {
		return this.numLibro;
	}

	public void setNumLibro(String numLibro) {
		this.numLibro = numLibro;
	}

	public String getNumNotaria() {
		return this.numNotaria;
	}

	public void setNumNotaria(String numNotaria) {
		this.numNotaria = numNotaria;
	}

	public String getNumPartida() {
		return this.numPartida;
	}

	public void setNumPartida(String numPartida) {
		this.numPartida = numPartida;
	}

	public String getNumRegistro() {
		return this.numRegistro;
	}

	public void setNumRegistro(String numRegistro) {
		this.numRegistro = numRegistro;
	}

	public String getNumSeccion() {
		return this.numSeccion;
	}

	public void setNumSeccion(String numSeccion) {
		this.numSeccion = numSeccion;
	}

	public String getNumVolumen() {
		return this.numVolumen;
	}

	public void setNumVolumen(String numVolumen) {
		this.numVolumen = numVolumen;
	}

	public DgCatMunicipioDO getDgCatMunicipio() {
		return this.dgCatMunicipio;
	}

	public void setDgCatMunicipio(DgCatMunicipioDO dgCatMunicipio) {
		this.dgCatMunicipio = dgCatMunicipio;
	}

	public DitPersonaMoralDO getDitPersonaMoral() {
		return this.ditPersonaMoral;
	}

	public void setDitPersonaMoral(DitPersonaMoralDO ditPersonaMoral) {
		this.ditPersonaMoral = ditPersonaMoral;
	}

}