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
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dicSubdelegacion")
	private List<DitSolicitudDO> ditSolicituds;

	//bi-directional many-to-one association to NdtPatronDictamenDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dicSubdelegacion")
	private List<NdtPatronDictamenDO> ndtPatronDictamens;

	//bi-directional many-to-one association to NdtR1DatosPersonaleDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dicSubdelegacion")
	private List<NdtR1DatosPersonaleDO> ndtR1DatosPersonales;

	//bi-directional many-to-one association to NdtR1DomFiscalDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dicSubdelegacion")
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anioIniOper == null) ? 0 : anioIniOper.hashCode());
		result = prime * result + ((claveSubdelegacion == null) ? 0 : claveSubdelegacion.hashCode());
		result = prime * result + (int) (cveIdSubdelegacion ^ (cveIdSubdelegacion >>> 32));
		result = prime * result + ((desSubdelegacion == null) ? 0 : desSubdelegacion.hashCode());
		result = prime * result + ((dgDomicilioGeografico == null) ? 0 : dgDomicilioGeografico.hashCode());
		result = prime * result + ((dicDelegacion == null) ? 0 : dicDelegacion.hashCode());
		result = prime * result + ((ditSolicituds == null) ? 0 : ditSolicituds.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((ndtPatronDictamens == null) ? 0 : ndtPatronDictamens.hashCode());
		result = prime * result + ((ndtR1DatosPersonales == null) ? 0 : ndtR1DatosPersonales.hashCode());
		result = prime * result + ((ndtR1DomFiscals == null) ? 0 : ndtR1DomFiscals.hashCode());
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
		DicSubdelegacionDO other = (DicSubdelegacionDO) obj;
		if (anioIniOper == null) {
			if (other.anioIniOper != null)
				return false;
		} else if (!anioIniOper.equals(other.anioIniOper))
			return false;
		if (claveSubdelegacion == null) {
			if (other.claveSubdelegacion != null)
				return false;
		} else if (!claveSubdelegacion.equals(other.claveSubdelegacion))
			return false;
		if (cveIdSubdelegacion != other.cveIdSubdelegacion)
			return false;
		if (desSubdelegacion == null) {
			if (other.desSubdelegacion != null)
				return false;
		} else if (!desSubdelegacion.equals(other.desSubdelegacion))
			return false;
		if (dgDomicilioGeografico == null) {
			if (other.dgDomicilioGeografico != null)
				return false;
		} else if (!dgDomicilioGeografico.equals(other.dgDomicilioGeografico))
			return false;
		if (dicDelegacion == null) {
			if (other.dicDelegacion != null)
				return false;
		} else if (!dicDelegacion.equals(other.dicDelegacion))
			return false;
		if (ditSolicituds == null) {
			if (other.ditSolicituds != null)
				return false;
		} else if (!ditSolicituds.equals(other.ditSolicituds))
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
		if (ndtPatronDictamens == null) {
			if (other.ndtPatronDictamens != null)
				return false;
		} else if (!ndtPatronDictamens.equals(other.ndtPatronDictamens))
			return false;
		if (ndtR1DatosPersonales == null) {
			if (other.ndtR1DatosPersonales != null)
				return false;
		} else if (!ndtR1DatosPersonales.equals(other.ndtR1DatosPersonales))
			return false;
		if (ndtR1DomFiscals == null) {
			if (other.ndtR1DomFiscals != null)
				return false;
		} else if (!ndtR1DomFiscals.equals(other.ndtR1DomFiscals))
			return false;
		return true;
	}
	
	
	
}