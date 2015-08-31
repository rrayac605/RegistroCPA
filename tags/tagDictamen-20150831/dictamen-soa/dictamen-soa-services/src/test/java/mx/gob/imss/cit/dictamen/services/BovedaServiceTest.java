/**
 * 
 */
package mx.gob.imss.cit.dictamen.services;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
import mx.gob.imss.cit.bp.ws.documentows.IDocumentoWSService;
import mx.gob.imss.cit.dictamen.commons.to.ActorBovedaTO;
import mx.gob.imss.cit.dictamen.commons.to.BaseObjectBovedaTO;
import mx.gob.imss.cit.dictamen.commons.to.DocumentoBovedaTO;
import mx.gob.imss.cit.dictamen.commons.to.HeaderBovedaTO;
import mx.gob.imss.cit.dictamen.commons.to.MetadataBovedaTO;
import mx.gob.imss.cit.dictamen.commons.to.TramiteBovedaTO;
import mx.gob.imss.cit.dictamen.services.impl.BovedaServiceImpl;
import mx.gob.imss.cit.ws.commonschema.GovernanceHeaderResponse;
import mx.gob.imss.cit.ws.commonschema.SGBDS;

/**
 * @author cmarmolejo
 *
 */
public class BovedaServiceTest{
	
	private Logger LOG=LoggerFactory.getLogger(BovedaServiceTest.class);
	/**
	 * Setvicio BovedaService para pruebas unitarias
	 */
	@InjectMocks
	private BovedaServiceImpl bovedaService = new BovedaServiceImpl();; 
	
	
	private ActorBovedaTO newActor;	
	private DocumentoBovedaTO documento;
	private ActorBovedaTO actor;
	private TramiteBovedaTO tramite;
	MetadataBovedaTO metadataValue;
	BaseObjectBovedaTO baseObject;
	private String isEncripted="false";
	private HeaderBovedaTO header;
		
	@Mock
	IDocumentoWSService port;
	
	CreateDocumentResponse createResponse;
	DocumentResponse documentResponse;	
	DeleteDocumentResponse deleteResponse;
	AddDocumentActorResponse addDocumentActorResponse;	
	DocumentsByMetadataResponse documentsByMetadataResponse;
	AllDocumentVersionsByDocResponse allDocumentVersionsByDocResponse;
	AllDocumentVersionsMetadataByDocResponse allDocumentVersionsMetadataByDocResponse;
	AllMetadataByMetadataResponse allMetadataByMetadataResponse;
	MetadataByDocResponse metadataByDocResponse;
	GovernanceHeaderResponse gHheader;	
	SGBDS sgbds;
	
	/**
	 * Método de configuración para pruebas unitarias
	 * @throws Exception
	 */
	@Before
	public void init() throws Exception {	
		MockitoAnnotations.initMocks(this);
		
		sgbds = new SGBDS();
		sgbds.setSuccessful(true);
		gHheader = new GovernanceHeaderResponse();		
		gHheader.setSgbds(sgbds);
		
		createResponse = new  CreateDocumentResponse();		
		createResponse.setGovernanceHeaderResponse(gHheader);
		
		documentResponse = new DocumentResponse();
		documentResponse.setDocument(new Document());
		
		deleteResponse = new DeleteDocumentResponse();
		deleteResponse.setGovernanceHeaderResponse(gHheader);
		
		addDocumentActorResponse = new AddDocumentActorResponse();
		addDocumentActorResponse.setGovernanceHeaderResponse(gHheader);
		
		documentsByMetadataResponse = new DocumentsByMetadataResponse();
		documentsByMetadataResponse.setGovernanceHeaderResponse(gHheader);
		
		allDocumentVersionsByDocResponse = new AllDocumentVersionsByDocResponse();
		allDocumentVersionsByDocResponse.setGovernanceHeaderResponse(gHheader);
		
		allDocumentVersionsMetadataByDocResponse = new AllDocumentVersionsMetadataByDocResponse();
		allDocumentVersionsMetadataByDocResponse.setGovernanceHeaderResponse(gHheader);
		
		allMetadataByMetadataResponse = new AllMetadataByMetadataResponse();
		allMetadataByMetadataResponse.setGovernanceHeaderResponse(gHheader);
		
		metadataByDocResponse = new MetadataByDocResponse();
		metadataByDocResponse.setGovernanceHeaderResponse(gHheader);
		metadataByDocResponse.setMetadata(new Metadata());
	}
    
	/**
	 * Prueba unitaria para crear documento en boveda.
	 */
	@Test
	public void testCreateDocument(){
		Mockito.when(port.createDocument((CreateDocumentRequest) Mockito.anyObject())).thenReturn(createResponse);
		boolean result = bovedaService.createDocument(documento, tramite, actor, header , isEncripted);
		LOG.info(String.valueOf(result));
		Assert.assertNotNull(result);
	}
	
