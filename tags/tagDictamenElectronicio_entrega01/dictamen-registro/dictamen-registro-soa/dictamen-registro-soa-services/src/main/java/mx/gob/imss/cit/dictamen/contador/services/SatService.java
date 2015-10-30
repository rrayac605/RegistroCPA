package mx.gob.imss.cit.dictamen.contador.services;


import javax.ejb.Remote;

import mx.gob.imss.ctirss.delta.model.gestion.individuo.Fisica;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Moral;

@Remote
public interface SatService {

	Fisica buscarPersonaFisicaPorRfc(String rfc) throws RuntimeException;
	Fisica obtenerDatosFiscalesFisicaPorRFC(String rfc) throws RuntimeException;
	Moral buscarPersonaMoralPorRfc(String rfc) throws RuntimeException;
	Moral obtenerDatosFiscalesMoralPorRFC(String rfc) throws RuntimeException;
}
