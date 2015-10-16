package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class NdtR1DatosPersonalesDTO implements Serializable {

	private static final long serialVersionUID = -1179648817728082873L;

	private Long cveIdR1DatosPersonales;
	private String cedulaProfesional;
	private Long cveIdPfdomFiscal;
	private Long cveIdSubdelegacion;
	private String cveIdUsuario;
	private String desTituloExpedidoPor;
	private Date fecExpedicionCedprof;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private List<NdtR1FormacontactoDTO> listNdtR1Formacontactos;

	public Long getCveIdR1DatosPersonales() {
		return cveIdR1DatosPersonales;
	}

	public void setCveIdR1DatosPersonales(Long cveIdR1DatosPersonales) {
		this.cveIdR1DatosPersonales = cveIdR1DatosPersonales;
	}

	public String getCedulaProfesional() {
		return cedulaProfesional;
	}

	public void setCedulaProfesional(String cedulaProfesional) {
		this.cedulaProfesional = cedulaProfesional;
	}

	public Long getCveIdPfdomFiscal() {
		return cveIdPfdomFiscal;
	}

	public void setCveIdPfdomFiscal(Long cveIdPfdomFiscal) {
		this.cveIdPfdomFiscal = cveIdPfdomFiscal;
	}

	public Long getCveIdSubdelegacion() {
		return cveIdSubdelegacion;
	}

	public void setCveIdSubdelegacion(Long cveIdSubdelegacion) {
		this.cveIdSubdelegacion = cveIdSubdelegacion;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDesTituloExpedidoPor() {
		return desTituloExpedidoPor;
	}

	public void setDesTituloExpedidoPor(String desTituloExpedidoPor) {
		this.desTituloExpedidoPor = desTituloExpedidoPor;
	}

	public Date getFecExpedicionCedprof() {
		return fecExpedicionCedprof;
	}

	public void setFecExpedicionCedprof(Date fecExpedicionCedprof) {
		this.fecExpedicionCedprof = fecExpedicionCedprof;
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

	public List<NdtR1FormacontactoDTO> getListNdtR1Formacontactos() {
		return listNdtR1Formacontactos;
	}

	public void setListNdtR1Formacontactos(List<NdtR1FormacontactoDTO> listNdtR1Formacontactos) {
		this.listNdtR1Formacontactos = listNdtR1Formacontactos;
	}

}
