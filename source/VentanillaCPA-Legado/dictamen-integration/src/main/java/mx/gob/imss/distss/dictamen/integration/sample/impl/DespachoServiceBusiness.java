package mx.gob.imss.distss.dictamen.integration.sample.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.distss.dictamen.integration.sample.DespachoService;
import mx.gob.imss.distss.dictamen.interfaces.DespachoDAOLocal;
import mx.gob.imss.distss.dictamen.modelo.dto.NdvDespachosDTO;
import mx.gob.imss.distss.dictamen.modelo.entidad.NdvDespachos;
import mx.gob.imss.distss.dictamen.table.model.Pagina;
import mx.gob.imss.distss.dictamen.table.model.Paginacion;
import mx.gob.imss.distss.dictamen.table.model.ServiceMapper;

/**
 * Session Bean implementation class DespachoServiceBusiness
 */
@Stateless(name = "despachoService", mappedName = "despachoService")
@Remote(DespachoService.class)
public class DespachoServiceBusiness implements DespachoService{

	@EJB
	private DespachoDAOLocal despachoDAOLocal; 
	
	@Override
	@SuppressWarnings("unchecked")
	public Pagina<NdvDespachosDTO> consultaDespacho(Paginacion paginacion) {
		Pagina<NdvDespachos> pagina = despachoDAOLocal
				.consultaDespacho(paginacion);
		List<NdvDespachosDTO> listaDespachoDTO = ServiceMapper
				.mapList(pagina.getRegistros(), paginacion.getClassDTO());
		Pagina<NdvDespachosDTO> paginaDTO = new Pagina<NdvDespachosDTO>();
		paginaDTO.setRegistros(listaDespachoDTO);
		paginaDTO.setTotalRegistros(pagina.getTotalRegistros());
		return paginaDTO;
	}


}
