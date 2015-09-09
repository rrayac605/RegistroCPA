package mx.gob.imss.cit.dictamen.integration.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.integration.api.CuestionarioIntegration;
import mx.gob.imss.cit.dictamen.integration.api.dto.CuestionarioDTO;
import mx.gob.imss.cit.dictamen.services.CuestionarioService;
@Stateless
public class CuestionarioIntegrationImpl implements CuestionarioIntegration{

	
	@EJB
	private CuestionarioService cuestionarioService;
	
	@Override
	public List<CuestionarioDTO> findCuestionarios() {
		
		List<CuestionarioDTO> cuestionarios = new ArrayList<CuestionarioDTO>();
		
		CuestionarioDTO a = new CuestionarioDTO();
		CuestionarioDTO b = new CuestionarioDTO();
		CuestionarioDTO c = new CuestionarioDTO();
		CuestionarioDTO d = new CuestionarioDTO();
		CuestionarioDTO e = new CuestionarioDTO();
		CuestionarioDTO f = new CuestionarioDTO();
		CuestionarioDTO g = new CuestionarioDTO();
		CuestionarioDTO h = new CuestionarioDTO();
		CuestionarioDTO i = new CuestionarioDTO();
		CuestionarioDTO j = new CuestionarioDTO();
		
		a.setConcepto("Remuneraciones pagadas en efectivo via nomina a los trabajadores");
		a.setEstado("Completo");
		b.setConcepto("Otras Prestaciones Otorgadas a los trabajadores");
		b.setEstado("Incompleto");
		c.setConcepto("Cuotas obrero patronales enteradas al instituto");
		c.setEstado("Incompleto");
		d.setConcepto("Pago efectuado a personas fisicas");
		d.setEstado("Incompleto");
		e.setConcepto("Prestaciones de Servicio de Personal");
		e.setEstado("Incompleto");
		f.setConcepto("Subcontratacion de servicios de personal");
		f.setEstado("Incompleto");
		g.setConcepto("Clasificacion de empresas");
		g.setEstado("Incompleto");
		h.setConcepto("Balanza de comprobación");
		h.setEstado("Incompleto");
		i.setConcepto("Obras de Construcción");
		i.setEstado("Incompleto");
		j.setConcepto("Otros aspectos a atestiguar");
		j.setEstado("Incompleto");
		
		cuestionarios.add(a);
		cuestionarios.add(b);
		cuestionarios.add(c);
		cuestionarios.add(d);
		cuestionarios.add(e);
		cuestionarios.add(f);
		cuestionarios.add(g);
		cuestionarios.add(h);
		cuestionarios.add(i);
		cuestionarios.add(j);
		
		return cuestionarios;
	}

}
