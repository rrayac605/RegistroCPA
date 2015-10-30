package mx.gob.imss.cit.dictamen.contador.integration.api.dto;

import java.io.Serializable;

public class FolioSolicitudFiscalDTO implements Serializable {

	
	private static final long serialVersionUID = 5180540458196964794L;
	   private String plPrimerApellido;
	   private String pvPrimerApellido;
	   private String plSegundoApellido;
	   private String plPrimerNombre;
	   private String fechaNacimiento;
	   private String genero;
	   private String entidadFederativa;
	   private String cPrimerApellido;
	   private String cSegundoApellido;
	   private String scPrimerApellido;
	   private String homoclave;
	   
	   public String evaluarString(String cadena){
		   String resultado=" ";
		     if(cadena!=null && !cadena.isEmpty()){
		    	 resultado =cadena;
		     }
		     return resultado;
	   }
	   public String toString(){
	    StringBuilder sb  =  new StringBuilder();
	    sb.append(evaluarString(plPrimerApellido));
	    sb.append(evaluarString(pvPrimerApellido));
	    sb.append(evaluarString(plSegundoApellido));
	    sb.append(evaluarString(plPrimerNombre));
	    sb.append(evaluarString(fechaNacimiento));
	    sb.append(evaluarString(genero));
	    sb.append(evaluarString(entidadFederativa));
	    sb.append(evaluarString(cPrimerApellido));
	    sb.append(evaluarString(cSegundoApellido));
	    sb.append(evaluarString(scPrimerApellido));
	    sb.append(evaluarString(homoclave));
	  return sb.toString();
	}
     public String getPlPrimerApellido() {
		return plPrimerApellido;
	}
	public void setPlPrimerApellido(String plPrimerApellido) {
		this.plPrimerApellido = plPrimerApellido;
	}
	public String getPvPrimerApellido() {
		return pvPrimerApellido;
	}
	public void setPvPrimerApellido(String pvPrimerApellido) {
		this.pvPrimerApellido = pvPrimerApellido;
	}
	public String getPlSegundoApellido() {
		return plSegundoApellido;
	}
	public void setPlSegundoApellido(String plSegundoApellido) {
		this.plSegundoApellido = plSegundoApellido;
	}
	public String getPlPrimerNombre() {
		return plPrimerNombre;
	}
	public void setPlPrimerNombre(String plPrimerNombre) {
		this.plPrimerNombre = plPrimerNombre;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getEntidadFederativa() {
		return entidadFederativa;
	}
	public void setEntidadFederativa(String entidadFederativa) {
		this.entidadFederativa = entidadFederativa;
	}
	public String getcPrimerApellido() {
		return cPrimerApellido;
	}
	public void setcPrimerApellido(String cPrimerApellido) {
		this.cPrimerApellido = cPrimerApellido;
	}
	public String getcSegundoApellido() {
		return cSegundoApellido;
	}
	public void setcSegundoApellido(String cSegundoApellido) {
		this.cSegundoApellido = cSegundoApellido;
	}
	public String getScPrimerApellido() {
		return scPrimerApellido;
	}
	public void setScPrimerApellido(String scPrimerApellido) {
		this.scPrimerApellido = scPrimerApellido;
	}
	public String getHomoclave() {
		return homoclave;
	}
	public void setHomoclave(String homoclave) {
		this.homoclave = homoclave;
	}

   
}
