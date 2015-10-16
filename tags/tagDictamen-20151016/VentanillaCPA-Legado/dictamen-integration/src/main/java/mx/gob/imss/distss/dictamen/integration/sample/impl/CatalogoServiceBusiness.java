package mx.gob.imss.distss.dictamen.integration.sample.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.distss.dictamen.integration.sample.CatalogoService;
import mx.gob.imss.distss.dictamen.interfaces.CatalogoDAOLocal;
import mx.gob.imss.distss.dictamen.modelo.dto.CatalogoDTO;
import mx.gob.imss.distss.dictamen.modelo.entidad.DicDelegacion;
import mx.gob.imss.distss.dictamen.modelo.entidad.DicSubdelegacion;

/**
 * Session Bean implementation class CatalogoServiceBusiness
 */
@Stateless(name = "catalogoService", mappedName = "catalogoService")
@Remote(CatalogoService.class)
public class CatalogoServiceBusiness implements CatalogoService {

	@EJB
	private CatalogoDAOLocal catalogoDAOLocal;

	@Override
	public List<CatalogoDTO> consultaDelegaciones() {
		List<DicDelegacion> listaDelegacion = catalogoDAOLocal
				.consultaDelegaciones();
		List<CatalogoDTO> listaCatalogo = new ArrayList<CatalogoDTO>();
		for (int i = 0; i < listaDelegacion.size(); i++) {
			listaCatalogo.add(new CatalogoDTO(listaDelegacion.get(i)
					.getClaveDelegacion(), listaDelegacion.get(i).getDesDeleg()));
		}
		return listaCatalogo;
	}

	@Override
	public List<CatalogoDTO> consultaSubdelegacionPorIdDelegacion(
			Long idDelegacion) {
		List<DicSubdelegacion> listaSubDelegacion = catalogoDAOLocal.consultaSubdelegacionPorIdDelegacion(idDelegacion);
		List<CatalogoDTO> listaCatalogo = new ArrayList<CatalogoDTO>();
		for (int i = 0; i < listaSubDelegacion.size(); i++) {
			listaCatalogo.add(new CatalogoDTO(listaSubDelegacion.get(i)
					.getCveIdSubdelegacion().toString(), listaSubDelegacion.get(i).getDesSubdelegacion()));
		}
		return listaCatalogo;
	}

}
