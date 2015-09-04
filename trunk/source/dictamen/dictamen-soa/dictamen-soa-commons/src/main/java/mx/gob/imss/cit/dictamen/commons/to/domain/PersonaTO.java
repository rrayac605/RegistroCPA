package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;


public class PersonaTO  extends BaseTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3113373504944484530L;


	private long cveIdPersona;

	private String curp;

	private Date fecDefuncion;

	private Date fecNacimiento;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private BigDecimal indPerAutorizada;

	private String nomNombre;

	private String nomPrimerApellido;

	private String nomSegundoApellido;

	private BigDecimal numAnioNacReg;

	private BigDecimal numMesNacReg;

	private String observaciones;

	private String rfc;

	private List<FormaMigratoriaTO> ditFormaMigratorias;

	private CatEstadoTO dgCatEstado;

	private EstadoCivilTO dicEstadoCivil;

	private PaisTO dicPai;

	private SexoTO dicSexo;

	private List<PersonafContactoTO> ditPersonafContactos;

	private List<PersonafDomTO> ditPersonafDoms;

	private List<PersonaDefuncionTO> ditPersonaDefuncions;

	private List<PersonaDomExtranjeroTO> ditPersonaDomExtranjeros;

	private List<PersonaFisicaTO> ditPersonaFisicas;

	private List<RepresentanteLegalTO> ditRepresentanteLegals;

	private List<ContadorPublicoTO> ndtContadorPublicoAuts;

	/**
	 * @return the cveIdPersona
	 */
	public long getCveIdPersona() {
		return cveIdPersona;
	}

	/**
	 * @param cveIdPersona the cveIdPersona to set
	 */
	public void setCveIdPersona(long cveIdPersona) {
		this.cveIdPersona = cveIdPersona;
	}

	/**
	 * @return the curp
	 */
	public String getCurp() {
		return curp;
	}

	/**
	 * @param curp the curp to set
	 */
	public void setCurp(String curp) {
		this.curp = curp;
	}

	/**
	 * @return the fecDefuncion
	 */
	public Date getFecDefuncion() {
		return fecDefuncion != null ? (Date) fecDefuncion.clone() : null;
	}

	/**
	 * @param fecDefuncion the fecDefuncion to set
	 */
	public void setFecDefuncion(Date fecDefuncion) {
		this.fecDefuncion = fecDefuncion;
	}

	/**
	 * @return the fecNacimiento
	 */
	public Date getFecNacimiento() {
		return fecNacimiento != null ? (Date) fecNacimiento.clone() : null;
	}

	/**
	 * @param fecNacimiento the fecNacimiento to set
	 */
	public void setFecNacimiento(Date fecNacimiento) {
		this.fecNacimiento = fecNacimiento;
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
	 * @return the indPerAutorizada
	 */
	public BigDecimal getIndPerAutorizada() {
		return indPerAutorizada;
	}

	/**
	 * @param indPerAutorizada the indPerAutorizada to set
	 */
	public void setIndPerAutorizada(BigDecimal indPerAutorizada) {
		this.indPerAutorizada = indPerAutorizada;
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
	 * @return the nomPrimerApellido
	 */
	public String getNomPrimerApellido() {
		return nomPrimerApellido;
	}

	/**
	 * @param nomPrimerApellido the nomPrimerApellido to set
	 */
	public void setNomPrimerApellido(String nomPrimerApellido) {
		this.nomPrimerApellido = nomPrimerApellido;
	}

	/**
	 * @return the nomSegundoApellido
	 */
	public String getNomSegundoApellido() {
		return nomSegundoApellido;
	}

	/**
	 * @param nomSegundoApellido the nomSegundoApellido to set
	 */
	public void setNomSegundoApellido(String nomSegundoApellido) {
		this.nomSegundoApellido = nomSegundoApellido;
	}

	/**
	 * @return the numAnioNacReg
	 */
	public BigDecimal getNumAnioNacReg() {
		return numAnioNacReg;
	}

	/**
	 * @param numAnioNacReg the numAnioNacReg to set
	 */
	public void setNumAnioNacReg(BigDecimal numAnioNacReg) {
		this.numAnioNacReg = numAnioNacReg;
	}

	/**
	 * @return the numMesNacReg
	 */
	public BigDecimal getNumMesNacReg() {
		return numMesNacReg;
	}

	/**
	 * @param numMesNacReg the numMesNacReg to set
	 */
	public void setNumMesNacReg(BigDecimal numMesNacReg) {
		this.numMesNacReg = numMesNacReg;
	}

	/**
	 * @return the observaciones
	 */
	public String getObservaciones() {
		return observaciones;
	}

	/**
	 * @param observaciones the observaciones to set
	 */
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
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
	 * @return the ditFormaMigratorias
	 */
	public List<FormaMigratoriaTO> getDitFormaMigratorias() {
		return ditFormaMigratorias;
	}

	/**
	 * @param ditFormaMigratorias the ditFormaMigratorias to set
	 */
	public void setDitFormaMigratorias(List<FormaMigratoriaTO> ditFormaMigratorias) {
		this.ditFormaMigratorias = ditFormaMigratorias;
	}

	/**
	 * @return the dgCatEstado
	 */
	public CatEstadoTO getDgCatEstado() {
		return dgCatEstado;
	}

	/**
	 * @param dgCatEstado the dgCatEstado to set
	 */
	public void setDgCatEstado(CatEstadoTO dgCatEstado) {
		this.dgCatEstado = dgCatEstado;
	}

	/**
	 * @return the dicEstadoCivil
	 */
	public EstadoCivilTO getDicEstadoCivil() {
		return dicEstadoCivil;
	}

	/**
	 * @param dicEstadoCivil the dicEstadoCivil to set
	 */
	public void setDicEstadoCivil(EstadoCivilTO dicEstadoCivil) {
		this.dicEstadoCivil = dicEstadoCivil;
	}

	/**
	 * @return the dicPai
	 */
	public PaisTO getDicPai() {
		return dicPai;
	}

	/**
	 * @param dicPai the dicPai to set
	 */
	public void setDicPai(PaisTO dicPai) {
		this.dicPai = dicPai;
	}

	/**
	 * @return the dicSexo
	 */
	public SexoTO getDicSexo() {
		return dicSexo;
	}

	/**
	 * @param dicSexo the dicSexo to set
	 */
	public void setDicSexo(SexoTO dicSexo) {
		this.dicSexo = dicSexo;
	}

	/**
	 * @return the ditPersonafContactos
	 */
	public List<PersonafContactoTO> getDitPersonafContactos() {
		return ditPersonafContactos;
	}

	/**
	 * @param ditPersonafContactos the ditPersonafContactos to set
	 */
	public void setDitPersonafContactos(
			List<PersonafContactoTO> ditPersonafContactos) {
		this.ditPersonafContactos = ditPersonafContactos;
	}

	/**
	 * @return the ditPersonafDoms
	 */
	public List<PersonafDomTO> getDitPersonafDoms() {
		return ditPersonafDoms;
	}

	/**
	 * @param ditPersonafDoms the ditPersonafDoms to set
	 */
	public void setDitPersonafDoms(List<PersonafDomTO> ditPersonafDoms) {
		this.ditPersonafDoms = ditPersonafDoms;
	}

	/**
	 * @return the ditPersonaDefuncions
	 */
	public List<PersonaDefuncionTO> getDitPersonaDefuncions() {
		return ditPersonaDefuncions;
	}

	/**
	 * @param ditPersonaDefuncions the ditPersonaDefuncions to set
	 */
	public void setDitPersonaDefuncions(
			List<PersonaDefuncionTO> ditPersonaDefuncions) {
		this.ditPersonaDefuncions = ditPersonaDefuncions;
	}

	/**
	 * @return the ditPersonaDomExtranjeros
	 */
	public List<PersonaDomExtranjeroTO> getDitPersonaDomExtranjeros() {
		return ditPersonaDomExtranjeros;
	}

	/**
	 * @param ditPersonaDomExtranjeros the ditPersonaDomExtranjeros to set
	 */
	public void setDitPersonaDomExtranjeros(
			List<PersonaDomExtranjeroTO> ditPersonaDomExtranjeros) {
		this.ditPersonaDomExtranjeros = ditPersonaDomExtranjeros;
	}

	/**
	 * @return the ditPersonaFisicas
	 */
	public List<PersonaFisicaTO> getDitPersonaFisicas() {
		return ditPersonaFisicas;
	}

	/**
	 * @param ditPersonaFisicas the ditPersonaFisicas to set
	 */
	public void setDitPersonaFisicas(List<PersonaFisicaTO> ditPersonaFisicas) {
		this.ditPersonaFisicas = ditPersonaFisicas;
	}

	/**
	 * @return the ditRepresentanteLegals
	 */
	public List<RepresentanteLegalTO> getDitRepresentanteLegals() {
		return ditRepresentanteLegals;
	}

	/**
	 * @param ditRepresentanteLegals the ditRepresentanteLegals to set
	 */
	public void setDitRepresentanteLegals(
			List<RepresentanteLegalTO> ditRepresentanteLegals) {
		this.ditRepresentanteLegals = ditRepresentanteLegals;
	}

	/**
	 * @return the ndtContadorPublicoAuts
	 */
	public List<ContadorPublicoTO> getNdtContadorPublicoAuts() {
		return ndtContadorPublicoAuts;
	}

	/**
	 * @param ndtContadorPublicoAuts the ndtContadorPublicoAuts to set
	 */
	public void setNdtContadorPublicoAuts(
			List<ContadorPublicoTO> ndtContadorPublicoAuts) {
		this.ndtContadorPublicoAuts = ndtContadorPublicoAuts;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PersonaTO [cveIdPersona=" + cveIdPersona + ", curp=" + curp
				+ ", fecDefuncion=" + fecDefuncion + ", fecNacimiento="
				+ fecNacimiento + ", fecRegistroActualizado="
				+ fecRegistroActualizado + ", fecRegistroAlta="
				+ fecRegistroAlta + ", fecRegistroBaja=" + fecRegistroBaja
				+ ", indPerAutorizada=" + indPerAutorizada + ", nomNombre="
				+ nomNombre + ", nomPrimerApellido=" + nomPrimerApellido
				+ ", nomSegundoApellido=" + nomSegundoApellido
				+ ", numAnioNacReg=" + numAnioNacReg + ", numMesNacReg="
				+ numMesNacReg + ", observaciones=" + observaciones + ", rfc="
				+ rfc + ", ditFormaMigratorias=" + ditFormaMigratorias
				+ ", dgCatEstado=" + dgCatEstado + ", dicEstadoCivil="
				+ dicEstadoCivil + ", dicPai=" + dicPai + ", dicSexo="
				+ dicSexo + ", ditPersonafContactos=" + ditPersonafContactos
				+ ", ditPersonafDoms=" + ditPersonafDoms
				+ ", ditPersonaDefuncions=" + ditPersonaDefuncions
				+ ", ditPersonaDomExtranjeros=" + ditPersonaDomExtranjeros
				+ ", ditPersonaFisicas=" + ditPersonaFisicas
				+ ", ditRepresentanteLegals=" + ditRepresentanteLegals
				+ ", ndtContadorPublicoAuts=" + ndtContadorPublicoAuts + "]";
	}

		@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curp == null) ? 0 : curp.hashCode());
		result = prime * result + (int) (cveIdPersona ^ (cveIdPersona >>> 32));
		result = prime * result + ((fecDefuncion == null) ? 0 : fecDefuncion.hashCode());
		result = prime * result + ((fecNacimiento == null) ? 0 : fecNacimiento.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((indPerAutorizada == null) ? 0 : indPerAutorizada.hashCode());
		result = prime * result + ((nomNombre == null) ? 0 : nomNombre.hashCode());
		result = prime * result + ((nomPrimerApellido == null) ? 0 : nomPrimerApellido.hashCode());
		result = prime * result + ((nomSegundoApellido == null) ? 0 : nomSegundoApellido.hashCode());
		result = prime * result + ((numAnioNacReg == null) ? 0 : numAnioNacReg.hashCode());
		result = prime * result + ((numMesNacReg == null) ? 0 : numMesNacReg.hashCode());
		result = prime * result + ((observaciones == null) ? 0 : observaciones.hashCode());
		result = prime * result + ((rfc == null) ? 0 : rfc.hashCode());
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
		PersonaTO other = (PersonaTO) obj;
		if (curp == null) {
			if (other.curp != null)
				return false;
		} else if (!curp.equals(other.curp))
			return false;
		if (cveIdPersona != other.cveIdPersona)
			return false;
		if (fecDefuncion == null) {
			if (other.fecDefuncion != null)
				return false;
		} else if (!fecDefuncion.equals(other.fecDefuncion))
			return false;
		if (fecNacimiento == null) {
			if (other.fecNacimiento != null)
				return false;
		} else if (!fecNacimiento.equals(other.fecNacimiento))
			return false;
		if (fecRegistroActualizado == null) {
			if (other.fecRegistroActualizado != null)
				return false;
		} else if (!fecRegistroActualizado.equals(other.fecRegistroActualizado))
			return false;
		if (fecRegistroAlta == null) {
			if (other.fecRegistroAlta != null)
				return false;
		} else if (!fecRegistroAlta.equals(other.fecRegistroAlta))
			return false;
		if (fecRegistroBaja == null) {
			if (other.fecRegistroBaja != null)
				return false;
		} else if (!fecRegistroBaja.equals(other.fecRegistroBaja))
			return false;
		if (indPerAutorizada == null) {
			if (other.indPerAutorizada != null)
				return false;
		} else if (!indPerAutorizada.equals(other.indPerAutorizada))
			return false;
		if (nomNombre == null) {
			if (other.nomNombre != null)
				return false;
		} else if (!nomNombre.equals(other.nomNombre))
			return false;
		if (nomPrimerApellido == null) {
			if (other.nomPrimerApellido != null)
				return false;
		} else if (!nomPrimerApellido.equals(other.nomPrimerApellido))
			return false;
		if (nomSegundoApellido == null) {
			if (other.nomSegundoApellido != null)
				return false;
		} else if (!nomSegundoApellido.equals(other.nomSegundoApellido))
			return false;
		if (numAnioNacReg == null) {
			if (other.numAnioNacReg != null)
				return false;
		} else if (!numAnioNacReg.equals(other.numAnioNacReg))
			return false;
		if (numMesNacReg == null) {
			if (other.numMesNacReg != null)
				return false;
		} else if (!numMesNacReg.equals(other.numMesNacReg))
			return false;
		if (observaciones == null) {
			if (other.observaciones != null)
				return false;
		} else if (!observaciones.equals(other.observaciones))
			return false;
		if (rfc == null) {
			if (other.rfc != null)
				return false;
		} else if (!rfc.equals(other.rfc))
			return false;
		return true;
	}
	
}
