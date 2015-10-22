package mx.gob.imss.cit.de.dictaminacion.batch.validation.impl;



import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import mx.gob.imss.cit.de.dictaminacion.batch.validation.dao.RutasDAO;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.mapper.RutasMapper;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.enums.TablasEnum;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.scanner.ScanBucket;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.RutaTO;

/**
 * 
 * @author anhernandez
 *
 */
public class RutasDAOImpl implements RutasDAO{
	
	private Logger LOG=Logger.getLogger(RutasDAOImpl.class);
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;   
	  
	  public void setDataSource(DataSource dataSource) {
		  this.dataSource = dataSource;
		  this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	  }
	  
	@Override
	public List<RutaTO> obtieneRutas() {
		LOG.info("Obteniendo rutas.....");
		String SQL = "select EF.des_ejer_fiscal as ANIO_FISCAL,PF.rfc as RFC_CONTADOR,PD.des_rfc as RFC_PATRON," +
				"CD.cve_id_patron_dictamen as ID_DICTAMEN,CD.cve_id_aseveracion as ID_ASEVERACION," +
				"CD.cve_id_bitacora_carga_asev as ID_BITACORA,A.des_tipo_aseveracion as DES_ASEVERACION " +
				"from NDT_PATRON_DICTAMEN PD " +
				"inner join NDT_CARGA_DOCUMENTO CD on CD.cve_id_patron_dictamen=PD.cve_id_patron_dictamen " +
				"inner join NDC_ASEVERACIONES A on CD.cve_id_aseveracion=A.cve_id_aseveracion " +
				"inner join NDC_EJERCICIO_FISCAL EF on EF.cve_id_ejer_fiscal=PD.cve_id_ejer_fiscal " +
				"inner join NDT_PATRON_DICTAMEN_CPA PDCPA on PDCPA.cve_id_patron_dictamen=CD.cve_id_patron_dictamen " +
				"inner join NDT_CONTADOR_PUBLICO_AUT CPA on CPA.cve_id_cpa=PDCPA.cve_id_cpa " +
				"inner join DIT_PERSONA_FISICA PF on PF.cve_id_persona=CPA.cve_id_persona " +
				"where cd.cve_id_estado_cargo_doc=2";
	       List<RutaTO> rutas = jdbcTemplateObject.query(SQL, new RutasMapper());
	      
	       LOG.info("Rutas econtradas: "+rutas.size());

		
		return rutas;
	}
	
	@Override
	public void borrarBitacora(int idBitacora){
		System.out.println("Borrando ditacora");
		String SQL = "delete from NDT_BITACORA_ERRORES where cve_id_bitacora_carga_asev = ?";
	       jdbcTemplateObject.update(SQL, idBitacora);
	       LOG.info("Bitacora eliminada ID = " + idBitacora );
	}
	
	@Override
	public void borrarTablaAseveracion(int idPatronDictamen,int idAseveracion){
		LOG.info("Borrando tabla de aseveracion correspondiente");
		String tabla = "";
		
		for (TablasEnum tmp: TablasEnum.values() ) {
			if(tmp.getId()==idAseveracion){
				tabla=tmp.getTabla();
			}
		}
                    
		String SQL = "delete from "+ tabla +" where cve_id_patron_dictamen = ?";
	       jdbcTemplateObject.update(SQL, idPatronDictamen);
	       LOG.info("Registro eliminado en tabla = " + tabla );
	}
	
	/**
	 * 
	 * @param status
	 * @param idPatronDictamen
	 * @param idAseveracion
	 */
	public void actualizaStatus(int status,int idPatronDictamen,int idAseveracion){
		String SQL = "update NDT_CARGA_DOCUMENTO set cve_id_estado_cargo_doc = ? where cve_id_patron_dictamen = ? and cve_id_aseveracion = ?";
	       jdbcTemplateObject.update(SQL,status, idPatronDictamen,idAseveracion);
	       LOG.info("Status actualiza a = " + status +" de idPatronDictamen: "+idPatronDictamen+" y esev: "+idAseveracion);
	}

}
