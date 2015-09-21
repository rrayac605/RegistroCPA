package mx.gob.imss.cit.dictamen.commons.to.sat.patronal.to;

import java.util.Date;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class RegistroSindicatoTO extends BaseTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String autoridadLaboral;
	private Long cveIdPatronSujetoObligado;
	private Long cveIdPersonaMoral;
	private Long cveRegistroSindicato;
	private Date fechaRegistro;
	private String numeroRegistroPatronal;
	private String numReferenciaDocRegistro;
	public String getAutoridadLaboral() {
		return autoridadLaboral;
	}
	public void setAutoridadLaboral(String autoridadLaboral) {
		this.autoridadLaboral = autoridadLaboral;
	}
	public Long getCveIdPatronSujetoObligado() {
		return cveIdPatronSujetoObligado;
	}
	public void setCveIdPatronSujetoObligado(Long cveIdPatronSujetoObligado) {
		this.cveIdPatronSujetoObligado = cveIdPatronSujetoObligado;
	}
	public Long getCveIdPersonaMoral() {
		return cveIdPersonaMoral;
	}
	public void setCveIdPersonaMoral(Long cveIdPersonaMoral) {
		this.cveIdPersonaMoral = cveIdPersonaMoral;
	}
	public Long getCveRegistroSindicato() {
		return cveRegistroSindicato;
	}
	public void setCveRegistroSindicato(Long cveRegistroSindicato) {
		this.cveRegistroSindicato = cveRegistroSindicato;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public String getNumeroRegistroPatronal() {
		return numeroRegistroPatronal;
	}
	public void setNumeroRegistroPatronal(String numeroRegistroPatronal) {
		this.numeroRegistroPatronal = numeroRegistroPatronal;
	}
	public String getNumReferenciaDocRegistro() {
		return numReferenciaDocRegistro;
	}
	public void setNumReferenciaDocRegistro(String numReferenciaDocRegistro) {
		this.numReferenciaDocRegistro = numReferenciaDocRegistro;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autoridadLaboral == null) ? 0 : autoridadLaboral.hashCode());
		result = prime * result + ((cveIdPatronSujetoObligado == null) ? 0 : cveIdPatronSujetoObligado.hashCode());
		result = prime * result + ((cveIdPersonaMoral == null) ? 0 : cveIdPersonaMoral.hashCode());
		result = prime * result + ((cveRegistroSindicato == null) ? 0 : cveRegistroSindicato.hashCode());
		result = prime * result + ((fechaRegistro == null) ? 0 : fechaRegistro.hashCode());
		result = prime * result + ((numReferenciaDocRegistro == null) ? 0 : numReferenciaDocRegistro.hashCode());
		result = prime * result + ((numeroRegistroPatronal == null) ? 0 : numeroRegistroPatronal.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegistroSindicatoTO other = (RegistroSindicatoTO) obj;
		if (autoridadLaboral == null) {
			if (other.autoridadLaboral != null)
				return false;
		} else if (!autoridadLaboral.equals(other.autoridadLaboral))
			return false;
		if (cveIdPatronSujetoObligado == null) {
			if (other.cveIdPatronSujetoObligado != null)
				return false;
		} else if (!cveIdPatronSujetoObligado.equals(other.cveIdPatronSujetoObligado))
			return false;
		if (cveIdPersonaMoral == null) {
			if (other.cveIdPersonaMoral != null)
				return false;
		} else if (!cveIdPersonaMoral.equals(other.cveIdPersonaMoral))
			return false;
		if (cveRegistroSindicato == null) {
			if (other.cveRegistroSindicato != null)
				return false;
		} else if (!cveRegistroSindicato.equals(other.cveRegistroSindicato))
			return false;
		if (fechaRegistro == null) {
			if (other.fechaRegistro != null)
				return false;
		} else if (!fechaRegistro.equals(other.fechaRegistro))
			return false;
		if (numReferenciaDocRegistro == null) {
			if (other.numReferenciaDocRegistro != null)
				return false;
		} else if (!numReferenciaDocRegistro.equals(other.numReferenciaDocRegistro))
			return false;
		if (numeroRegistroPatronal == null) {
			if (other.numeroRegistroPatronal != null)
				return false;
		} else if (!numeroRegistroPatronal.equals(other.numeroRegistroPatronal))
			return false;
		return true;
	}

}
