/**
 * 
 */
package mx.gob.imss.cit.de.dictaminacion.batch.validation.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.AtestiguamientoDictamenTO;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.AtestiguamientoTO;

import org.springframework.jdbc.core.RowMapper;

/**
 * @author anhernandez
 *
 */
public class AtestiguamientoDictamenMapper implements RowMapper<AtestiguamientoDictamenTO>{


	@Override
	public AtestiguamientoDictamenTO mapRow(ResultSet rs, int arg1)
			throws SQLException {
		AtestiguamientoDictamenTO atestiguamientoDictamenTO=new AtestiguamientoDictamenTO();
		atestiguamientoDictamenTO.setIdAtestigDictamen(rs.getLong("cve_id_atestig_dictamen"));
		atestiguamientoDictamenTO.setIdPatronDictamen(rs.getLong("cve_id_patron_dictamen"));
		atestiguamientoDictamenTO.setRegistroAlta(rs.getDate("fec_registro_alta"));
		atestiguamientoDictamenTO.setRegistroBaja(rs.getDate("fec_registro_baja"));
		atestiguamientoDictamenTO.setRegistroActualizado(rs.getDate("fec_registro_actualizado"));
		atestiguamientoDictamenTO.setIdUsuario(rs.getString("cve_id_usuario"));
		atestiguamientoDictamenTO.setIdEstadoAtestiguamiento(rs.getLong("cve_id_estado_atestiguamiento"));
		
		return atestiguamientoDictamenTO;
	}

}
