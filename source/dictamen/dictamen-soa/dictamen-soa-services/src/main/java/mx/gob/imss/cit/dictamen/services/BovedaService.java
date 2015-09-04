package mx.gob.imss.cit.dictamen.services;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.bp.ws.documentows.IDocumentoWSService;
import mx.gob.imss.cit.dictamen.commons.to.BaseObjectBovedaTO;
import mx.gob.imss.cit.dictamen.commons.to.DocumentoBovedaTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.ActorBovedaTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.HeaderBovedaTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.MetadataBovedaTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.TramiteBovedaTO;

@Local
/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public interface BovedaService {
	void setPort(IDocumentoWSService port);
	boolean createDocument(DocumentoBovedaTO documento, TramiteBovedaTO tramite, ActorBovedaTO actor, HeaderBovedaTO header, String isEncripted);
	DocumentoBovedaTO getDocument(ActorBovedaTO actor, TramiteBovedaTO tramite, HeaderBovedaTO header, BaseObjectBovedaTO baseObject);
	boolean deleteDocument(ActorBovedaTO actor, TramiteBovedaTO tramite, HeaderBovedaTO header, BaseObjectBovedaTO baseObject);
	boolean addDocumentActor(ActorBovedaTO actor, TramiteBovedaTO tramite, ActorBovedaTO newActor, HeaderBovedaTO header, BaseObjectBovedaTO baseObject);
	List<DocumentoBovedaTO> findDocumentsByMetadata(ActorBovedaTO actor, TramiteBovedaTO tramite, MetadataBovedaTO metadataValue, HeaderBovedaTO header, BaseObjectBovedaTO baseObject);
	List<DocumentoBovedaTO> getAllDocumentVersionsByDoc(ActorBovedaTO actor, TramiteBovedaTO tramite, HeaderBovedaTO header, BaseObjectBovedaTO baseObject);
	List<DocumentoBovedaTO> getAllDocumentVersionsMetadataByDoc(ActorBovedaTO actor, TramiteBovedaTO tramite, HeaderBovedaTO header, BaseObjectBovedaTO baseObject);
	List<MetadataBovedaTO> getAllMetadataByMetadata(ActorBovedaTO actor, TramiteBovedaTO tramite, MetadataBovedaTO metadataValue, HeaderBovedaTO header, BaseObjectBovedaTO baseObject);
	MetadataBovedaTO getMetadataByDoc(ActorBovedaTO actor, TramiteBovedaTO tramite, HeaderBovedaTO header, BaseObjectBovedaTO baseObject);
	
}

