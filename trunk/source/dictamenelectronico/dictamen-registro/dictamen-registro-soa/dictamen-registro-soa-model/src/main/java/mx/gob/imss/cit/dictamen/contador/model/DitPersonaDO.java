package mx.gob.imss.cit.dictamen.contador.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="DIT_PERSONA")
public class DitPersonaDO implements Serializable{
	
	private static final long serialVersionUID = -1515601554724454209L;

	@Id
    @SequenceGenerator(name = "DIT_PERSONA_CVEIDPERSONA_GENERATOR", sequenceName = "SEQ_DITPERSONA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DIT_PERSONA_CVEIDPERSONA_GENERATOR")
	@Column(name="CVE_ID_PERSONA", nullable=false)
	private Long cveIdPersona;

	@Column(name="CVE_ID_PAIS")
	private Long cveIdPais;
	
	@Column(name="CVE_ID_SEXO")
	private Integer cveIdSexo;
	
	@Column(name="CVE_ID_ESTADO_CIVIL")
	private Integer cveIdEstadoCivil;

	@Column(name="NOM_NOMBRE", length=255)
	private String nomNombre;

	@Column(name="NOM_PRIMER_APELLIDO", length=255)
	private String nomPrimerApellido;

	@Column(name="NOM_SEGUNDO_APELLIDO", length=255)
	private String nomSegundoApellido;
	
	@Column(name="CURP", length=50)
	private String curp;

	@Column(name="RFC",length=50)
	private String rfc;
	
	@Temporal( TemporalType.TIMESTAMP)
	@Column(name="FEC_NACIMIENTO")
	private Date fecNacimiento;
	
	@Column(name="OBSERVACIONES",length=255)
	private String observaciones;
	
	@Column(name="IND_PER_AUTORIZADA")
	private Long indPerAutorizada;
	
	@Column(name="NUM_ANIO_NAC_REG")
	private Integer numAnioNacReg;
	
	@Column(name="NUM_MES_NAC_REG")
	private Integer numMesNacReg;
	
	@Temporal( TemporalType.TIMESTAMP)
	@Column(name="FEC_DEFUNCION")
	private Date fecDefuncion;
	
	@Temporal( TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;
	
	@Temporal( TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;
	
	@Temporal( TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	public DitPersonaDO() {
	}

	public Long getCveIdPersona() {
		return cveIdPersona;
	}

	public void setCveIdPersona(Long cveIdPersona) {
		this.cveIdPersona = cveIdPersona;
	}

	public Long getCveIdPais() {
		return cveIdPais;
	}

	public void setCveIdPais(Long cveIdPais) {
		this.cveIdPais = cveIdPais;
	}

	public Integer getCveIdSexo() {
		return cveIdSexo;
	}

	public void setCveIdSexo(Integer cveIdSexo) {
		this.cveIdSexo = cveIdSexo;
	}

	public Integer getCveIdEstadoCivil() {
		return cveIdEstadoCivil;
	}

	public void setCveIdEstadoCivil(Integer cveIdEstadoCivil) {
		this.cveIdEstadoCivil = cveIdEstadoCivil;
	}

	public String getNomNombre() {
		return nomNombre;
	}

	public void setNomNombre(String nomNombre) {
		this.nomNombre = nomNombre;
	}

	public String getNomPrimerApellido() {
		return nomPrimerApellido;
	}

	public void setNomPrimerApellido(String nomPrimerApellido) {
		this.nomPrimerApellido = nomPrimerApellido;
	}

	public String getNomSegundoApellido() {
		return nomSegundoApellido;
	}

	public void setNomSegundoApellido(String nomSegundoApellido) {
		this.nomSegundoApellido = nomSegundoApellido;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public Date getFecNacimiento() {
		return fecNacimiento;
	}

	public void setFecNacimiento(Date fecNacimiento) {
		this.fecNacimiento = fecNacimiento;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Long getIndPerAutorizada() {
		return indPerAutorizada;
	}

	public void setIndPerAutorizada(Long indPerAutorizada) {
		this.indPerAutorizada = indPerAutorizada;
	}

	public Integer getNumAnioNacReg() {
		return numAnioNacReg;
	}

	public void setNumAnioNacReg(Integer numAnioNacReg) {
		this.numAnioNacReg = numAnioNacReg;
	}

	public Integer getNumMesNacReg() {
		return numMesNacReg;
	}

	public void setNumMesNacReg(Integer numMesNacReg) {
		this.numMesNacReg = numMesNacReg;
	}

	public Date getFecDefuncion() {
		return fecDefuncion;
	}

	public void setFecDefuncion(Date fecDefuncion) {
		this.fecDefuncion = fecDefuncion;
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
	
}
