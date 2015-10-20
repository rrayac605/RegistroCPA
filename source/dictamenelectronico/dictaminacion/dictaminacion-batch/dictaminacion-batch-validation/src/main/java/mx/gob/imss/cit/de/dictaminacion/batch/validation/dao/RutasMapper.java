package mx.gob.imss.cit.de.dictaminacion.batch.validation.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.RutaTO;

public class RutasMapper implements RowMapper<RutaTO>{

	public RutaTO mapRow(ResultSet rs, int arg1) throws SQLException {
		RutaTO ruta = new RutaTO();
			ruta.setRuta("Dictamenfiles/proceso/"+rs.getString("ANIO_FISCAL")+"/"+rs.getString("RFC_CONTADOR")+"/"+rs.getString("RFC_PATRON"));      
		  return ruta;
		 }
}
