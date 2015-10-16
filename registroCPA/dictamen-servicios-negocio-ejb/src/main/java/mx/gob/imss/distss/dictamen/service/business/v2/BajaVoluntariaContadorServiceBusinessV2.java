package mx.gob.imss.distss.dictamen.service.business.v2;

import java.util.Date;
import java.util.Map;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import mx.gob.imss.ctirss.delta.model.firma.RespuestaFirmadoSimple;
import mx.gob.imss.ctirss.delta.model.gestion.solicitud.Solicitud;
import mx.gob.imss.distss.dictamen.modelo.dto.ConstantesEstadosCPA;
import mx.gob.imss.distss.dictamen.modelo.dto.NdtContadorPublicoAutDTO;
import mx.gob.imss.distss.dictamen.modelo.entidad.NdcEstadoCpa;
import mx.gob.imss.distss.dictamen.modelo.entidad.NdtContadorPublicoAut;
import mx.gob.imss.distss.dictamen.modelo.entidad.NdtCpaEstatus;
import mx.gob.imss.distss.dictamen.modelo.entidad.NdtCpaTramite;
import mx.gob.imss.distss.dictamen.service.interfaces.BdtuServiceRemote;
import mx.gob.imss.distss.dictamen.service.interfaces.NotariaServiceLocal;
import mx.gob.imss.distss.dictamen.service.interfaces.v2.BajaVoluntariaContadorServiceRemoteV2;
import mx.gob.imss.distss.dictamen.service.interfaces.v2.ContadorPublicoServiceLocalV2;
import mx.gob.imss.distss.dictamen.service.interfaces.v2.ContadorPublicoServiceRemoteV2;
import mx.gob.imss.distss.dictamen.service.interfaces.v2.EstatusContadorPublicoServiceLocalV2;
import mx.gob.imss.distss.dictamen.service.interfaces.v2.ReporteServiceRemote;
import mx.gob.imss.distss.dictamen.service.interfaces.v2.TramiteContadorPublicoServiceLocalV2;
import mx.gob.imss.distss.dictamen.service.util.ServiceMapper;
import mx.gob.imss.distss.dictamen.util.ConstantesDictamen;
import mx.gob.imss.distss.dictamen.util.UtileriaFechas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

@Stateless(mappedName = "bajaVoluntariaContadorServiceBusinessV2", name = "bajaVoluntariaContadorServiceBusinessV2")
public class BajaVoluntariaContadorServiceBusinessV2 implements BajaVoluntariaContadorServiceRemoteV2 {
	
	private static final Logger logger = LoggerFactory.getLogger(BajaVoluntariaContadorServiceBusinessV2.class);
	
	/**
     * Servicio para los Contadores Publicos
     */
	@EJB
    ContadorPublicoServiceLocalV2 contadorPublicoServiceLocalV2;
	
	/**
     * Servicio para los Contadores Publicos
     */
	@EJB
    EstatusContadorPublicoServiceLocalV2 estatusContadorPublicoServiceLocalV2;
	
	/**
     * Servicio para los Contadores Publicos
     */
	@EJB
    TramiteContadorPublicoServiceLocalV2 tramiteContadorPublicoServiceLocalV2;
	
	/**
     * Servicio para los Contadores Publicos
     */
	@EJB
	ContadorPublicoServiceRemoteV2 contadorPublicoServiceRemoteV2;
	
	/**
     * Servicio para Notia Electronica
     */
	@EJB
	NotariaServiceLocal notariaServiceLocal;
	
	/**
     * Servicio para los BDTU
     */
	@EJB
    BdtuServiceRemote bdtuServiceRemote;
	
	/**
     * Servicio para reportes de dictamen
     */
	@EJB
	ReporteServiceRemote reporteServiceRemote;

