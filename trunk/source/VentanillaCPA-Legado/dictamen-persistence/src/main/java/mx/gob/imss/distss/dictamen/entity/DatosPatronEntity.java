package mx.gob.imss.distss.dictamen.entity;



import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.distss.dictamen.interfaces.DatosPatronEntityRemote;


/**
 * Session Bean implementation class DatosPatronEntity
 */
@Stateless(name = "datosPatronEntity", mappedName = "datosPatronEntity")
@Remote(DatosPatronEntityRemote.class)
public class DatosPatronEntity implements DatosPatronEntityRemote {

	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Default constructor. 
     */
    public DatosPatronEntity() {
        // TODO Auto-generated constructor stub
    	
    }

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Prueba de los EJBS");
	}

}
