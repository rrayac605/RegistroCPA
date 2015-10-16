package mx.gob.imss.cit.dictamen.services;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.BovedaActorTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaBaseObjectTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaDocumentoTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaHeaderTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaMetadataTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaTramiteTO;

@Local
/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public interface BovedaService {
	boolean createDocument(BovedaDocumentoTO documento,
			BovedaTramiteTO tramite, BovedaActorTO actor,
			BovedaHeaderTO header, String isEncripted)throws DictamenException;

	BovedaDocumentoTO getDocument(BovedaActorTO actor, BovedaTramiteTO tramite,
			BovedaHeaderTO header, BovedaBaseObjectTO baseObject)throws DictamenException;

	boolean deleteDocument(BovedaActorTO actor, BovedaTramiteTO tramite,
			BovedaHeaderTO header, BovedaBaseObjectTO baseObject)throws DictamenException;

	boolean addDocumentActor(BovedaActorTO actor, BovedaTramiteTO tramite,
			BovedaActorTO newActor, BovedaHeaderTO header,
			BovedaBaseObjectTO baseObject)throws DictamenException;

	List<BovedaDocumentoTO> findDocumentsByMetadata(BovedaActorTO actor,
			BovedaTramiteTO tramite, BovedaMetadataTO metadataValue,
			BovedaHeaderTO header, BovedaBaseObjectTO baseObject)throws DictamenException;

	List<BovedaDocumentoTO> getAllDocumentVersionsByDoc(BovedaActorTO actor,
			BovedaTramiteTO tramite, BovedaHeaderTO header,
			BovedaBaseObjectTO baseObject)throws DictamenException;

	List<BovedaDocumentoTO> getAllDocumentVersionsMetadataByDoc(
			BovedaActorTO actor, BovedaTramiteTO tramite,
			BovedaHeaderTO header, BovedaBaseObjectTO baseObject)throws DictamenException;

	List<BovedaMetadataTO> getAllMetadataByMetadata(BovedaActorTO actor,
			BovedaTramiteTO tramite, BovedaMetadataTO metadataValue,
			BovedaHeaderTO header, BovedaBaseObjectTO baseObject)throws DictamenException;

	BovedaMetadataTO getMetadataByDoc(BovedaActorTO actor,
			BovedaTramiteTO tramite, BovedaHeaderTO header,
			BovedaBaseObjectTO baseObject)throws DictamenException;

}
