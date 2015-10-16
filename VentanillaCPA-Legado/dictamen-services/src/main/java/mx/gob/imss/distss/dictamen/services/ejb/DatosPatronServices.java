package mx.gob.imss.distss.dictamen.services.ejb;

import javax.ejb.Stateless;

import mx.gob.imss.distss.dictamen.services.interfaces.DatosPatronServicesLocal;

/**
 * Session Bean implementation class DatosPatronServices
 */
@Stateless(name = "datosPatronServices", mappedName = "datosPatronServices")
public class DatosPatronServices implements DatosPatronServicesLocal {

    /**
     * Default constructor. 
     */
    public DatosPatronServices() {
        // TODO Auto-generated constructor stub
    }

}
