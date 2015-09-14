package mx.gob.imss.cit.dictamen.services.transformer;

import java.util.HashMap;
import java.util.Map;

import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Actor;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.BaseObject;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Document;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Metadata;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Tramite;
import mx.gob.imss.cit.dictamen.commons.to.BovedaActorTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaBaseObjectTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaDocumentoTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaHeaderTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaMetadataTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaTramiteTO;
import mx.gob.imss.cit.dictamen.commons.util.TransformerHelper;
import mx.gob.imss.cit.dictamen.services.constants.DictamenServicesConstants;
import mx.gob.imss.cit.ws.commonschema.SGBDE;


public class TransformerServiceUtils {
	
	private static Map<Class<?>, Class<?>> mapClass;
	
	static{
		mapClass = new HashMap<Class<?>, Class<?>>();		
		
		mapClass.put(mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Document.class,mx.gob.imss.cit.dictamen.commons.to.BovedaDocumentoTO.class);
		mapClass.put(mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Actor.class,mx.gob.imss.cit.dictamen.commons.to.BovedaActorTO.class);
		mapClass.put(mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Metadata.class,mx.gob.imss.cit.dictamen.commons.to.BovedaMetadataTO.class);
		mapClass.put(mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Tramite.class,mx.gob.imss.cit.dictamen.commons.to.BovedaTramiteTO.class);
		mapClass.put(mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.BaseObject.class,mx.gob.imss.cit.dictamen.commons.to.BovedaBaseObjectTO.class);
		mapClass.put(mx.gob.imss.cit.ws.commonschema.SGBDE.class,mx.gob.imss.cit.dictamen.commons.to.BovedaHeaderTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.BovedaDocumentoTO.class, mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Document.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.BovedaActorTO.class, mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Actor.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.BovedaMetadataTO.class, mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Metadata.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.BovedaTramiteTO.class, mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Tramite.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.BovedaBaseObjectTO.class, mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.BaseObject.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.BovedaHeaderTO.class, mx.gob.imss.cit.ws.commonschema.SGBDE.class);		
	}
	
	
	private TransformerServiceUtils(){
		
	}



	public static BovedaDocumentoTO transformer( Document document ) {
		BovedaDocumentoTO cont=  (BovedaDocumentoTO) TransformerHelper.get(mapClass,document, BovedaDocumentoTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static BovedaMetadataTO transformer(Metadata metadata){
		BovedaMetadataTO cont=  (BovedaMetadataTO) TransformerHelper.get(mapClass,metadata, BovedaMetadataTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
	
	public static BovedaTramiteTO transformer( Tramite tramite ) {
		BovedaTramiteTO cont=  (BovedaTramiteTO) TransformerHelper.get(mapClass,tramite, BovedaTramiteTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static BovedaActorTO transformer(Actor actor){
		BovedaActorTO cont=  (BovedaActorTO) TransformerHelper.get(mapClass,actor, BovedaActorTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
	
	public static BovedaBaseObjectTO transformer(BaseObject baseObject){
		BovedaBaseObjectTO cont=  (BovedaBaseObjectTO) TransformerHelper.get(mapClass,baseObject, BovedaBaseObjectTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static BovedaHeaderTO transformer(SGBDE sgbde){
		BovedaHeaderTO cont=  (BovedaHeaderTO) TransformerHelper.get(mapClass,sgbde, BovedaHeaderTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	

	public static Document transformer( BovedaDocumentoTO documentoTO ) {
		Document cont=  (Document) TransformerHelper.get(mapClass,documentoTO, Document.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Metadata transformer(BovedaMetadataTO metadataTO){
		Metadata cont=  (Metadata) TransformerHelper.get(mapClass,metadataTO, Metadata.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
	
	public static Tramite transformer( BovedaTramiteTO tramiteTO ) {
		Tramite cont=  (Tramite) TransformerHelper.get(mapClass,tramiteTO, Tramite.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Actor transformer(BovedaActorTO actorTO){
		Actor cont=  (Actor) TransformerHelper.get(mapClass,actorTO, Actor.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
	
	public static BaseObject transformer(BovedaBaseObjectTO baseObjectTO){
		BaseObject cont=  (BaseObject) TransformerHelper.get(mapClass,baseObjectTO, BaseObject.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static SGBDE transformer(BovedaHeaderTO headerTO){
		SGBDE cont=  (SGBDE) TransformerHelper.get(mapClass,headerTO, SGBDE.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
}
