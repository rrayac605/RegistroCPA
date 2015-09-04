package mx.gob.imss.cit.dictamen.services.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.xml.namespace.QName;

import mx.gob.imss.cit.bp.ws.AddDocumentActorRequest;
import mx.gob.imss.cit.bp.ws.AddDocumentActorResponse;
import mx.gob.imss.cit.bp.ws.AllDocumentVersionsByDocRequest;
import mx.gob.imss.cit.bp.ws.AllDocumentVersionsByDocResponse;
import mx.gob.imss.cit.bp.ws.AllDocumentVersionsMetadataByDocRequest;
import mx.gob.imss.cit.bp.ws.AllDocumentVersionsMetadataByDocResponse;
import mx.gob.imss.cit.bp.ws.AllMetadataByMetadataRequest;
import mx.gob.imss.cit.bp.ws.AllMetadataByMetadataResponse;
import mx.gob.imss.cit.bp.ws.CreateDocumentRequest;
import mx.gob.imss.cit.bp.ws.CreateDocumentResponse;
import mx.gob.imss.cit.bp.ws.DeleteDocumentRequest;
import mx.gob.imss.cit.bp.ws.DeleteDocumentResponse;
import mx.gob.imss.cit.bp.ws.DocumentRequest;
import mx.gob.imss.cit.bp.ws.DocumentResponse;
import mx.gob.imss.cit.bp.ws.DocumentsByMetadataRequest;
import mx.gob.imss.cit.bp.ws.DocumentsByMetadataResponse;
import mx.gob.imss.cit.bp.ws.MetadataByDocRequest;
import mx.gob.imss.cit.bp.ws.MetadataByDocResponse;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Document;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Metadata;
import mx.gob.imss.cit.bp.ws.documentows.DocumentoWSServiceImplService;
import mx.gob.imss.cit.bp.ws.documentows.IDocumentoWSService;
import mx.gob.imss.cit.dictamen.commons.enums.DictamenExceptionCodeEnum;
import mx.gob.imss.cit.dictamen.commons.to.BaseObjectBovedaTO;
import mx.gob.imss.cit.dictamen.commons.to.DocumentoBovedaTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.ActorBovedaTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.HeaderBovedaTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.MetadataBovedaTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.TramiteBovedaTO;
import mx.gob.imss.cit.dictamen.services.BovedaService;
import mx.gob.imss.cit.dictamen.services.constants.DictamenServicesConstants;
import mx.gob.imss.cit.dictamen.services.util.DictamenExceptionBuilder;
import mx.gob.imss.cit.dictamen.services.util.PropertiesConfigUtils;
import mx.gob.imss.cit.dictamen.services.util.TransformerServiceUtils;
import mx.gob.imss.cit.ws.commonschema.GovernanceHeaderRequest;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
@Stateless
public class BovedaServiceImpl implements BovedaService {

	private URL wsdl;
	private QName name;
	private IDocumentoWSService port;
	
	@PostConstruct
	public void init() throws MalformedURLException{
		wsdl= new URL(PropertiesConfigUtils.getPropertyConfig(DictamenServicesConstants.CONFIG_KEY_BOVEDA_ENDPOINT));
		name=new QName(PropertiesConfigUtils.getPropertyConfig(DictamenServicesConstants.CONFIG_KEY_BOVEDA_NAMESPACE),PropertiesConfigUtils.getPropertyConfig(DictamenServicesConstants.CONFIG_KEY_BOVEDA_SERVICE));
		port = new DocumentoWSServiceImplService(wsdl, name).getDocumentoWSServiceImplPort();

	}

	@Override
	public void setPort(IDocumentoWSService port) {
		this.port = port;
	}

