package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class NdtColegioDTO implements Serializable {

	private static final long serialVersionUID = -1533019984862162799L;

	private Long cveIdColegio;
	private Long cveIdPersonaMoral;
	private String cveIdUsuario;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private List<NdtCpaAcreditacionDTO> listNdtCpaAcreditacions;
	private List<NdtR3ColegioDTO> listNdtR3Colegios;

	public Long getCveIdColegio() {
		return cveIdColegio;
	}

	public void setCveIdColegio(Long cveIdColegio) {
		this.cveIdColegio = cveIdColegio;
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

	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado;
	}

	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
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

	public List<NdtCpaAcreditacionDTO> getListNdtCpaAcreditacions() {
		return listNdtCpaAcreditacions;
	}

	public void setListNdtCpaAcreditacions(
			List<NdtCpaAcreditacionDTO> listNdtCpaAcreditacions) {
		this.listNdtCpaAcreditacions = listNdtCpaAcreditacions;
	}

	public List<NdtR3ColegioDTO> getListNdtR3Colegios() {
		return listNdtR3Colegios;
	}

	public void setListNdtR3Colegios(List<NdtR3ColegioDTO> listNdtR3Colegios) {
		this.listNdtR3Colegios = listNdtR3Colegios;
	}

}
