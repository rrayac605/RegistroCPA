package mx.gob.imss.cit.dictamen.contador.services.impl;

import javax.ejb.Stateless;

import org.apache.commons.lang.StringUtils;

import mx.gob.imss.cit.dictamen.contador.integration.api.dto.ContadorPublicoDTO;
import mx.gob.imss.cit.dictamen.contador.services.ContadorAutenticadoService;

/**
 * Clase que implementa la interface de {@link ContadorAutenticadoService}
 * @author lramirez
 *
 */
@Stateless
public class ContadorAutenticadoServiceImpl implements
		ContadorAutenticadoService {

	@Override
	public boolean validarSesionContador(String rfc, String curp) {
		return StringUtils.isNotBlank(curp)
				&& StringUtils.isNotBlank(rfc);
	}
	
	@Override
	public int validarContadorAutenticado(ContadorPublicoDTO contadorAut){
		
		if(contadorAut==null){
			return 1;
		} else {
			if(contadorAut.getCveIdEstadoCPA() == 14L){
				return 2;
			}
			// TODO anexar validaciones de contador publico autenticado
		}
		return 0;
	}

}
