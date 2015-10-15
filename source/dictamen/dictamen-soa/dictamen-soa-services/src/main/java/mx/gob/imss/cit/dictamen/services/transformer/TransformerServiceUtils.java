package mx.gob.imss.cit.dictamen.services.transformer;

import java.util.HashMap;
import java.util.Map;

import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Actor;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.BaseObject;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Document;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Metadata;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Tramite;
import mx.gob.imss.cit.dictamen.commons.constants.DictamenConstants;
import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.BovedaActorTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaBaseObjectTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaDocumentoTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaHeaderTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaMetadataTO;
import mx.gob.imss.cit.dictamen.commons.to.BovedaTramiteTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.AseveracionesTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.AtestigPreguntasRespuestTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoDictamenTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.CargaDocumentoTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.ContadorPublicoAutTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.EjercicioFiscalTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.EstadoAtestiguamientoTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.EstadoCargaDocumentoTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.OpcionPreguntaTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.PatronAsociadoTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.PatronDictamenTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.PreguntaTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.RubroAtestiguamientoDictTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.RubroTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.TipoDictamenTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.TipoDocumentoTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.TipoRespuestaTO;
import mx.gob.imss.cit.dictamen.commons.util.TransformerHelper;
import mx.gob.imss.cit.dictamen.model.NdcAseveracionesDO;
import mx.gob.imss.cit.dictamen.model.NdcAtestiguamientoDO;
import mx.gob.imss.cit.dictamen.model.NdcEjercicioFiscalDO;
import mx.gob.imss.cit.dictamen.model.NdcEstadoAtestiguamientoDO;
import mx.gob.imss.cit.dictamen.model.NdcEstadoCargaDocumentoDO;
import mx.gob.imss.cit.dictamen.model.NdcOpcionPreguntaDO;
import mx.gob.imss.cit.dictamen.model.NdcPreguntaDO;
import mx.gob.imss.cit.dictamen.model.NdcRubroDO;
import mx.gob.imss.cit.dictamen.model.NdcTipoDictamenDO;
import mx.gob.imss.cit.dictamen.model.NdcTipoDocumentoDO;
import mx.gob.imss.cit.dictamen.model.NdcTipoRespuestaDO;
import mx.gob.imss.cit.dictamen.model.NdtAtestigPreguntasRespuestDO;
import mx.gob.imss.cit.dictamen.model.NdtAtestiguamientoDictamenDO;
import mx.gob.imss.cit.dictamen.model.NdtCargaDocumentoDO;
import mx.gob.imss.cit.dictamen.model.NdtContadorPublicoAutDO;
import mx.gob.imss.cit.dictamen.model.NdtPatronAsociadoDO;
import mx.gob.imss.cit.dictamen.model.NdtPatronDictamenDO;
import mx.gob.imss.cit.dictamen.model.NdtRubroAtestiguamientoDictDO;
import mx.gob.imss.cit.ws.commonschema.SGBDE;

public class TransformerServiceUtils {
	
	private static Map<Class<?>, Class<?>> mapClass;

