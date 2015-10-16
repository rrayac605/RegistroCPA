package mx.gob.imss.cit.dictamen.web.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

import mx.gob.imss.cit.dictamen.integration.api.dto.domain.TipoDictamenDTO;

@FacesConverter("tipoDictamenConverter")
public class TipoDictamenConverter extends SelectItemsBaseConverter {

    /*
     * (non-Javadoc)
     * 
     * @see
     * javax.faces.convert.Converter#getAsString(javax.faces.context.FacesContext
     * , javax.faces.component.UIComponent, java.lang.Object)
     */
    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
    	
        if (!(value instanceof TipoDictamenDTO) || ((TipoDictamenDTO) value).getCveIdTipoDictamen() == null) {
        	System.out.println("tipo1"+value);
            return null;
        }

        System.out.println("tipo2"+((TipoDictamenDTO) value).getCveIdTipoDictamen());
        return String.valueOf(((TipoDictamenDTO) value).getCveIdTipoDictamen());
    }
}
