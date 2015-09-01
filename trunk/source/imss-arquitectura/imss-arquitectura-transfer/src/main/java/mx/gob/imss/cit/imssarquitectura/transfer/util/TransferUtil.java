package mx.gob.imss.cit.imssarquitectura.transfer.util;

import mx.gob.imss.cit.imssarquitectura.transfer.constants.TransferConstants;
import mx.gob.imss.cit.imssarquitectura.transfer.factory.TransferFactory;
import mx.gob.imss.cit.imssarquitectura.transfer.services.Transfer;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class TransferUtil {
	public void subirArchivo(String nombreArchivo){
		Transfer transfer = new TransferFactory().getTransfer(TransferConstants.SERVLET_FACTORY);
		transfer.subirArchivoUnico(nombreArchivo);
	}
}

