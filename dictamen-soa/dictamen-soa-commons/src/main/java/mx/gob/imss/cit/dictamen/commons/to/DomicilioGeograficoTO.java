package mx.gob.imss.cit.dictamen.commons.to;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class DomicilioGeograficoTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6122499228856414292L;

	private long domicilioId;

	private String cveUsuario;

	private BigDecimal cveViaPrin;

	private BigDecimal cveViaRef1;

	private BigDecimal cveViaRef2;

	private BigDecimal cveViaRef3;

	private String desUbicacion;

	private String descripc;

	private String domGeog;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private Timestamp fechaHoraAlta;

	private BigDecimal indDomAutorizado;

	private String nomvial;

	private String numextAnt;

	private String numextalf;

	private BigDecimal numextnum;

	private String numintalf;

	private BigDecimal numintnum;

	private BigDecimal refLatitud;

	private BigDecimal refLongitud;

	private DomiciliosCaminosTO dgDomiciliosCamino;

	private DomiciliosCarreterasTO dgDomiciliosCarretera;

	private AsentamientoTO dgAsentamiento;

	private CatLocalidadTO dgCatLocalidad;

	private CatTipoDomTO dgCatTipoDom;

	private CodigosPostalesTO dgCodigosPostale;

	private List<DelegacionTO> dicDelegacions;

	private List<SubdelegacionTO> dicSubdelegacions;

	private List<PersonafDomTO> ditPersonafDoms;

	private List<PersonamDomTO> ditPersonamDoms;

	private List<AsociacionTO> ndcAsociacions;

	private List<ColegioTO> ndcColegios;

	private List<DespachoTO> ndcDespachos;

	private List<R1DomFiscalTO> ndtR1DomFiscals;

	/**
	 * @return the domicilioId
	 */
	public long getDomicilioId() {
		return domicilioId;
	}

	/**
	 * @param domicilioId the domicilioId to set
	 */
	public void setDomicilioId(long domicilioId) {
		this.domicilioId = domicilioId;
	}

	/**
	 * @return the cveUsuario
	 */
	public String getCveUsuario() {
		return cveUsuario;
	}

	/**
	 * @param cveUsuario the cveUsuario to set
	 */
	public void setCveUsuario(String cveUsuario) {
		this.cveUsuario = cveUsuario;
	}

	/**
	 * @return the cveViaPrin
	 */
	public BigDecimal getCveViaPrin() {
		return cveViaPrin;
	}

	/**
	 * @param cveViaPrin the cveViaPrin to set
	 */
	public void setCveViaPrin(BigDecimal cveViaPrin) {
		this.cveViaPrin = cveViaPrin;
	}

	/**
	 * @return the cveViaRef1
	 */
	public BigDecimal getCveViaRef1() {
		return cveViaRef1;
	}

	/**
	 * @param cveViaRef1 the cveViaRef1 to set
	 */
	public void setCveViaRef1(BigDecimal cveViaRef1) {
		this.cveViaRef1 = cveViaRef1;
	}

	/**
	 * @return the cveViaRef2
	 */
	public BigDecimal getCveViaRef2() {
		return cveViaRef2;
	}

	/**
	 * @param cveViaRef2 the cveViaRef2 to set
	 */
	public void setCveViaRef2(BigDecimal cveViaRef2) {
		this.cveViaRef2 = cveViaRef2;
	}

	/**
	 * @return the cveViaRef3
	 */
	public BigDecimal getCveViaRef3() {
		return cveViaRef3;
	}

	/**
	 * @param cveViaRef3 the cveViaRef3 to set
	 */
	public void setCveViaRef3(BigDecimal cveViaRef3) {
		this.cveViaRef3 = cveViaRef3;
	}

	/**
	 * @return the desUbicacion
	 */
	public String getDesUbicacion() {
		return desUbicacion;
	}

	/**
	 * @param desUbicacion the desUbicacion to set
	 */
	public void setDesUbicacion(String desUbicacion) {
		this.desUbicacion = desUbicacion;
	}

	/**
	 * @return the descripc
	 */
	public String getDescripc() {
		return descripc;
	}

	/**
	 * @param descripc the descripc to set
	 */
	public void setDescripc(String descripc) {
		this.descripc = descripc;
	}

	/**
	 * @return the domGeog
	 */
	public String getDomGeog() {
		return domGeog;
	}

	/**
	 * @param domGeog the domGeog to set
	 */
	public void setDomGeog(String domGeog) {
		this.domGeog = domGeog;
	}



	/**
	 * @return the fecRegistroActualizado
	 */
	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado != null ? (Date) fecRegistroActualizado.clone() : null;
	}

	/**
	 * @param fecRegistroActualizado the fecRegistroActualizado to set
	 */
	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	/**
	 * @return the fecRegistroAlta
	 */
	public Date getFecRegistroAlta() {
		return fecRegistroAlta != null ? (Date) fecRegistroAlta.clone() : null;
	}

	/**
	 * @param fecRegistroAlta the fecRegistroAlta to set
	 */
	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	/**
	 * @return the fecRegistroBaja
	 */
	public Date getFecRegistroBaja() {
		return fecRegistroBaja != null ? (Date) fecRegistroBaja.clone() : null;
	}

	/**
	 * @param fecRegistroBaja the fecRegistroBaja to set
	 */
	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	/**
	 * @return the fechaHoraAlta
	 */
	public Timestamp getFechaHoraAlta() {
		return fechaHoraAlta;
	}

	/**
	 * @param fechaHoraAlta the fechaHoraAlta to set
	 */
	public void setFechaHoraAlta(Timestamp fechaHoraAlta) {
		this.fechaHoraAlta = fechaHoraAlta;
	}

	/**
	 * @return the indDomAutorizado
	 */
	public BigDecimal getIndDomAutorizado() {
		return indDomAutorizado;
	}

	/**
	 * @param indDomAutorizado the indDomAutorizado to set
	 */
	public void setIndDomAutorizado(BigDecimal indDomAutorizado) {
		this.indDomAutorizado = indDomAutorizado;
	}

	/**
	 * @return the nomvial
	 */
	public String getNomvial() {
		return nomvial;
	}

	/**
	 * @param nomvial the nomvial to set
	 */
	public void setNomvial(String nomvial) {
		this.nomvial = nomvial;
	}

	/**
	 * @return the numextAnt
	 */
	public String getNumextAnt() {
		return numextAnt;
	}

	/**
	 * @param numextAnt the numextAnt to set
	 */
	public void setNumextAnt(String numextAnt) {
		this.numextAnt = numextAnt;
	}

	/**
	 * @return the numextalf
	 */
	public String getNumextalf() {
		return numextalf;
	}

	/**
	 * @param numextalf the numextalf to set
	 */
	public void setNumextalf(String numextalf) {
		this.numextalf = numextalf;
	}

	/**
	 * @return the numextnum
	 */
	public BigDecimal getNumextnum() {
		return numextnum;
	}

	/**
	 * @param numextnum the numextnum to set
	 */
	public void setNumextnum(BigDecimal numextnum) {
		this.numextnum = numextnum;
	}

	/**
	 * @return the numintalf
	 */
	public String getNumintalf() {
		return numintalf;
	}

	/**
	 * @param numintalf the numintalf to set
	 */
	public void setNumintalf(String numintalf) {
		this.numintalf = numintalf;
	}

	/**
	 * @return the numintnum
	 */
	public BigDecimal getNumintnum() {
		return numintnum;
	}

	/**
	 * @param numintnum the numintnum to set
	 */
	public void setNumintnum(BigDecimal numintnum) {
		this.numintnum = numintnum;
	}

	/**
	 * @return the refLatitud
	 */
	public BigDecimal getRefLatitud() {
		return refLatitud;
	}

	/**
	 * @param refLatitud the refLatitud to set
	 */
	public void setRefLatitud(BigDecimal refLatitud) {
		this.refLatitud = refLatitud;
	}

	/**
	 * @return the refLongitud
	 */
	public BigDecimal getRefLongitud() {
		return refLongitud;
	}

	/**
	 * @param refLongitud the refLongitud to set
	 */
	public void setRefLongitud(BigDecimal refLongitud) {
		this.refLongitud = refLongitud;
	}

	/**
	 * @return the dgDomiciliosCamino
	 */
	public DomiciliosCaminosTO getDgDomiciliosCamino() {
		return dgDomiciliosCamino;
	}

	/**
	 * @param dgDomiciliosCamino the dgDomiciliosCamino to set
	 */
	public void setDgDomiciliosCamino(DomiciliosCaminosTO dgDomiciliosCamino) {
		this.dgDomiciliosCamino = dgDomiciliosCamino;
	}

	/**
	 * @return the dgDomiciliosCarretera
	 */
	public DomiciliosCarreterasTO getDgDomiciliosCarretera() {
		return dgDomiciliosCarretera;
	}

	/**
	 * @param dgDomiciliosCarretera the dgDomiciliosCarretera to set
	 */
	public void setDgDomiciliosCarretera(
			DomiciliosCarreterasTO dgDomiciliosCarretera) {
		this.dgDomiciliosCarretera = dgDomiciliosCarretera;
	}

	/**
	 * @return the dgAsentamiento
	 */
	public AsentamientoTO getDgAsentamiento() {
		return dgAsentamiento;
	}

	/**
	 * @param dgAsentamiento the dgAsentamiento to set
	 */
	public void setDgAsentamiento(AsentamientoTO dgAsentamiento) {
		this.dgAsentamiento = dgAsentamiento;
	}

	/**
	 * @return the dgCatLocalidad
	 */
	public CatLocalidadTO getDgCatLocalidad() {
		return dgCatLocalidad;
	}

	/**
	 * @param dgCatLocalidad the dgCatLocalidad to set
	 */
	public void setDgCatLocalidad(CatLocalidadTO dgCatLocalidad) {
		this.dgCatLocalidad = dgCatLocalidad;
	}

	/**
	 * @return the dgCatTipoDom
	 */
	public CatTipoDomTO getDgCatTipoDom() {
		return dgCatTipoDom;
	}

	/**
	 * @param dgCatTipoDom the dgCatTipoDom to set
	 */
	public void setDgCatTipoDom(CatTipoDomTO dgCatTipoDom) {
		this.dgCatTipoDom = dgCatTipoDom;
	}

	/**
	 * @return the dgCodigosPostale
	 */
	public CodigosPostalesTO getDgCodigosPostale() {
		return dgCodigosPostale;
	}

	/**
	 * @param dgCodigosPostale the dgCodigosPostale to set
	 */
	public void setDgCodigosPostale(CodigosPostalesTO dgCodigosPostale) {
		this.dgCodigosPostale = dgCodigosPostale;
	}

	/**
	 * @return the dicDelegacions
	 */
	public List<DelegacionTO> getDicDelegacions() {
		return dicDelegacions;
	}

	/**
	 * @param dicDelegacions the dicDelegacions to set
	 */
	public void setDicDelegacions(List<DelegacionTO> dicDelegacions) {
		this.dicDelegacions = dicDelegacions;
	}

	/**
	 * @return the dicSubdelegacions
	 */
	public List<SubdelegacionTO> getDicSubdelegacions() {
		return dicSubdelegacions;
	}

	/**
	 * @param dicSubdelegacions the dicSubdelegacions to set
	 */
	public void setDicSubdelegacions(List<SubdelegacionTO> dicSubdelegacions) {
		this.dicSubdelegacions = dicSubdelegacions;
	}

	/**
	 * @return the ditPersonafDoms
	 */
	public List<PersonafDomTO> getDitPersonafDoms() {
		return ditPersonafDoms;
	}

	/**
	 * @param ditPersonafDoms the ditPersonafDoms to set
	 */
	public void setDitPersonafDoms(List<PersonafDomTO> ditPersonafDoms) {
		this.ditPersonafDoms = ditPersonafDoms;
	}

	/**
	 * @return the ditPersonamDoms
	 */
	public List<PersonamDomTO> getDitPersonamDoms() {
		return ditPersonamDoms;
	}

	/**
	 * @param ditPersonamDoms the ditPersonamDoms to set
	 */
	public void setDitPersonamDoms(List<PersonamDomTO> ditPersonamDoms) {
		this.ditPersonamDoms = ditPersonamDoms;
	}

	/**
	 * @return the ndcAsociacions
	 */
	public List<AsociacionTO> getNdcAsociacions() {
		return ndcAsociacions;
	}

	/**
	 * @param ndcAsociacions the ndcAsociacions to set
	 */
	public void setNdcAsociacions(List<AsociacionTO> ndcAsociacions) {
		this.ndcAsociacions = ndcAsociacions;
	}

	/**
	 * @return the ndcColegios
	 */
	public List<ColegioTO> getNdcColegios() {
		return ndcColegios;
	}

	/**
	 * @param ndcColegios the ndcColegios to set
	 */
	public void setNdcColegios(List<ColegioTO> ndcColegios) {
		this.ndcColegios = ndcColegios;
	}

	/**
	 * @return the ndcDespachos
	 */
	public List<DespachoTO> getNdcDespachos() {
		return ndcDespachos;
	}

	/**
	 * @param ndcDespachos the ndcDespachos to set
	 */
	public void setNdcDespachos(List<DespachoTO> ndcDespachos) {
		this.ndcDespachos = ndcDespachos;
	}

	/**
	 * @return the ndtR1DomFiscals
	 */
	public List<R1DomFiscalTO> getNdtR1DomFiscals() {
		return ndtR1DomFiscals;
	}

	/**
	 * @param ndtR1DomFiscals the ndtR1DomFiscals to set
	 */
	public void setNdtR1DomFiscals(List<R1DomFiscalTO> ndtR1DomFiscals) {
		this.ndtR1DomFiscals = ndtR1DomFiscals;
	}

	
	
}
