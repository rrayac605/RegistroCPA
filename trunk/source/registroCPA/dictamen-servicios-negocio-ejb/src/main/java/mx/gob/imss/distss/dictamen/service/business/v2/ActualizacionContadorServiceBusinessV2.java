package mx.gob.imss.distss.dictamen.service.business.v2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import mx.gob.imss.distss.dictamen.modelo.dto.NdtContadorPublicoAutDTO;
import mx.gob.imss.distss.dictamen.service.interfaces.v2.ActualizacionContadorServiceRemoteV2;
import mx.gob.imss.distss.dictamen.service.interfaces.v2.ContadorPublicoServiceRemoteV2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

@Stateless(mappedName = "actualizacionContadorServiceBusinessV2", name = "actualizacionContadorServiceBusinessV2")
public class ActualizacionContadorServiceBusinessV2 implements ActualizacionContadorServiceRemoteV2 {
	
	private static final Logger logger = LoggerFactory.getLogger(ActualizacionContadorServiceBusinessV2.class);
	
	@EJB
    ContadorPublicoServiceRemoteV2 contadorPublicoServiceRemoteV2;

	@Override
	@Transactional
	public NdtContadorPublicoAutDTO actualizarContador(NdtContadorPublicoAutDTO ndtContadorPublicoAutSession, NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO) {
		boolean existenCambiosR1;
		boolean existenCambiosR2;
		boolean existenCambiosR3;
		try {
			existenCambiosR1 = validarCambios(ndtContadorPublicoAutSession.getListNdtR1DatosPersonales().get(0), ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0));
			existenCambiosR2 = validarCambios(ndtContadorPublicoAutSession.getListNdtR2Despachos().get(0), ndtContadorPublicoAutDTO.getListNdtR2Despachos().get(0));
			existenCambiosR3 = validarCambios(ndtContadorPublicoAutSession.getListNdtR3Colegios().get(0), ndtContadorPublicoAutDTO.getListNdtR3Colegios().get(0));
			
			if (existenCambiosR1) {
				ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).setCveIdR1DatosPersonales(null);
				ndtContadorPublicoAutSession.getListNdtR1DatosPersonales().get(0).setFecRegistroBaja(new Date());
				
				ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).getListNdtR1Formacontactos().get(0).setCveIdR1Formacontacto(null);
				ndtContadorPublicoAutSession.getListNdtR1DatosPersonales().get(0).getListNdtR1Formacontactos().get(0).setFecRegistroBaja(new Date());
				
				ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).getListNdtR1Formacontactos().get(1).setCveIdR1Formacontacto(null);
				ndtContadorPublicoAutSession.getListNdtR1DatosPersonales().get(0).getListNdtR1Formacontactos().get(1).setFecRegistroBaja(new Date());
				
				if (ndtContadorPublicoAutSession.getListNdtR1DatosPersonales().get(0).getCorreoElectronico().compareTo(
						ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).getCorreoElectronico()) != 0) {
					ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).setExistenCambiosCorreo(true);
				}
				
				if (ndtContadorPublicoAutSession.getListNdtR1DatosPersonales().get(0).getTelefonoFijo().compareTo(
						ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).getTelefonoFijo()) != 0) {
					ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).setExistenCambiosTelefono(true);
				}
				
				ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).setExistenCambiosR1(true);
				ndtContadorPublicoAutSession.getListNdtR1DatosPersonales().get(0).setExistenCambiosR1(true);
			}
			
			if (existenCambiosR2) {
				ndtContadorPublicoAutDTO.getListNdtR2Despachos().get(0).setCveIdR2Despacho(null);
				ndtContadorPublicoAutSession.getListNdtR2Despachos().get(0).setFecRegistroBaja(new Date());
				
				ndtContadorPublicoAutSession.getListNdtR2Despachos().get(0).getListNdtR2Formacontactos().get(0).setFecRegistroBaja(new Date());
				ndtContadorPublicoAutDTO.getListNdtR2Despachos().get(0).getListNdtR2Formacontactos().get(0).setCveIdR2Fcontacto(null);
				
				if (ndtContadorPublicoAutSession.getListNdtR2Despachos().get(0).getTelefonoFijo().compareTo(
						ndtContadorPublicoAutDTO.getListNdtR2Despachos().get(0).getTelefonoFijo()) != 0) {
					ndtContadorPublicoAutDTO.getListNdtR2Despachos().get(0).setExisteCambiosTelefono(false);
				}
				ndtContadorPublicoAutDTO.getListNdtR2Despachos().get(0).setExistenCambiosR2(true);
				ndtContadorPublicoAutSession.getListNdtR2Despachos().get(0).setExistenCambiosR2(true);
			}
			
			if (existenCambiosR3) {
				ndtContadorPublicoAutDTO.getListNdtR3Colegios().get(0).setCveIdR3ColegioXcontador(null);
				ndtContadorPublicoAutSession.getListNdtR3Colegios().get(0).setFecRegistroBaja(new Date());
				
				ndtContadorPublicoAutDTO.getListNdtR3Colegios().get(0).setExistenCambiosR3(true);
				ndtContadorPublicoAutSession.getListNdtR3Colegios().get(0).setExistenCambiosR3(true);
			}
			
			if (existenCambiosR1 || existenCambiosR2 || existenCambiosR3) {
				// Registro del contador actualizado con los datos nuevos en cada uno de sus rubros
				ndtContadorPublicoAutDTO = contadorPublicoServiceRemoteV2.registroContadorPublicoAutorizado(ndtContadorPublicoAutDTO);
				
				// Actualizacion en los campos de fecha de baja en los registros que fueron modificados en cada uno de los rubros
				ndtContadorPublicoAutSession = contadorPublicoServiceRemoteV2.registroContadorPublicoAutorizado(ndtContadorPublicoAutSession);
			}
		} catch (Exception ex) {
			logger.info("ERROR: En el servicio ActualizacionContadorServiceBusinessV2 al actualizar a un contador publico autorizado.", ex);
			ndtContadorPublicoAutDTO = null;
			throw new RuntimeException("ERROR: En el servicio ActualizacionContadorServiceBusinessV2 al actualizar a un contador publico autorizado.", ex);
		}
		return ndtContadorPublicoAutDTO;
	}
	
	public boolean validarCambios(Object objectSesion, Object objectNuevo) {
		boolean existenCambios = false;
		String valor1;
		String valor2;
		try {
			Method[] metodos = objectSesion.getClass().getMethods();
			List<Method> listMethods = new ArrayList<Method>();
			for(int i=0; i < metodos.length; i++) {
				if (metodos[i].getName().contains("get") && 
						(metodos[i].getReturnType().getName().equals("java.lang.String") || 
								metodos[i].getReturnType().getName().equals("java.lang.Long"))) {
					listMethods.add(metodos[i]);
				}
			}
			
			for (Method metodo : listMethods) {				
				valor1 = String.valueOf(metodo.invoke(objectSesion, (Object[])null));
				valor2 = String.valueOf(metodo.invoke(objectNuevo, (Object[])null));
				if (valor1.compareTo(valor2) != 0) {
					existenCambios=true;
					break;
				}
			}
		} catch (Exception ex) {
			logger.info("ERROR: En el servicio ActualizacionContadorServiceBusinessV2 al comprobar si existen cambios entre dos objetos.", ex);
			throw new RuntimeException("ERROR: En el servicio ActualizacionContadorServiceBusinessV2 al comprobar si existen cambios entre dos objetos.", ex);
		}
		return existenCambios;
	}

}
