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
}