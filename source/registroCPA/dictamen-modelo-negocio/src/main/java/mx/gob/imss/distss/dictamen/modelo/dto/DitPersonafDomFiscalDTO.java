package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class DitPersonafDomFiscalDTO implements Serializable {

	private static final long serialVersionUID = 7432905503429097364L;

	private Long cveIdPfdomFiscal;
	private Long cveIdPersonaFisica;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private DitDomicilioSatDTO ditDomicilioSat;

	public Long getCveIdPfdomFiscal() {
		return cveIdPfdomFiscal;
	}

	public void setCveIdPfdomFiscal(Long cveIdPfdomFiscal) {
		this.cveIdPfdomFiscal = cveIdPfdomFiscal;
	}

	public Long getCveIdPersonaFisica() {
		return cveIdPersonaFisica;
	}

	public void setCveIdPersonaFisica(Long cveIdPersonaFisica) {
		this.cveIdPersonaFisica = cveIdPersonaFisica;
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

	public DitDomicilioSatDTO getDitDomicilioSat() {
		return ditDomicilioSat;
	}

	public void setDitDomicilioSat(DitDomicilioSatDTO ditDomicilioSat) {
		this.ditDomicilioSat = ditDomicilioSat;
	}

}
