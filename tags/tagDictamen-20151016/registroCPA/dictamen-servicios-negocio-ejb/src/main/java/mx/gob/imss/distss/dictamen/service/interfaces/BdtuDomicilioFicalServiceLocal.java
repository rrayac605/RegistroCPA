package mx.gob.imss.distss.dictamen.service.interfaces;

import javax.ejb.Local;

import mx.gob.imss.distss.dictamen.modelo.entidad.DitPersonafDomFiscal;
import mx.gob.imss.distss.dictamen.modelo.entidad.DitPersonamDomFiscal;

@Local
public interface BdtuDomicilioFicalServiceLocal {
	
	public DitPersonafDomFiscal obtenerPersonaFDomFiscalPorIdDom(Long cveIdDomicilio);
	public DitPersonafDomFiscal obtenerPersonaFDomFiscalPorId(Long cveIdPfdomFiscal);
	public DitPersonamDomFiscal obtenerPersonamDomFiscalPorIdDom(Long cveIdDomicilio);
}
