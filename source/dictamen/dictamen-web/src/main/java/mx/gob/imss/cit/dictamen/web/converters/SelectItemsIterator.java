/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997-2010 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

package mx.gob.imss.cit.dictamen.web.converters;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;

import javax.faces.component.UIComponent;
import javax.faces.component.UISelectItem;
import javax.faces.component.UISelectItems;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;


/**
 * <p>Package private class for iterating over the set of {@link SelectItem}s
 * for a parent {@link UISelectMany} or {@link UISelectOne}.</p>
 *
 * // RELEASE_PENDING (rlubke,driscoll) performanc review
 */
final class SelectItemsIterator implements Iterator<SelectItem> {


    // ------------------------------------------------------------ Constructors


    /**
     * <p>Construct an iterator instance for the specified parent component.</p>
     *
     * @param ctx the {@link FacesContext} for the current request
     * @param parent The parent {@link UIComponent} whose children will be
     *  processed
     */
    public SelectItemsIterator(FacesContext ctx, UIComponent parent) {

        kids = parent.getChildren().listIterator();
        this.ctx = ctx;

    }


    // ------------------------------------------------------ Instance Variables


    /**
     * <p>Iterator over the SelectItem elements pointed at by a
     * <code>UISelectItems</code> component, or <code>null</code>.</p>
     */
    private Iterator<SelectItem> items;


    /**
     * <p>Iterator over the children of the parent component.</p>
     */
    private ListIterator<UIComponent> kids;


    /**
     * Expose single SelectItems via an Iterator.  This iterator will be
     * reset/reused for each individual SelectItem instance encountered.
     */
    private SingleElementIterator singleItemIterator;


    /**
     * The {@link FacesContext} for the current request.
     */
    private FacesContext ctx;


    // -------------------------------------------------------- Iterator Methods


    /**
     * <p>Return <code>true</code> if the iteration has more elements.</p>
     *
     * @return true, if successful
     */
    public boolean hasNext() {

        if (items != null) {
            if (items.hasNext()) {
                return (true);
            } else {
                items = null;
            }
        }
        Object next = findNextValidChild();
        while (next != null) {
            initializeItems(next);
            if (items != null) {
                return true;
            } else {
                next = findNextValidChild();
            }
        }
        return false;

    }


    /**
     * <p>Return the next element in the iteration.</p>
     *
     * @return the select item
     */
    public SelectItem next() {

        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        if (items != null) {
            return (items.next());
        }
        return next();

    }


    /**
     * <p>Throw UnsupportedOperationException.</p>
     */
    public void remove() {

        throw new UnsupportedOperationException();

    }


    // --------------------------------------------------------- Private Methods


    /**
     * <p>
     * Initializes the <code>items</code> instance variable with an
     * <code>Iterator</code> appropriate to the UISelectItem(s) value.
     * </p>
     *
     * @param kid the kid
     */
    private void initializeItems(Object kid) {

        if (kid instanceof UISelectItem) {
            UISelectItem ui = (UISelectItem) kid;
            SelectItem item = (SelectItem) ui.getValue();
            if (item == null) {
                item = new SelectItem(ui.getItemValue(),
                                      ui.getItemLabel(),
                                      ui.getItemDescription(),
                                      ui.isItemDisabled(),
                                      ui.isItemEscaped(),
                                      ui.isNoSelectionOption());
            }
            updateSingeItemIterator(item);
            items = singleItemIterator;
        } else if (kid instanceof UISelectItems) {
            UISelectItems ui = (UISelectItems) kid;
            Object value = ui.getValue();
            if (value != null) {
                validarInstancia(kid, value);
            }
            if (items != null && !items.hasNext()) {
                items = null;
            }
        } 

    }


	/**
	 * @param kid
	 * @param value
	 */
	private void validarInstancia(Object kid, Object value) {
		if (value instanceof SelectItem) {
		    updateSingeItemIterator((SelectItem) value);
		    items = singleItemIterator;
		} else if (value.getClass().isArray()) {
		    items = new ArrayIterator(ctx, (UISelectItems) kid, value);
		} else if (value instanceof Iterable) {
		    items = new IterableItemIterator(ctx,
		                                     (UISelectItems) kid,
		                                     (Iterable<?>) value);
		} else if (value instanceof Map) {
		    items = new MapIterator((Map) value);
		} else {
		    throw new IllegalArgumentException();
		}
	}


