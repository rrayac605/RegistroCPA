package mx.gob.imss.distss.dictamen.service.interfaces;

import javax.ejb.Local;

import mx.gob.imss.distss.dictamen.modelo.entidad.DitPersona;

@Local
public interface BdtuPersonaServiceLocal extends GenericDao<DitPersona, Long> {
	
	public DitPersona obtenerPersonaPorCurp(String cupr);

}
