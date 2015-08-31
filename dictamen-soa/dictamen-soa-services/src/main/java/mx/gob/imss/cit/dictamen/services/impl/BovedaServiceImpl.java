package mx.gob.imss.cit.dictamen.services.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
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
import mx.gob.imss.cit.dictamen.commons.to.ActorBovedaTO;
import mx.gob.imss.cit.dictamen.commons.to.BaseObjectBovedaTO;
import mx.gob.imss.cit.dictamen.commons.to.DocumentoBovedaTO;
import mx.gob.imss.cit.dictamen.commons.to.HeaderBovedaTO;
import mx.gob.imss.cit.dictamen.commons.to.MetadataBovedaTO;
import mx.gob.imss.cit.dictamen.commons.to.TramiteBovedaTO;
import mx.gob.imss.cit.dictamen.services.BovedaService;
import mx.gob.imss.cit.dictamen.services.util.UtilTransformerService;
import mx.gob.imss.cit.ws.commonschema.GovernanceHeaderRequest;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class BovedaServiceImpl implements BovedaService {

	private URL wsdl;
	private QName name;
	private IDocumentoWSService port;
	
	@PostConstruct
	public void init() throws MalformedURLException{
		ResourceBundle resourceBundle = ResourceBundle.getBundle("boveda-service");
		wsdl= new URL(resourceBundle.getString("bovedaws.endpoint"));
		name=new QName(resourceBundle.getString("bovedaws.namespace"),resourceBundle.getString("bovedaws.service"));
		port = new DocumentoWSServiceImplService(wsdl, name).getDocumentoWSServiceImplPort();

	}

	@Override
	public void setPort(IDocumentoWSService port) {
		this.port = port;
	}

	@Override
	public boolean createDocument(DocumentoBovedaTO documento, TramiteBovedaTO tramite, ActorBovedaTO actor, HeaderBovedaTO header, String isEncripted) {
		CreateDocumentRequest createRequest = new CreateDocumentRequest();
		GovernanceHeaderRequest governanceHeaderRequest = new GovernanceHeaderRequest();
		governanceHeaderRequest.setSgbde(UtilTransformerService.transformer(header));
		createRequest.setGovernanceHeaderRequest(governanceHeaderRequest);
		createRequest.setActor(UtilTransformerService.transformer(actor));
		createRequest.setDocument(UtilTransformerService.transformer(documento));
		createRequest.setTramite(UtilTransformerService.transformer(tramite));
		createRequest.setIsEncripted(isEncripted);
		CreateDocumentResponse createResponse = port.createDocument(createRequest);	
		if (createResponse != null){
			if (createResponse.getGovernanceHeaderResponse().getSgbds().isSuccessful())
				return true;
			else 
				return false;
		}else{
			return false;
		}			
	}	
	
	@Override
	public DocumentoBovedaTO getDocument(ActorBovedaTO actor, TramiteBovedaTO tramite, HeaderBovedaTO header, BaseObjectBovedaTO baseObject) throws Exception{
		DocumentRequest documentRequest = new DocumentRequest();		
		GovernanceHeaderRequest governanceHeaderRequest = new GovernanceHeaderRequest();
		governanceHeaderRequest.setSgbde(UtilTransformerService.transformer(header));
		documentRequest.setGovernanceHeaderRequest(governanceHeaderRequest);
		documentRequest.setActor(UtilTransformerService.transformer(actor));
		documentRequest.setTramite(UtilTransformerService.transformer(tramite));
		documentRequest.setObject(UtilTransformerService.transformer(baseObject));
		DocumentResponse documentResponse = port.getDocument(documentRequest);
		if (documentResponse != null){			
			return UtilTransformerService.transformer(documentResponse.getDocument());
		}else{
			throw new Exception("No se pudo recuperar el documento");
		}			
	}
	
	@Override
	public boolean deleteDocument(ActorBovedaTO actor, TramiteBovedaTO tramite, HeaderBovedaTO header, BaseObjectBovedaTO baseObject) throws Exception{
		DeleteDocumentRequest deleteRequest = new DeleteDocumentRequest();
		GovernanceHeaderRequest governanceHeaderRequest = new GovernanceHeaderRequest();
		governanceHeaderRequest.setSgbde(UtilTransformerService.transformer(header));
		deleteRequest.setGovernanceHeaderRequest(governanceHeaderRequest);
		deleteRequest.setActor(UtilTransformerService.transformer(actor));
		deleteRequest.setTramite(UtilTransformerService.transformer(tramite));
		deleteRequest.setObject(UtilTransformerService.transformer(baseObject));
		DeleteDocumentResponse deleteResponse = port.deleteDocument(deleteRequest);
		if (deleteResponse != null){
			if (deleteResponse.getGovernanceHeaderResponse().getSgbds().isSuccessful())
				return true;
			else 
				return false;
		}else{
			throw new Exception ("No se pudo borrar el documento");
		}
	}	
	
	@Override
	public boolean addDocumentActor(ActorBovedaTO actor, TramiteBovedaTO tramite, ActorBovedaTO newActor, HeaderBovedaTO header, BaseObjectBovedaTO baseObject) throws Exception{
		AddDocumentActorRequest addDocumentActorRequest = new AddDocumentActorRequest();
		GovernanceHeaderRequest governanceHeaderRequest = new GovernanceHeaderRequest();
		governanceHeaderRequest.setSgbde(UtilTransformerService.transformer(header));
		addDocumentActorRequest.setGovernanceHeaderRequest(governanceHeaderRequest);
		addDocumentActorRequest.setActor(UtilTransformerService.transformer(actor));
		addDocumentActorRequest.setNewActor(UtilTransformerService.transformer(newActor));
		addDocumentActorRequest.setTramite(UtilTransformerService.transformer(tramite));
		addDocumentActorRequest.setObject(UtilTransformerService.transformer(baseObject));
		AddDocumentActorResponse addDocumentActorResponse = port.addDocumentActor(addDocumentActorRequest);
		if (addDocumentActorResponse != null){
			if (addDocumentActorResponse.getGovernanceHeaderResponse().getSgbds().isSuccessful())
				return true;
			else 
				return false;
		}else{
			throw new Exception ("No se pudo agregar el actor");
		}
	}		
	
	@Override
	public List<DocumentoBovedaTO> findDocumentsByMetadata(ActorBovedaTO actor, TramiteBovedaTO tramite, MetadataBovedaTO metadataValue, HeaderBovedaTO header, BaseObjectBovedaTO baseObject){
		DocumentsByMetadataRequest documentsByMetadataRequest = new DocumentsByMetadataRequest();
		GovernanceHeaderRequest governanceHeaderRequest = new GovernanceHeaderRequest();
		governanceHeaderRequest.setSgbde(UtilTransformerService.transformer(header));
		documentsByMetadataRequest.setGovernanceHeaderRequest(governanceHeaderRequest);
		documentsByMetadataRequest.setActor(UtilTransformerService.transformer(actor));
		documentsByMetadataRequest.setMetadata(UtilTransformerService.transformer(metadataValue));
		documentsByMetadataRequest.setTramite(UtilTransformerService.transformer(tramite));
		documentsByMetadataRequest.setObject(UtilTransformerService.transformer(baseObject));
		DocumentsByMetadataResponse documentsByMetadataResponse= port.findDocumentsByMetadata(documentsByMetadataRequest);
		List<DocumentoBovedaTO> documentos = new ArrayList<DocumentoBovedaTO>();
		for (Document document: documentsByMetadataResponse.getDocument()){
			documentos.add(UtilTransformerService.transformer(document));
		}
		return documentos;
	}
	
	@Override
	public List<DocumentoBovedaTO> getAllDocumentVersionsByDoc(ActorBovedaTO actor, TramiteBovedaTO tramite, HeaderBovedaTO header, BaseObjectBovedaTO baseObject){
		AllDocumentVersionsByDocRequest allDocumentVersionsByDocRequest = new AllDocumentVersionsByDocRequest();
		GovernanceHeaderRequest governanceHeaderRequest = new GovernanceHeaderRequest();
		governanceHeaderRequest.setSgbde(UtilTransformerService.transformer(header));
		allDocumentVersionsByDocRequest.setGovernanceHeaderRequest(governanceHeaderRequest);		
		allDocumentVersionsByDocRequest.setActor(UtilTransformerService.transformer(actor));
		allDocumentVersionsByDocRequest.setTramite(UtilTransformerService.transformer(tramite));
		allDocumentVersionsByDocRequest.setObject(UtilTransformerService.transformer(baseObject));
		AllDocumentVersionsByDocResponse allDocumentVersionsByDocResponse = port.getAllDocumentVersionsByDoc(allDocumentVersionsByDocRequest);
		List<DocumentoBovedaTO> documentos = new ArrayList<DocumentoBovedaTO>();
		for (Document document: allDocumentVersionsByDocResponse.getDocument()){
			documentos.add(UtilTransformerService.transformer(document));
		}
		return documentos;
	}		
	
	@Override
	public List<DocumentoBovedaTO> getAllDocumentVersionsMetadataByDoc(ActorBovedaTO actor, TramiteBovedaTO tramite, HeaderBovedaTO header, BaseObjectBovedaTO baseObject){
		AllDocumentVersionsMetadataByDocRequest allDocumentVersionsMetadataByDocRequest = new AllDocumentVersionsMetadataByDocRequest();
		GovernanceHeaderRequest governanceHeaderRequest = new GovernanceHeaderRequest();
		governanceHeaderRequest.setSgbde(UtilTransformerService.transformer(header));
		allDocumentVersionsMetadataByDocRequest.setGovernanceHeaderRequest(governanceHeaderRequest);
		allDocumentVersionsMetadataByDocRequest.setActor(UtilTransformerService.transformer(actor));
		allDocumentVersionsMetadataByDocRequest.setTramite(UtilTransformerService.transformer(tramite));
		allDocumentVersionsMetadataByDocRequest.setObject(UtilTransformerService.transformer(baseObject));
		AllDocumentVersionsMetadataByDocResponse allDocumentVersionsMetadataByDocResponse = port.getAllDocumentVersionsMetadataByDoc(allDocumentVersionsMetadataByDocRequest);
		List<DocumentoBovedaTO> documentos = new ArrayList<DocumentoBovedaTO>();
		for (Document document: allDocumentVersionsMetadataByDocResponse.getDocument()){
			documentos.add(UtilTransformerService.transformer(document));
		}
		return documentos;
	}		
	
	@Override
	public List<MetadataBovedaTO> getAllMetadataByMetadata(ActorBovedaTO actor, TramiteBovedaTO tramite, MetadataBovedaTO metadataValue, HeaderBovedaTO header, BaseObjectBovedaTO baseObject){
		AllMetadataByMetadataRequest allMetadataByMetadataRequest = new AllMetadataByMetadataRequest();
		GovernanceHeaderRequest governanceHeaderRequest = new GovernanceHeaderRequest();
		governanceHeaderRequest.setSgbde(UtilTransformerService.transformer(header));
		allMetadataByMetadataRequest.setGovernanceHeaderRequest(governanceHeaderRequest);
		allMetadataByMetadataRequest.setActor(UtilTransformerService.transformer(actor));
		allMetadataByMetadataRequest.setTramite(UtilTransformerService.transformer(tramite));
		allMetadataByMetadataRequest.setObject(UtilTransformerService.transformer(baseObject));
		AllMetadataByMetadataResponse allMetadataByMetadataResponse = port.getAllMetadataByMetadata(allMetadataByMetadataRequest);
		List<MetadataBovedaTO> metadatos = new ArrayList<MetadataBovedaTO>();
		for (Metadata metadata: allMetadataByMetadataResponse.getMetadata()){
			metadatos.add(UtilTransformerService.transformer(metadata));
		}		
		return metadatos;
	}		
	
	@Override
	public MetadataBovedaTO getMetadataByDoc(ActorBovedaTO actor, TramiteBovedaTO tramite, HeaderBovedaTO header, BaseObjectBovedaTO baseObject){
		MetadataByDocRequest metadataByDocRequest = new MetadataByDocRequest();
		GovernanceHeaderRequest governanceHeaderRequest = new GovernanceHeaderRequest();
		governanceHeaderRequest.setSgbde(UtilTransformerService.transformer(header));
		metadataByDocRequest.setGovernanceHeaderRequest(governanceHeaderRequest);
		metadataByDocRequest.setActor(UtilTransformerService.transformer(actor));
		metadataByDocRequest.setTramite(UtilTransformerService.transformer(tramite));
		metadataByDocRequest.setObject(UtilTransformerService.transformer(baseObject));
		MetadataByDocResponse metadataByDocResponse = port.getMetadataByDoc(metadataByDocRequest);		
		return UtilTransformerService.transformer(metadataByDocResponse.getMetadata());
	}		
}
