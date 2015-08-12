package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIC_ESTADO_TRAMITE database table.
 * 
 */
@Entity
@Table(name="DIC_ESTADO_TRAMITE")
@NamedQuery(name="DicEstadoTramiteDO.findAll", query="SELECT d FROM DicEstadoTramiteDO d")
public class DicEstadoTramiteDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_ESTADO_TRAMITE")
	private long cveIdEstadoTramite;

	@Column(name="DES_ESTADO_TRAMITE")
	private String desEstadoTramite;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="REF_SIGLA")
	private String refSigla;

	//bi-directional many-to-one association to DitTramiteDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dicEstadoTramite")
	private List<DitTramiteDO> ditTramites;

	public DicEstadoTramiteDO() {
	}

	public long getCveIdEstadoTramite() {
		return this.cveIdEstadoTramite;
	}

	public void setCveIdEstadoTramite(long cveIdEstadoTramite) {
		this.cveIdEstadoTramite = cveIdEstadoTramite;
	}

	public String getDesEstadoTramite() {
		return this.desEstadoTramite;
	}

	public void setDesEstadoTramite(String desEstadoTramite) {
		this.desEstadoTramite = desEstadoTramite;
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

	public String getRefSigla() {
		return this.refSigla;
	}

	public void setRefSigla(String refSigla) {
		this.refSigla = refSigla;
	}

	public List<DitTramiteDO> getDitTramites() {
		return this.ditTramites;
	}

	public void setDitTramites(List<DitTramiteDO> ditTramites) {
		this.ditTramites = ditTramites;
	}

}