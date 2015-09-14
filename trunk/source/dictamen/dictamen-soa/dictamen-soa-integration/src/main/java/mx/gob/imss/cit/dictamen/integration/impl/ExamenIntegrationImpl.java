package mx.gob.imss.cit.dictamen.integration.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.integration.api.ExamenIntegration;
import mx.gob.imss.cit.dictamen.integration.api.dto.ExamenDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.PreguntaDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.RespuestaDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.SeccionDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.TipoPreguntaDTO;
import mx.gob.imss.cit.dictamen.services.ExamenService;

@Stateless
@Remote(mx.gob.imss.cit.dictamen.integration.api.ExamenIntegration.class)
public class ExamenIntegrationImpl implements ExamenIntegration{

	//@EJB
	//private ExamenService examenService;
	
	@Override
	public List<ExamenDTO> findExamen() {
		List<ExamenDTO> examenes = new ArrayList<ExamenDTO>();
		
		ExamenDTO   examen     = new ExamenDTO();
		SeccionDTO  seccion0   = new SeccionDTO();
		SeccionDTO  seccion1   = new SeccionDTO();
		SeccionDTO  seccion2   = new SeccionDTO();
		PreguntaDTO pregunta00 = new PreguntaDTO();
		PreguntaDTO pregunta11 = new PreguntaDTO();
		PreguntaDTO pregunta21 = new PreguntaDTO();
		PreguntaDTO pregunta22 = new PreguntaDTO();
		TipoPreguntaDTO tipo111= new TipoPreguntaDTO();
	    RespuestaDTO respuesta1= new RespuestaDTO();
	    RespuestaDTO respuesta2= new RespuestaDTO();
	    RespuestaDTO respuesta3= new RespuestaDTO();
	    
	    respuesta1.setClave(1);
	    respuesta1.setRespuesta("Si");
	    
	    respuesta2.setClave(2);
	    respuesta2.setRespuesta("No");
	    
	    respuesta3.setClave(3);
	    respuesta3.setRespuesta("No aplica");
	    
	    tipo111.setClave(1);
	    tipo111.setTipo("RadioButton");
	    
		pregunta00.setClave(1);
		pregunta00.setHabilitaPregunta(true);
		pregunta00.setHabilitaComentario(true);
		pregunta00.setPregunta("¿El contador público autorizado obtuvo la evidencia comprobatoria suficiente para realizar el  examen y atestiguamiento de este módulo?");
		List<RespuestaDTO> respuesta = new ArrayList<RespuestaDTO>();
		respuesta.add(respuesta1);
		respuesta.add(respuesta2);
		respuesta.add(respuesta3);
		pregunta00.setRespuestas(respuesta);
		
		pregunta11.setClave(2);
		pregunta11.setHabilitaPregunta(true);
		pregunta11.setHabilitaComentario(true);
		pregunta11.setPregunta("a) ¿Los gastos ejercidos por la entrega a los trabajadores de instrumentos de trabajo tales como herramientas, ropa u otros similares se encuentran debidamente registrados en la contabilidad del patrón?");
		pregunta11.setRespuestas(respuesta);
		
		pregunta21.setClave(3);
		pregunta21.setHabilitaPregunta(true);
		pregunta21.setHabilitaComentario(true);
		pregunta21.setPregunta("a) ¿Las cantidades otorgadas para fines sociales son de carácter sindical?");
		pregunta21.setRespuestas(respuesta);
		
		pregunta22.setClave(3);
		pregunta22.setHabilitaPregunta(true);
		pregunta22.setHabilitaComentario(true);
		pregunta22.setPregunta("b) ¿Las cantidades otorgadas para fines sociales de carácter sindical se apegan a lo dispuesto en el criterio normativo 001/14?");
		pregunta22.setRespuestas(respuesta);
		
		
		seccion0.setClave(1);
		seccion0.setHabilitaSeccion(true);
		seccion0.setSeccion("");
		List<PreguntaDTO> preguntasseccion0 = new ArrayList<PreguntaDTO>();
		preguntasseccion0.add(pregunta00);
		seccion0.setPreguntas(preguntasseccion0);
		
		
		seccion1.setClave(2);
		seccion1.setHabilitaSeccion(true);
		seccion1.setSeccion("Instrumentos de trabajo");
		List<PreguntaDTO> preguntasseccion1 = new ArrayList<PreguntaDTO>();
		preguntasseccion1.add(pregunta11);
		seccion1.setPreguntas(preguntasseccion1);
		
		
		seccion2.setClave(2);
		seccion2.setHabilitaSeccion(true);
		seccion2.setSeccion("Cantidades aportadas para fines sociales");
		List<PreguntaDTO> preguntasseccion2 = new ArrayList<PreguntaDTO>();
		preguntasseccion2.add(pregunta21);
		preguntasseccion2.add(pregunta22);
		seccion2.setPreguntas(preguntasseccion2);
		
		examen.setClave(1);
		examen.setExamen("Remuneraciones pagadas en efectivo via nomina a los trabajadores");
		List<SeccionDTO> seccionesExamen1 = new ArrayList<SeccionDTO>();
		seccionesExamen1.add(seccion0);
		seccionesExamen1.add(seccion1);
		seccionesExamen1.add(seccion2);
		
		examen.setSecciones(seccionesExamen1);
		
		examenes.add(examen);
		
		return examenes;
	}

}
