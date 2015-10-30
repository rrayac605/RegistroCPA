package mx.gob.imss.distss.dictamen.contador.integration.impl;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import org.apache.log4j.Logger;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Document;
import mx.gob.imss.cit.dictamen.contador.commons.to.domain.boveda.DocumentoTO;
import mx.gob.imss.cit.dictamen.contador.commons.to.domain.boveda.TramiteTO;
import mx.gob.imss.cit.dictamen.contador.commons.to.domain.boveda.UsuarioTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.BovedaIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DocumentoBovedaDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.exception.DictamenContadorNegocioException;
import mx.gob.imss.cit.dictamen.contador.services.BovedaService;


@Stateless(name = "bovedaIntegrator", mappedName = "bovedaIntegrator")
@Remote({BovedaIntegrator.class})
public class BovedaIntegratorImpl implements BovedaIntegrator {
	private static final Logger LOGGER=Logger.getLogger(BovedaIntegratorImpl.class);

	@EJB(name="bovedaService", mappedName="bovedaService")
	private BovedaService bovedaService;

	@Override
	public void guardarDocumento(DocumentoBovedaDTO documentoBovedaDTO)
			throws DictamenContadorNegocioException {
		DocumentoTO documentoTO = new DocumentoTO();
		documentoTO.setDocumento(documentoBovedaDTO.getDocumento());
		documentoTO.setNombre(documentoBovedaDTO.getNombre());
		documentoTO.setExt(documentoBovedaDTO.getExt());
		TramiteTO tramiteTO = new TramiteTO();
		tramiteTO.setFolio(documentoBovedaDTO.getFolio());
		UsuarioTO usuarioVO = new UsuarioTO();
		usuarioVO.setId(documentoBovedaDTO.getId());
		usuarioVO.setTipoId(documentoBovedaDTO.getTipoId());
		usuarioVO.setIsOwner(documentoBovedaDTO.isOwner());
		bovedaService.saveDocument(documentoTO, tramiteTO, usuarioVO);
		
	}

	@Override
	public DocumentoBovedaDTO obtenerDocumento(
			DocumentoBovedaDTO documentoBovedaDTO)
			throws DictamenContadorNegocioException {
	
		DocumentoTO documentoTO = new DocumentoTO();
		documentoTO.setDocumento(documentoBovedaDTO.getDocumento());
		documentoTO.setNombre(documentoBovedaDTO.getNombre());
		documentoTO.setExt(documentoBovedaDTO.getExt());
		TramiteTO tramiteTO = new TramiteTO();
		tramiteTO.setFolio(documentoBovedaDTO.getFolio());
		UsuarioTO usuarioVO = new UsuarioTO();
		usuarioVO.setId(documentoBovedaDTO.getId());
		usuarioVO.setTipoId(documentoBovedaDTO.getTipoId());
		usuarioVO.setIsOwner(documentoBovedaDTO.isOwner());
		Document document = bovedaService.getDocumentById(tramiteTO, usuarioVO ,documentoTO);
		if(document!= null){
			documentoBovedaDTO.setDocumento(document.getContent());
			return documentoBovedaDTO;

		}else{
		   return null;
		}
	}

	

	public BovedaService getBovedaService() {
		return bovedaService;
	}

	public void setBovedaService(BovedaService bovedaService) {
		this.bovedaService = bovedaService;
	}
}
