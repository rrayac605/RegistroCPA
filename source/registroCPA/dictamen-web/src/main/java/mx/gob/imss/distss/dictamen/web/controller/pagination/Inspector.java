package mx.gob.imss.distss.dictamen.web.controller.pagination;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Map;

public class Inspector {

    private static final Log log= LogFactory.getLog(FiltroDataTableContadorPublico.class);

    public static void show(Object instance){
        if (log.isDebugEnabled()){
            assert instance!=null;
            log.debug("showing properties from instance of "+instance.getClass().getName()+"...");
            try {
                @SuppressWarnings("unchecked")
				Map<String, Object> properties = BeanUtils.describe(instance);
                for (Map.Entry<String,Object> entry:properties.entrySet())
                    log.debug("property: "+entry.getKey()+" - value: "+entry.getValue());
            } catch (Exception e){
            	e.printStackTrace();
            }
        }
    }

}
