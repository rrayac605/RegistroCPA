package mx.gob.imss.distss.dictamen.modelo.entidad;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="DIT_DOMICILIO_SAT")
@NamedQuery(name="DitDomicilioSat.findAll", query="SELECT d FROM DitDomicilioSat d")
public class DitDomicilioSat implements Serializable {
	
	private static final long serialVersionUID = 4540494821777389584L;
	
	@Id
	@Column(name="CVE_ID_DOMICILIO", unique=true, nullable=false)
	private Long cveIdDomicilio;

	@Column(name="CALLE", length=100)
	private String calle;

	@Column(name="CODIGO", length=5)
	private String codigo;

	@Column(name="COLONIA", length=150)
	private String colonia;

	@Column(name="ENTIDAD_FEDERATIVA", length=50)
	private String entidadFederativa;

	@Column(name="ENTRE_CALLE_1", length=150)
	private String entreCalle1;

	@Column(name="ENTRE_CALLE_2", length=150)
	private String entreCalle2;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="INMUEBLE", length=100)
	private String inmueble;

	@Column(name="LOCALIDAD", length=100)
	private String localidad;

	@Column(name="MUNICIPIO", length=100)
	private String municipio;

	@Column(name="NUM_EXTERIOR", length=250)
	private String numExterior;

	@Column(name="NUM_INTERIOR", length=250)
	private String numInterior;

	@Column(name="REFERENCIA", length=250)
	private String referencia;

	@Column(name="VIALIDAD", length=100)
	private String vialidad;

	//bi-directional many-to-one association to DitPersonafDomFiscal
	@OneToMany(mappedBy="ditDomicilioSat")
	private List<DitPersonafDomFiscal> ditPersonafDomFiscals;

	//bi-directional many-to-one association to DitPersonamDomFiscal
	@OneToMany(mappedBy="ditDomicilioSat")
	private List<DitPersonamDomFiscal> ditPersonamDomFiscals;

	public DitDomicilioSat() {
	}

	public Long getCveIdDomicilio() {
		return cveIdDomicilio;
	}

	public void setCveIdDomicilio(Long cveIdDomicilio) {
		this.cveIdDomicilio = cveIdDomicilio;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getEntidadFederativa() {
		return entidadFederativa;
	}

	public void setEntidadFederativa(String entidadFederativa) {
		this.entidadFederativa = entidadFederativa;
	}

	public String getEntreCalle1() {
		return entreCalle1;
	}

	public void setEntreCalle1(String entreCalle1) {
		this.entreCalle1 = entreCalle1;
	}

	public String getEntreCalle2() {
		return entreCalle2;
	}

	public void setEntreCalle2(String entreCalle2) {
		this.entreCalle2 = entreCalle2;
	}

	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado;
	}

	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	public Date getFecRegistroAlta() {
		return fecRegistroAlta;
	}

	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	public Date getFecRegistroBaja() {
		return fecRegistroBaja;
	}

	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	public String getInmueble() {
		return inmueble;
	}

	public void setInmueble(String inmueble) {
		this.inmueble = inmueble;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getNumExterior() {
		return numExterior;
	}

	public void setNumExterior(String numExterior) {
		this.numExterior = numExterior;
	}

	public String getNumInterior() {
		return numInterior;
	}

	public void setNumInterior(String numInterior) {
		this.numInterior = numInterior;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getVialidad() {
		return vialidad;
	}

	public void setVialidad(String vialidad) {
		this.vialidad = vialidad;
	}

	public List<DitPersonafDomFiscal> getDitPersonafDomFiscals() {
		return ditPersonafDomFiscals;
	}

	public void setDitPersonafDomFiscals(List<DitPersonafDomFiscal> ditPersonafDomFiscals) {
		this.ditPersonafDomFiscals = ditPersonafDomFiscals;
	}

	public List<DitPersonamDomFiscal> getDitPersonamDomFiscals() {
		return ditPersonamDomFiscals;
	}

	public void setDitPersonamDomFiscals(List<DitPersonamDomFiscal> ditPersonamDomFiscals) {
		this.ditPersonamDomFiscals = ditPersonamDomFiscals;
	}

}
