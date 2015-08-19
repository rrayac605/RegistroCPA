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
		@JoinColumn(name="CVE_ENT", referencedColumnName="CVE_ENT", insertable=false, updatable=false),
		@JoinColumn(name="CVE_LOC", referencedColumnName="CVE_LOC"),
		@JoinColumn(name="CVE_MUN", referencedColumnName="CVE_MUN", insertable=false, updatable=false),
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
		@JoinColumn(name="CVE_ASEN", referencedColumnName="CVE_ASEN", insertable=false, updatable=false),
		@JoinColumn(name="CVE_ENT", referencedColumnName="CVE_ENT", insertable=false, updatable=false),
		@JoinColumn(name="CVE_MUN", referencedColumnName="CVE_MUN", insertable=false, updatable=false)
		})
	private DgCodigosPostalesDO dgCodigosPostale;

	//bi-directional many-to-one association to DicDelegacionDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dgDomicilioGeografico")
	private List<DicDelegacionDO> dicDelegacions;

	//bi-directional many-to-one association to DicSubdelegacionDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dgDomicilioGeografico")
	private List<DicSubdelegacionDO> dicSubdelegacions;

	//bi-directional many-to-one association to DitPersonafDomDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dgDomicilioGeografico")
	private List<DitPersonafDomDO> ditPersonafDoms;

	//bi-directional many-to-one association to DitPersonamDomDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dgDomicilioGeografico")
	private List<DitPersonamDomDO> ditPersonamDoms;

	//bi-directional many-to-one association to NdcAsociacionDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dgDomicilioGeografico")
	private List<NdcAsociacionDO> ndcAsociacions;

	//bi-directional many-to-one association to NdcColegioDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dgDomicilioGeografico")
	private List<NdcColegioDO> ndcColegios;

	//bi-directional many-to-one association to NdcDespachoDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dgDomicilioGeografico")
	private List<NdcDespachoDO> ndcDespachos;

	//bi-directional many-to-one association to NdtR1DomFiscalDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dgDomicilioGeografico")
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cveUsuario == null) ? 0 : cveUsuario.hashCode());
		result = prime * result + ((cveViaPrin == null) ? 0 : cveViaPrin.hashCode());
		result = prime * result + ((cveViaRef1 == null) ? 0 : cveViaRef1.hashCode());
		result = prime * result + ((cveViaRef2 == null) ? 0 : cveViaRef2.hashCode());
		result = prime * result + ((cveViaRef3 == null) ? 0 : cveViaRef3.hashCode());
		result = prime * result + ((desUbicacion == null) ? 0 : desUbicacion.hashCode());
		result = prime * result + ((descripc == null) ? 0 : descripc.hashCode());
		result = prime * result + ((dgAsentamiento == null) ? 0 : dgAsentamiento.hashCode());
		result = prime * result + ((dgCatLocalidad == null) ? 0 : dgCatLocalidad.hashCode());
		result = prime * result + ((dgCatTipoDom == null) ? 0 : dgCatTipoDom.hashCode());
		result = prime * result + ((dgCodigosPostale == null) ? 0 : dgCodigosPostale.hashCode());
		result = prime * result + ((dgDomiciliosCamino == null) ? 0 : dgDomiciliosCamino.hashCode());
		result = prime * result + ((dgDomiciliosCarretera == null) ? 0 : dgDomiciliosCarretera.hashCode());
		result = prime * result + ((dicDelegacions == null) ? 0 : dicDelegacions.hashCode());
		result = prime * result + ((dicSubdelegacions == null) ? 0 : dicSubdelegacions.hashCode());
		result = prime * result + ((ditPersonafDoms == null) ? 0 : ditPersonafDoms.hashCode());
		result = prime * result + ((ditPersonamDoms == null) ? 0 : ditPersonamDoms.hashCode());
		result = prime * result + ((domGeog == null) ? 0 : domGeog.hashCode());
		result = prime * result + (int) (domicilioId ^ (domicilioId >>> 32));
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((fechaHoraAlta == null) ? 0 : fechaHoraAlta.hashCode());
		result = prime * result + ((indDomAutorizado == null) ? 0 : indDomAutorizado.hashCode());
		result = prime * result + ((ndcAsociacions == null) ? 0 : ndcAsociacions.hashCode());
		result = prime * result + ((ndcColegios == null) ? 0 : ndcColegios.hashCode());
		result = prime * result + ((ndcDespachos == null) ? 0 : ndcDespachos.hashCode());
		result = prime * result + ((ndtR1DomFiscals == null) ? 0 : ndtR1DomFiscals.hashCode());
		result = prime * result + ((nomvial == null) ? 0 : nomvial.hashCode());
		result = prime * result + ((numextAnt == null) ? 0 : numextAnt.hashCode());
		result = prime * result + ((numextalf == null) ? 0 : numextalf.hashCode());
		result = prime * result + ((numextnum == null) ? 0 : numextnum.hashCode());
		result = prime * result + ((numintalf == null) ? 0 : numintalf.hashCode());
		result = prime * result + ((numintnum == null) ? 0 : numintnum.hashCode());
		result = prime * result + ((refLatitud == null) ? 0 : refLatitud.hashCode());
		result = prime * result + ((refLongitud == null) ? 0 : refLongitud.hashCode());
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
		DgDomicilioGeograficoDO other = (DgDomicilioGeograficoDO) obj;
		if (cveUsuario == null) {
			if (other.cveUsuario != null)
				return false;
		} else if (!cveUsuario.equals(other.cveUsuario))
			return false;
		if (cveViaPrin == null) {
			if (other.cveViaPrin != null)
				return false;
		} else if (!cveViaPrin.equals(other.cveViaPrin))
			return false;
		if (cveViaRef1 == null) {
			if (other.cveViaRef1 != null)
				return false;
		} else if (!cveViaRef1.equals(other.cveViaRef1))
			return false;
		if (cveViaRef2 == null) {
			if (other.cveViaRef2 != null)
				return false;
		} else if (!cveViaRef2.equals(other.cveViaRef2))
			return false;
		if (cveViaRef3 == null) {
			if (other.cveViaRef3 != null)
				return false;
		} else if (!cveViaRef3.equals(other.cveViaRef3))
			return false;
		if (desUbicacion == null) {
			if (other.desUbicacion != null)
				return false;
		} else if (!desUbicacion.equals(other.desUbicacion))
			return false;
		if (descripc == null) {
			if (other.descripc != null)
				return false;
		} else if (!descripc.equals(other.descripc))
			return false;
		if (dgAsentamiento == null) {
			if (other.dgAsentamiento != null)
				return false;
		} else if (!dgAsentamiento.equals(other.dgAsentamiento))
			return false;
		if (dgCatLocalidad == null) {
			if (other.dgCatLocalidad != null)
				return false;
		} else if (!dgCatLocalidad.equals(other.dgCatLocalidad))
			return false;
		if (dgCatTipoDom == null) {
			if (other.dgCatTipoDom != null)
				return false;
		} else if (!dgCatTipoDom.equals(other.dgCatTipoDom))
			return false;
		if (dgCodigosPostale == null) {
			if (other.dgCodigosPostale != null)
				return false;
		} else if (!dgCodigosPostale.equals(other.dgCodigosPostale))
			return false;
		if (dgDomiciliosCamino == null) {
			if (other.dgDomiciliosCamino != null)
				return false;
		} else if (!dgDomiciliosCamino.equals(other.dgDomiciliosCamino))
			return false;
		if (dgDomiciliosCarretera == null) {
			if (other.dgDomiciliosCarretera != null)
				return false;
		} else if (!dgDomiciliosCarretera.equals(other.dgDomiciliosCarretera))
			return false;
		if (dicDelegacions == null) {
			if (other.dicDelegacions != null)
				return false;
		} else if (!dicDelegacions.equals(other.dicDelegacions))
			return false;
		if (dicSubdelegacions == null) {
			if (other.dicSubdelegacions != null)
				return false;
		} else if (!dicSubdelegacions.equals(other.dicSubdelegacions))
			return false;
		if (ditPersonafDoms == null) {
			if (other.ditPersonafDoms != null)
				return false;
		} else if (!ditPersonafDoms.equals(other.ditPersonafDoms))
			return false;
		if (ditPersonamDoms == null) {
			if (other.ditPersonamDoms != null)
				return false;
		} else if (!ditPersonamDoms.equals(other.ditPersonamDoms))
			return false;
		if (domGeog == null) {
			if (other.domGeog != null)
				return false;
		} else if (!domGeog.equals(other.domGeog))
			return false;
		if (domicilioId != other.domicilioId)
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
		if (fechaHoraAlta == null) {
			if (other.fechaHoraAlta != null)
				return false;
		} else if (!fechaHoraAlta.equals(other.fechaHoraAlta))
			return false;
		if (indDomAutorizado == null) {
			if (other.indDomAutorizado != null)
				return false;
		} else if (!indDomAutorizado.equals(other.indDomAutorizado))
			return false;
		if (ndcAsociacions == null) {
			if (other.ndcAsociacions != null)
				return false;
		} else if (!ndcAsociacions.equals(other.ndcAsociacions))
			return false;
		if (ndcColegios == null) {
			if (other.ndcColegios != null)
				return false;
		} else if (!ndcColegios.equals(other.ndcColegios))
			return false;
		if (ndcDespachos == null) {
			if (other.ndcDespachos != null)
				return false;
		} else if (!ndcDespachos.equals(other.ndcDespachos))
			return false;
		if (ndtR1DomFiscals == null) {
			if (other.ndtR1DomFiscals != null)
				return false;
		} else if (!ndtR1DomFiscals.equals(other.ndtR1DomFiscals))
			return false;
		if (nomvial == null) {
			if (other.nomvial != null)
				return false;
		} else if (!nomvial.equals(other.nomvial))
			return false;
		if (numextAnt == null) {
			if (other.numextAnt != null)
				return false;
		} else if (!numextAnt.equals(other.numextAnt))
			return false;
		if (numextalf == null) {
			if (other.numextalf != null)
				return false;
		} else if (!numextalf.equals(other.numextalf))
			return false;
		if (numextnum == null) {
			if (other.numextnum != null)
				return false;
		} else if (!numextnum.equals(other.numextnum))
			return false;
		if (numintalf == null) {
			if (other.numintalf != null)
				return false;
		} else if (!numintalf.equals(other.numintalf))
			return false;
		if (numintnum == null) {
			if (other.numintnum != null)
				return false;
		} else if (!numintnum.equals(other.numintnum))
			return false;
		if (refLatitud == null) {
			if (other.refLatitud != null)
				return false;
		} else if (!refLatitud.equals(other.refLatitud))
			return false;
		if (refLongitud == null) {
			if (other.refLongitud != null)
				return false;
		} else if (!refLongitud.equals(other.refLongitud))
			return false;
		return true;
	}
	
	
	
}