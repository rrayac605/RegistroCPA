package mx.gob.imss.distss.dictamen.service.business.v2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.gob.imss.ctirss.delta.model.enums.TipoPersonaEnum;
import mx.gob.imss.ctirss.delta.model.firma.RespuestaFirmadoSimple;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Fisica;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Moral;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.TipoPersona;
import mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.CorreoElectronico;
import mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.MedioContacto;
import mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.TelefonoFijo;
import mx.gob.imss.ctirss.delta.model.gestion.solicitud.Solicitud;
import mx.gob.imss.distss.dictamen.modelo.dto.ConstantesEstadosCPA;
import mx.gob.imss.distss.dictamen.modelo.dto.DitFormaContactoDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.DitPersonafContactoDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.DitPersonafDomFiscalDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.DitPersonamContactoDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.DitPersonamDomFiscalDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.NdtColegioDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.NdtContadorPublicoAutDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.NdtCpaEstatusDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.NdtCpaTramiteDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.NdtDespachosDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.NdtR1DatosPersonalesDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.NdtR1FormacontactoDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.NdtR2DespachoDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.NdtR2FormacontactoDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.NdtR3ColegioDTO;
import mx.gob.imss.distss.dictamen.modelo.entidad.NdtColegio;
import mx.gob.imss.distss.dictamen.modelo.entidad.NdtContadorPublicoAut;
import mx.gob.imss.distss.dictamen.modelo.entidad.NdtDespachos;
import mx.gob.imss.distss.dictamen.modelo.entidad.NdtR1Formacontacto;
import mx.gob.imss.distss.dictamen.modelo.entidad.NdtR2Formacontacto;
import mx.gob.imss.distss.dictamen.service.interfaces.BdtuServiceRemote;
import mx.gob.imss.distss.dictamen.service.interfaces.NotariaServiceLocal;
import mx.gob.imss.distss.dictamen.service.interfaces.v2.ColegioServiceRemoteV2;
import mx.gob.imss.distss.dictamen.service.interfaces.v2.ContadorPublicoServiceLocalV2;
import mx.gob.imss.distss.dictamen.service.interfaces.v2.ContadorPublicoServiceRemoteV2;
import mx.gob.imss.distss.dictamen.service.interfaces.v2.DespachoServiceRemoteV2;
import mx.gob.imss.distss.dictamen.service.interfaces.v2.ReporteServiceRemote;
import mx.gob.imss.distss.dictamen.service.util.ServiceMapper;
import mx.gob.imss.distss.dictamen.util.ConstantesDictamen;
import mx.gob.imss.distss.dictamen.util.UtileriaFechas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

@Stateless(name = "contadorPublicoServiceBusinessV2", mappedName = "contadorPublicoServiceBusinessV2")
public class ContadorPublicoServiceBusinessV2 implements ContadorPublicoServiceRemoteV2 {
	
	private static final Logger logger = LoggerFactory.getLogger(ContadorPublicoServiceBusinessV2.class);
	
	/**
     * Servicio para los Contadores Publicos
     */
	@EJB
    ContadorPublicoServiceLocalV2 contadorPublicoServiceLocalV2;
	
	/**
     * Servicio para los Despachos
     */
	@EJB
    DespachoServiceRemoteV2 despachoServiceRemoteV2;
	
	/**
     * Servicio para los Despachos
     */
	@EJB
    ColegioServiceRemoteV2 colegioServiceRemoteV2;
	
	/**
     * Servicio para los BDTU
     */
	@EJB
    BdtuServiceRemote bdtuServiceRemote;
	
	/**
     * Servicio para Notia Electronica
     */
	@EJB
	NotariaServiceLocal notariaServiceLocal;
	
	/**
     * Servicio para reportes de dictamen
     */
	@EJB
	ReporteServiceRemote reporteServiceRemote;
	
	@Override
    public NdtContadorPublicoAutDTO obtenerContadorPorIdPersona(Long idPersona) throws RuntimeException {
    	NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO = null;
    	try {
    		NdtContadorPublicoAut ndtContadorPublicoAut = contadorPublicoServiceLocalV2.obtenerContadorPorIdPersona(idPersona);
    		
            if (ndtContadorPublicoAut != null) {
            	ndtContadorPublicoAutDTO = ServiceMapper.map(ndtContadorPublicoAut, NdtContadorPublicoAutDTO.class);
            	
            	ndtContadorPublicoAutDTO = obtenerElementoActualR1DatosPersonales(ndtContadorPublicoAutDTO);
            	ndtContadorPublicoAutDTO = obtenerElementoActualR2Despachos(ndtContadorPublicoAutDTO);
            	ndtContadorPublicoAutDTO = obtenerElementoActualR3Colegio(ndtContadorPublicoAutDTO);
            	ndtContadorPublicoAutDTO = obtenerElementoActualCpaTramite(ndtContadorPublicoAutDTO);
            	ndtContadorPublicoAutDTO = obtenerElementoActualCpaEstatus(ndtContadorPublicoAutDTO);
            }
		} catch (Exception ex) {
			logger.info("ERROR: En el servicio ContadorPublicoServiceBusinessV2 al obtener el registro actual de un contador publico autorizado.", ex);
			throw new RuntimeException("ERROR: En el servicio ContadorPublicoServiceBusinessV2 al obtener el registro actual de un contador publico autorizado.", ex);
		}
        return ndtContadorPublicoAutDTO;
    }
	
