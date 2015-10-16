package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class NdtCpaTramiteDTO implements Serializable {

	private static final long serialVersionUID = 6645973816923495649L;

	private Long cveIdCpaTramite;
	private Long cveIdTramite;
	private String cveIdUsuario;
	private Date fecAutorizacionMovimiento;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Date fecSolicitudMovimiento;
	private String numTramiteNotaria;
	private String urlAcuseNotaria;
	private List<NdtCpaAcreditacionDTO> listNdtCpaAcreditacions;
	private List<NdtCpaEstatusDTO> listNdtCpaEstatus;
	private List<NdtDocumentoProbatorioDTO> listNdtDocumentoProbatorios;
	private List<NdtR1DatosPersonalesDTO> listNdtR1DatosPersonales;
	private List<NdtR2DespachoDTO> listNdtR2Despachos;
	private List<NdtR3ColegioDTO> listNdtR3Colegios;

	public Long getCveIdCpaTramite() {
		return cveIdCpaTramite;
	}

	public void setCveIdCpaTramite(Long cveIdCpaTramite) {
		this.cveIdCpaTramite = cveIdCpaTramite;
	}

	public Long getCveIdTramite() {
		return cveIdTramite;
	}

	public void setCveIdTramite(Long cveIdTramite) {
		this.cveIdTramite = cveIdTramite;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public Date getFecAutorizacionMovimiento() {
		return fecAutorizacionMovimiento;
	}

	public void setFecAutorizacionMovimiento(Date fecAutorizacionMovimiento) {
		this.fecAutorizacionMovimiento = fecAutorizacionMovimiento;
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

	public Date getFecSolicitudMovimiento() {
		return fecSolicitudMovimiento;
	}

	public void setFecSolicitudMovimiento(Date fecSolicitudMovimiento) {
		this.fecSolicitudMovimiento = fecSolicitudMovimiento;
	}

	public String getNumTramiteNotaria() {
		return numTramiteNotaria;
	}

	public void setNumTramiteNotaria(String numTramiteNotaria) {
		this.numTramiteNotaria = numTramiteNotaria;
	}

	public String getUrlAcuseNotaria() {
		return urlAcuseNotaria;
	}

	public void setUrlAcuseNotaria(String urlAcuseNotaria) {
		this.urlAcuseNotaria = urlAcuseNotaria;
	}

	public List<NdtCpaAcreditacionDTO> getListNdtCpaAcreditacions() {
		return listNdtCpaAcreditacions;
	}

	public void setListNdtCpaAcreditacions(List<NdtCpaAcreditacionDTO> listNdtCpaAcreditacions) {
		this.listNdtCpaAcreditacions = listNdtCpaAcreditacions;
	}

	public List<NdtCpaEstatusDTO> getListNdtCpaEstatus() {
		return listNdtCpaEstatus;
	}

	public void setListNdtCpaEstatus(List<NdtCpaEstatusDTO> listNdtCpaEstatus) {
		this.listNdtCpaEstatus = listNdtCpaEstatus;
	}

	public List<NdtDocumentoProbatorioDTO> getListNdtDocumentoProbatorios() {
		return listNdtDocumentoProbatorios;
	}

	public void setListNdtDocumentoProbatorios(List<NdtDocumentoProbatorioDTO> listNdtDocumentoProbatorios) {
		this.listNdtDocumentoProbatorios = listNdtDocumentoProbatorios;
	}

	public List<NdtR1DatosPersonalesDTO> getListNdtR1DatosPersonales() {
		return listNdtR1DatosPersonales;
	}

	public void setListNdtR1DatosPersonales(List<NdtR1DatosPersonalesDTO> listNdtR1DatosPersonales) {
		this.listNdtR1DatosPersonales = listNdtR1DatosPersonales;
	}

	public List<NdtR2DespachoDTO> getListNdtR2Despachos() {
		return listNdtR2Despachos;
	}

	public void setListNdtR2Despachos(List<NdtR2DespachoDTO> listNdtR2Despachos) {
		this.listNdtR2Despachos = listNdtR2Despachos;
	}

	public List<NdtR3ColegioDTO> getListNdtR3Colegios() {
		return listNdtR3Colegios;
	}

	public void setListNdtR3Colegios(List<NdtR3ColegioDTO> listNdtR3Colegios) {
		this.listNdtR3Colegios = listNdtR3Colegios;
	}

}
