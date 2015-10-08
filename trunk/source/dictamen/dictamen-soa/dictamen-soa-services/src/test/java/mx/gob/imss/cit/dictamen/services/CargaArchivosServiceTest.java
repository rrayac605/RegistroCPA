package mx.gob.imss.cit.dictamen.services;

import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import mx.gob.imss.cit.dictamen.commons.enums.EstadoCargaDocumentoEnum;
import mx.gob.imss.cit.dictamen.commons.enums.TipoDocumentoEnum;
import mx.gob.imss.cit.dictamen.commons.to.domain.AseveracionesTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.CargaDocumentoTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.EstadoCargaDocumentoTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.PatronDictamenTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.TipoDocumentoTO;
import mx.gob.imss.cit.dictamen.persistence.dao.base.AbstractDBTestUnit;
import mx.gob.imss.cit.dictamen.services.impl.CargaArchivosServiceImpl;

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
		cveIdStatusCarga.setCveIdStatusCarga(EstadoCargaDocumentoEnum.ESTATUS_CARGADO);
		cveIdTipoDocumento.setCveIdTipoDocumento(TipoDocumentoEnum.TIPO_DOCUMENTO_ASEVERACIONES);
		
		cargaArchivosTO.setCveIdAseveracion(cveIdAseveracion);		
		cargaArchivosTO.setCveIdPatronDictamen(cveIdPatronDictamen);	
		cargaArchivosTO.setCveIdStatusCarga(cveIdStatusCarga);		
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
	
}
