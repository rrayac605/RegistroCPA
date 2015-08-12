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

}