package mx.gob.imss.distss.dictamen.service.interfaces.v2;

import javax.ejb.Remote;

import mx.gob.imss.distss.dictamen.modelo.dto.NdtColegioDTO;

@Remote
public interface ColegioServiceRemoteV2 {
	
	NdtColegioDTO registroColegio(NdtColegioDTO ndtColegioDTO) throws RuntimeException;
	public NdtColegioDTO obtenerColegioPorId(Long cveIdColegio);

}
