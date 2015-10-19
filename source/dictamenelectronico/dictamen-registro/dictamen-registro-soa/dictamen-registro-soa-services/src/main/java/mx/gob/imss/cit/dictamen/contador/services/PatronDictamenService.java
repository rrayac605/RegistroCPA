package mx.gob.imss.cit.dictamen.contador.services;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.contador.commons.exception.DictamenContadorException;


@Local
public interface PatronDictamenService {
	
	boolean getDictamenByRfcPatronAndIdContador(String curp) throws DictamenContadorException;

}
