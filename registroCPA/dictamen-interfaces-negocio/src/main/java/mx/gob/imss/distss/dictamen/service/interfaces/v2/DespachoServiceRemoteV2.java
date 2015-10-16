package mx.gob.imss.distss.dictamen.service.interfaces.v2;

import javax.ejb.Remote;

import mx.gob.imss.distss.dictamen.modelo.dto.NdtDespachosDTO;

@Remote
public interface DespachoServiceRemoteV2 {
	
	public NdtDespachosDTO registroDespacho(NdtDespachosDTO ndtDespachosDTO) throws RuntimeException;
	public NdtDespachosDTO obtenerDespachoPorId(Long cveIdDespacho);
	
}