	@Override
	public boolean createDocument(DocumentoBovedaTO documento, TramiteBovedaTO tramite, ActorBovedaTO actor, HeaderBovedaTO header, String isEncripted) {
		boolean resultado=false;
		CreateDocumentRequest createRequest = new CreateDocumentRequest();
		GovernanceHeaderRequest governanceHeaderRequest = new GovernanceHeaderRequest();
		governanceHeaderRequest.setSgbde(TransformerServiceUtils.transformer(header));
		createRequest.setGovernanceHeaderRequest(governanceHeaderRequest);
		createRequest.setActor(TransformerServiceUtils.transformer(actor));
		createRequest.setDocument(TransformerServiceUtils.transformer(documento));
		createRequest.setTramite(TransformerServiceUtils.transformer(tramite));
		createRequest.setIsEncripted(isEncripted);
		CreateDocumentResponse createResponse = port.createDocument(createRequest);	
		
		if (createResponse != null){
			if (createResponse.getGovernanceHeaderResponse().getSgbds().isSuccessful())
				resultado=true;
			else {
				resultado=false;
			}				
		}else{
			resultado= false;
		}		
		
		return resultado;
	}	
	
	@Override
	public DocumentoBovedaTO getDocument(ActorBovedaTO actor, TramiteBovedaTO tramite, HeaderBovedaTO header, BaseObjectBovedaTO baseObject){
		
		DocumentoBovedaTO documentoBovedaTO=null;
		
		DocumentRequest documentRequest = new DocumentRequest();		
		GovernanceHeaderRequest governanceHeaderRequest = new GovernanceHeaderRequest();
		governanceHeaderRequest.setSgbde(TransformerServiceUtils.transformer(header));
		documentRequest.setGovernanceHeaderRequest(governanceHeaderRequest);
		documentRequest.setActor(TransformerServiceUtils.transformer(actor));
		documentRequest.setTramite(TransformerServiceUtils.transformer(tramite));
		documentRequest.setObject(TransformerServiceUtils.transformer(baseObject));
		DocumentResponse documentResponse = port.getDocument(documentRequest);
		if (documentResponse != null){			
			documentoBovedaTO= TransformerServiceUtils.transformer(documentResponse.getDocument());
		}else{
			throw DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_BOVEDA_OBTENER_DOCUMENTO);
		}			
		
