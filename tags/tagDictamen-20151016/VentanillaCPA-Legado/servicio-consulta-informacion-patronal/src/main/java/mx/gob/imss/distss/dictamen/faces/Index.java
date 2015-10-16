package mx.gob.imss.distss.dictamen.faces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.naming.NamingException;

import mx.gob.imss.distss.dictamen.integration.sample.EstructuraBase;
import mx.gob.imss.distss.dictamen.table.model.DescriptorTabla;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@ManagedBean(name= "indexView")
@SessionScoped
public class Index {

    private static final Log LOGGER = LogFactory.getLog(Index.class);

    @Inject
    private EstructuraBase estructuraBase;
    private HashMap<String,DescriptorTabla> descriptoresTablaMap;

    @PostConstruct
    public void init() throws NamingException {
        LOGGER.info("cargando descripciones de tablas...");
        /*carga estructura de tablas aseveración*/
        descriptoresTablaMap = estructuraBase.getModeloTablas();
        if (descriptoresTablaMap == null) {
            LOGGER.info("no existen descripciones de tablas");
        } else {
            LOGGER.info("se cargaron " + descriptoresTablaMap.size() + " descripciones de tablas");
        }
    }

    public List<DescriptorTabla> getDescriptoresTablaList(){
        ArrayList<DescriptorTabla> descriptorTablas=new ArrayList<DescriptorTabla>();
        for(DescriptorTabla descriptorTabla: descriptoresTablaMap.values()){
            descriptorTablas.add(descriptorTabla);
        }
        return descriptorTablas;
    }
}
