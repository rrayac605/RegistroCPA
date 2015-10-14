package mx.gob.imss.distss.dictamen.service.entity;

import javax.ejb.Stateless;
import mx.gob.imss.distss.dictamen.modelo.entidad.DicDelegacion;
import mx.gob.imss.distss.dictamen.service.interfaces.DelegacionServiceLocal;


@Stateless(name = "delegacionEntity", mappedName = "delegacionEntity")
public class DelegacionServiceEntity extends GenericDaoImpl<DicDelegacion, Long> implements DelegacionServiceLocal {

	
	public DelegacionServiceEntity() {
		super(DicDelegacion.class);
	}
	
}
