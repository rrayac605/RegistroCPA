package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIC_SUBDELEGACION database table.
 * 
 */
@Entity
@Table(name="DIC_SUBDELEGACION")
@NamedQuery(name="DicSubdelegacionDO.findAll", query="SELECT d FROM DicSubdelegacionDO d")
public class DicSubdelegacionDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_SUBDELEGACION")
	private long cveIdSubdelegacion;

	@Column(name="ANIO_INI_OPER")
	private String anioIniOper;

	@Column(name="CLAVE_SUBDELEGACION")
	private String claveSubdelegacion;

	@Column(name="DES_SUBDELEGACION")
	private String desSubdelegacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to DgDomicilioGeograficoDO
	@ManyToOne
	@JoinColumn(name="DOMICILIO_ID")
	private DgDomicilioGeograficoDO dgDomicilioGeografico;

	//bi-directional many-to-one association to DicDelegacionDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_DELEGACION")
	private DicDelegacionDO dicDelegacion;

	//bi-directional many-to-one association to DitSolicitudDO
	@OneToMany(mappedBy="dicSubdelegacion")
	private List<DitSolicitudDO> ditSolicituds;

	//bi-directional many-to-one association to NdtPatronDictamenDO
	@OneToMany(mappedBy="dicSubdelegacion")
	private List<NdtPatronDictamenDO> ndtPatronDictamens;

	//bi-directional many-to-one association to NdtR1DatosPersonaleDO
	@OneToMany(mappedBy="dicSubdelegacion")
	private List<NdtR1DatosPersonaleDO> ndtR1DatosPersonales;

	//bi-directional many-to-one association to NdtR1DomFiscalDO
	@OneToMany(mappedBy="dicSubdelegacion")
	private List<NdtR1DomFiscalDO> ndtR1DomFiscals;

	public DicSubdelegacionDO() {
	}

	public long getCveIdSubdelegacion() {
		return this.cveIdSubdelegacion;
	}

	public void setCveIdSubdelegacion(long cveIdSubdelegacion) {
		this.cveIdSubdelegacion = cveIdSubdelegacion;
	}

	public String getAnioIniOper() {
		return this.anioIniOper;
	}

	public void setAnioIniOper(String anioIniOper) {
		this.anioIniOper = anioIniOper;
	}

	public String getClaveSubdelegacion() {
		return this.claveSubdelegacion;
	}

	public void setClaveSubdelegacion(String claveSubdelegacion) {
		this.claveSubdelegacion = claveSubdelegacion;
	}

	public String getDesSubdelegacion() {
		return this.desSubdelegacion;
	}

	public void setDesSubdelegacion(String desSubdelegacion) {
		this.desSubdelegacion = desSubdelegacion;
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

	public DgDomicilioGeograficoDO getDgDomicilioGeografico() {
		return this.dgDomicilioGeografico;
	}

	public void setDgDomicilioGeografico(DgDomicilioGeograficoDO dgDomicilioGeografico) {
		this.dgDomicilioGeografico = dgDomicilioGeografico;
	}

	public DicDelegacionDO getDicDelegacion() {
		return this.dicDelegacion;
	}

	public void setDicDelegacion(DicDelegacionDO dicDelegacion) {
		this.dicDelegacion = dicDelegacion;
	}

	public List<DitSolicitudDO> getDitSolicituds() {
		return this.ditSolicituds;
	}

	public void setDitSolicituds(List<DitSolicitudDO> ditSolicituds) {
		this.ditSolicituds = ditSolicituds;
	}

	public List<NdtPatronDictamenDO> getNdtPatronDictamens() {
		return this.ndtPatronDictamens;
	}

	public void setNdtPatronDictamens(List<NdtPatronDictamenDO> ndtPatronDictamens) {
		this.ndtPatronDictamens = ndtPatronDictamens;
	}

	public List<NdtR1DatosPersonaleDO> getNdtR1DatosPersonales() {
		return this.ndtR1DatosPersonales;
	}

	public void setNdtR1DatosPersonales(List<NdtR1DatosPersonaleDO> ndtR1DatosPersonales) {
		this.ndtR1DatosPersonales = ndtR1DatosPersonales;
	}

	public List<NdtR1DomFiscalDO> getNdtR1DomFiscals() {
		return this.ndtR1DomFiscals;
	}

	public void setNdtR1DomFiscals(List<NdtR1DomFiscalDO> ndtR1DomFiscals) {
		this.ndtR1DomFiscals = ndtR1DomFiscals;
	}
}