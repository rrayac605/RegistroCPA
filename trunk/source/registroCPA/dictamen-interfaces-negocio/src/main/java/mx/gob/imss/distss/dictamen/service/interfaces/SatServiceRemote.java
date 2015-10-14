package mx.gob.imss.distss.dictamen.service.interfaces;

import javax.ejb.Remote;

import mx.gob.imss.ctirss.delta.model.gestion.individuo.Fisica;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Moral;

@Remote
public interface SatServiceRemote {
	
	Fisica buscarPersonaFisicaPorRfc(String rfc) throws RuntimeException;
	Fisica obtenerDatosFiscalesFisicaPorRFC(String rfc) throws RuntimeException;
	Moral buscarPersonaMoralPorRfc(String rfc) throws RuntimeException;
	Moral obtenerDatosFiscalesMoralPorRFC(String rfc) throws RuntimeException;

}
