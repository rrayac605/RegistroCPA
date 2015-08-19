package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIT_PERSONA database table.
 * 
 */
@Entity
@Table(name="DIT_PERSONA")
@NamedQuery(name="DitPersonaDO.findAll", query="SELECT d FROM DitPersonaDO d")
public class DitPersonaDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @SequenceGenerator(name = "DIT_PERSONA_CVEIDPERSONA_GENERATOR", sequenceName = "SEQ_DITPERSONA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DIT_PERSONA_CVEIDPERSONA_GENERATOR")
	@Column(name="CVE_ID_PERSONA", nullable=false, precision=22)
	private long cveIdPersona;

	private String curp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_DEFUNCION")
	private Date fecDefuncion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_NACIMIENTO")
	private Date fecNacimiento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="IND_PER_AUTORIZADA")
	private BigDecimal indPerAutorizada;

	@Column(name="NOM_NOMBRE")
	private String nomNombre;

	@Column(name="NOM_PRIMER_APELLIDO")
	private String nomPrimerApellido;

	@Column(name="NOM_SEGUNDO_APELLIDO")
	private String nomSegundoApellido;

	@Column(name="NUM_ANIO_NAC_REG")
	private BigDecimal numAnioNacReg;

	@Column(name="NUM_MES_NAC_REG")
	private BigDecimal numMesNacReg;

	private String observaciones;

	private String rfc;

	//bi-directional many-to-one association to DitFormaMigratoriaDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersona")
	private List<DitFormaMigratoriaDO> ditFormaMigratorias;

	//bi-directional many-to-one association to DgCatEstadoDO
	@ManyToOne
	@JoinColumn(name="CVE_ENT")
	private DgCatEstadoDO dgCatEstado;

	//bi-directional many-to-one association to DicEstadoCivilDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_ESTADO_CIVIL")
	private DicEstadoCivilDO dicEstadoCivil;

	//bi-directional many-to-one association to DicPaisDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PAIS")
	private DicPaisDO dicPai;

	//bi-directional many-to-one association to DicSexoDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_SEXO")
	private DicSexoDO dicSexo;

	//bi-directional many-to-one association to DitPersonafContactoDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersona")
	private List<DitPersonafContactoDO> ditPersonafContactos;

	//bi-directional many-to-one association to DitPersonafDomDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersona")
	private List<DitPersonafDomDO> ditPersonafDoms;

	//bi-directional many-to-one association to DitPersonaDefuncionDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersona")
	private List<DitPersonaDefuncionDO> ditPersonaDefuncions;

	//bi-directional many-to-one association to DitPersonaDomExtranjeroDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersona")
	private List<DitPersonaDomExtranjeroDO> ditPersonaDomExtranjeros;

	//bi-directional many-to-one association to DitPersonaFisicaDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersona")
	private List<DitPersonaFisicaDO> ditPersonaFisicas;

	//bi-directional many-to-one association to DitRepresentanteLegalDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersona")
	private List<DitRepresentanteLegalDO> ditRepresentanteLegals;

	//bi-directional many-to-one association to NdtContadorPublicoAutDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersona")
	private List<NdtContadorPublicoAutDO> ndtContadorPublicoAuts;

	public DitPersonaDO() {
	}

	public long getCveIdPersona() {
		return this.cveIdPersona;
	}

	public void setCveIdPersona(long cveIdPersona) {
		this.cveIdPersona = cveIdPersona;
	}

	public String getCurp() {
		return this.curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public Date getFecDefuncion() {
		return this.fecDefuncion;
	}

	public void setFecDefuncion(Date fecDefuncion) {
		this.fecDefuncion = fecDefuncion;
	}

	public Date getFecNacimiento() {
		return this.fecNacimiento;
	}

	public void setFecNacimiento(Date fecNacimiento) {
		this.fecNacimiento = fecNacimiento;
	}

	public Date getFecRegistroActualizado() {
		return this.fecRegistroActualizado;
	}

	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	public Date getFecRegistroAlta() {
		return this.fecRegistroAlta;
	}

	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	public Date getFecRegistroBaja() {
		return this.fecRegistroBaja;
	}

	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	public BigDecimal getIndPerAutorizada() {
		return this.indPerAutorizada;
	}

	public void setIndPerAutorizada(BigDecimal indPerAutorizada) {
		this.indPerAutorizada = indPerAutorizada;
	}

	public String getNomNombre() {
		return this.nomNombre;
	}

	public void setNomNombre(String nomNombre) {
		this.nomNombre = nomNombre;
	}

	public String getNomPrimerApellido() {
		return this.nomPrimerApellido;
	}

	public void setNomPrimerApellido(String nomPrimerApellido) {
		this.nomPrimerApellido = nomPrimerApellido;
	}

	public String getNomSegundoApellido() {
		return this.nomSegundoApellido;
	}

	public void setNomSegundoApellido(String nomSegundoApellido) {
		this.nomSegundoApellido = nomSegundoApellido;
	}

	public BigDecimal getNumAnioNacReg() {
		return this.numAnioNacReg;
	}

	public void setNumAnioNacReg(BigDecimal numAnioNacReg) {
		this.numAnioNacReg = numAnioNacReg;
	}

	public BigDecimal getNumMesNacReg() {
		return this.numMesNacReg;
	}

	public void setNumMesNacReg(BigDecimal numMesNacReg) {
		this.numMesNacReg = numMesNacReg;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getRfc() {
		return this.rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public List<DitFormaMigratoriaDO> getDitFormaMigratorias() {
		return this.ditFormaMigratorias;
	}

	public void setDitFormaMigratorias(List<DitFormaMigratoriaDO> ditFormaMigratorias) {
		this.ditFormaMigratorias = ditFormaMigratorias;
	}

	public DgCatEstadoDO getDgCatEstado() {
		return this.dgCatEstado;
	}

	public void setDgCatEstado(DgCatEstadoDO dgCatEstado) {
		this.dgCatEstado = dgCatEstado;
	}

	public DicEstadoCivilDO getDicEstadoCivil() {
		return this.dicEstadoCivil;
	}

	public void setDicEstadoCivil(DicEstadoCivilDO dicEstadoCivil) {
		this.dicEstadoCivil = dicEstadoCivil;
	}

	public DicPaisDO getDicPai() {
		return this.dicPai;
	}

	public void setDicPai(DicPaisDO dicPai) {
		this.dicPai = dicPai;
	}

	public DicSexoDO getDicSexo() {
		return this.dicSexo;
	}

	public void setDicSexo(DicSexoDO dicSexo) {
		this.dicSexo = dicSexo;
	}

	public List<DitPersonafContactoDO> getDitPersonafContactos() {
		return this.ditPersonafContactos;
	}

	public void setDitPersonafContactos(List<DitPersonafContactoDO> ditPersonafContactos) {
		this.ditPersonafContactos = ditPersonafContactos;
	}

	public List<DitPersonafDomDO> getDitPersonafDoms() {
		return this.ditPersonafDoms;
	}

	public void setDitPersonafDoms(List<DitPersonafDomDO> ditPersonafDoms) {
		this.ditPersonafDoms = ditPersonafDoms;
	}
	
	public List<DitPersonaDefuncionDO> getDitPersonaDefuncions() {
		return this.ditPersonaDefuncions;
	}

	public void setDitPersonaDefuncions(List<DitPersonaDefuncionDO> ditPersonaDefuncions) {
		this.ditPersonaDefuncions = ditPersonaDefuncions;
	}

	public List<DitPersonaDomExtranjeroDO> getDitPersonaDomExtranjeros() {
		return this.ditPersonaDomExtranjeros;
	}

	public void setDitPersonaDomExtranjeros(List<DitPersonaDomExtranjeroDO> ditPersonaDomExtranjeros) {
		this.ditPersonaDomExtranjeros = ditPersonaDomExtranjeros;
	}
	
	public List<DitPersonaFisicaDO> getDitPersonaFisicas() {
		return this.ditPersonaFisicas;
	}

	public void setDitPersonaFisicas(List<DitPersonaFisicaDO> ditPersonaFisicas) {
		this.ditPersonaFisicas = ditPersonaFisicas;
	}

	public List<DitRepresentanteLegalDO> getDitRepresentanteLegals() {
		return this.ditRepresentanteLegals;
	}

	public void setDitRepresentanteLegals(List<DitRepresentanteLegalDO> ditRepresentanteLegals) {
		this.ditRepresentanteLegals = ditRepresentanteLegals;
	}

	public List<NdtContadorPublicoAutDO> getNdtContadorPublicoAuts() {
		return this.ndtContadorPublicoAuts;
	}

	public void setNdtContadorPublicoAuts(List<NdtContadorPublicoAutDO> ndtContadorPublicoAuts) {
		this.ndtContadorPublicoAuts = ndtContadorPublicoAuts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curp == null) ? 0 : curp.hashCode());
		result = prime * result + (int) (cveIdPersona ^ (cveIdPersona >>> 32));
		result = prime * result + ((dgCatEstado == null) ? 0 : dgCatEstado.hashCode());
		result = prime * result + ((dicEstadoCivil == null) ? 0 : dicEstadoCivil.hashCode());
		result = prime * result + ((dicPai == null) ? 0 : dicPai.hashCode());
		result = prime * result + ((dicSexo == null) ? 0 : dicSexo.hashCode());
		result = prime * result + ((ditFormaMigratorias == null) ? 0 : ditFormaMigratorias.hashCode());
		result = prime * result + ((ditPersonaDefuncions == null) ? 0 : ditPersonaDefuncions.hashCode());
		result = prime * result + ((ditPersonaDomExtranjeros == null) ? 0 : ditPersonaDomExtranjeros.hashCode());
		result = prime * result + ((ditPersonaFisicas == null) ? 0 : ditPersonaFisicas.hashCode());
		result = prime * result + ((ditPersonafContactos == null) ? 0 : ditPersonafContactos.hashCode());
		result = prime * result + ((ditPersonafDoms == null) ? 0 : ditPersonafDoms.hashCode());
		result = prime * result + ((ditRepresentanteLegals == null) ? 0 : ditRepresentanteLegals.hashCode());
		result = prime * result + ((fecDefuncion == null) ? 0 : fecDefuncion.hashCode());
		result = prime * result + ((fecNacimiento == null) ? 0 : fecNacimiento.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((indPerAutorizada == null) ? 0 : indPerAutorizada.hashCode());
		result = prime * result + ((ndtContadorPublicoAuts == null) ? 0 : ndtContadorPublicoAuts.hashCode());
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
		DitPersonaDO other = (DitPersonaDO) obj;
		if (curp == null) {
			if (other.curp != null)
				return false;
		} else if (!curp.equals(other.curp))
			return false;
		if (cveIdPersona != other.cveIdPersona)
			return false;
		if (dgCatEstado == null) {
			if (other.dgCatEstado != null)
				return false;
		} else if (!dgCatEstado.equals(other.dgCatEstado))
			return false;
		if (dicEstadoCivil == null) {
			if (other.dicEstadoCivil != null)
				return false;
		} else if (!dicEstadoCivil.equals(other.dicEstadoCivil))
			return false;
		if (dicPai == null) {
			if (other.dicPai != null)
				return false;
		} else if (!dicPai.equals(other.dicPai))
			return false;
		if (dicSexo == null) {
			if (other.dicSexo != null)
				return false;
		} else if (!dicSexo.equals(other.dicSexo))
			return false;
		if (ditFormaMigratorias == null) {
			if (other.ditFormaMigratorias != null)
				return false;
		} else if (!ditFormaMigratorias.equals(other.ditFormaMigratorias))
			return false;
		if (ditPersonaDefuncions == null) {
			if (other.ditPersonaDefuncions != null)
				return false;
		} else if (!ditPersonaDefuncions.equals(other.ditPersonaDefuncions))
			return false;
		if (ditPersonaDomExtranjeros == null) {
			if (other.ditPersonaDomExtranjeros != null)
				return false;
		} else if (!ditPersonaDomExtranjeros.equals(other.ditPersonaDomExtranjeros))
			return false;
		if (ditPersonaFisicas == null) {
			if (other.ditPersonaFisicas != null)
				return false;
		} else if (!ditPersonaFisicas.equals(other.ditPersonaFisicas))
			return false;
		if (ditPersonafContactos == null) {
			if (other.ditPersonafContactos != null)
				return false;
		} else if (!ditPersonafContactos.equals(other.ditPersonafContactos))
			return false;
		if (ditPersonafDoms == null) {
			if (other.ditPersonafDoms != null)
				return false;
		} else if (!ditPersonafDoms.equals(other.ditPersonafDoms))
			return false;
		if (ditRepresentanteLegals == null) {
			if (other.ditRepresentanteLegals != null)
				return false;
		} else if (!ditRepresentanteLegals.equals(other.ditRepresentanteLegals))
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
		if (ndtContadorPublicoAuts == null) {
			if (other.ndtContadorPublicoAuts != null)
				return false;
		} else if (!ndtContadorPublicoAuts.equals(other.ndtContadorPublicoAuts))
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