    /**
     * Find next valid child.
     *
     * @return the next valid child for processing
     */
    private Object findNextValidChild() {

        if (kids.hasNext()) {
            Object next = kids.next();
            while (kids.hasNext() && !(next instanceof UISelectItem || next instanceof UISelectItems)) {
                next = kids.next();
            }
            if (next instanceof UISelectItem || next instanceof UISelectItems) {
                return next;
            }
        }
        return null;

    }


    /**
     * Update the <code>singleItemIterator</code> with the provided
     * <code>item</code>.
     *
     * @param item the {@link SelectItem} to expose as an Iterator
     */
    private void updateSingeItemIterator(SelectItem item) {

        if (singleItemIterator == null) {
            singleItemIterator = new SingleElementIterator();
        }
        singleItemIterator.updateItem(item);

    }


    // ---------------------------------------------------------- Nested Classes


    /**
     * Exposes single {@link SelectItem} instances as an Iterator.
     */
    private static final class SingleElementIterator implements Iterator<SelectItem> {

        /** The item. */
        private SelectItem item;
        
        /** The next called. */
        private boolean nextCalled;


        // ----------------------------------------------- Methods from Iterator


        /* (non-Javadoc)
         * @see java.util.Iterator#hasNext()
         */
        public boolean hasNext() {

            return !nextCalled;

        }


        /* (non-Javadoc)
         * @see java.util.Iterator#next()
         */
        public SelectItem next() {

            if (nextCalled) {
                throw new NoSuchElementException();
            }
            nextCalled = true;
            return item;

        }


        /* (non-Javadoc)
         * @see java.util.Iterator#remove()
         */
        public void remove() {

            throw new UnsupportedOperationException();

        }


        // ----------------------------------------------------- Private Methods


        /**
         * Update item.
         *
         * @param item the item
         */
        private void updateItem(SelectItem item) {

            this.item = item;
            nextCalled = false;

        }

    } // END SingleElementIterator


    /**
     * Iterates over a <code>Map</code> of values exposing each entry as a SelectItem.
     * Note that this will do so re-using the same SelectItem but changing
     * the value and label as appropriate.
     */
    private static final class MapIterator implements Iterator<SelectItem> {

        /** The item. */
        private SelectItem item = new SelectItem();
        
        /** The iterator. */
        private Iterator iterator;


        // -------------------------------------------------------- Constructors


        /**
         * Instantiates a new map iterator.
         *
         * @param map the map
         */
        private MapIterator(Map map) {

            this.iterator = map.entrySet().iterator();

        }


        // ----------------------------------------------- Methods from Iterator


        /* (non-Javadoc)
         * @see java.util.Iterator#hasNext()
         */
        public boolean hasNext() {

            return iterator.hasNext();

        }


        /* (non-Javadoc)
         * @see java.util.Iterator#next()
         */
        public SelectItem next() {

            Map.Entry entry = (Map.Entry) iterator.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            item.setLabel(((key != null) ? key.toString() : value.toString()));
            item.setValue(((value != null) ? value : ""));
            return item;
            
        }


        /* (non-Javadoc)
         * @see java.util.Iterator#remove()
         */
        public void remove() {

            throw new UnsupportedOperationException();

        }

    } // END MapIterator


    /**
     * <p>
     * Base class to support iterating over Collections or Arrays that may
     * or may not contain <code>SelectItem</code> instances.
     * </p>
     */
    private static abstract class GenericObjectSelectItemIterator implements Iterator<SelectItem> {

        /**
         * SelectItem that is updated based on the current Object being
         * iterated over.
         */
        private GenericObjectSelectItem genericObjectSI;

        /**
         * The source <code>UISelectItems</code>.
         */
        protected UISelectItems sourceComponent;


        // -------------------------------------------------------- Constructors


        /**
         * Instantiates a new generic object select item iterator.
         *
         * @param sourceComponent the source component
         */
        protected GenericObjectSelectItemIterator(UISelectItems sourceComponent) {

            this.sourceComponent = sourceComponent;

        }


        // --------------------------------------------------- Protected Methods


