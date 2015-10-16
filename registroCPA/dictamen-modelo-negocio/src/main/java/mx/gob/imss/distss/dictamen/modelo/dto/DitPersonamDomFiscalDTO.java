package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class DitPersonamDomFiscalDTO implements Serializable {

	private static final long serialVersionUID = -784504260863208013L;

	private Long cveIdPmdomFiscal;
	private Long cveIdPersonaMoral;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private DitDomicilioSatDTO ditDomicilioSatDTO;

	public Long getCveIdPmdomFiscal() {
		return cveIdPmdomFiscal;
	}

	public void setCveIdPmdomFiscal(Long cveIdPmdomFiscal) {
		this.cveIdPmdomFiscal = cveIdPmdomFiscal;
	}

	public Long getCveIdPersonaMoral() {
		return cveIdPersonaMoral;
	}

	public void setCveIdPersonaMoral(Long cveIdPersonaMoral) {
		this.cveIdPersonaMoral = cveIdPersonaMoral;
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

	public DitDomicilioSatDTO getDitDomicilioSatDTO() {
		return ditDomicilioSatDTO;
	}

	public void setDitDomicilioSatDTO(DitDomicilioSatDTO ditDomicilioSatDTO) {
		this.ditDomicilioSatDTO = ditDomicilioSatDTO;
	}

}
