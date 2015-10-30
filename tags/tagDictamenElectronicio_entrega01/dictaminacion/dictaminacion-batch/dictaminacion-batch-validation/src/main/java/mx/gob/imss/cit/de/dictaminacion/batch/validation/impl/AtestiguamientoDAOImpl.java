/**
 * 
 */
package mx.gob.imss.cit.de.dictaminacion.batch.validation.impl;

import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import mx.gob.imss.cit.de.dictaminacion.batch.validation.dao.AtestiguamientoDAO;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.mapper.AtestiguamientoMapper;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.mapper.RutasMapper;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.AtestiguamientoTO;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.RutaTO;

/**
 * @author anhernandez
 *
 */
public class AtestiguamientoDAOImpl implements AtestiguamientoDAO {

	private Logger LOG=Logger.getLogger(AtestiguamientoDAOImpl.class);
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;   
	  
	  public void setDataSource(DataSource dataSource) {
		  this.dataSource = dataSource;
		  this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	  }
	
	  /**
	   * 
	   */
	@Override
	public AtestiguamientoTO obtieneAtestiguamiento(Long idAseveracion) {
		LOG.info("obtienendo Atestiguamientos..... con idAseveracion= "+idAseveracion);
		String SQL = "select * from NDC_ATESTIGUAMIENTO " +
				"where cve_id_aseveracion = ?";
		AtestiguamientoTO atestiguamientoTO = jdbcTemplateObject.queryForObject(SQL, 
                   new Object[]{idAseveracion}, new AtestiguamientoMapper());
	      
	       LOG.info("Atestiguamiento econtrado: "+atestiguamientoTO.getIdAtestiguamiento());
		return atestiguamientoTO;
	}
	
	

}
