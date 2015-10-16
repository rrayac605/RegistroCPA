/**
 * 
 */
package mx.gob.imss.distss.dictamen.web.reporte;

import java.io.ByteArrayOutputStream;

import mx.gob.imss.digital.modelo.seguros.SeguroIvro;
import mx.gob.imss.digital.modelo.seguros.SegurosIvro;

/**
 * Interfaz para la generacion de los comprobantes de seguros
 * @author NOVUTECK1
 *
 */
public interface GeneradorComprobanteSeguro {

    /**
     * Genera El comprobante de un seguro 
     * @param seguro el seguro a generar su comprobante
     * @return el arreglo de bytes con el comprobante
     */
    ByteArrayOutputStream generaComprobante(SeguroIvro seguro, Long origen);
    
    /**
     * Genera los comprobantes para una lista de seguros
     * @param seguros los seguros a generar sus comprobantes
     * @return los comprobantes generados
     */
    ByteArrayOutputStream generaComprobantes(SegurosIvro seguros, Long origen);
    
}
