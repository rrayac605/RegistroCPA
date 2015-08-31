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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveIdActConstitutiva ^ (cveIdActConstitutiva >>> 32));
		result = prime * result + ((desObservaciones == null) ? 0 : desObservaciones.hashCode());
		result = prime * result + ((dgCatMunicipio == null) ? 0 : dgCatMunicipio.hashCode());
		result = prime * result + ((ditPersonaMoral == null) ? 0 : ditPersonaMoral.hashCode());
		result = prime * result + ((fecExpedicionActa == null) ? 0 : fecExpedicionActa.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((indRegPubTramite == null) ? 0 : indRegPubTramite.hashCode());
		result = prime * result + ((numActa == null) ? 0 : numActa.hashCode());
		result = prime * result + ((numEscritura == null) ? 0 : numEscritura.hashCode());
		result = prime * result + ((numFoja == null) ? 0 : numFoja.hashCode());
		result = prime * result + ((numFolioMercantil == null) ? 0 : numFolioMercantil.hashCode());
		result = prime * result + ((numLibro == null) ? 0 : numLibro.hashCode());
		result = prime * result + ((numNotaria == null) ? 0 : numNotaria.hashCode());
		result = prime * result + ((numPartida == null) ? 0 : numPartida.hashCode());
		result = prime * result + ((numRegistro == null) ? 0 : numRegistro.hashCode());
		result = prime * result + ((numSeccion == null) ? 0 : numSeccion.hashCode());
		result = prime * result + ((numVolumen == null) ? 0 : numVolumen.hashCode());
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
		DitActaConstitutivaDO other = (DitActaConstitutivaDO) obj;
		if (cveIdActConstitutiva != other.cveIdActConstitutiva)
			return false;
		if (desObservaciones == null) {
			if (other.desObservaciones != null)
				return false;
		} else if (!desObservaciones.equals(other.desObservaciones))
			return false;
		if (dgCatMunicipio == null) {
			if (other.dgCatMunicipio != null)
				return false;
		} else if (!dgCatMunicipio.equals(other.dgCatMunicipio))
			return false;
		if (ditPersonaMoral == null) {
			if (other.ditPersonaMoral != null)
				return false;
		} else if (!ditPersonaMoral.equals(other.ditPersonaMoral))
			return false;
		if (fecExpedicionActa == null) {
			if (other.fecExpedicionActa != null)
				return false;
		} else if (!fecExpedicionActa.equals(other.fecExpedicionActa))
			return false;
		if (fecRegistroActualizado == null) {
			if (other.fecRegistroActualizado != null)
				return false;
		} else if (!fecRegistroActualizado.equals(other.fecRegistroActualizado))
			return false;
		if (fecRegistroAlta == null) {
			if (other.fecRegistroAlta != null)
				return false;
		} else if (!fecRegistroAlta.equals(other.fecRegistroAlta))
			return false;
		if (fecRegistroBaja == null) {
			if (other.fecRegistroBaja != null)
				return false;
		} else if (!fecRegistroBaja.equals(other.fecRegistroBaja))
			return false;
		if (indRegPubTramite == null) {
			if (other.indRegPubTramite != null)
				return false;
		} else if (!indRegPubTramite.equals(other.indRegPubTramite))
			return false;
		if (numActa == null) {
			if (other.numActa != null)
				return false;
		} else if (!numActa.equals(other.numActa))
			return false;
		if (numEscritura == null) {
			if (other.numEscritura != null)
				return false;
		} else if (!numEscritura.equals(other.numEscritura))
			return false;
		if (numFoja == null) {
			if (other.numFoja != null)
				return false;
		} else if (!numFoja.equals(other.numFoja))
			return false;
		if (numFolioMercantil == null) {
			if (other.numFolioMercantil != null)
				return false;
		} else if (!numFolioMercantil.equals(other.numFolioMercantil))
			return false;
		if (numLibro == null) {
			if (other.numLibro != null)
				return false;
		} else if (!numLibro.equals(other.numLibro))
			return false;
		if (numNotaria == null) {
			if (other.numNotaria != null)
				return false;
		} else if (!numNotaria.equals(other.numNotaria))
			return false;
		if (numPartida == null) {
			if (other.numPartida != null)
				return false;
		} else if (!numPartida.equals(other.numPartida))
			return false;
		if (numRegistro == null) {
			if (other.numRegistro != null)
				return false;
		} else if (!numRegistro.equals(other.numRegistro))
			return false;
		if (numSeccion == null) {
			if (other.numSeccion != null)
				return false;
		} else if (!numSeccion.equals(other.numSeccion))
			return false;
		if (numVolumen == null) {
			if (other.numVolumen != null)
				return false;
		} else if (!numVolumen.equals(other.numVolumen))
			return false;
		return true;
	}
	
	
	
}