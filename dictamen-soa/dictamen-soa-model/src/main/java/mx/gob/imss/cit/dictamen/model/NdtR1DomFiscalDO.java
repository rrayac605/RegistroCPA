package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the NDT_R1_DOM_FISCAL database table.
 * 
 */
@Entity
@Table(name="NDT_R1_DOM_FISCAL")
@NamedQuery(name="NdtR1DomFiscalDO.findAll", query="SELECT n FROM NdtR1DomFiscalDO n")
public class NdtR1DomFiscalDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "CVE_ID_R1_DOM_FISCAL", nullable = false)
    @SequenceGenerator(name = "NdtR1DomFiscal_Id_Seq_Gen", sequenceName = "SEQ_NDTR1DOMFISCAL")
    @GeneratedValue(generator = "NdtR1DomFiscal_Id_Seq_Gen")
	private long cveIdR1DomFiscal;

	@Column(name="CEDULA_PROFESIONAL")
	private String cedulaProfesional;

	private String curp;

	@Column(name="CVE_ID_CPA")
	private BigDecimal cveIdCpa;

	@Column(name="CVE_ID_USUARIO")
	private String cveIdUsuario;

	@Column(name="DES_TITULO_EXPEDIDO_POR")
	private String desTituloExpedidoPor;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_EXPEDICION_CEDPROF")
	private Date fecExpedicionCedprof;

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
	@Column(name="FEC_SOLICITUD_R1")
	private Date fecSolicitudR1;

	//bi-directional many-to-one association to DgDomicilioGeograficoDO
	@ManyToOne
	@JoinColumn(name="DOMICILIO_ID")
	private DgDomicilioGeograficoDO dgDomicilioGeografico;

	//bi-directional many-to-one association to DicSubdelegacionDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_SUBDELEGACION")
	private DicSubdelegacionDO dicSubdelegacion;

	//bi-directional many-to-one association to DitTramiteDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_TRAMITE")
	private DitTramiteDO ditTramite;

	public NdtR1DomFiscalDO() {
	}

	public long getCveIdR1DomFiscal() {
		return this.cveIdR1DomFiscal;
	}

	public void setCveIdR1DomFiscal(long cveIdR1DomFiscal) {
		this.cveIdR1DomFiscal = cveIdR1DomFiscal;
	}

	public String getCedulaProfesional() {
		return this.cedulaProfesional;
	}

	public void setCedulaProfesional(String cedulaProfesional) {
		this.cedulaProfesional = cedulaProfesional;
	}

	public String getCurp() {
		return this.curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public BigDecimal getCveIdCpa() {
		return this.cveIdCpa;
	}

	public void setCveIdCpa(BigDecimal cveIdCpa) {
		this.cveIdCpa = cveIdCpa;
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

	public Date getFecSolicitudR1() {
		return this.fecSolicitudR1;
	}

	public void setFecSolicitudR1(Date fecSolicitudR1) {
		this.fecSolicitudR1 = fecSolicitudR1;
	}

	public DgDomicilioGeograficoDO getDgDomicilioGeografico() {
		return this.dgDomicilioGeografico;
	}

	public void setDgDomicilioGeografico(DgDomicilioGeograficoDO dgDomicilioGeografico) {
		this.dgDomicilioGeografico = dgDomicilioGeografico;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cedulaProfesional == null) ? 0 : cedulaProfesional.hashCode());
		result = prime * result + ((curp == null) ? 0 : curp.hashCode());
		result = prime * result + ((cveIdCpa == null) ? 0 : cveIdCpa.hashCode());
		result = prime * result + (int) (cveIdR1DomFiscal ^ (cveIdR1DomFiscal >>> 32));
		result = prime * result + ((cveIdUsuario == null) ? 0 : cveIdUsuario.hashCode());
		result = prime * result + ((desTituloExpedidoPor == null) ? 0 : desTituloExpedidoPor.hashCode());
		result = prime * result + ((dgDomicilioGeografico == null) ? 0 : dgDomicilioGeografico.hashCode());
		result = prime * result + ((dicSubdelegacion == null) ? 0 : dicSubdelegacion.hashCode());
		result = prime * result + ((ditTramite == null) ? 0 : ditTramite.hashCode());
		result = prime * result + ((fecExpedicionCedprof == null) ? 0 : fecExpedicionCedprof.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((fecSolicitudR1 == null) ? 0 : fecSolicitudR1.hashCode());
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
		NdtR1DomFiscalDO other = (NdtR1DomFiscalDO) obj;
		if (cedulaProfesional == null) {
			if (other.cedulaProfesional != null)
				return false;
		} else if (!cedulaProfesional.equals(other.cedulaProfesional))
			return false;
		if (curp == null) {
			if (other.curp != null)
				return false;
		} else if (!curp.equals(other.curp))
			return false;
		if (cveIdCpa == null) {
			if (other.cveIdCpa != null)
				return false;
		} else if (!cveIdCpa.equals(other.cveIdCpa))
			return false;
		if (cveIdR1DomFiscal != other.cveIdR1DomFiscal)
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
		if (dgDomicilioGeografico == null) {
			if (other.dgDomicilioGeografico != null)
				return false;
		} else if (!dgDomicilioGeografico.equals(other.dgDomicilioGeografico))
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
		if (fecSolicitudR1 == null) {
			if (other.fecSolicitudR1 != null)
				return false;
		} else if (!fecSolicitudR1.equals(other.fecSolicitudR1))
			return false;
		return true;
	}
	
	

}