package mx.gob.imss.distss.dictamen.service.entity;

import javax.ejb.Stateless;

import mx.gob.imss.distss.dictamen.modelo.entidad.NdcEstadoCpa;
import mx.gob.imss.distss.dictamen.service.interfaces.EstadoCpaServiceLocal;

@Stateless(name = "estadoCpaEntity", mappedName = "estadoCpaEntity")
public class EstadoCpaServiceEntity extends GenericDaoImpl<NdcEstadoCpa, Long> implements EstadoCpaServiceLocal {
	
	public EstadoCpaServiceEntity() {
		super(NdcEstadoCpa.class);
	}

}
