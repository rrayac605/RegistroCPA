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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveIdEstadoTramite ^ (cveIdEstadoTramite >>> 32));
		result = prime * result + ((desEstadoTramite == null) ? 0 : desEstadoTramite.hashCode());
		result = prime * result + ((ditTramites == null) ? 0 : ditTramites.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((refSigla == null) ? 0 : refSigla.hashCode());
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
		DicEstadoTramiteDO other = (DicEstadoTramiteDO) obj;
		if (cveIdEstadoTramite != other.cveIdEstadoTramite)
			return false;
		if (desEstadoTramite == null) {
			if (other.desEstadoTramite != null)
				return false;
		} else if (!desEstadoTramite.equals(other.desEstadoTramite))
			return false;
		if (ditTramites == null) {
			if (other.ditTramites != null)
				return false;
		} else if (!ditTramites.equals(other.ditTramites))
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
		if (refSigla == null) {
			if (other.refSigla != null)
				return false;
		} else if (!refSigla.equals(other.refSigla))
			return false;
		return true;
	}
	
	

}