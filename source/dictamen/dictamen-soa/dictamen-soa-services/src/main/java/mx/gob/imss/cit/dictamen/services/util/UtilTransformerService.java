package mx.gob.imss.cit.dictamen.services.util;

import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Actor;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.BaseObject;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Document;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Metadata;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Tramite;
import mx.gob.imss.cit.dictamen.commons.to.ActorBovedaTO;
import mx.gob.imss.cit.dictamen.commons.to.BaseObjectBovedaTO;
import mx.gob.imss.cit.dictamen.commons.to.ContadorPublicoTO;
import mx.gob.imss.cit.dictamen.commons.to.DocumentoBovedaTO;
import mx.gob.imss.cit.dictamen.commons.to.HeaderBovedaTO;
import mx.gob.imss.cit.dictamen.commons.to.MetadataBovedaTO;
import mx.gob.imss.cit.dictamen.commons.to.PersonaTO;
import mx.gob.imss.cit.dictamen.commons.to.TramiteBovedaTO;
import mx.gob.imss.cit.dictamen.model.DitPersonaDO;
import mx.gob.imss.cit.dictamen.model.NdtContadorPublicoAutDO;
import mx.gob.imss.cit.dictamen.services.constants.ServicesConstants;
import mx.gob.imss.cit.ws.commonschema.SGBDE;


public class UtilTransformerService {
		
	public static ContadorPublicoTO transformer( NdtContadorPublicoAutDO ContadorPublico ) {
		ContadorPublicoTO cont=  (ContadorPublicoTO) UtilTransformerServiceHelper.get (ContadorPublico, ContadorPublicoTO.class,ServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
	
	public static PersonaTO transformer( DitPersonaDO personaDO ) {
		PersonaTO cont=  (PersonaTO) UtilTransformerServiceHelper.get (personaDO, PersonaTO.class,ServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
	
	public static DocumentoBovedaTO transformer( Document document ) {
		DocumentoBovedaTO cont=  (DocumentoBovedaTO) UtilTransformerServiceHelper.get (document, DocumentoBovedaTO.class,ServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static MetadataBovedaTO transformer(Metadata metadata){
		MetadataBovedaTO cont=  (MetadataBovedaTO) UtilTransformerServiceHelper.get (metadata, MetadataBovedaTO.class,ServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
	
	public static TramiteBovedaTO transformer( Tramite tramite ) {
		TramiteBovedaTO cont=  (TramiteBovedaTO) UtilTransformerServiceHelper.get (tramite, TramiteBovedaTO.class,ServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static ActorBovedaTO transformer(Actor actor){
		ActorBovedaTO cont=  (ActorBovedaTO) UtilTransformerServiceHelper.get (actor, ActorBovedaTO.class,ServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
	
	public static BaseObjectBovedaTO transformer(BaseObject baseObject){
		BaseObjectBovedaTO cont=  (BaseObjectBovedaTO) UtilTransformerServiceHelper.get (baseObject, BaseObjectBovedaTO.class,ServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static HeaderBovedaTO transformer(SGBDE sgbde){
		HeaderBovedaTO cont=  (HeaderBovedaTO) UtilTransformerServiceHelper.get (sgbde, HeaderBovedaTO.class,ServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	

	public static Document transformer( DocumentoBovedaTO documentoTO ) {
		Document cont=  (Document) UtilTransformerServiceHelper.get (documentoTO, Document.class,ServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Metadata transformer(MetadataBovedaTO metadataTO){
		Metadata cont=  (Metadata) UtilTransformerServiceHelper.get (metadataTO, Metadata.class,ServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
	
	public static Tramite transformer( TramiteBovedaTO tramiteTO ) {
		Tramite cont=  (Tramite) UtilTransformerServiceHelper.get (tramiteTO, Tramite.class,ServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Actor transformer(ActorBovedaTO actorTO){
		Actor cont=  (Actor) UtilTransformerServiceHelper.get (actorTO, Actor.class,ServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
	
	public static BaseObject transformer(BaseObjectBovedaTO baseObjectTO){
		BaseObject cont=  (BaseObject) UtilTransformerServiceHelper.get (baseObjectTO, BaseObject.class,ServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static SGBDE transformer(HeaderBovedaTO headerTO){
		SGBDE cont=  (SGBDE) UtilTransformerServiceHelper.get (headerTO, SGBDE.class,ServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
}
