package mx.gob.imss.distss.dictamen.interfaces;

import javax.ejb.Local;

import mx.gob.imss.distss.dictamen.model.abstr.AbstractModel;
import mx.gob.imss.distss.dictamen.table.model.DescriptorTabla;
import mx.gob.imss.distss.dictamen.table.model.Pagina;
import mx.gob.imss.distss.dictamen.table.model.Paginacion;

import java.util.List;
import java.util.Map;

@Local
public interface AseveracionDAOLocal <T extends AbstractModel> extends IAseveracionDAO<T>{
    Pagina getPagina(Paginacion paginacion);
    Map<String,Double> getSumatoria(DescriptorTabla descriptorTabla);
}
