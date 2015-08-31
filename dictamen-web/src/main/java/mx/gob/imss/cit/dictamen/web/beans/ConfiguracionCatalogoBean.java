package mx.gob.imss.cit.dictamen.web.beans;


import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.integration.api.dto.TipoCatalogoDTO;
import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.constants.ConfiguracionCatalogosConstants;
import mx.gob.imss.cit.dictamen.web.constants.NavigationConstants;
import mx.gob.imss.cit.dictamen.web.enums.TipoCatalogoEnum;
import mx.gob.imss.cit.dictamen.web.pages.ConfiguracionCatalogoPage;
import mx.gob.imss.cit.dictamen.web.util.CleanBeanUtil;

import org.apache.log4j.Logger;

@ManagedBean(name = "configuracionCatalogoBean")
@ViewScoped
public class ConfiguracionCatalogoBean extends BaseBean {

    /**
     * Serial Version
     */
    private static final long serialVersionUID = 7178170765184986668L;

    private static final Logger LOGGER = Logger.getLogger(ConfiguracionCatalogoBean.class);

    /** The configuracionDocumentoPage. */
    @ManagedProperty(value = "#{configuracionCatalogoPage}")
    private ConfiguracionCatalogoPage configuracionCatalogoPage;


    /** The configuracionDocumentoPage. */
    @ManagedProperty(value = "#{catalogoContadoresBean}")
    private CatalogoContadoresBean catalogoContadoresBean;

    

    //@EJB
    //private TipoDocumentoService tipoDocumentoService;

    
    /**
     * Metodo que inicializa el Bean Configuracion Catalogo
     * 
     */
    public String initConfiguracion() {
        CleanBeanUtil.cleanFields(configuracionCatalogoPage);
        cargarCombos();
        return NavigationConstants.VENTANILLA_CATALOGOS;
    }



    /**
     * Metodo que inicializa los combos del bean
     * 
     */
    private void cargarCombos(){
    	List<TipoCatalogoDTO> catalogos= new ArrayList<TipoCatalogoDTO> ();
    	TipoCatalogoDTO t= new TipoCatalogoDTO();
    	t.setId(TipoCatalogoEnum.CONTADORES.getId());
    	t.setClave(TipoCatalogoEnum.CONTADORES.getClv());
    	t.setDescripcion(TipoCatalogoEnum.CONTADORES.getDesc());
    	catalogos.add(t);
    	
    	t= new TipoCatalogoDTO();
    	t.setId(TipoCatalogoEnum.DESPACHOS.getId());
    	t.setClave(TipoCatalogoEnum.DESPACHOS.getClv());
    	t.setDescripcion(TipoCatalogoEnum.DESPACHOS.getDesc());
    	catalogos.add(t);
    	
    	t= new TipoCatalogoDTO();    	
    	t.setId(TipoCatalogoEnum.COLEGIOS.getId());
    	t.setClave(TipoCatalogoEnum.COLEGIOS.getClv());
    	t.setDescripcion(TipoCatalogoEnum.COLEGIOS.getDesc());
    	catalogos.add(t);    	

    	configuracionCatalogoPage.setListaCatalogos(catalogos);
    	
    }
    
    
    /**
     * Metodo que provee la ruta del catalogo seleccionado
     * 
     */
    
	public String getTipoCatalogoView() {
        String view = null;
        if(configuracionCatalogoPage.getCatalogo()!=null){
	        if (configuracionCatalogoPage.getCatalogo().getClave().equals(TipoCatalogoEnum.CONTADORES.getClv())) {
	        	view= ConfiguracionCatalogosConstants.CATALOGO_CONTADORES;
	        	catalogoContadoresBean.init();
	        }else if (configuracionCatalogoPage.getCatalogo().getClave().equals(TipoCatalogoEnum.DESPACHOS.getClv())) {
	        	view= ConfiguracionCatalogosConstants.CATALOGO_DESPACHOS;
	        }else if (configuracionCatalogoPage.getCatalogo().getClave().equals(TipoCatalogoEnum.COLEGIOS.getClv())) {
	        	view= ConfiguracionCatalogosConstants.CATALOGO_COLEGIOS;
	        }
        }		
        return view;
    }

//    public List<DocumentoTO> getListaDocumentos() {
//        return configuracionDocumentoPage.getDocumentosSeleccionados();
//    }

	public void cambiarTipoConfiguracion() {
        //configuracionDocumentoPage.getTipoDocumento();
        configuracionCatalogoPage.setInicioConfigurado(Boolean.TRUE);
    }

    public String aceptar() {
        return configuracionCatalogoPage.getVentanaAnterior();
    }

    public String regresar() {
        return configuracionCatalogoPage.getVentanaAnterior();
    }
//
//    public DocumentoTO getCatalogo() {
//        DocumentoTO documento = new DocumentoTO();
//        documento.setTipoDocumento(configuracionDocumentoPage.getTipoDocumento());
//        return documento;
//    }

    public void setVentanaAnterior(String ventanaAnterior) {
        configuracionCatalogoPage.setVentanaAnterior(ventanaAnterior);
    }

    
    
    
    // Setters de los ManagedProperty
    public void setConfiguracionDocumentoPage(ConfiguracionCatalogoPage configuracionDocumentoPage) {
        this.configuracionCatalogoPage = configuracionDocumentoPage;
    }

    
    public String getVentanaAnterior(){
        return configuracionCatalogoPage.getVentanaAnterior();
    }
    
    public boolean isInicioConfigurado() {
    	
		return configuracionCatalogoPage.isInicioConfigurado();
	}

	public void setInicioConfigurado(boolean inicioConfigurado) {
		
		configuracionCatalogoPage.setInicioConfigurado(inicioConfigurado);
	}



	public void setConfiguracionCatalogoPage(
			ConfiguracionCatalogoPage configuracionCatalogoPage) {
		this.configuracionCatalogoPage = configuracionCatalogoPage;
	}



	/**
	 * @param catalogoContadoresBean the catalogoContadoresBean to set
	 */
	public void setCatalogoContadoresBean(
			CatalogoContadoresBean catalogoContadoresBean) {
		this.catalogoContadoresBean = catalogoContadoresBean;
	}
    

	
}