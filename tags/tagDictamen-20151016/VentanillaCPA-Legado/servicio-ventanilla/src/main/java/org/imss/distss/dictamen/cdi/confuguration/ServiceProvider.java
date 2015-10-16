package org.imss.distss.dictamen.cdi.confuguration;

import javax.ejb.EJB;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;

import mx.gob.imss.distss.dictamen.integration.sample.CatalogoService;
import mx.gob.imss.distss.dictamen.integration.sample.ColegioService;
import mx.gob.imss.distss.dictamen.integration.sample.ContadorPublicoService;
import mx.gob.imss.distss.dictamen.integration.sample.DespachoService;

public class ServiceProvider {
   
	@EJB(lookup="java:global/dictamen-app-1.0-SNAPSHOT/dictamen-integration-1.0-SNAPSHOT/contadorPublicoService!mx.gob.imss.distss.dictamen.integration.sample.ContadorPublicoService")
    private ContadorPublicoService contadorPublicoService;
	
	@EJB(lookup="java:global/dictamen-app-1.0-SNAPSHOT/dictamen-integration-1.0-SNAPSHOT/catalogoService!mx.gob.imss.distss.dictamen.integration.sample.CatalogoService")
    private CatalogoService catalogoService;
	
	@EJB(lookup="java:global/dictamen-app-1.0-SNAPSHOT/dictamen-integration-1.0-SNAPSHOT/colegioService!mx.gob.imss.distss.dictamen.integration.sample.ColegioService")
    private ColegioService colegioService;
	
	@EJB(lookup="java:global/dictamen-app-1.0-SNAPSHOT/dictamen-integration-1.0-SNAPSHOT/despachoService!mx.gob.imss.distss.dictamen.integration.sample.DespachoService")
    private DespachoService despachoService;

    @Produces
    @Default
    public ContadorPublicoService getContadorPublicoService(){
        return contadorPublicoService;
    }
    
    @Produces
    @Default
    public CatalogoService getCatalogoService(){
        return catalogoService;
    }
    
    @Produces
    @Default
    public ColegioService getColegioService(){
        return colegioService;
    }
    
    @Produces
    @Default
    public DespachoService getDespachoService(){
        return despachoService;
    }

}
