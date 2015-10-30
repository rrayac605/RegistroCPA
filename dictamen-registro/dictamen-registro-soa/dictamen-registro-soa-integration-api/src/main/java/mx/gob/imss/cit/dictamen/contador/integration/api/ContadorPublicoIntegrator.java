package mx.gob.imss.cit.dictamen.contador.integration.api;

import java.util.List;

import mx.gob.imss.cit.dictamen.contador.integration.api.dto.ContadorPublicoDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DatosPersonalesDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DomicilioFiscalDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.MediosContactoDTO;
//import mx.gob.imss.cit.dictamen.contador.integration.api.dto.MediosContactoDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.PersonaMoralDTO;


public interface ContadorPublicoIntegrator {
	ContadorPublicoDTO consultarContadorPublicAut(Long idPersona);
	DomicilioFiscalDTO consultarDomicilioPorRFC(String rfc);
	List<DatosPersonalesDTO> consultarCedulaPorIdPersona(Long idPersona);
	PersonaMoralDTO consultarPersonaMoralPorRFC(String rfc);
	List<MediosContactoDTO> obtenerMediosContactoPorIdPersona(Long idPersona);
}
