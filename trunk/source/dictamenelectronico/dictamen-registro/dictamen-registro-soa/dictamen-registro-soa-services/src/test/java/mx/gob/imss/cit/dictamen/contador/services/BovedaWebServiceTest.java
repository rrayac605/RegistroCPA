package mx.gob.imss.cit.dictamen.contador.services;


import org.junit.Test;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.xml.namespace.QName;

import junit.framework.Assert;
import mx.gob.imss.cit.bp.ws.CreateDocumentRequest;
import mx.gob.imss.cit.bp.ws.CreateDocumentResponse;
import mx.gob.imss.cit.bp.ws.DocumentRequest;
import mx.gob.imss.cit.bp.ws.DocumentResponse;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Actor;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Document;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Tramite;
import mx.gob.imss.cit.bp.ws.documentows.DocumentoWSServiceImplService;
import mx.gob.imss.cit.bp.ws.documentows.IDocumentoWSService;
import mx.gob.imss.cit.ws.commonschema.GovernanceHeaderResponse;
import mx.gob.imss.cit.ws.commonschema.SGBDS;

public class BovedaWebServiceTest {

	@Test
	public void testBoveda() throws MalformedURLException {
		Map<String, Object> parameters = new HashMap<String, Object>();
		byte[] contenido = new byte[20];
		URL wsdl;
		QName name;
		IDocumentoWSService port;
		wsdl = new URL("http://11.254.20.226:8011/BovedaPersonalEscritorio/Proxies/ServiceProxyDocumentoWS?wsdl");
		name = new QName("http://documentows.ws.bp.cit.imss.gob.mx/","DocumentoWSServiceImplService");
		port = new DocumentoWSServiceImplService(wsdl, name)
				.getDocumentoWSServiceImplPort();

		Tramite tramite = new Tramite();
		Actor actor = new Actor();
		Document document = new Document();

		tramite.setFolioTramite("0001");
		document.setName("PruebaPensiones14-09-2015.pdf");
		document.setContent("test");
		document.setExt("pdf");
		document.setIsFolder(Boolean.FALSE.toString());
		actor.setId("123456");
		actor.setTipoId("RFC");
		actor.setIsOwner(String.valueOf(false));
		CreateDocumentRequest body = new CreateDocumentRequest();
		body.setActor(actor);
		body.setDocument(document);
		body.setTramite(tramite);
		body.setIsEncripted(Boolean.FALSE.toString());
		CreateDocumentResponse response = port.createDocument(body);

		
	}
}
