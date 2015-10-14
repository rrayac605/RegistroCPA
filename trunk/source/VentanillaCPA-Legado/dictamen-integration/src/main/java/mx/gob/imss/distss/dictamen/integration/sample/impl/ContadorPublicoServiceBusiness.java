package mx.gob.imss.distss.dictamen.integration.sample.impl;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.distss.dictamen.constants.ConstantesEstadosCPA;
import mx.gob.imss.distss.dictamen.integration.sample.ContadorPublicoService;
import mx.gob.imss.distss.dictamen.interfaces.ContadorPublicoDAOLocal;
import mx.gob.imss.distss.dictamen.modelo.dto.NdcEstadoCpaDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.NdvContadorPublicoAutDTO;
import mx.gob.imss.distss.dictamen.modelo.entidad.NdcEstadoCpa;
import mx.gob.imss.distss.dictamen.modelo.entidad.NdtContadorPublicoAut;
import mx.gob.imss.distss.dictamen.modelo.entidad.NdtCpaEstatus;
import mx.gob.imss.distss.dictamen.modelo.entidad.NdvContadorPublicoAut;
import mx.gob.imss.distss.dictamen.table.model.Pagina;
import mx.gob.imss.distss.dictamen.table.model.Paginacion;
import mx.gob.imss.distss.dictamen.table.model.ServiceMapper;

/**
 * Session Bean implementation class ContadorPublicoServiceBusiness
 */
@Stateless(name = "contadorPublicoService", mappedName = "contadorPublicoService")
@Remote(ContadorPublicoService.class)
public class ContadorPublicoServiceBusiness implements ContadorPublicoService {

	@EJB
	private ContadorPublicoDAOLocal contadorPublicoDAOLocal;

	public ContadorPublicoServiceBusiness() {
	}

	public List<NdcEstadoCpaDTO> catalogoEstadoContador() {
		List<NdcEstadoCpa> listaEstadosContador = contadorPublicoDAOLocal
				.catalogoEstadoContador();
		List<NdcEstadoCpaDTO> listaEstadosContadorDTO = ServiceMapper.mapList(
				listaEstadosContador, NdcEstadoCpaDTO.class);
		return listaEstadosContadorDTO;
	}

	@Override
	@SuppressWarnings("unchecked")
	public Pagina<NdvContadorPublicoAutDTO> consultaContador(
			Paginacion paginacion) {
		Pagina<NdvContadorPublicoAut> pagina = contadorPublicoDAOLocal
				.consultaContador(paginacion);
		List<NdvContadorPublicoAutDTO> listaContadorDTO = ServiceMapper
				.mapList(pagina.getRegistros(), paginacion.getClassDTO());
		Pagina<NdvContadorPublicoAutDTO> paginaDTO = new Pagina<NdvContadorPublicoAutDTO>();
		paginaDTO.setRegistros(listaContadorDTO);
		paginaDTO.setTotalRegistros(pagina.getTotalRegistros());
		return paginaDTO;
	}

	@Override
	public void actualizaEstatus(Long numRegistro) {
		// TODO Auto-generated method stub

	}

	@Override
	public synchronized Long actualizaContador(
			NdvContadorPublicoAutDTO ndvContadorPublicoAutDTO,
			String observaciones, Long cveEstatus) {
		Long numRegCPA = null;

		NdtContadorPublicoAut ndtContadorPublicoAut = contadorPublicoDAOLocal
				.consultaContadorIdCPA(ndvContadorPublicoAutDTO.getCveIdCpa());
		ndtContadorPublicoAut.setFecRegistroActualizado(new Date());

		if (cveEstatus.equals(ConstantesEstadosCPA.ACTIVO)) {
			numRegCPA = contadorPublicoDAOLocal.obtieneUltimoNumRegCPA() + 1;
			ndtContadorPublicoAut.setNumRegistroCpa(numRegCPA);
			for (int i = 0; i < ndtContadorPublicoAut
					.getListNdtR1DatosPersonales().size(); i++) {
				if (ndtContadorPublicoAut.getListNdtR1DatosPersonales().get(i)
						.getFecRegistroBaja() == null) {
					ndtContadorPublicoAut
							.getListNdtR1DatosPersonales()
							.get(i)
							.setCveIdSubdelegacion(
									ndvContadorPublicoAutDTO
											.getCveSubdelegacion());
					break;
				}

			}
		}

		NdcEstadoCpa ndcEstadoCpa = new NdcEstadoCpa();
		ndcEstadoCpa.setCveIdEstadoCpa(cveEstatus);
		ndtContadorPublicoAut.setNdcEstadoCpa(ndcEstadoCpa);

		NdtCpaEstatus ndtCpaEstatus = new NdtCpaEstatus();
		ndtCpaEstatus.setNdcEstadoCpa(ndcEstadoCpa);
		ndtCpaEstatus.setCveIdUsuario(ndtContadorPublicoAut.getCveIdUsuario());
		ndtCpaEstatus.setNdtContadorPublicoAut(ndtContadorPublicoAut);
		ndtCpaEstatus.setDesComentarios(observaciones);
		ndtCpaEstatus.setFecAutorizacionRechazo(new Date());

		contadorPublicoDAOLocal.actualizaEstatus(ndtCpaEstatus);
		contadorPublicoDAOLocal.actualizaContador(ndtContadorPublicoAut);
		return numRegCPA;
	}

}
