package mx.gob.imss.distss.dictamen.service.interfaces.v2;

import javax.ejb.Local;

import mx.gob.imss.distss.dictamen.modelo.entidad.NdtCpaEstatus;
import mx.gob.imss.distss.dictamen.service.interfaces.GenericDao;

@Local
public interface EstatusContadorPublicoServiceLocalV2 extends GenericDao<NdtCpaEstatus, Long> {

}
