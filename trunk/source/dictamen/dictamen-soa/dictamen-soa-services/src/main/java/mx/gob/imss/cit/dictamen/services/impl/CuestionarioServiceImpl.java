/**
 * 
 */
package mx.gob.imss.cit.dictamen.services.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.xml.namespace.QName;

import mx.gob.imss.cit.dictamen.commons.enums.DictamenExceptionCodeEnum;
import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.domain.CuestionarioTO;
import mx.gob.imss.cit.dictamen.services.CuestionarioService;
import mx.gob.imss.cit.dictamen.services.constants.DictamenServicesConstants;
import mx.gob.imss.cit.dictamen.services.util.DictamenExceptionBuilder;
import mx.gob.imss.cit.dictamen.services.util.PropertiesConfigUtils;
import mx.gob.imss.cit.solicitudPension.serviciosNegocio.ws.commonschema.GovernanceHeaderRequest;
import mx.gob.imss.cit.solicitudPension.serviciosNegocio.ws.serviciosbdtu.ConsultaCuestionarioInput;
import mx.gob.imss.cit.solicitudPension.serviciosNegocio.ws.serviciosbdtu.ConsultaCuestionarioOutput;
import mx.gob.imss.cit.solicitudPension.serviciosNegocio.ws.serviciosbdtu.ServiciosBDTU;
import mx.gob.imss.cit.solicitudPension.serviciosNegocio.ws.serviciosbdtu.ServiciosBDTU_Service;
import mx.gob.imss.cit.solicitudPension.serviciosNegocio.ws.serviciosbdtu.consultacuestionarioschema.Pregunta;
import mx.gob.imss.cit.solicitudPension.serviciosNegocio.ws.serviciosbdtu.consultacuestionarioschema.ResponseCuestionario;
import mx.gob.imss.cit.solicitudPension.serviciosNegocio.ws.serviciosbdtu.consultacuestionarioschema.Seccion;

import org.apache.log4j.Logger;

public class CuestionarioServiceImpl implements CuestionarioService {

	private static final Logger LOG = Logger
			.getLogger(CuestionarioServiceImpl.class);

	private URL wsdl;
	private QName name;
	private ServiciosBDTU port;

	@PostConstruct
	public void init() throws MalformedURLException {
		wsdl= new URL(PropertiesConfigUtils.getPropertyConfig(DictamenServicesConstants.CONFIG_KEY_BDTU_ENDPOINT));
		name=new QName(PropertiesConfigUtils.getPropertyConfig(DictamenServicesConstants.CONFIG_KEY_BDTU_NAMESPACE),PropertiesConfigUtils.getPropertyConfig(DictamenServicesConstants.CONFIG_KEY_BDTU_SERVICE));
		port = new ServiciosBDTU_Service(wsdl, name).getServiciosBDTUSOAP();
	}


	/**
	 * @see mx.gob.imss.cit.dictamen.services.CuestionarioService#findCuestionarioById(java.lang.Integer)
	 */
	@Override
	public List<CuestionarioTO> findCuestionarioById(Integer idCuestionario) throws DictamenException{

		LOG.info("obteneropciones casos especiales");
		List<CuestionarioTO> tiposSolicitud = new ArrayList<CuestionarioTO>();

		ConsultaCuestionarioInput consultaCuestionarioInput = new ConsultaCuestionarioInput();
		GovernanceHeaderRequest value = new GovernanceHeaderRequest();
		consultaCuestionarioInput.setGovernanceHeaderRequest(value);
		consultaCuestionarioInput.setParamCuestionario(idCuestionario
				.intValue());
		try {
			ConsultaCuestionarioOutput salida = port
					.consultaCuestionario(consultaCuestionarioInput);
			ResponseCuestionario cuestionario = salida.getResponse();
			CuestionarioTO pregunta;
			for (Seccion seccion : cuestionario.getCuestionario()
					.getSecciones()) {
				for (Pregunta p : seccion.getPreguntas()) {
					pregunta = new CuestionarioTO();
					pregunta.setClave(p.getClave().toString());
					pregunta.setDescripcion(p.getDescripcion());
					pregunta.setObligatoria(p.isObligatoria());
					tiposSolicitud.add(pregunta);
				}
			}
		} catch (Exception e) {
			throw  DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_BDTU_CUESTIONARIO_OBTENER);
		}
		return tiposSolicitud;
	}
}