	@Override
    public NdtContadorPublicoAutDTO obtenerContadorCompletoPorIdPersona(Long idPersona) throws RuntimeException {
    	NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO = null;
    	NdtContadorPublicoAut ndtContadorPublicoAut = null;
    	try {
    		ndtContadorPublicoAut = contadorPublicoServiceLocalV2.obtenerContadorPorIdPersona(idPersona);
            if (ndtContadorPublicoAut != null) {
            	
            	ndtContadorPublicoAutDTO = ServiceMapper.map(ndtContadorPublicoAut, NdtContadorPublicoAutDTO.class);
            	
            	ndtContadorPublicoAutDTO = obtenerElementoActualR1DatosPersonales(ndtContadorPublicoAutDTO);
            	ndtContadorPublicoAutDTO = obtenerElementoActualR2Despachos(ndtContadorPublicoAutDTO);
            	ndtContadorPublicoAutDTO = obtenerElementoActualR3Colegio(ndtContadorPublicoAutDTO);
            	ndtContadorPublicoAutDTO = obtenerElementoActualCpaTramite(ndtContadorPublicoAutDTO);
            	ndtContadorPublicoAutDTO = obtenerElementoActualCpaEstatus(ndtContadorPublicoAutDTO);
            	
            	DitPersonafDomFiscalDTO ditPersonafDomFiscalDTO =  bdtuServiceRemote.obtenerPersonaFDomFiscalPorId(ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).getCveIdPfdomFiscal());
            	ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).setCveIdDomicilio(ditPersonafDomFiscalDTO.getDitDomicilioSat().getCveIdDomicilio());
            	
            	for (NdtR1FormacontactoDTO ndtR1FormacontactoDTO : ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).getListNdtR1Formacontactos()) {
    				DitPersonafContactoDTO ditPersonafContactoDTO = bdtuServiceRemote.obtenerPersonafContactoPorId(ndtR1FormacontactoDTO.getCveIdPersonafContacto());
    				if (ditPersonafContactoDTO != null) {
    					DitFormaContactoDTO ditFormaContactoDTO = bdtuServiceRemote.obtenerFormaContactoPorId(ditPersonafContactoDTO.getCveIdFormaContacto());
    					if (ditFormaContactoDTO != null) {
    						if (ditFormaContactoDTO.getCveIdTipoContacto().equals(ConstantesDictamen.ID_MEDIO_CONTACTO_EMAIL)) {
    							ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).setCorreoElectronico(ditFormaContactoDTO.getDesFormaContacto());
    						} else if (ditFormaContactoDTO.getCveIdTipoContacto().equals(ConstantesDictamen.ID_MEDIO_CONTACTO_TEL_FIJO)) {
    							ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).setTelefonoFijo(ditFormaContactoDTO.getDesFormaContacto().replace("|", "").trim());
    						}
    					}
    				}
    			}
    			
    			NdtDespachosDTO ndtDespachosDTO = despachoServiceRemoteV2.obtenerDespachoPorId(ndtContadorPublicoAut.getListNdtR2Despachos().get(0).getNdtDespacho().getCveIdDespacho());
    			ndtContadorPublicoAutDTO.setNdtDespachosDTO(ndtDespachosDTO);
    			
    			Moral personaMoralDespacho = bdtuServiceRemote.buscaPersonaMoralPorId(ndtDespachosDTO.getCveIdPersonaMoral());
    			
    			ndtContadorPublicoAutDTO.getNdtDespachosDTO().setCveIdPersonaMoral(personaMoralDespacho.getCveMoral());
    			ndtContadorPublicoAutDTO.getNdtDespachosDTO().setRazonSocial(personaMoralDespacho.getRazonSocial());
    			ndtContadorPublicoAutDTO.getNdtDespachosDTO().setRfc(personaMoralDespacho.getRfc());
    			
    			for (NdtR2FormacontactoDTO ndtR2FormacontactoDTO : ndtContadorPublicoAutDTO.getListNdtR2Despachos().get(0).getListNdtR2Formacontactos()) {
    				DitPersonamContactoDTO ditPersonamContactoDTO = bdtuServiceRemote.obtenerPersonamContactoPorId(ndtR2FormacontactoDTO.getCveIdPersonamContacto());
    				if (ditPersonamContactoDTO != null) {
    					DitFormaContactoDTO ditFormaContactoDTO = bdtuServiceRemote.obtenerFormaContactoPorId(ditPersonamContactoDTO.getCveIdFormaContacto());
    					if (ditFormaContactoDTO != null) {
    						if (ditFormaContactoDTO.getCveIdTipoContacto().equals(ConstantesDictamen.ID_MEDIO_CONTACTO_TEL_FIJO)) {
    							ndtContadorPublicoAutDTO.getListNdtR2Despachos().get(0).setTelefonoFijo(ditFormaContactoDTO.getDesFormaContacto().replace("|", "").trim());
    						}
    					}
    				}
    			}
    			
    			NdtColegioDTO ndtColegioDTO = colegioServiceRemoteV2.obtenerColegioPorId(ndtContadorPublicoAut.getListNdtR3Colegios().get(0).getNdtColegio().getCveIdColegio());
    			ndtContadorPublicoAutDTO.setNdtColegioDTO(ndtColegioDTO);
    			
    			Moral personaMoralColegio = bdtuServiceRemote.buscaPersonaMoralPorId(ndtColegioDTO.getCveIdPersonaMoral());
    			
    			ndtContadorPublicoAutDTO.getNdtColegioDTO().setCveIdPersonaMoral(personaMoralColegio.getCveMoral());
    			ndtContadorPublicoAutDTO.getNdtColegioDTO().setRazonSocial(personaMoralColegio.getRazonSocial());
    			ndtContadorPublicoAutDTO.getNdtColegioDTO().setRfc(personaMoralColegio.getRfc());
            	
            }
		} catch (Exception ex) {
			logger.info("ERROR: En el servicio ContadorPublicoServiceBusiness al obtener un contador publico autorizado con complementos.", ex);
			throw new RuntimeException("ERROR: En el servicio ContadorPublicoServiceBusiness al obtener un contador publico autorizado con complementos.", ex);
		}
        return ndtContadorPublicoAutDTO;
    }
	
	private NdtContadorPublicoAutDTO obtenerElementoActualR1DatosPersonales(NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO) throws RuntimeException {
		try {
			if (ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales() != null && !ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().isEmpty()) {
        		for (NdtR1DatosPersonalesDTO ndtR1DatosPersonalesDTO : ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales()) {
					if (ndtR1DatosPersonalesDTO.getFecRegistroBaja() == null) {
						List<NdtR1DatosPersonalesDTO> listNdtR1DatosPersonalesDTOs = new ArrayList<NdtR1DatosPersonalesDTO>();
						listNdtR1DatosPersonalesDTOs.add(ndtR1DatosPersonalesDTO);
						ndtContadorPublicoAutDTO.setListNdtR1DatosPersonales(listNdtR1DatosPersonalesDTOs);
						break;
					}
				}
			}
        	
        	if (ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales() != null && !ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().isEmpty()) {
        		List<NdtR1FormacontactoDTO> listNdtR1FormacontactoDTOs = new ArrayList<NdtR1FormacontactoDTO>();
    			for (NdtR1FormacontactoDTO ndtR1FormacontactoDTO : ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).getListNdtR1Formacontactos()) {
					if (ndtR1FormacontactoDTO.getFecRegistroBaja() == null) {
						listNdtR1FormacontactoDTOs.add(ndtR1FormacontactoDTO);
					}
				}
    			ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).setListNdtR1Formacontactos(listNdtR1FormacontactoDTOs);
			}
		} catch (Exception ex) {
			logger.info("ERROR: En el servicio ContadorPublicoServiceBusinessV2 al obtener el elemento actual de los datos personales.", ex);
			throw new RuntimeException("ERROR: En el servicio ContadorPublicoServiceBusinessV2 al obtener el elemento actual de los datos personales.", ex);
		}
		return ndtContadorPublicoAutDTO;
	}
	
	private NdtContadorPublicoAutDTO obtenerElementoActualR2Despachos(NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO) throws RuntimeException {
		try {
			if (ndtContadorPublicoAutDTO.getListNdtR2Despachos() != null && !ndtContadorPublicoAutDTO.getListNdtR2Despachos().isEmpty()) {
        		for (NdtR2DespachoDTO ndtR2DespachoDTO : ndtContadorPublicoAutDTO.getListNdtR2Despachos()) {
					if (ndtR2DespachoDTO.getFecRegistroBaja() == null) {
						List<NdtR2DespachoDTO> listNdtR2DespachoDTOs = new ArrayList<NdtR2DespachoDTO>();
						listNdtR2DespachoDTOs.add(ndtR2DespachoDTO);
						ndtContadorPublicoAutDTO.setListNdtR2Despachos(listNdtR2DespachoDTOs);
						break;
					}
				}
			}
        	
        	if (ndtContadorPublicoAutDTO.getListNdtR2Despachos() != null && !ndtContadorPublicoAutDTO.getListNdtR2Despachos().isEmpty()) {
        		List<NdtR2FormacontactoDTO> listNdtR2FormacontactoDTOs = new ArrayList<NdtR2FormacontactoDTO>();
    			for (NdtR2FormacontactoDTO ndtR2FormacontactoDTO : ndtContadorPublicoAutDTO.getListNdtR2Despachos().get(0).getListNdtR2Formacontactos()) {
					if (ndtR2FormacontactoDTO.getFecRegistroBaja() == null) {
						listNdtR2FormacontactoDTOs.add(ndtR2FormacontactoDTO);
					}
				}
    			ndtContadorPublicoAutDTO.getListNdtR2Despachos().get(0).setListNdtR2Formacontactos(listNdtR2FormacontactoDTOs);
			}
		} catch (Exception ex) {
			logger.info("ERROR: En el servicio ContadorPublicoServiceBusinessV2 al obtener el elemento actual de los datos de despacho.", ex);
			throw new RuntimeException("ERROR: En el servicio ContadorPublicoServiceBusinessV2 al obtener el elemento actual de los datos de despacho.", ex);
		}
		return ndtContadorPublicoAutDTO;
	}
	
	private NdtContadorPublicoAutDTO obtenerElementoActualR3Colegio(NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO) throws RuntimeException {
		try {
			if (ndtContadorPublicoAutDTO.getListNdtR3Colegios() != null && !ndtContadorPublicoAutDTO.getListNdtR3Colegios().isEmpty()) {
        		for (NdtR3ColegioDTO ndtR3ColegioDTO : ndtContadorPublicoAutDTO.getListNdtR3Colegios()) {
					if (ndtR3ColegioDTO.getFecRegistroBaja() == null) {
						List<NdtR3ColegioDTO> listNdtR3ColegioDTOs = new ArrayList<NdtR3ColegioDTO>();
						listNdtR3ColegioDTOs.add(ndtR3ColegioDTO);
						ndtContadorPublicoAutDTO.setListNdtR3Colegios(listNdtR3ColegioDTOs);
						break;
					}
				}
			}
		} catch (Exception ex) {
			logger.info("ERROR: En el servicio ContadorPublicoServiceBusinessV2 al obtener el elemento actual de los datos del colegio.", ex);
			throw new RuntimeException("ERROR: En el servicio ContadorPublicoServiceBusinessV2 al obtener el elemento actual de los datos del colegio.", ex);
		}
		return ndtContadorPublicoAutDTO;
	}
	
	private NdtContadorPublicoAutDTO obtenerElementoActualCpaTramite(NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO) throws RuntimeException {
		try {
			if (ndtContadorPublicoAutDTO.getListNdtCpaTramites() != null && !ndtContadorPublicoAutDTO.getListNdtCpaTramites().isEmpty()) {
        		for (NdtCpaTramiteDTO ndtCpaTramiteDTO : ndtContadorPublicoAutDTO.getListNdtCpaTramites()) {
					if (ndtCpaTramiteDTO.getFecRegistroBaja() == null) {
						List<NdtCpaTramiteDTO> listNdtCpaTramiteDTOs = new ArrayList<NdtCpaTramiteDTO>();
						listNdtCpaTramiteDTOs.add(ndtCpaTramiteDTO);
						ndtContadorPublicoAutDTO.setListNdtCpaTramites(listNdtCpaTramiteDTOs);
						break;
					}
				}
			}
		} catch (Exception ex) {
			logger.info("ERROR: En el servicio ContadorPublicoServiceBusinessV2 al obtener el elemento actual de los datos del tramite del cpa.", ex);
			throw new RuntimeException("ERROR: En el servicio ContadorPublicoServiceBusinessV2 al obtener el elemento actual de los datos del colegio.", ex);
		}
		return ndtContadorPublicoAutDTO;
	}
	
	private NdtContadorPublicoAutDTO obtenerElementoActualCpaEstatus(NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO) throws RuntimeException {
		try {
			if (ndtContadorPublicoAutDTO.getListNdtCpaEstatus() != null && !ndtContadorPublicoAutDTO.getListNdtCpaEstatus().isEmpty()) {
        		for (NdtCpaEstatusDTO ndtCpaEstatusDTO : ndtContadorPublicoAutDTO.getListNdtCpaEstatus()) {
					if (ndtCpaEstatusDTO.getFecRegistroBaja() == null) {
						List<NdtCpaEstatusDTO> listNdtCpaEstatusDTOs = new ArrayList<NdtCpaEstatusDTO>();
						listNdtCpaEstatusDTOs.add(ndtCpaEstatusDTO);
						ndtContadorPublicoAutDTO.setListNdtCpaEstatus(listNdtCpaEstatusDTOs);
						break;
					}
				}
			}
		} catch (Exception ex) {
			logger.info("ERROR: En el servicio ContadorPublicoServiceBusinessV2 al obtener el elemento actual de los datos del estatus del cpa.", ex);
			throw new RuntimeException("ERROR: En el servicio ContadorPublicoServiceBusinessV2 al obtener el elemento actual de los datos del estatus del cpa.", ex);
		}
		return ndtContadorPublicoAutDTO;
	}

	@Override
	@Transactional
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public NdtContadorPublicoAutDTO registroContadorPublicoAutorizado(NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO) throws RuntimeException {
		Solicitud solicitud = null;
		NdtDespachos ndtDespachos = null;
		NdtColegio ndtColegio = null;
		Moral personaMoral = null;
		try {
			// Se complementa el Objeto NdtContadorPublicoAutDTO
			ndtContadorPublicoAutDTO.setCveIdPersona(ndtContadorPublicoAutDTO.getUsuarioSesion().getIdPersona());
			ndtContadorPublicoAutDTO.setCveIdUsuario(ndtContadorPublicoAutDTO.getUsuarioSesion().getCurp());
			
			if (ndtContadorPublicoAutDTO.getFecRegistroAlta() == null) {
				ndtContadorPublicoAutDTO.setFecRegistroAlta(new Date());
				ndtContadorPublicoAutDTO.getNdcEstadoCpa().setCveIdEstadoCpa(ConstantesEstadosCPA.SOLICITADO);
			}
			
			// Se complementa el Objeto ListNdtR1DatosPersonales de NdtContadorPublicoAutDTO
			ndtContadorPublicoAutDTO = setComplementosR1DatosPersonales(ndtContadorPublicoAutDTO);
			
			// Se complementa el Objeto ListNdtR2Despachos de NdtContadorPublicoAutDTO
			ndtContadorPublicoAutDTO = setComplementosR2Despachos(ndtContadorPublicoAutDTO);
			
			// Se complementa el Objeto ListNdtR3Colegios de NdtContadorPublicoAutDTO
			ndtContadorPublicoAutDTO = setComplementosR3Colegio(ndtContadorPublicoAutDTO);
			
			// Se complementa el Objeto ListNdtCpaEstatus de NdtContadorPublicoAutDTO
			if (ndtContadorPublicoAutDTO.getListNdtCpaEstatus() == null || ndtContadorPublicoAutDTO.getListNdtCpaEstatus().isEmpty()) {
				NdtCpaEstatusDTO ndtCpaEstatusDTO = new NdtCpaEstatusDTO();
				ndtCpaEstatusDTO.setCveIdUsuario(ndtContadorPublicoAutDTO.getCveIdUsuario());
				ndtCpaEstatusDTO.setNdcEstadoCpa(ndtContadorPublicoAutDTO.getNdcEstadoCpa());
				ndtCpaEstatusDTO.setFecRegistroAlta(new Date());
				List<NdtCpaEstatusDTO> listCpaEstatusDTOs = new ArrayList<NdtCpaEstatusDTO>();
				listCpaEstatusDTOs.add(ndtCpaEstatusDTO);
				ndtContadorPublicoAutDTO.setListNdtCpaEstatus(listCpaEstatusDTOs);
			}
			
			// Se genera cadena original del acuse de registro del contador publico
			ndtContadorPublicoAutDTO.setCadenaOriginal(generaCadenaOriginalSolicitudRegistro(ndtContadorPublicoAutDTO));
			
			// Se obtiene el tramite de notaria con la cadena original y el recibo de notaria del resultado de la firma digital
			RespuestaFirmadoSimple tramite = notariaServiceLocal.getSelloDigital(ndtContadorPublicoAutDTO.getCadenaOriginal(), 
					ndtContadorPublicoAutDTO.getListNdtCpaTramites().get(0).getReciboNotaria(), null);
			
			ndtContadorPublicoAutDTO.getListNdtCpaTramites().get(0).setNumTramiteNotaria(tramite.getTramite());
			ndtContadorPublicoAutDTO.getListNdtCpaTramites().get(0).setSelloDigitalImss(tramite.getSello());
			
			// Se genera la solicitud de tramite en la bdtu
			solicitud = bdtuServiceRemote.generarSolicitudTramiteBdtu(ndtContadorPublicoAutDTO.getUsuarioSesion());
			
			// Se llena NdtCpaTramites
			if (ndtContadorPublicoAutDTO.getListNdtCpaTramites().get(0).getCveIdCpaTramite() == null) {
				NdtCpaTramiteDTO ndtCpaTramiteDTO = new NdtCpaTramiteDTO();
				ndtCpaTramiteDTO.setCveIdUsuario(ndtContadorPublicoAutDTO.getCveIdUsuario());
				ndtCpaTramiteDTO.setFecRegistroAlta(new Date());
				ndtCpaTramiteDTO.setCveIdTramite(solicitud.getTramites().get(0).getTramiteId());
				ndtCpaTramiteDTO.setFecSolicitudMovimiento(solicitud.getFechaSolicitud());
				ndtCpaTramiteDTO.setUrlAcuseNotaria(ndtContadorPublicoAutDTO.getListNdtCpaTramites().get(0).getUrlAcuseNotaria());
				ndtCpaTramiteDTO.setNumTramiteNotaria(ndtContadorPublicoAutDTO.getListNdtCpaTramites().get(0).getNumTramiteNotaria());
				ndtCpaTramiteDTO.setReciboNotaria(ndtContadorPublicoAutDTO.getListNdtCpaTramites().get(0).getReciboNotaria());
				List<NdtCpaTramiteDTO> listNdtCpaTramiteDTOs = new ArrayList<NdtCpaTramiteDTO>();
				listNdtCpaTramiteDTOs.add(ndtCpaTramiteDTO);
				ndtContadorPublicoAutDTO.setListNdtCpaTramites(listNdtCpaTramiteDTOs);
			}
			
			// Se generan los parametros para el registro de contador publico
			Map<String,Object> iReportParameter = reporteServiceRemote.generaParametrosRegistroContador(ndtContadorPublicoAutDTO);
			
			// Se genera el acuse del registro de contador publico con el sello digital y cadena original y se envia a notaria electronica
			reporteServiceRemote.generarReportePDF(iReportParameter, ConstantesDictamen.TIPO_REPORTE_SOLICITUD_REGISTRO_CONTADOR);
			
			// Se Mapean valores a la entidad NdtContadorPublicoAut
			NdtContadorPublicoAut ndtContadorPublicoAut = new NdtContadorPublicoAut();
			ndtContadorPublicoAut = ServiceMapper.map(ndtContadorPublicoAutDTO, NdtContadorPublicoAut.class);
			
			if (ndtContadorPublicoAutDTO.getNdtDespachosDTO() != null) {
				ndtDespachos = ServiceMapper.map(ndtContadorPublicoAutDTO.getNdtDespachosDTO(), NdtDespachos.class);
			}
			
			if (ndtContadorPublicoAutDTO.getNdtColegioDTO() != null) {
				ndtColegio = ServiceMapper.map(ndtContadorPublicoAutDTO.getNdtColegioDTO(), NdtColegio.class);
			}
			
			ndtContadorPublicoAut.getListNdtCpaTramites().get(0).setNdtContadorPublicoAut(ndtContadorPublicoAut);
			ndtContadorPublicoAut.getListNdtCpaTramites().get(0).setListNdtR1DatosPersonales(ndtContadorPublicoAut.getListNdtR1DatosPersonales());
			ndtContadorPublicoAut.getListNdtCpaTramites().get(0).setListNdtR2Despachos(ndtContadorPublicoAut.getListNdtR2Despachos());
			ndtContadorPublicoAut.getListNdtCpaTramites().get(0).setListNdtR3Colegios(ndtContadorPublicoAut.getListNdtR3Colegios());
			ndtContadorPublicoAut.getListNdtCpaTramites().get(0).setListNdtCpaEstatus(ndtContadorPublicoAut.getListNdtCpaEstatus());
			
			if (ndtContadorPublicoAut.getListNdtR1DatosPersonales() != null && !ndtContadorPublicoAut.getListNdtR1DatosPersonales().isEmpty()) {
//				if (ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).isExistenCambiosR1()) {
//					ndtContadorPublicoAut.getListNdtR1DatosPersonales().get(0).setNdtCpaTramite(ndtContadorPublicoAut.getListNdtCpaTramites().get(0));
//				}
				ndtContadorPublicoAut.getListNdtR1DatosPersonales().get(0).setNdtCpaTramite(ndtContadorPublicoAut.getListNdtCpaTramites().get(0));
				ndtContadorPublicoAut.getListNdtR1DatosPersonales().get(0).setNdtContadorPublicoAut(ndtContadorPublicoAut);
				
				List<NdtR1Formacontacto> listNdtR1Formacontactos = new ArrayList<NdtR1Formacontacto>();
				for (NdtR1Formacontacto ndtR1Formacontacto : ndtContadorPublicoAut.getListNdtR1DatosPersonales().get(0).getListNdtR1Formacontactos()) {
					ndtR1Formacontacto.setNdtR1DatosPersonales(ndtContadorPublicoAut.getListNdtR1DatosPersonales().get(0));
					listNdtR1Formacontactos.add(ndtR1Formacontacto);
				}
				ndtContadorPublicoAut.getListNdtR1DatosPersonales().get(0).setListNdtR1Formacontactos(listNdtR1Formacontactos);
			}
			
			if (ndtContadorPublicoAut.getListNdtR2Despachos() != null && !ndtContadorPublicoAut.getListNdtR2Despachos().isEmpty()) {
//				if (ndtContadorPublicoAutDTO.getListNdtR2Despachos().get(0).isExistenCambiosR2()) {
//					ndtContadorPublicoAut.getListNdtR2Despachos().get(0).setNdtCpaTramite(ndtContadorPublicoAut.getListNdtCpaTramites().get(0));
//				}
				ndtContadorPublicoAut.getListNdtR2Despachos().get(0).setNdtCpaTramite(ndtContadorPublicoAut.getListNdtCpaTramites().get(0));
				ndtContadorPublicoAut.getListNdtR2Despachos().get(0).setNdtDespacho(ndtDespachos);
				ndtContadorPublicoAut.getListNdtR2Despachos().get(0).setNdtContadorPublicoAut(ndtContadorPublicoAut);
				
				List<NdtR2Formacontacto> listNdtR2Formacontactos = new ArrayList<NdtR2Formacontacto>();
				for (NdtR2Formacontacto ndtR2Formacontacto : ndtContadorPublicoAut.getListNdtR2Despachos().get(0).getListNdtR2Formacontactos()) {
					ndtR2Formacontacto.setNdtR2Despacho(ndtContadorPublicoAut.getListNdtR2Despachos().get(0));
					listNdtR2Formacontactos.add(ndtR2Formacontacto);
				}
				ndtContadorPublicoAut.getListNdtR2Despachos().get(0).setListNdtR2Formacontactos(listNdtR2Formacontactos);
			}
			
			if (ndtContadorPublicoAut.getListNdtR3Colegios() != null && !ndtContadorPublicoAut.getListNdtR3Colegios().isEmpty()) {
//				if (ndtContadorPublicoAutDTO.getListNdtR3Colegios().get(0).isExistenCambiosR3()) {
//					ndtContadorPublicoAut.getListNdtR3Colegios().get(0).setNdtCpaTramite(ndtContadorPublicoAut.getListNdtCpaTramites().get(0));
//				}
				ndtContadorPublicoAut.getListNdtR3Colegios().get(0).setNdtCpaTramite(ndtContadorPublicoAut.getListNdtCpaTramites().get(0));
				ndtContadorPublicoAut.getListNdtR3Colegios().get(0).setNdtColegio(ndtColegio);
				ndtContadorPublicoAut.getListNdtR3Colegios().get(0).setNdtContadorPublicoAut(ndtContadorPublicoAut);
			}
			
			if (ndtContadorPublicoAut.getListNdtCpaEstatus() != null && !ndtContadorPublicoAut.getListNdtCpaEstatus().isEmpty()) {
				ndtContadorPublicoAut.getListNdtCpaEstatus().get(0).setNdtCpaTramite(ndtContadorPublicoAut.getListNdtCpaTramites().get(0));
				ndtContadorPublicoAut.getListNdtCpaEstatus().get(0).setNdtContadorPublicoAut(ndtContadorPublicoAut);
			}
			
			contadorPublicoServiceLocalV2.saveOrUpdate(ndtContadorPublicoAut);
			
			ndtContadorPublicoAutDTO = ServiceMapper.map(ndtContadorPublicoAut, NdtContadorPublicoAutDTO.class);
			
			ndtContadorPublicoAutDTO = obtenerContadorCompletoPorIdPersona(ndtContadorPublicoAutDTO.getCveIdPersona());
			
			personaMoral = bdtuServiceRemote.buscaPersonaMoralPorId(ndtContadorPublicoAutDTO.getNdtDespachosDTO().getCveIdPersonaMoral());
			ndtContadorPublicoAutDTO.getNdtDespachosDTO().setRazonSocial(personaMoral.getRazonSocial());
		} catch (Exception ex) {
			logger.info("ERROR: En el servicio ContadorPublicoServiceBusinessV2 al registrar un Contador Publico Autorizado.", ex);
			throw new RuntimeException("ERROR: En el servicio ContadorPublicoServiceBusinessV2 al registrar un Contador Publico Autorizado.", ex);
		}
		return ndtContadorPublicoAutDTO;
	}
	
	private NdtContadorPublicoAutDTO setComplementosR1DatosPersonales(NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO) throws RuntimeException {
		DitPersonafDomFiscalDTO ditPersonafDomFiscalDTO = null;
		List<MedioContacto> listMedioContactosPersona = new ArrayList<MedioContacto>();
		List<NdtR1FormacontactoDTO> listNdtR1FormacontactoDTOs = null;
		try {
			if (ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).isExistenCambiosR1()) {
				
				ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).setCveIdUsuario(ndtContadorPublicoAutDTO.getCveIdUsuario());
				ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).setFecRegistroAlta(new Date());
				
				if (ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).getCveIdDomicilio() != null) {
					ditPersonafDomFiscalDTO = bdtuServiceRemote.obtenerPersonaFDomFiscalPorIdDom(ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).getCveIdDomicilio());
					ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).setCveIdPfdomFiscal(ditPersonafDomFiscalDTO.getCveIdPfdomFiscal());
				}
				
				// CorreoElectronico de Medios de Contacto
				if (ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).isExistenCambiosCorreo() && 
						ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).getListNdtR1Formacontactos().isEmpty()) {
					CorreoElectronico correoElectronico = new CorreoElectronico();
					correoElectronico.setCorreo(ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).getCorreoElectronico());
					listMedioContactosPersona.add(correoElectronico);
				} else {
					DitFormaContactoDTO ditFormaContactoDTOCorreo = null;
					for (NdtR1FormacontactoDTO ndtR1FormacontactoDTO : ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).getListNdtR1Formacontactos()) {
	    				DitPersonafContactoDTO ditPersonafContactoDTO = bdtuServiceRemote.obtenerPersonafContactoPorId(ndtR1FormacontactoDTO.getCveIdPersonafContacto());
	    				if (ditPersonafContactoDTO != null) {
	    					ditFormaContactoDTOCorreo = bdtuServiceRemote.obtenerFormaContactoPorId(ditPersonafContactoDTO.getCveIdFormaContacto());
	    					if (ditFormaContactoDTOCorreo != null) {
	    						if (ditFormaContactoDTOCorreo.getCveIdTipoContacto().equals(ConstantesDictamen.ID_MEDIO_CONTACTO_EMAIL)) {
	    							ditFormaContactoDTOCorreo.setDesFormaContacto(ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).getCorreoElectronico());
	    							
	    						}
	    					}
	    				}
	    			}
					bdtuServiceRemote.actualizaMedioContacto(ditFormaContactoDTOCorreo);
				}
				
				// TelefonoFijo de Medios de Contacto
				if (ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).isExistenCambiosTelefono() && 
						ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).getListNdtR1Formacontactos().isEmpty()) {
					TelefonoFijo telefonoFijo = new TelefonoFijo();
					telefonoFijo.setClaveLada(ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).getTelefonoFijo().substring(0, 2));
					telefonoFijo.setNumero(ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).getTelefonoFijo().substring(2));
					listMedioContactosPersona.add(telefonoFijo);
				} else {
					DitFormaContactoDTO ditFormaContactoDTOTelefono = null;
					for (NdtR1FormacontactoDTO ndtR1FormacontactoDTO : ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).getListNdtR1Formacontactos()) {
	    				DitPersonafContactoDTO ditPersonafContactoDTO = bdtuServiceRemote.obtenerPersonafContactoPorId(ndtR1FormacontactoDTO.getCveIdPersonafContacto());
	    				if (ditPersonafContactoDTO != null) {
	    					ditFormaContactoDTOTelefono = bdtuServiceRemote.obtenerFormaContactoPorId(ditPersonafContactoDTO.getCveIdFormaContacto());
	    					if (ditFormaContactoDTOTelefono != null) {
	    						if (ditFormaContactoDTOTelefono.getCveIdTipoContacto().equals(ConstantesDictamen.ID_MEDIO_CONTACTO_TEL_FIJO)) {
	    							ditFormaContactoDTOTelefono.setDesFormaContacto(ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).getTelefonoFijo());
	    							
	    						}
	    					}
	    				}
	    			}
					bdtuServiceRemote.actualizaMedioContacto(ditFormaContactoDTOTelefono);
				}
				
				// Persistencia de los Medios de Contacto y Recuperacion de los complementos de los Medios de Contacto
				if (listMedioContactosPersona != null && !listMedioContactosPersona.isEmpty()) {
					Fisica personaFisicaMedios = new Fisica();
					personaFisicaMedios.setIdPersona(ndtContadorPublicoAutDTO.getCveIdPersona());
					personaFisicaMedios.setMediosContacto(listMedioContactosPersona);
					
					// Persistencia de Medios de Contacto
					bdtuServiceRemote.guardarYAsociarMediosContactoPersona(personaFisicaMedios);
					
					Fisica fisica = new Fisica();
					fisica.setIdPersona(ndtContadorPublicoAutDTO.getCveIdPersona());
					TipoPersona tipoPersona = new TipoPersona();
					tipoPersona.setIdTipoPersona(TipoPersonaEnum.FISICA.getId());
					fisica.setTipoPersona(tipoPersona);
					
					// Consulta ordenada por clave de los Medios de Contacto
					List<MedioContacto> listMedioContactosContador = bdtuServiceRemote.consultarMedioDeContactoPersona(fisica);
					
					MedioContacto medioContacto1 = listMedioContactosContador.get(listMedioContactosContador.size() - 1);
					MedioContacto medioContacto2 = listMedioContactosContador.get(listMedioContactosContador.size() - 2);
					
					DitFormaContactoDTO ditFormaContactoDTO1 = new DitFormaContactoDTO();
					ditFormaContactoDTO1.setCveIdFormaContacto(medioContacto1.getClave());
					
					DitPersonafContactoDTO ditPersonafContactoDTO1 = bdtuServiceRemote.obtenerPersonafContacto(ditFormaContactoDTO1);
					
					NdtR1FormacontactoDTO ndtR1FormacontactoDTO1 = new NdtR1FormacontactoDTO();
					ndtR1FormacontactoDTO1.setCveIdPersonafContacto(ditPersonafContactoDTO1.getCveIdPersonafContacto());
					ndtR1FormacontactoDTO1.setCveIdUsuario(ndtContadorPublicoAutDTO.getCveIdUsuario());
					ndtR1FormacontactoDTO1.setFecRegistroAlta(new Date());
					
					DitFormaContactoDTO ditFormaContactoDTO2 = new DitFormaContactoDTO();
					ditFormaContactoDTO2.setCveIdFormaContacto(medioContacto2.getClave());
					
					DitPersonafContactoDTO ditPersonafContactoDTO2 = bdtuServiceRemote.obtenerPersonafContacto(ditFormaContactoDTO2);
					
					NdtR1FormacontactoDTO ndtR1FormacontactoDTO2 = new NdtR1FormacontactoDTO();
					ndtR1FormacontactoDTO2.setCveIdPersonafContacto(ditPersonafContactoDTO2.getCveIdPersonafContacto());
					ndtR1FormacontactoDTO2.setCveIdUsuario(ndtContadorPublicoAutDTO.getCveIdUsuario());
					ndtR1FormacontactoDTO2.setFecRegistroAlta(new Date());
					
					listNdtR1FormacontactoDTOs = new ArrayList<NdtR1FormacontactoDTO>();
					listNdtR1FormacontactoDTOs.add(ndtR1FormacontactoDTO1);
					listNdtR1FormacontactoDTOs.add(ndtR1FormacontactoDTO2);
					
					ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).setListNdtR1Formacontactos(listNdtR1FormacontactoDTOs);
				}
			}
		} catch (Exception ex) {
			logger.info("ERROR: En el servicio ContadorPublicoServiceBusinessV2 al obtener los complementos de los datos personales de un contador.", ex);
			throw new RuntimeException("ERROR: En el servicio ContadorPublicoServiceBusinessV2 al obtener los complementos de los datos personales de un contador.", ex);
		}
		return ndtContadorPublicoAutDTO;
	}
	
	private NdtContadorPublicoAutDTO setComplementosR2Despachos(NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO) throws RuntimeException {
	NdtDespachosDTO ndtDespachosDTO = null;
	List<MedioContacto> listMedioContactosDespacho = new ArrayList<MedioContacto>();
	List<NdtR2FormacontactoDTO> listndtR2FormacontactoDTOs = null;
		try {
			if (ndtContadorPublicoAutDTO.getListNdtR2Despachos().get(0).isExistenCambiosR2()) {
				// Se llena NdtDespachosDTO
				ndtContadorPublicoAutDTO.getNdtDespachosDTO().setCveIdUsuario(ndtContadorPublicoAutDTO.getCveIdUsuario());
				ndtContadorPublicoAutDTO.getNdtDespachosDTO().setFecRegistroAlta(new Date());
				// Persistencia del despacho en NDT_DESPACHOS
				ndtDespachosDTO = despachoServiceRemoteV2.registroDespacho(ndtContadorPublicoAutDTO.getNdtDespachosDTO());
				ndtContadorPublicoAutDTO.setNdtDespachosDTO(ndtDespachosDTO);
				
				// Se llena listNdtR2Despachos
				ndtContadorPublicoAutDTO.getListNdtR2Despachos().get(0).setCveIdUsuario(ndtContadorPublicoAutDTO.getCveIdUsuario());
				ndtContadorPublicoAutDTO.getListNdtR2Despachos().get(0).setFecRegistroAlta(new Date());
				
				if (ndtContadorPublicoAutDTO.getListNdtR2Despachos().get(0).getCveIdDomicilio() != null) {
					DitPersonamDomFiscalDTO ditPersonamDomFiscalDTO = bdtuServiceRemote.obtenerPersonamDomFiscalPorIdDom(ndtContadorPublicoAutDTO.getListNdtR2Despachos().get(0).getCveIdDomicilio());
					ndtContadorPublicoAutDTO.getListNdtR2Despachos().get(0).setCveIdPmdomFiscal(ditPersonamDomFiscalDTO.getCveIdPmdomFiscal());
				}
				
				// Persistencia de los Medios de Contacto y Recuperacion de los complementos de los Medios de Contacto
				if (ndtContadorPublicoAutDTO.getListNdtR2Despachos().get(0).isExisteCambiosTelefono()) {
					TelefonoFijo telefonoFijoDespacho = new TelefonoFijo();
					telefonoFijoDespacho.setClaveLada(ndtContadorPublicoAutDTO.getListNdtR2Despachos().get(0).getTelefonoFijo().substring(0, 2));
					telefonoFijoDespacho.setNumero(ndtContadorPublicoAutDTO.getListNdtR2Despachos().get(0).getTelefonoFijo().substring(2));
					listMedioContactosDespacho.add(telefonoFijoDespacho);
					
					Moral personaMoralMedios = new Moral();
					personaMoralMedios.setIdPersona(ndtDespachosDTO.getCveIdPersonaMoral());
					personaMoralMedios.setCveMoral(ndtDespachosDTO.getCveIdPersonaMoral());
					personaMoralMedios.setMediosContacto(listMedioContactosDespacho);
					
					// Persistencia de Medios de Contacto
					bdtuServiceRemote.guardarYAsociarMediosContactoPersona(personaMoralMedios);
					
					Moral moral = new Moral();
					moral.setIdPersona(ndtDespachosDTO.getCveIdPersonaMoral());
					TipoPersona tipoPersonaDespacho = new TipoPersona();
					tipoPersonaDespacho.setIdTipoPersona(TipoPersonaEnum.MORAL.getId());
					moral.setTipoPersona(tipoPersonaDespacho);
					
					// Consulta ordenada por clave de los Medios de Contacto
					List<MedioContacto> listMedioDespacho = bdtuServiceRemote.consultarMedioDeContactoPersona(moral);
					
					MedioContacto medioContactoDespacho = listMedioDespacho.get(listMedioDespacho.size() - 1);
					
					DitFormaContactoDTO ditFormaContactoDTODespacho = new DitFormaContactoDTO();
					ditFormaContactoDTODespacho.setCveIdFormaContacto(medioContactoDespacho.getClave());
					
					DitPersonamContactoDTO ditPersonamContactoDTODespacho = bdtuServiceRemote.obtenerPersonamContacto(ditFormaContactoDTODespacho);
					
					NdtR2FormacontactoDTO ndtR2FormacontactoDTO = new NdtR2FormacontactoDTO();
					ndtR2FormacontactoDTO.setCveIdPersonamContacto(ditPersonamContactoDTODespacho.getCveIdPersonamContacto());
					ndtR2FormacontactoDTO.setCveIdUsuario(ndtContadorPublicoAutDTO.getCveIdUsuario());
					ndtR2FormacontactoDTO.setFecRegistroAlta(new Date());
					
					listndtR2FormacontactoDTOs = new ArrayList<NdtR2FormacontactoDTO>();
					listndtR2FormacontactoDTOs.add(ndtR2FormacontactoDTO);
					
					ndtContadorPublicoAutDTO.getListNdtR2Despachos().get(0).setListNdtR2Formacontactos(listndtR2FormacontactoDTOs);
				}
			} else {
				ndtDespachosDTO = new NdtDespachosDTO();
				ndtDespachosDTO.setCveIdDespacho(ndtContadorPublicoAutDTO.getNdtDespachosDTO().getCveIdDespacho());
				ndtContadorPublicoAutDTO.setNdtDespachosDTO(ndtDespachosDTO);
			}
		} catch (Exception ex) {
			logger.info("ERROR: En el servicio ContadorPublicoServiceBusinessV2 al obtener los complementos del despacho de un contador.", ex);
			throw new RuntimeException("ERROR: En el servicio ContadorPublicoServiceBusinessV2 al obtener los complementos del despacho de un contador.", ex);
		}
		return ndtContadorPublicoAutDTO;
	}
	
	private NdtContadorPublicoAutDTO setComplementosR3Colegio(NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO) throws RuntimeException {
		NdtColegioDTO ndtColegioDTO = null;
		try {
			if (ndtContadorPublicoAutDTO.getListNdtR3Colegios().get(0).isExistenCambiosR3()) {
				// Se llena NdtColegioDTO
				ndtContadorPublicoAutDTO.getNdtColegioDTO().setCveIdUsuario(ndtContadorPublicoAutDTO.getCveIdUsuario());
				ndtContadorPublicoAutDTO.getNdtColegioDTO().setFecRegistroAlta(new Date());
				ndtColegioDTO = colegioServiceRemoteV2.registroColegio(ndtContadorPublicoAutDTO.getNdtColegioDTO());
				ndtContadorPublicoAutDTO.setNdtColegioDTO(ndtColegioDTO);
				
				// Se llena listNdtR3Colegios
				ndtContadorPublicoAutDTO.getListNdtR3Colegios().get(0).setCveIdUsuario(ndtContadorPublicoAutDTO.getCveIdUsuario());
				ndtContadorPublicoAutDTO.getListNdtR3Colegios().get(0).setFecRegistroAlta(new Date());
			} else {
				ndtColegioDTO = new NdtColegioDTO();
				ndtColegioDTO.setCveIdColegio(ndtContadorPublicoAutDTO.getNdtColegioDTO().getCveIdColegio());
				ndtContadorPublicoAutDTO.setNdtColegioDTO(ndtColegioDTO);
			}
		} catch (Exception ex) {
			logger.info("ERROR: En el servicio ContadorPublicoServiceBusinessV2 al obtener los complementos del colegio de un contador.", ex);
			throw new RuntimeException("ERROR: En el servicio ContadorPublicoServiceBusinessV2 al obtener los complementos del colegio de un contador.", ex);
		}
		return ndtContadorPublicoAutDTO;
	}
	
	private String generaCadenaOriginalSolicitudRegistro(NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO) throws RuntimeException {
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
			
			if (ndtContadorPublicoAutDTO.getNdtDespachosDTO() != null) {
				cadenaOriginal.append(verificaCampo("|NÚMERO DE CÉDULA PROFESIONAL|", ndtContadorPublicoAutDTO.getNdtDespachosDTO().getRazonSocial()));
			}
			
			if (ndtContadorPublicoAutDTO.getNdtColegioDTO() != null) {
				cadenaOriginal.append(verificaCampo("|NÚMERO DE CÉDULA PROFESIONAL|", ndtContadorPublicoAutDTO.getNdtColegioDTO().getRazonSocial()));
			}
			
			String tipoCurp = "";
			if (ndtContadorPublicoAutDTO.getUsuarioSesion() != null && ndtContadorPublicoAutDTO.getUsuarioSesion().getCurp() != null) {
				tipoCurp = ndtContadorPublicoAutDTO.getUsuarioSesion().getCurp().substring(12, 13);
				if (tipoCurp != "NE") {
					tipoCurp = "Mexicana";
				} else {
					tipoCurp = "Extranjera";
				}
			}
			cadenaOriginal.append(verificaCampo("|NACIONALIDAD|", tipoCurp));
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
