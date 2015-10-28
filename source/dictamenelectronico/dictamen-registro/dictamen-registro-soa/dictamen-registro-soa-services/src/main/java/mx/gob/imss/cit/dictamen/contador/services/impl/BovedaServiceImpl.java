package mx.gob.imss.cit.dictamen.contador.services.impl;

import java.net.MalformedURLException;
import java.net.URL;

import mx.gob.imss.cit.bp.ws.CreateDocumentRequest;
import mx.gob.imss.cit.bp.ws.CreateDocumentResponse;
import mx.gob.imss.cit.bp.ws.DocumentRequest;
import mx.gob.imss.cit.bp.ws.DocumentResponse;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Actor;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.BaseObject;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Document;
import mx.gob.imss.cit.bp.ws.documentows.DocumentoWSServiceImplService;
import mx.gob.imss.cit.bp.ws.documentows.IDocumentoWSService;
import mx.gob.imss.cit.dictamen.contador.commons.to.domain.boveda.DocumentoTO;
import mx.gob.imss.cit.dictamen.contador.commons.to.domain.boveda.TramiteTO;
import mx.gob.imss.cit.dictamen.contador.commons.to.domain.boveda.UsuarioTO;
import mx.gob.imss.cit.dictamen.contador.services.BovedaService;

import javax.ejb.Stateless;
import javax.xml.namespace.QName;
import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Tramite;

@Stateless(name = "bovedaService", mappedName = "bovedaService")
public class BovedaServiceImpl implements BovedaService {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(BovedaServiceImpl.class);
	
	private URL wsdl;
	private QName name;
	private IDocumentoWSService port;
	
	@PostConstruct
	public void init() {

		try {
			wsdl = new URL("http://11.254.20.226:8011/DictamenEJB/Proxies/ServiciosBDTU_Dictamen?wsdl");
			name = new QName("http://servicios.dictamen.cit.imss.gob.mx/ws/ServiciosBDTU/", "ServiciosBDTU");
			port = new DocumentoWSServiceImplService(wsdl, name)
					.getDocumentoWSServiceImplPort();
		} catch (MalformedURLException malformedURLException) {
			LOGGER.info(malformedURLException.getMessage(),malformedURLException);
		}
	}

	@Override
	public void setPort(IDocumentoWSService port) {
		this.port = port;
		
	}

	@Override
	public void saveDocument(DocumentoTO documentoTO, TramiteTO tramiteTO,
			UsuarioTO usuarioVO) {
		
		Tramite tramite = new Tramite();
		Actor actor = new Actor();
		Document document = new Document();

		tramite.setFolioTramite(tramiteTO.getFolio());
		document.setName(documentoTO.getNombre());
		document.setContent(documentoTO.getDocumento());
		document.setExt(documentoTO.getExt());
		document.setIsFolder(Boolean.FALSE.toString());
		actor.setId(usuarioVO.getId());
		actor.setTipoId(usuarioVO.getTipoId());
		actor.setIsOwner(String.valueOf(usuarioVO.getIsOwner()));
		CreateDocumentRequest body = new CreateDocumentRequest();
		body.setActor(actor);
		body.setDocument(document);
		body.setTramite(tramite);
		body.setIsEncripted(Boolean.FALSE.toString());
		CreateDocumentResponse response = port.createDocument(body);
		if (!response.getGovernanceHeaderResponse().getSgbds().isSuccessful()) {
			LOGGER.info("Error en createDocument :::");

		}
		
	}

	@Override
	public Document getDocumentById(TramiteTO tramiteVO, UsuarioTO usuarioTO,
			DocumentoTO documentoVO) {

		
		DocumentRequest doc = new DocumentRequest();
		Tramite tramite = new Tramite();
		Actor actor = new Actor();
		BaseObject object = new BaseObject();

		tramite.setFolioTramite(tramiteVO.getFolio());
		actor.setTipoId(usuarioTO.getTipoId());
		actor.setId(usuarioTO.getId());
		actor.setIsOwner(Boolean.FALSE.toString());
		object.setName(documentoVO.getNombre());
		object.setIsFolder("false");

		doc.setObject(object);
		doc.setTramite(tramite);
		doc.setActor(actor);

		DocumentResponse documentResponse = port.getDocument(doc);
		
		
		
		if (documentResponse.getGovernanceHeaderResponse().getSgbds()
				.isSuccessful()) {
			return documentResponse.getDocument();
		} else {
//			throw SolicitudPensionServiciosNegocioExceptionBuilder.build(
//					documentResponse.getGovernanceHeaderResponse().getSgbds()
//							.getErrorCode().intValue(), new Throwable(
//							documentResponse.getGovernanceHeaderResponse()
//									.getSgbds().getErrorDescription()));
			return null;
		}
	}

	
	public URL getWsdl() {
		return wsdl;
	}




	public void setWsdl(URL wsdl) {
		this.wsdl = wsdl;
	}




	public QName getName() {
		return name;
	}




	public void setName(QName name) {
		this.name = name;
	}




	public IDocumentoWSService getPort() {
		return port;
	}
}
