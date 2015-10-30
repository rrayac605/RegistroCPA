package mx.gob.imss.cit.dictamen.contador.integration.api.dto;

import java.io.Serializable;

public class ContactoDTO implements Serializable {

   private static final long serialVersionUID = -7184366854592128783L;

   private String correoElectronico2;
   private String correoElectronico3;
   private String correoElectronico2Conf;
   private String correoElectronico3Conf;
   
   
   public String getCorreoElectronico2() {
		return correoElectronico2;
	}
	public void setCorreoElectronico2(String correoElectronico2) {
		this.correoElectronico2 = correoElectronico2;
	}
	public String getCorreoElectronico3() {
		return correoElectronico3;
	}
	public void setCorreoElectronico3(String correoElectronico3) {
		this.correoElectronico3 = correoElectronico3;
	}
	public String getCorreoElectronico2Conf() {
		return correoElectronico2Conf;
	}
	public void setCorreoElectronico2Conf(String correoElectronico2Conf) {
		this.correoElectronico2Conf = correoElectronico2Conf;
	}
	public String getCorreoElectronico3Conf() {
		return correoElectronico3Conf;
	}
	public void setCorreoElectronico3Conf(String correoElectronico3Conf) {
		this.correoElectronico3Conf = correoElectronico3Conf;
	}
}
