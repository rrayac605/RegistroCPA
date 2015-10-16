package mx.gob.imss.distss.dictamen.integration.sample;

import mx.gob.imss.distss.dictamen.modelo.dto.NdvColegiosDTO;
import mx.gob.imss.distss.dictamen.table.model.Pagina;
import mx.gob.imss.distss.dictamen.table.model.Paginacion;

public interface ColegioService {
	
	Pagina<NdvColegiosDTO> consultaColegio(Paginacion paginacion);

}
