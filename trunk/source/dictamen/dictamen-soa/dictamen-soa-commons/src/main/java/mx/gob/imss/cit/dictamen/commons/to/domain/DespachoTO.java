package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class DespachoTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -318295374315998667L;

	private long cveIdDespacho;

	private String cveIdUsuario;

	private Date fecActivacion;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private String indActivo;

	private String nomRazonSocial;

	private String registroPatronalU;

	private String rfc;

	private DomicilioGeograficoTO dgDomicilioGeografico;

	private List<DespachoContactoTO> ndtDespachoContactos;

	private List<R2DespachoTO> ndtR2Despachos;

	/**
	 * @return the cveIdDespacho
	 */
	public long getCveIdDespacho() {
		return cveIdDespacho;
	}

	/**
	 * @param cveIdDespacho the cveIdDespacho to set
	 */
	public void setCveIdDespacho(long cveIdDespacho) {
		this.cveIdDespacho = cveIdDespacho;
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
	 * @return the fecActivacion
	 */
	public Date getFecActivacion() {
		return fecActivacion != null ? (Date) fecActivacion.clone() : null;
	}

	/**
	 * @param fecActivacion the fecActivacion to set
	 */
	public void setFecActivacion(Date fecActivacion) {
		this.fecActivacion = fecActivacion;
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
	 * @return the indActivo
	 */
	public String getIndActivo() {
		return indActivo;
	}

	/**
	 * @param indActivo the indActivo to set
	 */
	public void setIndActivo(String indActivo) {
		this.indActivo = indActivo;
	}

	/**
	 * @return the nomRazonSocial
	 */
	public String getNomRazonSocial() {
		return nomRazonSocial;
	}

	/**
	 * @param nomRazonSocial the nomRazonSocial to set
	 */
	public void setNomRazonSocial(String nomRazonSocial) {
		this.nomRazonSocial = nomRazonSocial;
	}

	/**
	 * @return the registroPatronalU
	 */
	public String getRegistroPatronalU() {
		return registroPatronalU;
	}

	/**
	 * @param registroPatronalU the registroPatronalU to set
	 */
	public void setRegistroPatronalU(String registroPatronalU) {
		this.registroPatronalU = registroPatronalU;
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
	 * @return the ndtDespachoContactos
	 */
	public List<DespachoContactoTO> getNdtDespachoContactos() {
		return ndtDespachoContactos;
	}

	/**
	 * @param ndtDespachoContactos the ndtDespachoContactos to set
	 */
	public void setNdtDespachoContactos(
			List<DespachoContactoTO> ndtDespachoContactos) {
		this.ndtDespachoContactos = ndtDespachoContactos;
	}

	/**
	 * @return the ndtR2Despachos
	 */
	public List<R2DespachoTO> getNdtR2Despachos() {
		return ndtR2Despachos;
	}

	/**
	 * @param ndtR2Despachos the ndtR2Despachos to set
	 */
	public void setNdtR2Despachos(List<R2DespachoTO> ndtR2Despachos) {
		this.ndtR2Despachos = ndtR2Despachos;
	}

	
	
}
