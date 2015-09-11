package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIC_TIPO_SOCIEDAD database table.
 * 
 */
@Entity
@Table(name="DIC_TIPO_SOCIEDAD")
@NamedQuery(name="DicTipoSociedadDO.findAll", query="SELECT d FROM DicTipoSociedadDO d")
public class DicTipoSociedadDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_TIPO_SOCIEDAD")
	private long cveIdTipoSociedad;

	@Column(name="DES_TIPO_SOCIEDAD")
	private String desTipoSociedad;

	@Column(name="DES_TIPO_SOCIEDAD_ABREV")
	private String desTipoSociedadAbrev;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to DitPersonaMoralDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dicTipoSociedad")
	private List<DitPersonaMoralDO> ditPersonaMorals;

	public DicTipoSociedadDO() {
	}

	public long getCveIdTipoSociedad() {
		return this.cveIdTipoSociedad;
	}

	public void setCveIdTipoSociedad(long cveIdTipoSociedad) {
		this.cveIdTipoSociedad = cveIdTipoSociedad;
	}

	public String getDesTipoSociedad() {
		return this.desTipoSociedad;
	}

	public void setDesTipoSociedad(String desTipoSociedad) {
		this.desTipoSociedad = desTipoSociedad;
	}

	public String getDesTipoSociedadAbrev() {
		return this.desTipoSociedadAbrev;
	}

	public void setDesTipoSociedadAbrev(String desTipoSociedadAbrev) {
		this.desTipoSociedadAbrev = desTipoSociedadAbrev;
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

	public List<DitPersonaMoralDO> getDitPersonaMorals() {
		return this.ditPersonaMorals;
	}

	public void setDitPersonaMorals(List<DitPersonaMoralDO> ditPersonaMorals) {
		this.ditPersonaMorals = ditPersonaMorals;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveIdTipoSociedad ^ (cveIdTipoSociedad >>> 32));
		result = prime * result + ((desTipoSociedad == null) ? 0 : desTipoSociedad.hashCode());
		result = prime * result + ((desTipoSociedadAbrev == null) ? 0 : desTipoSociedadAbrev.hashCode());
		result = prime * result + ((ditPersonaMorals == null) ? 0 : ditPersonaMorals.hashCode());
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
		DicTipoSociedadDO other = (DicTipoSociedadDO) obj;
		if (cveIdTipoSociedad != other.cveIdTipoSociedad)
			return false;
		if (desTipoSociedad == null) {
			if (other.desTipoSociedad != null)
				return false;
		} else if (!desTipoSociedad.equals(other.desTipoSociedad))
			return false;
		if (desTipoSociedadAbrev == null) {
			if (other.desTipoSociedadAbrev != null)
				return false;
		} else if (!desTipoSociedadAbrev.equals(other.desTipoSociedadAbrev))
			return false;
		if (ditPersonaMorals == null) {
			if (other.ditPersonaMorals != null)
				return false;
		} else if (!ditPersonaMorals.equals(other.ditPersonaMorals))
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