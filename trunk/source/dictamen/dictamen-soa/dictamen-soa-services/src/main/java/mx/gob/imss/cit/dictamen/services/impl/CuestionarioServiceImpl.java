/**
 * 
 */
package mx.gob.imss.cit.dictamen.services.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.xml.namespace.QName;

import mx.gob.imss.cit.dictamen.commons.to.CuestionarioTO;
import mx.gob.imss.cit.dictamen.services.CuestionarioService;
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
		ResourceBundle resourceBundle = ResourceBundle
				.getBundle("bdtu-service");
		wsdl = new URL(resourceBundle.getString("bdtu.endpoint"));
		name = new QName(resourceBundle.getString("bdtu.namespace"),
				resourceBundle.getString("bdtu.service"));
		port = new ServiciosBDTU_Service(wsdl, name).getServiciosBDTUSOAP();
	}

	@Override
	public void setPort(ServiciosBDTU port) {
		this.port = (ServiciosBDTU) port;

	}

	/**
	 * @see mx.gob.imss.cit.dictamen.services.CuestionarioService#findCuestionarioById(java.lang.Integer)
	 */
	@Override
	public List<CuestionarioTO> findCuestionarioById(Integer idCuestionario) {

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
		}
		return tiposSolicitud;
	}
}