        /**
         * Gets the select item for.
         *
         * @param ctx the ctx
         * @param value the value
         * @return the select item for
         */
        protected SelectItem getSelectItemFor(FacesContext ctx, Object value) {

            if (genericObjectSI == null) {
                genericObjectSI = new GenericObjectSelectItem(sourceComponent);
            }

            genericObjectSI.updateItem(ctx, value);
            return genericObjectSI;
            
        }


        // ------------------------------------------------------ Nested Classes


        /**
         * A <code>SelectItem</code> implementation to support generating
         * unique <code>SelectItem</code> values based on <code>ValueExpressions</code>
         * from the owning {@link UISelectItems} instance.
         */
        @SuppressWarnings({"serial"})
        private static final class GenericObjectSelectItem extends SelectItem {


            /** The Constant VAR. */
            private static final String VAR = "var";
            
            /** The Constant ITEM_VALUE. */
            private static final String ITEM_VALUE = "itemValue";
            
            /** The Constant ITEM_LABEL. */
            private static final String ITEM_LABEL = "itemLabel";
            
            /** The Constant ITEM_DESCRIPTION. */
            private static final String ITEM_DESCRIPTION = "itemDescription";
            
            /** The Constant ITEM_ESCAPED. */
            private static final String ITEM_ESCAPED = "itemLabelEscaped";
            
            /** The Constant ITEM_DISABLED. */
            private static final String ITEM_DISABLED = "itemDisabled";
            
            /** The Constant NO_SELECTION_OPTION. */
            private static final String NO_SELECTION_OPTION = "noSelectionOption";

            /**
             * The request-scoped variable under which the current object
             * will be exposed.
             */
            private String var;

            /** The source component. */
            private UISelectItems sourceComponent;

            // -------------------------------------------------------- Constructors


            /**
             * Instantiates a new generic object select item.
             *
             * @param sourceComponent the source component
             */
            private GenericObjectSelectItem(UISelectItems sourceComponent) {

                var = (String) sourceComponent.getAttributes().get(VAR);
                this.sourceComponent = sourceComponent;
                //itemValue = sourceComponent.getValueExpression(ITEM_VALUE);
                //itemLabel = sourceComponent.getValueExpression(ITEM_LABEL);
                //itemDescription = sourceComponent.getValueExpression(ITEM_DESCRIPTION);
                //itemEscaped = sourceComponent.getValueExpression(ITEM_ESCAPED);
                //itemDisabled = sourceComponent.getValueExpression(ITEM_DISABLED);
                //noSelectionOption = sourceComponent.getValueExpression(NO_SELECTION_OPTION);

            }

            // ----------------------------------------------------- Private Methods


            /**
             * Updates the <code>SelectItem</code> properties based on the
             * current value.
             *
             * @param ctx the {@link FacesContext} for the current request
             * @param value the value to build the updated values from
             */
            private void updateItem(FacesContext ctx, Object value) {

                Map<String, Object> reqMap =
                      ctx.getExternalContext().getRequestMap();
                Object oldVarValue = null;
                if (var != null) {
                    oldVarValue = reqMap.put(var, value);
                }
                try {
                    Map<String,Object> attrs = sourceComponent.getAttributes();
                    Object itemValueResult = attrs.get(ITEM_VALUE);
                    Object itemLabelResult = attrs.get(ITEM_LABEL);
                    Object itemDescriptionResult = attrs.get(ITEM_DESCRIPTION);
                    Object itemEscapedResult = attrs.get(ITEM_ESCAPED);
                    Object itemDisabledResult = attrs.get(ITEM_DISABLED);
                    Object noSelectionOptionResult = attrs.get(NO_SELECTION_OPTION);
                    setValue(((itemValueResult != null) ? itemValueResult : value));
                    setLabel(((itemLabelResult != null)
                                  ? itemLabelResult.toString()
                                  : value.toString()));
                    setDescription(((itemDescriptionResult != null)
                                        ? itemDescriptionResult.toString()
                                        : null));
                    setEscape(((itemEscapedResult != null)
                                   ? Boolean.valueOf(itemEscapedResult.toString())
                                   : true));
                    setDisabled(((itemDisabledResult != null)
                                     ? Boolean.valueOf(itemDisabledResult.toString())
                                     : false));
                    setNoSelectionOption(((noSelectionOptionResult != null)
                                     ? Boolean.valueOf(noSelectionOptionResult.toString())
                                    : false));
                } finally {
                    if (var != null) {
                        if (oldVarValue != null) {
                            reqMap.put(var, oldVarValue);
                        } else {
                            reqMap.remove(var);
                        }
                    }
                }

            }


