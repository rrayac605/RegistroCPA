package mx.gob.imss.distss.dictamen.service.interfaces;

import javax.ejb.Local;

import mx.gob.imss.distss.dictamen.modelo.entidad.DicDelegacion;

@Local
public interface DelegacionServiceLocal  extends GenericDao<DicDelegacion, Long> {

}
