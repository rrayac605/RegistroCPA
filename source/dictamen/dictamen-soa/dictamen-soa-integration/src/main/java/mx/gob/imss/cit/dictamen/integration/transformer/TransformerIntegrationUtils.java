package mx.gob.imss.cit.dictamen.integration.transformer;

import java.util.HashMap;
import java.util.Map;

import mx.gob.imss.cit.dictamen.commons.to.BovedaActorTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaBaseObjectTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaDocumentoTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaHeaderTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaMetadataTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaTramiteTO;
import mx.gob.imss.cit.dictamen.commons.to.FirmaElectronicaTO;
import mx.gob.imss.cit.dictamen.commons.util.TransformerHelper;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaActorDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaBaseObjectDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaDocumentoDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaHeaderDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaMetadataDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaTramiteDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.FirmaElectronicaDTO;
import mx.gob.imss.cit.dictamen.services.constants.DictamenServicesConstants;


public class TransformerIntegrationUtils {
	
	
	private TransformerIntegrationUtils(){
		
	}
		
	
	private static Map<Class<?>, Class<?>> mapClass;
	
	
	static{
		mapClass = new HashMap<Class<?>, Class<?>>();		
		
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.BovedaDocumentoTO.class, mx.gob.imss.cit.dictamen.integration.api.dto.BovedaDocumentoDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.BovedaActorTO.class, mx.gob.imss.cit.dictamen.integration.api.dto.BovedaActorDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.BovedaMetadataTO.class, mx.gob.imss.cit.dictamen.integration.api.dto.BovedaMetadataDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.BovedaTramiteTO.class, mx.gob.imss.cit.dictamen.integration.api.dto.BovedaTramiteDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.BovedaBaseObjectTO.class, mx.gob.imss.cit.dictamen.integration.api.dto.BovedaBaseObjectDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.BovedaHeaderTO.class,mx.gob.imss.cit.dictamen.integration.api.dto.BovedaHeaderDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.FirmaElectronicaTO.class,mx.gob.imss.cit.dictamen.integration.api.dto.FirmaElectronicaDTO.class);
		
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.BovedaDocumentoDTO.class, mx.gob.imss.cit.dictamen.commons.to.BovedaDocumentoTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.BovedaActorDTO.class, mx.gob.imss.cit.dictamen.commons.to.BovedaActorTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.BovedaMetadataDTO.class, mx.gob.imss.cit.dictamen.commons.to.BovedaMetadataTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.BovedaTramiteDTO.class, mx.gob.imss.cit.dictamen.commons.to.BovedaTramiteTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.BovedaBaseObjectDTO.class, mx.gob.imss.cit.dictamen.commons.to.BovedaBaseObjectTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.BovedaHeaderDTO.class,mx.gob.imss.cit.dictamen.commons.to.BovedaHeaderTO.class);		
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.FirmaElectronicaDTO.class,mx.gob.imss.cit.dictamen.commons.to.FirmaElectronicaTO.class);	
	}
	


	public static BovedaDocumentoTO transformer( BovedaDocumentoDTO document ) {
		return (BovedaDocumentoTO) TransformerHelper.get(mapClass,document, BovedaDocumentoTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static BovedaMetadataTO transformer(BovedaMetadataDTO metadata){
		return  (BovedaMetadataTO) TransformerHelper.get(mapClass,metadata, BovedaMetadataTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	public static BovedaTramiteTO transformer( BovedaTramiteDTO tramite ) {
		return  (BovedaTramiteTO) TransformerHelper.get(mapClass,tramite, BovedaTramiteTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static BovedaActorTO transformer(BovedaActorDTO actor){
		return (BovedaActorTO) TransformerHelper.get(mapClass,actor, BovedaActorTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	public static BovedaBaseObjectTO transformer(BovedaBaseObjectDTO baseObject){
		return (BovedaBaseObjectTO) TransformerHelper.get(mapClass,baseObject, BovedaBaseObjectTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static BovedaHeaderTO transformer(BovedaHeaderDTO sgbde){
		return (BovedaHeaderTO) TransformerHelper.get(mapClass,sgbde, BovedaHeaderTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
	}	

		
	public static BovedaDocumentoDTO transformer( BovedaDocumentoTO documentoTO ) {
		return (BovedaDocumentoDTO) TransformerHelper.get(mapClass,documentoTO, BovedaDocumentoDTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static BovedaMetadataDTO transformer(BovedaMetadataTO metadataTO){
		return (BovedaMetadataDTO) TransformerHelper.get(mapClass,metadataTO, BovedaMetadataDTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	public static BovedaTramiteDTO transformer( BovedaTramiteTO tramiteTO ) {
		return (BovedaTramiteDTO) TransformerHelper.get(mapClass,tramiteTO, BovedaTramiteDTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static BovedaActorDTO transformer(BovedaActorTO actorTO){
		return (BovedaActorDTO) TransformerHelper.get(mapClass,actorTO, BovedaActorDTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	public static BovedaBaseObjectDTO transformer(BovedaBaseObjectTO baseObjectTO){
		return (BovedaBaseObjectDTO) TransformerHelper.get(mapClass,baseObjectTO, BovedaBaseObjectDTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static BovedaHeaderDTO transformer(BovedaHeaderTO headerTO){
		return (BovedaHeaderDTO) TransformerHelper.get(mapClass,headerTO, BovedaHeaderDTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	public static FirmaElectronicaDTO transformer(FirmaElectronicaTO to){
		return (FirmaElectronicaDTO) TransformerHelper.get(mapClass,to, FirmaElectronicaDTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	public static FirmaElectronicaTO transformer(FirmaElectronicaDTO dto){
		return (FirmaElectronicaTO) TransformerHelper.get(mapClass,dto, FirmaElectronicaTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
	}
}
