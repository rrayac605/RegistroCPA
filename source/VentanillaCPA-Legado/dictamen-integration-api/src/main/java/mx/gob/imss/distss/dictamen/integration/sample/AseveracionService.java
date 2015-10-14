package mx.gob.imss.distss.dictamen.integration.sample;

import mx.gob.imss.distss.dictamen.model.abstr.AbstractModel;
import mx.gob.imss.distss.dictamen.table.model.*;

import java.util.List;
import java.util.Map;

public interface AseveracionService {

	/*
	List<AbstractModel> consultaRegistrosAseveracion(TablaAseveracion tablaAseveracion, ConfigTablaAseveracion configAseveracion);
	Long getTotalRegistros(TablaAseveracion tablaAseveracion, ConfigTablaAseveracion configTablaAsevera);
   */
	Pagina<AbstractModel> getPagina(Paginacion paginacion);
    Map<String,Double> getSumatoria(DescriptorTabla descriptorTabla);
}
