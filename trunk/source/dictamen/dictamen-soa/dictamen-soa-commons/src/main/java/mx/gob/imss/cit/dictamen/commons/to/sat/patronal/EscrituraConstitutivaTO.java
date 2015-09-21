package mx.gob.imss.cit.dictamen.commons.to.sat.patronal;

import java.util.Date;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.MunicipioTO;

public class EscrituraConstitutivaTO extends BaseTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2838971378779545294L;
	private Long cveEscrituraConstitutiva;
	private Long cveIdPatronalSujetoObligado;
	private Long cveIdPersonaMoral;
	private Date fechaExpedicion;
	private String foja;
	private String folioMercantil;
	private MunicipioTO lugarExpedicion;
	private String numeroRegistroPatronal;
	private String numEscritura;
	private String numNotaria;
	private String partida;
	private String seccion;
	private String volumen;
	public Long getCveEscrituraConstitutiva() {
		return cveEscrituraConstitutiva;
	}
	public void setCveEscrituraConstitutiva(Long cveEscrituraConstitutiva) {
		this.cveEscrituraConstitutiva = cveEscrituraConstitutiva;
	}
	public Long getCveIdPatronalSujetoObligado() {
		return cveIdPatronalSujetoObligado;
	}
	public void setCveIdPatronalSujetoObligado(Long cveIdPatronalSujetoObligado) {
		this.cveIdPatronalSujetoObligado = cveIdPatronalSujetoObligado;
	}
	public Long getCveIdPersonaMoral() {
		return cveIdPersonaMoral;
	}
	public void setCveIdPersonaMoral(Long cveIdPersonaMoral) {
		this.cveIdPersonaMoral = cveIdPersonaMoral;
	}
	public Date getFechaExpedicion() {
		return fechaExpedicion;
	}
	public void setFechaExpedicion(Date fechaExpedicion) {
		this.fechaExpedicion = fechaExpedicion;
	}
	public String getFoja() {
		return foja;
	}
	public void setFoja(String foja) {
		this.foja = foja;
	}
	public String getFolioMercantil() {
		return folioMercantil;
	}
	public void setFolioMercantil(String folioMercantil) {
		this.folioMercantil = folioMercantil;
	}
	public MunicipioTO getLugarExpedicion() {
		return lugarExpedicion;
	}
	public void setLugarExpedicion(MunicipioTO lugarExpedicion) {
		this.lugarExpedicion = lugarExpedicion;
	}
	public String getNumeroRegistroPatronal() {
		return numeroRegistroPatronal;
	}
	public void setNumeroRegistroPatronal(String numeroRegistroPatronal) {
		this.numeroRegistroPatronal = numeroRegistroPatronal;
	}
	public String getNumEscritura() {
		return numEscritura;
	}
	public void setNumEscritura(String numEscritura) {
		this.numEscritura = numEscritura;
	}
	public String getNumNotaria() {
		return numNotaria;
	}
	public void setNumNotaria(String numNotaria) {
		this.numNotaria = numNotaria;
	}
	public String getPartida() {
		return partida;
	}
	public void setPartida(String partida) {
		this.partida = partida;
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	public String getVolumen() {
		return volumen;
	}
	public void setVolumen(String volumen) {
		this.volumen = volumen;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cveEscrituraConstitutiva == null) ? 0 : cveEscrituraConstitutiva.hashCode());
		result = prime * result + ((cveIdPatronalSujetoObligado == null) ? 0 : cveIdPatronalSujetoObligado.hashCode());
		result = prime * result + ((cveIdPersonaMoral == null) ? 0 : cveIdPersonaMoral.hashCode());
		result = prime * result + ((fechaExpedicion == null) ? 0 : fechaExpedicion.hashCode());
		result = prime * result + ((foja == null) ? 0 : foja.hashCode());
		result = prime * result + ((folioMercantil == null) ? 0 : folioMercantil.hashCode());
		result = prime * result + ((lugarExpedicion == null) ? 0 : lugarExpedicion.hashCode());
		result = prime * result + ((numEscritura == null) ? 0 : numEscritura.hashCode());
		result = prime * result + ((numNotaria == null) ? 0 : numNotaria.hashCode());
		result = prime * result + ((numeroRegistroPatronal == null) ? 0 : numeroRegistroPatronal.hashCode());
		result = prime * result + ((partida == null) ? 0 : partida.hashCode());
		result = prime * result + ((seccion == null) ? 0 : seccion.hashCode());
		result = prime * result + ((volumen == null) ? 0 : volumen.hashCode());
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
		EscrituraConstitutivaTO other = (EscrituraConstitutivaTO) obj;
		if (cveEscrituraConstitutiva == null) {
			if (other.cveEscrituraConstitutiva != null)
				return false;
		} else if (!cveEscrituraConstitutiva.equals(other.cveEscrituraConstitutiva))
			return false;
		if (cveIdPatronalSujetoObligado == null) {
			if (other.cveIdPatronalSujetoObligado != null)
				return false;
		} else if (!cveIdPatronalSujetoObligado.equals(other.cveIdPatronalSujetoObligado))
			return false;
		if (cveIdPersonaMoral == null) {
			if (other.cveIdPersonaMoral != null)
				return false;
		} else if (!cveIdPersonaMoral.equals(other.cveIdPersonaMoral))
			return false;
		if (fechaExpedicion == null) {
			if (other.fechaExpedicion != null)
				return false;
		} else if (!fechaExpedicion.equals(other.fechaExpedicion))
			return false;
		if (foja == null) {
			if (other.foja != null)
				return false;
		} else if (!foja.equals(other.foja))
			return false;
		if (folioMercantil == null) {
			if (other.folioMercantil != null)
				return false;
		} else if (!folioMercantil.equals(other.folioMercantil))
			return false;
		if (lugarExpedicion == null) {
			if (other.lugarExpedicion != null)
				return false;
		} else if (!lugarExpedicion.equals(other.lugarExpedicion))
			return false;
		if (numEscritura == null) {
			if (other.numEscritura != null)
				return false;
		} else if (!numEscritura.equals(other.numEscritura))
			return false;
		if (numNotaria == null) {
			if (other.numNotaria != null)
				return false;
		} else if (!numNotaria.equals(other.numNotaria))
			return false;
		if (numeroRegistroPatronal == null) {
			if (other.numeroRegistroPatronal != null)
				return false;
		} else if (!numeroRegistroPatronal.equals(other.numeroRegistroPatronal))
			return false;
		if (partida == null) {
			if (other.partida != null)
				return false;
		} else if (!partida.equals(other.partida))
			return false;
		if (seccion == null) {
			if (other.seccion != null)
				return false;
		} else if (!seccion.equals(other.seccion))
			return false;
		if (volumen == null) {
			if (other.volumen != null)
				return false;
		} else if (!volumen.equals(other.volumen))
			return false;
		return true;
	}
	
}
