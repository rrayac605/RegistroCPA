/**
 * 
 */
package mx.gob.imss.cit.de.dictaminacion.batch.validation.impl;

import java.util.List;

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
	public List<AtestiguamientoDictamenTO> validaAtesDictamenByPatronDictamen(Long idPatronDictamen, Long idAtestiguamiento) {
		LOG.info("obtienendo Atestiguamientos Dictamen....where idPatronDictamen= "+idPatronDictamen + " and idAtestiguamiento= "+idAtestiguamiento);
		String SQL = "select * from NDT_ATESTIGUAMIENTO_DICTAMEN " +
				"where CVE_ID_PATRON_DICTAMEN =? and CVE_ID_ATESTIGUAMIENTO =?";
		
		List<AtestiguamientoDictamenTO> atestiguamientosDictamenTO = jdbcTemplateObject.query(SQL, 
                   new Object[]{idPatronDictamen,idAtestiguamiento}, new AtestiguamientoDictamenMapper());
	      
	       LOG.info("Atestiguamientos Dictamen econtrados: "+atestiguamientosDictamenTO.size());
		return atestiguamientosDictamenTO;
	}
	
	/**
	 * Actualiza estatus
	 */
	@Override
	public void actualizaEstatus(Long idEstatus,Long idPatronDictamen,Long idAtestiguamiento) {
		String SQL = "update NDT_ATESTIGUAMIENTO_DICTAMEN set cve_id_estado_atestiguamiento = ? where CVE_ID_PATRON_DICTAMEN = ? and CVE_ID_ATESTIGUAMIENTO = ?";
	       jdbcTemplateObject.update(SQL,idEstatus, idPatronDictamen,idAtestiguamiento);
	       
	       LOG.info("Actualizando Estatus de NDT_ATESTIGUAMIENTO_DICTAMEN a = " + idEstatus +" where idPatronDictamen: "+idPatronDictamen+" and CVE_ID_ATESTIGUAMIENTO: "+idAtestiguamiento);
		
	}
	
	/**
	 * Inserta atestiguamiento
	 */
	@Override
	public void insertaAtestiguamientoDictamen(
			AtestiguamientoDictamenTO atsDictamen) {
		String SQL = "insert into NDT_ATESTIGUAMIENTO_DICTAMEN(cve_id_atestig_dictamen,cve_id_patron_dictamen,cve_id_atestiguamiento,fec_registro_alta," +
				"cve_id_usuario,cve_id_estado_atestiguamiento)  " +
				"values(SEQ_NDTATESTIGUAMIENTODICTAMEN.nextVal,?,?,?,?,?)";
	       jdbcTemplateObject.update(SQL,atsDictamen.getIdPatronDictamen(), atsDictamen.getIdAtestiguamiento(),atsDictamen.getRegistroAlta(),
	    		  atsDictamen.getIdUsuario(),atsDictamen.getIdEstadoAtestiguamiento());
	       
	       LOG.info("Insertando Registro en NDT_ATESTIGUAMIENTO_DICTAMEN con idAtestiguamiento= "+atsDictamen.getIdAtestiguamiento());
		
	}


}
