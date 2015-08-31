package mx.gob.imss.cit.dictamen.web.pages;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.gob.imss.cit.dictamen.integration.api.dto.TipoCatalogoDTO;
import mx.gob.imss.cit.dictamen.web.pages.base.BasePage;


@ManagedBean(name = "configuracionCatalogoPage")
@SessionScoped
public class ConfiguracionCatalogoPage extends BasePage {

    /**
     * Serial Version
     */
    private static final long serialVersionUID = 4629095845274919106L;

    private List<TipoCatalogoDTO> listaCatalogos;
    
    private TipoCatalogoDTO catalogo;
    
    private boolean inicioConfigurado;

    
    
    
    
    
    
    
	public List<TipoCatalogoDTO> getListaCatalogos() {
		return listaCatalogos;
	}

	public void setListaCatalogos(List<TipoCatalogoDTO> listaCatalogos) {
		this.listaCatalogos = listaCatalogos;
	}

	public TipoCatalogoDTO getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(TipoCatalogoDTO catalogo) {
		this.catalogo = catalogo;
	}

	public boolean isInicioConfigurado() {
		return inicioConfigurado;
	}

	public void setInicioConfigurado(boolean inicioConfigurado) {
		this.inicioConfigurado = inicioConfigurado;
	}
    
}