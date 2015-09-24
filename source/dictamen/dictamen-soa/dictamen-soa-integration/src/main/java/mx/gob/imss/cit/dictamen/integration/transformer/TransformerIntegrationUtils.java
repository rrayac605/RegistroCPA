package mx.gob.imss.cit.dictamen.integration.transformer;

import java.util.HashMap;
import java.util.Map;

import mx.gob.imss.cit.dictamen.commons.constants.DictamenConstants;
import mx.gob.imss.cit.dictamen.commons.to.AWSPolicyTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaActorTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaBaseObjectTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaDocumentoTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaHeaderTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaMetadataTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaTramiteTO;
import mx.gob.imss.cit.dictamen.commons.to.FirmaElectronicaTO;
import mx.gob.imss.cit.dictamen.commons.to.LayoutTO;
import mx.gob.imss.cit.dictamen.commons.to.ParentLayoutTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.EjercicioFiscalTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.TipoDictamenTO;
import mx.gob.imss.cit.dictamen.commons.util.TransformerHelper;
import mx.gob.imss.cit.dictamen.integration.api.dto.AWSPolicyDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaActorDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaBaseObjectDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaDocumentoDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaHeaderDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaMetadataDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaTramiteDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.FirmaElectronicaDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.LayoutDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.ParentLayoutDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.EjercicioFiscalDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.TipoDictamenDTO;


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
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.LayoutTO.class,mx.gob.imss.cit.dictamen.integration.api.dto.LayoutDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.ParentLayoutTO.class,mx.gob.imss.cit.dictamen.integration.api.dto.ParentLayoutDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.AWSPolicyTO.class,mx.gob.imss.cit.dictamen.integration.api.dto.AWSPolicyDTO.class);
		
		
		
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.BovedaDocumentoDTO.class, mx.gob.imss.cit.dictamen.commons.to.BovedaDocumentoTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.BovedaActorDTO.class, mx.gob.imss.cit.dictamen.commons.to.BovedaActorTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.BovedaMetadataDTO.class, mx.gob.imss.cit.dictamen.commons.to.BovedaMetadataTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.BovedaTramiteDTO.class, mx.gob.imss.cit.dictamen.commons.to.BovedaTramiteTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.BovedaBaseObjectDTO.class, mx.gob.imss.cit.dictamen.commons.to.BovedaBaseObjectTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.BovedaHeaderDTO.class,mx.gob.imss.cit.dictamen.commons.to.BovedaHeaderTO.class);		
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.FirmaElectronicaDTO.class,mx.gob.imss.cit.dictamen.commons.to.FirmaElectronicaTO.class);	
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.LayoutDTO.class,mx.gob.imss.cit.dictamen.commons.to.LayoutTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.ParentLayoutDTO.class,mx.gob.imss.cit.dictamen.commons.to.ParentLayoutTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.AWSPolicyDTO.class,mx.gob.imss.cit.dictamen.commons.to.AWSPolicyTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.domain.EjercicioFiscalDTO.class,mx.gob.imss.cit.dictamen.commons.to.domain.EjercicioFiscalTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.EjercicioFiscalTO.class,mx.gob.imss.cit.dictamen.integration.api.dto.domain.EjercicioFiscalDTO.class);
		
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.domain.TipoDictamenDTO.class,mx.gob.imss.cit.dictamen.commons.to.domain.TipoDictamenTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.TipoDictamenTO.class,mx.gob.imss.cit.dictamen.integration.api.dto.domain.TipoDictamenDTO.class);
		
		
		
	
	}
	


	public static BovedaDocumentoTO transformer( BovedaDocumentoDTO document ) {
		return (BovedaDocumentoTO) TransformerHelper.get(mapClass,document, BovedaDocumentoTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static BovedaMetadataTO transformer(BovedaMetadataDTO metadata){
		return  (BovedaMetadataTO) TransformerHelper.get(mapClass,metadata, BovedaMetadataTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	public static BovedaTramiteTO transformer( BovedaTramiteDTO tramite ) {
		return  (BovedaTramiteTO) TransformerHelper.get(mapClass,tramite, BovedaTramiteTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static BovedaActorTO transformer(BovedaActorDTO actor){
		return (BovedaActorTO) TransformerHelper.get(mapClass,actor, BovedaActorTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	public static BovedaBaseObjectTO transformer(BovedaBaseObjectDTO baseObject){
		return (BovedaBaseObjectTO) TransformerHelper.get(mapClass,baseObject, BovedaBaseObjectTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static BovedaHeaderTO transformer(BovedaHeaderDTO sgbde){
		return (BovedaHeaderTO) TransformerHelper.get(mapClass,sgbde, BovedaHeaderTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	

		
	public static BovedaDocumentoDTO transformer( BovedaDocumentoTO documentoTO ) {
		return (BovedaDocumentoDTO) TransformerHelper.get(mapClass,documentoTO, BovedaDocumentoDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static BovedaMetadataDTO transformer(BovedaMetadataTO metadataTO){
		return (BovedaMetadataDTO) TransformerHelper.get(mapClass,metadataTO, BovedaMetadataDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	public static BovedaTramiteDTO transformer( BovedaTramiteTO tramiteTO ) {
		return (BovedaTramiteDTO) TransformerHelper.get(mapClass,tramiteTO, BovedaTramiteDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static BovedaActorDTO transformer(BovedaActorTO actorTO){
		return (BovedaActorDTO) TransformerHelper.get(mapClass,actorTO, BovedaActorDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	public static BovedaBaseObjectDTO transformer(BovedaBaseObjectTO baseObjectTO){
		return (BovedaBaseObjectDTO) TransformerHelper.get(mapClass,baseObjectTO, BovedaBaseObjectDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static BovedaHeaderDTO transformer(BovedaHeaderTO headerTO){
		return (BovedaHeaderDTO) TransformerHelper.get(mapClass,headerTO, BovedaHeaderDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	public static FirmaElectronicaDTO transformer(FirmaElectronicaTO to){
		return (FirmaElectronicaDTO) TransformerHelper.get(mapClass,to, FirmaElectronicaDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	public static FirmaElectronicaTO transformer(FirmaElectronicaDTO dto){
		return (FirmaElectronicaTO) TransformerHelper.get(mapClass,dto, FirmaElectronicaTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	
	
	public static ParentLayoutDTO transformer(ParentLayoutTO to){
		return (ParentLayoutDTO) TransformerHelper.get(mapClass,to, ParentLayoutDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	public static ParentLayoutTO transformer(ParentLayoutDTO dto){
		return (ParentLayoutTO) TransformerHelper.get(mapClass,dto, ParentLayoutTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	

	public static LayoutDTO transformer(LayoutTO to){
		return (LayoutDTO) TransformerHelper.get(mapClass,to, LayoutDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	public static LayoutTO transformer(LayoutDTO dto){
		return (LayoutTO) TransformerHelper.get(mapClass,dto, LayoutTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
		
	
	public static AWSPolicyDTO transformer(AWSPolicyTO to){
		return (AWSPolicyDTO) TransformerHelper.get(mapClass,to, AWSPolicyDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	public static AWSPolicyTO transformer(AWSPolicyDTO dto){
		return (AWSPolicyTO) TransformerHelper.get(mapClass,dto, AWSPolicyTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static EjercicioFiscalDTO transformer(EjercicioFiscalTO object){
		return (EjercicioFiscalDTO) TransformerHelper.get(mapClass,object, EjercicioFiscalDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	public static EjercicioFiscalTO transformer(EjercicioFiscalDTO object){
		return (EjercicioFiscalTO) TransformerHelper.get(mapClass,object, EjercicioFiscalTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static TipoDictamenDTO transformer(TipoDictamenTO object){
		return (TipoDictamenDTO) TransformerHelper.get(mapClass,object, TipoDictamenDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static TipoDictamenTO transformer(TipoDictamenDTO object){
		return (TipoDictamenTO) TransformerHelper.get(mapClass,object, TipoDictamenTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	

}
