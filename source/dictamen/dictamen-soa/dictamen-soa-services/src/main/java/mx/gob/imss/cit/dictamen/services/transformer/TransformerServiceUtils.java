package mx.gob.imss.cit.dictamen.services.transformer;

import java.util.HashMap;
import java.util.Map;

import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Actor;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.BaseObject;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Document;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Metadata;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Tramite;
import mx.gob.imss.cit.dictamen.commons.constants.DictamenConstants;
import mx.gob.imss.cit.dictamen.commons.to.BovedaActorTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaBaseObjectTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaDocumentoTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaHeaderTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaMetadataTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaTramiteTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.ContadorPublicoAutTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.EjercicioFiscalTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.PatronDictamenTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.PreguntaTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.RubroTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.TipoDictamenTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.TipoRespuestaTO;
import mx.gob.imss.cit.dictamen.commons.util.TransformerHelper;
import mx.gob.imss.cit.dictamen.model.NdcAtestiguamientoDO;
import mx.gob.imss.cit.dictamen.model.NdcEjercicioFiscalDO;
import mx.gob.imss.cit.dictamen.model.NdcPreguntaDO;
import mx.gob.imss.cit.dictamen.model.NdcRubroDO;
import mx.gob.imss.cit.dictamen.model.NdcTipoDictamenDO;
import mx.gob.imss.cit.dictamen.model.NdcTipoRespuestaDO;
import mx.gob.imss.cit.dictamen.model.NdtContadorPublicoAutDO;
import mx.gob.imss.cit.dictamen.model.NdtPatronDictamenDO;
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
		mapClass.put(mx.gob.imss.cit.dictamen.model.NdtPatronDictamenDO.class,mx.gob.imss.cit.dictamen.commons.to.domain.PatronDictamenTO.class);
		
		
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.BovedaDocumentoTO.class, mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Document.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.BovedaActorTO.class, mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Actor.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.BovedaMetadataTO.class, mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Metadata.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.BovedaTramiteTO.class, mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Tramite.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.BovedaBaseObjectTO.class, mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.BaseObject.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.BovedaHeaderTO.class, mx.gob.imss.cit.ws.commonschema.SGBDE.class);				
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.PatronDictamenTO.class,mx.gob.imss.cit.dictamen.model.NdtPatronDictamenDO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.model.NdtPatronDictamenDO.class,mx.gob.imss.cit.dictamen.commons.to.domain.PatronDictamenTO.class);
		
		
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoTO.class,mx.gob.imss.cit.dictamen.model.NdcAtestiguamientoDO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.RubroTO.class,mx.gob.imss.cit.dictamen.model.NdcRubroDO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.PreguntaTO.class,mx.gob.imss.cit.dictamen.model.NdcPreguntaDO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.TipoRespuestaTO.class,mx.gob.imss.cit.dictamen.model.NdcTipoRespuestaDO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.model.NdcAtestiguamientoDO.class	,mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoTO.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.model.NdcRubroDO.class			,mx.gob.imss.cit.dictamen.commons.to.domain.RubroTO.class			);
		mapClass.put(mx.gob.imss.cit.dictamen.model.NdcPreguntaDO.class			,mx.gob.imss.cit.dictamen.commons.to.domain.PreguntaTO.class		);
		mapClass.put(mx.gob.imss.cit.dictamen.model.NdcTipoRespuestaDO.class	,mx.gob.imss.cit.dictamen.commons.to.domain.TipoRespuestaTO.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.model.NdcEjercicioFiscalDO.class			,mx.gob.imss.cit.dictamen.commons.to.domain.EjercicioFiscalTO.class		);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.EjercicioFiscalTO.class	,mx.gob.imss.cit.dictamen.model.NdcEjercicioFiscalDO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.TipoDictamenTO.class	,mx.gob.imss.cit.dictamen.model.NdcTipoDictamenDO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.model.NdcTipoDictamenDO.class			,mx.gob.imss.cit.dictamen.commons.to.domain.TipoDictamenTO.class		);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.ContadorPublicoAutTO.class	,mx.gob.imss.cit.dictamen.model.NdtContadorPublicoAutDO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.model.NdtContadorPublicoAutDO.class,mx.gob.imss.cit.dictamen.commons.to.domain.ContadorPublicoAutTO.class);
		
}
	
	
	private TransformerServiceUtils(){
		
	}



	public static BovedaDocumentoTO transformer( Document document ) {
		
		return (BovedaDocumentoTO) TransformerHelper.get(mapClass,document, BovedaDocumentoTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static BovedaMetadataTO transformer(Metadata metadata){		
		return (BovedaMetadataTO) TransformerHelper.get(mapClass,metadata, BovedaMetadataTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	public static BovedaTramiteTO transformer( Tramite tramite ) {
		return (BovedaTramiteTO) TransformerHelper.get(mapClass,tramite, BovedaTramiteTO.class,DictamenConstants.PROFUNDIDAD_MAPEO);
	}	
	
	public static BovedaActorTO transformer(Actor actor){
		return  (BovedaActorTO) TransformerHelper.get(mapClass,actor, BovedaActorTO.class,DictamenConstants.PROFUNDIDAD_MAPEO);
	}
	
	public static BovedaBaseObjectTO transformer(BaseObject baseObject){
		return (BovedaBaseObjectTO) TransformerHelper.get(mapClass,baseObject, BovedaBaseObjectTO.class,DictamenConstants.PROFUNDIDAD_MAPEO);
	}	
	
	public static BovedaHeaderTO transformer(SGBDE sgbde){		
		return (BovedaHeaderTO) TransformerHelper.get(mapClass,sgbde, BovedaHeaderTO.class,DictamenConstants.PROFUNDIDAD_MAPEO);
	}	

	public static Document transformer( BovedaDocumentoTO documentoTO ) {		
		return (Document) TransformerHelper.get(mapClass,documentoTO, Document.class,DictamenConstants.PROFUNDIDAD_MAPEO);
	}	
	
	public static Metadata transformer(BovedaMetadataTO metadataTO){		
		return (Metadata) TransformerHelper.get(mapClass,metadataTO, Metadata.class,DictamenConstants.PROFUNDIDAD_MAPEO);
	}
	
	public static Tramite transformer( BovedaTramiteTO tramiteTO ) {
		return  (Tramite) TransformerHelper.get(mapClass,tramiteTO, Tramite.class,DictamenConstants.PROFUNDIDAD_MAPEO);
	}	
	
	public static Actor transformer(BovedaActorTO actorTO){		
		return (Actor) TransformerHelper.get(mapClass,actorTO, Actor.class,DictamenConstants.PROFUNDIDAD_MAPEO);
	}
	
	public static BaseObject transformer(BovedaBaseObjectTO baseObjectTO){
		return (BaseObject) TransformerHelper.get(mapClass,baseObjectTO, BaseObject.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static SGBDE transformer(BovedaHeaderTO headerTO){ 
		return (SGBDE) TransformerHelper.get(mapClass,headerTO, SGBDE.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	
	
	
	
	
	
	public static NdtPatronDictamenDO transformer( PatronDictamenTO patron ) {
		NdtPatronDictamenDO cont=  (NdtPatronDictamenDO) TransformerHelper.get(mapClass,patron, NdtPatronDictamenDO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		
		NdcTipoDictamenDO ndcTipoDictamenDO=new NdcTipoDictamenDO();
		ndcTipoDictamenDO.setCveIdTipoDictamen(patron.getCveIdTipoDictamenId());
		NdcEjercicioFiscalDO ndcEjercicioFiscalDO=new NdcEjercicioFiscalDO();
		ndcEjercicioFiscalDO.setCveIdEjerFiscal(patron.getCveIdEjerFiscalId());
		
		cont.setCveIdEjerFiscal(ndcEjercicioFiscalDO);
		cont.setCveIdTipoDictamen(ndcTipoDictamenDO);
		
		return cont;
	}	
	
	public static PatronDictamenTO transformer( NdtPatronDictamenDO patron ) {
		PatronDictamenTO cont=  (PatronDictamenTO) TransformerHelper.get(mapClass,patron, PatronDictamenTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		
		if(patron.getCveIdTipoDictamen()!=null){
			cont.setCveIdTipoDictamenId(patron.getCveIdTipoDictamen().getCveIdTipoDictamen());
		}
		if(patron.getCveIdEjerFiscal()!=null){
			cont.setCveIdEjerFiscalId(patron.getCveIdEjerFiscal().getCveIdEjerFiscal());
		}

		return cont;
	}	
	
	

	
	public static NdcAtestiguamientoDO transformer( AtestiguamientoTO AtestiguamientoTO ) {
		NdcAtestiguamientoDO cont= (NdcAtestiguamientoDO) TransformerHelper.get(mapClass,AtestiguamientoTO, NdcAtestiguamientoDO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static NdcRubroDO transformer( RubroTO rubroTO ) {
		NdcRubroDO cont= (NdcRubroDO) TransformerHelper.get(mapClass,rubroTO, NdcRubroDO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static NdcPreguntaDO transformer( PreguntaTO preguntaTO ) {
		NdcPreguntaDO cont= (NdcPreguntaDO) TransformerHelper.get(mapClass,preguntaTO, NdcPreguntaDO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static NdcTipoRespuestaDO transformer( TipoRespuestaTO tipoRespuestaTO ) {
		NdcTipoRespuestaDO cont= (NdcTipoRespuestaDO) TransformerHelper.get(mapClass,tipoRespuestaTO, NdcTipoRespuestaDO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoRespuestaTO transformer( NdcTipoRespuestaDO ndcTipoRespuestaDO ) {
		TipoRespuestaTO cont= (TipoRespuestaTO) TransformerHelper.get(mapClass,ndcTipoRespuestaDO, TipoRespuestaTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static PreguntaTO transformer( NdcPreguntaDO ndcPreguntaDO ) {
		PreguntaTO cont= (PreguntaTO) TransformerHelper.get(mapClass,ndcPreguntaDO, PreguntaTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static RubroTO transformer( NdcRubroDO ndcRubroDO ) {
		RubroTO cont= (RubroTO) TransformerHelper.get(mapClass,ndcRubroDO, RubroTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static AtestiguamientoTO transformer( NdcAtestiguamientoDO ndcAtestiguamientoDO ) {
		AtestiguamientoTO cont= (AtestiguamientoTO) TransformerHelper.get(mapClass,ndcAtestiguamientoDO, AtestiguamientoTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static EjercicioFiscalTO transformer( NdcEjercicioFiscalDO ejerDO ) {
		return (EjercicioFiscalTO) TransformerHelper.get(mapClass,ejerDO, EjercicioFiscalTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static NdcEjercicioFiscalDO transformer( EjercicioFiscalTO ejerTO ) {
		return  (NdcEjercicioFiscalDO) TransformerHelper.get(mapClass,ejerTO, NdcEjercicioFiscalDO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	public static NdcTipoDictamenDO transformer( TipoDictamenTO object) {
		return (NdcTipoDictamenDO) TransformerHelper.get(mapClass,object, NdcTipoDictamenDO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	public static TipoDictamenTO transformer( NdcTipoDictamenDO object ) {
		return (TipoDictamenTO) TransformerHelper.get(mapClass,object, TipoDictamenTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	public static ContadorPublicoAutTO transformer( NdtContadorPublicoAutDO object ) {
		return (ContadorPublicoAutTO) TransformerHelper.get(mapClass,object, ContadorPublicoAutTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	public static NdtContadorPublicoAutDO transformer( ContadorPublicoAutTO object ) {
		return (NdtContadorPublicoAutDO) TransformerHelper.get(mapClass,object, NdtContadorPublicoAutDO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
}
