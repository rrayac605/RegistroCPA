package mx.gob.imss.distss.dictamen.cdi.configuration;

import mx.gob.imss.distss.dictamen.integration.sample.AseveracionService;
import mx.gob.imss.distss.dictamen.integration.sample.EstructuraBase;

import javax.ejb.EJB;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;

public class ServiceProvider {
    @EJB(lookup="java:global/dictamen-app-1.0-SNAPSHOT/dictamen-integration-1.0-SNAPSHOT/aseveracionService!mx.gob.imss.distss.dictamen.integration.sample.AseveracionService")
    private AseveracionService aseveracionService;
    @EJB(lookup="java:global/dictamen-app-1.0-SNAPSHOT/dictamen-integration-1.0-SNAPSHOT/estructuraBaseBusiness!mx.gob.imss.distss.dictamen.integration.sample.EstructuraBase")
    private EstructuraBase  estructuraBase;

    @Produces
    @Default
    public AseveracionService getAseveracionService(){
        return aseveracionService;
    }

    @Produces
    @Default

    public EstructuraBase getEstructuraBase(){
        return estructuraBase;
    }
}
