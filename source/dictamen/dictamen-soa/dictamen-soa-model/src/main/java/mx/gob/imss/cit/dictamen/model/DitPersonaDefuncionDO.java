package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the DIT_PERSONA_DEFUNCION database table.
 * 
 */
@Entity
@Table(name="DIT_PERSONA_DEFUNCION")
@NamedQuery(name="DitPersonaDefuncionDO.findAll", query="SELECT d FROM DitPersonaDefuncionDO d")
public class DitPersonaDefuncionDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_PERSONA_DEFUNCION")
	private long cveIdPersonaDefuncion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ANIO_REGISTRO")
	private Date anioRegistro;

	private String crip;

	@Column(name="DES_OFIC_REG_CIVIL")
	private String desOficRegCivil;

	@Column(name="NUM_ACTA")
	private String numActa;

	@Column(name="NUM_FOJA")
	private String numFoja;

	@Column(name="NUM_LIBRO")
	private String numLibro;

	@Column(name="NUM_TOMO")
	private String numTomo;

	//bi-directional many-to-one association to DgCatMunicipioDO
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CVE_ENT", referencedColumnName="CVE_ENT"),
		@JoinColumn(name="CVE_MUN", referencedColumnName="CVE_MUN")
		})
	private DgCatMunicipioDO dgCatMunicipio;

	//bi-directional many-to-one association to DitPersonaDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA")
	private DitPersonaDO ditPersona;

	public DitPersonaDefuncionDO() {
	}

	public long getCveIdPersonaDefuncion() {
		return this.cveIdPersonaDefuncion;
	}

	public void setCveIdPersonaDefuncion(long cveIdPersonaDefuncion) {
		this.cveIdPersonaDefuncion = cveIdPersonaDefuncion;
	}

	public Date getAnioRegistro() {
		return this.anioRegistro;
	}

	public void setAnioRegistro(Date anioRegistro) {
		this.anioRegistro = anioRegistro;
	}

	public String getCrip() {
		return this.crip;
	}

	public void setCrip(String crip) {
		this.crip = crip;
	}

	public String getDesOficRegCivil() {
		return this.desOficRegCivil;
	}

	public void setDesOficRegCivil(String desOficRegCivil) {
		this.desOficRegCivil = desOficRegCivil;
	}

	public String getNumActa() {
		return this.numActa;
	}

	public void setNumActa(String numActa) {
		this.numActa = numActa;
	}

	public String getNumFoja() {
		return this.numFoja;
	}

	public void setNumFoja(String numFoja) {
		this.numFoja = numFoja;
	}

	public String getNumLibro() {
		return this.numLibro;
	}

	public void setNumLibro(String numLibro) {
		this.numLibro = numLibro;
	}

	public String getNumTomo() {
		return this.numTomo;
	}

	public void setNumTomo(String numTomo) {
		this.numTomo = numTomo;
	}

	public DgCatMunicipioDO getDgCatMunicipio() {
		return this.dgCatMunicipio;
	}

	public void setDgCatMunicipio(DgCatMunicipioDO dgCatMunicipio) {
		this.dgCatMunicipio = dgCatMunicipio;
	}

	public DitPersonaDO getDitPersona() {
		return this.ditPersona;
	}

	public void setDitPersona(DitPersonaDO ditPersona) {
		this.ditPersona = ditPersona;
	}

}