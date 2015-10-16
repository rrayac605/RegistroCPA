package mx.gob.imss.distss.dictamen.faces;

import mx.gob.imss.distss.dictamen.integration.sample.EstructuraBase;
import mx.gob.imss.distss.dictamen.model.abstr.AbstractModel;
import mx.gob.imss.distss.dictamen.table.model.*;

import mx.gob.imss.distss.dictamen.utils.Formatter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.primefaces.model.LazyDataModel;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.naming.NamingException;

import java.io.Serializable;
import java.util.Map;

/**
 * <p>
 *     Clase para control de vista consultaAseveracion, esta clase proporciona
 *     los métodos para generar tabla dinámica de acuerdo a la aseveración
 *     seleccionada por el usuario.
 * </p>
 *
 * */
@ManagedBean(name= "consultaAseveracionView")
@ViewScoped
public class ConsultaAseveracionView implements Serializable {

    private static final Log LOGGER = LogFactory.getLog(ConsultaAseveracionView.class);

    private static final Formatter formatter=new Formatter();

    @Inject
    private EstructuraBase estructuraBase;
    @Inject
    private LazyDynamicDataModel lazyDynamicDataModel;

    @PostConstruct
    public void init() throws NamingException {
        Map<String,String> params =  FacesContext.getCurrentInstance().
                getExternalContext().getRequestParameterMap();
        String selectedTable=params.get("selectedTable");
        getLazyDynamicDataModel().setDescriptorTabla(estructuraBase.getDescriptorTabla(selectedTable));
        getLazyDynamicDataModel().addQueryParam("session", null);
    }

    public String format(String campo,String format,Object value){
        try{
            return formatter.format(format,value);
        }catch (Exception ex){
            LOGGER.error("excepcion ocurrida al intentar aplicar formato al campo "+campo,ex);
        }
        return "";
    }

    public LazyDynamicDataModel getLazyDynamicDataModel() {
        return lazyDynamicDataModel;
    }
}