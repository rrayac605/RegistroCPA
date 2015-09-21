package mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class DocumentoPorTipoTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DocumentoTO documento;
	private Long idDocumentoPorTipo;
	private String idDocumentoPorTipoHashed;
	private TipoDocumentoProbatorioTO tipoDocumentoProbatorio;
	/**
	 * @return the documento
	 */
	public DocumentoTO getDocumento() {
		return documento;
	}
	/**
	 * @param documento the documento to set
	 */
	public void setDocumento(DocumentoTO documento) {
		this.documento = documento;
	}
	/**
	 * @return the idDocumentoPorTipo
	 */
	public Long getIdDocumentoPorTipo() {
		return idDocumentoPorTipo;
	}
	/**
	 * @param idDocumentoPorTipo the idDocumentoPorTipo to set
	 */
	public void setIdDocumentoPorTipo(Long idDocumentoPorTipo) {
		this.idDocumentoPorTipo = idDocumentoPorTipo;
	}
	/**
	 * @return the idDocumentoPorTipoHashed
	 */
	public String getIdDocumentoPorTipoHashed() {
		return idDocumentoPorTipoHashed;
	}
	/**
	 * @param idDocumentoPorTipoHashed the idDocumentoPorTipoHashed to set
	 */
	public void setIdDocumentoPorTipoHashed(String idDocumentoPorTipoHashed) {
		this.idDocumentoPorTipoHashed = idDocumentoPorTipoHashed;
	}
	/**
	 * @return the tipoDocumentoProbatorio
	 */
	public TipoDocumentoProbatorioTO getTipoDocumentoProbatorio() {
		return tipoDocumentoProbatorio;
	}
	/**
	 * @param tipoDocumentoProbatorio the tipoDocumentoProbatorio to set
	 */
	public void setTipoDocumentoProbatorio(TipoDocumentoProbatorioTO tipoDocumentoProbatorio) {
		this.tipoDocumentoProbatorio = tipoDocumentoProbatorio;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((documento == null) ? 0 : documento.hashCode());
		result = prime * result + ((idDocumentoPorTipo == null) ? 0 : idDocumentoPorTipo.hashCode());
		result = prime * result + ((idDocumentoPorTipoHashed == null) ? 0 : idDocumentoPorTipoHashed.hashCode());
		result = prime * result + ((tipoDocumentoProbatorio == null) ? 0 : tipoDocumentoProbatorio.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DocumentoPorTipoTO other = (DocumentoPorTipoTO) obj;
		if (documento == null) {
			if (other.documento != null)
				return false;
		} else if (!documento.equals(other.documento))
			return false;
		if (idDocumentoPorTipo == null) {
			if (other.idDocumentoPorTipo != null)
				return false;
		} else if (!idDocumentoPorTipo.equals(other.idDocumentoPorTipo))
			return false;
		if (idDocumentoPorTipoHashed == null) {
			if (other.idDocumentoPorTipoHashed != null)
				return false;
		} else if (!idDocumentoPorTipoHashed.equals(other.idDocumentoPorTipoHashed))
			return false;
		if (tipoDocumentoProbatorio == null) {
			if (other.tipoDocumentoProbatorio != null)
				return false;
		} else if (!tipoDocumentoProbatorio.equals(other.tipoDocumentoProbatorio))
			return false;
		return true;
	}
	
	
}
