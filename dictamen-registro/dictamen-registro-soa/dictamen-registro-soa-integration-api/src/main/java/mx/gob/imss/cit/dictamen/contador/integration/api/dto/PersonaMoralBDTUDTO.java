package mx.gob.imss.cit.dictamen.contador.integration.api.dto;

import java.io.Serializable;

public class PersonaMoralBDTUDTO implements Serializable {
 
   private static final long serialVersionUID = -6086684008473494255L;
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
public Long getIdPersona() {
	return idPersona;
}
public void setIdPersona(Long idPersona) {
	this.idPersona = idPersona;
}
   private String rfc;
   private String razonSocial;
   private Long idPersona;
}
