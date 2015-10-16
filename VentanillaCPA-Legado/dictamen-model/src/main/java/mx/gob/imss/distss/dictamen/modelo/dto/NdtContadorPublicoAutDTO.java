package mx.gob.imss.distss.dictamen.modelo.dto;

import mx.gob.imss.distss.dictamen.model.abstr.AbstractModel;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

//import mx.gob.imss.ctirss.delta.framework.base.model.AbstractModel;
//import mx.gob.imss.ctirss.delta.model.gestion.individuo.Fisica;

public class NdtContadorPublicoAutDTO extends AbstractModel implements Serializable {

	private static final long serialVersionUID = 3280260584345720587L;

	private Long cveIdCpa;
	private Long cveIdPersona;
	private String cveIdUsuario;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Long numRegistroCpa;
	private NdcEstadoCpaDTO ndcEstadoCpa;
	private List<NdtCpaAcreditacionDTO> listNdtCpaAcreditacions;
	private List<NdtCpaEstatusDTO> listNdtCpaEstatus;
	private List<NdtCpaTramiteDTO> listNdtCpaTramites;
	private List<NdtDocumentoProbatorioDTO> listNdtDocumentoProbatorios;
	private List<NdtPatronDictamenCpaDTO> listNdtPatronDictamenCpas;
	private List<NdtR1DatosPersonalesDTO> listNdtR1DatosPersonales;
	private List<NdtR2DespachoDTO> listNdtR2Despachos;
	private List<NdtR3ColegioDTO> listNdtR3Colegios;
	//private Fisica persona;
	//private Fisica personaFiscal;

	public Long getCveIdCpa() {
		return cveIdCpa;
	}

	public void setCveIdCpa(Long cveIdCpa) {
		this.cveIdCpa = cveIdCpa;
	}

	public Long getCveIdPersona() {
		return cveIdPersona;
	}

	public void setCveIdPersona(Long cveIdPersona) {
		this.cveIdPersona = cveIdPersona;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
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

	public Long getNumRegistroCpa() {
		return numRegistroCpa;
	}

	public void setNumRegistroCpa(Long numRegistroCpa) {
		this.numRegistroCpa = numRegistroCpa;
	}

	public NdcEstadoCpaDTO getNdcEstadoCpa() {
		return ndcEstadoCpa;
	}

	public void setNdcEstadoCpa(NdcEstadoCpaDTO ndcEstadoCpa) {
		this.ndcEstadoCpa = ndcEstadoCpa;
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

	public List<NdtCpaTramiteDTO> getListNdtCpaTramites() {
		return listNdtCpaTramites;
	}

	public void setListNdtCpaTramites(List<NdtCpaTramiteDTO> listNdtCpaTramites) {
		this.listNdtCpaTramites = listNdtCpaTramites;
	}

	public List<NdtDocumentoProbatorioDTO> getListNdtDocumentoProbatorios() {
		return listNdtDocumentoProbatorios;
	}

	public void setListNdtDocumentoProbatorios(List<NdtDocumentoProbatorioDTO> listNdtDocumentoProbatorios) {
		this.listNdtDocumentoProbatorios = listNdtDocumentoProbatorios;
	}

	public List<NdtPatronDictamenCpaDTO> getListNdtPatronDictamenCpas() {
		return listNdtPatronDictamenCpas;
	}

	public void setListNdtPatronDictamenCpas(List<NdtPatronDictamenCpaDTO> listNdtPatronDictamenCpas) {
		this.listNdtPatronDictamenCpas = listNdtPatronDictamenCpas;
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

	/*
	public Fisica getPersona() {
		return persona;
	}

	public void setPersona(Fisica persona) {
		this.persona = persona;
	}

	public Fisica getPersonaFiscal() {
		return personaFiscal;
	}

	public void setPersonaFiscal(Fisica personaFiscal) {
		this.personaFiscal = personaFiscal;
	}
*/
}
