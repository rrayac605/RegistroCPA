package mx.gob.imss.cit.dictamen.commons.to;

import java.math.BigDecimal;

public class TipFormaContactoTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5379982838883202937L;

	private String cveIdTipFormaContacto;

	private BigDecimal cveOrigen;

	private FormaContactoTO ditFormaContacto;

	private OrigenContactoTO ndcOrigenContacto;

	/**
	 * @return the cveIdTipFormaContacto
	 */
	public String getCveIdTipFormaContacto() {
		return cveIdTipFormaContacto;
	}

	/**
	 * @param cveIdTipFormaContacto the cveIdTipFormaContacto to set
	 */
	public void setCveIdTipFormaContacto(String cveIdTipFormaContacto) {
		this.cveIdTipFormaContacto = cveIdTipFormaContacto;
	}

	/**
	 * @return the cveOrigen
	 */
	public BigDecimal getCveOrigen() {
		return cveOrigen;
	}

	/**
	 * @param cveOrigen the cveOrigen to set
	 */
	public void setCveOrigen(BigDecimal cveOrigen) {
		this.cveOrigen = cveOrigen;
	}

	/**
	 * @return the ditFormaContacto
	 */
	public FormaContactoTO getDitFormaContacto() {
		return ditFormaContacto;
	}

	/**
	 * @param ditFormaContacto the ditFormaContacto to set
	 */
	public void setDitFormaContacto(FormaContactoTO ditFormaContacto) {
		this.ditFormaContacto = ditFormaContacto;
	}

	/**
	 * @return the ndcOrigenContacto
	 */
	public OrigenContactoTO getNdcOrigenContacto() {
		return ndcOrigenContacto;
	}

	/**
	 * @param ndcOrigenContacto the ndcOrigenContacto to set
	 */
	public void setNdcOrigenContacto(OrigenContactoTO ndcOrigenContacto) {
		this.ndcOrigenContacto = ndcOrigenContacto;
	}
	
	
	
}
