package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class CodigosPostalesTO extends BaseTO {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9096174543391343441L;

	private String agregado;

	private AsentamientoTO dgAsentamiento;

	private List<DomicilioGeograficoTO> dgDomicilioGeograficos;

	/**
	 * @return the agregado
	 */
	public String getAgregado() {
		return agregado;
	}

	/**
	 * @param agregado the agregado to set
	 */
	public void setAgregado(String agregado) {
		this.agregado = agregado;
	}

	/**
	 * @return the dgAsentamiento
	 */
	public AsentamientoTO getDgAsentamiento() {
		return dgAsentamiento;
	}

	/**
	 * @param dgAsentamiento the dgAsentamiento to set
	 */
	public void setDgAsentamiento(AsentamientoTO dgAsentamiento) {
		this.dgAsentamiento = dgAsentamiento;
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
