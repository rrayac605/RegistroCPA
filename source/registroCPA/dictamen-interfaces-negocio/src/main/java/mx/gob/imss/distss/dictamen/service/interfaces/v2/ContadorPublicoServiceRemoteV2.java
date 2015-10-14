package mx.gob.imss.distss.dictamen.service.interfaces.v2;

import javax.ejb.Remote;

import mx.gob.imss.distss.dictamen.modelo.dto.NdtContadorPublicoAutDTO;

@Remote
public interface ContadorPublicoServiceRemoteV2 {
	
	NdtContadorPublicoAutDTO obtenerContadorPorIdPersona(Long idPersona);
	NdtContadorPublicoAutDTO obtenerContadorCompletoPorIdPersona(Long idPersona);
	NdtContadorPublicoAutDTO registroContadorPublicoAutorizado(NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO);
	
}
