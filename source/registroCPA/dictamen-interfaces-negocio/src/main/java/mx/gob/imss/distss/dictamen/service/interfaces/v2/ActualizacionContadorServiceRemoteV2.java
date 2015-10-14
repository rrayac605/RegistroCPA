package mx.gob.imss.distss.dictamen.service.interfaces.v2;

import javax.ejb.Remote;

import mx.gob.imss.distss.dictamen.modelo.dto.NdtContadorPublicoAutDTO;

@Remote
public interface ActualizacionContadorServiceRemoteV2 {
	
	NdtContadorPublicoAutDTO actualizarContador(NdtContadorPublicoAutDTO ndtContadorPublicoAutSession, NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO);
	
}