	@Override
	@Transactional
	public NdtContadorPublicoAutDTO guardarBajaVoluntariaContador(NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO) {
		Solicitud solicitud = null;
		try {
			
			NdtContadorPublicoAut ndtContadorPublicoAut = contadorPublicoServiceLocalV2.obtenerContadorPorIdPersona(ndtContadorPublicoAutDTO.getCveIdPersona());
			
			NdcEstadoCpa ndcEstadoCpa = new NdcEstadoCpa();
			ndcEstadoCpa.setCveIdEstadoCpa(ConstantesEstadosCPA.BAJA_VOLUNTARIA);
			
			// Se complementa el Objeto ListNdtCpaEstatus de NdtContadorPublicoAutDTO
			NdtCpaEstatus ndtCpaEstatus = new NdtCpaEstatus();
			ndtCpaEstatus.setNdcEstadoCpa(ndcEstadoCpa);
			ndtCpaEstatus.setCveIdUsuario(ndtContadorPublicoAutDTO.getCveIdUsuario());
			ndtCpaEstatus.setDesComentarios(ndtContadorPublicoAutDTO.getListNdtCpaEstatus().get(0).getDesComentarios());
			ndtCpaEstatus.setFecBaja(new Date());
			ndtCpaEstatus.setNdtContadorPublicoAut(ndtContadorPublicoAut);
			
			// Se genera cadena original del acuse de registro del contador publico
			ndtContadorPublicoAutDTO.setCadenaOriginal(generaCadenaOriginalSolicitudBajaVoluntaria(ndtContadorPublicoAutDTO));
			
			// Se obtiene el tramite de notaria con la cadena original y el recibo de notaria del resultado de la firma digital
			RespuestaFirmadoSimple tramite = notariaServiceLocal.getSelloDigital(ndtContadorPublicoAutDTO.getCadenaOriginal(), 
					ndtContadorPublicoAutDTO.getListNdtCpaTramites().get(0).getReciboNotaria(), null);
			
			ndtContadorPublicoAutDTO.getListNdtCpaTramites().get(0).setNumTramiteNotaria(tramite.getTramite());
			ndtContadorPublicoAutDTO.getListNdtCpaTramites().get(0).setSelloDigitalImss(tramite.getSello());
			
			// Se genera la solicitud de tramite en la bdtu
			solicitud = bdtuServiceRemote.generarSolicitudTramiteBdtu(ndtContadorPublicoAutDTO.getUsuarioSesion());
			
			NdtCpaTramite ndtCpaTramite = new NdtCpaTramite();
			ndtCpaTramite.setCveIdUsuario(ndtContadorPublicoAutDTO.getCveIdUsuario());
			ndtCpaTramite.setFecRegistroAlta(new Date());
			ndtCpaTramite.setCveIdTramite(solicitud.getTramites().get(0).getTramiteId());
			ndtCpaTramite.setFecSolicitudMovimiento(solicitud.getFechaSolicitud());
			ndtCpaTramite.setUrlAcuseNotaria(ndtContadorPublicoAutDTO.getListNdtCpaTramites().get(0).getUrlAcuseNotaria());
			ndtCpaTramite.setNumTramiteNotaria(ndtContadorPublicoAutDTO.getListNdtCpaTramites().get(0).getNumTramiteNotaria());
			ndtCpaTramite.setReciboNotaria(ndtContadorPublicoAutDTO.getListNdtCpaTramites().get(0).getReciboNotaria());
			ndtCpaTramite.setNdtContadorPublicoAut(ndtContadorPublicoAut);
			
			tramiteContadorPublicoServiceLocalV2.saveOrUpdate(ndtCpaTramite);
			
			ndtCpaEstatus.setNdtCpaTramite(ndtCpaTramite);
			estatusContadorPublicoServiceLocalV2.saveOrUpdate(ndtCpaEstatus);
			
			// Se generan los parametros para el registro de contador publico
			Map<String,Object> iReportParameter = reporteServiceRemote.generaParametrosBajaVoluntariaContador(ndtContadorPublicoAutDTO);
			
			// Se genera el acuse del registro de contador publico con el sello digital y cadena original y se envia a notaria electronica
			reporteServiceRemote.generarReportePDF(iReportParameter, ConstantesDictamen.TIPO_REPORTE_SOLICITUD_BAJA_VOLUNTARIA);
			
			ndtContadorPublicoAutDTO = ServiceMapper.map(ndtContadorPublicoAut, NdtContadorPublicoAutDTO.class);
			
			ndtContadorPublicoAutDTO = contadorPublicoServiceRemoteV2.obtenerContadorCompletoPorIdPersona(ndtContadorPublicoAutDTO.getCveIdPersona());
			
		} catch (Exception ex) {
			logger.info("ERROR: En el servicio BajaVoluntariaContadorServiceBusinessV2 al guardar la baja voluntaria de un contador publico autorizado.", ex);
			ndtContadorPublicoAutDTO = null;
			throw new RuntimeException("ERROR: En el servicio BajaVoluntariaContadorServiceBusinessV2 al guardar la baja voluntaria de un contador publico autorizado.", ex);
		}
		return ndtContadorPublicoAutDTO;
	}
	
