package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the DIT_SINDICATO database table.
 * 
 */
@Entity
@Table(name="DIT_SINDICATO")
@NamedQuery(name="DitSindicatoDO.findAll", query="SELECT d FROM DitSindicatoDO d")
public class DitSindicatoDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_SINDICATO")
	private long cveIdSindicato;

	@Column(name="DES_AUT_LAB")
	private String desAutLab;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_DOC_REGISTRO")
	private Date fecDocRegistro;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="NUM_REF_REGISTRO")
	private String numRefRegistro;

	//bi-directional many-to-one association to DitPersonaMoralDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA_MORAL")
	private DitPersonaMoralDO ditPersonaMoral;

	public DitSindicatoDO() {
	}

	public long getCveIdSindicato() {
		return this.cveIdSindicato;
	}

	public void setCveIdSindicato(long cveIdSindicato) {
		this.cveIdSindicato = cveIdSindicato;
	}

	public String getDesAutLab() {
		return this.desAutLab;
	}

	public void setDesAutLab(String desAutLab) {
		this.desAutLab = desAutLab;
	}

	public Date getFecDocRegistro() {
		return this.fecDocRegistro;
	}

	public void setFecDocRegistro(Date fecDocRegistro) {
		this.fecDocRegistro = fecDocRegistro;
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

	public String getNumRefRegistro() {
		return this.numRefRegistro;
	}

	public void setNumRefRegistro(String numRefRegistro) {
		this.numRefRegistro = numRefRegistro;
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
		result = prime * result + (int) (cveIdSindicato ^ (cveIdSindicato >>> 32));
		result = prime * result + ((desAutLab == null) ? 0 : desAutLab.hashCode());
		result = prime * result + ((ditPersonaMoral == null) ? 0 : ditPersonaMoral.hashCode());
		result = prime * result + ((fecDocRegistro == null) ? 0 : fecDocRegistro.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((numRefRegistro == null) ? 0 : numRefRegistro.hashCode());
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
		DitSindicatoDO other = (DitSindicatoDO) obj;
		if (cveIdSindicato != other.cveIdSindicato)
			return false;
		if (desAutLab == null) {
			if (other.desAutLab != null)
				return false;
		} else if (!desAutLab.equals(other.desAutLab))
			return false;
		if (ditPersonaMoral == null) {
			if (other.ditPersonaMoral != null)
				return false;
		} else if (!ditPersonaMoral.equals(other.ditPersonaMoral))
			return false;
		if (fecDocRegistro == null) {
			if (other.fecDocRegistro != null)
				return false;
		} else if (!fecDocRegistro.equals(other.fecDocRegistro))
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
		if (numRefRegistro == null) {
			if (other.numRefRegistro != null)
				return false;
		} else if (!numRefRegistro.equals(other.numRefRegistro))
			return false;
		return true;
	}
		
	

}