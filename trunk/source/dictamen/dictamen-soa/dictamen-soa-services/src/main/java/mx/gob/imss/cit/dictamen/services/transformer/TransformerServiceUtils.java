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
<<<<<<< .mineimport mx.gob.imss.cit.dictamen.commons.to.*;
import mx.gob.imss.cit.dictamen.commons.to.sat.derechohabiente.to.ClavePresupuestalTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.derechohabiente.to.NivelAtencionTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.derechohabiente.to.TipoUMFTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.to.CURPTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.to.DocumentoPorTipoTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.to.DocumentoProbatorioTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.to.NacimientoTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.to.TipoDocumentoProbatorioTO;
=======import mx.gob.imss.cit.dictamen.commons.to.domain.PatronDictamenTO;
>>>>>>> .theirsimport mx.gob.imss.cit.dictamen.commons.util.TransformerHelper;
import mx.gob.imss.cit.dictamen.model.NdcEjercicioFiscalDO;
import mx.gob.imss.cit.dictamen.model.NdcTipoDictamenDO;
import mx.gob.imss.cit.dictamen.model.NdtPatronDictamenDO;
import mx.gob.imss.cit.dictamen.services.constants.DictamenServicesConstants;
import mx.gob.imss.cit.scicp.ws.DocumentoTO;
import mx.gob.imss.cit.ws.commonschema.SGBDE;
import mx.gob.imss.ctirss.delta.global.model.UnidadMedicaFamiliarTO;
import mx.gob.imss.ctirss.delta.model.derechohabiente.ClavePresupuestal;
import mx.gob.imss.ctirss.delta.model.derechohabiente.NivelAtencion;
import mx.gob.imss.ctirss.delta.model.derechohabiente.TipoUMF;
import mx.gob.imss.ctirss.delta.model.derechohabiente.UnidadMedicaFamiliar;
import mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.CURP;
import mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.Documento;
import mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.DocumentoPorTipo;
import mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.DocumentoProbatorio;
import mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.Nacimiento;
import mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.TipoDocumentoProbatorio;
import mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.*;
import mx.gob.imss.ctirss.delta.model.domicilio.*;
import mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to.*;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.*;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.TipoSociedad;
import mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.*;
import mx.gob.imss.cit.dictamen.commons.to.sat.medio.contacto.to.*;
import mx.gob.imss.cit.dictamen.commons.to.sat.patronal.to.*;
import mx.gob.imss.ctirss.delta.model.gestion.patronal.*;

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
<<<<<<< .mine		
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.derechohabiente.to.ClavePresupuestalTO.class  	,mx.gob.imss.ctirss.delta.model.derechohabiente.ClavePresupuestal.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.derechohabiente.to.NivelAtencionTO.class	   	,mx.gob.imss.ctirss.delta.model.derechohabiente.NivelAtencion.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.derechohabiente.to.TipoUMFTO.class			   	,mx.gob.imss.ctirss.delta.model.derechohabiente.TipoUMF.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.derechohabiente.to.UnidadMedicaFamiliarTO.class,mx.gob.imss.ctirss.delta.model.derechohabiente.UnidadMedicaFamiliar.class);
		mapClass.put(mx.gob.imss.ctirss.delta.model.derechohabiente.ClavePresupuestal.class   	,mx.gob.imss.cit.dictamen.commons.to.sat.derechohabiente.to.ClavePresupuestalTO.class  		);
		mapClass.put(mx.gob.imss.ctirss.delta.model.derechohabiente.NivelAtencion.class         ,mx.gob.imss.cit.dictamen.commons.to.sat.derechohabiente.to.NivelAtencionTO.class	   	  	);
		mapClass.put(mx.gob.imss.ctirss.delta.model.derechohabiente.TipoUMF.class          		,mx.gob.imss.cit.dictamen.commons.to.sat.derechohabiente.to.TipoUMFTO.class			   		);
		mapClass.put(mx.gob.imss.ctirss.delta.model.derechohabiente.UnidadMedicaFamiliar.class	,mx.gob.imss.cit.dictamen.commons.to.sat.derechohabiente.to.UnidadMedicaFamiliarTO.class	);
		
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.to.DocumentoProbatorioTO.class	, mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.DocumentoProbatorio.class		);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.to.DocumentoPorTipoTO.class		, mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.DocumentoPorTipo.class		);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.to.DocumentoTO.class				, mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.Documento.class				);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.to.NacimientoTO.class				, mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.Nacimiento.class				);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.to.TipoDocumentoProbatorioTO.class, mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.TipoDocumentoProbatorio.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.to.CURPTO.class					, mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.CURP.class					);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.DocumentoProbatorio.class		, mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.to.DocumentoProbatorioTO.class	);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.DocumentoPorTipo.class			, mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.to.DocumentoPorTipoTO.class		);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.Documento.class				, mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.to.DocumentoTO.class				);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.Nacimiento.class				, mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.to.NacimientoTO.class				);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.TipoDocumentoProbatorio.class	, mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.to.TipoDocumentoProbatorioTO.class);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.documento.probatorio.CURP.class						, mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.to.CURPTO.class					);
		
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.AsentamientoTO.class			, mx.gob.imss.ctirss.delta.model.domicilio.Asentamiento.class		);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.CodigoPostalTO.class			, mx.gob.imss.ctirss.delta.model.domicilio.CodigoPostal.class		);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.DelegacionTO.class			, mx.gob.imss.ctirss.delta.model.domicilio.Delegacion.class			);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.DomicilioCaminoTO.class		, mx.gob.imss.ctirss.delta.model.domicilio.DomicilioCamino.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.DomicilioCarreteraTO.class	, mx.gob.imss.ctirss.delta.model.domicilio.DomicilioCarretera.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.DomicilioFiscalTO.class		, mx.gob.imss.ctirss.delta.model.domicilio.DomicilioFiscal.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.DomicilioTO.class				, mx.gob.imss.ctirss.delta.model.domicilio.Domicilio.class			);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.EntidadFederativaTO.class		, mx.gob.imss.ctirss.delta.model.domicilio.EntidadFederativa.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.LocalidadTO.class				, mx.gob.imss.ctirss.delta.model.domicilio.Localidad.class			);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.MunicipioTO.class				, mx.gob.imss.ctirss.delta.model.domicilio.Municipio.class			);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.PaisTO.class					, mx.gob.imss.ctirss.delta.model.domicilio.Pais.class				);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.SubdelegacionTO.class			, mx.gob.imss.ctirss.delta.model.domicilio.Subdelegacion.class		);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.TipoAdministracionTO.class	, mx.gob.imss.ctirss.delta.model.domicilio.TipoAdministracion.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.TipoAmbitoTO.class			, mx.gob.imss.ctirss.delta.model.domicilio.TipoAmbito.class			);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.TipoAsentamientoTO.class		, mx.gob.imss.ctirss.delta.model.domicilio.TipoAsentamiento.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.TipoDerechoTransitoTO.class	, mx.gob.imss.ctirss.delta.model.domicilio.TipoDerechoTransito.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.TipoDomicilioTO.class			, mx.gob.imss.ctirss.delta.model.domicilio.TipoDomicilio.class		);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.TipoMargenTO.class			, mx.gob.imss.ctirss.delta.model.domicilio.TipoMargen.class			);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.TipoTerminoGeneralTO.class	, mx.gob.imss.ctirss.delta.model.domicilio.TipoTerminoGeneral.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.TipoVialidadTO.class			, mx.gob.imss.ctirss.delta.model.domicilio.TipoVialidad.class		);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.VialidadTO.class				, mx.gob.imss.ctirss.delta.model.domicilio.Vialidad.class			);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.Asentamiento.class		, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.AsentamientoTO.class			);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.CodigoPostal.class		, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.CodigoPostalTO.class			);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.Delegacion.class			, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.DelegacionTO.class			);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.DomicilioCamino.class		, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.DomicilioCaminoTO.class		);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.DomicilioCarretera.class	, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.DomicilioCarreteraTO.class	);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.DomicilioFiscal.class		, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.DomicilioFiscalTO.class		);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.Domicilio.class			, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.DomicilioTO.class			);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.EntidadFederativa.class	, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.EntidadFederativaTO.class	);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.Localidad.class			, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.LocalidadTO.class			);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.Municipio.class			, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.MunicipioTO.class			);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.Pais.class				, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.PaisTO.class					);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.Subdelegacion.class		, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.SubdelegacionTO.class		);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.TipoAdministracion.class	, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.TipoAdministracionTO.class	);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.TipoAmbito.class			, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.TipoAmbitoTO.class			);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.TipoAsentamiento.class	, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.TipoAsentamientoTO.class		);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.TipoDerechoTransito.class	, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.TipoDerechoTransitoTO.class	);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.TipoDomicilio.class		, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.TipoDomicilioTO.class		);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.TipoMargen.class			, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.TipoMargenTO.class			);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.TipoTerminoGeneral.class	, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.TipoTerminoGeneralTO.class	);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.TipoVialidad.class		, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.TipoVialidadTO.class			);
		mapClass.put(mx.gob.imss.ctirss.delta.model.domicilio.Vialidad.class			, mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.VialidadTO.class				);
	
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to.DatosPersonalesSATTO.class	, mx.gob.imss.ctirss.delta.model.gestion.individuo.DatosPersonaSAT.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to.EstadoCivilTO.class			, mx.gob.imss.ctirss.delta.model.gestion.individuo.EstadoCivil.class		);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to.FielTO.class					, mx.gob.imss.ctirss.delta.model.gestion.individuo.Fiel.class				);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to.FisicaTO.class				, mx.gob.imss.ctirss.delta.model.gestion.individuo.Fisica.class				);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to.IdentificadorTO.class			, mx.gob.imss.ctirss.delta.model.gestion.individuo.Identificador.class		);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to.MoralTO.class					, mx.gob.imss.ctirss.delta.model.gestion.individuo.Moral.class				);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to.PersonaTO.class				, mx.gob.imss.ctirss.delta.model.gestion.individuo.Persona.class			);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to.RegimenTO.class				, mx.gob.imss.ctirss.delta.model.gestion.individuo.Regimen.class			);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to.SexoTO.class					, mx.gob.imss.ctirss.delta.model.gestion.individuo.Sexo.class				);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to.SituacionSATTO.class			, mx.gob.imss.ctirss.delta.model.gestion.individuo.SituacionSAT.class		);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to.TipoIdentificadorTO.class		, mx.gob.imss.ctirss.delta.model.gestion.individuo.TipoIdentificador.class	);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to.TipoPoderTO.class				, mx.gob.imss.ctirss.delta.model.gestion.individuo.TipoPoder.class			);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.individuo.DatosPersonaSAT.class		, mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to.DatosPersonalesSATTO.class	);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.individuo.EstadoCivil.class			, mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to.EstadoCivilTO.class			);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.individuo.Fiel.class				, mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to.FielTO.class					);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.individuo.Fisica.class				, mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to.FisicaTO.class				);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.individuo.Identificador.class		, mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to.IdentificadorTO.class			);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.individuo.Moral.class				, mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to.MoralTO.class					);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.individuo.Persona.class				, mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to.PersonaTO.class				);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.individuo.Regimen.class				, mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to.RegimenTO.class				);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.individuo.Sexo.class				, mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to.SexoTO.class					);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.individuo.SituacionSAT.class		, mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to.SituacionSATTO.class			);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.individuo.TipoIdentificador.class	, mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to.TipoIdentificadorTO.class		);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.individuo.TipoPoder.class			, mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to.TipoPoderTO.class				);
		
		
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.medio.contacto.to.CorreoElectronicoTO.class, mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.CorreoElectronico.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.medio.contacto.to.FacebookTO.class, mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.Facebook.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.medio.contacto.to.MedioContactoTO.class, mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.MedioContacto.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.medio.contacto.to.TipoMedioContactoTO.class, mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.TipoMedioContacto.class);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.CorreoElectronico.class	, mx.gob.imss.cit.dictamen.commons.to.sat.medio.contacto.to.CorreoElectronicoTO.class	);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.Facebook.class			, mx.gob.imss.cit.dictamen.commons.to.sat.medio.contacto.to.FacebookTO.class				);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.MedioContacto.class		, mx.gob.imss.cit.dictamen.commons.to.sat.medio.contacto.to.MedioContactoTO.class		);
		mapClass.put(mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.TipoMedioContacto.class	, mx.gob.imss.cit.dictamen.commons.to.sat.medio.contacto.to.TipoMedioContactoTO.class	);
		
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.patronal.to.EscrituraConstitutivaTO.class	, mx.gob.imss.ctirss.delta.model.gestion.patronal.EscrituraConstitutiva.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.patronal.to.RegistroSindicatoTO.class		, mx.gob.imss.ctirss.delta.model.gestion.patronal.RegistroSindicato.class);
		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.sat.patronal.to.TipoSociedadTO.class			, mx.gob.imss.ctirss.delta.model.gestion.patronal.TipoSociedad.class);
		mapClass.put( mx.gob.imss.ctirss.delta.model.gestion.patronal.EscrituraConstitutiva.class	,mx.gob.imss.cit.dictamen.commons.to.sat.patronal.to.EscrituraConstitutivaTO.class	);
		mapClass.put( mx.gob.imss.ctirss.delta.model.gestion.patronal.RegistroSindicato.class		,mx.gob.imss.cit.dictamen.commons.to.sat.patronal.to.RegistroSindicatoTO.class		);
		mapClass.put( mx.gob.imss.ctirss.delta.model.gestion.patronal.TipoSociedad.class			,mx.gob.imss.cit.dictamen.commons.to.sat.patronal.to.TipoSociedadTO.class			);
		
