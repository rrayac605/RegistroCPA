package mx.gob.imss.cit.dictamen.contador.services;

import java.io.IOException;

import mx.gob.imss.cit.dictamen.contador.commons.to.domain.FirmaDigitalResponseTO;
import mx.gob.imss.cit.dictamen.contador.services.mapper.FirmaDigitalResponseMapper;
import mx.gob.imss.cit.dictamen.contador.services.util.JSONUtil;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

public class FirmaDigitalResponseTest {
	private static final Logger LOGGER = Logger.getLogger(FirmaDigitalResponseTest.class);

   @Test
   public void marshall(){
	 String firma="{\"acuse\":\"http://firmadigitalqa.imss.gob.mx/reader/view/visualizadorcomprobantes/mostrarComprobante?id=dafd6f7a-316b-4ec9-8715-c29632271f7a\",\"Resultado\":0,\"curp_rl\":\"\",\"serie_cert\":\"00001000000101921366\",\"folio\":\"dafd6f7a-316b-4ec9-8715-c29632271f7a\",\"rfc\":\"FOVM830211446\",\"curp\":\"FOVM830211HDFLLR01\",\"rfc_rl\":\"\"}";
	
	 firma="{\"Resultado\":0}";

	 FirmaDigitalResponseMapper firmad = (FirmaDigitalResponseMapper)JSONUtil.unmarshall(firma, FirmaDigitalResponseMapper.class.getName());
	 LOGGER.info("acuse= "+firmad.getAcuse());
	 LOGGER.info("resultado= "+firmad.getResultado());

   }
}
