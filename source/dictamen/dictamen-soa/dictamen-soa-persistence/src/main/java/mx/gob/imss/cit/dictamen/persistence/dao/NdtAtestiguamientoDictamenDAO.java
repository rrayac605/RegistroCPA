package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import mx.gob.imss.cit.dictamen.model.NdtAtestiguamientoDictamenDO;

public interface NdtAtestiguamientoDictamenDAO {
	
	List<NdtAtestiguamientoDictamenDO> findExamenesByIdPatronDictamen(Long cveIdPatronDictamen);
	
	void flush();
}
