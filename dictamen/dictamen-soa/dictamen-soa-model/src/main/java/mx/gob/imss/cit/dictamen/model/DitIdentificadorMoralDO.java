package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the DIT_IDENTIFICADOR_MORAL database table.
 * 
 */
@Entity
@Table(name="DIT_IDENTIFICADOR_MORAL")
@NamedQuery(name="DitIdentificadorMoralDO.findAll", query="SELECT d FROM DitIdentificadorMoralDO d")
public class DitIdentificadorMoralDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_IDENTIFICADOR_MORAL")
	private long cveIdIdentificadorMoral;

	@Column(name="CVE_ID_TIPO_IDENTIFICADOR")
	private BigDecimal cveIdTipoIdentificador;

	@Column(name="CVE_IDENTIFICADORA")
	private String cveIdentificadora;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="IND_VIGENTE")
	private BigDecimal indVigente;

	//bi-directional many-to-one association to DitPersonaMoralDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA_MORAL")
	private DitPersonaMoralDO ditPersonaMoral;

	public DitIdentificadorMoralDO() {
	}

	public long getCveIdIdentificadorMoral() {
		return this.cveIdIdentificadorMoral;
	}

	public void setCveIdIdentificadorMoral(long cveIdIdentificadorMoral) {
		this.cveIdIdentificadorMoral = cveIdIdentificadorMoral;
	}

	public BigDecimal getCveIdTipoIdentificador() {
		return this.cveIdTipoIdentificador;
	}

	public void setCveIdTipoIdentificador(BigDecimal cveIdTipoIdentificador) {
		this.cveIdTipoIdentificador = cveIdTipoIdentificador;
	}

	public String getCveIdentificadora() {
		return this.cveIdentificadora;
	}

	public void setCveIdentificadora(String cveIdentificadora) {
		this.cveIdentificadora = cveIdentificadora;
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

	public BigDecimal getIndVigente() {
		return this.indVigente;
	}

	public void setIndVigente(BigDecimal indVigente) {
		this.indVigente = indVigente;
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
		result = prime * result + (int) (cveIdIdentificadorMoral ^ (cveIdIdentificadorMoral >>> 32));
		result = prime * result + ((cveIdTipoIdentificador == null) ? 0 : cveIdTipoIdentificador.hashCode());
		result = prime * result + ((cveIdentificadora == null) ? 0 : cveIdentificadora.hashCode());
		result = prime * result + ((ditPersonaMoral == null) ? 0 : ditPersonaMoral.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((indVigente == null) ? 0 : indVigente.hashCode());
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
		DitIdentificadorMoralDO other = (DitIdentificadorMoralDO) obj;
		if (cveIdIdentificadorMoral != other.cveIdIdentificadorMoral)
			return false;
		if (cveIdTipoIdentificador == null) {
			if (other.cveIdTipoIdentificador != null)
				return false;
		} else if (!cveIdTipoIdentificador.equals(other.cveIdTipoIdentificador))
			return false;
		if (cveIdentificadora == null) {
			if (other.cveIdentificadora != null)
				return false;
		} else if (!cveIdentificadora.equals(other.cveIdentificadora))
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
		if (indVigente == null) {
			if (other.indVigente != null)
				return false;
		} else if (!indVigente.equals(other.indVigente))
			return false;
		return true;
	}
	
	

}