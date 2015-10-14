package mx.gob.imss.distss.dictamen.integration.sample.impl;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.distss.dictamen.integration.sample.AseveracionService;
import mx.gob.imss.distss.dictamen.interfaces.AseveracionDAOLocal;
import mx.gob.imss.distss.dictamen.model.abstr.AbstractModel;
import mx.gob.imss.distss.dictamen.table.model.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;
import java.util.Map;


@Stateless(name = "aseveracionService", mappedName = "aseveracionService")
@Remote(AseveracionService.class)
public class AseveracionServiceBusiness implements AseveracionService {

	private static final Log LOGGER= LogFactory.getLog(AseveracionServiceBusiness.class);

	@EJB
	private AseveracionDAOLocal<AbstractModel> aseveracionDAOLocal;

	@Override
	public Pagina<AbstractModel> getPagina(Paginacion paginacion) {
		try {
			Pagina<AbstractModel> pagina=aseveracionDAOLocal.getPagina(paginacion);
            LOGGER.debug("convirtiendo entidades a dto's ...");
            /*cambio de entidades a dto's por convencion se requiere que la clase
            * DTO de la entidad tenga el mismo nombre mas el sufijo 'DTO' */
			pagina.setRegistros(
					ServiceMapper.mapList(pagina.getRegistros(),paginacion.getClassDTO())
			);
			return pagina;
		} catch (Exception ex) {
			ex.printStackTrace();
			LOGGER.error("error al intentar consultar pagina",ex);
		}
		return null;
	}

    @Override
    public Map<String, Double> getSumatoria(DescriptorTabla descriptorTabla) {
         return aseveracionDAOLocal.getSumatoria(descriptorTabla);
    }

}
