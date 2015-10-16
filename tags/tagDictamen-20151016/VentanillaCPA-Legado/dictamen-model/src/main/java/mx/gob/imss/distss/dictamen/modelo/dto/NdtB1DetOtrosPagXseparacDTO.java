package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdtB1DetOtrosPagXseparacDTO implements Serializable {

	private static final long serialVersionUID = -6349387345978944638L;

	private Long cveIdA1DetOtrosPagXsepar;
	private String desConcepto;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Long impImportePagado;
	private Long indFijaVariable;
	private Long indIntegraSbc;

	public Long getCveIdA1DetOtrosPagXsepar() {
		return cveIdA1DetOtrosPagXsepar;
	}

	public void setCveIdA1DetOtrosPagXsepar(Long cveIdA1DetOtrosPagXsepar) {
		this.cveIdA1DetOtrosPagXsepar = cveIdA1DetOtrosPagXsepar;
	}

	public String getDesConcepto() {
		return desConcepto;
	}

	public void setDesConcepto(String desConcepto) {
		this.desConcepto = desConcepto;
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

	public Long getImpImportePagado() {
		return impImportePagado;
	}

	public void setImpImportePagado(Long impImportePagado) {
		this.impImportePagado = impImportePagado;
	}

	public Long getIndFijaVariable() {
		return indFijaVariable;
	}

	public void setIndFijaVariable(Long indFijaVariable) {
		this.indFijaVariable = indFijaVariable;
	}

	public Long getIndIntegraSbc() {
		return indIntegraSbc;
	}

	public void setIndIntegraSbc(Long indIntegraSbc) {
		this.indIntegraSbc = indIntegraSbc;
	}

}
