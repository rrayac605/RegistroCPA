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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anioRegistro == null) ? 0 : anioRegistro.hashCode());
		result = prime * result + ((crip == null) ? 0 : crip.hashCode());
		result = prime * result + (int) (cveIdPersonaDefuncion ^ (cveIdPersonaDefuncion >>> 32));
		result = prime * result + ((desOficRegCivil == null) ? 0 : desOficRegCivil.hashCode());
		result = prime * result + ((dgCatMunicipio == null) ? 0 : dgCatMunicipio.hashCode());
		result = prime * result + ((ditPersona == null) ? 0 : ditPersona.hashCode());
		result = prime * result + ((numActa == null) ? 0 : numActa.hashCode());
		result = prime * result + ((numFoja == null) ? 0 : numFoja.hashCode());
		result = prime * result + ((numLibro == null) ? 0 : numLibro.hashCode());
		result = prime * result + ((numTomo == null) ? 0 : numTomo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DitPersonaDefuncionDO other = (DitPersonaDefuncionDO) obj;
		if (anioRegistro == null) {
			if (other.anioRegistro != null)
				return false;
		} else if (!anioRegistro.equals(other.anioRegistro))
			return false;
		if (crip == null) {
			if (other.crip != null)
				return false;
		} else if (!crip.equals(other.crip))
			return false;
		if (cveIdPersonaDefuncion != other.cveIdPersonaDefuncion)
			return false;
		if (desOficRegCivil == null) {
			if (other.desOficRegCivil != null)
				return false;
		} else if (!desOficRegCivil.equals(other.desOficRegCivil))
			return false;
		if (dgCatMunicipio == null) {
			if (other.dgCatMunicipio != null)
				return false;
		} else if (!dgCatMunicipio.equals(other.dgCatMunicipio))
			return false;
		if (ditPersona == null) {
			if (other.ditPersona != null)
				return false;
		} else if (!ditPersona.equals(other.ditPersona))
			return false;
		if (numActa == null) {
			if (other.numActa != null)
				return false;
		} else if (!numActa.equals(other.numActa))
			return false;
		if (numFoja == null) {
			if (other.numFoja != null)
				return false;
		} else if (!numFoja.equals(other.numFoja))
			return false;
		if (numLibro == null) {
			if (other.numLibro != null)
				return false;
		} else if (!numLibro.equals(other.numLibro))
			return false;
		if (numTomo == null) {
			if (other.numTomo != null)
				return false;
		} else if (!numTomo.equals(other.numTomo))
			return false;
		return true;
	}
	
	

}