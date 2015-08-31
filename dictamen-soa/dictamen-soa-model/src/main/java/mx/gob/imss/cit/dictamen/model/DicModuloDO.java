package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIC_MODULO database table.
 * 
 */
@Entity
@Table(name="DIC_MODULO")
@NamedQuery(name="DicModuloDO.findAll", query="SELECT d FROM DicModuloDO d")
public class DicModuloDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_MODULO")
	private long cveIdModulo;

	@Column(name="DES_MODULO")
	private String desModulo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-many association to DicTipoTramiteDO
	@ManyToMany(mappedBy="dicModulos")
	private List<DicTipoTramiteDO> dicTipoTramites;

	public DicModuloDO() {
	}

	public long getCveIdModulo() {
		return this.cveIdModulo;
	}

	public void setCveIdModulo(long cveIdModulo) {
		this.cveIdModulo = cveIdModulo;
	}

	public String getDesModulo() {
		return this.desModulo;
	}

	public void setDesModulo(String desModulo) {
		this.desModulo = desModulo;
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

	public List<DicTipoTramiteDO> getDicTipoTramites() {
		return this.dicTipoTramites;
	}

	public void setDicTipoTramites(List<DicTipoTramiteDO> dicTipoTramites) {
		this.dicTipoTramites = dicTipoTramites;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveIdModulo ^ (cveIdModulo >>> 32));
		result = prime * result + ((desModulo == null) ? 0 : desModulo.hashCode());
		result = prime * result + ((dicTipoTramites == null) ? 0 : dicTipoTramites.hashCode());
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
		DicModuloDO other = (DicModuloDO) obj;
		if (cveIdModulo != other.cveIdModulo)
			return false;
		if (desModulo == null) {
			if (other.desModulo != null)
				return false;
		} else if (!desModulo.equals(other.desModulo))
			return false;
		if (dicTipoTramites == null) {
			if (other.dicTipoTramites != null)
				return false;
		} else if (!dicTipoTramites.equals(other.dicTipoTramites))
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