package mx.gob.imss.distss.dictamen.entity;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;

import mx.gob.imss.distss.dictamen.interfaces.AseveracionEntity;
import mx.gob.imss.distss.dictamen.modelo.entidad.NdtA2OtraPrestOtorgada;

/**
 * Session Bean implementation class DatosPatronEntity
 */
@Stateless(name = "aseveracionEntity", mappedName = "aseveracionEntity")
@Local(AseveracionEntity.class)
public class AseveracionEntityDAO  extends GenericDaoImpl<NdtA2OtraPrestOtorgada, Long> implements AseveracionEntity {

    /**
     * Default constructor. 
     */
    public AseveracionEntityDAO() {
		super(NdtA2OtraPrestOtorgada.class);
    }

    
   


	@Override
	public void consulta(String nombreClase) {
		// TODO Auto-generated method stub
		System.out.println("Consultandi objetoooos");
		List lista=this.findAll();
		System.out.println("Toital "+lista.size());
	}

    
}
