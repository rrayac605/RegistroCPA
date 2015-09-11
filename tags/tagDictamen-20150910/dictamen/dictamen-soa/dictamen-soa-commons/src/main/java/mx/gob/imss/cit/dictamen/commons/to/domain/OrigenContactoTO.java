package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class OrigenContactoTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2204581380730193481L;

	private long cveIdOrigenContacto;
	
	private String desTablaOrigen;
	
	private List<TipFormaContactoTO> ndtTipFormaContactos;

	/**
	 * @return the cveIdOrigenContacto
	 */
	public long getCveIdOrigenContacto() {
		return cveIdOrigenContacto;
	}

	/**
	 * @param cveIdOrigenContacto the cveIdOrigenContacto to set
	 */
	public void setCveIdOrigenContacto(long cveIdOrigenContacto) {
		this.cveIdOrigenContacto = cveIdOrigenContacto;
	}

	/**
	 * @return the desTablaOrigen
	 */
	public String getDesTablaOrigen() {
		return desTablaOrigen;
	}

	/**
	 * @param desTablaOrigen the desTablaOrigen to set
	 */
	public void setDesTablaOrigen(String desTablaOrigen) {
		this.desTablaOrigen = desTablaOrigen;
	}

	/**
	 * @return the ndtTipFormaContactos
	 */
	public List<TipFormaContactoTO> getNdtTipFormaContactos() {
		return ndtTipFormaContactos;
	}

	/**
	 * @param ndtTipFormaContactos the ndtTipFormaContactos to set
	 */
	public void setNdtTipFormaContactos(
			List<TipFormaContactoTO> ndtTipFormaContactos) {
		this.ndtTipFormaContactos = ndtTipFormaContactos;
	}
	

	
}
