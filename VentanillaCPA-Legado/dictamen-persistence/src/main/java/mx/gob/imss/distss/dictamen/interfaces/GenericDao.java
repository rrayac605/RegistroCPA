package mx.gob.imss.distss.dictamen.interfaces;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.Order;


/**
 * 
 * @author Cesar Isaac Sanchez Alvarez
 *
 * @param <T>
 * @param <PK>
 */
public interface GenericDao<T, PK extends Serializable> {
	
	public void save(T t) throws RuntimeException;
	public T findById(PK id) throws RuntimeException;
	public void saveOrUpdate(T t) throws RuntimeException;
	public List<T> findAll() throws RuntimeException;
	public List<T> findAllWithOrder(Order order) throws RuntimeException;
	public void update(T t) throws RuntimeException;
	public void delete(T t) throws RuntimeException;
	public Integer contarTotalRegistros(T t) throws RuntimeException;

}