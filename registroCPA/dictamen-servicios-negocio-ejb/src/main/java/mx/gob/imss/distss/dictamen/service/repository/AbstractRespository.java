package mx.gob.imss.distss.dictamen.service.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;

public class AbstractRespository {
	
	@PersistenceContext(unitName="dictamenPersistenceUnit")
	protected EntityManager entityManager;
	
	protected Session getSession() throws RuntimeException {
		try {
			return (Session)entityManager.getDelegate();
		} catch (Exception ex) {
			throw new RuntimeException("Error al obtener la sesi\u00f3n de la base de datos.", ex);
		}
	}

}