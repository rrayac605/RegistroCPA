package mx.gob.imss.distss.dictamen.service.entity.v2;

import javax.ejb.Stateless;

import mx.gob.imss.distss.dictamen.modelo.entidad.NdtCpaEstatus;
import mx.gob.imss.distss.dictamen.service.entity.GenericDaoImpl;
import mx.gob.imss.distss.dictamen.service.interfaces.v2.EstatusContadorPublicoServiceLocalV2;

@Stateless(name = "estatusContadorPublicoServiceEntityV2", mappedName = "estatusContadorPublicoServiceEntityV2")
public class EstatusContadorPublicoServiceEntityV2 extends GenericDaoImpl<NdtCpaEstatus, Long> implements EstatusContadorPublicoServiceLocalV2 {
	
	public EstatusContadorPublicoServiceEntityV2() {
		super(NdtCpaEstatus.class);
	}

}