		return documentoBovedaTO;
	}
	
	@Override
	public boolean deleteDocument(ActorBovedaTO actor, TramiteBovedaTO tramite, HeaderBovedaTO header, BaseObjectBovedaTO baseObject){
		
		boolean result=false;
		DeleteDocumentRequest deleteRequest = new DeleteDocumentRequest();
		GovernanceHeaderRequest governanceHeaderRequest = new GovernanceHeaderRequest();
		governanceHeaderRequest.setSgbde(TransformerServiceUtils.transformer(header));
		deleteRequest.setGovernanceHeaderRequest(governanceHeaderRequest);
		deleteRequest.setActor(TransformerServiceUtils.transformer(actor));
		deleteRequest.setTramite(TransformerServiceUtils.transformer(tramite));
		deleteRequest.setObject(TransformerServiceUtils.transformer(baseObject));
		DeleteDocumentResponse deleteResponse = port.deleteDocument(deleteRequest);
		if (deleteResponse != null){
			if (deleteResponse.getGovernanceHeaderResponse().getSgbds().isSuccessful())
				result= true;
			else 
				result= false;
		}else{
			throw DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_BOVEDA_ELIMINAR_DOCUMENTO);
		}
		
		return result;
	}	
	
	@Override
	public boolean addDocumentActor(ActorBovedaTO actor, TramiteBovedaTO tramite, ActorBovedaTO newActor, HeaderBovedaTO header, BaseObjectBovedaTO baseObject) {
		AddDocumentActorRequest addDocumentActorRequest = new AddDocumentActorRequest();
		GovernanceHeaderRequest governanceHeaderRequest = new GovernanceHeaderRequest();
		governanceHeaderRequest.setSgbde(TransformerServiceUtils.transformer(header));
		addDocumentActorRequest.setGovernanceHeaderRequest(governanceHeaderRequest);
		addDocumentActorRequest.setActor(TransformerServiceUtils.transformer(actor));
		addDocumentActorRequest.setNewActor(TransformerServiceUtils.transformer(newActor));
		addDocumentActorRequest.setTramite(TransformerServiceUtils.transformer(tramite));
		addDocumentActorRequest.setObject(TransformerServiceUtils.transformer(baseObject));
		AddDocumentActorResponse addDocumentActorResponse = port.addDocumentActor(addDocumentActorRequest);
		if (addDocumentActorResponse != null){
			if (addDocumentActorResponse.getGovernanceHeaderResponse().getSgbds().isSuccessful())
				return true;
			else 
				return false;
		}else{
			throw DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_BOVEDA_AGREGAR_ACTOR);
		}
	}		
	
	@Override
	public List<DocumentoBovedaTO> findDocumentsByMetadata(ActorBovedaTO actor, TramiteBovedaTO tramite, MetadataBovedaTO metadataValue, HeaderBovedaTO header, BaseObjectBovedaTO baseObject){
		DocumentsByMetadataRequest documentsByMetadataRequest = new DocumentsByMetadataRequest();
		GovernanceHeaderRequest governanceHeaderRequest = new GovernanceHeaderRequest();
		governanceHeaderRequest.setSgbde(TransformerServiceUtils.transformer(header));
		documentsByMetadataRequest.setGovernanceHeaderRequest(governanceHeaderRequest);
		documentsByMetadataRequest.setActor(TransformerServiceUtils.transformer(actor));
		documentsByMetadataRequest.setMetadata(TransformerServiceUtils.transformer(metadataValue));
		documentsByMetadataRequest.setTramite(TransformerServiceUtils.transformer(tramite));
		documentsByMetadataRequest.setObject(TransformerServiceUtils.transformer(baseObject));
		DocumentsByMetadataResponse documentsByMetadataResponse= port.findDocumentsByMetadata(documentsByMetadataRequest);
		List<DocumentoBovedaTO> documentos = new ArrayList<DocumentoBovedaTO>();
		for (Document document: documentsByMetadataResponse.getDocument()){
			documentos.add(TransformerServiceUtils.transformer(document));
		}
		return documentos;
	}
	
	@Override
	public List<DocumentoBovedaTO> getAllDocumentVersionsByDoc(ActorBovedaTO actor, TramiteBovedaTO tramite, HeaderBovedaTO header, BaseObjectBovedaTO baseObject){
		AllDocumentVersionsByDocRequest allDocumentVersionsByDocRequest = new AllDocumentVersionsByDocRequest();
		GovernanceHeaderRequest governanceHeaderRequest = new GovernanceHeaderRequest();
		governanceHeaderRequest.setSgbde(TransformerServiceUtils.transformer(header));
		allDocumentVersionsByDocRequest.setGovernanceHeaderRequest(governanceHeaderRequest);		
		allDocumentVersionsByDocRequest.setActor(TransformerServiceUtils.transformer(actor));
		allDocumentVersionsByDocRequest.setTramite(TransformerServiceUtils.transformer(tramite));
		allDocumentVersionsByDocRequest.setObject(TransformerServiceUtils.transformer(baseObject));
		AllDocumentVersionsByDocResponse allDocumentVersionsByDocResponse = port.getAllDocumentVersionsByDoc(allDocumentVersionsByDocRequest);
		List<DocumentoBovedaTO> documentos = new ArrayList<DocumentoBovedaTO>();
		for (Document document: allDocumentVersionsByDocResponse.getDocument()){
			documentos.add(TransformerServiceUtils.transformer(document));
		}
		return documentos;
	}		
	
	@Override
	public List<DocumentoBovedaTO> getAllDocumentVersionsMetadataByDoc(ActorBovedaTO actor, TramiteBovedaTO tramite, HeaderBovedaTO header, BaseObjectBovedaTO baseObject){
		AllDocumentVersionsMetadataByDocRequest allDocumentVersionsMetadataByDocRequest = new AllDocumentVersionsMetadataByDocRequest();
		GovernanceHeaderRequest governanceHeaderRequest = new GovernanceHeaderRequest();
		governanceHeaderRequest.setSgbde(TransformerServiceUtils.transformer(header));
		allDocumentVersionsMetadataByDocRequest.setGovernanceHeaderRequest(governanceHeaderRequest);
		allDocumentVersionsMetadataByDocRequest.setActor(TransformerServiceUtils.transformer(actor));
		allDocumentVersionsMetadataByDocRequest.setTramite(TransformerServiceUtils.transformer(tramite));
		allDocumentVersionsMetadataByDocRequest.setObject(TransformerServiceUtils.transformer(baseObject));
		AllDocumentVersionsMetadataByDocResponse allDocumentVersionsMetadataByDocResponse = port.getAllDocumentVersionsMetadataByDoc(allDocumentVersionsMetadataByDocRequest);
		List<DocumentoBovedaTO> documentos = new ArrayList<DocumentoBovedaTO>();
		for (Document document: allDocumentVersionsMetadataByDocResponse.getDocument()){
			documentos.add(TransformerServiceUtils.transformer(document));
		}
		return documentos;
	}		
	
	@Override
	public List<MetadataBovedaTO> getAllMetadataByMetadata(ActorBovedaTO actor, TramiteBovedaTO tramite, MetadataBovedaTO metadataValue, HeaderBovedaTO header, BaseObjectBovedaTO baseObject){
		AllMetadataByMetadataRequest allMetadataByMetadataRequest = new AllMetadataByMetadataRequest();
		GovernanceHeaderRequest governanceHeaderRequest = new GovernanceHeaderRequest();
		governanceHeaderRequest.setSgbde(TransformerServiceUtils.transformer(header));
		allMetadataByMetadataRequest.setGovernanceHeaderRequest(governanceHeaderRequest);
		allMetadataByMetadataRequest.setActor(TransformerServiceUtils.transformer(actor));
		allMetadataByMetadataRequest.setTramite(TransformerServiceUtils.transformer(tramite));
		allMetadataByMetadataRequest.setObject(TransformerServiceUtils.transformer(baseObject));
		AllMetadataByMetadataResponse allMetadataByMetadataResponse = port.getAllMetadataByMetadata(allMetadataByMetadataRequest);
		List<MetadataBovedaTO> metadatos = new ArrayList<MetadataBovedaTO>();
		for (Metadata metadata: allMetadataByMetadataResponse.getMetadata()){
			metadatos.add(TransformerServiceUtils.transformer(metadata));
		}		
		return metadatos;
	}		
	
	@Override
	public MetadataBovedaTO getMetadataByDoc(ActorBovedaTO actor, TramiteBovedaTO tramite, HeaderBovedaTO header, BaseObjectBovedaTO baseObject){
		MetadataByDocRequest metadataByDocRequest = new MetadataByDocRequest();
		GovernanceHeaderRequest governanceHeaderRequest = new GovernanceHeaderRequest();
		governanceHeaderRequest.setSgbde(TransformerServiceUtils.transformer(header));
		metadataByDocRequest.setGovernanceHeaderRequest(governanceHeaderRequest);
		metadataByDocRequest.setActor(TransformerServiceUtils.transformer(actor));
		metadataByDocRequest.setTramite(TransformerServiceUtils.transformer(tramite));
		metadataByDocRequest.setObject(TransformerServiceUtils.transformer(baseObject));
		MetadataByDocResponse metadataByDocResponse = port.getMetadataByDoc(metadataByDocRequest);		
		return TransformerServiceUtils.transformer(metadataByDocResponse.getMetadata());
	}		
}
