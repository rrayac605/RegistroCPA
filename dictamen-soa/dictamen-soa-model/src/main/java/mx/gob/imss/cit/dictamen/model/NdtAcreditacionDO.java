package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the NDT_ACREDITACION database table.
 * 
 */
@Entity
@Table(name="NDT_ACREDITACION")
@NamedQuery(name="NdtAcreditacionDO.findAll", query="SELECT n FROM NdtAcreditacionDO n")
public class NdtAcreditacionDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "CVE_ID_CPA_ACREDITACION", nullable = false)
    @SequenceGenerator(name = "NdtAcreditacion_Id_Seq_Gen", sequenceName = "SEQ_NDTACREDITACION")
    @GeneratedValue(generator = "NdtAcreditacion_Id_Seq_Gen")
	private long cveIdCpaAcreditacion;

	@Column(name="CVE_ID_USUARIO")
	private String cveIdUsuario;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_ACREDITACION_CP")
	private Date fecAcreditacionCp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_SOLICITUD")
	private Date fecSolicitud;

	@Column(name="NUM_TRAMITE_NOTARIA")
	private String numTramiteNotaria;

	@Column(name="URL_ACUSE_NOTARIA")
	private String urlAcuseNotaria;

	//bi-directional many-to-one association to DitTramiteDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_TRAMITE")
	private DitTramiteDO ditTramite;

	//bi-directional many-to-one association to NdcColegioDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_COLEGIO")
	private NdcColegioDO ndcColegio;

	//bi-directional many-to-one association to NdtContadorPublicoAutDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_CPA")
	private NdtContadorPublicoAutDO ndtContadorPublicoAut;

	public NdtAcreditacionDO() {
	}

	public long getCveIdCpaAcreditacion() {
		return this.cveIdCpaAcreditacion;
	}

	public void setCveIdCpaAcreditacion(long cveIdCpaAcreditacion) {
		this.cveIdCpaAcreditacion = cveIdCpaAcreditacion;
	}

	public String getCveIdUsuario() {
		return this.cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public Date getFecAcreditacionCp() {
		return this.fecAcreditacionCp;
	}

	public void setFecAcreditacionCp(Date fecAcreditacionCp) {
		this.fecAcreditacionCp = fecAcreditacionCp;
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

	public Date getFecSolicitud() {
		return this.fecSolicitud;
	}

	public void setFecSolicitud(Date fecSolicitud) {
		this.fecSolicitud = fecSolicitud;
	}

	public String getNumTramiteNotaria() {
		return this.numTramiteNotaria;
	}

	public void setNumTramiteNotaria(String numTramiteNotaria) {
		this.numTramiteNotaria = numTramiteNotaria;
	}

	public String getUrlAcuseNotaria() {
		return this.urlAcuseNotaria;
	}

	public void setUrlAcuseNotaria(String urlAcuseNotaria) {
		this.urlAcuseNotaria = urlAcuseNotaria;
	}

	public DitTramiteDO getDitTramite() {
		return this.ditTramite;
	}

	public void setDitTramite(DitTramiteDO ditTramite) {
		this.ditTramite = ditTramite;
	}

	public NdcColegioDO getNdcColegio() {
		return this.ndcColegio;
	}

	public void setNdcColegio(NdcColegioDO ndcColegio) {
		this.ndcColegio = ndcColegio;
	}

	public NdtContadorPublicoAutDO getNdtContadorPublicoAut() {
		return this.ndtContadorPublicoAut;
	}

	public void setNdtContadorPublicoAut(NdtContadorPublicoAutDO ndtContadorPublicoAut) {
		this.ndtContadorPublicoAut = ndtContadorPublicoAut;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveIdCpaAcreditacion ^ (cveIdCpaAcreditacion >>> 32));
		result = prime * result + ((cveIdUsuario == null) ? 0 : cveIdUsuario.hashCode());
		result = prime * result + ((ditTramite == null) ? 0 : ditTramite.hashCode());
		result = prime * result + ((fecAcreditacionCp == null) ? 0 : fecAcreditacionCp.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((fecSolicitud == null) ? 0 : fecSolicitud.hashCode());
		result = prime * result + ((ndcColegio == null) ? 0 : ndcColegio.hashCode());
		result = prime * result + ((ndtContadorPublicoAut == null) ? 0 : ndtContadorPublicoAut.hashCode());
		result = prime * result + ((numTramiteNotaria == null) ? 0 : numTramiteNotaria.hashCode());
		result = prime * result + ((urlAcuseNotaria == null) ? 0 : urlAcuseNotaria.hashCode());
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
		NdtAcreditacionDO other = (NdtAcreditacionDO) obj;
		if (cveIdCpaAcreditacion != other.cveIdCpaAcreditacion)
			return false;
		if (cveIdUsuario == null) {
			if (other.cveIdUsuario != null)
				return false;
		} else if (!cveIdUsuario.equals(other.cveIdUsuario))
			return false;
		if (ditTramite == null) {
			if (other.ditTramite != null)
				return false;
		} else if (!ditTramite.equals(other.ditTramite))
			return false;
		if (fecAcreditacionCp == null) {
			if (other.fecAcreditacionCp != null)
				return false;
		} else if (!fecAcreditacionCp.equals(other.fecAcreditacionCp))
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
		if (fecSolicitud == null) {
			if (other.fecSolicitud != null)
				return false;
		} else if (!fecSolicitud.equals(other.fecSolicitud))
			return false;
		if (ndcColegio == null) {
			if (other.ndcColegio != null)
				return false;
		} else if (!ndcColegio.equals(other.ndcColegio))
			return false;
		if (ndtContadorPublicoAut == null) {
			if (other.ndtContadorPublicoAut != null)
				return false;
		} else if (!ndtContadorPublicoAut.equals(other.ndtContadorPublicoAut))
			return false;
		if (numTramiteNotaria == null) {
			if (other.numTramiteNotaria != null)
				return false;
		} else if (!numTramiteNotaria.equals(other.numTramiteNotaria))
			return false;
		if (urlAcuseNotaria == null) {
			if (other.urlAcuseNotaria != null)
				return false;
		} else if (!urlAcuseNotaria.equals(other.urlAcuseNotaria))
			return false;
		return true;
	}
	
	
	
}