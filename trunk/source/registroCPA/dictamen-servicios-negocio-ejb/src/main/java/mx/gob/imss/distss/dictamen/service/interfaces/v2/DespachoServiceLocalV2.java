package mx.gob.imss.distss.dictamen.service.interfaces.v2;

import javax.ejb.Local;

import mx.gob.imss.distss.dictamen.modelo.entidad.NdtDespachos;
import mx.gob.imss.distss.dictamen.service.interfaces.GenericDao;

@Local
public interface DespachoServiceLocalV2 extends GenericDao<NdtDespachos, Long> {
	
	public NdtDespachos obtenerDespachoRFC(String rfc) throws RuntimeException;

}
