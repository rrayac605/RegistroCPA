package mx.gob.imss.cit.dictamen.contador.services.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mx.gob.imss.cit.dictamen.contador.commons.to.domain.PersonaMedioContactoTO;
import mx.gob.imss.cit.dictamen.contador.services.MedioContadorService;
import mx.gob.imss.cit.solicitudPension.serviciosNegocio.ws.serviciosbdtu.ConsultaMediosDeContactoInput;
import mx.gob.imss.cit.solicitudPension.serviciosNegocio.ws.serviciosbdtu.ConsultaMediosDeContactoOutput;
import mx.gob.imss.cit.solicitudPension.serviciosNegocio.ws.serviciosbdtu.InsertarMediosContactoInput;
import mx.gob.imss.cit.solicitudPension.serviciosNegocio.ws.serviciosbdtu.ServiciosBDTU_Service;
import mx.gob.imss.cit.solicitudPension.serviciosNegocio.ws.serviciosbdtu.consultamediosdecontactoschema.PersonaMedioContacto;

@Stateless(name = "bdtuService", mappedName = "bdtuService")
public class MedioContadorServiceImpl implements MedioContadorService {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(MedioContadorServiceImpl.class);

	@Override
	public List<PersonaMedioContactoTO> consultarMedioContacto(Long idPersona) {

		List<PersonaMedioContactoTO> lstPersonaMedioContactoTO = new ArrayList<PersonaMedioContactoTO>();
		try {
			URL url = null;
		

			url = new URL(
					"http://11.254.20.226:8011/ServiciosBDTU/Proxies/ProxyServiceBDTU?wsdl");

			ServiciosBDTU_Service service = new ServiciosBDTU_Service(
					url,
					new QName(
							"http://serviciosNegocio.solicitudPension.cit.imss.gob.mx/ws/ServiciosBDTU/",
							"ServiciosBDTU"));
			ConsultaMediosDeContactoInput consultaMediosDeContactoInput = new ConsultaMediosDeContactoInput();
			consultaMediosDeContactoInput.setIdPersona(37472955L);

			ConsultaMediosDeContactoOutput consultaMediosDeContactoOutput = service
					.getServiciosBDTUSOAP().consultaMediosDeContacto(
							consultaMediosDeContactoInput);

			for (PersonaMedioContacto personaMedioContacto : consultaMediosDeContactoOutput
					.getOutput().getPersonaMedioContacto()) {
				PersonaMedioContactoTO personaMedioContactoTO = new PersonaMedioContactoTO();
				personaMedioContactoTO.setCveIdPersona(personaMedioContacto
						.getCveIdPersona());
				personaMedioContactoTO.setDescripcion(personaMedioContacto
						.getDescripcion());
				personaMedioContactoTO.setFechaAlta(personaMedioContacto
						.getFechaAlta().toGregorianCalendar().getTime());
				personaMedioContactoTO
						.setIdPersonafContacto(personaMedioContacto
								.getIdPersonafContacto());
				personaMedioContactoTO.setIdMedioContacto(personaMedioContacto
						.getMedioDeContactoDTO().getIdMedioContacto());
				lstPersonaMedioContactoTO.add(personaMedioContactoTO);
			}
		} catch (MalformedURLException malformedURLException) {
			LOGGER.error("servicioweb=" + malformedURLException.getMessage(),
					malformedURLException);
		}
		return lstPersonaMedioContactoTO;
	}

	@Override
	public void insertarMedioContacto(PersonaMedioContactoTO personaMedioContactoTO) {

		try {
			URL url = null;
		

			url = new URL(
					"http://11.254.20.226:8011/ServiciosBDTU/Proxies/ProxyServiceBDTU?wsdl");

			ServiciosBDTU_Service service = new ServiciosBDTU_Service(
					url,
					new QName(
							"http://serviciosNegocio.solicitudPension.cit.imss.gob.mx/ws/ServiciosBDTU/",
							"ServiciosBDTU"));
			ConsultaMediosDeContactoInput consultaMediosDeContactoInput = new ConsultaMediosDeContactoInput();
			consultaMediosDeContactoInput.setIdPersona(37472955L);
InsertarMediosContactoInput insertarMediosContactoInput = new InsertarMediosContactoInput();
service.getServiciosBDTUSOAP().insertarAsociarMediosContacto(insertarMediosContactoInput);

			
		} catch (MalformedURLException malformedURLException) {
			LOGGER.error("servicioweb=" + malformedURLException.getMessage(),
					malformedURLException);
		}
	}

}
