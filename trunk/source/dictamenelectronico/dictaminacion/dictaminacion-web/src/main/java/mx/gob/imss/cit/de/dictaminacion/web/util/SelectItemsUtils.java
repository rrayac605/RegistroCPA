package mx.gob.imss.cit.de.dictaminacion.web.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;

/**
 * The Class SelectItemsUtils.
 */
public final class SelectItemsUtils {
    
    /**
     * Instantiates a new select items utils.
     */
    private SelectItemsUtils() {}
    
    /**
     * Find value by string conversion.
     *
     * @param context the context
     * @param component the component
     * @param value the value
     * @param converter the converter
     * @return the object
     */
    public static Object findValueByStringConversion(FacesContext context, UIComponent component, String value, Converter converter) {
        return findValueByStringConversion(context, component, new SelectItemsIterator(context, component), value, converter);        
    }
 
    /**
     * Find value by string conversion.
     *
     * @param context the context
     * @param component the component
     * @param items the items
     * @param value the value
     * @param converter the converter
     * @return the object
     */
    private static Object findValueByStringConversion(FacesContext context, UIComponent component, Iterator<SelectItem> items, String value, Converter converter) {
        while (items.hasNext()) {
            SelectItem item = items.next();
            if (item instanceof SelectItemGroup) {
                SelectItem subitems[] = ((SelectItemGroup) item).getSelectItems();
                if (!isEmpty(subitems)) {
                    Object object = findValueByStringConversion(context, component, new ArrayIterator(subitems), value, converter);
                    if (object != null) {
                        return object;
                    }
                }
            } else if (!item.isNoSelectionOption() && value.equals(converter.getAsString(context, component, item.getValue()))) {
                return item.getValue();
            }
        }        
        return null;
    }
 
    /**
     * Checks if is empty.
     *
     * @param array the array
     * @return true, if is empty
     */
    public static boolean isEmpty(Object[] array) {
        return array == null || array.length == 0;    
    }
 
    /**
     * This class is based on Mojarra version.
     */
    static class ArrayIterator implements Iterator<SelectItem> {
 
        /**
         * Instantiates a new array iterator.
         *
         * @param items the items
         */
        public ArrayIterator(SelectItem items[]) {
            this.items = items;
        }
 
        /** The items. */
        private SelectItem items[];
        
        /** The index. */
        private int index = 0;
 
        /* (non-Javadoc)
         * @see java.util.Iterator#hasNext()
         */
        public boolean hasNext() {
            return (index < items.length);
        }
 
        /* (non-Javadoc)
         * @see java.util.Iterator#next()
         */
        public SelectItem next() {
            try {
                return (items[index++]);
            }
            catch (IndexOutOfBoundsException e) {
                throw new NoSuchElementException();
            }
        }
 
        /* (non-Javadoc)
         * @see java.util.Iterator#remove()
         */
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
