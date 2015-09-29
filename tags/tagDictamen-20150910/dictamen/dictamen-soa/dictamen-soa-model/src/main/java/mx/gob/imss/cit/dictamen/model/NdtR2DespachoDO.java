package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the NDT_R2_DESPACHO database table.
 * 
 */
@Entity
@Table(name="NDT_R2_DESPACHO")
@NamedQuery(name="NdtR2DespachoDO.findAll", query="SELECT n FROM NdtR2DespachoDO n")
public class NdtR2DespachoDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "CVE_ID_CPA_DESPACHO", nullable = false)
    @SequenceGenerator(name = "NdtR2Despacho_Id_Seq_Gen", sequenceName = "SEQ_NDTR2DESPACHO")
    @GeneratedValue(generator = "NdtR2Despacho_Id_Seq_Gen")
	private long cveIdCpaDespacho;

	@Column(name="CARGO_QUE_DESEMPENA")
	private String cargoQueDesempena;

	@Column(name="CVE_ID_USUARIO")
	private String cveIdUsuario;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FECHA_SOLICITUD_R2")
	private Date fechaSolicitudR2;

	@Column(name="IND_TIPO_CPA")
	private BigDecimal indTipoCpa;

	@Column(name="NUM_TRABAJADORES_CONTRATADOS")
	private BigDecimal numTrabajadoresContratados;

	@Column(name="NUM_TRAMITE_NOTARIA")
	private String numTramiteNotaria;

	@Column(name="URL_ACUSE_NOTARIA")
	private String urlAcuseNotaria;

	//bi-directional many-to-one association to DitPatronSujetoObligadoDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PATRON_SUJETO_OBLIGADO")
	private DitPatronSujetoObligadoDO ditPatronSujetoObligado;

	//bi-directional many-to-one association to DitTramiteDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_TRAMITE")
	private DitTramiteDO ditTramite;

	//bi-directional many-to-one association to NdcDespachoDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_DESPACHO")
	private NdcDespachoDO ndcDespacho;

	//bi-directional many-to-one association to NdtContadorPublicoAutDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_CPA")
	private NdtContadorPublicoAutDO ndtContadorPublicoAut;

	public NdtR2DespachoDO() {
	}

	public long getCveIdCpaDespacho() {
		return this.cveIdCpaDespacho;
	}

	public void setCveIdCpaDespacho(long cveIdCpaDespacho) {
		this.cveIdCpaDespacho = cveIdCpaDespacho;
	}

	public String getCargoQueDesempena() {
		return this.cargoQueDesempena;
	}

	public void setCargoQueDesempena(String cargoQueDesempena) {
		this.cargoQueDesempena = cargoQueDesempena;
	}

	public String getCveIdUsuario() {
		return this.cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
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

	public Date getFechaSolicitudR2() {
		return this.fechaSolicitudR2;
	}

	public void setFechaSolicitudR2(Date fechaSolicitudR2) {
		this.fechaSolicitudR2 = fechaSolicitudR2;
	}

	public BigDecimal getIndTipoCpa() {
		return this.indTipoCpa;
	}

	public void setIndTipoCpa(BigDecimal indTipoCpa) {
		this.indTipoCpa = indTipoCpa;
	}

	public BigDecimal getNumTrabajadoresContratados() {
		return this.numTrabajadoresContratados;
	}

	public void setNumTrabajadoresContratados(BigDecimal numTrabajadoresContratados) {
		this.numTrabajadoresContratados = numTrabajadoresContratados;
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

	public DitPatronSujetoObligadoDO getDitPatronSujetoObligado() {
		return this.ditPatronSujetoObligado;
	}

	public void setDitPatronSujetoObligado(DitPatronSujetoObligadoDO ditPatronSujetoObligado) {
		this.ditPatronSujetoObligado = ditPatronSujetoObligado;
	}

	public DitTramiteDO getDitTramite() {
		return this.ditTramite;
	}

	public void setDitTramite(DitTramiteDO ditTramite) {
		this.ditTramite = ditTramite;
	}

	public NdcDespachoDO getNdcDespacho() {
		return this.ndcDespacho;
	}

	public void setNdcDespacho(NdcDespachoDO ndcDespacho) {
		this.ndcDespacho = ndcDespacho;
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
		result = prime * result + ((cargoQueDesempena == null) ? 0 : cargoQueDesempena.hashCode());
		result = prime * result + (int) (cveIdCpaDespacho ^ (cveIdCpaDespacho >>> 32));
		result = prime * result + ((cveIdUsuario == null) ? 0 : cveIdUsuario.hashCode());
		result = prime * result + ((ditPatronSujetoObligado == null) ? 0 : ditPatronSujetoObligado.hashCode());
		result = prime * result + ((ditTramite == null) ? 0 : ditTramite.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((fechaSolicitudR2 == null) ? 0 : fechaSolicitudR2.hashCode());
		result = prime * result + ((indTipoCpa == null) ? 0 : indTipoCpa.hashCode());
		result = prime * result + ((ndcDespacho == null) ? 0 : ndcDespacho.hashCode());
		result = prime * result + ((ndtContadorPublicoAut == null) ? 0 : ndtContadorPublicoAut.hashCode());
		result = prime * result + ((numTrabajadoresContratados == null) ? 0 : numTrabajadoresContratados.hashCode());
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
		NdtR2DespachoDO other = (NdtR2DespachoDO) obj;
		if (cargoQueDesempena == null) {
			if (other.cargoQueDesempena != null)
				return false;
		} else if (!cargoQueDesempena.equals(other.cargoQueDesempena))
			return false;
		if (cveIdCpaDespacho != other.cveIdCpaDespacho)
			return false;
		if (cveIdUsuario == null) {
			if (other.cveIdUsuario != null)
				return false;
		} else if (!cveIdUsuario.equals(other.cveIdUsuario))
			return false;
		if (ditPatronSujetoObligado == null) {
			if (other.ditPatronSujetoObligado != null)
				return false;
		} else if (!ditPatronSujetoObligado.equals(other.ditPatronSujetoObligado))
			return false;
		if (ditTramite == null) {
			if (other.ditTramite != null)
				return false;
		} else if (!ditTramite.equals(other.ditTramite))
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
		if (fechaSolicitudR2 == null) {
			if (other.fechaSolicitudR2 != null)
				return false;
		} else if (!fechaSolicitudR2.equals(other.fechaSolicitudR2))
			return false;
		if (indTipoCpa == null) {
			if (other.indTipoCpa != null)
				return false;
		} else if (!indTipoCpa.equals(other.indTipoCpa))
			return false;
		if (ndcDespacho == null) {
			if (other.ndcDespacho != null)
				return false;
		} else if (!ndcDespacho.equals(other.ndcDespacho))
			return false;
		if (ndtContadorPublicoAut == null) {
			if (other.ndtContadorPublicoAut != null)
				return false;
		} else if (!ndtContadorPublicoAut.equals(other.ndtContadorPublicoAut))
			return false;
		if (numTrabajadoresContratados == null) {
			if (other.numTrabajadoresContratados != null)
				return false;
		} else if (!numTrabajadoresContratados.equals(other.numTrabajadoresContratados))
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