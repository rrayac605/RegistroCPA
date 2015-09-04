package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class AsociacionTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5943580680799146476L;

	private long cveIdAsociacion;

	private String cveIdUsuario;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private String nomNombre;

	private String rfc;

	private DomicilioGeograficoTO dgDomicilioGeografico;

	private List<ColegioTO> ndcColegios;

	private List<AsociacionContactoTO> ndtAsociacionContactos;

	/**
	 * @return the cveIdAsociacion
	 */
	public long getCveIdAsociacion() {
		return cveIdAsociacion;
	}

	/**
	 * @param cveIdAsociacion the cveIdAsociacion to set
	 */
	public void setCveIdAsociacion(long cveIdAsociacion) {
		this.cveIdAsociacion = cveIdAsociacion;
	}

	/**
	 * @return the cveIdUsuario
	 */
	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	/**
	 * @param cveIdUsuario the cveIdUsuario to set
	 */
	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}



	/**
	 * @return the fecRegistroActualizado
	 */
	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado != null ? (Date) fecRegistroActualizado.clone() : null;
	}

	/**
	 * @param fecRegistroActualizado the fecRegistroActualizado to set
	 */
	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	/**
	 * @return the fecRegistroAlta
	 */
	public Date getFecRegistroAlta() {
		return fecRegistroAlta != null ? (Date) fecRegistroAlta.clone() : null;
	}

	/**
	 * @param fecRegistroAlta the fecRegistroAlta to set
	 */
	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	/**
	 * @return the fecRegistroBaja
	 */
	public Date getFecRegistroBaja() {
		return fecRegistroBaja != null ? (Date) fecRegistroBaja.clone() : null;
	}

	/**
	 * @param fecRegistroBaja the fecRegistroBaja to set
	 */
	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	/**
	 * @return the nomNombre
	 */
	public String getNomNombre() {
		return nomNombre;
	}

	/**
	 * @param nomNombre the nomNombre to set
	 */
	public void setNomNombre(String nomNombre) {
		this.nomNombre = nomNombre;
	}

	/**
	 * @return the rfc
	 */
	public String getRfc() {
		return rfc;
	}

	/**
	 * @param rfc the rfc to set
	 */
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	/**
	 * @return the dgDomicilioGeografico
	 */
	public DomicilioGeograficoTO getDgDomicilioGeografico() {
		return dgDomicilioGeografico;
	}

	/**
	 * @param dgDomicilioGeografico the dgDomicilioGeografico to set
	 */
	public void setDgDomicilioGeografico(DomicilioGeograficoTO dgDomicilioGeografico) {
		this.dgDomicilioGeografico = dgDomicilioGeografico;
	}

	/**
	 * @return the ndcColegios
	 */
	public List<ColegioTO> getNdcColegios() {
		return ndcColegios;
	}

	/**
	 * @param ndcColegios the ndcColegios to set
	 */
	public void setNdcColegios(List<ColegioTO> ndcColegios) {
		this.ndcColegios = ndcColegios;
	}

	/**
	 * @return the ndtAsociacionContactos
	 */
	public List<AsociacionContactoTO> getNdtAsociacionContactos() {
		return ndtAsociacionContactos;
	}

	/**
	 * @param ndtAsociacionContactos the ndtAsociacionContactos to set
	 */
	public void setNdtAsociacionContactos(
			List<AsociacionContactoTO> ndtAsociacionContactos) {
		this.ndtAsociacionContactos = ndtAsociacionContactos;
	}

	
	
}
