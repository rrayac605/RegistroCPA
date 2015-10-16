package mx.gob.imss.distss.dictamen.integration.sample;

import java.util.List;

import mx.gob.imss.distss.dictamen.modelo.dto.NdcEstadoCpaDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.NdvContadorPublicoAutDTO;
import mx.gob.imss.distss.dictamen.table.model.Pagina;
import mx.gob.imss.distss.dictamen.table.model.Paginacion;

public interface ContadorPublicoService {

	List<NdcEstadoCpaDTO> catalogoEstadoContador();

	Pagina<NdvContadorPublicoAutDTO> consultaContador(Paginacion paginacion);
	
	void actualizaEstatus(Long numRegistro);

	Long actualizaContador(NdvContadorPublicoAutDTO ndvContadorPublicoAutDTO, String observaciones, Long estatus);

}
