package mx.gob.imss.distss.dictamen.service.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

/**
 * ServiceMapper es la clase que nos ayuda a settear los datos de una Entidad
 * a un objeto DTO y viceversa.
 * 
 * @author Isaac S�nchez
 *
 */
@SuppressWarnings("unchecked")
public class ServiceMapper {
	
	/**
	 * Variable que referencia a la clase Mapper de la librer�a dozer.
	 */
	private static Mapper mapper = null;
	
	/**
	 * Constructor
	 */
	private ServiceMapper() {
		
	}
	
	/**
	 * M�todo que instancia la clase Mapper en dado caso que sea nula.
	 * 
	 * @return Instancia de la clase Mapper de la libreria dozer.
	 */
	public static Mapper getInstance() {
		if(mapper == null) {
			System.out.println("Se crea instancia del objeto Mapper");
			mapper = new DozerBeanMapper();
		}
		return mapper;
	}
	
	/**
	 * M�todo que settea los valores de los atributos del Objeto fuente
	 * al Objeto destino. Los valores que se setean solo ser�n los que 
	 * cuentan con el mismo nombre y el mismo tipo de atributo.
	 * 
	 * @param source Es el objeto que contiene los valores de los atributos, Objeto fuente.
	 * @param claseDestino Es el Objeto destino donde ser�n seteados los valores de los atributos del objeto fuente.
	 * @return Objeto destino con los valores del objeto fuente.
	 */
	public static <T> T map(Object source, Class<T> claseDestino) {
		mapper = getInstance();
		Object obj = null;
		obj = mapper.map(source, claseDestino);
		return (T) obj;
	}
	
	/**
	 * M�todo que settea los valores de los atributos de la lista de Objetos fuente
	 * a la lista de los Objetos destino. Los valores que se setean solo ser�n los que 
	 * cuentan con el mismo nombre y el mismo tipo de atributo.
	 * 
	 * @param lista Lista de objetos que contienen los valores de los atributos, lista de objetos fuentes.
	 * @param claseDestino Lista de objetos destino donde ser�n seteados los valores de los atributos del objeto fuente.
	 * @return Lista de los objetos destino con los valores de la lista de los objetos fuente.
	 */
	public static <S extends Serializable, E extends Serializable> List<S> mapList(List<E> lista, Class<S> claseDestino) {
		List<S> resultList = new ArrayList<S>();
		for (E obj : lista) {
			resultList.add(map(obj, claseDestino));
		}
		return resultList;
	}

}