	private String generaCadenaOriginalSolicitudBajaVoluntaria(NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO) throws RuntimeException {
		StringBuilder cadenaOriginal = new StringBuilder();
		try {
			cadenaOriginal.append("|");
			cadenaOriginal.append(verificaCampo("|FECHA|", UtileriaFechas.parseDateToString(new Date(), "dd/MM/yyyy")));
			
			if (ndtContadorPublicoAutDTO.getListNdtCpaTramites() != null && !ndtContadorPublicoAutDTO.getListNdtCpaTramites().isEmpty() && 
					ndtContadorPublicoAutDTO.getListNdtCpaTramites().get(0) != null) {
				cadenaOriginal.append(verificaCampo("|NÚMERO DE TRÁMITE|", ndtContadorPublicoAutDTO.getListNdtCpaTramites().get(0).getCveIdTramite()));
			}
			
			if (ndtContadorPublicoAutDTO.getUsuarioSesion() != null ) {
				cadenaOriginal.append(verificaCampo("|NOMBRE DEL CONTADOR PÚBLICO|", ndtContadorPublicoAutDTO.getUsuarioSesion().getNombreCompleto()));
				cadenaOriginal.append(verificaCampo("|RFC|", ndtContadorPublicoAutDTO.getUsuarioSesion().getRfc()));
				cadenaOriginal.append(verificaCampo("|CURP|", ndtContadorPublicoAutDTO.getUsuarioSesion().getCurp()));
			}
			
			cadenaOriginal.append(verificaCampo("|NÚMERO DE REGISTRO DE CONTADOR PÚBLICO AUTORIZADO|", ndtContadorPublicoAutDTO.getNumRegistroCpa()));
			
			if (ndtContadorPublicoAutDTO.getPersonaFiscal() != null && ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal() != null) {
				StringBuilder domicilioFiscal = new StringBuilder();
				domicilioFiscal.append(ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getCalle() != null ? 
						ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getCalle().trim() +" " : "");
				domicilioFiscal.append(ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getNumExterior1() != null ? 
						ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getNumExterior1() +"" : "");
				domicilioFiscal.append(ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getNumExteriorAlf() != null ? 
						ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getNumExteriorAlf().trim() +" " : "");
				domicilioFiscal.append(ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getNumInterior() != null ? 
						ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getNumInterior() +" " : "");
				domicilioFiscal.append(ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getNumInteriorAlf() != null ? 
						ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getNumInteriorAlf().trim() +" " : "");
				domicilioFiscal.append(ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getColonia() != null ? 
						ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getColonia().trim() +" " : "");
				if (ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento() != null && 
						ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento().getLocalidad() != null && 
						ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento().getLocalidad().getMunicipio() != null && 
						ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento().getLocalidad().getMunicipio().getEntidadFederativa() != null) {
					domicilioFiscal.append(ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento().getLocalidad().getMunicipio().getEntidadFederativa().getNombre() != null ?
							ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento().getLocalidad().getMunicipio().getEntidadFederativa().getNombre().trim() +" " : "");
				}
				if (ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getCodigoPostal() != null) {
					domicilioFiscal.append(ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getCodigoPostal().getCodigoPostal() != null ?
							ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getCodigoPostal().getCodigoPostal().trim() : "");
				}
				cadenaOriginal.append(verificaCampo("|DOMICILIO FISCAL|", domicilioFiscal.toString()));
			}
			
			String numeroCedula = "";
			if (ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales() != null && !ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().isEmpty()) {
				numeroCedula=ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).getCedulaProfesional();
				if (numeroCedula == null) {
					numeroCedula = "";
				}
			}
			cadenaOriginal.append(verificaCampo("|NÚMERO DE CÉDULA PROFESIONAL|", numeroCedula));
			cadenaOriginal.append("||");
		} catch (Exception ex) {
			logger.info("ERROR: En el servicio ContadorPublicoServiceBusinessV2 al generar la cadena original del registro de contador publico.", ex);
			throw new RuntimeException("ERROR: En el servicio ContadorPublicoServiceBusinessV2 al generar la cadena original del registro de contador publico.", ex);
		}
		return cadenaOriginal.toString();
	}
	
	private String verificaCampo(String texto, Object parameter) {
		return (parameter != null || parameter != "") ? texto + parameter : "";
	}

}
