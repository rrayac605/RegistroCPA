package mx.gob.imss.cit.dictamen.web.converters;

import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

import mx.gob.imss.cit.dictamen.integration.api.dto.TipoCatalogoDTO;

/**
 * The Class PersonaConverter.
 */
@ManagedBean (name="catalogoConverter")
public class CatalogoConverter extends SelectItemsBaseConverter {
    
    /* (non-Javadoc)
     * @see javax.faces.convert.Converter#getAsString(javax.faces.context.FacesContext, javax.faces.component.UIComponent, java.lang.Object)
     */
    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (!(value instanceof TipoCatalogoDTO) || ((TipoCatalogoDTO) value).getId() == null) {
            return null;
        }

        return String.valueOf(((TipoCatalogoDTO) value).getId());
    }
}
