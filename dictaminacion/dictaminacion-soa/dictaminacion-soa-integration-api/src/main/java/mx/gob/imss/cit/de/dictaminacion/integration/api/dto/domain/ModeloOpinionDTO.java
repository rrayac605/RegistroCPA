package mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain;

import java.util.Date;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.base.BaseDTO;

public class ModeloOpinionDTO extends BaseDTO {
	
	// Modelo de opinion seleccionado
	private Long cveIdModeloOpinion;
	
	// Rubros y conceptos
	private String desRubros;
	private String desConceptos;
	
	// Con pago
	private Date fecFechaPagoPrimerpago;
	private String numNumeroConvenio;
	private Integer numParcialidades;
	private Date fecFechaConvenio;
	
	// Observaciones
	private String desLimitacionesInformacion;
	private String desObservaciones;
	
	private String desMotivoSalvedad;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Date fecRegistroActualizado;
	private String cveIdUsuario;

	private String cveIdPatronDictamen;
	private String cveIdTipoPago;
	private String cveIdTipoOpinion;
	private String cveIdFormaPago;

	/** serialVersionUID */
	private static final long serialVersionUID = -4971155084333776814L;

	public Long getCveIdModeloOpinion() {
		return cveIdModeloOpinion;
	}

	public void setCveIdModeloOpinion(Long cveIdModeloOpinion) {
		this.cveIdModeloOpinion = cveIdModeloOpinion;
	}

	public Date getFecFechaPagoPrimerpago() {
		return fecFechaPagoPrimerpago;
	}

	public void setFecFechaPagoPrimerpago(Date fecFechaPagoPrimerpago) {
		this.fecFechaPagoPrimerpago = fecFechaPagoPrimerpago;
	}

	public String getNumNumeroConvenio() {
		return numNumeroConvenio;
	}

	public void setNumNumeroConvenio(String numNumeroConvenio) {
		this.numNumeroConvenio = numNumeroConvenio;
	}

	public Date getFecFechaConvenio() {
		return fecFechaConvenio;
	}

	public void setFecFechaConvenio(Date fecFechaConvenio) {
		this.fecFechaConvenio = fecFechaConvenio;
	}

	public Integer getNumParcialidades() {
		return numParcialidades;
	}

	public void setNumParcialidades(Integer numParcialidades) {
		this.numParcialidades = numParcialidades;
	}

	public String getDesObservaciones() {
		return desObservaciones;
	}

	public void setDesObservaciones(String desObservaciones) {
		this.desObservaciones = desObservaciones;
	}

	public String getDesRubros() {
		return desRubros;
	}

	public void setDesRubros(String desRubros) {
		this.desRubros = desRubros;
	}

	public String getDesConceptos() {
		return desConceptos;
	}

	public void setDesConceptos(String desConceptos) {
		this.desConceptos = desConceptos;
	}

	public String getDesMotivoSalvedad() {
		return desMotivoSalvedad;
	}

	public void setDesMotivoSalvedad(String desMotivoSalvedad) {
		this.desMotivoSalvedad = desMotivoSalvedad;
	}

	public String getDesLimitacionesInformacion() {
		return desLimitacionesInformacion;
	}

	public void setDesLimitacionesInformacion(String desLimitacionesInformacion) {
		this.desLimitacionesInformacion = desLimitacionesInformacion;
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

	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado;
	}

	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getCveIdPatronDictamen() {
		return cveIdPatronDictamen;
	}

	public void setCveIdPatronDictamen(String cveIdPatronDictamen) {
		this.cveIdPatronDictamen = cveIdPatronDictamen;
	}

	public String getCveIdTipoPago() {
		return cveIdTipoPago;
	}

	public void setCveIdTipoPago(String cveIdTipoPago) {
		this.cveIdTipoPago = cveIdTipoPago;
	}

	public String getCveIdTipoOpinion() {
		return cveIdTipoOpinion;
	}

	public void setCveIdTipoOpinion(String cveIdTipoOpinion) {
		this.cveIdTipoOpinion = cveIdTipoOpinion;
	}

	public String getCveIdFormaPago() {
		return cveIdFormaPago;
	}

	public void setCveIdFormaPago(String cveIdFormaPago) {
		this.cveIdFormaPago = cveIdFormaPago;
	}

}
