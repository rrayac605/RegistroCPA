package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class NdcAseveracionesDTO implements Serializable {

	private static final long serialVersionUID = 3154883006010258744L;

	private Long cveIdAseveracion;
	private String desTipoAseveracion;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Long indConstruccion;
	private Long indObligatorio;
	private List<NdcAtestiguamientoDTO> listNdcAtestiguamientos;

	public Long getCveIdAseveracion() {
		return cveIdAseveracion;
	}

	public void setCveIdAseveracion(Long cveIdAseveracion) {
		this.cveIdAseveracion = cveIdAseveracion;
	}

	public String getDesTipoAseveracion() {
		return desTipoAseveracion;
	}

	public void setDesTipoAseveracion(String desTipoAseveracion) {
		this.desTipoAseveracion = desTipoAseveracion;
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

	public Long getIndConstruccion() {
		return indConstruccion;
	}

	public void setIndConstruccion(Long indConstruccion) {
		this.indConstruccion = indConstruccion;
	}

	public Long getIndObligatorio() {
		return indObligatorio;
	}

	public void setIndObligatorio(Long indObligatorio) {
		this.indObligatorio = indObligatorio;
	}

	public List<NdcAtestiguamientoDTO> getListNdcAtestiguamientos() {
		return listNdcAtestiguamientos;
	}

	public void setListNdcAtestiguamientos(List<NdcAtestiguamientoDTO> listNdcAtestiguamientos) {
		this.listNdcAtestiguamientos = listNdcAtestiguamientos;
	}

}
