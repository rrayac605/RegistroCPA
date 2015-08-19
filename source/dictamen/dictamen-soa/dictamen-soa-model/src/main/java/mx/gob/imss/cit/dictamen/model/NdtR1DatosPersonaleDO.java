package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the NDT_R1_DATOS_PERSONALES database table.
 * 
 */
@Entity
@Table(name="NDT_R1_DATOS_PERSONALES")
@NamedQuery(name="NdtR1DatosPersonaleDO.findAll", query="SELECT n FROM NdtR1DatosPersonaleDO n")
public class NdtR1DatosPersonaleDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "CVE_ID_R1_DATOS_PERSONALES", nullable = false)
    @SequenceGenerator(name = "NdtR1DatosPersonales_Id_Seq_Gen", sequenceName = "SEQ_NDTR1DATOSPERSONALES")
    @GeneratedValue(generator = "NdtR1DatosPersonales_Id_Seq_Gen")
	private long cveIdR1DatosPersonales;

	@Column(name="CEDULA_PROFESIONAL")
	private String cedulaProfesional;

	@Column(name="CVE_ID_USUARIO")
	private String cveIdUsuario;

	@Column(name="DES_TITULO_EXPEDIDO_POR")
	private String desTituloExpedidoPor;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_EXPEDICION_CEDPROF")
	private Date fecExpedicionCedprof;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_SOLICITUD_R1")
	private Date fecSolicitudR1;

	@Column(name="NUM_TRAMITE_NOTARIA")
	private String numTramiteNotaria;

	@Column(name="URL_ACUSE_NOTARIA")
	private String urlAcuseNotaria;

	//bi-directional many-to-one association to DicSubdelegacionDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_SUBDELEGACION")
	private DicSubdelegacionDO dicSubdelegacion;

	//bi-directional many-to-one association to DitTramiteDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_TRAMITE")
	private DitTramiteDO ditTramite;

	//bi-directional many-to-one association to NdtContadorPublicoAutDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_CPA")
	private NdtContadorPublicoAutDO ndtContadorPublicoAut;

	public NdtR1DatosPersonaleDO() {
	}

	public long getCveIdR1DatosPersonales() {
		return this.cveIdR1DatosPersonales;
	}

	public void setCveIdR1DatosPersonales(long cveIdR1DatosPersonales) {
		this.cveIdR1DatosPersonales = cveIdR1DatosPersonales;
	}

	public String getCedulaProfesional() {
		return this.cedulaProfesional;
	}

	public void setCedulaProfesional(String cedulaProfesional) {
		this.cedulaProfesional = cedulaProfesional;
	}

	public String getCveIdUsuario() {
		return this.cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDesTituloExpedidoPor() {
		return this.desTituloExpedidoPor;
	}

	public void setDesTituloExpedidoPor(String desTituloExpedidoPor) {
		this.desTituloExpedidoPor = desTituloExpedidoPor;
	}

	public Date getFecExpedicionCedprof() {
		return this.fecExpedicionCedprof;
	}

	public void setFecExpedicionCedprof(Date fecExpedicionCedprof) {
		this.fecExpedicionCedprof = fecExpedicionCedprof;
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

	public Date getFecSolicitudR1() {
		return this.fecSolicitudR1;
	}

	public void setFecSolicitudR1(Date fecSolicitudR1) {
		this.fecSolicitudR1 = fecSolicitudR1;
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

	public DicSubdelegacionDO getDicSubdelegacion() {
		return this.dicSubdelegacion;
	}

	public void setDicSubdelegacion(DicSubdelegacionDO dicSubdelegacion) {
		this.dicSubdelegacion = dicSubdelegacion;
	}

	public DitTramiteDO getDitTramite() {
		return this.ditTramite;
	}

	public void setDitTramite(DitTramiteDO ditTramite) {
		this.ditTramite = ditTramite;
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
		result = prime * result + ((cedulaProfesional == null) ? 0 : cedulaProfesional.hashCode());
		result = prime * result + (int) (cveIdR1DatosPersonales ^ (cveIdR1DatosPersonales >>> 32));
		result = prime * result + ((cveIdUsuario == null) ? 0 : cveIdUsuario.hashCode());
		result = prime * result + ((desTituloExpedidoPor == null) ? 0 : desTituloExpedidoPor.hashCode());
		result = prime * result + ((dicSubdelegacion == null) ? 0 : dicSubdelegacion.hashCode());
		result = prime * result + ((ditTramite == null) ? 0 : ditTramite.hashCode());
		result = prime * result + ((fecExpedicionCedprof == null) ? 0 : fecExpedicionCedprof.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((fecSolicitudR1 == null) ? 0 : fecSolicitudR1.hashCode());
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
		NdtR1DatosPersonaleDO other = (NdtR1DatosPersonaleDO) obj;
		if (cedulaProfesional == null) {
			if (other.cedulaProfesional != null)
				return false;
		} else if (!cedulaProfesional.equals(other.cedulaProfesional))
			return false;
		if (cveIdR1DatosPersonales != other.cveIdR1DatosPersonales)
			return false;
		if (cveIdUsuario == null) {
			if (other.cveIdUsuario != null)
				return false;
		} else if (!cveIdUsuario.equals(other.cveIdUsuario))
			return false;
		if (desTituloExpedidoPor == null) {
			if (other.desTituloExpedidoPor != null)
				return false;
		} else if (!desTituloExpedidoPor.equals(other.desTituloExpedidoPor))
			return false;
		if (dicSubdelegacion == null) {
			if (other.dicSubdelegacion != null)
				return false;
		} else if (!dicSubdelegacion.equals(other.dicSubdelegacion))
			return false;
		if (ditTramite == null) {
			if (other.ditTramite != null)
				return false;
		} else if (!ditTramite.equals(other.ditTramite))
			return false;
		if (fecExpedicionCedprof == null) {
			if (other.fecExpedicionCedprof != null)
				return false;
		} else if (!fecExpedicionCedprof.equals(other.fecExpedicionCedprof))
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
		if (fecSolicitudR1 == null) {
			if (other.fecSolicitudR1 != null)
				return false;
		} else if (!fecSolicitudR1.equals(other.fecSolicitudR1))
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