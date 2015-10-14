package mx.gob.imss.distss.dictamen.service.interfaces;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Remote;

import mx.gob.imss.ctirss.delta.model.domicilio.EntidadFederativa;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Fisica;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.ICADatosConsulta;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.ICADatosRespuesta;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Moral;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Persona;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.PersonaCalificacion;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Sexo;
import mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.MedioContacto;
import mx.gob.imss.ctirss.delta.model.gestion.solicitud.Solicitud;
import mx.gob.imss.distss.dictamen.modelo.dto.DitFormaContactoDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.DitPersonaDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.DitPersonafContactoDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.DitPersonafDomFiscalDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.DitPersonamContactoDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.DitPersonamDomFiscalDTO;

@Remote
public interface BdtuServiceRemote {
	
	public Fisica buscaPersonaFisicaPorId(Long idPersona) throws RuntimeException;
	public ArrayList<MedioContacto> obtenerListMedioContacto(Long idPersona) throws RuntimeException;
	public DitPersonaDTO obtenerPersonaPorCurp(String curp);
	
	public Persona registroPersona(Persona persona, boolean crearSolicitud);
	public List<Fisica> obtenerListaPersonaFisica(String sCurp, String sRfc, String sNombre, String sPrimerApellido, String sSegundoApellido, Date fechaNacimiento, EntidadFederativa lugarNacimiento, Sexo sexo);
	public List<Moral> obtenerListaPersonaMoral(String rfcPersonaMoral);
	
	public Persona consultarPersonaMoralIMSSPorRFC(Persona persona);
	public Moral buscaPersonaMoralPorId(Long idPersonaMoral);
	public Persona consultarPersonaFisicaIMSSPorRFC(Persona persona);
	public ICADatosRespuesta identificarCambiosFisica(ICADatosConsulta icaDatosConsulta);
	public ICADatosRespuesta identificarCambiosMoral(ICADatosConsulta icaDatosConsulta);
	
	public Persona obtenerRegistroPersonaFisicaPorRFC(Persona persona);
	public Persona obtenerRegistroPersonaMoralPorRFC(Persona persona);
	
	public Moral consultarDatosBasicosPersonaMoral(Moral personaMoral);
	
	public List<PersonaCalificacion> obtenerPersonaCalificaciones(Persona persona);
	
//	public Persona obtenerDomicilioFiscalPersona(Persona persona);
//	public Persona obtenerMediosContactoFiscalesPersona(Persona persona);
	
	public Solicitud generarSolicitudTramiteBdtu(Persona persona);
	
	public DitPersonafDomFiscalDTO obtenerPersonaFDomFiscalPorIdDom(Long cveIdDomicilio);
	
	public DitPersonafDomFiscalDTO obtenerPersonaFDomFiscalPorId(Long cveIdPfdomFiscal);
	
	DitPersonamDomFiscalDTO obtenerPersonamDomFiscalPorIdDom(Long cveIdDomicilio);
	
	public Persona guardarYAsociarMediosContactoPersona(Persona persona);
	
	public List<MedioContacto> consultarMedioDeContactoPersona(Persona persona);
	
	public DitPersonafContactoDTO obtenerPersonafContacto(DitFormaContactoDTO ditFormaContactoDTO);
	public DitPersonamContactoDTO obtenerPersonamContacto(DitFormaContactoDTO ditFormaContactoDTO);
	
	public DitPersonafContactoDTO obtenerPersonafContactoPorId(Long cveIdPersonafContacto);
	public DitPersonamContactoDTO obtenerPersonamContactoPorId(Long cveIdPersonamContacto);
	
	public DitFormaContactoDTO obtenerFormaContactoPorId(Long cveIdFormaContacto);
	
	DitFormaContactoDTO actualizaMedioContacto(DitFormaContactoDTO ditFormaContactoDTO);
	
	
}
