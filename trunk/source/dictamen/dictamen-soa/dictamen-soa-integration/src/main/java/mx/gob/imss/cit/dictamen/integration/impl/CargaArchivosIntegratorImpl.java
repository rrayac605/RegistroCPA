package mx.gob.imss.cit.dictamen.integration.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.commons.to.ParentLayoutTO;
import mx.gob.imss.cit.dictamen.integration.api.CargaArchivosIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.dto.ParentLayoutDTO;
import mx.gob.imss.cit.dictamen.integration.transformer.TransformerIntegrationUtils;
import mx.gob.imss.cit.dictamen.services.LayoutPatronAsociadoService;


@Stateless
@Remote(mx.gob.imss.cit.dictamen.integration.api.CargaArchivosIntegrator.class)
public class CargaArchivosIntegratorImpl implements CargaArchivosIntegrator{
	
	@EJB
	LayoutPatronAsociadoService layoutPatronAsociadoService;
	
	
	public List<ParentLayoutDTO> findLayout(){
		List<ParentLayoutDTO> listaDTO= null;
		
		List<ParentLayoutTO> listaTO= layoutPatronAsociadoService.findLayoutAWSService();
		for(ParentLayoutTO parentLayoutTO:listaTO){
			if(listaDTO== null){
				listaDTO=new ArrayList<ParentLayoutDTO>();				
			}
			listaDTO.add(TransformerIntegrationUtils.transformer(parentLayoutTO));
		}
		
		return listaDTO;
	}
}
