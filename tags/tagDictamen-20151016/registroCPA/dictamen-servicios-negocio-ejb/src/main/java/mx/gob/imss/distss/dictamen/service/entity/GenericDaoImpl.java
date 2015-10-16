package mx.gob.imss.distss.dictamen.service.entity;

import java.io.Serializable;
import java.util.List;

import mx.gob.imss.distss.dictamen.service.interfaces.GenericDao;
import mx.gob.imss.distss.dictamen.service.repository.AbstractRespository;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;

/**
 * 
 * @author Cesar Isaac Sanchez Alvarez
 *
 * @param <T>
 * @param <PK>
 */
@SuppressWarnings("unchecked")
public class GenericDaoImpl<T, PK extends Serializable> extends AbstractRespository implements GenericDao<T, PK> {
	
	private Class<T> entityClass;
	
 	protected Criteria getCriteria() {
 		Criteria criteria=getSession().createCriteria(entityClass);
 		return criteria;
 	}
	
	public GenericDaoImpl() {
	}
	
	/**
	 * Constructor de la clase GenericDaoImpl
	 * 
	 * @param entityClass
	 */
	protected GenericDaoImpl(Class<T> entityClass) {
		this.entityClass = entityClass;
	}
	
	/**
	 * Metodo para registrar un registro en la base de datos
	 * 
	 * @param <T>
	 * @return Long
	 */
	@Override
	public void save(T t) throws RuntimeException {
		try {
			getSession().save(t);
			getSession().flush();
		} catch (Exception ex) {
			throw new RuntimeException("Error al insertar "+t+" en la base de datos.", ex);
		}
	}
	
	/**
	 * Metodo para buscar un registro a traves de un ID en la base de datos
	 * 
	 * @param <PK>
	 * @return <T>
	 */
	@Override
	public T findById(PK id) throws RuntimeException {
		try {
			return (T) getSession().get(entityClass, id);
		} catch (Exception ex) {
			throw new RuntimeException("Error al consultar por id en la base de datos.", ex);
		}
	}
	
	/**
	 * Metodo para registrar o actualizar si existe el registro en la base de datos
	 * 
	 * @param <T>
	 */
	@Override
	public void saveOrUpdate(T t) throws RuntimeException {
		try {
			getSession().saveOrUpdate(t);
			getSession().flush();
		} catch (Exception ex) {
			throw new RuntimeException("Error al insertar o al actualizar "+t+" en la base de datos.", ex);
		}
	}
	
	/**
	 * Metodo para obtener todos los registros de una entidad, de la base de datos
	 * 
	 * @return List<T>
	 */
	@Override
	public List<T> findAll() throws RuntimeException {
		try {
			return getSession().createCriteria(entityClass).list();
		} catch (Exception ex) {
			throw new RuntimeException("Error al consultar todos los registros de la base de datos.", ex);
		}
		
	}
	
	/**
	 * Metodo para actualizar un registro en la base de datos
	 * 
	 * @param <T>
	 */
	@Override
	public void update(T t) throws RuntimeException {
		try {
			getSession().update(t);
		} catch (Exception ex) {
			throw new RuntimeException("Error al actualizar "+t+" en la base de datos.", ex);
		}
	}
	
	/**
	 * Metodo para eliminar un registro en la base de datos
	 * 
	 * @param <T>
	 */
	@Override
	public void delete(T t) throws RuntimeException {
		try {
			getSession().delete(t);
		} catch (Exception ex) {
			throw new RuntimeException("Error al eliminar un(a) "+t+" en la base de datos.", ex);
		}
		
	}
	
	/**
	 * Metodo para obtener el numero de registros existentes en la base de datos de la entidad
	 * @return Integer
	 */
	@Override
	public Integer contarTotalRegistros(T t) throws RuntimeException {
		Integer totalRegistros = null;
		try {
			Criteria criteria = getSession().createCriteria(entityClass);
			criteria.setProjection(Projections.rowCount());
			totalRegistros = ((Long) criteria.uniqueResult()).intValue();
		} catch (Exception ex) {
			throw new RuntimeException("Error al "+t+" en la base de datos.", ex);
		}return totalRegistros;
	}

	@Override
	public List<T> findAllWithOrder(Order order) throws RuntimeException {
		try {
			return getCriteria().addOrder(order).list();
		} catch (Exception ex) {
			throw new RuntimeException("Error al consultar todos los registros de la base de datos.", ex);
		}
		
	}

}