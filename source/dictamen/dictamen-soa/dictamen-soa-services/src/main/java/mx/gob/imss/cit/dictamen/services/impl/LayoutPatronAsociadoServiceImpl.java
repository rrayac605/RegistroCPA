package mx.gob.imss.cit.dictamen.services.impl;

import java.text.ParseException;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.AWSPolicyTO;
import mx.gob.imss.cit.dictamen.commons.to.ParentLayoutTO;
import mx.gob.imss.cit.dictamen.commons.util.FechasUtils;
import mx.gob.imss.cit.dictamen.services.AWSService;
import mx.gob.imss.cit.dictamen.services.LayoutPatronAsociadoService;
import mx.gob.imss.cit.dictamen.services.LayoutService;
import mx.gob.imss.cit.dictamen.services.constants.DictamenServicesConstants;
import mx.gob.imss.cit.dictamen.services.util.PropertiesConfigUtils;

import org.apache.log4j.Logger;

@Local
@Stateless
public class LayoutPatronAsociadoServiceImpl implements
		LayoutPatronAsociadoService {

	private static final Logger LOG = Logger
			.getLogger(LayoutPatronAsociadoServiceImpl.class);
	
	
	@EJB
	private LayoutService layoutService;
	
	@EJB
	private AWSService  AWSService;
	
	@Override
	public	List<ParentLayoutTO> findLayoutAWSService() {
		List<ParentLayoutTO> listaParents= layoutService.createList();
		try{
		AWSPolicyTO aws=AWSService.getAwsPoliciyEncrypted(FechasUtils.stringToDate_dd_MM_yyyy("03/09/2015"), PropertiesConfigUtils.getPropertyConfig(DictamenServicesConstants.CONFIG_KEY_AWS_RUTA_BASE));
		
		if(listaParents!=null)
		{
			for(ParentLayoutTO parentLayout:listaParents){
				for(int i=0;parentLayout.getListaLayout()!=null && i<parentLayout.getListaLayout().size();i++){
					parentLayout.getListaLayout().get(i).setPolicy(aws);
				}	
			}
		}
		}catch(DictamenException de){
			LOG.error(de);
		}catch(ParseException px ){
			LOG.error(px);
		}

		return listaParents;
	}
	
}
