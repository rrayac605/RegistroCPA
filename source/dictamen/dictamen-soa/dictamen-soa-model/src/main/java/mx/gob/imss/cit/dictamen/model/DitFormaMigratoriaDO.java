package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the DIT_FORMA_MIGRATORIA database table.
 * 
 */
@Entity
@Table(name="DIT_FORMA_MIGRATORIA")
@NamedQuery(name="DitFormaMigratoriaDO.findAll", query="SELECT d FROM DitFormaMigratoriaDO d")
public class DitFormaMigratoriaDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_FORMA_MIGRATORIA")
	private long cveIdFormaMigratoria;

	@Column(name="CVE_ID_DOCUMENTO_PROBATORIO")
	private BigDecimal cveIdDocumentoProbatorio;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="NUM_FORMA_MIGRATORIA")
	private String numFormaMigratoria;

	//bi-directional many-to-one association to DicCalidadCaracMigratDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_CALIDAD_CARAC_MIGRAT")
	private DicCalidadCaracMigratDO dicCalidadCaracMigrat;

	//bi-directional many-to-one association to DicTipoFormaDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_TIPO_FORMA")
	private DicTipoFormaDO dicTipoForma;

	//bi-directional many-to-one association to DitPersonaDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA")
	private DitPersonaDO ditPersona;

	public DitFormaMigratoriaDO() {
	}

	public long getCveIdFormaMigratoria() {
		return this.cveIdFormaMigratoria;
	}

	public void setCveIdFormaMigratoria(long cveIdFormaMigratoria) {
		this.cveIdFormaMigratoria = cveIdFormaMigratoria;
	}

	public BigDecimal getCveIdDocumentoProbatorio() {
		return this.cveIdDocumentoProbatorio;
	}

	public void setCveIdDocumentoProbatorio(BigDecimal cveIdDocumentoProbatorio) {
		this.cveIdDocumentoProbatorio = cveIdDocumentoProbatorio;
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

	public String getNumFormaMigratoria() {
		return this.numFormaMigratoria;
	}

	public void setNumFormaMigratoria(String numFormaMigratoria) {
		this.numFormaMigratoria = numFormaMigratoria;
	}

	public DicCalidadCaracMigratDO getDicCalidadCaracMigrat() {
		return this.dicCalidadCaracMigrat;
	}

	public void setDicCalidadCaracMigrat(DicCalidadCaracMigratDO dicCalidadCaracMigrat) {
		this.dicCalidadCaracMigrat = dicCalidadCaracMigrat;
	}

	public DicTipoFormaDO getDicTipoForma() {
		return this.dicTipoForma;
	}

	public void setDicTipoForma(DicTipoFormaDO dicTipoForma) {
		this.dicTipoForma = dicTipoForma;
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
		result = prime * result + ((cveIdDocumentoProbatorio == null) ? 0 : cveIdDocumentoProbatorio.hashCode());
		result = prime * result + (int) (cveIdFormaMigratoria ^ (cveIdFormaMigratoria >>> 32));
		result = prime * result + ((dicCalidadCaracMigrat == null) ? 0 : dicCalidadCaracMigrat.hashCode());
		result = prime * result + ((dicTipoForma == null) ? 0 : dicTipoForma.hashCode());
		result = prime * result + ((ditPersona == null) ? 0 : ditPersona.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((numFormaMigratoria == null) ? 0 : numFormaMigratoria.hashCode());
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
		DitFormaMigratoriaDO other = (DitFormaMigratoriaDO) obj;
		if (cveIdDocumentoProbatorio == null) {
			if (other.cveIdDocumentoProbatorio != null)
				return false;
		} else if (!cveIdDocumentoProbatorio.equals(other.cveIdDocumentoProbatorio))
			return false;
		if (cveIdFormaMigratoria != other.cveIdFormaMigratoria)
			return false;
		if (dicCalidadCaracMigrat == null) {
			if (other.dicCalidadCaracMigrat != null)
				return false;
		} else if (!dicCalidadCaracMigrat.equals(other.dicCalidadCaracMigrat))
			return false;
		if (dicTipoForma == null) {
			if (other.dicTipoForma != null)
				return false;
		} else if (!dicTipoForma.equals(other.dicTipoForma))
			return false;
		if (ditPersona == null) {
			if (other.ditPersona != null)
				return false;
		} else if (!ditPersona.equals(other.ditPersona))
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
		if (numFormaMigratoria == null) {
			if (other.numFormaMigratoria != null)
				return false;
		} else if (!numFormaMigratoria.equals(other.numFormaMigratoria))
			return false;
		return true;
	}
	
	
	
}