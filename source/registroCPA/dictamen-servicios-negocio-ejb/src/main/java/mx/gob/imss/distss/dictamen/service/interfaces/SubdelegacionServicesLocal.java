package mx.gob.imss.distss.dictamen.service.interfaces;

import java.util.List;

import javax.ejb.Local;



import mx.gob.imss.distss.dictamen.modelo.entidad.DicSubdelegacion;


@Local
public interface SubdelegacionServicesLocal   extends GenericDao<DicSubdelegacion, Long>{

	
	public List<DicSubdelegacion> getSubdelegacionByClaveDelegacion(long cveDelegacion);
}
