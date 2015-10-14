package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdtModeloOpinionDTO implements Serializable {

	private static final long serialVersionUID = 2885730651917736505L;

	private Long cveIdModeloOpinion;
	private String cveIdUsuario;
	private String desConceptos;
	private String desLimitacionesInformacion;
	private String desMotivoSalvedad;
	private String desObservaciones;
	private String desRubros;
	private Date fecFechaConvenio;
	private Date fecFechaPagoPrimerpago;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private String numNumeroConvenio;
	private Long numParcialidades;
	private NdcFormaPagoDTO ndcFormaPago;
	private NdcTipoModeloOpinionDTO ndcTipoModeloOpinion;
	private NdcTipoPagoDTO ndcTipoPago;

	public Long getCveIdModeloOpinion() {
		return cveIdModeloOpinion;
	}

	public void setCveIdModeloOpinion(Long cveIdModeloOpinion) {
		this.cveIdModeloOpinion = cveIdModeloOpinion;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDesConceptos() {
		return desConceptos;
	}

	public void setDesConceptos(String desConceptos) {
		this.desConceptos = desConceptos;
	}

	public String getDesLimitacionesInformacion() {
		return desLimitacionesInformacion;
	}

	public void setDesLimitacionesInformacion(String desLimitacionesInformacion) {
		this.desLimitacionesInformacion = desLimitacionesInformacion;
	}

	public String getDesMotivoSalvedad() {
		return desMotivoSalvedad;
	}

	public void setDesMotivoSalvedad(String desMotivoSalvedad) {
		this.desMotivoSalvedad = desMotivoSalvedad;
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

	public Date getFecFechaConvenio() {
		return fecFechaConvenio;
	}

	public void setFecFechaConvenio(Date fecFechaConvenio) {
		this.fecFechaConvenio = fecFechaConvenio;
	}

	public Date getFecFechaPagoPrimerpago() {
		return fecFechaPagoPrimerpago;
	}

	public void setFecFechaPagoPrimerpago(Date fecFechaPagoPrimerpago) {
		this.fecFechaPagoPrimerpago = fecFechaPagoPrimerpago;
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

	public String getNumNumeroConvenio() {
		return numNumeroConvenio;
	}

	public void setNumNumeroConvenio(String numNumeroConvenio) {
		this.numNumeroConvenio = numNumeroConvenio;
	}

	public Long getNumParcialidades() {
		return numParcialidades;
	}

	public void setNumParcialidades(Long numParcialidades) {
		this.numParcialidades = numParcialidades;
	}

	public NdcFormaPagoDTO getNdcFormaPago() {
		return ndcFormaPago;
	}

	public void setNdcFormaPago(NdcFormaPagoDTO ndcFormaPago) {
		this.ndcFormaPago = ndcFormaPago;
	}

	public NdcTipoModeloOpinionDTO getNdcTipoModeloOpinion() {
		return ndcTipoModeloOpinion;
	}

	public void setNdcTipoModeloOpinion(NdcTipoModeloOpinionDTO ndcTipoModeloOpinion) {
		this.ndcTipoModeloOpinion = ndcTipoModeloOpinion;
	}

	public NdcTipoPagoDTO getNdcTipoPago() {
		return ndcTipoPago;
	}

	public void setNdcTipoPago(NdcTipoPagoDTO ndcTipoPago) {
		this.ndcTipoPago = ndcTipoPago;
	}

}
