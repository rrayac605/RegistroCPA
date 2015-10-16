package mx.gob.imss.cit.de.dictaminacion.web.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.EjercicioFiscalDTO;

@FacesConverter("ejercicioFiscalConverter")
public class EjercicioFiscalConverter extends SelectItemsBaseConverter  {

   
    /*
     * (non-Javadoc)
     * 
     * @see
     * javax.faces.convert.Converter#getAsString(javax.faces.context.FacesContext
     * , javax.faces.component.UIComponent, java.lang.Object)
     */
    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
    	if (!(value instanceof EjercicioFiscalDTO) || ((EjercicioFiscalDTO) value).getCveIdEjerFiscal() == null) {
    		System.out.println("ejercicio1"+value);
            return null;
        }

    	System.out.println("ejercicio2"+((EjercicioFiscalDTO) value).getCveIdEjerFiscal());
        return String.valueOf(((EjercicioFiscalDTO) value).getCveIdEjerFiscal());
    }
}
