package mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain;

import java.io.Serializable;
import java.util.Date;

public class CedulaPrestacionesDTO implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -553369757880576777L;
	private Long cveIdCedulaPrestaciones;
    private String impImportePrestacion;
    private Date fecRegistroAlta;
    private Date fecRegistroBaja;
    private Date fecRegistroActualizado;
    private String cveIdUsuario;
    private PatronDictamenDTO cveIdPatronDictamen;
    private PrestacionesDTO cveIdPrestaciones;
    private EstadoAtestiguamientoDTO cveIdEstadoAtestiguamiento;
    private AtestiguamientoDTO cveIdAtestiguamiento;

    public Long getCveIdCedulaPrestaciones() {
        return cveIdCedulaPrestaciones;
    }

    public void setCveIdCedulaPrestaciones(Long cveIdCedulaPrestaciones) {
        this.cveIdCedulaPrestaciones = cveIdCedulaPrestaciones;
    }

    public String getImpImportePrestacion() {
        return impImportePrestacion;
    }

    public void setImpImportePrestacion(String impImportePrestacion) {
        this.impImportePrestacion = impImportePrestacion;
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

    public Date getFecRegistroActualizado() {
        return fecRegistroActualizado;
    }

    public void setFecRegistroActualizado(Date fecRegistroActualizado) {
        this.fecRegistroActualizado = fecRegistroActualizado;
    }

    public String getCveIdUsuario() {
        return cveIdUsuario;
    }

    public void setCveIdUsuario(String cveIdUsuario) {
        this.cveIdUsuario = cveIdUsuario;
    }
	public PatronDictamenDTO getCveIdPatronDictamen() {
		return cveIdPatronDictamen;
	}

	public void setCveIdPatronDictamen(PatronDictamenDTO cveIdPatronDictamen) {
		this.cveIdPatronDictamen = cveIdPatronDictamen;
	}

	public PrestacionesDTO getCveIdPrestaciones() {
		return cveIdPrestaciones;
	}

	public void setCveIdPrestaciones(PrestacionesDTO cveIdPrestaciones) {
		this.cveIdPrestaciones = cveIdPrestaciones;
	}

	public EstadoAtestiguamientoDTO getCveIdEstadoAtestiguamiento() {
		return cveIdEstadoAtestiguamiento;
	}

	public void setCveIdEstadoAtestiguamiento(EstadoAtestiguamientoDTO cveIdEstadoAtestiguamiento) {
		this.cveIdEstadoAtestiguamiento = cveIdEstadoAtestiguamiento;
	}

	public AtestiguamientoDTO getCveIdAtestiguamiento() {
		return cveIdAtestiguamiento;
	}

	public void setCveIdAtestiguamiento(AtestiguamientoDTO cveIdAtestiguamiento) {
		this.cveIdAtestiguamiento = cveIdAtestiguamiento;
	}
}
