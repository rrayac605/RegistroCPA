package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIC_ESTADO_SOLICITUD database table.
 * 
 */
@Entity
@Table(name="DIC_ESTADO_SOLICITUD")
@NamedQuery(name="DicEstadoSolicitudDO.findAll", query="SELECT d FROM DicEstadoSolicitudDO d")
public class DicEstadoSolicitudDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_ESTADO_SOLICITUD")
	private long cveIdEstadoSolicitud;

	@Column(name="DES_ESTADO_SOLICITUD")
	private String desEstadoSolicitud;

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
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dicEstadoSolicitud")
	private List<DitSolicitudDO> ditSolicituds;

	public DicEstadoSolicitudDO() {
	}

	public long getCveIdEstadoSolicitud() {
		return this.cveIdEstadoSolicitud;
	}

	public void setCveIdEstadoSolicitud(long cveIdEstadoSolicitud) {
		this.cveIdEstadoSolicitud = cveIdEstadoSolicitud;
	}

	public String getDesEstadoSolicitud() {
		return this.desEstadoSolicitud;
	}

	public void setDesEstadoSolicitud(String desEstadoSolicitud) {
		this.desEstadoSolicitud = desEstadoSolicitud;
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
		result = prime * result + (int) (cveIdEstadoSolicitud ^ (cveIdEstadoSolicitud >>> 32));
		result = prime * result + ((desEstadoSolicitud == null) ? 0 : desEstadoSolicitud.hashCode());
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
		DicEstadoSolicitudDO other = (DicEstadoSolicitudDO) obj;
		if (cveIdEstadoSolicitud != other.cveIdEstadoSolicitud)
			return false;
		if (desEstadoSolicitud == null) {
			if (other.desEstadoSolicitud != null)
				return false;
		} else if (!desEstadoSolicitud.equals(other.desEstadoSolicitud))
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