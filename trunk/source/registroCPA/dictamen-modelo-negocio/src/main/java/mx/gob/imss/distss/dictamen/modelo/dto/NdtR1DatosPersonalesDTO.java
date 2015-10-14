package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.ArrayList;
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
	private String correoElectronico;
	private String telefonoFijo;
	private Long cveIdDomicilio;
	private boolean existenCambiosCorreo;
	private boolean existenCambiosTelefono;
	private boolean existenCambiosR1;
	
	public NdtR1DatosPersonalesDTO() {
		listNdtR1Formacontactos = new ArrayList<NdtR1FormacontactoDTO>();
	}

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

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getTelefonoFijo() {
		return telefonoFijo;
	}

	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}

	public Long getCveIdDomicilio() {
		return cveIdDomicilio;
	}

	public void setCveIdDomicilio(Long cveIdDomicilio) {
		this.cveIdDomicilio = cveIdDomicilio;
	}

	public boolean isExistenCambiosCorreo() {
		return existenCambiosCorreo;
	}

	public void setExistenCambiosCorreo(boolean existenCambiosCorreo) {
		this.existenCambiosCorreo = existenCambiosCorreo;
	}

	public boolean isExistenCambiosTelefono() {
		return existenCambiosTelefono;
	}

	public void setExistenCambiosTelefono(boolean existenCambiosTelefono) {
		this.existenCambiosTelefono = existenCambiosTelefono;
	}

	public boolean isExistenCambiosR1() {
		return existenCambiosR1;
	}

	public void setExistenCambiosR1(boolean existenCambiosR1) {
		this.existenCambiosR1 = existenCambiosR1;
	}

}
