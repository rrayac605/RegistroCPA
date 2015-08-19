package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the DIT_REPRESENTANTE_LEGAL database table.
 * 
 */
@Entity
@Table(name="DIT_REPRESENTANTE_LEGAL")
@NamedQuery(name="DitRepresentanteLegalDO.findAll", query="SELECT d FROM DitRepresentanteLegalDO d")
public class DitRepresentanteLegalDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_REPRESENTANTE_LEGAL")
	private long cveIdRepresentanteLegal;

	@Column(name="CVE_ID_MANDATO")
	private BigDecimal cveIdMandato;

	@Column(name="CVE_ID_TIPO_PODER")
	private BigDecimal cveIdTipoPoder;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="IND_ACT_ADMON_DOMINIO")
	private BigDecimal indActAdmonDominio;

	@Column(name="IND_ESTATUS")
	private BigDecimal indEstatus;

	private String rupa;

	//bi-directional many-to-one association to DitPatronSujetoObligadoDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PATRON_SUJETO_OBLIGADO")
	private DitPatronSujetoObligadoDO ditPatronSujetoObligado;

	//bi-directional many-to-one association to DitPersonaDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA")
	private DitPersonaDO ditPersona;

	//bi-directional many-to-one association to DitPersonaFisicaDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA_FISICA")
	private DitPersonaFisicaDO ditPersonaFisica;

	//bi-directional many-to-one association to DitPersonaMoralDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA_MORAL")
	private DitPersonaMoralDO ditPersonaMoral;

	public DitRepresentanteLegalDO() {
	}

	public long getCveIdRepresentanteLegal() {
		return this.cveIdRepresentanteLegal;
	}

	public void setCveIdRepresentanteLegal(long cveIdRepresentanteLegal) {
		this.cveIdRepresentanteLegal = cveIdRepresentanteLegal;
	}

	public BigDecimal getCveIdMandato() {
		return this.cveIdMandato;
	}

	public void setCveIdMandato(BigDecimal cveIdMandato) {
		this.cveIdMandato = cveIdMandato;
	}

	public BigDecimal getCveIdTipoPoder() {
		return this.cveIdTipoPoder;
	}

	public void setCveIdTipoPoder(BigDecimal cveIdTipoPoder) {
		this.cveIdTipoPoder = cveIdTipoPoder;
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

	public BigDecimal getIndActAdmonDominio() {
		return this.indActAdmonDominio;
	}

	public void setIndActAdmonDominio(BigDecimal indActAdmonDominio) {
		this.indActAdmonDominio = indActAdmonDominio;
	}

	public BigDecimal getIndEstatus() {
		return this.indEstatus;
	}

	public void setIndEstatus(BigDecimal indEstatus) {
		this.indEstatus = indEstatus;
	}

	public String getRupa() {
		return this.rupa;
	}

	public void setRupa(String rupa) {
		this.rupa = rupa;
	}

	public DitPatronSujetoObligadoDO getDitPatronSujetoObligado() {
		return this.ditPatronSujetoObligado;
	}

	public void setDitPatronSujetoObligado(DitPatronSujetoObligadoDO ditPatronSujetoObligado) {
		this.ditPatronSujetoObligado = ditPatronSujetoObligado;
	}

	public DitPersonaDO getDitPersona() {
		return this.ditPersona;
	}

	public void setDitPersona(DitPersonaDO ditPersona) {
		this.ditPersona = ditPersona;
	}

	public DitPersonaFisicaDO getDitPersonaFisica() {
		return this.ditPersonaFisica;
	}

	public void setDitPersonaFisica(DitPersonaFisicaDO ditPersonaFisica) {
		this.ditPersonaFisica = ditPersonaFisica;
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
		result = prime * result + ((cveIdMandato == null) ? 0 : cveIdMandato.hashCode());
		result = prime * result + (int) (cveIdRepresentanteLegal ^ (cveIdRepresentanteLegal >>> 32));
		result = prime * result + ((cveIdTipoPoder == null) ? 0 : cveIdTipoPoder.hashCode());
		result = prime * result + ((ditPatronSujetoObligado == null) ? 0 : ditPatronSujetoObligado.hashCode());
		result = prime * result + ((ditPersona == null) ? 0 : ditPersona.hashCode());
		result = prime * result + ((ditPersonaFisica == null) ? 0 : ditPersonaFisica.hashCode());
		result = prime * result + ((ditPersonaMoral == null) ? 0 : ditPersonaMoral.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((indActAdmonDominio == null) ? 0 : indActAdmonDominio.hashCode());
		result = prime * result + ((indEstatus == null) ? 0 : indEstatus.hashCode());
		result = prime * result + ((rupa == null) ? 0 : rupa.hashCode());
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
		DitRepresentanteLegalDO other = (DitRepresentanteLegalDO) obj;
		if (cveIdMandato == null) {
			if (other.cveIdMandato != null)
				return false;
		} else if (!cveIdMandato.equals(other.cveIdMandato))
			return false;
		if (cveIdRepresentanteLegal != other.cveIdRepresentanteLegal)
			return false;
		if (cveIdTipoPoder == null) {
			if (other.cveIdTipoPoder != null)
				return false;
		} else if (!cveIdTipoPoder.equals(other.cveIdTipoPoder))
			return false;
		if (ditPatronSujetoObligado == null) {
			if (other.ditPatronSujetoObligado != null)
				return false;
		} else if (!ditPatronSujetoObligado.equals(other.ditPatronSujetoObligado))
			return false;
		if (ditPersona == null) {
			if (other.ditPersona != null)
				return false;
		} else if (!ditPersona.equals(other.ditPersona))
			return false;
		if (ditPersonaFisica == null) {
			if (other.ditPersonaFisica != null)
				return false;
		} else if (!ditPersonaFisica.equals(other.ditPersonaFisica))
			return false;
		if (ditPersonaMoral == null) {
			if (other.ditPersonaMoral != null)
				return false;
		} else if (!ditPersonaMoral.equals(other.ditPersonaMoral))
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
		if (indActAdmonDominio == null) {
			if (other.indActAdmonDominio != null)
				return false;
		} else if (!indActAdmonDominio.equals(other.indActAdmonDominio))
			return false;
		if (indEstatus == null) {
			if (other.indEstatus != null)
				return false;
		} else if (!indEstatus.equals(other.indEstatus))
			return false;
		if (rupa == null) {
			if (other.rupa != null)
				return false;
		} else if (!rupa.equals(other.rupa))
			return false;
		return true;
	}
	
	
	
}