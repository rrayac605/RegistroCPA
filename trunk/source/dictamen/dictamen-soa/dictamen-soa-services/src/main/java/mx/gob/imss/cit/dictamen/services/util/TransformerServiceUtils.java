package mx.gob.imss.cit.dictamen.services.util;

import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Actor;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.BaseObject;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Document;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Metadata;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Tramite;
import mx.gob.imss.cit.dictamen.commons.to.BaseObjectBovedaTO;
import mx.gob.imss.cit.dictamen.commons.to.DocumentoBovedaTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.ActorBovedaTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.ContadorPublicoTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.HeaderBovedaTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.MetadataBovedaTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.PersonaTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.TramiteBovedaTO;
import mx.gob.imss.cit.dictamen.model.DitPersonaDO;
import mx.gob.imss.cit.dictamen.model.NdtContadorPublicoAutDO;
import mx.gob.imss.cit.dictamen.services.constants.DictamenServicesConstants;
import mx.gob.imss.cit.ws.commonschema.SGBDE;


public class TransformerServiceUtils {
	
	private TransformerServiceUtils(){
		
	}
		
	public static ContadorPublicoTO transformer( NdtContadorPublicoAutDO ContadorPublico ) {
		ContadorPublicoTO cont=  (ContadorPublicoTO) TransformerServiceHelperUtils.get (ContadorPublico, ContadorPublicoTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
	
	public static PersonaTO transformer( DitPersonaDO personaDO ) {
		PersonaTO cont=  (PersonaTO) TransformerServiceHelperUtils.get (personaDO, PersonaTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
	
	public static DocumentoBovedaTO transformer( Document document ) {
		DocumentoBovedaTO cont=  (DocumentoBovedaTO) TransformerServiceHelperUtils.get (document, DocumentoBovedaTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static MetadataBovedaTO transformer(Metadata metadata){
		MetadataBovedaTO cont=  (MetadataBovedaTO) TransformerServiceHelperUtils.get (metadata, MetadataBovedaTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
	
	public static TramiteBovedaTO transformer( Tramite tramite ) {
		TramiteBovedaTO cont=  (TramiteBovedaTO) TransformerServiceHelperUtils.get (tramite, TramiteBovedaTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static ActorBovedaTO transformer(Actor actor){
		ActorBovedaTO cont=  (ActorBovedaTO) TransformerServiceHelperUtils.get (actor, ActorBovedaTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
	
	public static BaseObjectBovedaTO transformer(BaseObject baseObject){
		BaseObjectBovedaTO cont=  (BaseObjectBovedaTO) TransformerServiceHelperUtils.get (baseObject, BaseObjectBovedaTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static HeaderBovedaTO transformer(SGBDE sgbde){
		HeaderBovedaTO cont=  (HeaderBovedaTO) TransformerServiceHelperUtils.get (sgbde, HeaderBovedaTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	

	public static Document transformer( DocumentoBovedaTO documentoTO ) {
		Document cont=  (Document) TransformerServiceHelperUtils.get (documentoTO, Document.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Metadata transformer(MetadataBovedaTO metadataTO){
		Metadata cont=  (Metadata) TransformerServiceHelperUtils.get (metadataTO, Metadata.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
	
	public static Tramite transformer( TramiteBovedaTO tramiteTO ) {
		Tramite cont=  (Tramite) TransformerServiceHelperUtils.get (tramiteTO, Tramite.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Actor transformer(ActorBovedaTO actorTO){
		Actor cont=  (Actor) TransformerServiceHelperUtils.get (actorTO, Actor.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
	
	public static BaseObject transformer(BaseObjectBovedaTO baseObjectTO){
		BaseObject cont=  (BaseObject) TransformerServiceHelperUtils.get (baseObjectTO, BaseObject.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static SGBDE transformer(HeaderBovedaTO headerTO){
		SGBDE cont=  (SGBDE) TransformerServiceHelperUtils.get (headerTO, SGBDE.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
}
