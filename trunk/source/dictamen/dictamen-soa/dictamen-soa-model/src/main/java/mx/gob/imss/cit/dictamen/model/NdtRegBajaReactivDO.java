package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the NDT_REG_BAJA_REACTIV database table.
 * 
 */
@Entity
@Table(name="NDT_REG_BAJA_REACTIV")
@NamedQuery(name="NdtRegBajaReactivDO.findAll", query="SELECT n FROM NdtRegBajaReactivDO n")
public class NdtRegBajaReactivDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "CVE_ID_CPA_REGISTRO", nullable = false)
    @SequenceGenerator(name = "NdtRegBajaReactiv_Id_Seq_Gen", sequenceName = "SEQ_NDTREGBAJAREACTIV")
    @GeneratedValue(generator = "NdtRegBajaReactiv_Id_Seq_Gen")
	private long cveIdCpaRegistro;

	@Column(name="CVE_ID_USUARIO")
	private String cveIdUsuario;

	@Column(name="DES_COMENTARIOS")
	private String desComentarios;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_AUTORIZACION_MOVIMIENTO")
	private Date fecAutorizacionMovimiento;

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
	@Column(name="FEC_SOLICITUD_MOVIMIENTO")
	private Date fecSolicitudMovimiento;

	//bi-directional many-to-one association to NdtDoctosProbCpaDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ndtRegBajaReactiv")
	private List<NdtDoctosProbCpaDO> ndtDoctosProbCpas;

	//bi-directional many-to-one association to DitTramiteDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_TRAMITE")
	private DitTramiteDO ditTramite;

	//bi-directional many-to-one association to NdcEstadoCpaDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_ESTADO_CPA")
	private NdcEstadoCpaDO ndcEstadoCpa;

	//bi-directional many-to-one association to NdtContadorPublicoAutDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_CPA")
	private NdtContadorPublicoAutDO ndtContadorPublicoAut;

	public NdtRegBajaReactivDO() {
	}

	public long getCveIdCpaRegistro() {
		return this.cveIdCpaRegistro;
	}

	public void setCveIdCpaRegistro(long cveIdCpaRegistro) {
		this.cveIdCpaRegistro = cveIdCpaRegistro;
	}

	public String getCveIdUsuario() {
		return this.cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDesComentarios() {
		return this.desComentarios;
	}

	public void setDesComentarios(String desComentarios) {
		this.desComentarios = desComentarios;
	}

	public Date getFecAutorizacionMovimiento() {
		return this.fecAutorizacionMovimiento;
	}

	public void setFecAutorizacionMovimiento(Date fecAutorizacionMovimiento) {
		this.fecAutorizacionMovimiento = fecAutorizacionMovimiento;
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

	public Date getFecSolicitudMovimiento() {
		return this.fecSolicitudMovimiento;
	}

	public void setFecSolicitudMovimiento(Date fecSolicitudMovimiento) {
		this.fecSolicitudMovimiento = fecSolicitudMovimiento;
	}

	public List<NdtDoctosProbCpaDO> getNdtDoctosProbCpas() {
		return this.ndtDoctosProbCpas;
	}

	public void setNdtDoctosProbCpas(List<NdtDoctosProbCpaDO> ndtDoctosProbCpas) {
		this.ndtDoctosProbCpas = ndtDoctosProbCpas;
	}
	
	public DitTramiteDO getDitTramite() {
		return this.ditTramite;
	}

	public void setDitTramite(DitTramiteDO ditTramite) {
		this.ditTramite = ditTramite;
	}

	public NdcEstadoCpaDO getNdcEstadoCpa() {
		return this.ndcEstadoCpa;
	}

	public void setNdcEstadoCpa(NdcEstadoCpaDO ndcEstadoCpa) {
		this.ndcEstadoCpa = ndcEstadoCpa;
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
		result = prime * result + (int) (cveIdCpaRegistro ^ (cveIdCpaRegistro >>> 32));
		result = prime * result + ((cveIdUsuario == null) ? 0 : cveIdUsuario.hashCode());
		result = prime * result + ((desComentarios == null) ? 0 : desComentarios.hashCode());
		result = prime * result + ((ditTramite == null) ? 0 : ditTramite.hashCode());
		result = prime * result + ((fecAutorizacionMovimiento == null) ? 0 : fecAutorizacionMovimiento.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((fecSolicitudMovimiento == null) ? 0 : fecSolicitudMovimiento.hashCode());
		result = prime * result + ((ndcEstadoCpa == null) ? 0 : ndcEstadoCpa.hashCode());
		result = prime * result + ((ndtContadorPublicoAut == null) ? 0 : ndtContadorPublicoAut.hashCode());
		result = prime * result + ((ndtDoctosProbCpas == null) ? 0 : ndtDoctosProbCpas.hashCode());
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
		NdtRegBajaReactivDO other = (NdtRegBajaReactivDO) obj;
		if (cveIdCpaRegistro != other.cveIdCpaRegistro)
			return false;
		if (cveIdUsuario == null) {
			if (other.cveIdUsuario != null)
				return false;
		} else if (!cveIdUsuario.equals(other.cveIdUsuario))
			return false;
		if (desComentarios == null) {
			if (other.desComentarios != null)
				return false;
		} else if (!desComentarios.equals(other.desComentarios))
			return false;
		if (ditTramite == null) {
			if (other.ditTramite != null)
				return false;
		} else if (!ditTramite.equals(other.ditTramite))
			return false;
		if (fecAutorizacionMovimiento == null) {
			if (other.fecAutorizacionMovimiento != null)
				return false;
		} else if (!fecAutorizacionMovimiento.equals(other.fecAutorizacionMovimiento))
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
		if (fecSolicitudMovimiento == null) {
			if (other.fecSolicitudMovimiento != null)
				return false;
		} else if (!fecSolicitudMovimiento.equals(other.fecSolicitudMovimiento))
			return false;
		if (ndcEstadoCpa == null) {
			if (other.ndcEstadoCpa != null)
				return false;
		} else if (!ndcEstadoCpa.equals(other.ndcEstadoCpa))
			return false;
		if (ndtContadorPublicoAut == null) {
			if (other.ndtContadorPublicoAut != null)
				return false;
		} else if (!ndtContadorPublicoAut.equals(other.ndtContadorPublicoAut))
			return false;
		if (ndtDoctosProbCpas == null) {
			if (other.ndtDoctosProbCpas != null)
				return false;
		} else if (!ndtDoctosProbCpas.equals(other.ndtDoctosProbCpas))
			return false;
		return true;
	}
	
	

}