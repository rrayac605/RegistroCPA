package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class NdtDespachosDTO implements Serializable {

	private static final long serialVersionUID = 7211768372559636010L;

	private Long cveIdDespacho;
	private Long cveIdPersonaMoral;
	private String cveIdUsuario;
	private Date fecActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private List<NdtR2DespachoDTO> listNdtR2Despachos;
	private String rfc;
	private String razonSocial;

	public Long getCveIdDespacho() {
		return cveIdDespacho;
	}

	public void setCveIdDespacho(Long cveIdDespacho) {
		this.cveIdDespacho = cveIdDespacho;
	}

	public Long getCveIdPersonaMoral() {
		return cveIdPersonaMoral;
	}

	public void setCveIdPersonaMoral(Long cveIdPersonaMoral) {
		this.cveIdPersonaMoral = cveIdPersonaMoral;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public Date getFecActualizado() {
		return fecActualizado;
	}

	public void setFecActualizado(Date fecActualizado) {
		this.fecActualizado = fecActualizado;
	}

	public Date getFecRegistroAlta() {
		return fecRegistroAlta;
	}

	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	public Date getFecRegistroBaja() {
		return fecRegistroBaja;
	}

	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	public List<NdtR2DespachoDTO> getListNdtR2Despachos() {
		return listNdtR2Despachos;
	}

	public void setListNdtR2Despachos(List<NdtR2DespachoDTO> listNdtR2Despachos) {
		this.listNdtR2Despachos = listNdtR2Despachos;
	}

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

}
