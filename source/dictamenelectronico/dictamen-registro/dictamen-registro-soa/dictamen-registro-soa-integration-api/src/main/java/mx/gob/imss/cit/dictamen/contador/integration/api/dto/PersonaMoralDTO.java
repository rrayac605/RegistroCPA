package mx.gob.imss.cit.dictamen.contador.integration.api.dto;

import java.io.Serializable;

public class PersonaMoralDTO implements Serializable {

	private static final long serialVersionUID = 3213395911637001655L;
	
	private String rfc;
    private String razonSocial;
    private String telefono;
	private DomicilioFiscalDTO domicilioFiscalDTO;

	
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public DomicilioFiscalDTO getDomicilioFiscalDTO() {
		return domicilioFiscalDTO;
	}
	public void setDomicilioFiscalDTO(DomicilioFiscalDTO domicilioFiscalDTO) {
		this.domicilioFiscalDTO = domicilioFiscalDTO;
	}
    public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



}
