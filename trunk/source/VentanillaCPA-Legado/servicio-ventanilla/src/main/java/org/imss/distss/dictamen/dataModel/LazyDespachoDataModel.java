package org.imss.distss.dictamen.dataModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import mx.gob.imss.distss.dictamen.integration.sample.DespachoService;
import mx.gob.imss.distss.dictamen.modelo.dto.NdvDespachosDTO;
import mx.gob.imss.distss.dictamen.modelo.entidad.NdvContadorPublicoAut;
import mx.gob.imss.distss.dictamen.table.model.Pagina;
import mx.gob.imss.distss.dictamen.table.model.Paginacion;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

public class LazyDespachoDataModel extends LazyDataModel<NdvDespachosDTO>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6030841731168737603L;
	
	@Inject
	private DespachoService despachoService;

	private List<NdvDespachosDTO> datasource;

	@Override
	public NdvDespachosDTO getRowData(String rowKey) {
		for (NdvDespachosDTO ndvDespachosDTO : datasource) {
			if (ndvDespachosDTO.getCveIdDespacho().equals(rowKey))
				return ndvDespachosDTO;
		}

		return null;
	}

	@Override
	public Object getRowKey(NdvDespachosDTO ndvDespachosDTO) {
		return ndvDespachosDTO.getCveIdDespacho();
	}

	@Override
	public List<NdvDespachosDTO> load(int first, int pageSize,
			String sortField, SortOrder sortOrder, Map<String, String> filters) {
		
		List<NdvDespachosDTO> data = new ArrayList<NdvDespachosDTO>();
		
		Paginacion paginacion = new Paginacion(NdvContadorPublicoAut.class, NdvDespachosDTO.class, first, pageSize, filters, null);
		Pagina<NdvDespachosDTO> pagina = despachoService.consultaDespacho(paginacion);
		data = pagina.getRegistros();
		this.setRowCount(pagina.getTotalRegistros());
		return data;
	}

}
