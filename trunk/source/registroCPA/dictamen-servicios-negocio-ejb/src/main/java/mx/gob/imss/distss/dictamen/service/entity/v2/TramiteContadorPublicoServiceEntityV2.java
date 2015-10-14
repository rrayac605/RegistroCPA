package mx.gob.imss.distss.dictamen.service.entity.v2;

import javax.ejb.Stateless;

import mx.gob.imss.distss.dictamen.modelo.entidad.NdtCpaTramite;
import mx.gob.imss.distss.dictamen.service.entity.GenericDaoImpl;
import mx.gob.imss.distss.dictamen.service.interfaces.v2.TramiteContadorPublicoServiceLocalV2;

@Stateless(name = "tramiteContadorPublicoServiceEntityV2", mappedName = "tramiteContadorPublicoServiceEntityV2")
public class TramiteContadorPublicoServiceEntityV2 extends GenericDaoImpl<NdtCpaTramite, Long> implements TramiteContadorPublicoServiceLocalV2 {
	
	public TramiteContadorPublicoServiceEntityV2() {
		super(NdtCpaTramite.class);
	}

}
