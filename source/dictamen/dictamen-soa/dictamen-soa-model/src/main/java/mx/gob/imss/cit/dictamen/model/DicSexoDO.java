package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIC_SEXO database table.
 * 
 */
@Entity
@Table(name="DIC_SEXO")
@NamedQuery(name="DicSexoDO.findAll", query="SELECT d FROM DicSexoDO d")
public class DicSexoDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_SEXO")
	private long cveIdSexo;

	@Column(name="DES_SEXO")
	private String desSexo;

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
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dicSexo")
	private List<DitPersonaDO> ditPersonas;

	public DicSexoDO() {
	}

	public long getCveIdSexo() {
		return this.cveIdSexo;
	}

	public void setCveIdSexo(long cveIdSexo) {
		this.cveIdSexo = cveIdSexo;
	}

	public String getDesSexo() {
		return this.desSexo;
	}

	public void setDesSexo(String desSexo) {
		this.desSexo = desSexo;
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

	public List<DitPersonaDO> getDitPersonas() {
		return this.ditPersonas;
	}

	public void setDitPersonas(List<DitPersonaDO> ditPersonas) {
		this.ditPersonas = ditPersonas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveIdSexo ^ (cveIdSexo >>> 32));
		result = prime * result + ((desSexo == null) ? 0 : desSexo.hashCode());
		result = prime * result + ((ditPersonas == null) ? 0 : ditPersonas.hashCode());
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
		DicSexoDO other = (DicSexoDO) obj;
		if (cveIdSexo != other.cveIdSexo)
			return false;
		if (desSexo == null) {
			if (other.desSexo != null)
				return false;
		} else if (!desSexo.equals(other.desSexo))
			return false;
		if (ditPersonas == null) {
			if (other.ditPersonas != null)
				return false;
		} else if (!ditPersonas.equals(other.ditPersonas))
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