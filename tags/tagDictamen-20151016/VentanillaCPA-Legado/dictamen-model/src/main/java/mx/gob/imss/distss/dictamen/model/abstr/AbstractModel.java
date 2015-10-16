/**
 * AbstractModel.java
 * @package mx.gob.imss.delta.framework.base.model
 * @project delta-framework-base	
 */
package mx.gob.imss.distss.dictamen.model.abstr;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.Transient;

public abstract class AbstractModel implements Serializable{


	private static final long serialVersionUID = -8583875651436402007L;
	@Transient
	private String error;

	@Transient
	private String exito;

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getExito() {
		return exito;
	}

	public void setExito(String exito) {
		this.exito = exito;
	}

	/*
	@Transient
	public Object getPropertyValue(String property) throws NoSuchMethodException,
			InvocationTargetException, IllegalAccessException {
		if (property!=null){
			Object i=this;
			for(String p:property.split("\\.")) {
                if (i==null){
					return null;
				}
                i = i.getClass().getMethod("get" + p.substring(0,1).toUpperCase()+p.substring(1,p.length())
                            , new Class[]{}).invoke(i, new Object[]{});
            }
			return i;
		}
		return null;
	}*/
}
