package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DG_DOMICILIO_GEOGRAFICO database table.
 * 
 */
@Entity
@Table(name="DG_DOMICILIO_GEOGRAFICO")
@NamedQuery(name="DgDomicilioGeograficoDO.findAll", query="SELECT d FROM DgDomicilioGeograficoDO d")
public class DgDomicilioGeograficoDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DOMICILIO_ID")
	private long domicilioId;

	@Column(name="CVE_USUARIO")
	private String cveUsuario;

	@Column(name="CVE_VIA_PRIN")
	private BigDecimal cveViaPrin;

	@Column(name="CVE_VIA_REF1")
	private BigDecimal cveViaRef1;

	@Column(name="CVE_VIA_REF2")
	private BigDecimal cveViaRef2;

	@Column(name="CVE_VIA_REF3")
	private BigDecimal cveViaRef3;

	@Column(name="DES_UBICACION")
	private String desUbicacion;

	private String descripc;

	@Column(name="DOM_GEOG")
	private String domGeog;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="FECHA_HORA_ALTA")
	private Timestamp fechaHoraAlta;

	@Column(name="IND_DOM_AUTORIZADO")
	private BigDecimal indDomAutorizado;

	private String nomvial;

	@Column(name="NUMEXT_ANT")
	private String numextAnt;

	private String numextalf;

	private BigDecimal numextnum;

	private String numintalf;

	private BigDecimal numintnum;

	@Column(name="REF_LATITUD")
	private BigDecimal refLatitud;

	@Column(name="REF_LONGITUD")
	private BigDecimal refLongitud;

	//bi-directional one-to-one association to DgDomiciliosCaminosDO
	@OneToOne(mappedBy="dgDomicilioGeografico")
	private DgDomiciliosCaminosDO dgDomiciliosCamino;

	//bi-directional one-to-one association to DgDomiciliosCarreterasDO
	@OneToOne(mappedBy="dgDomicilioGeografico")
	private DgDomiciliosCarreterasDO dgDomiciliosCarretera;

	//bi-directional many-to-one association to DgAsentamientoDO
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CVE_ASEN", referencedColumnName="CVE_ASEN"),
		@JoinColumn(name="CVE_ENT", referencedColumnName="CVE_ENT"),
		@JoinColumn(name="CVE_MUN", referencedColumnName="CVE_MUN")
		})
	private DgAsentamientoDO dgAsentamiento;

	//bi-directional many-to-one association to DgCatLocalidadDO
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CVE_ENT", referencedColumnName="CVE_ENT"),
		@JoinColumn(name="CVE_LOC", referencedColumnName="CVE_LOC"),
		@JoinColumn(name="CVE_MUN", referencedColumnName="CVE_MUN"),
		@JoinColumn(name="CVE_PERIODO", referencedColumnName="CVE_PERIODO")
		})
	private DgCatLocalidadDO dgCatLocalidad;

	//bi-directional many-to-one association to DgCatTipoDomDO
	@ManyToOne
	@JoinColumn(name="CVE_TIPO_DOM")
	private DgCatTipoDomDO dgCatTipoDom;

	//bi-directional many-to-one association to DgCodigosPostalesDO
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CODIGO", referencedColumnName="CODIGO"),
		@JoinColumn(name="CVE_ASEN", referencedColumnName="CVE_ASEN"),
		@JoinColumn(name="CVE_ENT", referencedColumnName="CVE_ENT"),
		@JoinColumn(name="CVE_MUN", referencedColumnName="CVE_MUN")
		})
	private DgCodigosPostalesDO dgCodigosPostale;

	//bi-directional many-to-one association to DicDelegacionDO
	@OneToMany(mappedBy="dgDomicilioGeografico")
	private List<DicDelegacionDO> dicDelegacions;

	//bi-directional many-to-one association to DicSubdelegacionDO
	@OneToMany(mappedBy="dgDomicilioGeografico")
	private List<DicSubdelegacionDO> dicSubdelegacions;

	//bi-directional many-to-one association to DitPersonafDomDO
	@OneToMany(mappedBy="dgDomicilioGeografico")
	private List<DitPersonafDomDO> ditPersonafDoms;

	//bi-directional many-to-one association to DitPersonamDomDO
	@OneToMany(mappedBy="dgDomicilioGeografico")
	private List<DitPersonamDomDO> ditPersonamDoms;

	//bi-directional many-to-one association to NdcAsociacionDO
	@OneToMany(mappedBy="dgDomicilioGeografico")
	private List<NdcAsociacionDO> ndcAsociacions;

	//bi-directional many-to-one association to NdcColegioDO
	@OneToMany(mappedBy="dgDomicilioGeografico")
	private List<NdcColegioDO> ndcColegios;

	//bi-directional many-to-one association to NdcDespachoDO
	@OneToMany(mappedBy="dgDomicilioGeografico")
	private List<NdcDespachoDO> ndcDespachos;

	//bi-directional many-to-one association to NdtR1DomFiscalDO
	@OneToMany(mappedBy="dgDomicilioGeografico")
	private List<NdtR1DomFiscalDO> ndtR1DomFiscals;

	public DgDomicilioGeograficoDO() {
	}

	public long getDomicilioId() {
		return this.domicilioId;
	}

	public void setDomicilioId(long domicilioId) {
		this.domicilioId = domicilioId;
	}

	public String getCveUsuario() {
		return this.cveUsuario;
	}

	public void setCveUsuario(String cveUsuario) {
		this.cveUsuario = cveUsuario;
	}

	public BigDecimal getCveViaPrin() {
		return this.cveViaPrin;
	}

	public void setCveViaPrin(BigDecimal cveViaPrin) {
		this.cveViaPrin = cveViaPrin;
	}

	public BigDecimal getCveViaRef1() {
		return this.cveViaRef1;
	}

	public void setCveViaRef1(BigDecimal cveViaRef1) {
		this.cveViaRef1 = cveViaRef1;
	}

	public BigDecimal getCveViaRef2() {
		return this.cveViaRef2;
	}

	public void setCveViaRef2(BigDecimal cveViaRef2) {
		this.cveViaRef2 = cveViaRef2;
	}

	public BigDecimal getCveViaRef3() {
		return this.cveViaRef3;
	}

	public void setCveViaRef3(BigDecimal cveViaRef3) {
		this.cveViaRef3 = cveViaRef3;
	}

	public String getDesUbicacion() {
		return this.desUbicacion;
	}

	public void setDesUbicacion(String desUbicacion) {
		this.desUbicacion = desUbicacion;
	}

	public String getDescripc() {
		return this.descripc;
	}

	public void setDescripc(String descripc) {
		this.descripc = descripc;
	}

	public String getDomGeog() {
		return this.domGeog;
	}

	public void setDomGeog(String domGeog) {
		this.domGeog = domGeog;
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

	public Timestamp getFechaHoraAlta() {
		return this.fechaHoraAlta;
	}

	public void setFechaHoraAlta(Timestamp fechaHoraAlta) {
		this.fechaHoraAlta = fechaHoraAlta;
	}

	public BigDecimal getIndDomAutorizado() {
		return this.indDomAutorizado;
	}

	public void setIndDomAutorizado(BigDecimal indDomAutorizado) {
		this.indDomAutorizado = indDomAutorizado;
	}

	public String getNomvial() {
		return this.nomvial;
	}

	public void setNomvial(String nomvial) {
		this.nomvial = nomvial;
	}

	public String getNumextAnt() {
		return this.numextAnt;
	}

	public void setNumextAnt(String numextAnt) {
		this.numextAnt = numextAnt;
	}

	public String getNumextalf() {
		return this.numextalf;
	}

	public void setNumextalf(String numextalf) {
		this.numextalf = numextalf;
	}

	public BigDecimal getNumextnum() {
		return this.numextnum;
	}

	public void setNumextnum(BigDecimal numextnum) {
		this.numextnum = numextnum;
	}

	public String getNumintalf() {
		return this.numintalf;
	}

	public void setNumintalf(String numintalf) {
		this.numintalf = numintalf;
	}

	public BigDecimal getNumintnum() {
		return this.numintnum;
	}

	public void setNumintnum(BigDecimal numintnum) {
		this.numintnum = numintnum;
	}

	public BigDecimal getRefLatitud() {
		return this.refLatitud;
	}

	public void setRefLatitud(BigDecimal refLatitud) {
		this.refLatitud = refLatitud;
	}

	public BigDecimal getRefLongitud() {
		return this.refLongitud;
	}

	public void setRefLongitud(BigDecimal refLongitud) {
		this.refLongitud = refLongitud;
	}

	public DgDomiciliosCaminosDO getDgDomiciliosCamino() {
		return this.dgDomiciliosCamino;
	}

	public void setDgDomiciliosCamino(DgDomiciliosCaminosDO dgDomiciliosCamino) {
		this.dgDomiciliosCamino = dgDomiciliosCamino;
	}

	public DgDomiciliosCarreterasDO getDgDomiciliosCarretera() {
		return this.dgDomiciliosCarretera;
	}

	public void setDgDomiciliosCarretera(DgDomiciliosCarreterasDO dgDomiciliosCarretera) {
		this.dgDomiciliosCarretera = dgDomiciliosCarretera;
	}

	public DgAsentamientoDO getDgAsentamiento() {
		return this.dgAsentamiento;
	}

	public void setDgAsentamiento(DgAsentamientoDO dgAsentamiento) {
		this.dgAsentamiento = dgAsentamiento;
	}

	public DgCatLocalidadDO getDgCatLocalidad() {
		return this.dgCatLocalidad;
	}

	public void setDgCatLocalidad(DgCatLocalidadDO dgCatLocalidad) {
		this.dgCatLocalidad = dgCatLocalidad;
	}

	public DgCatTipoDomDO getDgCatTipoDom() {
		return this.dgCatTipoDom;
	}

	public void setDgCatTipoDom(DgCatTipoDomDO dgCatTipoDom) {
		this.dgCatTipoDom = dgCatTipoDom;
	}

	public DgCodigosPostalesDO getDgCodigosPostale() {
		return this.dgCodigosPostale;
	}

	public void setDgCodigosPostale(DgCodigosPostalesDO dgCodigosPostale) {
		this.dgCodigosPostale = dgCodigosPostale;
	}

	public List<DicDelegacionDO> getDicDelegacions() {
		return this.dicDelegacions;
	}

	public void setDicDelegacions(List<DicDelegacionDO> dicDelegacions) {
		this.dicDelegacions = dicDelegacions;
	}

	public List<DicSubdelegacionDO> getDicSubdelegacions() {
		return this.dicSubdelegacions;
	}

	public void setDicSubdelegacions(List<DicSubdelegacionDO> dicSubdelegacions) {
		this.dicSubdelegacions = dicSubdelegacions;
	}
	
	public List<DitPersonafDomDO> getDitPersonafDoms() {
		return this.ditPersonafDoms;
	}

	public void setDitPersonafDoms(List<DitPersonafDomDO> ditPersonafDoms) {
		this.ditPersonafDoms = ditPersonafDoms;
	}
	
	public List<DitPersonamDomDO> getDitPersonamDoms() {
		return this.ditPersonamDoms;
	}

	public void setDitPersonamDoms(List<DitPersonamDomDO> ditPersonamDoms) {
		this.ditPersonamDoms = ditPersonamDoms;
	}
	
	public List<NdcAsociacionDO> getNdcAsociacions() {
		return this.ndcAsociacions;
	}

	public void setNdcAsociacions(List<NdcAsociacionDO> ndcAsociacions) {
		this.ndcAsociacions = ndcAsociacions;
	}

	public List<NdcColegioDO> getNdcColegios() {
		return this.ndcColegios;
	}

	public void setNdcColegios(List<NdcColegioDO> ndcColegios) {
		this.ndcColegios = ndcColegios;
	}


	public List<NdcDespachoDO> getNdcDespachos() {
		return this.ndcDespachos;
	}

	public void setNdcDespachos(List<NdcDespachoDO> ndcDespachos) {
		this.ndcDespachos = ndcDespachos;
	}

	public List<NdtR1DomFiscalDO> getNdtR1DomFiscals() {
		return this.ndtR1DomFiscals;
	}

	public void setNdtR1DomFiscals(List<NdtR1DomFiscalDO> ndtR1DomFiscals) {
		this.ndtR1DomFiscals = ndtR1DomFiscals;
	}

}