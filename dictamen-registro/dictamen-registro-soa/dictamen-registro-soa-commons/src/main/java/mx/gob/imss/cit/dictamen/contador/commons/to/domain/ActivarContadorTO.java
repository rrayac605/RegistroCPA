package mx.gob.imss.cit.dictamen.contador.commons.to.domain;

import java.io.Serializable;

public class ActivarContadorTO implements Serializable {

	private static final long serialVersionUID = -8018942495090182538L;
	
	public String getCveIdUsuario() {
		return cveIdUsuario;
	}
	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}
	public String getUrlAcuseNotaria() {
		return urlAcuseNotaria;
	}
	public void setUrlAcuseNotaria(String urlAcuseNotaria) {
		this.urlAcuseNotaria = urlAcuseNotaria;
	}
	public String getNumTramiteNotaria() {
		return numTramiteNotaria;
	}
	public void setNumTramiteNotaria(String numTramiteNotaria) {
		this.numTramiteNotaria = numTramiteNotaria;
	}
	
	public String getDesComentarios() {
		return desComentarios;
	}
	public void setDesComentarios(String desComentarios) {
		this.desComentarios = desComentarios;
	}
	
	private String cveIdUsuario;
    private String urlAcuseNotaria;
    private String numTramiteNotaria;
    private String desComentarios;



}
