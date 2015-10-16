package mx.gob.imss.distss.dictamen.service.interfaces.v2;

import javax.ejb.Remote;

import mx.gob.imss.distss.dictamen.modelo.dto.NdtContadorPublicoAutDTO;

@Remote
public interface BajaVoluntariaContadorServiceRemoteV2 {
	
	NdtContadorPublicoAutDTO guardarBajaVoluntariaContador(NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO);

}
