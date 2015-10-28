package mx.gob.imss.cit.dictamen.contador.integration.api.dto;

import java.io.Serializable;

public class DocumentoBovedaDTO implements Serializable{

	private static final long serialVersionUID = 9208247094143021588L;
 
	private String folio;
    private String nombre;
    private String documento;
    private String ext;
    private String id;
    private String tipoId;
    private boolean owner;
    

    public String getFolio() {
 		return folio;
 	}
 	public void setFolio(String folio) {
 		this.folio = folio;
 	}
 	public String getNombre() {
 		return nombre;
 	}
 	public void setNombre(String nombre) {
 		this.nombre = nombre;
 	}
 	public String getDocumento() {
 		return documento;
 	}
 	public void setDocumento(String documento) {
 		this.documento = documento;
 	}
 	public String getExt() {
 		return ext;
 	}
 	public void setExt(String ext) {
 		this.ext = ext;
 	}
 	public String getId() {
 		return id;
 	}
 	public void setId(String id) {
 		this.id = id;
 	}
 	public String getTipoId() {
 		return tipoId;
 	}
 	public void setTipoId(String tipoId) {
 		this.tipoId = tipoId;
 	}
 	public boolean isOwner() {
 		return owner;
 	}
 	public void setOwner(boolean owner) {
 		this.owner = owner;
 	}
}
