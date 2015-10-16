package org.imss.distss.dictamen.dataModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import mx.gob.imss.distss.dictamen.integration.sample.ColegioService;
import mx.gob.imss.distss.dictamen.modelo.dto.NdvColegiosDTO;
import mx.gob.imss.distss.dictamen.modelo.entidad.NdvColegios;
import mx.gob.imss.distss.dictamen.table.model.Pagina;
import mx.gob.imss.distss.dictamen.table.model.Paginacion;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

public class LazyColegioDataModel extends LazyDataModel<NdvColegiosDTO>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3483845130570156154L;
	
	@Inject
	private ColegioService colegioService;

	private List<NdvColegiosDTO> datasource;

	@Override
	public NdvColegiosDTO getRowData(String rowKey) {
		for (NdvColegiosDTO ndvColegiosDTO : datasource) {
			if (ndvColegiosDTO.getCveIdColegio().equals(rowKey))
				return ndvColegiosDTO;
		}

		return null;
	}

	@Override
	public Object getRowKey(NdvColegiosDTO ndvColegiosDTO) {
		return ndvColegiosDTO.getCveIdColegio();
	}

	@Override
	public List<NdvColegiosDTO> load(int first, int pageSize,
			String sortField, SortOrder sortOrder, Map<String, String> filters) {
		
		List<NdvColegiosDTO> data = new ArrayList<NdvColegiosDTO>();
		
		Paginacion paginacion = new Paginacion(NdvColegios.class, NdvColegiosDTO.class, first, pageSize, filters, null);
		Pagina<NdvColegiosDTO> pagina = colegioService.consultaColegio(paginacion);
		data = pagina.getRegistros();
		this.setRowCount(pagina.getTotalRegistros());
		return data;
	}

}
