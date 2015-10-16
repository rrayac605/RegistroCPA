package mx.gob.imss.cit.imssarquitectura.transfer.factory;

import mx.gob.imss.cit.imssarquitectura.transfer.constants.TransferConstants;
import mx.gob.imss.cit.imssarquitectura.transfer.exception.TransferException;
import mx.gob.imss.cit.imssarquitectura.transfer.services.Transfer;
import mx.gob.imss.cit.imssarquitectura.transfer.services.impl.TransferServlet;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class TransferFactory {
	public Transfer getTransfer(String factory){
		if(factory.equalsIgnoreCase(TransferConstants.SERVLET_FACTORY)){
			return new TransferServlet();
		}else{
			throw new TransferException("No se encontró la fabrica solicitada.");
		}
	}
}