            // --------------------------------------- Methods from Serializable


            /**
             * Write object.
             *
             * @param out the out
             * @throws IOException Signals that an I/O exception has occurred.
             */
            private void writeObject(ObjectOutputStream out) throws IOException {

                throw new NotSerializableException();

            }


            /**
             * Read object.
             *
             * @param in the in
             * @throws IOException Signals that an I/O exception has occurred.
             */
            private void readObject(ObjectInputStream in) throws IOException {

                throw new NotSerializableException();

            }

        } // END GenericObjectSelectItem

    } // END GenericObjectSelectItemIterator


    /**
     * Handles arrays of <code>SelectItem</code>s, generic Objects,
     * or combintations of both.
     *
     * A single <code>GenericObjectSelectItem</code> will be leverage for any
     * non-<code>SelectItem</code> objects encountered.
     */
    private static final class ArrayIterator extends GenericObjectSelectItemIterator {


        /** The ctx. */
        private FacesContext ctx;
        
        /** The array. */
        private Object array;
        
        /** The count. */
        private int count;
        
        /** The index. */
        private int index;


        // -------------------------------------------------------- Constructors


        /**
         * Instantiates a new array iterator.
         *
         * @param ctx the ctx
         * @param sourceComponent the source component
         * @param array the array
         */
        private ArrayIterator(FacesContext ctx,
                              UISelectItems sourceComponent,
                              Object array) {

            super(sourceComponent);
            this.ctx = ctx;
            this.array = array;
            count = Array.getLength(array);

        }


        // ----------------------------------------------- Methods from Iterator


        /* (non-Javadoc)
         * @see java.util.Iterator#hasNext()
         */
        public boolean hasNext() {

            return (index < count);

        }

        /* (non-Javadoc)
         * @see java.util.Iterator#next()
         */
        public SelectItem next() {

            if (index >= count) {
                throw new NoSuchElementException();
            }

            Object item = Array.get(array, index++);
            if (item instanceof SelectItem) {
                return (SelectItem) item;
            } else {
                return getSelectItemFor(ctx, item);
            }

        }

        /* (non-Javadoc)
         * @see java.util.Iterator#remove()
         */
        public void remove() {
            throw new UnsupportedOperationException();
        }


    } // END ArrayIterator


    /**
     * Handles Collections of <code>SelectItem</code>s, generic Objects,
     * or combintations of both.
     *
     * A single <code>GenericObjectSelectItem</code> will be leverage for any
     * non-<code>SelectItem</code> objects encountered.
     */
    private static final class IterableItemIterator extends GenericObjectSelectItemIterator {


        /** The ctx. */
        private FacesContext ctx;
        
        /** The iterator. */
        private Iterator<?> iterator;


        // -------------------------------------------------------- Constructors


        /**
         * Instantiates a new iterable item iterator.
         *
         * @param ctx the ctx
         * @param sourceComponent the source component
         * @param iterable the iterable
         */
        private IterableItemIterator(FacesContext ctx,
                                     UISelectItems sourceComponent,
                                     Iterable<?> iterable) {

            super(sourceComponent);
            this.ctx = ctx;
            this.iterator = iterable.iterator();

        }


        // ----------------------------------------------- Methods from Iterator


        /* (non-Javadoc)
         * @see java.util.Iterator#hasNext()
         */
        public boolean hasNext() {

            return iterator.hasNext();

        }


        /* (non-Javadoc)
         * @see java.util.Iterator#next()
         */
        public SelectItem next() {

            Object item = iterator.next();
            if (item instanceof SelectItem) {
                return (SelectItem) item;
            } else {
                return getSelectItemFor(ctx, item);
            }

        }


        /* (non-Javadoc)
         * @see java.util.Iterator#remove()
         */
        public void remove() {

            throw new UnsupportedOperationException();
            
        }

    } // END CollectionItemIterator


}
