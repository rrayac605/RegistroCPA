package org.imss.distss.dictamen.dataModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import mx.gob.imss.distss.dictamen.integration.sample.ContadorPublicoService;
import mx.gob.imss.distss.dictamen.modelo.dto.NdvContadorPublicoAutDTO;
import mx.gob.imss.distss.dictamen.modelo.entidad.NdvContadorPublicoAut;
import mx.gob.imss.distss.dictamen.table.model.Pagina;
import mx.gob.imss.distss.dictamen.table.model.Paginacion;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

public class LazyContadorDataModel extends
		LazyDataModel<NdvContadorPublicoAutDTO> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private ContadorPublicoService contadorPublicoService;

	private List<NdvContadorPublicoAutDTO> datasource;

	@Override
	public NdvContadorPublicoAutDTO getRowData(String rowKey) {
		for (NdvContadorPublicoAutDTO ndvContadorPublicoAutDTO : datasource) {
			if (ndvContadorPublicoAutDTO.getNumRegistroCpa().equals(rowKey))
				return ndvContadorPublicoAutDTO;
		}

		return null;
	}

	@Override
	public Object getRowKey(NdvContadorPublicoAutDTO ndvContadorPublicoAutDTO) {
		return ndvContadorPublicoAutDTO.getNumRegistroCpa();
	}

	@Override
	public List<NdvContadorPublicoAutDTO> load(int first, int pageSize,
			String sortField, SortOrder sortOrder, Map<String, String> filters) {
		
		List<NdvContadorPublicoAutDTO> data = new ArrayList<NdvContadorPublicoAutDTO>();
		
		Paginacion paginacion = new Paginacion(NdvContadorPublicoAut.class, NdvContadorPublicoAutDTO.class, first, pageSize, filters, null);

		Pagina<NdvContadorPublicoAutDTO> pagina = contadorPublicoService.consultaContador(paginacion);
		data = pagina.getRegistros();
		this.setRowCount(pagina.getTotalRegistros());
		return data;
	}

}
