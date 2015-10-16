package mx.gob.imss.cit.de.dictaminacion.commons.to;

import java.util.List;

import mx.gob.imss.cit.de.dictaminacion.commons.to.base.BaseTO;

public class ParentLayoutTO extends BaseTO  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2644866008364925551L;
	
	private String name;
	private List<LayoutTO> listaLayout;
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
	public List<LayoutTO> getListaLayout() {
		return listaLayout;
	}
	/**
	 * @param listaLayout the listaLayout to set
	 */
	public void setListaLayout(List<LayoutTO> listaLayout) {
		this.listaLayout = listaLayout;
	}
	
}
