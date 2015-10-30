package mx.gob.imss.cit.dictamen.contador.integration.api.dto;

import java.io.Serializable;

public class FirmaDigitalResponseDTO implements Serializable {
     
	private static final long serialVersionUID = 6646154822948140212L;
    public String getAcuse() {
		return acuse;
	}
	public void setAcuse(String acuse) {
		this.acuse = acuse;
	}
	public String getResultado() {
		return Resultado;
	}
	public void setResultado(String resultado) {
		Resultado = resultado;
	}
	public String getCurp_rl() {
		return curp_rl;
	}
	public void setCurp_rl(String curp_rl) {
		this.curp_rl = curp_rl;
	}
	public String getSerie_cert() {
		return serie_cert;
	}
	public void setSerie_cert(String serie_cert) {
		this.serie_cert = serie_cert;
	}
	public String getFolio() {
		return folio;
	}
	public void setFolio(String folio) {
		this.folio = folio;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public String getRfc_rl() {
		return rfc_rl;
	}
	public void setRfc_rl(String rfc_rl) {
		this.rfc_rl = rfc_rl;
	}
	private String acuse;
    private String Resultado;
    private String curp_rl;
    private String serie_cert;
    private String folio;
    private String rfc;
    private String curp;
    private String rfc_rl;
}
