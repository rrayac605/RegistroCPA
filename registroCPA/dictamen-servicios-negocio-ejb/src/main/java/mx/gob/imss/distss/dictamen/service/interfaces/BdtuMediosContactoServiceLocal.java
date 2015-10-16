package mx.gob.imss.distss.dictamen.service.interfaces;

import javax.ejb.Local;

import mx.gob.imss.distss.dictamen.modelo.entidad.DitFormaContacto;
import mx.gob.imss.distss.dictamen.modelo.entidad.DitPersonafContacto;
import mx.gob.imss.distss.dictamen.modelo.entidad.DitPersonamContacto;

@Local
public interface BdtuMediosContactoServiceLocal {
	
	public DitPersonafContacto obtenerPersonafContacto(Long cveIdFormaContacto);
	public DitPersonamContacto obtenerPersonamContacto(Long cveIdFormaContacto);
	
	public DitPersonafContacto obtenerPersonafContactoPorId(Long cveIdPersonafContacto);
	public DitPersonamContacto obtenerPersonamContactoPorId(Long cveIdPersonamContacto);
	
	public DitFormaContacto obtenerFormaContactoPorId(Long cveIdFormaContacto);
	
	DitFormaContacto actualizaMedioContacto(DitFormaContacto ditFormaContacto);

}
