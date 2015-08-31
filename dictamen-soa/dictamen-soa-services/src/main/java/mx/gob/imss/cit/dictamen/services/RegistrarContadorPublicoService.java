/**
 * 
 */
package mx.gob.imss.cit.dictamen.services;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.commons.to.ContadorPublicoTO;

/**
 * @author ajfuentes
 *
 */
@Local
public interface RegistrarContadorPublicoService {
	
	/**
	 * metodo que registra un contador publico
	 */
	public void executeRegistrarContador(ContadorPublicoTO contadorPublicoTO);

}
