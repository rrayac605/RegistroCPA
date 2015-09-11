package mx.gob.imss.cit.dictamen.integration.api.dto;

import java.util.List;

import mx.gob.imss.cit.dictamen.integration.api.dto.base.BaseDTO;

public class ParentLayoutDTO extends BaseDTO  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2644866008364925551L;
	
	private String name;
	private List<LayoutDTO> listaLayout;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the listaLayout
	 */
	public List<LayoutDTO> getListaLayout() {
		return listaLayout;
	}
	/**
	 * @param listaLayout the listaLayout to set
	 */
	public void setListaLayout(List<LayoutDTO> listaLayout) {
		this.listaLayout = listaLayout;
	}
	
}
