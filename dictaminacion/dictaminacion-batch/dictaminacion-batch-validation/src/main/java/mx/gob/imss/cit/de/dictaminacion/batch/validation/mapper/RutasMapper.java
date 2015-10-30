package mx.gob.imss.cit.de.dictaminacion.batch.validation.mapper;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.RutaTO;

/**
 * 
 * @author anhernandez
 *
 */
public class RutasMapper implements RowMapper<RutaTO>{

	@Override
	public RutaTO mapRow(ResultSet rs, int arg1) throws SQLException {
		RutaTO datosRuta = new RutaTO();
			datosRuta.setAnioFiscal(rs.getString("ANIO_FISCAL"));
			datosRuta.setRfcContador(rs.getString("RFC_CONTADOR"));
			datosRuta.setRfcPatron(rs.getString("RFC_PATRON"));
			datosRuta.setCveIdAseveracion(rs.getLong("ID_ASEVERACION"));
			datosRuta.setCveIdPatronDictamen(rs.getLong("ID_DICTAMEN"));
			datosRuta.setIdBitacora(rs.getLong("ID_BITACORA"));
			datosRuta.setDesAseveracion(rs.getString("DES_ASEVERACION"));
			datosRuta.setIdAseveracionPadre(rs.getLong("PADRE"));
			datosRuta.setRuta("C:\\DictamenFiles\\Proceso\\"+datosRuta.getAnioFiscal()+"\\"
					+datosRuta.getRfcContador()+"\\"+datosRuta.getRfcPatron()+"\\"
					+datosRuta.getCveIdAseveracion()+"."+datosRuta.getDesAseveracion()+".txt");      
		  return datosRuta;
		  
	}
}
