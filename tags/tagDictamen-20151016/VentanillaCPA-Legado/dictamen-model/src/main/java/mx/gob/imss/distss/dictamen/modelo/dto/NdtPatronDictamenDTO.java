package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class NdtPatronDictamenDTO implements Serializable {

	private static final long serialVersionUID = 5475326048737459433L;

	private Long cveIdPatronDictamen;
	private Long cveIdPatronSujetoObligado;
	private Long cveIdPersonaMoral;
	private Long cveIdSubdelegacion;
	private Long cveIdTramite;
	private String cveIdUsuario;
	private String desNombreRazonSocial;
	private String desNumeroFolioDictamen;
	private String desRfc;
	private Date fecRegistroAlta;
	private Date fecRegistroAutorizado;
	private Date fecRegistroBaja;
	private Long indPatronConstruccion;
	private Long indPatronEmpresaValuada;
	private Long indPatronObligado;
	private Long indRealizoActConstruccion;
	private Long numNumeroTrabajadores;
	private Long numRegistroPatronales;
	private List<NdtA1PercepTrabajadorDTO> listNdtA1PercepTrabajadors;
	private List<NdtA2OtraPrestOtorgadaDTO> listNdtA2OtraPrestOtorgadas;
	private List<NdtA3CuotaObreroPatronalDTO> listNdtA3CuotaObreroPatronals;
	private List<NdtA4PagoPersonaFisicaDTO> listNdtA4PagoPersonaFisicas;
	private List<NdtA51PersonalProporcionadDTO> listNdtA51PersonalProporcionads;
	private List<NdtA5PrestadoraServiciosDTO> listNdtA5PrestadoraServicios;
	private List<NdtA61PersonalProporcionadDTO> listNdtA61PersonalProporcionads;
	private List<NdtA6SubcontratacionSpDTO> listNdtA6SubcontratacionSps;
	private List<NdtA71CeProcesoDTO> listNdtA71CeProcesos;
	private List<NdtA72CeBienDTO> listNdtA72CeBiens;
	private List<NdtA73CeMaquinariaDTO> listNdtA73CeMaquinarias;
	private List<NdtA74CeTransporteDTO> listNdtA74CeTransportes;
	private List<NdtA75CePersonalDTO> listNdtA75CePersonals;
	private List<NdtA76CeActCompDTO> listNdtA76CeActComps;
	private List<NdtA8BalanzaComprobacionDTO> listNdtA8BalanzaComprobacions;
	private List<NdtA911PersonalObraDTO> listNdtA911PersonalObras;
	private List<NdtA91ObrasConstruccionDTO> listNdtA91ObrasConstruccions;
	private List<NdtA921PersSubcontratadoDTO> listNdtA921PersSubcontratados;
	private List<NdtA92ObrasSubcontrataDTO> listNdtA92ObrasSubcontratas;
	private List<NdtB1CedulaRemuneracionesDTO> listNdtB1CedulaRemuneraciones;
	private List<NdtB2CedulaPrestacionesDTO> listNdtB2CedulaPrestaciones;
	private List<NdtCargaAseveracionesDTO> listNdtCargaAseveraciones;
	private List<NdtCedulaPagosDiferenciasDTO> listNdtCedulaPagosDiferencias;
	private List<NdtModeloOpinionDTO> listNdtModeloOpinions;
	private List<NdtNotasDictamenDTO> listNdtNotasDictamens;
	private NdcEjercicioFiscalDTO ndcEjercicioFiscal;
	private NdcTipoDictamenDTO ndcTipoDictamen;
	private List<NdtPatronDictamenCpaDTO> listNdtPatronDictamenCpas;
	private List<NdtAtestiguamientoDictamenDTO> listNdtAtestiguamientoDictamens;

	public Long getCveIdPatronDictamen() {
		return cveIdPatronDictamen;
	}

	public void setCveIdPatronDictamen(Long cveIdPatronDictamen) {
		this.cveIdPatronDictamen = cveIdPatronDictamen;
	}

	public Long getCveIdPatronSujetoObligado() {
		return cveIdPatronSujetoObligado;
	}

	public void setCveIdPatronSujetoObligado(Long cveIdPatronSujetoObligado) {
		this.cveIdPatronSujetoObligado = cveIdPatronSujetoObligado;
	}

	public Long getCveIdPersonaMoral() {
		return cveIdPersonaMoral;
	}

	public void setCveIdPersonaMoral(Long cveIdPersonaMoral) {
		this.cveIdPersonaMoral = cveIdPersonaMoral;
	}

	public Long getCveIdSubdelegacion() {
		return cveIdSubdelegacion;
	}

	public void setCveIdSubdelegacion(Long cveIdSubdelegacion) {
		this.cveIdSubdelegacion = cveIdSubdelegacion;
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

	public String getDesNombreRazonSocial() {
		return desNombreRazonSocial;
	}

	public void setDesNombreRazonSocial(String desNombreRazonSocial) {
		this.desNombreRazonSocial = desNombreRazonSocial;
	}

	public String getDesNumeroFolioDictamen() {
		return desNumeroFolioDictamen;
	}

	public void setDesNumeroFolioDictamen(String desNumeroFolioDictamen) {
		this.desNumeroFolioDictamen = desNumeroFolioDictamen;
	}

	public String getDesRfc() {
		return desRfc;
	}

	public void setDesRfc(String desRfc) {
		this.desRfc = desRfc;
	}

	public Date getFecRegistroAlta() {
		return fecRegistroAlta;
	}

	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	public Date getFecRegistroAutorizado() {
		return fecRegistroAutorizado;
	}

	public void setFecRegistroAutorizado(Date fecRegistroAutorizado) {
		this.fecRegistroAutorizado = fecRegistroAutorizado;
	}

	public Date getFecRegistroBaja() {
		return fecRegistroBaja;
	}

	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	public Long getIndPatronConstruccion() {
		return indPatronConstruccion;
	}

	public void setIndPatronConstruccion(Long indPatronConstruccion) {
		this.indPatronConstruccion = indPatronConstruccion;
	}

	public Long getIndPatronEmpresaValuada() {
		return indPatronEmpresaValuada;
	}

	public void setIndPatronEmpresaValuada(Long indPatronEmpresaValuada) {
		this.indPatronEmpresaValuada = indPatronEmpresaValuada;
	}

	public Long getIndPatronObligado() {
		return indPatronObligado;
	}

	public void setIndPatronObligado(Long indPatronObligado) {
		this.indPatronObligado = indPatronObligado;
	}

	public Long getIndRealizoActConstruccion() {
		return indRealizoActConstruccion;
	}

	public void setIndRealizoActConstruccion(Long indRealizoActConstruccion) {
		this.indRealizoActConstruccion = indRealizoActConstruccion;
	}

	public Long getNumNumeroTrabajadores() {
		return numNumeroTrabajadores;
	}

	public void setNumNumeroTrabajadores(Long numNumeroTrabajadores) {
		this.numNumeroTrabajadores = numNumeroTrabajadores;
	}

	public Long getNumRegistroPatronales() {
		return numRegistroPatronales;
	}

	public void setNumRegistroPatronales(Long numRegistroPatronales) {
		this.numRegistroPatronales = numRegistroPatronales;
	}

	public List<NdtA1PercepTrabajadorDTO> getListNdtA1PercepTrabajadors() {
		return listNdtA1PercepTrabajadors;
	}

	public void setListNdtA1PercepTrabajadors(List<NdtA1PercepTrabajadorDTO> listNdtA1PercepTrabajadors) {
		this.listNdtA1PercepTrabajadors = listNdtA1PercepTrabajadors;
	}

	public List<NdtA2OtraPrestOtorgadaDTO> getListNdtA2OtraPrestOtorgadas() {
		return listNdtA2OtraPrestOtorgadas;
	}

	public void setListNdtA2OtraPrestOtorgadas(List<NdtA2OtraPrestOtorgadaDTO> listNdtA2OtraPrestOtorgadas) {
		this.listNdtA2OtraPrestOtorgadas = listNdtA2OtraPrestOtorgadas;
	}

	public List<NdtA3CuotaObreroPatronalDTO> getListNdtA3CuotaObreroPatronals() {
		return listNdtA3CuotaObreroPatronals;
	}

	public void setListNdtA3CuotaObreroPatronals(List<NdtA3CuotaObreroPatronalDTO> listNdtA3CuotaObreroPatronals) {
		this.listNdtA3CuotaObreroPatronals = listNdtA3CuotaObreroPatronals;
	}

	public List<NdtA4PagoPersonaFisicaDTO> getListNdtA4PagoPersonaFisicas() {
		return listNdtA4PagoPersonaFisicas;
	}

	public void setListNdtA4PagoPersonaFisicas(List<NdtA4PagoPersonaFisicaDTO> listNdtA4PagoPersonaFisicas) {
		this.listNdtA4PagoPersonaFisicas = listNdtA4PagoPersonaFisicas;
	}

	public List<NdtA51PersonalProporcionadDTO> getListNdtA51PersonalProporcionads() {
		return listNdtA51PersonalProporcionads;
	}

	public void setListNdtA51PersonalProporcionads(List<NdtA51PersonalProporcionadDTO> listNdtA51PersonalProporcionads) {
		this.listNdtA51PersonalProporcionads = listNdtA51PersonalProporcionads;
	}

	public List<NdtA5PrestadoraServiciosDTO> getListNdtA5PrestadoraServicios() {
		return listNdtA5PrestadoraServicios;
	}

	public void setListNdtA5PrestadoraServicios(List<NdtA5PrestadoraServiciosDTO> listNdtA5PrestadoraServicios) {
		this.listNdtA5PrestadoraServicios = listNdtA5PrestadoraServicios;
	}

	public List<NdtA61PersonalProporcionadDTO> getListNdtA61PersonalProporcionads() {
		return listNdtA61PersonalProporcionads;
	}

	public void setListNdtA61PersonalProporcionads(List<NdtA61PersonalProporcionadDTO> listNdtA61PersonalProporcionads) {
		this.listNdtA61PersonalProporcionads = listNdtA61PersonalProporcionads;
	}

	public List<NdtA6SubcontratacionSpDTO> getListNdtA6SubcontratacionSps() {
		return listNdtA6SubcontratacionSps;
	}

	public void setListNdtA6SubcontratacionSps(List<NdtA6SubcontratacionSpDTO> listNdtA6SubcontratacionSps) {
		this.listNdtA6SubcontratacionSps = listNdtA6SubcontratacionSps;
	}

	public List<NdtA71CeProcesoDTO> getListNdtA71CeProcesos() {
		return listNdtA71CeProcesos;
	}

	public void setListNdtA71CeProcesos(List<NdtA71CeProcesoDTO> listNdtA71CeProcesos) {
		this.listNdtA71CeProcesos = listNdtA71CeProcesos;
	}

	public List<NdtA72CeBienDTO> getListNdtA72CeBiens() {
		return listNdtA72CeBiens;
	}

	public void setListNdtA72CeBiens(List<NdtA72CeBienDTO> listNdtA72CeBiens) {
		this.listNdtA72CeBiens = listNdtA72CeBiens;
	}

	public List<NdtA73CeMaquinariaDTO> getListNdtA73CeMaquinarias() {
		return listNdtA73CeMaquinarias;
	}

	public void setListNdtA73CeMaquinarias(List<NdtA73CeMaquinariaDTO> listNdtA73CeMaquinarias) {
		this.listNdtA73CeMaquinarias = listNdtA73CeMaquinarias;
	}

	public List<NdtA74CeTransporteDTO> getListNdtA74CeTransportes() {
		return listNdtA74CeTransportes;
	}

	public void setListNdtA74CeTransportes(List<NdtA74CeTransporteDTO> listNdtA74CeTransportes) {
		this.listNdtA74CeTransportes = listNdtA74CeTransportes;
	}

	public List<NdtA75CePersonalDTO> getListNdtA75CePersonals() {
		return listNdtA75CePersonals;
	}

	public void setListNdtA75CePersonals(List<NdtA75CePersonalDTO> listNdtA75CePersonals) {
		this.listNdtA75CePersonals = listNdtA75CePersonals;
	}

	public List<NdtA76CeActCompDTO> getListNdtA76CeActComps() {
		return listNdtA76CeActComps;
	}

	public void setListNdtA76CeActComps(List<NdtA76CeActCompDTO> listNdtA76CeActComps) {
		this.listNdtA76CeActComps = listNdtA76CeActComps;
	}

	public List<NdtA8BalanzaComprobacionDTO> getListNdtA8BalanzaComprobacions() {
		return listNdtA8BalanzaComprobacions;
	}

	public void setListNdtA8BalanzaComprobacions(List<NdtA8BalanzaComprobacionDTO> listNdtA8BalanzaComprobacions) {
		this.listNdtA8BalanzaComprobacions = listNdtA8BalanzaComprobacions;
	}

	public List<NdtA911PersonalObraDTO> getListNdtA911PersonalObras() {
		return listNdtA911PersonalObras;
	}

	public void setListNdtA911PersonalObras(List<NdtA911PersonalObraDTO> listNdtA911PersonalObras) {
		this.listNdtA911PersonalObras = listNdtA911PersonalObras;
	}

	public List<NdtA91ObrasConstruccionDTO> getListNdtA91ObrasConstruccions() {
		return listNdtA91ObrasConstruccions;
	}

	public void setListNdtA91ObrasConstruccions(List<NdtA91ObrasConstruccionDTO> listNdtA91ObrasConstruccions) {
		this.listNdtA91ObrasConstruccions = listNdtA91ObrasConstruccions;
	}

	public List<NdtA921PersSubcontratadoDTO> getListNdtA921PersSubcontratados() {
		return listNdtA921PersSubcontratados;
	}

	public void setListNdtA921PersSubcontratados(List<NdtA921PersSubcontratadoDTO> listNdtA921PersSubcontratados) {
		this.listNdtA921PersSubcontratados = listNdtA921PersSubcontratados;
	}

	public List<NdtA92ObrasSubcontrataDTO> getListNdtA92ObrasSubcontratas() {
		return listNdtA92ObrasSubcontratas;
	}

	public void setListNdtA92ObrasSubcontratas(List<NdtA92ObrasSubcontrataDTO> listNdtA92ObrasSubcontratas) {
		this.listNdtA92ObrasSubcontratas = listNdtA92ObrasSubcontratas;
	}

	public List<NdtB1CedulaRemuneracionesDTO> getListNdtB1CedulaRemuneraciones() {
		return listNdtB1CedulaRemuneraciones;
	}

	public void setListNdtB1CedulaRemuneraciones(List<NdtB1CedulaRemuneracionesDTO> listNdtB1CedulaRemuneraciones) {
		this.listNdtB1CedulaRemuneraciones = listNdtB1CedulaRemuneraciones;
	}

	public List<NdtB2CedulaPrestacionesDTO> getListNdtB2CedulaPrestaciones() {
		return listNdtB2CedulaPrestaciones;
	}

	public void setListNdtB2CedulaPrestaciones(List<NdtB2CedulaPrestacionesDTO> listNdtB2CedulaPrestaciones) {
		this.listNdtB2CedulaPrestaciones = listNdtB2CedulaPrestaciones;
	}

	public List<NdtCargaAseveracionesDTO> getListNdtCargaAseveraciones() {
		return listNdtCargaAseveraciones;
	}

	public void setListNdtCargaAseveraciones(List<NdtCargaAseveracionesDTO> listNdtCargaAseveraciones) {
		this.listNdtCargaAseveraciones = listNdtCargaAseveraciones;
	}

	public List<NdtCedulaPagosDiferenciasDTO> getListNdtCedulaPagosDiferencias() {
		return listNdtCedulaPagosDiferencias;
	}

	public void setListNdtCedulaPagosDiferencias(List<NdtCedulaPagosDiferenciasDTO> listNdtCedulaPagosDiferencias) {
		this.listNdtCedulaPagosDiferencias = listNdtCedulaPagosDiferencias;
	}

	public List<NdtModeloOpinionDTO> getListNdtModeloOpinions() {
		return listNdtModeloOpinions;
	}

	public void setListNdtModeloOpinions(List<NdtModeloOpinionDTO> listNdtModeloOpinions) {
		this.listNdtModeloOpinions = listNdtModeloOpinions;
	}

	public List<NdtNotasDictamenDTO> getListNdtNotasDictamens() {
		return listNdtNotasDictamens;
	}

	public void setListNdtNotasDictamens(List<NdtNotasDictamenDTO> listNdtNotasDictamens) {
		this.listNdtNotasDictamens = listNdtNotasDictamens;
	}

	public NdcEjercicioFiscalDTO getNdcEjercicioFiscal() {
		return ndcEjercicioFiscal;
	}

	public void setNdcEjercicioFiscal(NdcEjercicioFiscalDTO ndcEjercicioFiscal) {
		this.ndcEjercicioFiscal = ndcEjercicioFiscal;
	}

	public NdcTipoDictamenDTO getNdcTipoDictamen() {
		return ndcTipoDictamen;
	}

	public void setNdcTipoDictamen(NdcTipoDictamenDTO ndcTipoDictamen) {
		this.ndcTipoDictamen = ndcTipoDictamen;
	}

	public List<NdtPatronDictamenCpaDTO> getListNdtPatronDictamenCpas() {
		return listNdtPatronDictamenCpas;
	}

	public void setListNdtPatronDictamenCpas(List<NdtPatronDictamenCpaDTO> listNdtPatronDictamenCpas) {
		this.listNdtPatronDictamenCpas = listNdtPatronDictamenCpas;
	}

	public List<NdtAtestiguamientoDictamenDTO> getListNdtAtestiguamientoDictamens() {
		return listNdtAtestiguamientoDictamens;
	}

	public void setListNdtAtestiguamientoDictamens(List<NdtAtestiguamientoDictamenDTO> listNdtAtestiguamientoDictamens) {
		this.listNdtAtestiguamientoDictamens = listNdtAtestiguamientoDictamens;
	}

}
