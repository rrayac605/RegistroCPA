package mx.gob.imss.distss.dictamen.faces;

import mx.gob.imss.distss.dictamen.integration.sample.AseveracionService;
import mx.gob.imss.distss.dictamen.model.abstr.AbstractModel;
import mx.gob.imss.distss.dictamen.table.model.DescriptorCampo;
import mx.gob.imss.distss.dictamen.table.model.DescriptorTabla;
import mx.gob.imss.distss.dictamen.table.model.Pagina;
import mx.gob.imss.distss.dictamen.table.model.Paginacion;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LazyDynamicDataModel extends LazyDataModel<AbstractModel> {

    private final HashMap<String,Map<String,Double>> sumatorias =new HashMap<String, Map<String, Double>>();
    private HashMap<String,Object> queryParams=new HashMap<String, Object>();

    @Inject
    AseveracionService aseveracionService;

    private DescriptorTabla descriptorTabla;

    @Override
    public List<AbstractModel> load(int first, int pageSize, String sortField,
                                    SortOrder sortOrder, Map<String, String> filters) {
        if (getDescriptorTabla() ==null){
            /*no existe tabla seleccionada*/
            return null;
        }else{
            /*calcula la sumatoria de los campos en está tabla*/
            Map<String,Double> sum=aseveracionService.getSumatoria(getDescriptorTabla());
            sumatorias.put(getDescriptorTabla().getClave(), sum);
            /*solicita consultar la página de registros solicitada*/
            Pagina<AbstractModel> pagina = aseveracionService.getPagina(
                    new Paginacion(
                            getDescriptorTabla().getClassEntity(),
                            getDescriptorTabla().getClassDTO(),
                            first, pageSize, filters, null
                    )
            );
            /*actualiza el total de registros existentes en el datable*/
            setRowCount(pagina.getTotalRegistros());
            return pagina.getRegistros();
        }
    }

    public List<DescriptorCampo> getColumnModel() {
        if (getDescriptorTabla()!=null)
           return getDescriptorTabla().getCampos();
        else
            return new ArrayList<DescriptorCampo>();
    }

    public String getSumatoria(String campo){
        if (getDescriptorTabla()!=null) {
            String clave = getDescriptorTabla().getClave();
            if (sumatorias.containsKey(clave)) {
                return sumatorias.get(clave).get(campo).toString();
            }
        }
        return "";
    }

    @Override
    public Object getRowKey(AbstractModel object) {
        if (object!=null){
            return object.getClass().getSimpleName();
        }
        return "null";
    }

    private DescriptorTabla getDescriptorTabla() {
        return descriptorTabla;
    }

    public void setDescriptorTabla(DescriptorTabla descriptorTabla) {
        this.descriptorTabla = descriptorTabla;
    }

    public void addQueryParam(String key,Object value){
        queryParams.put(key,value);
    }

    public void removeQueryParam(String key){
        queryParams.remove(key);
    }
}
