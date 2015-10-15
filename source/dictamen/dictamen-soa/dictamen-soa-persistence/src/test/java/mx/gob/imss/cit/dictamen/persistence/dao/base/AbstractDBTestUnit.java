package mx.gob.imss.cit.dictamen.persistence.dao.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;

import mx.gob.imss.cit.dictamen.commons.util.ReflectionHelper;
import mx.gob.imss.cit.dictamen.persistence.dao.NdcAseveracionesDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdcAtestiguamientoDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtAtestigPreguntasRespuestDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtAtestiguamientoDictamenDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtCargaDocumentoDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtContadorPublicoAutDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtPatronDictamenDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtR2DespachoDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtRubroAtestiguamientoDictDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.impl.NdcAseveracionesDAOImpl;
import mx.gob.imss.cit.dictamen.persistence.dao.impl.NdcAtestiguamientoDAOImpl;
import mx.gob.imss.cit.dictamen.persistence.dao.impl.NdtAtestigPreguntasRespuestDAOImpl;
import mx.gob.imss.cit.dictamen.persistence.dao.impl.NdtAtestiguamientoDictamenDAOImpl;
import mx.gob.imss.cit.dictamen.persistence.dao.impl.NdtCargaDocumentoDAOImpl;
import mx.gob.imss.cit.dictamen.persistence.dao.impl.NdtContadorPublicoAutDAOImpl;
import mx.gob.imss.cit.dictamen.persistence.dao.impl.NdtPatronDictamenDAOImpl;
import mx.gob.imss.cit.dictamen.persistence.dao.impl.NdtR2DespachoDAOImpl;
import mx.gob.imss.cit.dictamen.persistence.dao.impl.NdtRubroAtestiguamientoDictDAOImpl;

/**
 * Clase de prueba unitaria de la que deben extender los
 * 
 * @author ajfuentes
 */
public abstract class AbstractDBTestUnit {

	private static final Logger LOG = Logger
			.getLogger(AbstractDBTestUnit.class);

	public Map<Class<?>, Class<?>> mapDAO;

	private EntityManager em;

	@Before
	public void setUp() {
		Properties prop = new Properties();
		try {
			prop.load(AbstractDBTestUnit.class.getClassLoader()
					.getResourceAsStream("db_embedida.properties"));
		} catch (IOException e) {

			e.printStackTrace();
		}

		if (em == null) {

			EntityManagerFactory emf = Persistence
					.createEntityManagerFactory("DictamenPUTest");
			em = emf.createEntityManager();
			// Agregar la relación de daos y sus implementaciones
			initMapDAO();

			if (!em.getTransaction().isActive()) {
				em.getTransaction().begin();
			}

			if ("true".equals(prop.getProperty("db_embedida"))) {
				initializeData("dataset/init.sql");
			}

		}
	}

	public void initializeData(String path) {

		InputStream is = ClassLoader.getSystemResourceAsStream(path);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String line;
		Query query = null;
		try {
			line = br.readLine();
			while (line != null) {
				if (line.length() > 20 && line.indexOf("//") != 0) {
					query = em.createNativeQuery(line);
					query.executeUpdate();
					em.flush();
				}
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			safeCloseBufferedReader(br);
		}
	}

	private void safeCloseBufferedReader(BufferedReader br) {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				br = null;
			}
		}
	}

	private void initMapDAO() {
		// Agregar las relaciones de DAO y sus implementaciones
		mapDAO = new HashMap<Class<?>, Class<?>>();

		mapDAO.put(NdtContadorPublicoAutDAO.class,NdtContadorPublicoAutDAOImpl.class);
		mapDAO.put(NdtPatronDictamenDAO.class, NdtPatronDictamenDAOImpl.class);
		mapDAO.put(NdtR2DespachoDAO.class, NdtR2DespachoDAOImpl.class);
		mapDAO.put(NdtAtestiguamientoDictamenDAO.class, NdtAtestiguamientoDictamenDAOImpl.class);
		mapDAO.put(NdcAtestiguamientoDAO.class, NdcAtestiguamientoDAOImpl.class);
		mapDAO.put(NdtCargaDocumentoDAO.class, NdtCargaDocumentoDAOImpl.class);
		mapDAO.put(NdcAseveracionesDAO.class, NdcAseveracionesDAOImpl.class);
		mapDAO.put(NdtRubroAtestiguamientoDictDAO.class, NdtRubroAtestiguamientoDictDAOImpl.class);
		mapDAO.put(NdtAtestigPreguntasRespuestDAO.class, NdtAtestigPreguntasRespuestDAOImpl.class);
		
	}

	protected void connect(Object o) {
		connect(o, 3);
	}

	protected void connect(Object o, int n) {
		if (n > 0) {
			try {

				Field[] fields = o.getClass().getDeclaredFields();

				for (Field field : fields) {
					PersistenceContext persistenceContext = field
							.getAnnotation(PersistenceContext.class);
					if (persistenceContext != null) {
						ReflectionHelper.set(this.em, field.getName(), o);
					}

					EJB ejb = field.getAnnotation(javax.ejb.EJB.class);
					if (ejb != null) {
						String className = field.getType().getCanonicalName();

						Class<?> clazz = Class.forName(className);

						if (this.mapDAO.containsKey(clazz)) {
							Constructor<?> ctor = this.mapDAO.get(clazz)
									.getConstructor();
							Object dao = ctor.newInstance();

							Field[] fieldDAOs = dao.getClass()
									.getDeclaredFields();
							for (Field fieldDAO : fieldDAOs) {
								persistenceContext = fieldDAO
										.getAnnotation(PersistenceContext.class);
								if (persistenceContext != null) {
									ReflectionHelper.set(this.em,
											fieldDAO.getName(), dao);
									ReflectionHelper.set(dao, field.getName(),
											o);
									break;
								}
							}
							connect(dao, n - 1);
						}

					}

				}
			} catch (ClassNotFoundException e) {
				LOG.error(e.getMessage(), e);
			} catch (SecurityException e) {
				LOG.error(e.getMessage(), e);
			} catch (NoSuchMethodException e) {
				LOG.error(e.getMessage(), e);
			} catch (IllegalArgumentException e) {
				LOG.error(e.getMessage(), e);
			} catch (InstantiationException e) {
				LOG.error(e.getMessage(), e);
			} catch (IllegalAccessException e) {
				LOG.error(e.getMessage(), e);
			} catch (InvocationTargetException e) {
				LOG.error(e.getMessage(), e);
			}
		}

	}

	@After
	public void tearDown() {
//		if (em != null) {
//			em.getTransaction().rollback();
//		}

	}

	public EntityManager getEntityManager() {
		return this.em;
	}

	/**
	 * @return the mapDAO
	 */
	public Map<Class<?>, Class<?>> getMapDAO() {
		return mapDAO;
	}

	/**
	 * @param mapDAO
	 *            the mapDAO to set
	 */
	public void setMapDAO(Map<Class<?>, Class<?>> mapDAO) {
		this.mapDAO = mapDAO;
	}
}
