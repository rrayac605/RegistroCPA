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

}