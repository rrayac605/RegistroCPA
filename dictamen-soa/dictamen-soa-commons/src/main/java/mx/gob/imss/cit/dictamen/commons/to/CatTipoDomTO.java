package mx.gob.imss.cit.dictamen.commons.to;

import java.util.List;

public class CatTipoDomTO extends BaseTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1177892705761626826L;

	private long cveTipoDom;

	private String compEspac;

	private String descripcion;

	private List<DomicilioGeograficoTO> dgDomicilioGeograficos;

	/**
	 * @return the cveTipoDom
	 */
	public long getCveTipoDom() {
		return cveTipoDom;
	}

	/**
	 * @param cveTipoDom the cveTipoDom to set
	 */
	public void setCveTipoDom(long cveTipoDom) {
		this.cveTipoDom = cveTipoDom;
	}

	/**
	 * @return the compEspac
	 */
	public String getCompEspac() {
		return compEspac;
	}

	/**
	 * @param compEspac the compEspac to set
	 */
	public void setCompEspac(String compEspac) {
		this.compEspac = compEspac;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the dgDomicilioGeograficos
	 */
	public List<DomicilioGeograficoTO> getDgDomicilioGeograficos() {
		return dgDomicilioGeograficos;
	}

	/**
	 * @param dgDomicilioGeograficos the dgDomicilioGeograficos to set
	 */
	public void setDgDomicilioGeograficos(
			List<DomicilioGeograficoTO> dgDomicilioGeograficos) {
		this.dgDomicilioGeograficos = dgDomicilioGeograficos;
	}




}
