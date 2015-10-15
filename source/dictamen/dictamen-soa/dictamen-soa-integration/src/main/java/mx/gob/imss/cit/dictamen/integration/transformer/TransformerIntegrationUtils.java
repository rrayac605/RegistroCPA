package mx.gob.imss.cit.dictamen.integration.transformer;

import java.util.HashMap;
import java.util.Map;

import mx.gob.imss.cit.dictamen.commons.constants.DictamenConstants;
import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
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
import mx.gob.imss.cit.dictamen.commons.to.domain.AtestigPreguntasRespuestTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoDictamenTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.EjercicioFiscalTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.EstadoCargaDocumentoTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.OpcionPreguntaTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.PatronAsociadoTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.PatronDictamenTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.PreguntaTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.RubroAtestiguamientoDictTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.RubroTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.TipoDictamenTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.TipoRespuestaTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.CedulaPagosDiferenciasTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.CedulaPrestacionesTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.CedulaRemuneracionesTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.DetFondoAhorroTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.DetOtrosIngXsalarioTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.DetOtrosPagXseparacTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.DetPagosOtrosEmpleadTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.PrestacionesTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.RemuneracionesTO;
import mx.gob.imss.cit.dictamen.commons.util.ConverterUtils;
import mx.gob.imss.cit.dictamen.commons.util.TransformerHelper;
import mx.gob.imss.cit.dictamen.integration.api.dto.AWSPolicyDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaActorDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaBaseObjectDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaDocumentoDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaHeaderDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaMetadataDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaTramiteDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.EstadoCargaDocumentoDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.FirmaElectronicaDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.LayoutDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.ParentLayoutDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.AtestigPreguntasRespuestDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.AtestiguamientoDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.AtestiguamientoDictamenDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.EjercicioFiscalDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.OpcionPreguntaDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.PatronAsociadoDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.PatronDictamenDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.PreguntaDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.RubroAtestiguamientoDictDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.RubroDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.TipoDictamenDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.TipoRespuestaDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.CedulaRemuneracionesDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.DetFondoAhorroDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.DetOtrosIngXsalarioDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.DetOtrosPagXseparacDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.DetPagosOtrosEmpleadDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.CedulaPrestacionesDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.CedulaPagosDiferenciasDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.PrestacionesDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.RemuneracionesDTO;


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
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.PatronDictamenTO.class,mx.gob.imss.cit.dictamen.integration.api.dto.domain.PatronDictamenDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.domain.PatronDictamenDTO.class,mx.gob.imss.cit.dictamen.commons.to.domain.PatronDictamenTO.class);
		
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.RubroTO.class			,mx.gob.imss.cit.dictamen.integration.api.dto.domain.RubroDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.PreguntaTO.class		,mx.gob.imss.cit.dictamen.integration.api.dto.domain.PreguntaDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.OpcionPreguntaTO.class	,mx.gob.imss.cit.dictamen.integration.api.dto.domain.OpcionPreguntaDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.domain.TipoRespuestaDTO.class,mx.gob.imss.cit.dictamen.commons.to.domain.TipoRespuestaTO.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.domain.RubroDTO.class		,mx.gob.imss.cit.dictamen.commons.to.domain.RubroTO.class			);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.domain.PreguntaDTO.class		,mx.gob.imss.cit.dictamen.commons.to.domain.PreguntaTO.class		);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.domain.OpcionPreguntaDTO.class	,mx.gob.imss.cit.dictamen.commons.to.domain.OpcionPreguntaTO.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.TipoRespuestaTO.class,     mx.gob.imss.cit.dictamen.integration.api.dto.domain.TipoRespuestaDTO.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoTO.class			,mx.gob.imss.cit.dictamen.integration.api.dto.domain.AtestiguamientoDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.domain.AtestiguamientoDTO.class,mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoTO.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoDictamenTO.class			,mx.gob.imss.cit.dictamen.integration.api.dto.domain.AtestiguamientoDictamenDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.domain.AtestiguamientoDictamenDTO.class,mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoDictamenTO.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.EstadoAtestiguamientoTO.class			,mx.gob.imss.cit.dictamen.integration.api.dto.domain.EstadoAtestiguamientoDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.domain.EstadoAtestiguamientoDTO.class,mx.gob.imss.cit.dictamen.commons.to.domain.EstadoAtestiguamientoTO.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.EstadoCargaDocumentoTO.class			,mx.gob.imss.cit.dictamen.integration.api.dto.EstadoCargaDocumentoDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.domain.EstadoAtestiguamientoDTO.class,mx.gob.imss.cit.dictamen.commons.to.domain.EstadoCargaDocumentoTO.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.domain.PatronAsociadoDTO.class,mx.gob.imss.cit.dictamen.commons.to.domain.PatronAsociadoTO.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.PatronAsociadoTO.class,mx.gob.imss.cit.dictamen.integration.api.dto.domain.PatronAsociadoDTO.class	);	
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.RubroAtestiguamientoDictTO.class			,mx.gob.imss.cit.dictamen.integration.api.dto.domain.RubroAtestiguamientoDictDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.domain.RubroAtestiguamientoDictDTO.class,mx.gob.imss.cit.dictamen.commons.to.domain.RubroAtestiguamientoDictTO.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.AtestigPreguntasRespuestTO.class			,mx.gob.imss.cit.dictamen.integration.api.dto.domain.AtestigPreguntasRespuestDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.domain.AtestigPreguntasRespuestDTO.class,mx.gob.imss.cit.dictamen.commons.to.domain.AtestigPreguntasRespuestTO.class	);
		
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.CedulaRemuneracionesTO.class, mx.gob.imss.cit.dictamen.integration.api.dto.domain.CedulaRemuneracionesDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.domain.CedulaRemuneracionesDTO.class, mx.gob.imss.cit.dictamen.commons.to.domain.CedulaRemuneracionesTO.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.DetFondoAhorroTO.class, mx.gob.imss.cit.dictamen.integration.api.dto.domain.DetFondoAhorroDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.domain.DetFondoAhorroDTO.class, mx.gob.imss.cit.dictamen.commons.to.domain.DetFondoAhorroTO.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.DetOtrosIngXsalarioTO.class, mx.gob.imss.cit.dictamen.integration.api.dto.domain.DetOtrosIngXsalarioDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.domain.DetOtrosIngXsalarioDTO.class, mx.gob.imss.cit.dictamen.commons.to.domain.DetOtrosIngXsalarioTO.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.DetOtrosPagXseparacTO.class, mx.gob.imss.cit.dictamen.integration.api.dto.domain.DetOtrosPagXseparacDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.domain.DetOtrosPagXseparacDTO.class, mx.gob.imss.cit.dictamen.commons.to.domain.DetOtrosPagXseparacTO.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.DetPagosOtrosEmpleadTO.class, mx.gob.imss.cit.dictamen.integration.api.dto.domain.DetPagosOtrosEmpleadDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.domain.DetPagosOtrosEmpleadDTO.class, mx.gob.imss.cit.dictamen.commons.to.domain.DetPagosOtrosEmpleadTO.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.CedulaPrestacionesTO.class, mx.gob.imss.cit.dictamen.integration.api.dto.domain.CedulaPrestacionesDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.domain.CedulaPrestacionesDTO.class, mx.gob.imss.cit.dictamen.commons.to.domain.CedulaPrestacionesTO.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.CedulaPagosDiferenciasTO.class, mx.gob.imss.cit.dictamen.integration.api.dto.domain.CedulaPagosDiferenciasDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.domain.CedulaPagosDiferenciasDTO.class, mx.gob.imss.cit.dictamen.commons.to.domain.CedulaPagosDiferenciasTO.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.PrestacionesTO.class, mx.gob.imss.cit.dictamen.integration.api.dto.domain.PrestacionesDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.domain.PrestacionesDTO.class, mx.gob.imss.cit.dictamen.commons.to.domain.PrestacionesTO.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.RemuneracionesTO.class, mx.gob.imss.cit.dictamen.integration.api.dto.domain.RemuneracionesDTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.integration.api.dto.domain.RemuneracionesDTO.class, mx.gob.imss.cit.dictamen.commons.to.domain.RemuneracionesTO.class	);
	}
	


	public static BovedaDocumentoTO transformer( BovedaDocumentoDTO document ) throws DictamenException {
		return (BovedaDocumentoTO) TransformerHelper.get(mapClass,document, BovedaDocumentoTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static BovedaMetadataTO transformer(BovedaMetadataDTO metadata) throws DictamenException{
		return  (BovedaMetadataTO) TransformerHelper.get(mapClass,metadata, BovedaMetadataTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	public static BovedaTramiteTO transformer( BovedaTramiteDTO tramite ) throws DictamenException{
		return  (BovedaTramiteTO) TransformerHelper.get(mapClass,tramite, BovedaTramiteTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static BovedaActorTO transformer(BovedaActorDTO actor)throws DictamenException{
		return (BovedaActorTO) TransformerHelper.get(mapClass,actor, BovedaActorTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	public static BovedaBaseObjectTO transformer(BovedaBaseObjectDTO baseObject)throws DictamenException{
		return (BovedaBaseObjectTO) TransformerHelper.get(mapClass,baseObject, BovedaBaseObjectTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static BovedaHeaderTO transformer(BovedaHeaderDTO sgbde)throws DictamenException{
		return (BovedaHeaderTO) TransformerHelper.get(mapClass,sgbde, BovedaHeaderTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
		
	public static BovedaDocumentoDTO transformer( BovedaDocumentoTO documentoTO ) throws DictamenException{
		return (BovedaDocumentoDTO) TransformerHelper.get(mapClass,documentoTO, BovedaDocumentoDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static BovedaMetadataDTO transformer(BovedaMetadataTO metadataTO)throws DictamenException{
		return (BovedaMetadataDTO) TransformerHelper.get(mapClass,metadataTO, BovedaMetadataDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	public static BovedaTramiteDTO transformer( BovedaTramiteTO tramiteTO ) throws DictamenException{
		return (BovedaTramiteDTO) TransformerHelper.get(mapClass,tramiteTO, BovedaTramiteDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static BovedaActorDTO transformer(BovedaActorTO actorTO)throws DictamenException{
		return (BovedaActorDTO) TransformerHelper.get(mapClass,actorTO, BovedaActorDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	public static BovedaBaseObjectDTO transformer(BovedaBaseObjectTO baseObjectTO)throws DictamenException{
		return (BovedaBaseObjectDTO) TransformerHelper.get(mapClass,baseObjectTO, BovedaBaseObjectDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static BovedaHeaderDTO transformer(BovedaHeaderTO headerTO)throws DictamenException{
		return (BovedaHeaderDTO) TransformerHelper.get(mapClass,headerTO, BovedaHeaderDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	public static FirmaElectronicaDTO transformer(FirmaElectronicaTO to)throws DictamenException{
		return (FirmaElectronicaDTO) TransformerHelper.get(mapClass,to, FirmaElectronicaDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	public static FirmaElectronicaTO transformer(FirmaElectronicaDTO dto)throws DictamenException{
		return (FirmaElectronicaTO) TransformerHelper.get(mapClass,dto, FirmaElectronicaTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}		
	
	public static ParentLayoutDTO transformer(ParentLayoutTO to)throws DictamenException{
		return (ParentLayoutDTO) TransformerHelper.get(mapClass,to, ParentLayoutDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	public static ParentLayoutTO transformer(ParentLayoutDTO dto)throws DictamenException{
		return (ParentLayoutTO) TransformerHelper.get(mapClass,dto, ParentLayoutTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}		

	public static LayoutDTO transformer(LayoutTO to)throws DictamenException{
		return (LayoutDTO) TransformerHelper.get(mapClass,to, LayoutDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	public static LayoutTO transformer(LayoutDTO dto)throws DictamenException{
		return (LayoutTO) TransformerHelper.get(mapClass,dto, LayoutTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}		
	
	public static AWSPolicyDTO transformer(AWSPolicyTO to)throws DictamenException{
		return (AWSPolicyDTO) TransformerHelper.get(mapClass,to, AWSPolicyDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	public static AWSPolicyTO transformer(AWSPolicyDTO dto)throws DictamenException{
		return (AWSPolicyTO) TransformerHelper.get(mapClass,dto, AWSPolicyTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static EjercicioFiscalDTO transformer(EjercicioFiscalTO object)throws DictamenException{
		return (EjercicioFiscalDTO) TransformerHelper.get(mapClass,object, EjercicioFiscalDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	public static EjercicioFiscalTO transformer(EjercicioFiscalDTO object)throws DictamenException{
		return (EjercicioFiscalTO) TransformerHelper.get(mapClass,object, EjercicioFiscalTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static TipoDictamenDTO transformer(TipoDictamenTO object)throws DictamenException{
		return (TipoDictamenDTO) TransformerHelper.get(mapClass,object, TipoDictamenDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static TipoDictamenTO transformer(TipoDictamenDTO object)throws DictamenException{
		return (TipoDictamenTO) TransformerHelper.get(mapClass,object, TipoDictamenTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static PatronDictamenDTO transformer(PatronDictamenTO object)throws DictamenException{
		PatronDictamenDTO objRes= (PatronDictamenDTO) TransformerHelper.get(mapClass,object, PatronDictamenDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		
		objRes.setRazonSocialNombre(object.getDesNombreRazonSocial());
		objRes.setRfc(object.getDesRfc());
		objRes.setNumTrabajadoresPromedio(object.getNumNumeroTrabajadores());
		objRes.setIndustriaConstruccion(ConverterUtils.convertShortToBoolean(object.getIndPatronConstruccion()));
		objRes.setEmpresaValuada(ConverterUtils.convertShortToBoolean(object.getIndPatronEmpresaValuada()));
		objRes.setActConstruccionOregObra(ConverterUtils.convertShortToBoolean(object.getIndRealizoActConstruccion()));		
		objRes.setNumRegistroPatronales(object.getNumRegistroPatronales());			
		
		return objRes;
	}	
	public static PatronDictamenTO transformer(PatronDictamenDTO object)throws DictamenException{
		
		PatronDictamenTO objRes= (PatronDictamenTO) TransformerHelper.get(mapClass,object, PatronDictamenTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		
		objRes.setDesNombreRazonSocial(object.getRazonSocialNombre());
		objRes.setDesRfc(object.getRfc());
		objRes.setNumNumeroTrabajadores(object.getNumTrabajadoresPromedio());
		objRes.setIndPatronConstruccion(ConverterUtils.convertBooleanToShort(object.getIndustriaConstruccion()));
		objRes.setIndPatronEmpresaValuada(ConverterUtils.convertBooleanToShort(object.getEmpresaValuada()));			
		objRes.setIndRealizoActConstruccion(ConverterUtils.convertBooleanToShort(object.getActConstruccionOregObra()));
		objRes.setNumRegistroPatronales(object.getNumRegistroPatronales());			
		
		return objRes;
	}	
	
	public static RubroDTO transformer(RubroTO object)throws DictamenException{
		return (RubroDTO) TransformerHelper.get(mapClass,object, RubroDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static RubroTO transformer(RubroDTO object)throws DictamenException{
		return (RubroTO) TransformerHelper.get(mapClass,object, RubroTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static PreguntaDTO transformer(PreguntaTO object)throws DictamenException{
		return (PreguntaDTO) TransformerHelper.get(mapClass,object, PreguntaDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static PreguntaTO transformer(PreguntaDTO object)throws DictamenException{
		return (PreguntaTO) TransformerHelper.get(mapClass,object, PreguntaTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	
	public static OpcionPreguntaDTO transformer(OpcionPreguntaTO object)throws DictamenException{
		return (OpcionPreguntaDTO) TransformerHelper.get(mapClass,object, OpcionPreguntaDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static OpcionPreguntaTO transformer(OpcionPreguntaDTO object)throws DictamenException{
		return (OpcionPreguntaTO) TransformerHelper.get(mapClass,object, OpcionPreguntaTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static TipoRespuestaDTO transformer(TipoRespuestaTO object)throws DictamenException{
		return (TipoRespuestaDTO) TransformerHelper.get(mapClass,object, TipoRespuestaDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static TipoRespuestaTO transformer(TipoRespuestaDTO object)throws DictamenException{
		return (TipoRespuestaTO) TransformerHelper.get(mapClass,object, TipoRespuestaTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static AtestiguamientoDTO transformer(AtestiguamientoTO object)throws DictamenException{
		return (AtestiguamientoDTO) TransformerHelper.get(mapClass,object, AtestiguamientoDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static AtestiguamientoTO transformer(AtestiguamientoDTO object)throws DictamenException{
		return (AtestiguamientoTO) TransformerHelper.get(mapClass,object, AtestiguamientoTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static AtestiguamientoDictamenDTO transformer(AtestiguamientoDictamenTO object)throws DictamenException{
		return (AtestiguamientoDictamenDTO) TransformerHelper.get(mapClass,object, AtestiguamientoDictamenDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static AtestiguamientoDictamenTO transformer(AtestiguamientoDictamenDTO object)throws DictamenException{
		return (AtestiguamientoDictamenTO) TransformerHelper.get(mapClass,object, AtestiguamientoDictamenTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	public static EstadoCargaDocumentoDTO transformer(EstadoCargaDocumentoTO object)throws DictamenException{
		return (EstadoCargaDocumentoDTO) TransformerHelper.get(mapClass,object, EstadoCargaDocumentoDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static EstadoCargaDocumentoTO transformer(EstadoCargaDocumentoDTO object)throws DictamenException{
		return (EstadoCargaDocumentoTO) TransformerHelper.get(mapClass,object, EstadoCargaDocumentoTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	public static PatronAsociadoDTO transformer(PatronAsociadoTO object)throws DictamenException{
		return (PatronAsociadoDTO) TransformerHelper.get(mapClass,object, PatronAsociadoDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	public static PatronAsociadoTO transformer(PatronAsociadoDTO object)throws DictamenException{
		return (PatronAsociadoTO) TransformerHelper.get(mapClass,object, PatronAsociadoTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
		public static RubroAtestiguamientoDictDTO transformer(RubroAtestiguamientoDictTO object)throws DictamenException{
		return (RubroAtestiguamientoDictDTO) TransformerHelper.get(mapClass,object, RubroAtestiguamientoDictDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static RubroAtestiguamientoDictTO transformer(RubroAtestiguamientoDictDTO object)throws DictamenException{
		return (RubroAtestiguamientoDictTO) TransformerHelper.get(mapClass,object, RubroAtestiguamientoDictTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static AtestigPreguntasRespuestDTO transformer(AtestigPreguntasRespuestTO object)throws DictamenException{
		return (AtestigPreguntasRespuestDTO) TransformerHelper.get(mapClass,object, AtestigPreguntasRespuestDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static AtestigPreguntasRespuestTO transformer(AtestigPreguntasRespuestDTO object)throws DictamenException{
		return (AtestigPreguntasRespuestTO) TransformerHelper.get(mapClass,object, AtestigPreguntasRespuestTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	
	public static CedulaRemuneracionesDTO transformer(CedulaRemuneracionesTO object)throws DictamenException{
		return (CedulaRemuneracionesDTO) TransformerHelper.get(mapClass,object, CedulaRemuneracionesDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	public static CedulaRemuneracionesTO transformer(CedulaRemuneracionesDTO object)throws DictamenException{
		return (CedulaRemuneracionesTO) TransformerHelper.get(mapClass,object, CedulaRemuneracionesTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	public static DetFondoAhorroDTO transformer(DetFondoAhorroTO object)throws DictamenException{
		return (DetFondoAhorroDTO) TransformerHelper.get(mapClass,object, DetFondoAhorroDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	public static DetFondoAhorroTO transformer(DetFondoAhorroDTO object)throws DictamenException{
		return (DetFondoAhorroTO) TransformerHelper.get(mapClass,object, DetFondoAhorroTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	public static DetOtrosIngXsalarioDTO transformer(DetOtrosIngXsalarioTO object)throws DictamenException{
		return (DetOtrosIngXsalarioDTO) TransformerHelper.get(mapClass,object, DetOtrosIngXsalarioDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	public static DetOtrosIngXsalarioTO transformer(DetOtrosIngXsalarioDTO object)throws DictamenException{
		return (DetOtrosIngXsalarioTO) TransformerHelper.get(mapClass,object, DetOtrosIngXsalarioTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	public static DetOtrosPagXseparacDTO transformer(DetOtrosPagXseparacTO object)throws DictamenException{
		return (DetOtrosPagXseparacDTO) TransformerHelper.get(mapClass,object, DetOtrosPagXseparacDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	public static DetOtrosPagXseparacTO transformer(DetOtrosPagXseparacDTO object)throws DictamenException{
		return (DetOtrosPagXseparacTO) TransformerHelper.get(mapClass,object, DetOtrosPagXseparacTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	public static DetPagosOtrosEmpleadDTO transformer(DetPagosOtrosEmpleadTO object)throws DictamenException{
		return (DetPagosOtrosEmpleadDTO) TransformerHelper.get(mapClass,object, DetPagosOtrosEmpleadDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	public static DetPagosOtrosEmpleadTO transformer(DetPagosOtrosEmpleadDTO object)throws DictamenException{
		return (DetPagosOtrosEmpleadTO) TransformerHelper.get(mapClass,object, DetPagosOtrosEmpleadTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	public static CedulaPrestacionesDTO transformer(CedulaPrestacionesTO object)throws DictamenException{
		return (CedulaPrestacionesDTO) TransformerHelper.get(mapClass,object, CedulaPrestacionesDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	public static CedulaRemuneracionesTO transformer(CedulaPrestacionesDTO object)throws DictamenException{
		return (CedulaRemuneracionesTO) TransformerHelper.get(mapClass,object, CedulaRemuneracionesTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	public static CedulaPagosDiferenciasDTO transformer(CedulaPagosDiferenciasTO object)throws DictamenException{
		return (CedulaPagosDiferenciasDTO) TransformerHelper.get(mapClass,object, CedulaPagosDiferenciasDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	public static CedulaPagosDiferenciasTO transformer(CedulaPagosDiferenciasDTO object)throws DictamenException{
		return (CedulaPagosDiferenciasTO) TransformerHelper.get(mapClass,object, CedulaPagosDiferenciasTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	public static PrestacionesDTO transformer(PrestacionesTO object)throws DictamenException{
		return (PrestacionesDTO) TransformerHelper.get(mapClass,object, PrestacionesDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	public static PrestacionesTO transformer(PrestacionesDTO object)throws DictamenException{
		return (PrestacionesTO) TransformerHelper.get(mapClass,object, PrestacionesTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}
	public static RemuneracionesDTO transformer(RemuneracionesTO object)throws DictamenException{
		return (RemuneracionesDTO) TransformerHelper.get(mapClass,object, RemuneracionesDTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
	public static RemuneracionesTO transformer(RemuneracionesDTO object)throws DictamenException{
		return (RemuneracionesTO) TransformerHelper.get(mapClass,object, RemuneracionesTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
	}	
}