	/**
	 * Prueba unitaria para recuperar documento de boveda.
	 * @throws Exception 
	 */
	@Test
	public void testGetDocument() throws Exception{
		Mockito.when(port.getDocument((DocumentRequest) Mockito.anyObject())).thenReturn(documentResponse);
		DocumentoBovedaTO result = bovedaService.getDocument(actor, tramite, header, baseObject);
		LOG.info(String.valueOf(result));
		Assert.assertNotNull(result);
	}	
	
	/**
	 * Prueba unitaria para borrar documento de boveda.
	 * @throws Exception 
	 */
	@Test
	public void testDeleteDocument() throws Exception{
		Mockito.when(port.deleteDocument((DeleteDocumentRequest) Mockito.anyObject())).thenReturn(deleteResponse);
		boolean result = bovedaService.deleteDocument(actor, tramite, header, baseObject);
		LOG.info(String.valueOf(result));
		Assert.assertNotNull(result);
	}		
	
	/**
	 * Prueba unitaria para agregar actor a documento de boveda.
	 * @throws Exception 
	 */
	@Test
	public void testAddDocumentActor() throws Exception{
		Mockito.when(port.addDocumentActor((AddDocumentActorRequest) Mockito.anyObject())).thenReturn(addDocumentActorResponse);
		boolean result = bovedaService.addDocumentActor(actor, tramite, newActor, header, baseObject);
		LOG.info(String.valueOf(result));
		Assert.assertNotNull(result);
	}
	
	/**
	 * Prueba unitaria para agregar actor a documento de boveda.
	 * @throws Exception 
	 */
	@Test
	public void testFindDocumentsByMetadata() throws Exception{
		Mockito.when(port.findDocumentsByMetadata((DocumentsByMetadataRequest) Mockito.anyObject())).thenReturn(documentsByMetadataResponse);
		List<DocumentoBovedaTO> result = bovedaService.findDocumentsByMetadata(actor, tramite, metadataValue, header, baseObject);
		LOG.info(String.valueOf(result));
		Assert.assertNotNull(result);
	}
	
	/**
	 * Prueba unitaria para agregar actor a documento de boveda.
	 * @throws Exception 
	 */
	@Test
	public void testGetAllDocumentVersionsByDoc() throws Exception{
		Mockito.when(port.getAllDocumentVersionsByDoc((AllDocumentVersionsByDocRequest) Mockito.anyObject())).thenReturn(allDocumentVersionsByDocResponse);
		List<DocumentoBovedaTO> result = bovedaService.getAllDocumentVersionsByDoc(actor, tramite, header, baseObject);
		LOG.info(String.valueOf(result));
		Assert.assertNotNull(result);
	}	
	
	/**
	 * Prueba unitaria para agregar actor a documento de boveda.
	 * @throws Exception 
	 */
	@Test
	public void testGetAllDocumentVersionsMetadataByDoc() throws Exception{
		Mockito.when(port.getAllDocumentVersionsMetadataByDoc( (AllDocumentVersionsMetadataByDocRequest) Mockito.anyObject())).thenReturn(allDocumentVersionsMetadataByDocResponse);
		List<DocumentoBovedaTO> result = bovedaService.getAllDocumentVersionsMetadataByDoc(actor, tramite, header, baseObject);
		LOG.info(String.valueOf(result));
		Assert.assertNotNull(result);
	}
	
	/**
	 * Prueba unitaria para agregar actor a documento de boveda.
	 * @throws Exception 
	 */
	@Test
	public void testGetAllMetadataByMetadata() throws Exception{
		Mockito.when(port.getAllMetadataByMetadata(  (AllMetadataByMetadataRequest) Mockito.anyObject())).thenReturn(allMetadataByMetadataResponse);
		List<MetadataBovedaTO> result = bovedaService.getAllMetadataByMetadata(actor, tramite, metadataValue, header, baseObject);
		LOG.info(String.valueOf(result));
		Assert.assertNotNull(result);
	}
	
	/**
	 * Prueba unitaria para agregar actor a documento de boveda.
	 * @throws Exception 
	 */
	@Test
	public void testGetMetadataByDoc() throws Exception{
		Mockito.when(port.getMetadataByDoc(  (MetadataByDocRequest) Mockito.anyObject())).thenReturn(metadataByDocResponse);
		MetadataBovedaTO result = bovedaService.getMetadataByDoc(actor, tramite, header, baseObject);
		LOG.info(String.valueOf(result));
		Assert.assertNotNull(result);
	}		
	
}
