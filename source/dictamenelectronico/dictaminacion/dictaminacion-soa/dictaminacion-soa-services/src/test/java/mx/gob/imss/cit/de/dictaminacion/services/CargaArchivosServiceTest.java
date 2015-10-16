package mx.gob.imss.cit.de.dictaminacion.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.de.dictaminacion.commons.enums.EstadoCargaDocumentoEnum;
import mx.gob.imss.cit.de.dictaminacion.commons.enums.TipoDocumentoEnum;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.AseveracionesTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.CargaDocumentoTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.EstadoCargaDocumentoTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.PatronDictamenTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.TipoDocumentoTO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.base.AbstractDBTestUnit;
import mx.gob.imss.cit.de.dictaminacion.services.CargaArchivosService;
import mx.gob.imss.cit.de.dictaminacion.services.impl.CargaArchivosServiceImpl;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CargaArchivosServiceTest extends AbstractDBTestUnit {
	private Logger LOG=Logger.getLogger(CargaArchivosServiceTest.class);
	
	
	
	private CargaArchivosService cargaArchivosService = new CargaArchivosServiceImpl();

	
	@Before
	public void init() throws Exception {
		super.setUp();
		cargaArchivosService = new CargaArchivosServiceImpl();
		connect(cargaArchivosService);
	}
	

	
	@Test
	public void testRegistraCargaArchivos(){
		CargaDocumentoTO cargaArchivosTO = new CargaDocumentoTO();
		
		AseveracionesTO cveIdAseveracion = new AseveracionesTO();
		PatronDictamenTO cveIdPatronDictamen = new PatronDictamenTO();
		EstadoCargaDocumentoTO cveIdStatusCarga = new EstadoCargaDocumentoTO();
		TipoDocumentoTO cveIdTipoDocumento = new TipoDocumentoTO();
		String cveIdUsuario = "MASC870401GQ8";
		
		cveIdAseveracion.setCveIdAseveracion(1L);
		cveIdPatronDictamen.setCveIdPatronDictamen(63L);
		cveIdStatusCarga.setCveIdEstadoCargoDoc(EstadoCargaDocumentoEnum.ESTATUS_CARGADO.getId());
		cveIdTipoDocumento.setCveIdTipoDocumento(TipoDocumentoEnum.TIPO_DOCUMENTO_ASEVERACIONES.getId());
		
		cargaArchivosTO.setCveIdAseveracion(cveIdAseveracion);		
		cargaArchivosTO.setCveIdPatronDictamen(cveIdPatronDictamen);	
		cargaArchivosTO.setCveIdEstadoCargoDoc(cveIdStatusCarga);		
		cargaArchivosTO.setCveIdTipoDocumento(cveIdTipoDocumento);		
		cargaArchivosTO.setCveIdUsuario(cveIdUsuario);
		cargaArchivosTO.setFecFechaCarga(new Date());
		cargaArchivosTO.setFecRegistroActualizado(new Date());
		cargaArchivosTO.setFecRegistroAlta(new Date());	
		
		boolean salida = false;
		try {			
			salida = cargaArchivosService.registraCargaArchivos(cargaArchivosTO);
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
		}
		Assert.assertTrue(salida);
	}
	
	@Test
	public void findListadoAseveracionesTest(){
		LOG.info("prueba-----------------service");
		List<CargaDocumentoTO> patronalTOList = new ArrayList<CargaDocumentoTO>();
		try{
			patronalTOList = cargaArchivosService.findListadoAseveraciones(63L, 778L, "CIT970206HB6");
			for(CargaDocumentoTO cargaDocumentoTO:patronalTOList){
				LOG.info(cargaDocumentoTO.getCveIdPatronDictamen().getCveIdPatronDictamen());
				LOG.info(cargaDocumentoTO.getCveIdBitacoraCargaAsev());
			}
		}catch (Exception e) {
			LOG.error(e.getMessage());
		}
		Assert.assertNotNull(patronalTOList);
	}
	
	
}
