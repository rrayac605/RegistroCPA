package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the NDT_CONTADOR_PUBLICO_AUT database table.
 * 
 */
@Entity
@Table(name="NDT_CONTADOR_PUBLICO_AUT")
@NamedQuery(name="NdtContadorPublicoAutDO.findAll", query="SELECT n FROM NdtContadorPublicoAutDO n")
public class NdtContadorPublicoAutDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "CVE_ID_CPA", nullable = false)
    @SequenceGenerator(name = "NdtContadorPublicoAut_Id_Seq_Gen", sequenceName = "SEQ_NDTCONTADORPUBLICOAUT")
    @GeneratedValue(generator = "NdtContadorPublicoAut_Id_Seq_Gen")
	private long cveIdCpa;

	@Column(name="CVE_ID_USUARIO")
	private String cveIdUsuario;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="NUM_REGISTRO_CPA")
	private BigDecimal numRegistroCpa;

	@Column(name="NUM_TRAMITE_NOTARIA")
	private String numTramiteNotaria;

	@Column(name="URL_ACUSE_NOTARIA")
	private String urlAcuseNotaria;

	//bi-directional many-to-one association to NdtAcreditacionDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ndtContadorPublicoAut")
	private List<NdtAcreditacionDO> ndtAcreditacions;

	//bi-directional many-to-one association to DitPersonaDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA")
	private DitPersonaDO ditPersona;

	//bi-directional many-to-one association to NdcEstadoCpaDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_ESTADO_CPA")
	private NdcEstadoCpaDO ndcEstadoCpa;

	//bi-directional many-to-many association to NdcTipoSancionDO
	@ManyToMany
	@JoinTable(
		name="NDT_SANCION"
		, joinColumns={
			@JoinColumn(name="CVE_ID_CPA")
			}
		, inverseJoinColumns={
			@JoinColumn(name="CVE_ID_TIPOSANCION")
			}
		)
	private List<NdcTipoSancionDO> ndcTipoSancions;

	//bi-directional many-to-one association to NdtPatronDictamenCpaDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ndtContadorPublicoAut")
	private List<NdtPatronDictamenCpaDO> ndtPatronDictamenCpas;

	//bi-directional many-to-one association to NdtR1DatosPersonaleDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ndtContadorPublicoAut")
	private List<NdtR1DatosPersonaleDO> ndtR1DatosPersonales;

	//bi-directional many-to-one association to NdtR2DespachoDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ndtContadorPublicoAut")
	private List<NdtR2DespachoDO> ndtR2Despachos;

	//bi-directional many-to-one association to NdtR3ColegioXcontadorDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ndtContadorPublicoAut")
	private List<NdtR3ColegioXcontadorDO> ndtR3ColegioXcontadors;

	//bi-directional many-to-one association to NdtRegBajaReactivDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ndtContadorPublicoAut")
	private List<NdtRegBajaReactivDO> ndtRegBajaReactivs;

	public NdtContadorPublicoAutDO() {
	}

	public long getCveIdCpa() {
		return this.cveIdCpa;
	}

	public void setCveIdCpa(long cveIdCpa) {
		this.cveIdCpa = cveIdCpa;
	}

	public String getCveIdUsuario() {
		return this.cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
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

	public BigDecimal getNumRegistroCpa() {
		return this.numRegistroCpa;
	}

	public void setNumRegistroCpa(BigDecimal numRegistroCpa) {
		this.numRegistroCpa = numRegistroCpa;
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

	public List<NdtAcreditacionDO> getNdtAcreditacions() {
		return this.ndtAcreditacions;
	}

	public void setNdtAcreditacions(List<NdtAcreditacionDO> ndtAcreditacions) {
		this.ndtAcreditacions = ndtAcreditacions;
	}

	public DitPersonaDO getDitPersona() {
		return this.ditPersona;
	}

	public void setDitPersona(DitPersonaDO ditPersona) {
		this.ditPersona = ditPersona;
	}

	public NdcEstadoCpaDO getNdcEstadoCpa() {
		return this.ndcEstadoCpa;
	}

	public void setNdcEstadoCpa(NdcEstadoCpaDO ndcEstadoCpa) {
		this.ndcEstadoCpa = ndcEstadoCpa;
	}

	public List<NdcTipoSancionDO> getNdcTipoSancions() {
		return this.ndcTipoSancions;
	}

	public void setNdcTipoSancions(List<NdcTipoSancionDO> ndcTipoSancions) {
		this.ndcTipoSancions = ndcTipoSancions;
	}

	public List<NdtPatronDictamenCpaDO> getNdtPatronDictamenCpas() {
		return this.ndtPatronDictamenCpas;
	}

	public void setNdtPatronDictamenCpas(List<NdtPatronDictamenCpaDO> ndtPatronDictamenCpas) {
		this.ndtPatronDictamenCpas = ndtPatronDictamenCpas;
	}
	
	public List<NdtR1DatosPersonaleDO> getNdtR1DatosPersonales() {
		return this.ndtR1DatosPersonales;
	}

	public void setNdtR1DatosPersonales(List<NdtR1DatosPersonaleDO> ndtR1DatosPersonales) {
		this.ndtR1DatosPersonales = ndtR1DatosPersonales;
	}

	public List<NdtR2DespachoDO> getNdtR2Despachos() {
		return this.ndtR2Despachos;
	}

	public void setNdtR2Despachos(List<NdtR2DespachoDO> ndtR2Despachos) {
		this.ndtR2Despachos = ndtR2Despachos;
	}

	public List<NdtR3ColegioXcontadorDO> getNdtR3ColegioXcontadors() {
		return this.ndtR3ColegioXcontadors;
	}

	public void setNdtR3ColegioXcontadors(List<NdtR3ColegioXcontadorDO> ndtR3ColegioXcontadors) {
		this.ndtR3ColegioXcontadors = ndtR3ColegioXcontadors;
	}

	public List<NdtRegBajaReactivDO> getNdtRegBajaReactivs() {
		return this.ndtRegBajaReactivs;
	}

	public void setNdtRegBajaReactivs(List<NdtRegBajaReactivDO> ndtRegBajaReactivs) {
		this.ndtRegBajaReactivs = ndtRegBajaReactivs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveIdCpa ^ (cveIdCpa >>> 32));
		result = prime * result + ((cveIdUsuario == null) ? 0 : cveIdUsuario.hashCode());
		result = prime * result + ((ditPersona == null) ? 0 : ditPersona.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((ndcEstadoCpa == null) ? 0 : ndcEstadoCpa.hashCode());
		result = prime * result + ((ndcTipoSancions == null) ? 0 : ndcTipoSancions.hashCode());
		result = prime * result + ((ndtAcreditacions == null) ? 0 : ndtAcreditacions.hashCode());
		result = prime * result + ((ndtPatronDictamenCpas == null) ? 0 : ndtPatronDictamenCpas.hashCode());
		result = prime * result + ((ndtR1DatosPersonales == null) ? 0 : ndtR1DatosPersonales.hashCode());
		result = prime * result + ((ndtR2Despachos == null) ? 0 : ndtR2Despachos.hashCode());
		result = prime * result + ((ndtR3ColegioXcontadors == null) ? 0 : ndtR3ColegioXcontadors.hashCode());
		result = prime * result + ((ndtRegBajaReactivs == null) ? 0 : ndtRegBajaReactivs.hashCode());
		result = prime * result + ((numRegistroCpa == null) ? 0 : numRegistroCpa.hashCode());
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
		NdtContadorPublicoAutDO other = (NdtContadorPublicoAutDO) obj;
		if (cveIdCpa != other.cveIdCpa)
			return false;
		if (cveIdUsuario == null) {
			if (other.cveIdUsuario != null)
				return false;
		} else if (!cveIdUsuario.equals(other.cveIdUsuario))
			return false;
		if (ditPersona == null) {
			if (other.ditPersona != null)
				return false;
		} else if (!ditPersona.equals(other.ditPersona))
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
		if (ndcEstadoCpa == null) {
			if (other.ndcEstadoCpa != null)
				return false;
		} else if (!ndcEstadoCpa.equals(other.ndcEstadoCpa))
			return false;
		if (ndcTipoSancions == null) {
			if (other.ndcTipoSancions != null)
				return false;
		} else if (!ndcTipoSancions.equals(other.ndcTipoSancions))
			return false;
		if (ndtAcreditacions == null) {
			if (other.ndtAcreditacions != null)
				return false;
		} else if (!ndtAcreditacions.equals(other.ndtAcreditacions))
			return false;
		if (ndtPatronDictamenCpas == null) {
			if (other.ndtPatronDictamenCpas != null)
				return false;
		} else if (!ndtPatronDictamenCpas.equals(other.ndtPatronDictamenCpas))
			return false;
		if (ndtR1DatosPersonales == null) {
			if (other.ndtR1DatosPersonales != null)
				return false;
		} else if (!ndtR1DatosPersonales.equals(other.ndtR1DatosPersonales))
			return false;
		if (ndtR2Despachos == null) {
			if (other.ndtR2Despachos != null)
				return false;
		} else if (!ndtR2Despachos.equals(other.ndtR2Despachos))
			return false;
		if (ndtR3ColegioXcontadors == null) {
			if (other.ndtR3ColegioXcontadors != null)
				return false;
		} else if (!ndtR3ColegioXcontadors.equals(other.ndtR3ColegioXcontadors))
			return false;
		if (ndtRegBajaReactivs == null) {
			if (other.ndtRegBajaReactivs != null)
				return false;
		} else if (!ndtRegBajaReactivs.equals(other.ndtRegBajaReactivs))
			return false;
		if (numRegistroCpa == null) {
			if (other.numRegistroCpa != null)
				return false;
		} else if (!numRegistroCpa.equals(other.numRegistroCpa))
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