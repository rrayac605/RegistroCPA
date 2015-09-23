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
import mx.gob.imss.cit.dictamen.commons.to.domain.EjercicioFiscalTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.PatronDictamenTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.PreguntaTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.RubroTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.TipoRespuestaTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.derechohabiente.ClavePresupuestalTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.derechohabiente.NivelAtencionTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.derechohabiente.TipoUMFTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.CURPTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.DocumentoPorTipoTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.DocumentoProbatorioTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.NacimientoTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.TipoDocumentoProbatorioTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.AsentamientoTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.CodigoPostalTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.DelegacionTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.DomicilioCaminoTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.DomicilioCarreteraTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.DomicilioFiscalTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.DomicilioTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.EntidadFederativaTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.LocalidadTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.MunicipioTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.PaisTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.SubdelegacionTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.TipoAdministracionTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.TipoAmbitoTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.TipoAsentamientoTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.TipoDerechoTransitoTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.TipoDomicilioTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.TipoMargenTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.TipoTerminoGeneralTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.TipoVialidadTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.VialidadTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.individuo.DatosPersonalesSATTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.individuo.EstadoCivilTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.individuo.FielTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.individuo.FisicaTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.individuo.IdentificadorTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.individuo.MoralTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.individuo.PersonaTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.individuo.RegimenTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.individuo.SexoTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.individuo.SituacionSATTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.individuo.TipoIdentificadorTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.individuo.TipoPoderTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.medio.contacto.CorreoElectronicoTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.medio.contacto.FacebookTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.medio.contacto.MedioContactoTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.medio.contacto.TipoMedioContactoTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.patronal.EscrituraConstitutivaTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.patronal.RegistroSindicatoTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.patronal.TipoSociedadTO;
import mx.gob.imss.cit.dictamen.commons.util.TransformerHelper;
import mx.gob.imss.cit.dictamen.model.NdcAtestiguamientoDO;
import mx.gob.imss.cit.dictamen.model.NdcEjercicioFiscalDO;
import mx.gob.imss.cit.dictamen.model.NdcPreguntaDO;
import mx.gob.imss.cit.dictamen.model.NdcRubroDO;
import mx.gob.imss.cit.dictamen.model.NdcTipoDictamenDO;
import mx.gob.imss.cit.dictamen.model.NdcTipoRespuestaDO;
import mx.gob.imss.cit.dictamen.model.NdtPatronDictamenDO;
import mx.gob.imss.cit.scicp.ws.DocumentoTO;
import mx.gob.imss.cit.ws.commonschema.SGBDE;
import mx.gob.imss.ctirss.delta.global.model.UnidadMedicaFamiliarTO;
import mx.gob.imss.ctirss.delta.model.derechohabiente.ClavePresupuestal;
import mx.gob.imss.ctirss.delta.model.derechohabiente.NivelAtencion;
import mx.gob.imss.ctirss.delta.model.derechohabiente.TipoUMF;
import mx.gob.imss.ctirss.delta.model.derechohabiente.UnidadMedicaFamiliar;
import mx.gob.imss.ctirss.delta.model.domicilio.Asentamiento;
import mx.gob.imss.ctirss.delta.model.domicilio.CodigoPostal;
import mx.gob.imss.ctirss.delta.model.domicilio.Delegacion;
import mx.gob.imss.ctirss.delta.model.domicilio.Domicilio;
import mx.gob.imss.ctirss.delta.model.domicilio.DomicilioCamino;
import mx.gob.imss.ctirss.delta.model.domicilio.DomicilioCarretera;
import mx.gob.imss.ctirss.delta.model.domicilio.DomicilioFiscal;
import mx.gob.imss.ctirss.delta.model.domicilio.EntidadFederativa;
import mx.gob.imss.ctirss.delta.model.domicilio.Localidad;
import mx.gob.imss.ctirss.delta.model.domicilio.Municipio;
import mx.gob.imss.ctirss.delta.model.domicilio.Pais;
import mx.gob.imss.ctirss.delta.model.domicilio.Subdelegacion;
import mx.gob.imss.ctirss.delta.model.domicilio.TipoAdministracion;
import mx.gob.imss.ctirss.delta.model.domicilio.TipoAmbito;
import mx.gob.imss.ctirss.delta.model.domicilio.TipoAsentamiento;
import mx.gob.imss.ctirss.delta.model.domicilio.TipoDerechoTransito;
import mx.gob.imss.ctirss.delta.model.domicilio.TipoDomicilio;
import mx.gob.imss.ctirss.delta.model.domicilio.TipoMargen;
import mx.gob.imss.ctirss.delta.model.domicilio.TipoTerminoGeneral;
import mx.gob.imss.ctirss.delta.model.domicilio.TipoVialidad;
import mx.gob.imss.ctirss.delta.model.domicilio.Vialidad;
import mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.CURP;
import mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.Documento;
import mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.DocumentoPorTipo;
import mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.DocumentoProbatorio;
import mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.Nacimiento;
import mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.TipoDocumentoProbatorio;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.DatosPersonaSAT;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.EstadoCivil;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Fiel;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Fisica;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Identificador;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Moral;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Persona;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Regimen;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Sexo;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.SituacionSAT;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.TipoIdentificador;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.TipoPoder;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.TipoSociedad;
import mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.CorreoElectronico;
import mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.Facebook;
import mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.MedioContacto;
import mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.TipoMedioContacto;
import mx.gob.imss.ctirss.delta.model.gestion.patronal.EscrituraConstitutiva;
import mx.gob.imss.ctirss.delta.model.gestion.patronal.RegistroSindicato;

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
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.derechohabiente.ClavePresupuestalTO.class  	,mx.gob.imss.ctirss.delta.model.derechohabiente.ClavePresupuestal.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.derechohabiente.NivelAtencionTO.class	   	,mx.gob.imss.ctirss.delta.model.derechohabiente.NivelAtencion.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.derechohabiente.TipoUMFTO.class			   	,mx.gob.imss.ctirss.delta.model.derechohabiente.TipoUMF.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.derechohabiente.UnidadMedicaFamiliarTO.class,mx.gob.imss.ctirss.delta.model.derechohabiente.UnidadMedicaFamiliar.class);
		mapClass.put(mx.gob.imss.ctirss.delta.model.derechohabiente.ClavePresupuestal.class   	,mx.gob.imss.cit.dictamen.commons.to.sat.derechohabiente.ClavePresupuestalTO.class  		);
		mapClass.put(mx.gob.imss.ctirss.delta.model.derechohabiente.NivelAtencion.class         ,mx.gob.imss.cit.dictamen.commons.to.sat.derechohabiente.NivelAtencionTO.class	   	  	);
		mapClass.put(mx.gob.imss.ctirss.delta.model.derechohabiente.TipoUMF.class          		,mx.gob.imss.cit.dictamen.commons.to.sat.derechohabiente.TipoUMFTO.class			   		);
		mapClass.put(mx.gob.imss.ctirss.delta.model.derechohabiente.UnidadMedicaFamiliar.class	,mx.gob.imss.cit.dictamen.commons.to.sat.derechohabiente.UnidadMedicaFamiliarTO.class	);
		
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.DocumentoProbatorioTO.class	, mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.DocumentoProbatorio.class		);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.DocumentoPorTipoTO.class		, mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.DocumentoPorTipo.class		);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.DocumentoTO.class				, mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.Documento.class				);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.NacimientoTO.class				, mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.Nacimiento.class				);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.TipoDocumentoProbatorioTO.class, mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.TipoDocumentoProbatorio.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.CURPTO.class					, mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.CURP.class					);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.DocumentoProbatorio.class		, mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.DocumentoProbatorioTO.class	);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.DocumentoPorTipo.class			, mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.DocumentoPorTipoTO.class		);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.Documento.class				, mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.DocumentoTO.class				);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.Nacimiento.class				, mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.NacimientoTO.class				);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.TipoDocumentoProbatorio.class	, mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.TipoDocumentoProbatorioTO.class);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.CURP.class						, mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.CURPTO.class					);
		
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.AsentamientoTO.class			, mx.gob.imss.ctirss.delta.model.domicilio.Asentamiento.class		);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.CodigoPostalTO.class			, mx.gob.imss.ctirss.delta.model.domicilio.CodigoPostal.class		);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.DelegacionTO.class			, mx.gob.imss.ctirss.delta.model.domicilio.Delegacion.class			);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.DomicilioCaminoTO.class		, mx.gob.imss.ctirss.delta.model.domicilio.DomicilioCamino.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.DomicilioCarreteraTO.class	, mx.gob.imss.ctirss.delta.model.domicilio.DomicilioCarretera.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.DomicilioFiscalTO.class		, mx.gob.imss.ctirss.delta.model.domicilio.DomicilioFiscal.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.DomicilioTO.class				, mx.gob.imss.ctirss.delta.model.domicilio.Domicilio.class			);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.EntidadFederativaTO.class		, mx.gob.imss.ctirss.delta.model.domicilio.EntidadFederativa.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.LocalidadTO.class				, mx.gob.imss.ctirss.delta.model.domicilio.Localidad.class			);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.MunicipioTO.class				, mx.gob.imss.ctirss.delta.model.domicilio.Municipio.class			);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.PaisTO.class					, mx.gob.imss.ctirss.delta.model.domicilio.Pais.class				);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.SubdelegacionTO.class			, mx.gob.imss.ctirss.delta.model.domicilio.Subdelegacion.class		);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.TipoAdministracionTO.class	, mx.gob.imss.ctirss.delta.model.domicilio.TipoAdministracion.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.TipoAmbitoTO.class			, mx.gob.imss.ctirss.delta.model.domicilio.TipoAmbito.class			);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.TipoAsentamientoTO.class		, mx.gob.imss.ctirss.delta.model.domicilio.TipoAsentamiento.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.TipoDerechoTransitoTO.class	, mx.gob.imss.ctirss.delta.model.domicilio.TipoDerechoTransito.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.TipoDomicilioTO.class			, mx.gob.imss.ctirss.delta.model.domicilio.TipoDomicilio.class		);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.TipoMargenTO.class			, mx.gob.imss.ctirss.delta.model.domicilio.TipoMargen.class			);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.TipoTerminoGeneralTO.class	, mx.gob.imss.ctirss.delta.model.domicilio.TipoTerminoGeneral.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.TipoVialidadTO.class			, mx.gob.imss.ctirss.delta.model.domicilio.TipoVialidad.class		);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.VialidadTO.class				, mx.gob.imss.ctirss.delta.model.domicilio.Vialidad.class			);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.Asentamiento.class		, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.AsentamientoTO.class			);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.CodigoPostal.class		, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.CodigoPostalTO.class			);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.Delegacion.class			, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.DelegacionTO.class			);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.DomicilioCamino.class		, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.DomicilioCaminoTO.class		);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.DomicilioCarretera.class	, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.DomicilioCarreteraTO.class	);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.DomicilioFiscal.class		, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.DomicilioFiscalTO.class		);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.Domicilio.class			, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.DomicilioTO.class			);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.EntidadFederativa.class	, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.EntidadFederativaTO.class	);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.Localidad.class			, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.LocalidadTO.class			);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.Municipio.class			, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.MunicipioTO.class			);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.Pais.class				, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.PaisTO.class					);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.Subdelegacion.class		, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.SubdelegacionTO.class		);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.TipoAdministracion.class	, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.TipoAdministracionTO.class	);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.TipoAmbito.class			, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.TipoAmbitoTO.class			);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.TipoAsentamiento.class	, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.TipoAsentamientoTO.class		);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.TipoDerechoTransito.class	, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.TipoDerechoTransitoTO.class	);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.TipoDomicilio.class		, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.TipoDomicilioTO.class		);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.TipoMargen.class			, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.TipoMargenTO.class			);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.TipoTerminoGeneral.class	, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.TipoTerminoGeneralTO.class	);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.TipoVialidad.class		, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.TipoVialidadTO.class			);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.Vialidad.class			, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.VialidadTO.class				);
	
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.individuo.DatosPersonalesSATTO.class	, mx.gob.imss.ctirss.delta.model.gestion.individuo.DatosPersonaSAT.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.individuo.EstadoCivilTO.class			, mx.gob.imss.ctirss.delta.model.gestion.individuo.EstadoCivil.class		);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.individuo.FielTO.class					, mx.gob.imss.ctirss.delta.model.gestion.individuo.Fiel.class				);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.individuo.FisicaTO.class				, mx.gob.imss.ctirss.delta.model.gestion.individuo.Fisica.class				);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.individuo.IdentificadorTO.class			, mx.gob.imss.ctirss.delta.model.gestion.individuo.Identificador.class		);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.individuo.MoralTO.class					, mx.gob.imss.ctirss.delta.model.gestion.individuo.Moral.class				);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.individuo.PersonaTO.class				, mx.gob.imss.ctirss.delta.model.gestion.individuo.Persona.class			);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.individuo.RegimenTO.class				, mx.gob.imss.ctirss.delta.model.gestion.individuo.Regimen.class			);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.individuo.SexoTO.class					, mx.gob.imss.ctirss.delta.model.gestion.individuo.Sexo.class				);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.individuo.SituacionSATTO.class			, mx.gob.imss.ctirss.delta.model.gestion.individuo.SituacionSAT.class		);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.individuo.TipoIdentificadorTO.class		, mx.gob.imss.ctirss.delta.model.gestion.individuo.TipoIdentificador.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.individuo.TipoPoderTO.class				, mx.gob.imss.ctirss.delta.model.gestion.individuo.TipoPoder.class			);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.individuo.DatosPersonaSAT.class		, mx.gob.imss.cit.dictamen.commons.to.sat.individuo.DatosPersonalesSATTO.class	);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.individuo.EstadoCivil.class			, mx.gob.imss.cit.dictamen.commons.to.sat.individuo.EstadoCivilTO.class			);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.individuo.Fiel.class				, mx.gob.imss.cit.dictamen.commons.to.sat.individuo.FielTO.class					);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.individuo.Fisica.class				, mx.gob.imss.cit.dictamen.commons.to.sat.individuo.FisicaTO.class				);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.individuo.Identificador.class		, mx.gob.imss.cit.dictamen.commons.to.sat.individuo.IdentificadorTO.class			);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.individuo.Moral.class				, mx.gob.imss.cit.dictamen.commons.to.sat.individuo.MoralTO.class					);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.individuo.Persona.class				, mx.gob.imss.cit.dictamen.commons.to.sat.individuo.PersonaTO.class				);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.individuo.Regimen.class				, mx.gob.imss.cit.dictamen.commons.to.sat.individuo.RegimenTO.class				);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.individuo.Sexo.class				, mx.gob.imss.cit.dictamen.commons.to.sat.individuo.SexoTO.class					);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.individuo.SituacionSAT.class		, mx.gob.imss.cit.dictamen.commons.to.sat.individuo.SituacionSATTO.class			);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.individuo.TipoIdentificador.class	, mx.gob.imss.cit.dictamen.commons.to.sat.individuo.TipoIdentificadorTO.class		);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.individuo.TipoPoder.class			, mx.gob.imss.cit.dictamen.commons.to.sat.individuo.TipoPoderTO.class				);
		
		
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.medio.contacto.CorreoElectronicoTO.class, mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.CorreoElectronico.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.medio.contacto.FacebookTO.class, mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.Facebook.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.medio.contacto.MedioContactoTO.class, mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.MedioContacto.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.medio.contacto.TipoMedioContactoTO.class, mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.TipoMedioContacto.class);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.CorreoElectronico.class	, mx.gob.imss.cit.dictamen.commons.to.sat.medio.contacto.CorreoElectronicoTO.class	);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.Facebook.class			, mx.gob.imss.cit.dictamen.commons.to.sat.medio.contacto.FacebookTO.class				);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.MedioContacto.class		, mx.gob.imss.cit.dictamen.commons.to.sat.medio.contacto.MedioContactoTO.class		);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.TipoMedioContacto.class	, mx.gob.imss.cit.dictamen.commons.to.sat.medio.contacto.TipoMedioContactoTO.class	);
		
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.patronal.EscrituraConstitutivaTO.class	, mx.gob.imss.ctirss.delta.model.gestion.patronal.EscrituraConstitutiva.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.patronal.RegistroSindicatoTO.class		, mx.gob.imss.ctirss.delta.model.gestion.patronal.RegistroSindicato.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.patronal.TipoSociedadTO.class			, mx.gob.imss.ctirss.delta.model.gestion.patronal.TipoSociedad.class);
		mapClass.put( mx.gob.imss.ctirss.delta.model.gestion.patronal.EscrituraConstitutiva.class	,mx.gob.imss.cit.dictamen.commons.to.sat.patronal.EscrituraConstitutivaTO.class	);
		mapClass.put( mx.gob.imss.ctirss.delta.model.gestion.patronal.RegistroSindicato.class		,mx.gob.imss.cit.dictamen.commons.to.sat.patronal.RegistroSindicatoTO.class		);
		mapClass.put( mx.gob.imss.ctirss.delta.model.gestion.patronal.TipoSociedad.class			,mx.gob.imss.cit.dictamen.commons.to.sat.patronal.TipoSociedadTO.class			);
		
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.PatronDictamenTO.class,mx.gob.imss.cit.dictamen.model.NdtPatronDictamenDO.class);
		
		
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
	
	
	
	/****/
	
	public static ClavePresupuestalTO transformer( ClavePresupuestal clavePresupuestal ) {
		ClavePresupuestalTO cont= (ClavePresupuestalTO) TransformerHelper.get(mapClass,clavePresupuestal, ClavePresupuestalTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static NivelAtencionTO transformer( NivelAtencion nivelAtencion ) {
		NivelAtencionTO cont= (NivelAtencionTO) TransformerHelper.get(mapClass,nivelAtencion, NivelAtencionTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoUMFTO transformer( TipoUMF tipoUMF ) {
		TipoUMFTO cont= (TipoUMFTO) TransformerHelper.get(mapClass,tipoUMF, ClavePresupuestalTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static UnidadMedicaFamiliarTO transformer( UnidadMedicaFamiliar unidadMedicaFamiliar ) {
		UnidadMedicaFamiliarTO cont= (UnidadMedicaFamiliarTO) TransformerHelper.get(mapClass,unidadMedicaFamiliar, UnidadMedicaFamiliarTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static ClavePresupuestal transformer( ClavePresupuestalTO clavePresupuestalTO ) {
		ClavePresupuestal cont= (ClavePresupuestal) TransformerHelper.get(mapClass,clavePresupuestalTO, ClavePresupuestal.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static NivelAtencion transformer( NivelAtencionTO nivelAtencionTO ) {
		NivelAtencion cont= (NivelAtencion) TransformerHelper.get(mapClass,nivelAtencionTO, NivelAtencion.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static TipoUMF transformer( TipoUMFTO tipoUMFTO ) {
		TipoUMF cont= (TipoUMF) TransformerHelper.get(mapClass,tipoUMFTO, TipoUMF.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static UnidadMedicaFamiliar transformer( UnidadMedicaFamiliarTO unidadMedicaFamiliarTO ) {
		UnidadMedicaFamiliar cont= (UnidadMedicaFamiliar) TransformerHelper.get(mapClass,unidadMedicaFamiliarTO, UnidadMedicaFamiliar.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static DocumentoProbatorioTO transformer( DocumentoProbatorio documentoProbatorio ) {
		DocumentoProbatorioTO cont= (DocumentoProbatorioTO) TransformerHelper.get(mapClass,documentoProbatorio, DocumentoProbatorioTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static DocumentoPorTipoTO transformer( DocumentoPorTipo documentoPorTipo ) {
		DocumentoPorTipoTO cont= (DocumentoPorTipoTO) TransformerHelper.get(mapClass,documentoPorTipo, DocumentoPorTipoTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static DocumentoTO transformer( Documento documento ) {
		DocumentoTO cont= (DocumentoTO) TransformerHelper.get(mapClass,documento, DocumentoTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static NacimientoTO transformer( Nacimiento nacimiento ) {
		NacimientoTO cont= (NacimientoTO) TransformerHelper.get(mapClass,nacimiento, NacimientoTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static TipoDocumentoProbatorioTO transformer( TipoDocumentoProbatorio tipoDocumentoProbatorioTO ) {
		TipoDocumentoProbatorioTO cont= (TipoDocumentoProbatorioTO) TransformerHelper.get(mapClass,tipoDocumentoProbatorioTO, TipoDocumentoProbatorioTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static CURPTO transformer( CURP curp ) {
		CURPTO cont= (CURPTO) TransformerHelper.get(mapClass,curp, CURPTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static DocumentoProbatorio transformer( DocumentoProbatorioTO documentoProbatorioTO ) {
		DocumentoProbatorio cont= (DocumentoProbatorio) TransformerHelper.get(mapClass,documentoProbatorioTO, DocumentoProbatorio.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static DocumentoPorTipo transformer( DocumentoPorTipoTO documentoPorTipoTO ) {
		DocumentoPorTipo cont= (DocumentoPorTipo) TransformerHelper.get(mapClass,documentoPorTipoTO, DocumentoPorTipo.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Documento transformer( DocumentoTO documentoTO ) {
		Documento cont= (Documento) TransformerHelper.get(mapClass,documentoTO, Documento.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Nacimiento transformer( NacimientoTO nacimientoTO ) {
		Nacimiento cont= (Nacimiento) TransformerHelper.get(mapClass,nacimientoTO, Nacimiento.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static TipoDocumentoProbatorio transformer( TipoDocumentoProbatorioTO tipoDocumentoProbatorioTO ) {
		TipoDocumentoProbatorio cont= (TipoDocumentoProbatorio) TransformerHelper.get(mapClass,tipoDocumentoProbatorioTO, TipoDocumentoProbatorio.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static CURP transformer( CURPTO curpTO ) {
		CURP cont= (CURP) TransformerHelper.get(mapClass,curpTO, CURP.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static AsentamientoTO transformer( Asentamiento asentamiento ) {
		AsentamientoTO cont= (AsentamientoTO) TransformerHelper.get(mapClass,asentamiento, AsentamientoTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static CodigoPostalTO transformer( CodigoPostal codigoPostal ) {
		CodigoPostalTO cont= (CodigoPostalTO) TransformerHelper.get(mapClass,codigoPostal, CodigoPostalTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static DelegacionTO transformer( Delegacion delegacion ) {
		DelegacionTO cont= (DelegacionTO) TransformerHelper.get(mapClass,delegacion, DelegacionTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static DomicilioCaminoTO transformer( DomicilioCamino domicilioCamino ) {
		DomicilioCaminoTO cont= (DomicilioCaminoTO) TransformerHelper.get(mapClass,domicilioCamino, DomicilioCaminoTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static DomicilioCarreteraTO transformer( DomicilioCarretera domicilioCarretera ) {
		DomicilioCarreteraTO cont= (DomicilioCarreteraTO) TransformerHelper.get(mapClass,domicilioCarretera, DomicilioCarreteraTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static DomicilioFiscalTO transformer( DomicilioFiscal domicilioFiscal ) {
		DomicilioFiscalTO cont= (DomicilioFiscalTO) TransformerHelper.get(mapClass,domicilioFiscal, DomicilioFiscalTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static DomicilioTO transformer( Domicilio domicilio ) {
		DomicilioTO cont= (DomicilioTO) TransformerHelper.get(mapClass,domicilio, DomicilioTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static EntidadFederativaTO transformer( EntidadFederativa entidadFederativa ) {
		EntidadFederativaTO cont= (EntidadFederativaTO) TransformerHelper.get(mapClass,entidadFederativa, EntidadFederativaTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static LocalidadTO transformer( Localidad localidad ) {
		LocalidadTO cont= (LocalidadTO) TransformerHelper.get(mapClass,localidad, LocalidadTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static MunicipioTO transformer( Municipio municipio ) {
		MunicipioTO cont= (MunicipioTO) TransformerHelper.get(mapClass,municipio, MunicipioTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static PaisTO transformer( Pais pais ) {
		PaisTO cont= (PaisTO) TransformerHelper.get(mapClass,pais, PaisTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static SubdelegacionTO transformer( Subdelegacion subdelegacion ) {
		SubdelegacionTO cont= (SubdelegacionTO) TransformerHelper.get(mapClass,subdelegacion, SubdelegacionTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoAdministracionTO transformer( TipoAdministracion tipoAdministracion ) {
		TipoAdministracionTO cont= (TipoAdministracionTO) TransformerHelper.get(mapClass,tipoAdministracion, TipoAdministracionTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoAmbitoTO transformer( TipoAmbito tipoAmbito ) {
		TipoAmbitoTO cont= (TipoAmbitoTO) TransformerHelper.get(mapClass,tipoAmbito, TipoAmbitoTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoAsentamientoTO transformer( TipoAsentamiento tipoAsentamiento ) {
		TipoAsentamientoTO cont= (TipoAsentamientoTO) TransformerHelper.get(mapClass,tipoAsentamiento, TipoAsentamientoTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoDerechoTransitoTO transformer( TipoDerechoTransito tipoDerechoTransito ) {
		TipoDerechoTransitoTO cont= (TipoDerechoTransitoTO) TransformerHelper.get(mapClass,tipoDerechoTransito, TipoDerechoTransitoTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoDomicilioTO transformer( TipoDomicilio tipoDomiciliO) {
		TipoDomicilioTO cont= (TipoDomicilioTO) TransformerHelper.get(mapClass,tipoDomiciliO, TipoDomicilioTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoMargenTO transformer( TipoMargen 	tipoMargen ) {
		TipoMargenTO cont= (TipoMargenTO) TransformerHelper.get(mapClass,tipoMargen, TipoMargenTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoTerminoGeneralTO transformer( TipoTerminoGeneral tipoTerminoGeneral ) {
		TipoTerminoGeneralTO cont= (TipoTerminoGeneralTO) TransformerHelper.get(mapClass,tipoTerminoGeneral, TipoTerminoGeneralTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static TipoVialidadTO transformer( TipoVialidad tipoVialidad ) {
		TipoVialidadTO cont= (TipoVialidadTO) TransformerHelper.get(mapClass,tipoVialidad, TipoVialidadTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static VialidadTO transformer( Vialidad vialidad ) {
		VialidadTO cont= (VialidadTO) TransformerHelper.get(mapClass,vialidad, VialidadTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Asentamiento transformer( AsentamientoTO asentamientoTO ) {
		Asentamiento cont= (Asentamiento) TransformerHelper.get(mapClass,asentamientoTO, Asentamiento.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static CodigoPostal transformer( CodigoPostalTO codigoPostalTO ) {
		CodigoPostal cont= (CodigoPostal) TransformerHelper.get(mapClass,codigoPostalTO, CodigoPostal.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Delegacion transformer( DelegacionTO delegacionTO ) {
		Delegacion cont= (Delegacion) TransformerHelper.get(mapClass,delegacionTO, Delegacion.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static DomicilioCamino transformer( DomicilioCaminoTO domicilioCaminoTO ) {
		DomicilioCamino cont= (DomicilioCamino) TransformerHelper.get(mapClass,domicilioCaminoTO, DomicilioCamino.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static DomicilioCarretera transformer( DomicilioCarreteraTO domicilioCarreteraTO ) {
		DomicilioCarretera cont= (DomicilioCarretera) TransformerHelper.get(mapClass,domicilioCarreteraTO, DomicilioCarretera.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static DomicilioFiscal transformer( DomicilioFiscalTO domicilioFiscalTO ) {
		DomicilioFiscal cont= (DomicilioFiscal) TransformerHelper.get(mapClass,domicilioFiscalTO, DomicilioFiscal.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Domicilio transformer( DomicilioTO domicilioTO ) {
		Domicilio cont= (Domicilio) TransformerHelper.get(mapClass,domicilioTO, Domicilio.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static EntidadFederativa transformer( EntidadFederativaTO entidadFederativaTO ) {
		EntidadFederativa cont= (EntidadFederativa) TransformerHelper.get(mapClass,entidadFederativaTO, EntidadFederativa.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Localidad transformer( LocalidadTO localidadTO ) {
		Localidad cont= (Localidad) TransformerHelper.get(mapClass,localidadTO, Localidad.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Municipio transformer( MunicipioTO municipioTO ) {
		Municipio cont= (Municipio) TransformerHelper.get(mapClass,municipioTO, Municipio.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static Pais transformer( PaisTO paisTO ) {
		Pais cont= (Pais) TransformerHelper.get(mapClass,paisTO, Pais.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Subdelegacion transformer( SubdelegacionTO subdelegacionTO ) {
		Subdelegacion cont= (Subdelegacion) TransformerHelper.get(mapClass,subdelegacionTO, Subdelegacion.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoAdministracion transformer( TipoAdministracionTO tipoAdministracionTO ) {
		TipoAdministracion cont= (TipoAdministracion) TransformerHelper.get(mapClass,tipoAdministracionTO, TipoAdministracion.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static TipoAmbito transformer( TipoAmbitoTO tipoAmbitoTO ) {
		TipoAmbito cont= (TipoAmbito) TransformerHelper.get(mapClass,tipoAmbitoTO, TipoAmbito.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoAsentamiento transformer( TipoAsentamientoTO tipoAsentamientoTO ) {
		TipoAsentamiento cont= (TipoAsentamiento) TransformerHelper.get(mapClass,tipoAsentamientoTO, TipoAsentamiento.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoDerechoTransito transformer( TipoDerechoTransitoTO tipoDerechoTransitoTO ) {
		TipoDerechoTransito cont= (TipoDerechoTransito) TransformerHelper.get(mapClass,tipoDerechoTransitoTO, TipoDerechoTransito.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static TipoDomicilio transformer( TipoDomicilioTO tipoDomicilioTO ) {
		TipoDomicilio cont= (TipoDomicilio) TransformerHelper.get(mapClass,tipoDomicilioTO, TipoDomicilio.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoMargen transformer( TipoMargenTO tipoMargenTO ) {
		TipoMargen cont= (TipoMargen) TransformerHelper.get(mapClass,tipoMargenTO, TipoMargen.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoTerminoGeneral transformer( TipoTerminoGeneralTO tipoTerminoGeneralTO ) {
		TipoTerminoGeneral cont= (TipoTerminoGeneral) TransformerHelper.get(mapClass,tipoTerminoGeneralTO, TipoTerminoGeneral.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static TipoVialidad transformer( TipoVialidadTO tipoVialidadTO ) {
		TipoVialidad cont= (TipoVialidad) TransformerHelper.get(mapClass,tipoVialidadTO, TipoVialidad.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Vialidad transformer( VialidadTO vialidadTO ) {
		Vialidad cont= (Vialidad) TransformerHelper.get(mapClass,vialidadTO, Vialidad.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	

	public static DatosPersonalesSATTO transformer( DatosPersonaSAT datosPersonalesSAT ) {
		DatosPersonalesSATTO cont= (DatosPersonalesSATTO) TransformerHelper.get(mapClass,datosPersonalesSAT, DatosPersonalesSATTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static EstadoCivilTO transformer( EstadoCivil estadoCivil ) {
		EstadoCivilTO cont= (EstadoCivilTO) TransformerHelper.get(mapClass,estadoCivil, EstadoCivilTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static FielTO transformer( Fiel fiel ) {
		FielTO cont= (FielTO) TransformerHelper.get(mapClass,fiel, FielTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static FisicaTO transformer( Fisica fisica ) {
		FisicaTO cont= (FisicaTO) TransformerHelper.get(mapClass,fisica, FisicaTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static IdentificadorTO transformer( Identificador identificador ) {
		IdentificadorTO cont= (IdentificadorTO) TransformerHelper.get(mapClass,identificador, IdentificadorTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static MoralTO transformer( Moral moral ) {
		MoralTO cont= (MoralTO) TransformerHelper.get(mapClass,moral, MoralTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static PersonaTO transformer( Persona persona ) {
		PersonaTO cont= (PersonaTO) TransformerHelper.get(mapClass,persona, Persona.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static RegimenTO transformer( Regimen regimen ) {
		RegimenTO cont= (RegimenTO) TransformerHelper.get(mapClass,regimen, RegimenTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static SexoTO transformer( Sexo sexo ) {
		SexoTO cont= (SexoTO) TransformerHelper.get(mapClass,sexo, SexoTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static SituacionSATTO transformer( SituacionSAT situacionSAT ) {
		SituacionSATTO cont= (SituacionSATTO) TransformerHelper.get(mapClass,situacionSAT, SituacionSATTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static TipoIdentificadorTO transformer( TipoIdentificador tipoIdentificador ) {
		TipoIdentificadorTO cont= (TipoIdentificadorTO) TransformerHelper.get(mapClass,tipoIdentificador, TipoIdentificadorTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoPoderTO transformer( TipoPoder tipoPoder ) {
		TipoPoderTO cont= (TipoPoderTO) TransformerHelper.get(mapClass,tipoPoder, TipoPoderTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	

	public static DatosPersonaSAT transformer( DatosPersonalesSATTO datosPersonaSATTO ) {
		DatosPersonaSAT cont= (DatosPersonaSAT) TransformerHelper.get(mapClass,datosPersonaSATTO, DatosPersonaSAT.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static EstadoCivil transformer( EstadoCivilTO estadoCivilTO ) {
		EstadoCivil cont= (EstadoCivil) TransformerHelper.get(mapClass,estadoCivilTO, EstadoCivil.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Fiel transformer( FielTO fielTO ) {
		Fiel cont= (Fiel) TransformerHelper.get(mapClass,fielTO, Fiel.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Fisica transformer( FisicaTO fisicaTO ) {
		Fisica cont= (Fisica) TransformerHelper.get(mapClass,fisicaTO, Fisica.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static Identificador transformer( IdentificadorTO identificadorTO ) {
		Identificador cont= (Identificador) TransformerHelper.get(mapClass,identificadorTO, Identificador.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Moral transformer( MoralTO moralTO ) {
		Moral cont= (Moral) TransformerHelper.get(mapClass,moralTO, Moral.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Persona transformer(PersonaTO personaTO ) {
		Persona cont= (Persona) TransformerHelper.get(mapClass,personaTO, Persona.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static Regimen transformer( RegimenTO regimenTO ) {
		Regimen cont= (Regimen) TransformerHelper.get(mapClass,regimenTO, Regimen.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Sexo transformer( SexoTO sexoTO ) {
		Sexo cont= (Sexo) TransformerHelper.get(mapClass,sexoTO, Sexo.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static SituacionSAT transformer( SituacionSATTO situacionSATTO ) {
		SituacionSAT cont= (SituacionSAT) TransformerHelper.get(mapClass,situacionSATTO, SituacionSAT.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static TipoIdentificador transformer( TipoIdentificadorTO tipoIdentificadorTO ) {
		TipoIdentificador cont= (TipoIdentificador) TransformerHelper.get(mapClass,tipoIdentificadorTO, TipoIdentificador.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoPoder transformer( TipoPoderTO tipoPoderTO ) {
		TipoPoder cont= (TipoPoder) TransformerHelper.get(mapClass,tipoPoderTO, TipoPoder.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static CorreoElectronico transformer( CorreoElectronico correoElectronico ) {
		CorreoElectronico cont= (CorreoElectronico) TransformerHelper.get(mapClass,correoElectronico, CorreoElectronico.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static MedioContacto transformer( MedioContactoTO medioContactoTO ) {
		MedioContacto cont= (MedioContacto) TransformerHelper.get(mapClass,medioContactoTO, MedioContacto.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Facebook transformer( FacebookTO facebookTO ) {
		Facebook cont= (Facebook) TransformerHelper.get(mapClass,facebookTO, Facebook.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoMedioContacto transformer( TipoMedioContactoTO tipoMedioContactoTO ) {
		TipoMedioContacto cont= (TipoMedioContacto) TransformerHelper.get(mapClass,tipoMedioContactoTO, TipoMedioContacto.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static CorreoElectronicoTO transformer( CorreoElectronicoTO correoElectronico ) {
		CorreoElectronicoTO cont= (CorreoElectronicoTO) TransformerHelper.get(mapClass,correoElectronico, CorreoElectronicoTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static FacebookTO transformer( Facebook facebook ) {
		FacebookTO cont= (FacebookTO) TransformerHelper.get(mapClass,facebook, FacebookTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static MedioContactoTO transformer( MedioContacto medioContacto ) {
		MedioContactoTO cont= (MedioContactoTO) TransformerHelper.get(mapClass,medioContacto, MedioContactoTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static TipoMedioContactoTO transformer( TipoMedioContacto tipoMedioContacto ) {
		TipoMedioContactoTO cont= (TipoMedioContactoTO) TransformerHelper.get(mapClass,tipoMedioContacto, TipoMedioContactoTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static EscrituraConstitutivaTO transformer( EscrituraConstitutiva escrituraConstitutiva ) {
		EscrituraConstitutivaTO cont= (EscrituraConstitutivaTO) TransformerHelper.get(mapClass,escrituraConstitutiva, EscrituraConstitutivaTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static RegistroSindicatoTO transformer( RegistroSindicato registroSindicato ) {
		RegistroSindicatoTO cont= (RegistroSindicatoTO) TransformerHelper.get(mapClass,registroSindicato, RegistroSindicatoTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static TipoSociedadTO transformer( TipoSociedad tipoSociedad ) {
		TipoSociedadTO cont= (TipoSociedadTO) TransformerHelper.get(mapClass,tipoSociedad, TipoSociedadTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static EscrituraConstitutiva transformer( EscrituraConstitutivaTO escrituraConstitutivaTO ) {
		EscrituraConstitutiva cont= (EscrituraConstitutiva) TransformerHelper.get(mapClass,escrituraConstitutivaTO, EscrituraConstitutiva.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static RegistroSindicato transformer( RegistroSindicatoTO registroSindicatoTO ) {
		RegistroSindicato cont= (RegistroSindicato) TransformerHelper.get(mapClass,registroSindicatoTO, RegistroSindicato.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoSociedad transformer( TipoSociedadTO tipoSociedadTO ) {
		TipoSociedad cont= (TipoSociedad) TransformerHelper.get(mapClass,tipoSociedadTO, TipoSociedad.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
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
		EjercicioFiscalTO cont= (EjercicioFiscalTO) TransformerHelper.get(mapClass,ejerDO, EjercicioFiscalTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static NdcEjercicioFiscalDO transformer( EjercicioFiscalTO ejerTO ) {
		NdcEjercicioFiscalDO cont= (NdcEjercicioFiscalDO) TransformerHelper.get(mapClass,ejerTO, NdcEjercicioFiscalDO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
}
