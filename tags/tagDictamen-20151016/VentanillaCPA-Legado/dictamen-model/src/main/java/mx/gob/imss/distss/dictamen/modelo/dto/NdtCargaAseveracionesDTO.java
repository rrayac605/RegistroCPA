package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class NdtCargaAseveracionesDTO implements Serializable {

	private static final long serialVersionUID = 8126930082957797677L;

	private Long cveIdBitacoraCargaAsev;
	private String cveIdUsuario;
	private Date fecFechaCarga;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private List<NdtBitacoraErroresDTO> listNdtBitacoraErrores;
	private NdcAseveracionesDTO ndcAseveracione;
	private NdcStatusCargaAseveracionesDTO ndcStatusCargaAseveracione;

	public Long getCveIdBitacoraCargaAsev() {
		return cveIdBitacoraCargaAsev;
	}

	public void setCveIdBitacoraCargaAsev(Long cveIdBitacoraCargaAsev) {
		this.cveIdBitacoraCargaAsev = cveIdBitacoraCargaAsev;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public Date getFecFechaCarga() {
		return fecFechaCarga;
	}

	public void setFecFechaCarga(Date fecFechaCarga) {
		this.fecFechaCarga = fecFechaCarga;
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

	public List<NdtBitacoraErroresDTO> getListNdtBitacoraErrores() {
		return listNdtBitacoraErrores;
	}

	public void setListNdtBitacoraErrores(List<NdtBitacoraErroresDTO> listNdtBitacoraErrores) {
		this.listNdtBitacoraErrores = listNdtBitacoraErrores;
	}

	public NdcAseveracionesDTO getNdcAseveracione() {
		return ndcAseveracione;
	}

	public void setNdcAseveracione(NdcAseveracionesDTO ndcAseveracione) {
		this.ndcAseveracione = ndcAseveracione;
	}

	public NdcStatusCargaAseveracionesDTO getNdcStatusCargaAseveracione() {
		return ndcStatusCargaAseveracione;
	}

	public void setNdcStatusCargaAseveracione(NdcStatusCargaAseveracionesDTO ndcStatusCargaAseveracione) {
		this.ndcStatusCargaAseveracione = ndcStatusCargaAseveracione;
	}

}
