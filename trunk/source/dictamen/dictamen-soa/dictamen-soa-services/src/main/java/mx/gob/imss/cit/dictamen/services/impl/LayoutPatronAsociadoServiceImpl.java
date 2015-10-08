package mx.gob.imss.cit.dictamen.services.impl;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.dictamen.commons.constants.DictamenConstants;
import mx.gob.imss.cit.dictamen.commons.enums.DictamenExceptionCodeEnum;
import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.AWSPolicyTO;
import mx.gob.imss.cit.dictamen.commons.to.KeyTO;
import mx.gob.imss.cit.dictamen.commons.to.ParentLayoutTO;
import mx.gob.imss.cit.dictamen.commons.util.FechasUtils;
import mx.gob.imss.cit.dictamen.services.AWSService;
import mx.gob.imss.cit.dictamen.services.KeyGeneratorService;
import mx.gob.imss.cit.dictamen.services.LayoutPatronAsociadoService;
import mx.gob.imss.cit.dictamen.services.LayoutService;
import mx.gob.imss.cit.dictamen.services.util.DictamenExceptionBuilder;
import mx.gob.imss.cit.dictamen.services.util.PropertiesConfigUtils;

@Local
@Stateless
public class LayoutPatronAsociadoServiceImpl implements LayoutPatronAsociadoService {

	private static final Logger LOG = Logger.getLogger(LayoutPatronAsociadoServiceImpl.class);

	@EJB
	private LayoutService layoutService;

	@EJB
	private AWSService AWSService;

	@EJB
	private KeyGeneratorService keyGeneratorService;

	private static final int NUM_DIAS = 1;

	@Override
	public List<ParentLayoutTO> findLayoutAWSService(String anioEjercicio, String rfcUsuario, String rfcPatron)throws DictamenException {
		List<ParentLayoutTO> listaParents = layoutService.createList();
		
		KeyTO keyTO;
		try {
			LOG.info("iniciando politicas de amazon");
			if (listaParents != null) {
				LOG.info("la lista de grupos de layout es de "+listaParents.size());
				for (ParentLayoutTO parentLayout : listaParents) {
					for (int i = 0; parentLayout.getListaLayout() != null
							&& i < parentLayout.getListaLayout().size(); i++) {
						keyTO = new KeyTO(anioEjercicio, rfcUsuario, rfcPatron,
								parentLayout.getListaLayout().get(i).getName());
						AWSPolicyTO aws = AWSService.getAwsPoliciyEncrypted(
								FechasUtils.agregaDias(new Date(), NUM_DIAS),
								PropertiesConfigUtils
										.getPropertyConfig(DictamenConstants.CONFIG_KEY_AWS_RUTA_BASE)
										+ keyGeneratorService.getKey(keyTO));
						parentLayout.getListaLayout().get(i).setPolicy(aws);
					}
				}
			}
		} catch (Exception de) {
			LOG.error(de.getMessage(),de);
			throw DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_CARGA_ARCHIVOS_GUARDAR,de);
		}
		return listaParents;
	}

	@Override
	public void setLayoutService(LayoutService layoutService) {
		this.layoutService = layoutService;
	}

	@Override
	public void setKeyGeneratorService(KeyGeneratorService keyGeneratorService) {
		this.keyGeneratorService = keyGeneratorService;
	}

	@Override
	public void setAWSService(AWSService aWSService) {
		AWSService = aWSService;
	}		

}
