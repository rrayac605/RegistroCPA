package mx.gob.imss.cit.dictamen.contador.integration.api.dto;

import java.io.Serializable;

public class ContadorPublicoDTO implements Serializable {

	private static final long serialVersionUID = -5589203476692561447L;
    
	private Integer numRegistroCPA;
	private Long cveIdEstadoCPA;
    private DomicilioFiscalDTO domicilioFiscalDTO;
    


	public DomicilioFiscalDTO getDomicilioFiscalDTO() {
		return domicilioFiscalDTO;
	}

	public void setDomicilioFiscalDTO(DomicilioFiscalDTO domicilioFiscalDTO) {
		this.domicilioFiscalDTO = domicilioFiscalDTO;
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
