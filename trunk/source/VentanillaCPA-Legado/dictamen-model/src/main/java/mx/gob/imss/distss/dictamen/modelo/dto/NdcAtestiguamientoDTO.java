package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class NdcAtestiguamientoDTO implements Serializable {

	private static final long serialVersionUID = -2177950136283893019L;

	private Long cveIdAtestiguamiento;
	private String desAtestiguamiento;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private List<NdcRubroDTO> listNdcRubros;
	private NdcAseveracionesDTO ndcAseveraciones;

	public Long getCveIdAtestiguamiento() {
		return cveIdAtestiguamiento;
	}

	public void setCveIdAtestiguamiento(Long cveIdAtestiguamiento) {
		this.cveIdAtestiguamiento = cveIdAtestiguamiento;
	}

	public String getDesAtestiguamiento() {
		return desAtestiguamiento;
	}

	public void setDesAtestiguamiento(String desAtestiguamiento) {
		this.desAtestiguamiento = desAtestiguamiento;
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

	public List<NdcRubroDTO> getListNdcRubros() {
		return listNdcRubros;
	}

	public void setListNdcRubros(List<NdcRubroDTO> listNdcRubros) {
		this.listNdcRubros = listNdcRubros;
	}

	public NdcAseveracionesDTO getNdcAseveraciones() {
		return ndcAseveraciones;
	}

	public void setNdcAseveraciones(NdcAseveracionesDTO ndcAseveraciones) {
		this.ndcAseveraciones = ndcAseveraciones;
	}

}
