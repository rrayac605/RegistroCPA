package mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.patronal.to.EscrituraConstitutivaTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.patronal.to.RegistroSindicatoTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.patronal.to.TipoSociedadTO;

public class MoralTO extends BaseTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String actaConstitutiva;
	private String altaEnImss;
	private String busqAprox;
	private Long cveMoral;
	private DatosPersonalesSATTO datosPersonalesSAT;
	private String desSituacion;
	private EscrituraConstitutivaTO escrituraConstitutiva;
	private String estadosFormateados;
	private Date fechaBaja;
	private Date fechaCreacion;
	private String fechaCreacionFormateada;
	private Date fechaModificacion;
	private Date fechaRegistro;
	private Long idActaConstitutiva; 	
	private Integer idSituacion;
	private BigDecimal indAcreditado;
	private String nrp;
	private Integer numeroLineaArchivo;
	private String razonSocial;
	private RegistroSindicatoTO registroSindicato;
	private String rfcSat;
	private List<SituacionSATTO> situacionesSAT;
	private String subEstadosFormateados;
	private TipoSociedadTO tipoSociedad;
	public String getActaConstitutiva() {
		return actaConstitutiva;
	}
	public void setActaConstitutiva(String actaConstitutiva) {
		this.actaConstitutiva = actaConstitutiva;
	}
	public String getAltaEnImss() {
		return altaEnImss;
	}
	public void setAltaEnImss(String altaEnImss) {
		this.altaEnImss = altaEnImss;
	}
	public String getBusqAprox() {
		return busqAprox;
	}
	public void setBusqAprox(String busqAprox) {
		this.busqAprox = busqAprox;
	}
	public Long getCveMoral() {
		return cveMoral;
	}
	public void setCveMoral(Long cveMoral) {
		this.cveMoral = cveMoral;
	}
	public DatosPersonalesSATTO getDatosPersonalesSAT() {
		return datosPersonalesSAT;
	}
	public void setDatosPersonalesSAT(DatosPersonalesSATTO datosPersonalesSAT) {
		this.datosPersonalesSAT = datosPersonalesSAT;
	}
	public String getDesSituacion() {
		return desSituacion;
	}
	public void setDesSituacion(String desSituacion) {
		this.desSituacion = desSituacion;
	}
	public EscrituraConstitutivaTO getEscrituraConstitutiva() {
		return escrituraConstitutiva;
	}
	public void setEscrituraConstitutiva(EscrituraConstitutivaTO escrituraConstitutiva) {
		this.escrituraConstitutiva = escrituraConstitutiva;
	}
	public String getEstadosFormateados() {
		return estadosFormateados;
	}
	public void setEstadosFormateados(String estadosFormateados) {
		this.estadosFormateados = estadosFormateados;
	}
	public Date getFechaBaja() {
		return fechaBaja;
	}
	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getFechaCreacionFormateada() {
		return fechaCreacionFormateada;
	}
	public void setFechaCreacionFormateada(String fechaCreacionFormateada) {
		this.fechaCreacionFormateada = fechaCreacionFormateada;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public Long getIdActaConstitutiva() {
		return idActaConstitutiva;
	}
	public void setIdActaConstitutiva(Long idActaConstitutiva) {
		this.idActaConstitutiva = idActaConstitutiva;
	}
	public Integer getIdSituacion() {
		return idSituacion;
	}
	public void setIdSituacion(Integer idSituacion) {
		this.idSituacion = idSituacion;
	}
	public BigDecimal getIndAcreditado() {
		return indAcreditado;
	}
	public void setIndAcreditado(BigDecimal indAcreditado) {
		this.indAcreditado = indAcreditado;
	}
	public String getNrp() {
		return nrp;
	}
	public void setNrp(String nrp) {
		this.nrp = nrp;
	}
	public Integer getNumeroLineaArchivo() {
		return numeroLineaArchivo;
	}
	public void setNumeroLineaArchivo(Integer numeroLineaArchivo) {
		this.numeroLineaArchivo = numeroLineaArchivo;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public RegistroSindicatoTO getRegistroSindicato() {
		return registroSindicato;
	}
	public void setRegistroSindicato(RegistroSindicatoTO registroSindicato) {
		this.registroSindicato = registroSindicato;
	}
	public String getRfcSat() {
		return rfcSat;
	}
	public void setRfcSat(String rfcSat) {
		this.rfcSat = rfcSat;
	}
	public List<SituacionSATTO> getSituacionesSAT() {
		return situacionesSAT;
	}
	public void setSituacionesSAT(List<SituacionSATTO> situacionesSAT) {
		this.situacionesSAT = situacionesSAT;
	}
	public String getSubEstadosFormateados() {
		return subEstadosFormateados;
	}
	public void setSubEstadosFormateados(String subEstadosFormateados) {
		this.subEstadosFormateados = subEstadosFormateados;
	}
	public TipoSociedadTO getTipoSociedad() {
		return tipoSociedad;
	}
	public void setTipoSociedad(TipoSociedadTO tipoSociedad) {
		this.tipoSociedad = tipoSociedad;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actaConstitutiva == null) ? 0 : actaConstitutiva.hashCode());
		result = prime * result + ((altaEnImss == null) ? 0 : altaEnImss.hashCode());
		result = prime * result + ((busqAprox == null) ? 0 : busqAprox.hashCode());
		result = prime * result + ((cveMoral == null) ? 0 : cveMoral.hashCode());
		result = prime * result + ((datosPersonalesSAT == null) ? 0 : datosPersonalesSAT.hashCode());
		result = prime * result + ((desSituacion == null) ? 0 : desSituacion.hashCode());
		result = prime * result + ((escrituraConstitutiva == null) ? 0 : escrituraConstitutiva.hashCode());
		result = prime * result + ((estadosFormateados == null) ? 0 : estadosFormateados.hashCode());
		result = prime * result + ((fechaBaja == null) ? 0 : fechaBaja.hashCode());
		result = prime * result + ((fechaCreacion == null) ? 0 : fechaCreacion.hashCode());
		result = prime * result + ((fechaCreacionFormateada == null) ? 0 : fechaCreacionFormateada.hashCode());
		result = prime * result + ((fechaModificacion == null) ? 0 : fechaModificacion.hashCode());
		result = prime * result + ((fechaRegistro == null) ? 0 : fechaRegistro.hashCode());
		result = prime * result + ((idActaConstitutiva == null) ? 0 : idActaConstitutiva.hashCode());
		result = prime * result + ((idSituacion == null) ? 0 : idSituacion.hashCode());
		result = prime * result + ((indAcreditado == null) ? 0 : indAcreditado.hashCode());
		result = prime * result + ((nrp == null) ? 0 : nrp.hashCode());
		result = prime * result + ((numeroLineaArchivo == null) ? 0 : numeroLineaArchivo.hashCode());
		result = prime * result + ((razonSocial == null) ? 0 : razonSocial.hashCode());
		result = prime * result + ((registroSindicato == null) ? 0 : registroSindicato.hashCode());
		result = prime * result + ((rfcSat == null) ? 0 : rfcSat.hashCode());
		result = prime * result + ((situacionesSAT == null) ? 0 : situacionesSAT.hashCode());
		result = prime * result + ((subEstadosFormateados == null) ? 0 : subEstadosFormateados.hashCode());
		result = prime * result + ((tipoSociedad == null) ? 0 : tipoSociedad.hashCode());
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
		MoralTO other = (MoralTO) obj;
		if (actaConstitutiva == null) {
			if (other.actaConstitutiva != null)
				return false;
		} else if (!actaConstitutiva.equals(other.actaConstitutiva))
			return false;
		if (altaEnImss == null) {
			if (other.altaEnImss != null)
				return false;
		} else if (!altaEnImss.equals(other.altaEnImss))
			return false;
		if (busqAprox == null) {
			if (other.busqAprox != null)
				return false;
		} else if (!busqAprox.equals(other.busqAprox))
			return false;
		if (cveMoral == null) {
			if (other.cveMoral != null)
				return false;
		} else if (!cveMoral.equals(other.cveMoral))
			return false;
		if (datosPersonalesSAT == null) {
			if (other.datosPersonalesSAT != null)
				return false;
		} else if (!datosPersonalesSAT.equals(other.datosPersonalesSAT))
			return false;
		if (desSituacion == null) {
			if (other.desSituacion != null)
				return false;
		} else if (!desSituacion.equals(other.desSituacion))
			return false;
		if (escrituraConstitutiva == null) {
			if (other.escrituraConstitutiva != null)
				return false;
		} else if (!escrituraConstitutiva.equals(other.escrituraConstitutiva))
			return false;
		if (estadosFormateados == null) {
			if (other.estadosFormateados != null)
				return false;
		} else if (!estadosFormateados.equals(other.estadosFormateados))
			return false;
		if (fechaBaja == null) {
			if (other.fechaBaja != null)
				return false;
		} else if (!fechaBaja.equals(other.fechaBaja))
			return false;
		if (fechaCreacion == null) {
			if (other.fechaCreacion != null)
				return false;
		} else if (!fechaCreacion.equals(other.fechaCreacion))
			return false;
		if (fechaCreacionFormateada == null) {
			if (other.fechaCreacionFormateada != null)
				return false;
		} else if (!fechaCreacionFormateada.equals(other.fechaCreacionFormateada))
			return false;
		if (fechaModificacion == null) {
			if (other.fechaModificacion != null)
				return false;
		} else if (!fechaModificacion.equals(other.fechaModificacion))
			return false;
		if (fechaRegistro == null) {
			if (other.fechaRegistro != null)
				return false;
		} else if (!fechaRegistro.equals(other.fechaRegistro))
			return false;
		if (idActaConstitutiva == null) {
			if (other.idActaConstitutiva != null)
				return false;
		} else if (!idActaConstitutiva.equals(other.idActaConstitutiva))
			return false;
		if (idSituacion == null) {
			if (other.idSituacion != null)
				return false;
		} else if (!idSituacion.equals(other.idSituacion))
			return false;
		if (indAcreditado == null) {
			if (other.indAcreditado != null)
				return false;
		} else if (!indAcreditado.equals(other.indAcreditado))
			return false;
		if (nrp == null) {
			if (other.nrp != null)
				return false;
		} else if (!nrp.equals(other.nrp))
			return false;
		if (numeroLineaArchivo == null) {
			if (other.numeroLineaArchivo != null)
				return false;
		} else if (!numeroLineaArchivo.equals(other.numeroLineaArchivo))
			return false;
		if (razonSocial == null) {
			if (other.razonSocial != null)
				return false;
		} else if (!razonSocial.equals(other.razonSocial))
			return false;
		if (registroSindicato == null) {
			if (other.registroSindicato != null)
				return false;
		} else if (!registroSindicato.equals(other.registroSindicato))
			return false;
		if (rfcSat == null) {
			if (other.rfcSat != null)
				return false;
		} else if (!rfcSat.equals(other.rfcSat))
			return false;
		if (situacionesSAT == null) {
			if (other.situacionesSAT != null)
				return false;
		} else if (!situacionesSAT.equals(other.situacionesSAT))
			return false;
		if (subEstadosFormateados == null) {
			if (other.subEstadosFormateados != null)
				return false;
		} else if (!subEstadosFormateados.equals(other.subEstadosFormateados))
			return false;
		if (tipoSociedad == null) {
			if (other.tipoSociedad != null)
				return false;
		} else if (!tipoSociedad.equals(other.tipoSociedad))
			return false;
		return true;
	}
	
	
}
