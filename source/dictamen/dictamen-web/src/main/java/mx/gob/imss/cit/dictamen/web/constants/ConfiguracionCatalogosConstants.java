package mx.gob.imss.cit.dictamen.web.constants;

public final class ConfiguracionCatalogosConstants {
    
    private ConfiguracionCatalogosConstants() {
        super();
    }
    
    private static final String RUTA_CONFIGURACION = "/views/ventanilla/catalogos/";
    
    private static final String CONTADORES="contadores/";
    
    private static final String COLEGIOS="colegios/";
    
    private static final String DESPACHOS="despachos/";
    
    
     public static final String CATALOGO_CONTADORES = RUTA_CONFIGURACION + CONTADORES + "contadores.xhtml";
    
     public static final String CATALOGO_COLEGIOS = RUTA_CONFIGURACION + COLEGIOS + "colegios.xhtml";
     
     public static final String CATALOGO_DESPACHOS = RUTA_CONFIGURACION + DESPACHOS + "despachos.xhtml";
     
}