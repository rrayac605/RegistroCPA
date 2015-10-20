package mx.gob.imss.distss.dictamen.contador.integration.impl;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.contador.integration.api.SolicitudRegistroIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.ContadorPublicoAutDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DomicilioDTO;

@Stateless
public class SolicitudRegistroServiceIntegrator implements
		SolicitudRegistroIntegrator {

	@Override
	public ContadorPublicoAutDTO obtenerContadorPublicoAutDTO(String curp) {
		
		ContadorPublicoAutDTO contador = new ContadorPublicoAutDTO();
		contador.setCurp(curp);
		contador.setNombre("Ascencion Rivera Velasquez");
		contador.setRfc("RIVA890228RN4");
		contador.setDomicilio(new DomicilioDTO());
		contador.getDomicilio().setCalle("REFORMA");
		contador.getDomicilio().setCodigoPostal("90109");
		contador.getDomicilio().setColonia("Colonia Test");
		contador.getDomicilio().setEmail("email@test.com");
		contador.getDomicilio().setEntidad("Veracruz");
		contador.getDomicilio().setEntreCalle("Test 1");
		contador.getDomicilio().setLocalidad("Localidad Test");
		contador.getDomicilio().setMunicipio("Municipio Test");
		contador.getDomicilio().setNumExterior("24");
		contador.getDomicilio().setNumInterior("8");
		contador.getDomicilio().setTelefono("9876543210");
		contador.getDomicilio().setyCalle("Test 2");
		
		// TODO Auto-generated method stub
		return contador;
	}

}
