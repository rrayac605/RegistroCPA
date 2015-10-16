package mx.gob.imss.distss.dictamen.integration.sample;

import mx.gob.imss.distss.dictamen.modelo.dto.NdvDespachosDTO;
import mx.gob.imss.distss.dictamen.table.model.Pagina;
import mx.gob.imss.distss.dictamen.table.model.Paginacion;

public interface DespachoService {
	
	Pagina<NdvDespachosDTO> consultaDespacho(Paginacion paginacion);

}
