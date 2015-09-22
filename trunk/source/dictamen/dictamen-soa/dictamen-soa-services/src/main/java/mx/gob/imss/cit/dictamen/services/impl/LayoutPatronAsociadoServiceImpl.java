package mx.gob.imss.cit.dictamen.services.impl;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.AWSPolicyTO;
import mx.gob.imss.cit.dictamen.commons.to.KeyTO;
import mx.gob.imss.cit.dictamen.commons.to.ParentLayoutTO;
import mx.gob.imss.cit.dictamen.commons.util.FechasUtils;
import mx.gob.imss.cit.dictamen.services.AWSService;
import mx.gob.imss.cit.dictamen.services.KeyGeneratorService;
import mx.gob.imss.cit.dictamen.services.LayoutPatronAsociadoService;
import mx.gob.imss.cit.dictamen.services.LayoutService;
import mx.gob.imss.cit.dictamen.services.constants.DictamenServicesConstants;
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
	public List<ParentLayoutTO> findLayoutAWSService(String anioEjercicio, String rfcUsuario, String rfcPatron) {
		List<ParentLayoutTO> listaParents = layoutService.createList();
		KeyTO keyTO;
		try {
			if (listaParents != null) {
				for (ParentLayoutTO parentLayout : listaParents) {
					for (int i = 0; parentLayout.getListaLayout() != null
							&& i < parentLayout.getListaLayout().size(); i++) {
						keyTO = new KeyTO(anioEjercicio, rfcUsuario, rfcPatron,
								parentLayout.getListaLayout().get(i).getName());
						AWSPolicyTO aws = AWSService.getAwsPoliciyEncrypted(
								FechasUtils.agregaDias(new Date(), NUM_DIAS),
								PropertiesConfigUtils
										.getPropertyConfig(DictamenServicesConstants.CONFIG_KEY_AWS_RUTA_BASE)
										+ keyGeneratorService.getKey(keyTO));
						parentLayout.getListaLayout().get(i).setPolicy(aws);
					}
				}
			}
		} catch (DictamenException de) {
			LOG.error(de);
		}
		return listaParents;
	}

}
