package mx.gob.imss.cit.dictamen.integration.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.integration.api.InformacionPatronalIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.dto.InformacionPatronalDTO;

@Stateless
@Remote(mx.gob.imss.cit.dictamen.integration.api.InformacionPatronalIntegrator.class)

public class InformacionPatronalIntegratorImpl implements
		InformacionPatronalIntegrator {

	@Override
	public List<InformacionPatronalDTO> findListaAseveraciones() {
		List<InformacionPatronalDTO> listadoAseveraciones = new ArrayList<InformacionPatronalDTO>();

		InformacionPatronalDTO a = new InformacionPatronalDTO("Remuneraciones pagadas en efectivo via nomina a los trabajadores", "Archivo1", 1, 2, 3, 43);
		InformacionPatronalDTO b = new InformacionPatronalDTO("Otras Prestaciones Otorgadas a los trabajadores", "Archivo1", 1, 2, 3, 43);
		InformacionPatronalDTO c = new InformacionPatronalDTO("Cuotas obrero patronales enteradas al instituto", "Archivo1",1, 2, 3, 43);
		InformacionPatronalDTO d = new InformacionPatronalDTO("Pago efectuado a personas fisicas", "Archivo1", 1, 2, 3, 43);
		InformacionPatronalDTO e = new InformacionPatronalDTO("Prestaciones de Servicio de Personal", "Archivo1", 1, 2, 3, 43);
		InformacionPatronalDTO f = new InformacionPatronalDTO("Subcontratacion de servicios de personal", "Archivo1", 1, 2, 3, 43);
		InformacionPatronalDTO g = new InformacionPatronalDTO("Clasificacion de empresas", "Archivo1", 1, 2, 3, 43);
		InformacionPatronalDTO h = new InformacionPatronalDTO("Balanza de comprobación", "Archivo1", 1, 2, 3, 43);
		InformacionPatronalDTO i = new InformacionPatronalDTO("Obras de Construcción", "Archivo1", 1, 2, 3, 43);
		InformacionPatronalDTO j = new InformacionPatronalDTO("Otros aspectos a atestiguar", "Archivo1", 1, 2, 3, 43);

		listadoAseveraciones.add(a);
		listadoAseveraciones.add(b);
		listadoAseveraciones.add(c);
		listadoAseveraciones.add(d);
		listadoAseveraciones.add(e);
		listadoAseveraciones.add(f);
		listadoAseveraciones.add(g);
		listadoAseveraciones.add(h);
		listadoAseveraciones.add(i);
		listadoAseveraciones.add(j);

		return listadoAseveraciones;
	}

}