package mx.gob.imss.cit.dictamen.contador.commons.to.domain.boveda;

import java.io.Serializable;

public class DocumentoTO implements Serializable {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = -8246660336923230507L;
	private String documento;
	private String ext;
	private String folio;
	private String idDocumento;
	private String nombre;

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String value) {
		this.documento = value;
	}

	public String getExt() {
		return ext;
	}

	public void setExt(String value) {
		this.ext = value;
	}

	public String getFolio() {
		return folio;
	}

	public void setFolio(String value) {
		this.folio = value;
	}

	public String getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(String value) {
		this.idDocumento = value;
	}
}