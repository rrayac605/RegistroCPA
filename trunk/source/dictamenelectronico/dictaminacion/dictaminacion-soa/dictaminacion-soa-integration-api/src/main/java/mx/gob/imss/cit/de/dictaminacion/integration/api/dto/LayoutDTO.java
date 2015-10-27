package mx.gob.imss.cit.de.dictaminacion.integration.api.dto;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.base.BaseDTO;

public class LayoutDTO extends BaseDTO  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2644866008364925551L;
	
	private Long idLayout;
	private String name;
	private boolean cargado;
	private String desEstado;
	
	private AWSPolicyDTO policy; 

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the policy
	 */
	public AWSPolicyDTO getPolicy() {
		return policy;
	}

	/**
	 * @param policy the policy to set
	 */
	public void setPolicy(AWSPolicyDTO policy) {
		this.policy = policy;
	}

	public Long getIdLayout() {
		return idLayout;
	}

	public void setIdLayout(Long idLayout) {
		this.idLayout = idLayout;
	}

	public boolean getCargado() {
		return cargado;
	}

	public void setCargado(boolean cargado) {
		this.cargado = cargado;
	}

	public String getDesEstado() {
		return desEstado;
	}

	public void setDesEstado(String desEstado) {
		this.desEstado = desEstado;
	}


}
