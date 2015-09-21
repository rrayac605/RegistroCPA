package mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio;

import java.util.Date;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.MunicipioTO;

public class CURPTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long anioRegistro;
	private String crip;
	private String curp;
	private String descripcionTipoDocumento;
	private Date fechaInscripcion;
	private MunicipioTO municipio;
	private String noActa;
	private String noFoja;
	private String noLibro;
	private String noTomo;
	private String numFolioExtranjero;
	private String numTipoDocumento;
	private String refFolio;
	/**
	 * @return the anioRegistro
	 */
	public Long getAnioRegistro() {
		return anioRegistro;
	}
	/**
	 * @param anioRegistro the anioRegistro to set
	 */
	public void setAnioRegistro(Long anioRegistro) {
		this.anioRegistro = anioRegistro;
	}
	/**
	 * @return the crip
	 */
	public String getCrip() {
		return crip;
	}
	/**
	 * @param crip the crip to set
	 */
	public void setCrip(String crip) {
		this.crip = crip;
	}
	/**
	 * @return the curp
	 */
	public String getCurp() {
		return curp;
	}
	/**
	 * @param curp the curp to set
	 */
	public void setCurp(String curp) {
		this.curp = curp;
	}
	/**
	 * @return the descripcionTipoDocumento
	 */
	public String getDescripcionTipoDocumento() {
		return descripcionTipoDocumento;
	}
	/**
	 * @param descripcionTipoDocumento the descripcionTipoDocumento to set
	 */
	public void setDescripcionTipoDocumento(String descripcionTipoDocumento) {
		this.descripcionTipoDocumento = descripcionTipoDocumento;
	}
	/**
	 * @return the fechaInscripcion
	 */
	public Date getFechaInscripcion() {
		return fechaInscripcion;
	}
	/**
	 * @param fechaInscripcion the fechaInscripcion to set
	 */
	public void setFechaInscripcion(Date fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}
	/**
	 * @return the municipio
	 */
	public MunicipioTO getMunicipio() {
		return municipio;
	}
	/**
	 * @param municipio the municipio to set
	 */
	public void setMunicipio(MunicipioTO municipio) {
		this.municipio = municipio;
	}
	/**
	 * @return the noActa
	 */
	public String getNoActa() {
		return noActa;
	}
	/**
	 * @param noActa the noActa to set
	 */
	public void setNoActa(String noActa) {
		this.noActa = noActa;
	}
	/**
	 * @return the noFoja
	 */
	public String getNoFoja() {
		return noFoja;
	}
	/**
	 * @param noFoja the noFoja to set
	 */
	public void setNoFoja(String noFoja) {
		this.noFoja = noFoja;
	}
	/**
	 * @return the noLibro
	 */
	public String getNoLibro() {
		return noLibro;
	}
	/**
	 * @param noLibro the noLibro to set
	 */
	public void setNoLibro(String noLibro) {
		this.noLibro = noLibro;
	}
	/**
	 * @return the noTomo
	 */
	public String getNoTomo() {
		return noTomo;
	}
	/**
	 * @param noTomo the noTomo to set
	 */
	public void setNoTomo(String noTomo) {
		this.noTomo = noTomo;
	}
	/**
	 * @return the numFolioExtranjero
	 */
	public String getNumFolioExtranjero() {
		return numFolioExtranjero;
	}
	/**
	 * @param numFolioExtranjero the numFolioExtranjero to set
	 */
	public void setNumFolioExtranjero(String numFolioExtranjero) {
		this.numFolioExtranjero = numFolioExtranjero;
	}
	/**
	 * @return the numTipoDocumento
	 */
	public String getNumTipoDocumento() {
		return numTipoDocumento;
	}
	/**
	 * @param numTipoDocumento the numTipoDocumento to set
	 */
	public void setNumTipoDocumento(String numTipoDocumento) {
		this.numTipoDocumento = numTipoDocumento;
	}
	/**
	 * @return the refFolio
	 */
	public String getRefFolio() {
		return refFolio;
	}
	/**
	 * @param refFolio the refFolio to set
	 */
	public void setRefFolio(String refFolio) {
		this.refFolio = refFolio;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anioRegistro == null) ? 0 : anioRegistro.hashCode());
		result = prime * result + ((crip == null) ? 0 : crip.hashCode());
		result = prime * result + ((curp == null) ? 0 : curp.hashCode());
		result = prime * result + ((descripcionTipoDocumento == null) ? 0 : descripcionTipoDocumento.hashCode());
		result = prime * result + ((fechaInscripcion == null) ? 0 : fechaInscripcion.hashCode());
		result = prime * result + ((municipio == null) ? 0 : municipio.hashCode());
		result = prime * result + ((noActa == null) ? 0 : noActa.hashCode());
		result = prime * result + ((noFoja == null) ? 0 : noFoja.hashCode());
		result = prime * result + ((noLibro == null) ? 0 : noLibro.hashCode());
		result = prime * result + ((noTomo == null) ? 0 : noTomo.hashCode());
		result = prime * result + ((numFolioExtranjero == null) ? 0 : numFolioExtranjero.hashCode());
		result = prime * result + ((numTipoDocumento == null) ? 0 : numTipoDocumento.hashCode());
		result = prime * result + ((refFolio == null) ? 0 : refFolio.hashCode());
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
		CURPTO other = (CURPTO) obj;
		if (anioRegistro == null) {
			if (other.anioRegistro != null)
				return false;
		} else if (!anioRegistro.equals(other.anioRegistro))
			return false;
		if (crip == null) {
			if (other.crip != null)
				return false;
		} else if (!crip.equals(other.crip))
			return false;
		if (curp == null) {
			if (other.curp != null)
				return false;
		} else if (!curp.equals(other.curp))
			return false;
		if (descripcionTipoDocumento == null) {
			if (other.descripcionTipoDocumento != null)
				return false;
		} else if (!descripcionTipoDocumento.equals(other.descripcionTipoDocumento))
			return false;
		if (fechaInscripcion == null) {
			if (other.fechaInscripcion != null)
				return false;
		} else if (!fechaInscripcion.equals(other.fechaInscripcion))
			return false;
		if (municipio == null) {
			if (other.municipio != null)
				return false;
		} else if (!municipio.equals(other.municipio))
			return false;
		if (noActa == null) {
			if (other.noActa != null)
				return false;
		} else if (!noActa.equals(other.noActa))
			return false;
		if (noFoja == null) {
			if (other.noFoja != null)
				return false;
		} else if (!noFoja.equals(other.noFoja))
			return false;
		if (noLibro == null) {
			if (other.noLibro != null)
				return false;
		} else if (!noLibro.equals(other.noLibro))
			return false;
		if (noTomo == null) {
			if (other.noTomo != null)
				return false;
		} else if (!noTomo.equals(other.noTomo))
			return false;
		if (numFolioExtranjero == null) {
			if (other.numFolioExtranjero != null)
				return false;
		} else if (!numFolioExtranjero.equals(other.numFolioExtranjero))
			return false;
		if (numTipoDocumento == null) {
			if (other.numTipoDocumento != null)
				return false;
		} else if (!numTipoDocumento.equals(other.numTipoDocumento))
			return false;
		if (refFolio == null) {
			if (other.refFolio != null)
				return false;
		} else if (!refFolio.equals(other.refFolio))
			return false;
		return true;
	}
	
}
