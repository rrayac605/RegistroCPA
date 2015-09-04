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
import mx.gob.imss.cit.dictamen.services.constants.DictamenServicesConstants;
import mx.gob.imss.cit.ws.commonschema.SGBDE;


public class TransformerServiceUtils {
	
	private TransformerServiceUtils(){
		
	}
		
	public static ContadorPublicoTO transformer( NdtContadorPublicoAutDO ContadorPublico ) {
		ContadorPublicoTO cont=  (ContadorPublicoTO) TransformerServiceUtilsHelper.get (ContadorPublico, ContadorPublicoTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
	
	public static PersonaTO transformer( DitPersonaDO personaDO ) {
		PersonaTO cont=  (PersonaTO) TransformerServiceUtilsHelper.get (personaDO, PersonaTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
	
	public static DocumentoBovedaTO transformer( Document document ) {
		DocumentoBovedaTO cont=  (DocumentoBovedaTO) TransformerServiceUtilsHelper.get (document, DocumentoBovedaTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static MetadataBovedaTO transformer(Metadata metadata){
		MetadataBovedaTO cont=  (MetadataBovedaTO) TransformerServiceUtilsHelper.get (metadata, MetadataBovedaTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
	
	public static TramiteBovedaTO transformer( Tramite tramite ) {
		TramiteBovedaTO cont=  (TramiteBovedaTO) TransformerServiceUtilsHelper.get (tramite, TramiteBovedaTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static ActorBovedaTO transformer(Actor actor){
		ActorBovedaTO cont=  (ActorBovedaTO) TransformerServiceUtilsHelper.get (actor, ActorBovedaTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
	
	public static BaseObjectBovedaTO transformer(BaseObject baseObject){
		BaseObjectBovedaTO cont=  (BaseObjectBovedaTO) TransformerServiceUtilsHelper.get (baseObject, BaseObjectBovedaTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static HeaderBovedaTO transformer(SGBDE sgbde){
		HeaderBovedaTO cont=  (HeaderBovedaTO) TransformerServiceUtilsHelper.get (sgbde, HeaderBovedaTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	

	public static Document transformer( DocumentoBovedaTO documentoTO ) {
		Document cont=  (Document) TransformerServiceUtilsHelper.get (documentoTO, Document.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Metadata transformer(MetadataBovedaTO metadataTO){
		Metadata cont=  (Metadata) TransformerServiceUtilsHelper.get (metadataTO, Metadata.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
	
	public static Tramite transformer( TramiteBovedaTO tramiteTO ) {
		Tramite cont=  (Tramite) TransformerServiceUtilsHelper.get (tramiteTO, Tramite.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Actor transformer(ActorBovedaTO actorTO){
		Actor cont=  (Actor) TransformerServiceUtilsHelper.get (actorTO, Actor.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
	
	public static BaseObject transformer(BaseObjectBovedaTO baseObjectTO){
		BaseObject cont=  (BaseObject) TransformerServiceUtilsHelper.get (baseObjectTO, BaseObject.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static SGBDE transformer(HeaderBovedaTO headerTO){
		SGBDE cont=  (SGBDE) TransformerServiceUtilsHelper.get (headerTO, SGBDE.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
}
