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
	@Column(name="CVE_ID_CPA")
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
	@OneToMany(mappedBy="ndtContadorPublicoAut")
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
	@OneToMany(mappedBy="ndtContadorPublicoAut")
	private List<NdtPatronDictamenCpaDO> ndtPatronDictamenCpas;

	//bi-directional many-to-one association to NdtR1DatosPersonaleDO
	@OneToMany(mappedBy="ndtContadorPublicoAut")
	private List<NdtR1DatosPersonaleDO> ndtR1DatosPersonales;

	//bi-directional many-to-one association to NdtR2DespachoDO
	@OneToMany(mappedBy="ndtContadorPublicoAut")
	private List<NdtR2DespachoDO> ndtR2Despachos;

	//bi-directional many-to-one association to NdtR3ColegioXcontadorDO
	@OneToMany(mappedBy="ndtContadorPublicoAut")
	private List<NdtR3ColegioXcontadorDO> ndtR3ColegioXcontadors;

	//bi-directional many-to-one association to NdtRegBajaReactivDO
	@OneToMany(mappedBy="ndtContadorPublicoAut")
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
}