	static {
		mapClass = new HashMap<Class<?>, Class<?>>();

		mapClass.put(mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Document.class,
				mx.gob.imss.cit.dictamen.commons.to.BovedaDocumentoTO.class);
		mapClass.put(mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Actor.class,
				mx.gob.imss.cit.dictamen.commons.to.BovedaActorTO.class);
		mapClass.put(mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Metadata.class,
				mx.gob.imss.cit.dictamen.commons.to.BovedaMetadataTO.class);
		mapClass.put(mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Tramite.class,
				mx.gob.imss.cit.dictamen.commons.to.BovedaTramiteTO.class);
		mapClass.put(mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.BaseObject.class,
				mx.gob.imss.cit.dictamen.commons.to.BovedaBaseObjectTO.class);
		mapClass.put(mx.gob.imss.cit.ws.commonschema.SGBDE.class,
				mx.gob.imss.cit.dictamen.commons.to.BovedaHeaderTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.model.NdtPatronDictamenDO.class,
				mx.gob.imss.cit.dictamen.commons.to.domain.PatronDictamenTO.class);

		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.BovedaDocumentoTO.class,
				mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Document.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.BovedaActorTO.class,
				mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Actor.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.BovedaMetadataTO.class,
				mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Metadata.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.BovedaTramiteTO.class,
				mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Tramite.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.BovedaBaseObjectTO.class,
				mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.BaseObject.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.BovedaHeaderTO.class,
				mx.gob.imss.cit.ws.commonschema.SGBDE.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.PatronDictamenTO.class,
				mx.gob.imss.cit.dictamen.model.NdtPatronDictamenDO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.model.NdtPatronDictamenDO.class,
				mx.gob.imss.cit.dictamen.commons.to.domain.PatronDictamenTO.class);

		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoTO.class,
				mx.gob.imss.cit.dictamen.model.NdcAtestiguamientoDO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.RubroTO.class,
				mx.gob.imss.cit.dictamen.model.NdcRubroDO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.PreguntaTO.class,
				mx.gob.imss.cit.dictamen.model.NdcPreguntaDO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.TipoRespuestaTO.class,
				mx.gob.imss.cit.dictamen.model.NdcTipoRespuestaDO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.model.NdcAtestiguamientoDO.class,
				mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.model.NdcRubroDO.class,
				mx.gob.imss.cit.dictamen.commons.to.domain.RubroTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.model.NdcPreguntaDO.class,
				mx.gob.imss.cit.dictamen.commons.to.domain.PreguntaTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.model.NdcTipoRespuestaDO.class,
				mx.gob.imss.cit.dictamen.commons.to.domain.TipoRespuestaTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.model.NdcEjercicioFiscalDO.class,
				mx.gob.imss.cit.dictamen.commons.to.domain.EjercicioFiscalTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.EjercicioFiscalTO.class,
				mx.gob.imss.cit.dictamen.model.NdcEjercicioFiscalDO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.TipoDictamenTO.class,
				mx.gob.imss.cit.dictamen.model.NdcTipoDictamenDO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.model.NdcTipoDictamenDO.class,
				mx.gob.imss.cit.dictamen.commons.to.domain.TipoDictamenTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.ContadorPublicoAutTO.class,
				mx.gob.imss.cit.dictamen.model.NdtContadorPublicoAutDO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.model.NdtContadorPublicoAutDO.class,
				mx.gob.imss.cit.dictamen.commons.to.domain.ContadorPublicoAutTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.model.NdtAtestiguamientoDictamenDO.class,
				mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoDictamenTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoDictamenTO.class,
				mx.gob.imss.cit.dictamen.model.NdtAtestiguamientoDictamenDO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.EstadoAtestiguamientoTO.class,
				mx.gob.imss.cit.dictamen.model.NdcEstadoAtestiguamientoDO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.model.NdcEstadoAtestiguamientoDO.class,
				mx.gob.imss.cit.dictamen.commons.to.domain.EstadoAtestiguamientoTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.OpcionPreguntaTO.class,
				mx.gob.imss.cit.dictamen.model.NdcOpcionPreguntaDO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.model.NdcOpcionPreguntaDO.class,
				mx.gob.imss.cit.dictamen.commons.to.domain.OpcionPreguntaTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.PatronAsociadoTO.class,
				mx.gob.imss.cit.dictamen.model.NdtPatronAsociadoDO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.model.NdtPatronAsociadoDO.class,
				mx.gob.imss.cit.dictamen.commons.to.domain.PatronAsociadoTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.CargaDocumentoTO.class,
				mx.gob.imss.cit.dictamen.model.NdtCargaDocumentoDO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.model.NdtCargaDocumentoDO.class,
				mx.gob.imss.cit.dictamen.commons.to.domain.CargaDocumentoTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.EstadoCargaDocumentoTO.class,
				mx.gob.imss.cit.dictamen.model.NdcEstadoCargaDocumentoDO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.model.NdcEstadoCargaDocumentoDO.class,
				mx.gob.imss.cit.dictamen.commons.to.domain.EstadoCargaDocumentoTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.AseveracionesTO.class,
				mx.gob.imss.cit.dictamen.model.NdcAseveracionesDO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.model.NdcAseveracionesDO.class,
				mx.gob.imss.cit.dictamen.commons.to.domain.AseveracionesTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.TipoDocumentoTO.class,
				mx.gob.imss.cit.dictamen.model.NdcTipoDocumentoDO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.model.NdcTipoDocumentoDO.class,
				mx.gob.imss.cit.dictamen.commons.to.domain.TipoDocumentoTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.RubroAtestiguamientoDictTO.class,
				mx.gob.imss.cit.dictamen.model.NdtRubroAtestiguamientoDictDO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.model.NdtRubroAtestiguamientoDictDO.class,
				mx.gob.imss.cit.dictamen.commons.to.domain.RubroAtestiguamientoDictTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.AtestigPreguntasRespuestTO.class,
				mx.gob.imss.cit.dictamen.model.NdtAtestigPreguntasRespuestDO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.model.NdtAtestigPreguntasRespuestDO.class,
				mx.gob.imss.cit.dictamen.commons.to.domain.AtestigPreguntasRespuestTO.class);
	}

	private TransformerServiceUtils() {

	}

	public static BovedaDocumentoTO transformer(Document document) throws DictamenException {

		return (BovedaDocumentoTO) TransformerHelper.get(mapClass, document, BovedaDocumentoTO.class,
				DictamenConstants.PROFUNDIDAD_MAPEO);
	}

	public static BovedaMetadataTO transformer(Metadata metadata) throws DictamenException {
		return (BovedaMetadataTO) TransformerHelper.get(mapClass, metadata, BovedaMetadataTO.class,
				DictamenConstants.PROFUNDIDAD_MAPEO);
	}

	public static BovedaTramiteTO transformer(Tramite tramite) throws DictamenException {
		return (BovedaTramiteTO) TransformerHelper.get(mapClass, tramite, BovedaTramiteTO.class,
				DictamenConstants.PROFUNDIDAD_MAPEO);
	}

	public static BovedaActorTO transformer(Actor actor) throws DictamenException {
		return (BovedaActorTO) TransformerHelper.get(mapClass, actor, BovedaActorTO.class,
				DictamenConstants.PROFUNDIDAD_MAPEO);
	}

	public static BovedaBaseObjectTO transformer(BaseObject baseObject) throws DictamenException {
		return (BovedaBaseObjectTO) TransformerHelper.get(mapClass, baseObject, BovedaBaseObjectTO.class,
				DictamenConstants.PROFUNDIDAD_MAPEO);
	}

	public static BovedaHeaderTO transformer(SGBDE sgbde) throws DictamenException {
		return (BovedaHeaderTO) TransformerHelper.get(mapClass, sgbde, BovedaHeaderTO.class,
				DictamenConstants.PROFUNDIDAD_MAPEO);
	}

	public static Document transformer(BovedaDocumentoTO documentoTO) throws DictamenException {
		return (Document) TransformerHelper.get(mapClass, documentoTO, Document.class,
				DictamenConstants.PROFUNDIDAD_MAPEO);
	}

	public static Metadata transformer(BovedaMetadataTO metadataTO) throws DictamenException {
		return (Metadata) TransformerHelper.get(mapClass, metadataTO, Metadata.class,
				DictamenConstants.PROFUNDIDAD_MAPEO);
	}

	public static Tramite transformer(BovedaTramiteTO tramiteTO) throws DictamenException {
		return (Tramite) TransformerHelper.get(mapClass, tramiteTO, Tramite.class, DictamenConstants.PROFUNDIDAD_MAPEO);
	}

	public static Actor transformer(BovedaActorTO actorTO) throws DictamenException {
		return (Actor) TransformerHelper.get(mapClass, actorTO, Actor.class, DictamenConstants.PROFUNDIDAD_MAPEO);
	}

	public static BaseObject transformer(BovedaBaseObjectTO baseObjectTO) throws DictamenException {
		return (BaseObject) TransformerHelper.get(mapClass, baseObjectTO, BaseObject.class,
				DictamenConstants.PROFUNDIDAD_MAPEO);
	}

	public static SGBDE transformer(BovedaHeaderTO headerTO) throws DictamenException {
		return (SGBDE) TransformerHelper.get(mapClass, headerTO, SGBDE.class, DictamenConstants.PROFUNDIDAD_MAPEO);
	}

	public static NdtCargaDocumentoDO transformer(CargaDocumentoTO cargaDocumentoTO) throws DictamenException {
		NdtCargaDocumentoDO cargaDocumentoDO = (NdtCargaDocumentoDO) TransformerHelper.get(mapClass, cargaDocumentoTO,
				NdtCargaDocumentoDO.class, DictamenConstants.PROFUNDIDAD_MAPEO);

		NdcEstadoCargaDocumentoDO estadoCargaDocumentoDO = new NdcEstadoCargaDocumentoDO();
		NdcAseveracionesDO ndcAseveracionesDO = new NdcAseveracionesDO();
		NdcTipoDocumentoDO ndcTipoDocumentoDO = new NdcTipoDocumentoDO();
		NdtPatronDictamenDO ndtPatronDictamenDO = new NdtPatronDictamenDO();

		estadoCargaDocumentoDO
				.setCveIdEstadoCargoDoc(cargaDocumentoTO.getCveIdEstadoCargoDoc().getCveIdEstadoCargoDoc());
		ndcAseveracionesDO.setCveIdAseveracion(cargaDocumentoTO.getCveIdAseveracion().getCveIdAseveracion());
		ndcTipoDocumentoDO.setCveIdTipoDocumento(cargaDocumentoTO.getCveIdTipoDocumento().getCveIdTipoDocumento());
		ndtPatronDictamenDO.setCveIdPatronDictamen(cargaDocumentoTO.getCveIdPatronDictamen().getCveIdPatronDictamen());

		cargaDocumentoDO.setCveIdAseveracion(ndcAseveracionesDO);
		cargaDocumentoDO.setCveIdEstadoCargoDoc(estadoCargaDocumentoDO);
		cargaDocumentoDO.setCveIdTipoDocumento(ndcTipoDocumentoDO);
		cargaDocumentoDO.setCveIdPatronDictamen(ndtPatronDictamenDO);

		return cargaDocumentoDO;
	}

	public static CargaDocumentoTO transformer(NdtCargaDocumentoDO ndtCargaDocumentoDO) throws DictamenException {
		CargaDocumentoTO cargaDocumentoTO = (CargaDocumentoTO) TransformerHelper.get(mapClass, ndtCargaDocumentoDO,
				CargaDocumentoTO.class, DictamenConstants.PROFUNDIDAD_MAPEO);

		EstadoCargaDocumentoTO estadoCargaDocumentoTO = new EstadoCargaDocumentoTO();
		AseveracionesTO aseveracionesTO = new AseveracionesTO();
		TipoDocumentoTO tipoDocumentoTO = new TipoDocumentoTO();
		PatronDictamenTO patronDictamenTO = new PatronDictamenTO();

		estadoCargaDocumentoTO
				.setCveIdEstadoCargoDoc(ndtCargaDocumentoDO.getCveIdEstadoCargoDoc().getCveIdEstadoCargoDoc());
		estadoCargaDocumentoTO.setDesStatusCargaAseveraciones(
				ndtCargaDocumentoDO.getCveIdEstadoCargoDoc().getDesStatusCargaAseveraciones());
		aseveracionesTO.setCveIdAseveracion(ndtCargaDocumentoDO.getCveIdAseveracion().getCveIdAseveracion());
		aseveracionesTO.setDesTipoAseveracion(ndtCargaDocumentoDO.getCveIdAseveracion().getDesTipoAseveracion());
		patronDictamenTO.setCveIdPatronDictamen(ndtCargaDocumentoDO.getCveIdPatronDictamen().getCveIdPatronDictamen());

		cargaDocumentoTO.setCveIdEstadoCargoDoc(estadoCargaDocumentoTO);
		cargaDocumentoTO.setCveIdAseveracion(aseveracionesTO);
		cargaDocumentoTO.setCveIdTipoDocumento(tipoDocumentoTO);
		cargaDocumentoTO.setCveIdPatronDictamen(patronDictamenTO);

		return cargaDocumentoTO;
	}

	public static NdtPatronDictamenDO transformer(PatronDictamenTO patron) throws DictamenException {
		NdtPatronDictamenDO cont = (NdtPatronDictamenDO) TransformerHelper.get(mapClass, patron,
				NdtPatronDictamenDO.class, DictamenConstants.PROFUNDIDAD_MAPEO);

		return cont;
	}

	public static PatronDictamenTO transformer(NdtPatronDictamenDO patron) throws DictamenException {
		PatronDictamenTO cont = (PatronDictamenTO) TransformerHelper.get(mapClass, patron, PatronDictamenTO.class,
				DictamenConstants.PROFUNDIDAD_MAPEO);

		return cont;
	}

	public static NdcAtestiguamientoDO transformer(AtestiguamientoTO atestiguamientoTO) throws DictamenException {
		NdcAtestiguamientoDO cont = (NdcAtestiguamientoDO) TransformerHelper.get(mapClass, atestiguamientoTO,
				NdcAtestiguamientoDO.class, DictamenConstants.PROFUNDIDAD_MAPEO);
		return cont;
	}

	public static NdcRubroDO transformer(RubroTO rubroTO) throws DictamenException {
		NdcRubroDO cont = (NdcRubroDO) TransformerHelper.get(mapClass, rubroTO, NdcRubroDO.class,
				DictamenConstants.PROFUNDIDAD_MAPEO);
		return cont;
	}

	public static NdcPreguntaDO transformer(PreguntaTO preguntaTO) throws DictamenException {
		NdcPreguntaDO cont = (NdcPreguntaDO) TransformerHelper.get(mapClass, preguntaTO, NdcPreguntaDO.class,
				DictamenConstants.PROFUNDIDAD_MAPEO);
		return cont;
	}

	public static NdcTipoRespuestaDO transformer(TipoRespuestaTO tipoRespuestaTO) throws DictamenException {
		NdcTipoRespuestaDO cont = (NdcTipoRespuestaDO) TransformerHelper.get(mapClass, tipoRespuestaTO,
				NdcTipoRespuestaDO.class, DictamenConstants.PROFUNDIDAD_MAPEO);
		return cont;
	}

	public static TipoRespuestaTO transformer(NdcTipoRespuestaDO ndcTipoRespuestaDO) throws DictamenException {
		TipoRespuestaTO cont = (TipoRespuestaTO) TransformerHelper.get(mapClass, ndcTipoRespuestaDO,
				TipoRespuestaTO.class, DictamenConstants.PROFUNDIDAD_MAPEO);
		return cont;
	}

	public static PreguntaTO transformer(NdcPreguntaDO ndcPreguntaDO) throws DictamenException {
		PreguntaTO cont = (PreguntaTO) TransformerHelper.get(mapClass, ndcPreguntaDO, PreguntaTO.class,
				DictamenConstants.PROFUNDIDAD_MAPEO);
		return cont;
	}

	public static RubroTO transformer(NdcRubroDO ndcRubroDO) throws DictamenException {
		RubroTO cont = (RubroTO) TransformerHelper.get(mapClass, ndcRubroDO, RubroTO.class,
				DictamenConstants.PROFUNDIDAD_MAPEO);
		return cont;
	}

	public static AtestiguamientoTO transformer(NdcAtestiguamientoDO ndcAtestiguamientoDO) throws DictamenException {
		AtestiguamientoTO cont = (AtestiguamientoTO) TransformerHelper.get(mapClass, ndcAtestiguamientoDO,
				AtestiguamientoTO.class, DictamenConstants.PROFUNDIDAD_MAPEO);
		return cont;
	}

	public static EjercicioFiscalTO transformer(NdcEjercicioFiscalDO ejerDO) throws DictamenException {
		return (EjercicioFiscalTO) TransformerHelper.get(mapClass, ejerDO, EjercicioFiscalTO.class,
				DictamenConstants.PROFUNDIDAD_MAPEO);
	}

	public static NdcEjercicioFiscalDO transformer(EjercicioFiscalTO ejerTO) throws DictamenException {
		return (NdcEjercicioFiscalDO) TransformerHelper.get(mapClass, ejerTO, NdcEjercicioFiscalDO.class,
				DictamenConstants.PROFUNDIDAD_MAPEO);
	}

	public static NdcTipoDictamenDO transformer(TipoDictamenTO object) throws DictamenException {
		return (NdcTipoDictamenDO) TransformerHelper.get(mapClass, object, NdcTipoDictamenDO.class,
				DictamenConstants.PROFUNDIDAD_MAPEO);
	}

	public static TipoDictamenTO transformer(NdcTipoDictamenDO object) throws DictamenException {
		return (TipoDictamenTO) TransformerHelper.get(mapClass, object, TipoDictamenTO.class,
				DictamenConstants.PROFUNDIDAD_MAPEO);
	}

	public static OpcionPreguntaTO transformer(NdcOpcionPreguntaDO ndcOpcionPreguntaDO) throws DictamenException {
		OpcionPreguntaTO cont = (OpcionPreguntaTO) TransformerHelper.get(mapClass, ndcOpcionPreguntaDO,
				OpcionPreguntaTO.class, DictamenConstants.PROFUNDIDAD_MAPEO);
		return cont;
	}

	public static NdcOpcionPreguntaDO transformer(OpcionPreguntaTO opcionPreguntaTO) throws DictamenException {
		NdcOpcionPreguntaDO cont = (NdcOpcionPreguntaDO) TransformerHelper.get(mapClass, opcionPreguntaTO,
				NdcOpcionPreguntaDO.class, DictamenConstants.PROFUNDIDAD_MAPEO);
		return cont;
	}

	public static NdcEstadoAtestiguamientoDO transformer(EstadoAtestiguamientoTO estadoAtestiguamientoTO)
			throws DictamenException {
		NdcEstadoAtestiguamientoDO cont = (NdcEstadoAtestiguamientoDO) TransformerHelper.get(mapClass,
				estadoAtestiguamientoTO, NdcEstadoAtestiguamientoDO.class, DictamenConstants.PROFUNDIDAD_MAPEO);
		return cont;
	}

	public static EstadoAtestiguamientoTO transformer(NdcEstadoAtestiguamientoDO ndcEstadoAtestiguamientoDO)
			throws DictamenException {
		EstadoAtestiguamientoTO cont = (EstadoAtestiguamientoTO) TransformerHelper.get(mapClass,
				ndcEstadoAtestiguamientoDO, EstadoAtestiguamientoTO.class, DictamenConstants.PROFUNDIDAD_MAPEO);
		return cont;
	}

	public static AtestiguamientoDictamenTO transformer(NdtAtestiguamientoDictamenDO ndtAtestiguamientoDictamenDO)
			throws DictamenException {
		AtestiguamientoDictamenTO cont = (AtestiguamientoDictamenTO) TransformerHelper.get(mapClass,
				ndtAtestiguamientoDictamenDO, AtestiguamientoDictamenTO.class, DictamenConstants.PROFUNDIDAD_MAPEO);
		return cont;
	}

	public static NdtAtestiguamientoDictamenDO transformer(AtestiguamientoDictamenTO atestiguamientoDictamenTO)
			throws DictamenException {
		NdtAtestiguamientoDictamenDO cont = (NdtAtestiguamientoDictamenDO) TransformerHelper.get(mapClass,
				atestiguamientoDictamenTO, NdtAtestiguamientoDictamenDO.class, DictamenConstants.PROFUNDIDAD_MAPEO);
		return cont;
	}

	public static ContadorPublicoAutTO transformer(NdtContadorPublicoAutDO object) throws DictamenException {
		return (ContadorPublicoAutTO) TransformerHelper.get(mapClass, object, ContadorPublicoAutTO.class,
				DictamenConstants.PROFUNDIDAD_MAPEO);
	}

	public static NdtContadorPublicoAutDO transformer(ContadorPublicoAutTO object) throws DictamenException {
		return (NdtContadorPublicoAutDO) TransformerHelper.get(mapClass, object, NdtContadorPublicoAutDO.class,
				DictamenConstants.PROFUNDIDAD_MAPEO);
	}

	public static NdtPatronAsociadoDO transformer(PatronAsociadoTO object) throws DictamenException {
		return (NdtPatronAsociadoDO) TransformerHelper.get(mapClass, object, NdtPatronAsociadoDO.class,
				DictamenConstants.PROFUNDIDAD_MAPEO);
	}

	public static PatronAsociadoTO transformer(NdtPatronAsociadoDO object) throws DictamenException {
		return (PatronAsociadoTO) TransformerHelper.get(mapClass, object, PatronAsociadoTO.class,
				DictamenConstants.PROFUNDIDAD_MAPEO);
	}

	public static EstadoCargaDocumentoTO transformer(NdcEstadoCargaDocumentoDO object) throws DictamenException {
		return (EstadoCargaDocumentoTO) TransformerHelper.get(mapClass, object, EstadoCargaDocumentoTO.class,
				DictamenConstants.PROFUNDIDAD_MAPEO);
	}

	public static NdcEstadoCargaDocumentoDO transformer(EstadoCargaDocumentoTO object) throws DictamenException {
		return (NdcEstadoCargaDocumentoDO) TransformerHelper.get(mapClass, object, NdcEstadoCargaDocumentoDO.class,
				DictamenConstants.PROFUNDIDAD_MAPEO);
	}

	public static AseveracionesTO transformer(NdcAseveracionesDO object) throws DictamenException {
		return (AseveracionesTO) TransformerHelper.get(mapClass, object, AseveracionesTO.class,
				DictamenConstants.PROFUNDIDAD_MAPEO);
	}

	public static NdcAseveracionesDO transformer(AseveracionesTO object) throws DictamenException {
		return (NdcAseveracionesDO) TransformerHelper.get(mapClass, object, NdcAseveracionesDO.class,
				DictamenConstants.PROFUNDIDAD_MAPEO);
	}

	public static TipoDocumentoTO transformer(NdcTipoDocumentoDO object) throws DictamenException {
		return (TipoDocumentoTO) TransformerHelper.get(mapClass, object, AseveracionesTO.class,
				DictamenConstants.PROFUNDIDAD_MAPEO);
	}

	public static NdcTipoDocumentoDO transformer(TipoDocumentoTO object) throws DictamenException {
		return (NdcTipoDocumentoDO) TransformerHelper.get(mapClass, object, NdcTipoDocumentoDO.class,
				DictamenConstants.PROFUNDIDAD_MAPEO);
	}

	public static RubroAtestiguamientoDictTO transformer(NdtRubroAtestiguamientoDictDO object)
			throws DictamenException {
		return (RubroAtestiguamientoDictTO) TransformerHelper.get(mapClass, object, RubroAtestiguamientoDictTO.class,
				DictamenConstants.PROFUNDIDAD_MAPEO);
	}

	public static NdtRubroAtestiguamientoDictDO transformer(RubroAtestiguamientoDictTO object)
			throws DictamenException {
		return (NdtRubroAtestiguamientoDictDO) TransformerHelper.get(mapClass, object,
				NdtRubroAtestiguamientoDictDO.class, DictamenConstants.PROFUNDIDAD_MAPEO);
	}

	public static AtestigPreguntasRespuestTO transformer(NdtAtestigPreguntasRespuestDO object)
			throws DictamenException {
		return (AtestigPreguntasRespuestTO) TransformerHelper.get(mapClass, object, AtestigPreguntasRespuestTO.class,
				DictamenConstants.PROFUNDIDAD_MAPEO);
	}

	public static NdtAtestigPreguntasRespuestDO transformer(AtestigPreguntasRespuestTO object)
			throws DictamenException {
		return (NdtAtestigPreguntasRespuestDO) TransformerHelper.get(mapClass, object,
				NdtAtestigPreguntasRespuestDO.class, DictamenConstants.PROFUNDIDAD_MAPEO);
	}

}