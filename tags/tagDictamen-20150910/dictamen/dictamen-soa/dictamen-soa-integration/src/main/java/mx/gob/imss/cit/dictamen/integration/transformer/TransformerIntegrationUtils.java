package mx.gob.imss.cit.dictamen.integration.transformer;

import java.util.HashMap;
import java.util.Map;

import mx.gob.imss.cit.dictamen.commons.to.BovedaActorTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaBaseObjectTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaDocumentoTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaHeaderTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaMetadataTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaTramiteTO;
import mx.gob.imss.cit.dictamen.commons.util.TransformerHelper;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaActorDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaBaseObjectDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaDocumentoDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaHeaderDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaMetadataDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaTramiteDTO;
import mx.gob.imss.cit.dictamen.services.constants.DictamenServicesConstants;


public class TransformerIntegrationUtils {
	
	private static Map<Class<?>, Class<?>> mapClass;
	
	static{
		mapClass = new HashMap<Class<?>, Class<?>>();		
		
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.BovedaDocumentoTO.class, mx.gob.imss.cit.dictamen.integration.api.dto.BovedaDocumentoDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.BovedaActorTO.class, mx.gob.imss.cit.dictamen.integration.api.dto.BovedaActorDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.BovedaMetadataTO.class, mx.gob.imss.cit.dictamen.integration.api.dto.BovedaMetadataDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.BovedaTramiteTO.class, mx.gob.imss.cit.dictamen.integration.api.dto.BovedaTramiteDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.BovedaBaseObjectTO.class, mx.gob.imss.cit.dictamen.integration.api.dto.BovedaBaseObjectDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.BovedaHeaderTO.class,mx.gob.imss.cit.dictamen.integration.api.dto.BovedaHeaderDTO.class);
		
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.BovedaDocumentoDTO.class, mx.gob.imss.cit.dictamen.commons.to.BovedaDocumentoTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.BovedaActorDTO.class, mx.gob.imss.cit.dictamen.commons.to.BovedaActorTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.BovedaMetadataDTO.class, mx.gob.imss.cit.dictamen.commons.to.BovedaMetadataTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.BovedaTramiteDTO.class, mx.gob.imss.cit.dictamen.commons.to.BovedaTramiteTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.BovedaBaseObjectDTO.class, mx.gob.imss.cit.dictamen.commons.to.BovedaBaseObjectTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.BovedaHeaderDTO.class,mx.gob.imss.cit.dictamen.commons.to.BovedaHeaderTO.class);		
	}
	

	
	private TransformerIntegrationUtils(){
		
	}
		

	
	public static BovedaDocumentoTO transformer( BovedaDocumentoDTO document ) {
		BovedaDocumentoTO cont=  (BovedaDocumentoTO) TransformerHelper.get(mapClass,document, BovedaDocumentoTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static BovedaMetadataTO transformer(BovedaMetadataDTO metadata){
		BovedaMetadataTO cont=  (BovedaMetadataTO) TransformerHelper.get(mapClass,metadata, BovedaMetadataTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
	
	public static BovedaTramiteTO transformer( BovedaTramiteDTO tramite ) {
		BovedaTramiteTO cont=  (BovedaTramiteTO) TransformerHelper.get(mapClass,tramite, BovedaTramiteTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static BovedaActorTO transformer(BovedaActorDTO actor){
		BovedaActorTO cont=  (BovedaActorTO) TransformerHelper.get(mapClass,actor, BovedaActorTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
	
	public static BovedaBaseObjectTO transformer(BovedaBaseObjectDTO baseObject){
		BovedaBaseObjectTO cont=  (BovedaBaseObjectTO) TransformerHelper.get(mapClass,baseObject, BovedaBaseObjectTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static BovedaHeaderTO transformer(BovedaHeaderDTO sgbde){
		BovedaHeaderTO cont=  (BovedaHeaderTO) TransformerHelper.get(mapClass,sgbde, BovedaHeaderTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	

		
	public static BovedaDocumentoDTO transformer( BovedaDocumentoTO documentoTO ) {
		BovedaDocumentoDTO cont=  (BovedaDocumentoDTO) TransformerHelper.get(mapClass,documentoTO, BovedaDocumentoDTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static BovedaMetadataDTO transformer(BovedaMetadataTO metadataTO){
		BovedaMetadataDTO cont=  (BovedaMetadataDTO) TransformerHelper.get(mapClass,metadataTO, BovedaMetadataDTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
	
	public static BovedaTramiteDTO transformer( BovedaTramiteTO tramiteTO ) {
		BovedaTramiteDTO cont=  (BovedaTramiteDTO) TransformerHelper.get(mapClass,tramiteTO, BovedaTramiteDTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static BovedaActorDTO transformer(BovedaActorTO actorTO){
		BovedaActorDTO cont=  (BovedaActorDTO) TransformerHelper.get(mapClass,actorTO, BovedaActorDTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
	
	public static BovedaBaseObjectDTO transformer(BovedaBaseObjectTO baseObjectTO){
		BovedaBaseObjectDTO cont=  (BovedaBaseObjectDTO) TransformerHelper.get(mapClass,baseObjectTO, BovedaBaseObjectDTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static BovedaHeaderDTO transformer(BovedaHeaderTO headerTO){
		BovedaHeaderDTO cont=  (BovedaHeaderDTO) TransformerHelper.get(mapClass,headerTO, BovedaHeaderDTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
}
