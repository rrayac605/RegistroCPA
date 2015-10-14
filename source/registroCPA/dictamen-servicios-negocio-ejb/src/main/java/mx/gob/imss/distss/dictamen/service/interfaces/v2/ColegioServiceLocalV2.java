package mx.gob.imss.distss.dictamen.service.interfaces.v2;

import javax.ejb.Local;

import mx.gob.imss.distss.dictamen.modelo.entidad.NdtColegio;
import mx.gob.imss.distss.dictamen.service.interfaces.GenericDao;

@Local
public interface ColegioServiceLocalV2 extends GenericDao<NdtColegio, Long> {
	
	public NdtColegio obtenerColegioRFC(String rfc);

}