=======		mapClass.put(mx.gob.imss.cit.dictamen.commons.to.domain.PatronDictamenTO.class,mx.gob.imss.cit.dictamen.model.NdtPatronDictamenDO.class);
>>>>>>> .theirs	}
	
	
	private TransformerServiceUtils(){
		
	}



	public static BovedaDocumentoTO transformer( Document document ) {
		
		return (BovedaDocumentoTO) TransformerHelper.get(mapClass,document, BovedaDocumentoTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static BovedaMetadataTO transformer(Metadata metadata){		
		return (BovedaMetadataTO) TransformerHelper.get(mapClass,metadata, BovedaMetadataTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	public static BovedaTramiteTO transformer( Tramite tramite ) {
		return (BovedaTramiteTO) TransformerHelper.get(mapClass,tramite, BovedaTramiteTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO);
	}	
	
	public static BovedaActorTO transformer(Actor actor){
		return  (BovedaActorTO) TransformerHelper.get(mapClass,actor, BovedaActorTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO);
	}
	
	public static BovedaBaseObjectTO transformer(BaseObject baseObject){
		return (BovedaBaseObjectTO) TransformerHelper.get(mapClass,baseObject, BovedaBaseObjectTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO);
	}	
	
	public static BovedaHeaderTO transformer(SGBDE sgbde){		
		return (BovedaHeaderTO) TransformerHelper.get(mapClass,sgbde, BovedaHeaderTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO);
	}	

	public static Document transformer( BovedaDocumentoTO documentoTO ) {		
		return (Document) TransformerHelper.get(mapClass,documentoTO, Document.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO);
	}	
	
	public static Metadata transformer(BovedaMetadataTO metadataTO){		
		return (Metadata) TransformerHelper.get(mapClass,metadataTO, Metadata.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO);
	}
	
	public static Tramite transformer( BovedaTramiteTO tramiteTO ) {
		return  (Tramite) TransformerHelper.get(mapClass,tramiteTO, Tramite.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO);
	}	
	
	public static Actor transformer(BovedaActorTO actorTO){		
		return (Actor) TransformerHelper.get(mapClass,actorTO, Actor.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO);
	}
	
	public static BaseObject transformer(BovedaBaseObjectTO baseObjectTO){
		return (BaseObject) TransformerHelper.get(mapClass,baseObjectTO, BaseObject.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
	}	
	
	public static SGBDE transformer(BovedaHeaderTO headerTO){ 
		return (SGBDE) TransformerHelper.get(mapClass,headerTO, SGBDE.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
	}
	
	public static NdtPatronDictamenDO transformer( PatronDictamenTO patron ) {
		NdtPatronDictamenDO cont=  (NdtPatronDictamenDO) TransformerHelper.get(mapClass,patron, NdtPatronDictamenDO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		NdcTipoDictamenDO ndcTipoDictamenDO=new NdcTipoDictamenDO();
		ndcTipoDictamenDO.setCveIdTipoDictamen(patron.getCveIdTipoDictamenId());
		NdcEjercicioFiscalDO ndcEjercicioFiscalDO=new NdcEjercicioFiscalDO();
		ndcEjercicioFiscalDO.setCveIdEjerFiscal(patron.getCveIdEjerFiscalId());
		
		return cont;
	}	
	
	public static PatronDictamenTO transformer( NdtPatronDictamenDO patron ) {
		PatronDictamenTO cont=  (PatronDictamenTO) TransformerHelper.get(mapClass,patron, PatronDictamenTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		
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
		ClavePresupuestalTO cont= (ClavePresupuestalTO) TransformerHelper.get(mapClass,clavePresupuestal, ClavePresupuestalTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static NivelAtencionTO transformer( NivelAtencion nivelAtencion ) {
		NivelAtencionTO cont= (NivelAtencionTO) TransformerHelper.get(mapClass,nivelAtencion, NivelAtencionTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoUMFTO transformer( TipoUMF tipoUMF ) {
		TipoUMFTO cont= (TipoUMFTO) TransformerHelper.get(mapClass,tipoUMF, ClavePresupuestalTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static UnidadMedicaFamiliarTO transformer( UnidadMedicaFamiliar unidadMedicaFamiliar ) {
		UnidadMedicaFamiliarTO cont= (UnidadMedicaFamiliarTO) TransformerHelper.get(mapClass,unidadMedicaFamiliar, UnidadMedicaFamiliarTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static ClavePresupuestal transformer( ClavePresupuestalTO clavePresupuestalTO ) {
		ClavePresupuestal cont= (ClavePresupuestal) TransformerHelper.get(mapClass,clavePresupuestalTO, ClavePresupuestal.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static NivelAtencion transformer( NivelAtencionTO nivelAtencionTO ) {
		NivelAtencion cont= (NivelAtencion) TransformerHelper.get(mapClass,nivelAtencionTO, NivelAtencion.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static TipoUMF transformer( TipoUMFTO tipoUMFTO ) {
		TipoUMF cont= (TipoUMF) TransformerHelper.get(mapClass,tipoUMFTO, TipoUMF.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static UnidadMedicaFamiliar transformer( UnidadMedicaFamiliarTO unidadMedicaFamiliarTO ) {
		UnidadMedicaFamiliar cont= (UnidadMedicaFamiliar) TransformerHelper.get(mapClass,unidadMedicaFamiliarTO, UnidadMedicaFamiliar.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static DocumentoProbatorioTO transformer( DocumentoProbatorio documentoProbatorio ) {
		DocumentoProbatorioTO cont= (DocumentoProbatorioTO) TransformerHelper.get(mapClass,documentoProbatorio, DocumentoProbatorioTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static DocumentoPorTipoTO transformer( DocumentoPorTipo documentoPorTipo ) {
		DocumentoPorTipoTO cont= (DocumentoPorTipoTO) TransformerHelper.get(mapClass,documentoPorTipo, DocumentoPorTipoTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static DocumentoTO transformer( Documento documento ) {
		DocumentoTO cont= (DocumentoTO) TransformerHelper.get(mapClass,documento, DocumentoTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static NacimientoTO transformer( Nacimiento nacimiento ) {
		NacimientoTO cont= (NacimientoTO) TransformerHelper.get(mapClass,nacimiento, NacimientoTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static TipoDocumentoProbatorioTO transformer( TipoDocumentoProbatorio tipoDocumentoProbatorioTO ) {
		TipoDocumentoProbatorioTO cont= (TipoDocumentoProbatorioTO) TransformerHelper.get(mapClass,tipoDocumentoProbatorioTO, TipoDocumentoProbatorioTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static CURPTO transformer( CURP curp ) {
		CURPTO cont= (CURPTO) TransformerHelper.get(mapClass,curp, CURPTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static DocumentoProbatorio transformer( DocumentoProbatorioTO documentoProbatorioTO ) {
		DocumentoProbatorio cont= (DocumentoProbatorio) TransformerHelper.get(mapClass,documentoProbatorioTO, DocumentoProbatorio.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static DocumentoPorTipo transformer( DocumentoPorTipoTO documentoPorTipoTO ) {
		DocumentoPorTipo cont= (DocumentoPorTipo) TransformerHelper.get(mapClass,documentoPorTipoTO, DocumentoPorTipo.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Documento transformer( DocumentoTO documentoTO ) {
		Documento cont= (Documento) TransformerHelper.get(mapClass,documentoTO, Documento.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Nacimiento transformer( NacimientoTO nacimientoTO ) {
		Nacimiento cont= (Nacimiento) TransformerHelper.get(mapClass,nacimientoTO, Nacimiento.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static TipoDocumentoProbatorio transformer( TipoDocumentoProbatorioTO tipoDocumentoProbatorioTO ) {
		TipoDocumentoProbatorio cont= (TipoDocumentoProbatorio) TransformerHelper.get(mapClass,tipoDocumentoProbatorioTO, TipoDocumentoProbatorio.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static CURP transformer( CURPTO curpTO ) {
		CURP cont= (CURP) TransformerHelper.get(mapClass,curpTO, CURP.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static AsentamientoTO transformer( Asentamiento asentamiento ) {
		AsentamientoTO cont= (AsentamientoTO) TransformerHelper.get(mapClass,asentamiento, AsentamientoTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static CodigoPostalTO transformer( CodigoPostal codigoPostal ) {
		CodigoPostalTO cont= (CodigoPostalTO) TransformerHelper.get(mapClass,codigoPostal, CodigoPostalTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static DelegacionTO transformer( Delegacion delegacion ) {
		DelegacionTO cont= (DelegacionTO) TransformerHelper.get(mapClass,delegacion, DelegacionTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static DomicilioCaminoTO transformer( DomicilioCamino domicilioCamino ) {
		DomicilioCaminoTO cont= (DomicilioCaminoTO) TransformerHelper.get(mapClass,domicilioCamino, DomicilioCaminoTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static DomicilioCarreteraTO transformer( DomicilioCarretera domicilioCarretera ) {
		DomicilioCarreteraTO cont= (DomicilioCarreteraTO) TransformerHelper.get(mapClass,domicilioCarretera, DomicilioCarreteraTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static DomicilioFiscalTO transformer( DomicilioFiscal domicilioFiscal ) {
		DomicilioFiscalTO cont= (DomicilioFiscalTO) TransformerHelper.get(mapClass,domicilioFiscal, DomicilioFiscalTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static DomicilioTO transformer( Domicilio domicilio ) {
		DomicilioTO cont= (DomicilioTO) TransformerHelper.get(mapClass,domicilio, DomicilioTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static EntidadFederativaTO transformer( EntidadFederativa entidadFederativa ) {
		EntidadFederativaTO cont= (EntidadFederativaTO) TransformerHelper.get(mapClass,entidadFederativa, EntidadFederativaTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static LocalidadTO transformer( Localidad localidad ) {
		LocalidadTO cont= (LocalidadTO) TransformerHelper.get(mapClass,localidad, LocalidadTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static MunicipioTO transformer( Municipio municipio ) {
		MunicipioTO cont= (MunicipioTO) TransformerHelper.get(mapClass,municipio, MunicipioTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static PaisTO transformer( Pais pais ) {
		PaisTO cont= (PaisTO) TransformerHelper.get(mapClass,pais, PaisTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static SubdelegacionTO transformer( Subdelegacion subdelegacion ) {
		SubdelegacionTO cont= (SubdelegacionTO) TransformerHelper.get(mapClass,subdelegacion, SubdelegacionTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoAdministracionTO transformer( TipoAdministracion tipoAdministracion ) {
		TipoAdministracionTO cont= (TipoAdministracionTO) TransformerHelper.get(mapClass,tipoAdministracion, TipoAdministracionTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoAmbitoTO transformer( TipoAmbito tipoAmbito ) {
		TipoAmbitoTO cont= (TipoAmbitoTO) TransformerHelper.get(mapClass,tipoAmbito, TipoAmbitoTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoAsentamientoTO transformer( TipoAsentamiento tipoAsentamiento ) {
		TipoAsentamientoTO cont= (TipoAsentamientoTO) TransformerHelper.get(mapClass,tipoAsentamiento, TipoAsentamientoTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoDerechoTransitoTO transformer( TipoDerechoTransito tipoDerechoTransito ) {
		TipoDerechoTransitoTO cont= (TipoDerechoTransitoTO) TransformerHelper.get(mapClass,tipoDerechoTransito, TipoDerechoTransitoTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoDomicilioTO transformer( TipoDomicilio tipoDomiciliO) {
		TipoDomicilioTO cont= (TipoDomicilioTO) TransformerHelper.get(mapClass,tipoDomiciliO, TipoDomicilioTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoMargenTO transformer( TipoMargen 	tipoMargen ) {
		TipoMargenTO cont= (TipoMargenTO) TransformerHelper.get(mapClass,tipoMargen, TipoMargenTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoTerminoGeneralTO transformer( TipoTerminoGeneral tipoTerminoGeneral ) {
		TipoTerminoGeneralTO cont= (TipoTerminoGeneralTO) TransformerHelper.get(mapClass,tipoTerminoGeneral, TipoTerminoGeneralTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static TipoVialidadTO transformer( TipoVialidad tipoVialidad ) {
		TipoVialidadTO cont= (TipoVialidadTO) TransformerHelper.get(mapClass,tipoVialidad, TipoVialidadTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static VialidadTO transformer( Vialidad vialidad ) {
		VialidadTO cont= (VialidadTO) TransformerHelper.get(mapClass,vialidad, VialidadTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Asentamiento transformer( AsentamientoTO asentamientoTO ) {
		Asentamiento cont= (Asentamiento) TransformerHelper.get(mapClass,asentamientoTO, Asentamiento.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static CodigoPostal transformer( CodigoPostalTO codigoPostalTO ) {
		CodigoPostal cont= (CodigoPostal) TransformerHelper.get(mapClass,codigoPostalTO, CodigoPostal.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Delegacion transformer( DelegacionTO delegacionTO ) {
		Delegacion cont= (Delegacion) TransformerHelper.get(mapClass,delegacionTO, Delegacion.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static DomicilioCamino transformer( DomicilioCaminoTO domicilioCaminoTO ) {
		DomicilioCamino cont= (DomicilioCamino) TransformerHelper.get(mapClass,domicilioCaminoTO, DomicilioCamino.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static DomicilioCarretera transformer( DomicilioCarreteraTO domicilioCarreteraTO ) {
		DomicilioCarretera cont= (DomicilioCarretera) TransformerHelper.get(mapClass,domicilioCarreteraTO, DomicilioCarretera.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static DomicilioFiscal transformer( DomicilioFiscalTO domicilioFiscalTO ) {
		DomicilioFiscal cont= (DomicilioFiscal) TransformerHelper.get(mapClass,domicilioFiscalTO, DomicilioFiscal.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Domicilio transformer( DomicilioTO domicilioTO ) {
		Domicilio cont= (Domicilio) TransformerHelper.get(mapClass,domicilioTO, Domicilio.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static EntidadFederativa transformer( EntidadFederativaTO entidadFederativaTO ) {
		EntidadFederativa cont= (EntidadFederativa) TransformerHelper.get(mapClass,entidadFederativaTO, EntidadFederativa.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Localidad transformer( LocalidadTO localidadTO ) {
		Localidad cont= (Localidad) TransformerHelper.get(mapClass,localidadTO, Localidad.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Municipio transformer( MunicipioTO municipioTO ) {
		Municipio cont= (Municipio) TransformerHelper.get(mapClass,municipioTO, Municipio.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static Pais transformer( PaisTO paisTO ) {
		Pais cont= (Pais) TransformerHelper.get(mapClass,paisTO, Pais.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Subdelegacion transformer( SubdelegacionTO subdelegacionTO ) {
		Subdelegacion cont= (Subdelegacion) TransformerHelper.get(mapClass,subdelegacionTO, Subdelegacion.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoAdministracion transformer( TipoAdministracionTO tipoAdministracionTO ) {
		TipoAdministracion cont= (TipoAdministracion) TransformerHelper.get(mapClass,tipoAdministracionTO, TipoAdministracion.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static TipoAmbito transformer( TipoAmbitoTO tipoAmbitoTO ) {
		TipoAmbito cont= (TipoAmbito) TransformerHelper.get(mapClass,tipoAmbitoTO, TipoAmbito.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoAsentamiento transformer( TipoAsentamientoTO tipoAsentamientoTO ) {
		TipoAsentamiento cont= (TipoAsentamiento) TransformerHelper.get(mapClass,tipoAsentamientoTO, TipoAsentamiento.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoDerechoTransito transformer( TipoDerechoTransitoTO tipoDerechoTransitoTO ) {
		TipoDerechoTransito cont= (TipoDerechoTransito) TransformerHelper.get(mapClass,tipoDerechoTransitoTO, TipoDerechoTransito.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static TipoDomicilio transformer( TipoDomicilioTO tipoDomicilioTO ) {
		TipoDomicilio cont= (TipoDomicilio) TransformerHelper.get(mapClass,tipoDomicilioTO, TipoDomicilio.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoMargen transformer( TipoMargenTO tipoMargenTO ) {
		TipoMargen cont= (TipoMargen) TransformerHelper.get(mapClass,tipoMargenTO, TipoMargen.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoTerminoGeneral transformer( TipoTerminoGeneralTO tipoTerminoGeneralTO ) {
		TipoTerminoGeneral cont= (TipoTerminoGeneral) TransformerHelper.get(mapClass,tipoTerminoGeneralTO, TipoTerminoGeneral.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static TipoVialidad transformer( TipoVialidadTO tipoVialidadTO ) {
		TipoVialidad cont= (TipoVialidad) TransformerHelper.get(mapClass,tipoVialidadTO, TipoVialidad.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Vialidad transformer( VialidadTO vialidadTO ) {
		Vialidad cont= (Vialidad) TransformerHelper.get(mapClass,vialidadTO, Vialidad.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	/***/
	public static DatosPersonalesSATTO transformer( DatosPersonaSAT datosPersonalesSAT ) {
		DatosPersonalesSATTO cont= (DatosPersonalesSATTO) TransformerHelper.get(mapClass,datosPersonalesSAT, DatosPersonalesSATTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static EstadoCivilTO transformer( EstadoCivil estadoCivil ) {
		EstadoCivilTO cont= (EstadoCivilTO) TransformerHelper.get(mapClass,estadoCivil, EstadoCivilTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static FielTO transformer( Fiel fiel ) {
		FielTO cont= (FielTO) TransformerHelper.get(mapClass,fiel, FielTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static FisicaTO transformer( Fisica fisica ) {
		FisicaTO cont= (FisicaTO) TransformerHelper.get(mapClass,fisica, FisicaTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static IdentificadorTO transformer( Identificador identificador ) {
		IdentificadorTO cont= (IdentificadorTO) TransformerHelper.get(mapClass,identificador, IdentificadorTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static MoralTO transformer( Moral moral ) {
		MoralTO cont= (MoralTO) TransformerHelper.get(mapClass,moral, MoralTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static PersonaTO transformer( Persona persona ) {
		PersonaTO cont= (PersonaTO) TransformerHelper.get(mapClass,persona, Persona.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static RegimenTO transformer( Regimen regimen ) {
		RegimenTO cont= (RegimenTO) TransformerHelper.get(mapClass,regimen, RegimenTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static SexoTO transformer( Sexo sexo ) {
		SexoTO cont= (SexoTO) TransformerHelper.get(mapClass,sexo, SexoTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static SituacionSATTO transformer( SituacionSAT situacionSAT ) {
		SituacionSATTO cont= (SituacionSATTO) TransformerHelper.get(mapClass,situacionSAT, SituacionSATTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static TipoIdentificadorTO transformer( TipoIdentificador tipoIdentificador ) {
		TipoIdentificadorTO cont= (TipoIdentificadorTO) TransformerHelper.get(mapClass,tipoIdentificador, TipoIdentificadorTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoPoderTO transformer( TipoPoder tipoPoder ) {
		TipoPoderTO cont= (TipoPoderTO) TransformerHelper.get(mapClass,tipoPoder, TipoPoderTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	/**/
	public static DatosPersonaSAT transformer( DatosPersonalesSATTO datosPersonaSATTO ) {
		DatosPersonaSAT cont= (DatosPersonaSAT) TransformerHelper.get(mapClass,datosPersonaSATTO, DatosPersonaSAT.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static EstadoCivil transformer( EstadoCivilTO estadoCivilTO ) {
		EstadoCivil cont= (EstadoCivil) TransformerHelper.get(mapClass,estadoCivilTO, EstadoCivil.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Fiel transformer( FielTO fielTO ) {
		Fiel cont= (Fiel) TransformerHelper.get(mapClass,fielTO, Fiel.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Fisica transformer( FisicaTO fisicaTO ) {
		Fisica cont= (Fisica) TransformerHelper.get(mapClass,fisicaTO, Fisica.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static Identificador transformer( IdentificadorTO identificadorTO ) {
		Identificador cont= (Identificador) TransformerHelper.get(mapClass,identificadorTO, Identificador.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Moral transformer( MoralTO moralTO ) {
		Moral cont= (Moral) TransformerHelper.get(mapClass,moralTO, Moral.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Persona transformer(PersonaTO personaTO ) {
		Persona cont= (Persona) TransformerHelper.get(mapClass,personaTO, Persona.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static Regimen transformer( RegimenTO regimenTO ) {
		Regimen cont= (Regimen) TransformerHelper.get(mapClass,regimenTO, Regimen.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Sexo transformer( SexoTO sexoTO ) {
		Sexo cont= (Sexo) TransformerHelper.get(mapClass,sexoTO, Sexo.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static SituacionSAT transformer( SituacionSATTO situacionSATTO ) {
		SituacionSAT cont= (SituacionSAT) TransformerHelper.get(mapClass,situacionSATTO, SituacionSAT.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static TipoIdentificador transformer( TipoIdentificadorTO tipoIdentificadorTO ) {
		TipoIdentificador cont= (TipoIdentificador) TransformerHelper.get(mapClass,tipoIdentificadorTO, TipoIdentificador.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoPoder transformer( TipoPoderTO tipoPoderTO ) {
		TipoPoder cont= (TipoPoder) TransformerHelper.get(mapClass,tipoPoderTO, TipoPoder.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static CorreoElectronico transformer( CorreoElectronico correoElectronico ) {
		CorreoElectronico cont= (CorreoElectronico) TransformerHelper.get(mapClass,correoElectronico, CorreoElectronico.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static MedioContacto transformer( MedioContactoTO medioContactoTO ) {
		MedioContacto cont= (MedioContacto) TransformerHelper.get(mapClass,medioContactoTO, MedioContacto.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static Facebook transformer( FacebookTO facebookTO ) {
		Facebook cont= (Facebook) TransformerHelper.get(mapClass,facebookTO, Facebook.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoMedioContacto transformer( TipoMedioContactoTO tipoMedioContactoTO ) {
		TipoMedioContacto cont= (TipoMedioContacto) TransformerHelper.get(mapClass,tipoMedioContactoTO, TipoMedioContacto.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static CorreoElectronicoTO transformer( CorreoElectronicoTO correoElectronico ) {
		CorreoElectronicoTO cont= (CorreoElectronicoTO) TransformerHelper.get(mapClass,correoElectronico, CorreoElectronicoTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static FacebookTO transformer( Facebook facebook ) {
		FacebookTO cont= (FacebookTO) TransformerHelper.get(mapClass,facebook, FacebookTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static MedioContactoTO transformer( MedioContacto medioContacto ) {
		MedioContactoTO cont= (MedioContactoTO) TransformerHelper.get(mapClass,medioContacto, MedioContactoTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static TipoMedioContactoTO transformer( TipoMedioContacto tipoMedioContacto ) {
		TipoMedioContactoTO cont= (TipoMedioContactoTO) TransformerHelper.get(mapClass,tipoMedioContacto, TipoMedioContactoTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static EscrituraConstitutivaTO transformer( EscrituraConstitutiva escrituraConstitutiva ) {
		EscrituraConstitutivaTO cont= (EscrituraConstitutivaTO) TransformerHelper.get(mapClass,escrituraConstitutiva, EscrituraConstitutivaTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static RegistroSindicatoTO transformer( RegistroSindicato registroSindicato ) {
		RegistroSindicatoTO cont= (RegistroSindicatoTO) TransformerHelper.get(mapClass,registroSindicato, RegistroSindicatoTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	
	public static TipoSociedadTO transformer( TipoSociedad tipoSociedad ) {
		TipoSociedadTO cont= (TipoSociedadTO) TransformerHelper.get(mapClass,tipoSociedad, TipoSociedadTO.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static EscrituraConstitutiva transformer( EscrituraConstitutivaTO escrituraConstitutivaTO ) {
		EscrituraConstitutiva cont= (EscrituraConstitutiva) TransformerHelper.get(mapClass,escrituraConstitutivaTO, EscrituraConstitutiva.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static RegistroSindicato transformer( RegistroSindicatoTO registroSindicatoTO ) {
		RegistroSindicato cont= (RegistroSindicato) TransformerHelper.get(mapClass,registroSindicatoTO, RegistroSindicato.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
	public static TipoSociedad transformer( TipoSociedadTO tipoSociedadTO ) {
		TipoSociedad cont= (TipoSociedad) TransformerHelper.get(mapClass,tipoSociedadTO, TipoSociedad.class,DictamenServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}	
	
}
