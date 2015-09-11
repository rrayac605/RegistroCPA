package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class TramiteTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5529400803327810209L;

	private long cveIdTramite;

	private BigDecimal cveIdRazonResultado;

	private Date fecConclusion;

	private Date fecEfecto;

	private Date fecPresentacion;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private Date fecTramite;

	private BigDecimal indRatificado;

	private BigDecimal indResultado;

	private String numSecNotaria;

	private String refCadenaOriginal;

	private String refObservacion;

	private String refSelloDigital;

	private EstadoTramiteTO dicEstadoTramite;

	private TipoTramiteTO dicTipoTramite;

	private List<PersonaMoralTO> ditPersonaMorals;

	private SolicitudTO ditSolicitud;

	private List<AcreditacionTO> ndtAcreditacions;

	private List<R1DatosPersonaleTO> ndtR1DatosPersonales;

	private List<R1DomFiscalTO> ndtR1DomFiscals;

	private List<R2DespachoTO> ndtR2Despachos;

	private List<R3ColegioXcontadorTO> ndtR3ColegioXcontadors;
	
	private List<RegBajaReactivTO> ndtRegBajaReactivs;

	/**
	 * @return the cveIdTramite
	 */
	public long getCveIdTramite() {
		return cveIdTramite;
	}

	/**
	 * @param cveIdTramite the cveIdTramite to set
	 */
	public void setCveIdTramite(long cveIdTramite) {
		this.cveIdTramite = cveIdTramite;
	}

	/**
	 * @return the cveIdRazonResultado
	 */
	public BigDecimal getCveIdRazonResultado() {
		return cveIdRazonResultado;
	}

	/**
	 * @param cveIdRazonResultado the cveIdRazonResultado to set
	 */
	public void setCveIdRazonResultado(BigDecimal cveIdRazonResultado) {
		this.cveIdRazonResultado = cveIdRazonResultado;
	}

	/**
	 * @return the fecConclusion
	 */
	public Date getFecConclusion() {
		return fecConclusion != null ? (Date) fecConclusion.clone() : null;		
	}

	/**
	 * @param fecConclusion the fecConclusion to set
	 */
	public void setFecConclusion(Date fecConclusion) {
		this.fecConclusion = fecConclusion;
	}

	/**
	 * @return the fecEfecto
	 */
	public Date getFecEfecto() {
		return fecEfecto != null ? (Date) fecEfecto.clone() : null;
	}

	/**
	 * @param fecEfecto the fecEfecto to set
	 */
	public void setFecEfecto(Date fecEfecto) {
		this.fecEfecto = fecEfecto;
	}

	/**
	 * @return the fecPresentacion
	 */
	public Date getFecPresentacion() {
		return fecPresentacion != null ? (Date) fecPresentacion.clone() : null;
	}

	/**
	 * @param fecPresentacion the fecPresentacion to set
	 */
	public void setFecPresentacion(Date fecPresentacion) {
		this.fecPresentacion = fecPresentacion;
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
	 * @return the fecTramite
	 */
	public Date getFecTramite() {
		return fecTramite != null ? (Date) fecTramite.clone() : null;

	}

	/**
	 * @param fecTramite the fecTramite to set
	 */
	public void setFecTramite(Date fecTramite) {
		this.fecTramite = fecTramite;
	}

	/**
	 * @return the indRatificado
	 */
	public BigDecimal getIndRatificado() {
		return indRatificado;
	}

	/**
	 * @param indRatificado the indRatificado to set
	 */
	public void setIndRatificado(BigDecimal indRatificado) {
		this.indRatificado = indRatificado;
	}

	/**
	 * @return the indResultado
	 */
	public BigDecimal getIndResultado() {
		return indResultado;
	}

	/**
	 * @param indResultado the indResultado to set
	 */
	public void setIndResultado(BigDecimal indResultado) {
		this.indResultado = indResultado;
	}

	/**
	 * @return the numSecNotaria
	 */
	public String getNumSecNotaria() {
		return numSecNotaria;
	}

	/**
	 * @param numSecNotaria the numSecNotaria to set
	 */
	public void setNumSecNotaria(String numSecNotaria) {
		this.numSecNotaria = numSecNotaria;
	}

	/**
	 * @return the refCadenaOriginal
	 */
	public String getRefCadenaOriginal() {
		return refCadenaOriginal;
	}

	/**
	 * @param refCadenaOriginal the refCadenaOriginal to set
	 */
	public void setRefCadenaOriginal(String refCadenaOriginal) {
		this.refCadenaOriginal = refCadenaOriginal;
	}

	/**
	 * @return the refObservacion
	 */
	public String getRefObservacion() {
		return refObservacion;
	}

	/**
	 * @param refObservacion the refObservacion to set
	 */
	public void setRefObservacion(String refObservacion) {
		this.refObservacion = refObservacion;
	}

	/**
	 * @return the refSelloDigital
	 */
	public String getRefSelloDigital() {
		return refSelloDigital;
	}

	/**
	 * @param refSelloDigital the refSelloDigital to set
	 */
	public void setRefSelloDigital(String refSelloDigital) {
		this.refSelloDigital = refSelloDigital;
	}

	/**
	 * @return the dicEstadoTramite
	 */
	public EstadoTramiteTO getDicEstadoTramite() {
		return dicEstadoTramite;
	}

	/**
	 * @param dicEstadoTramite the dicEstadoTramite to set
	 */
	public void setDicEstadoTramite(EstadoTramiteTO dicEstadoTramite) {
		this.dicEstadoTramite = dicEstadoTramite;
	}

	/**
	 * @return the dicTipoTramite
	 */
	public TipoTramiteTO getDicTipoTramite() {
		return dicTipoTramite;
	}

	/**
	 * @param dicTipoTramite the dicTipoTramite to set
	 */
	public void setDicTipoTramite(TipoTramiteTO dicTipoTramite) {
		this.dicTipoTramite = dicTipoTramite;
	}

	/**
	 * @return the ditPersonaMorals
	 */
	public List<PersonaMoralTO> getDitPersonaMorals() {
		return ditPersonaMorals;
	}

	/**
	 * @param ditPersonaMorals the ditPersonaMorals to set
	 */
	public void setDitPersonaMorals(List<PersonaMoralTO> ditPersonaMorals) {
		this.ditPersonaMorals = ditPersonaMorals;
	}

	/**
	 * @return the ditSolicitud
	 */
	public SolicitudTO getDitSolicitud() {
		return ditSolicitud;
	}

	/**
	 * @param ditSolicitud the ditSolicitud to set
	 */
	public void setDitSolicitud(SolicitudTO ditSolicitud) {
		this.ditSolicitud = ditSolicitud;
	}

	/**
	 * @return the ndtAcreditacions
	 */
	public List<AcreditacionTO> getNdtAcreditacions() {
		return ndtAcreditacions;
	}

	/**
	 * @param ndtAcreditacions the ndtAcreditacions to set
	 */
	public void setNdtAcreditacions(List<AcreditacionTO> ndtAcreditacions) {
		this.ndtAcreditacions = ndtAcreditacions;
	}

	/**
	 * @return the ndtR1DatosPersonales
	 */
	public List<R1DatosPersonaleTO> getNdtR1DatosPersonales() {
		return ndtR1DatosPersonales;
	}

	/**
	 * @param ndtR1DatosPersonales the ndtR1DatosPersonales to set
	 */
	public void setNdtR1DatosPersonales(
			List<R1DatosPersonaleTO> ndtR1DatosPersonales) {
		this.ndtR1DatosPersonales = ndtR1DatosPersonales;
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

	/**
	 * @return the ndtR2Despachos
	 */
	public List<R2DespachoTO> getNdtR2Despachos() {
		return ndtR2Despachos;
	}

	/**
	 * @param ndtR2Despachos the ndtR2Despachos to set
	 */
	public void setNdtR2Despachos(List<R2DespachoTO> ndtR2Despachos) {
		this.ndtR2Despachos = ndtR2Despachos;
	}

	/**
	 * @return the ndtR3ColegioXcontadors
	 */
	public List<R3ColegioXcontadorTO> getNdtR3ColegioXcontadors() {
		return ndtR3ColegioXcontadors;
	}

	/**
	 * @param ndtR3ColegioXcontadors the ndtR3ColegioXcontadors to set
	 */
	public void setNdtR3ColegioXcontadors(
			List<R3ColegioXcontadorTO> ndtR3ColegioXcontadors) {
		this.ndtR3ColegioXcontadors = ndtR3ColegioXcontadors;
	}

	/**
	 * @return the ndtRegBajaReactivs
	 */
	public List<RegBajaReactivTO> getNdtRegBajaReactivs() {
		return ndtRegBajaReactivs;
	}

	/**
	 * @param ndtRegBajaReactivs the ndtRegBajaReactivs to set
	 */
	public void setNdtRegBajaReactivs(List<RegBajaReactivTO> ndtRegBajaReactivs) {
		this.ndtRegBajaReactivs = ndtRegBajaReactivs;
	}
	
	
	
}
