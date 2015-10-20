package mx.gob.imss.cit.dictamen.contador.integration.api.dto;

import java.io.Serializable;

public class ContadorPublicoDTO implements Serializable {

	private static final long serialVersionUID = -5589203476692561447L;
    
	private Integer numRegistroCPA;
	private Long cveIdEstadoCPA;
    private DomicilioDTO domicilioDTO;


	public DomicilioDTO getDomicilioDTO() {
		return domicilioDTO;
	}

	public void setDomicilioDTO(DomicilioDTO domicilioDTO) {
		this.domicilioDTO = domicilioDTO;
	}

	public Long getCveIdEstadoCPA() {
		return cveIdEstadoCPA;
	}

	public void setCveIdEstadoCPA(Long cveIdEstadoCPA) {
		this.cveIdEstadoCPA = cveIdEstadoCPA;
	}

	public Integer getNumRegistroCPA() {
		return numRegistroCPA;
	}

	public void setNumRegistroCPA(Integer numRegistroCPA) {
		this.numRegistroCPA = numRegistroCPA;
	}
 
}
