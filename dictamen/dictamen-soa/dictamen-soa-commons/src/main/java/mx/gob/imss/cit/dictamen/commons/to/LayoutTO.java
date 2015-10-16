package mx.gob.imss.cit.dictamen.commons.to;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class LayoutTO extends BaseTO  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2644866778364925551L;
	
	private Long cveIdAseveracion;
	private Long idLayout;
	private String name;
	
	private AWSPolicyTO policy;

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
	public AWSPolicyTO getPolicy() {
		return policy;
	}

	/**
	 * @param policy the policy to set
	 */
	public void setPolicy(AWSPolicyTO policy) {
		this.policy = policy;
	}

	public Long getIdLayout() {
		return idLayout;
	}

	public void setIdLayout(Long idLayout) {
		this.idLayout = idLayout;
	}

	/**
	 * @return the cveIdAseveracion
	 */
	public Long getCveIdAseveracion() {
		return cveIdAseveracion;
	}

	/**
	 * @param cveIdAseveracion the cveIdAseveracion to set
	 */
	public void setCveIdAseveracion(Long cveIdAseveracion) {
		this.cveIdAseveracion = cveIdAseveracion;
	}
	
	
	

}
