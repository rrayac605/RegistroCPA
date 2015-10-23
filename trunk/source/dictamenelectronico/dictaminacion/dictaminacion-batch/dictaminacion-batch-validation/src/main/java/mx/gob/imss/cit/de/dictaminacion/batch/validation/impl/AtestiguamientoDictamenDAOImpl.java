/**
 * 
 */
package mx.gob.imss.cit.de.dictaminacion.batch.validation.impl;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import mx.gob.imss.cit.de.dictaminacion.batch.validation.dao.AtestiguamientoDictamenDAO;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.mapper.AtestiguamientoDictamenMapper;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.mapper.AtestiguamientoMapper;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.AtestiguamientoDictamenTO;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.AtestiguamientoTO;

/**
 * @author anhernandez
 *
 */
public class AtestiguamientoDictamenDAOImpl implements
		AtestiguamientoDictamenDAO {

	private Logger LOG=Logger.getLogger(RutasDAOImpl.class);
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
	public AtestiguamientoDictamenTO validaAtesDictamenByPatronDictamen(Long idPatronDictamen, Long idAtestiguamiento) {
		LOG.info("obtienendo Atestiguamientos.....");
		String SQL = "selct * from NDT_ATESTIGUAMIENTO_DICTAMEN " +
				"where CVE_ID_PATRON_DICTAMEN =? and CVE_ID_ATESTIGUAMIENTO =?";
		
		AtestiguamientoDictamenTO atestiguamientoDictamenTO = jdbcTemplateObject.queryForObject(SQL, 
                   new Object[]{idPatronDictamen,idAtestiguamiento}, new AtestiguamientoDictamenMapper());
	      
	       LOG.info("AtestiguamientoDictamen econtrado: "+atestiguamientoDictamenTO);
		return atestiguamientoDictamenTO;
	}

	@Override
	public void actualizaEstatus(Long idEstatus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertaAtestiguamientoDictamen(
			AtestiguamientoDictamenTO atestiguamientoDictamenTO) {
		// TODO Auto-generated method stub
		
	}

}
