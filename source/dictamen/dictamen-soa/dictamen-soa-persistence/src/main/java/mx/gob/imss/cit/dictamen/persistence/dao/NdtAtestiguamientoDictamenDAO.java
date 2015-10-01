package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtAtestiguamientoDictamenDO;
@Local
public interface NdtAtestiguamientoDictamenDAO {
	
	List<NdtAtestiguamientoDictamenDO> findExamenesByIdPatronDictamen(Long cveIdPatronDictamen);
	void flush();
}
