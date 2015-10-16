package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdtA921PersSubcontratadoDTO implements Serializable {

	private static final long serialVersionUID = 3648665999041093599L;

	private Long cveIdA921PersSubcontrata;
	private String cveUsuario;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private String nomNombre;
	private String nomPrimerApellido;
	private String nomSegundoApellido;
	private String numNss;
	private Long numRegObraImss;

	public Long getCveIdA921PersSubcontrata() {
		return cveIdA921PersSubcontrata;
	}

	public void setCveIdA921PersSubcontrata(Long cveIdA921PersSubcontrata) {
		this.cveIdA921PersSubcontrata = cveIdA921PersSubcontrata;
	}

	public String getCveUsuario() {
		return cveUsuario;
	}

	public void setCveUsuario(String cveUsuario) {
		this.cveUsuario = cveUsuario;
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

	public String getNomNombre() {
		return nomNombre;
	}

	public void setNomNombre(String nomNombre) {
		this.nomNombre = nomNombre;
	}

	public String getNomPrimerApellido() {
		return nomPrimerApellido;
	}

	public void setNomPrimerApellido(String nomPrimerApellido) {
		this.nomPrimerApellido = nomPrimerApellido;
	}

	public String getNomSegundoApellido() {
		return nomSegundoApellido;
	}

	public void setNomSegundoApellido(String nomSegundoApellido) {
		this.nomSegundoApellido = nomSegundoApellido;
	}

	public String getNumNss() {
		return numNss;
	}

	public void setNumNss(String numNss) {
		this.numNss = numNss;
	}

	public Long getNumRegObraImss() {
		return numRegObraImss;
	}

	public void setNumRegObraImss(Long numRegObraImss) {
		this.numRegObraImss = numRegObraImss;
	}

}
