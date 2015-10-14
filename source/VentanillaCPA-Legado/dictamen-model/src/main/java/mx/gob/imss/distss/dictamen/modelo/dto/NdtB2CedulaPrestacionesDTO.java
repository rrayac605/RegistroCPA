package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdtB2CedulaPrestacionesDTO implements Serializable {

	private static final long serialVersionUID = 6006699694934564393L;

	private Long cveIdCedulaPrestaciones;
	private String cveIdUsuario;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private String impImportePrestacion;
	private NdcAtestiguamientoDTO ndcAtestiguamiento;
	private NdcPrestacionesDTO ndcPrestacione;

	public Long getCveIdCedulaPrestaciones() {
		return cveIdCedulaPrestaciones;
	}

	public void setCveIdCedulaPrestaciones(Long cveIdCedulaPrestaciones) {
		this.cveIdCedulaPrestaciones = cveIdCedulaPrestaciones;
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

	public String getImpImportePrestacion() {
		return impImportePrestacion;
	}

	public void setImpImportePrestacion(String impImportePrestacion) {
		this.impImportePrestacion = impImportePrestacion;
	}

	public NdcAtestiguamientoDTO getNdcAtestiguamiento() {
		return ndcAtestiguamiento;
	}

	public void setNdcAtestiguamiento(NdcAtestiguamientoDTO ndcAtestiguamiento) {
		this.ndcAtestiguamiento = ndcAtestiguamiento;
	}

	public NdcPrestacionesDTO getNdcPrestacione() {
		return ndcPrestacione;
	}

	public void setNdcPrestacione(NdcPrestacionesDTO ndcPrestacione) {
		this.ndcPrestacione = ndcPrestacione;
	}

}
