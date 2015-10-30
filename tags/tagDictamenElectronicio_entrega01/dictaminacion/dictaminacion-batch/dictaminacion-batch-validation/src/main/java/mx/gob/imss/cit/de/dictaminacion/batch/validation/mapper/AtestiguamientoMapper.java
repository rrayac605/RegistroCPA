package mx.gob.imss.cit.de.dictaminacion.batch.validation.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.AtestiguamientoTO;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.RutaTO;

import org.springframework.jdbc.core.RowMapper;

public class AtestiguamientoMapper implements RowMapper<AtestiguamientoTO>{

	@Override
	public AtestiguamientoTO mapRow(ResultSet rs, int arg1)throws SQLException {
		
		AtestiguamientoTO atestiguamientoTO=new AtestiguamientoTO();
		
		atestiguamientoTO.setIdAtestiguamiento(rs.getLong("cve_id_atestiguamiento"));
		atestiguamientoTO.setIdAseveracion(rs.getLong("cve_id_aseveracion"));
		atestiguamientoTO.setOrden(rs.getLong("ind_orden"));
		atestiguamientoTO.setDesAtestiguamiento(rs.getString("des_atestiguamiento"));
		atestiguamientoTO.setRegistroAlta(rs.getDate("fec_registro_alta"));
		atestiguamientoTO.setRegistroActualizado(rs.getDate("fec_registro_actualizado"));
		atestiguamientoTO.setRegistroBaja(rs.getDate("fec_registro_baja"));
		
		return atestiguamientoTO;
	}

}
