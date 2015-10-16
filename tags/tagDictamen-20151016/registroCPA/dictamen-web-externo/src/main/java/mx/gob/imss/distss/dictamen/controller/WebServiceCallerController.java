package mx.gob.imss.distss.dictamen.controller;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import mx.gob.imss.ctirss.delta.framework.base.controller.AbstractController;
import mx.gob.imss.digital.modelo.util.JaxbUtil;

import org.springframework.ws.client.core.WebServiceTemplate;

public class WebServiceCallerController extends AbstractController {
	
	protected <T> T callWebService(WebServiceTemplate webService, Object source, Class<T> resultClass, Class<?>[] classes) throws Exception {
		T result = null;
		try {
			StringWriter writer = new StringWriter();
			StreamResult streamResult = new StreamResult(writer);
			log.info("********** CADENA DE ENTRADA DEL WEB-SERVICE: " + JaxbUtil.marshaller(source, classes));
			webService.sendSourceAndReceiveToResult(new StreamSource(new StringReader(JaxbUtil.marshaller(source, classes))), streamResult);
			log.info("********** CADENA DE SALIDA DEL WEB-SERVICE: " + writer.toString());
			result = resultClass.newInstance();
			result = JaxbUtil.unmarshaller(writer.toString(), resultClass);
		} catch (InstantiationException e) {
			throw new Exception("No se ha podido crear una instancia de la clase resultado.", e);
		} catch (IllegalAccessException e) {
			throw new Exception("No se ha podido crear una instancia de la clase resultado.", e);
		}
		return result;
	}
	
	protected <T> T callWebService(WebServiceTemplate webService, Object source, Class<T> resultClass) throws Exception {
		return callWebService(webService, source, resultClass, new Class<?>[] {source.getClass()});
	}

}
