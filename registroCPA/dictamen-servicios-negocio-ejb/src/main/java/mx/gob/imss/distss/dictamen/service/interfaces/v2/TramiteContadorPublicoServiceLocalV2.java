package mx.gob.imss.distss.dictamen.service.interfaces.v2;

import javax.ejb.Local;

import mx.gob.imss.distss.dictamen.modelo.entidad.NdtCpaTramite;
import mx.gob.imss.distss.dictamen.service.interfaces.GenericDao;

@Local
public interface TramiteContadorPublicoServiceLocalV2 extends GenericDao<NdtCpaTramite, Long> {

}
