package mx.gob.imss.cit.dictamen.web.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "BooleanConverter")
public class BooleanConverter implements Converter {

    /*
     * (non-Javadoc)
     * 
     * @see
     * javax.faces.convert.Converter#getAsObject(javax.faces.context.FacesContext
     * , javax.faces.component.UIComponent, java.lang.String)
     */
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value == null) {
            return null;
        } else {
            if (value.equals(Boolean.TRUE.toString())) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * javax.faces.convert.Converter#getAsString(javax.faces.context.FacesContext
     * , javax.faces.component.UIComponent, java.lang.Object)
     */
    @Override
    public String getAsString(FacesContext context, UIComponent component, Object valueParam) {
    	Object value=null;
        if (valueParam == null) {
            return null;
        } else {
            if (valueParam instanceof Boolean) {
                value = Boolean.toString((Boolean) valueParam);
            }else{
            	value=valueParam;
            }
            
            if (value.equals(Boolean.TRUE.toString())) {
                return Boolean.TRUE.toString();
            } else {
            	return Boolean.FALSE.toString();
            }
        }
    }
}
