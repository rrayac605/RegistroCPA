/**
 * 
 */
package mx.gob.imss.cit.de.dictaminacion.services;

import java.util.List;

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
import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;
import mx.gob.imss.cit.de.dictaminacion.commons.to.BovedaActorTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.BovedaBaseObjectTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.BovedaDocumentoTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.BovedaHeaderTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.BovedaMetadataTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.BovedaTramiteTO;
import mx.gob.imss.cit.de.dictaminacion.services.BovedaService;
import mx.gob.imss.cit.de.dictaminacion.services.impl.BovedaServiceImpl;
import mx.gob.imss.cit.ws.commonschema.GovernanceHeaderResponse;
import mx.gob.imss.cit.ws.commonschema.SGBDS;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


/**
 * @author cmarmolejo
 *
 */
public class BovedaServiceTest{
	
	private Logger LOG=Logger.getLogger(BovedaServiceTest.class);
	/**
	 * Setvicio BovedaService para pruebas unitarias
	 */
	@InjectMocks
	private BovedaService bovedaService = new BovedaServiceImpl();; 
	
	
	private BovedaActorTO newActor;	
	private BovedaDocumentoTO documento;
	private BovedaActorTO actor;
	private BovedaTramiteTO tramite;
	private BovedaMetadataTO metadataValue;
	private BovedaBaseObjectTO baseObject;
	private String isEncripted="false";
	private BovedaHeaderTO header;
		
	@Mock
	private IDocumentoWSService port;
	
	private CreateDocumentResponse createResponse;
	private DocumentResponse documentResponse;	
	private DeleteDocumentResponse deleteResponse;
	private AddDocumentActorResponse addDocumentActorResponse;	
	private DocumentsByMetadataResponse documentsByMetadataResponse;
	private AllDocumentVersionsByDocResponse allDocumentVersionsByDocResponse;
	private AllDocumentVersionsMetadataByDocResponse allDocumentVersionsMetadataByDocResponse;
	private AllMetadataByMetadataResponse allMetadataByMetadataResponse;
	private MetadataByDocResponse metadataByDocResponse;
	private GovernanceHeaderResponse gHheader;	
	private SGBDS sgbds;
	
	/**
	 * Método de configuración para pruebas unitarias
	 * @throws Exception
	 */
	@Before
	public void init() throws Exception {	
		inicializarMocks();
	}

	private void inicializarMocks() {
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
		
		Mockito.when(port.createDocument((CreateDocumentRequest) Mockito.anyObject())).thenReturn(createResponse);
		Mockito.when(port.getDocument((DocumentRequest) Mockito.anyObject())).thenReturn(documentResponse);
		Mockito.when(port.deleteDocument((DeleteDocumentRequest) Mockito.anyObject())).thenReturn(deleteResponse);
		Mockito.when(port.findDocumentsByMetadata((DocumentsByMetadataRequest) Mockito.anyObject())).thenReturn(documentsByMetadataResponse);
		Mockito.when(port.getAllDocumentVersionsMetadataByDoc( (AllDocumentVersionsMetadataByDocRequest) Mockito.anyObject())).thenReturn(allDocumentVersionsMetadataByDocResponse);
		Mockito.when(port.getMetadataByDoc(  (MetadataByDocRequest) Mockito.anyObject())).thenReturn(metadataByDocResponse);
		Mockito.when(port.getAllDocumentVersionsByDoc((AllDocumentVersionsByDocRequest) Mockito.anyObject())).thenReturn(allDocumentVersionsByDocResponse);
		Mockito.when(port.addDocumentActor((AddDocumentActorRequest) Mockito.anyObject())).thenReturn(addDocumentActorResponse);
		Mockito.when(port.getAllMetadataByMetadata(  (AllMetadataByMetadataRequest) Mockito.anyObject())).thenReturn(allMetadataByMetadataResponse);
	}
    
	/**
	 * Prueba unitaria para crear documento en boveda.
	 */
	@Test
	public void testCreateDocument(){
		
		boolean result=false;
		try {
			result = bovedaService.createDocument(documento, tramite, actor, header , isEncripted);
		} catch (DictamenException e) {
			LOG.error(e.getMessage());
		}
		
		LOG.info(String.valueOf(result));
		Assert.assertNotNull(result);
	}
	
	/**
	 * Prueba unitaria para recuperar documento de boveda.
	 * @throws Exception 
	 */
	@Test
	public void testGetDocument() throws Exception{

		BovedaDocumentoTO result = bovedaService.getDocument(actor, tramite, header, baseObject);
		LOG.info(String.valueOf(result));
		Assert.assertNotNull(result);
	}	
	
	/**
	 * Prueba unitaria para borrar documento de boveda.
	 * @throws Exception 
	 */
	@Test
	public void testDeleteDocument() throws Exception{
		
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
		
		List<BovedaDocumentoTO> result = bovedaService.findDocumentsByMetadata(actor, tramite, metadataValue, header, baseObject);
		LOG.info(String.valueOf(result));
		Assert.assertNotNull(result);
	}
	
	/**
	 * Prueba unitaria para agregar actor a documento de boveda.
	 * @throws Exception 
	 */
	@Test
	public void testGetAllDocumentVersionsByDoc() throws Exception{
	
		List<BovedaDocumentoTO> result = bovedaService.getAllDocumentVersionsByDoc(actor, tramite, header, baseObject);
		LOG.info(String.valueOf(result));
		Assert.assertNotNull(result);
	}	
	
	/**
	 * Prueba unitaria para agregar actor a documento de boveda.
	 * @throws Exception 
	 */
	@Test
	public void testGetAllDocumentVersionsMetadataByDoc() throws Exception{
	
		List<BovedaDocumentoTO> result = bovedaService.getAllDocumentVersionsMetadataByDoc(actor, tramite, header, baseObject);
		LOG.info(String.valueOf(result));
		Assert.assertNotNull(result);
	}
	
	/**
	 * Prueba unitaria para agregar actor a documento de boveda.
	 * @throws Exception 
	 */
	@Test
	public void testGetAllMetadataByMetadata() throws Exception{
	
		List<BovedaMetadataTO> result = bovedaService.getAllMetadataByMetadata(actor, tramite, metadataValue, header, baseObject);
		LOG.info(String.valueOf(result));
		Assert.assertNotNull(result);
	}
	
	/**
	 * Prueba unitaria para agregar actor a documento de boveda.
	 * @throws Exception 
	 */
	@Test
	public void testGetMetadataByDoc() throws Exception{

		BovedaMetadataTO result = bovedaService.getMetadataByDoc(actor, tramite, header, baseObject);
		LOG.info(String.valueOf(result));
		Assert.assertNotNull(result);
	}		
	
}
