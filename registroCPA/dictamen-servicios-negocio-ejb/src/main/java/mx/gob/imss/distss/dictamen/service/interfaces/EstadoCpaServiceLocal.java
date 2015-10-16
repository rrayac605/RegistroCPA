package mx.gob.imss.distss.dictamen.service.interfaces;

import javax.ejb.Local;

import mx.gob.imss.distss.dictamen.modelo.entidad.NdcEstadoCpa;

@Local
public interface EstadoCpaServiceLocal extends GenericDao<NdcEstadoCpa, Long> {

}
