package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class NdtR2DespachoDTO implements Serializable {

	private static final long serialVersionUID = 6215345157197526747L;

	private Long cveIdR2Despacho;
	private String cargoQueDesempena;
	private Long cveIdPmdomFiscal;
	private String cveIdUsuario;
	private Date fecActivacion;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Long indActivo;
	private String indCuentaconTrab;
	private Long indTipoCpa;
	private Long numTrabajadoresContratados;
	private List<NdtR2FormacontactoDTO> listNdtR2Formacontactos;

	public Long getCveIdR2Despacho() {
		return cveIdR2Despacho;
	}

	public void setCveIdR2Despacho(Long cveIdR2Despacho) {
		this.cveIdR2Despacho = cveIdR2Despacho;
	}

	public String getCargoQueDesempena() {
		return cargoQueDesempena;
	}

	public void setCargoQueDesempena(String cargoQueDesempena) {
		this.cargoQueDesempena = cargoQueDesempena;
	}

	public Long getCveIdPmdomFiscal() {
		return cveIdPmdomFiscal;
	}

	public void setCveIdPmdomFiscal(Long cveIdPmdomFiscal) {
		this.cveIdPmdomFiscal = cveIdPmdomFiscal;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public Date getFecActivacion() {
		return fecActivacion;
	}

	public void setFecActivacion(Date fecActivacion) {
		this.fecActivacion = fecActivacion;
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

	public Long getIndActivo() {
		return indActivo;
	}

	public void setIndActivo(Long indActivo) {
		this.indActivo = indActivo;
	}

	public String getIndCuentaconTrab() {
		return indCuentaconTrab;
	}

	public void setIndCuentaconTrab(String indCuentaconTrab) {
		this.indCuentaconTrab = indCuentaconTrab;
	}

	public Long getIndTipoCpa() {
		return indTipoCpa;
	}

	public void setIndTipoCpa(Long indTipoCpa) {
		this.indTipoCpa = indTipoCpa;
	}

	public Long getNumTrabajadoresContratados() {
		return numTrabajadoresContratados;
	}

	public void setNumTrabajadoresContratados(Long numTrabajadoresContratados) {
		this.numTrabajadoresContratados = numTrabajadoresContratados;
	}

	public List<NdtR2FormacontactoDTO> getListNdtR2Formacontactos() {
		return listNdtR2Formacontactos;
	}

	public void setListNdtR2Formacontactos(List<NdtR2FormacontactoDTO> listNdtR2Formacontactos) {
		this.listNdtR2Formacontactos = listNdtR2Formacontactos;
	}

}
