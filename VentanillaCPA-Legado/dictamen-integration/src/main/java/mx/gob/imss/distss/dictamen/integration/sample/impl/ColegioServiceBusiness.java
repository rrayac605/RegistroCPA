package mx.gob.imss.distss.dictamen.integration.sample.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.distss.dictamen.integration.sample.ColegioService;
import mx.gob.imss.distss.dictamen.interfaces.ColegioDAOLocal;
import mx.gob.imss.distss.dictamen.modelo.dto.NdvColegiosDTO;
import mx.gob.imss.distss.dictamen.modelo.entidad.NdvColegios;
import mx.gob.imss.distss.dictamen.table.model.Pagina;
import mx.gob.imss.distss.dictamen.table.model.Paginacion;
import mx.gob.imss.distss.dictamen.table.model.ServiceMapper;

/**
 * Session Bean implementation class ColegioServiceBusiness
 */
@Stateless(name = "colegioService", mappedName = "colegioService")
@Remote(ColegioService.class)
public class ColegioServiceBusiness implements ColegioService{

	@EJB
	private ColegioDAOLocal colegioDAOLocal;
	
	@Override
	@SuppressWarnings("unchecked")
	public Pagina<NdvColegiosDTO> consultaColegio(Paginacion paginacion) {
		Pagina<NdvColegios> pagina = colegioDAOLocal
				.consultaColegio(paginacion);
		List<NdvColegiosDTO> listaColegioDTO = ServiceMapper
				.mapList(pagina.getRegistros(), paginacion.getClassDTO());
		Pagina<NdvColegiosDTO> paginaDTO = new Pagina<NdvColegiosDTO>();
		paginaDTO.setRegistros(listaColegioDTO);
		paginaDTO.setTotalRegistros(pagina.getTotalRegistros());
		return paginaDTO;
	}

}
