package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the DIT_PERSONAF_CONTACTO database table.
 * 
 */
@Entity
@Table(name="DIT_PERSONAF_CONTACTO")
@NamedQuery(name="DitPersonafContactoDO.findAll", query="SELECT d FROM DitPersonafContactoDO d")
public class DitPersonafContactoDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_PERSONAF_CONTACTO")
	private long cveIdPersonafContacto;

	@Column(name="CVE_ID_FORMA_CONTACTO")
	private BigDecimal cveIdFormaContacto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to DitPersonaDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA")
	private DitPersonaDO ditPersona;

	public DitPersonafContactoDO() {
	}

	public long getCveIdPersonafContacto() {
		return this.cveIdPersonafContacto;
	}

	public void setCveIdPersonafContacto(long cveIdPersonafContacto) {
		this.cveIdPersonafContacto = cveIdPersonafContacto;
	}

	public BigDecimal getCveIdFormaContacto() {
		return this.cveIdFormaContacto;
	}

	public void setCveIdFormaContacto(BigDecimal cveIdFormaContacto) {
		this.cveIdFormaContacto = cveIdFormaContacto;
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
		result = prime * result + ((cveIdFormaContacto == null) ? 0 : cveIdFormaContacto.hashCode());
		result = prime * result + (int) (cveIdPersonafContacto ^ (cveIdPersonafContacto >>> 32));
		result = prime * result + ((ditPersona == null) ? 0 : ditPersona.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
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
		DitPersonafContactoDO other = (DitPersonafContactoDO) obj;
		if (cveIdFormaContacto == null) {
			if (other.cveIdFormaContacto != null)
				return false;
		} else if (!cveIdFormaContacto.equals(other.cveIdFormaContacto))
			return false;
		if (cveIdPersonafContacto != other.cveIdPersonafContacto)
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
		return true;
	}
	

}