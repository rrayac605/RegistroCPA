package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIC_TIPO_SOLICITUD database table.
 * 
 */
@Entity
@Table(name="DIC_TIPO_SOLICITUD")
@NamedQuery(name="DicTipoSolicitudDO.findAll", query="SELECT d FROM DicTipoSolicitudDO d")
public class DicTipoSolicitudDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_TIPO_SOLICITUD")
	private long cveIdTipoSolicitud;

	@Column(name="DES_TIPO_SOLICITUD")
	private String desTipoSolicitud;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to DitSolicitudDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dicTipoSolicitud")
	private List<DitSolicitudDO> ditSolicituds;

	public DicTipoSolicitudDO() {
	}

	public long getCveIdTipoSolicitud() {
		return this.cveIdTipoSolicitud;
	}

	public void setCveIdTipoSolicitud(long cveIdTipoSolicitud) {
		this.cveIdTipoSolicitud = cveIdTipoSolicitud;
	}

	public String getDesTipoSolicitud() {
		return this.desTipoSolicitud;
	}

	public void setDesTipoSolicitud(String desTipoSolicitud) {
		this.desTipoSolicitud = desTipoSolicitud;
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

	public List<DitSolicitudDO> getDitSolicituds() {
		return this.ditSolicituds;
	}

	public void setDitSolicituds(List<DitSolicitudDO> ditSolicituds) {
		this.ditSolicituds = ditSolicituds;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveIdTipoSolicitud ^ (cveIdTipoSolicitud >>> 32));
		result = prime * result + ((desTipoSolicitud == null) ? 0 : desTipoSolicitud.hashCode());
		result = prime * result + ((ditSolicituds == null) ? 0 : ditSolicituds.hashCode());
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
		DicTipoSolicitudDO other = (DicTipoSolicitudDO) obj;
		if (cveIdTipoSolicitud != other.cveIdTipoSolicitud)
			return false;
		if (desTipoSolicitud == null) {
			if (other.desTipoSolicitud != null)
				return false;
		} else if (!desTipoSolicitud.equals(other.desTipoSolicitud))
			return false;
		if (ditSolicituds == null) {
			if (other.ditSolicituds != null)
				return false;
		} else if (!ditSolicituds.equals(other.ditSolicituds))
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