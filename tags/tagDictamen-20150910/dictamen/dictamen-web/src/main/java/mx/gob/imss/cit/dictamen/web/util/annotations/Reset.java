package mx.gob.imss.cit.dictamen.web.util.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The Interface Reset.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Reset {
    
    /**
     * Enabled.
     *
     * @return true, if successful
     */
    public boolean enabled() default true;
}