package mx.gob.imss.cit.dictamen.services;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.commons.to.ParentLayoutTO;

@Local
public interface LayoutService {

	List<ParentLayoutTO> createList();
}