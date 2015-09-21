package mx.gob.imss.cit.dictamen.services;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.sat.individuo.FisicaTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.individuo.MoralTO;

@Local
public interface ConsultaSatRFCService {
	
	FisicaTO buscarPersonaFisicaPorRfcEnSat(String rfc)throws DictamenException;
	MoralTO  buscarPersonaMoralRfc(String rfc)throws DictamenException;
	FisicaTO obtenerDatosFiscalesFisicaPorRfc(String rfc)throws DictamenException;
	MoralTO  obtenerDatosFiscalesMoralPorRfc(String rfc)throws DictamenException;
}
