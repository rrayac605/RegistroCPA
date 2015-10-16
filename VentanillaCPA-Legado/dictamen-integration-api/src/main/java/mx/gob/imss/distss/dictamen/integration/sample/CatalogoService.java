package mx.gob.imss.distss.dictamen.integration.sample;

import java.util.List;

import mx.gob.imss.distss.dictamen.modelo.dto.CatalogoDTO;

public interface CatalogoService {
	
	List<CatalogoDTO> consultaDelegaciones();
	
	List<CatalogoDTO> consultaSubdelegacionPorIdDelegacion(Long idDelegacion);

}
