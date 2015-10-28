package mx.gob.imss.cit.dictamen.contador.services;

import mx.gob.imss.cit.bp.ws.documentows.IDocumentoWSService;
import mx.gob.imss.cit.dictamen.contador.commons.to.domain.boveda.DocumentoTO;
import mx.gob.imss.cit.dictamen.contador.commons.to.domain.boveda.TramiteTO;
import mx.gob.imss.cit.dictamen.contador.commons.to.domain.boveda.UsuarioTO;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Document;

public interface BovedaService {


	void setPort(IDocumentoWSService port);

	 void saveDocument(DocumentoTO documentoTO, TramiteTO tramiteTO,
			UsuarioTO usuarioVO);


	 Document getDocumentById(TramiteTO tramiteVO, UsuarioTO usuarioTO, DocumentoTO documentoVO);


}
