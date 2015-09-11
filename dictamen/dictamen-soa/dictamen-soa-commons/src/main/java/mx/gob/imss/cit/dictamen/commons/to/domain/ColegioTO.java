package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class ColegioTO extends BaseTO {


	/**
	 * 
	 */
	private static final long serialVersionUID = -8656099291773037835L;

	private long cveIdColegio;

	private String cveIdUsuario;

	private Date fecRegistroActualizado;


	private Date fecRegistroAlta;


	private Date fecRegistroBaja;

	private String nomNombre;

	private String rfc;


	private DomicilioGeograficoTO dgDomicilioGeografico;


	private AsociacionTO ndcAsociacion;


	private List<AcreditacionTO> ndtAcreditacions;


	private List<ColegioContactoTO> ndtColegioContactos;


	private List<R3ColegioXcontadorTO> ndtR3ColegioXcontadors;


	/**
	 * @return the cveIdColegio
	 */
	public long getCveIdColegio() {
		return cveIdColegio;
	}


	/**
	 * @param cveIdColegio the cveIdColegio to set
	 */
	public void setCveIdColegio(long cveIdColegio) {
		this.cveIdColegio = cveIdColegio;
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
	 * @return the ndcAsociacion
	 */
	public AsociacionTO getNdcAsociacion() {
		return ndcAsociacion;
	}


	/**
	 * @param ndcAsociacion the ndcAsociacion to set
	 */
	public void setNdcAsociacion(AsociacionTO ndcAsociacion) {
		this.ndcAsociacion = ndcAsociacion;
	}


	/**
	 * @return the ndtAcreditacions
	 */
	public List<AcreditacionTO> getNdtAcreditacions() {
		return ndtAcreditacions;
	}


	/**
	 * @param ndtAcreditacions the ndtAcreditacions to set
	 */
	public void setNdtAcreditacions(List<AcreditacionTO> ndtAcreditacions) {
		this.ndtAcreditacions = ndtAcreditacions;
	}


	/**
	 * @return the ndtColegioContactos
	 */
	public List<ColegioContactoTO> getNdtColegioContactos() {
		return ndtColegioContactos;
	}


	/**
	 * @param ndtColegioContactos the ndtColegioContactos to set
	 */
	public void setNdtColegioContactos(List<ColegioContactoTO> ndtColegioContactos) {
		this.ndtColegioContactos = ndtColegioContactos;
	}


	/**
	 * @return the ndtR3ColegioXcontadors
	 */
	public List<R3ColegioXcontadorTO> getNdtR3ColegioXcontadors() {
		return ndtR3ColegioXcontadors;
	}


	/**
	 * @param ndtR3ColegioXcontadors the ndtR3ColegioXcontadors to set
	 */
	public void setNdtR3ColegioXcontadors(
			List<R3ColegioXcontadorTO> ndtR3ColegioXcontadors) {
		this.ndtR3ColegioXcontadors = ndtR3ColegioXcontadors;
	}

	
	
}
