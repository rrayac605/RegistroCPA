package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the DIT_SOCIO database table.
 * 
 */
@Entity
@Table(name="DIT_SOCIO")
@NamedQuery(name="DitSocioDO.findAll", query="SELECT d FROM DitSocioDO d")
public class DitSocioDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_SOCIO")
	private long cveIdSocio;

	@Column(name="DES_DENOM_RAZON_SOCIAL")
	private String desDenomRazonSocial;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_CONTRATO")
	private Date fecContrato;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="IND_EXTRANJERO")
	private BigDecimal indExtranjero;

	@Column(name="IND_RESIDENCIA_EXTRANJERO")
	private BigDecimal indResidenciaExtranjero;

	@Column(name="IND_TIPO_SOCIO")
	private BigDecimal indTipoSocio;

	@Column(name="NOM_NOMBRE")
	private String nomNombre;

	@Column(name="NOM_PRIMER_APELLIDO")
	private String nomPrimerApellido;

	@Column(name="NOM_SEGUNDO_APELLIDO")
	private String nomSegundoApellido;

	@Column(name="NUM_INSTRUMENTO")
	private String numInstrumento;

	@Column(name="NUM_NOTARIA")
	private String numNotaria;

	//bi-directional many-to-one association to DgCatEstadoDO
	@ManyToOne
	@JoinColumn(name="CVE_ENT")
	private DgCatEstadoDO dgCatEstado;

	//bi-directional many-to-one association to DitPersonaFisicaDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA_FISICA")
	private DitPersonaFisicaDO ditPersonaFisica;

	//bi-directional many-to-one association to DitPersonaMoralDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PATRON")
	private DitPersonaMoralDO ditPersonaMoral1;

	//bi-directional many-to-one association to DitPersonaMoralDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA_MORAL")
	private DitPersonaMoralDO ditPersonaMoral2;

	public DitSocioDO() {
	}

	public long getCveIdSocio() {
		return this.cveIdSocio;
	}

	public void setCveIdSocio(long cveIdSocio) {
		this.cveIdSocio = cveIdSocio;
	}

	public String getDesDenomRazonSocial() {
		return this.desDenomRazonSocial;
	}

	public void setDesDenomRazonSocial(String desDenomRazonSocial) {
		this.desDenomRazonSocial = desDenomRazonSocial;
	}

	public Date getFecContrato() {
		return this.fecContrato;
	}

	public void setFecContrato(Date fecContrato) {
		this.fecContrato = fecContrato;
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

	public BigDecimal getIndExtranjero() {
		return this.indExtranjero;
	}

	public void setIndExtranjero(BigDecimal indExtranjero) {
		this.indExtranjero = indExtranjero;
	}

	public BigDecimal getIndResidenciaExtranjero() {
		return this.indResidenciaExtranjero;
	}

	public void setIndResidenciaExtranjero(BigDecimal indResidenciaExtranjero) {
		this.indResidenciaExtranjero = indResidenciaExtranjero;
	}

	public BigDecimal getIndTipoSocio() {
		return this.indTipoSocio;
	}

	public void setIndTipoSocio(BigDecimal indTipoSocio) {
		this.indTipoSocio = indTipoSocio;
	}

	public String getNomNombre() {
		return this.nomNombre;
	}

	public void setNomNombre(String nomNombre) {
		this.nomNombre = nomNombre;
	}

	public String getNomPrimerApellido() {
		return this.nomPrimerApellido;
	}

	public void setNomPrimerApellido(String nomPrimerApellido) {
		this.nomPrimerApellido = nomPrimerApellido;
	}

	public String getNomSegundoApellido() {
		return this.nomSegundoApellido;
	}

	public void setNomSegundoApellido(String nomSegundoApellido) {
		this.nomSegundoApellido = nomSegundoApellido;
	}

	public String getNumInstrumento() {
		return this.numInstrumento;
	}

	public void setNumInstrumento(String numInstrumento) {
		this.numInstrumento = numInstrumento;
	}

	public String getNumNotaria() {
		return this.numNotaria;
	}

	public void setNumNotaria(String numNotaria) {
		this.numNotaria = numNotaria;
	}

	public DgCatEstadoDO getDgCatEstado() {
		return this.dgCatEstado;
	}

	public void setDgCatEstado(DgCatEstadoDO dgCatEstado) {
		this.dgCatEstado = dgCatEstado;
	}

	public DitPersonaFisicaDO getDitPersonaFisica() {
		return this.ditPersonaFisica;
	}

	public void setDitPersonaFisica(DitPersonaFisicaDO ditPersonaFisica) {
		this.ditPersonaFisica = ditPersonaFisica;
	}

	public DitPersonaMoralDO getDitPersonaMoral1() {
		return this.ditPersonaMoral1;
	}

	public void setDitPersonaMoral1(DitPersonaMoralDO ditPersonaMoral1) {
		this.ditPersonaMoral1 = ditPersonaMoral1;
	}

	public DitPersonaMoralDO getDitPersonaMoral2() {
		return this.ditPersonaMoral2;
	}

	public void setDitPersonaMoral2(DitPersonaMoralDO ditPersonaMoral2) {
		this.ditPersonaMoral2 = ditPersonaMoral2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveIdSocio ^ (cveIdSocio >>> 32));
		result = prime * result + ((desDenomRazonSocial == null) ? 0 : desDenomRazonSocial.hashCode());
		result = prime * result + ((dgCatEstado == null) ? 0 : dgCatEstado.hashCode());
		result = prime * result + ((ditPersonaFisica == null) ? 0 : ditPersonaFisica.hashCode());
		result = prime * result + ((ditPersonaMoral1 == null) ? 0 : ditPersonaMoral1.hashCode());
		result = prime * result + ((ditPersonaMoral2 == null) ? 0 : ditPersonaMoral2.hashCode());
		result = prime * result + ((fecContrato == null) ? 0 : fecContrato.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((indExtranjero == null) ? 0 : indExtranjero.hashCode());
		result = prime * result + ((indResidenciaExtranjero == null) ? 0 : indResidenciaExtranjero.hashCode());
		result = prime * result + ((indTipoSocio == null) ? 0 : indTipoSocio.hashCode());
		result = prime * result + ((nomNombre == null) ? 0 : nomNombre.hashCode());
		result = prime * result + ((nomPrimerApellido == null) ? 0 : nomPrimerApellido.hashCode());
		result = prime * result + ((nomSegundoApellido == null) ? 0 : nomSegundoApellido.hashCode());
		result = prime * result + ((numInstrumento == null) ? 0 : numInstrumento.hashCode());
		result = prime * result + ((numNotaria == null) ? 0 : numNotaria.hashCode());
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
		DitSocioDO other = (DitSocioDO) obj;
		if (cveIdSocio != other.cveIdSocio)
			return false;
		if (desDenomRazonSocial == null) {
			if (other.desDenomRazonSocial != null)
				return false;
		} else if (!desDenomRazonSocial.equals(other.desDenomRazonSocial))
			return false;
		if (dgCatEstado == null) {
			if (other.dgCatEstado != null)
				return false;
		} else if (!dgCatEstado.equals(other.dgCatEstado))
			return false;
		if (ditPersonaFisica == null) {
			if (other.ditPersonaFisica != null)
				return false;
		} else if (!ditPersonaFisica.equals(other.ditPersonaFisica))
			return false;
		if (ditPersonaMoral1 == null) {
			if (other.ditPersonaMoral1 != null)
				return false;
		} else if (!ditPersonaMoral1.equals(other.ditPersonaMoral1))
			return false;
		if (ditPersonaMoral2 == null) {
			if (other.ditPersonaMoral2 != null)
				return false;
		} else if (!ditPersonaMoral2.equals(other.ditPersonaMoral2))
			return false;
		if (fecContrato == null) {
			if (other.fecContrato != null)
				return false;
		} else if (!fecContrato.equals(other.fecContrato))
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
		if (indExtranjero == null) {
			if (other.indExtranjero != null)
				return false;
		} else if (!indExtranjero.equals(other.indExtranjero))
			return false;
		if (indResidenciaExtranjero == null) {
			if (other.indResidenciaExtranjero != null)
				return false;
		} else if (!indResidenciaExtranjero.equals(other.indResidenciaExtranjero))
			return false;
		if (indTipoSocio == null) {
			if (other.indTipoSocio != null)
				return false;
		} else if (!indTipoSocio.equals(other.indTipoSocio))
			return false;
		if (nomNombre == null) {
			if (other.nomNombre != null)
				return false;
		} else if (!nomNombre.equals(other.nomNombre))
			return false;
		if (nomPrimerApellido == null) {
			if (other.nomPrimerApellido != null)
				return false;
		} else if (!nomPrimerApellido.equals(other.nomPrimerApellido))
			return false;
		if (nomSegundoApellido == null) {
			if (other.nomSegundoApellido != null)
				return false;
		} else if (!nomSegundoApellido.equals(other.nomSegundoApellido))
			return false;
		if (numInstrumento == null) {
			if (other.numInstrumento != null)
				return false;
		} else if (!numInstrumento.equals(other.numInstrumento))
			return false;
		if (numNotaria == null) {
			if (other.numNotaria != null)
				return false;
		} else if (!numNotaria.equals(other.numNotaria))
			return false;
		return true;
	}
	
	

}