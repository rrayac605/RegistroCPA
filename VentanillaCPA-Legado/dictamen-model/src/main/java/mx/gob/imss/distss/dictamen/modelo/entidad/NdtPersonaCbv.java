package mx.gob.imss.distss.dictamen.modelo.entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="NDT_PERSONA_CBV")
@NamedQuery(name="NdtPersonaCbv.findAll", query="SELECT n FROM NdtPersonaCbv n")
public class NdtPersonaCbv implements Serializable {
	
	private static final long serialVersionUID = 1226273010572529183L;
	
	@Column(name="CURP", length=50)
	private String curp;

	@Column(name="CVE_ENT", length=2)
	private String cveEnt;

	@Column(name="CVE_ID_ESTADO_CIVIL")
	private Long cveIdEstadoCivil;

	@Column(name="CVE_ID_PAIS")
	private Long cveIdPais;

	@Column(name="CVE_ID_PERSONA")
	private Long cveIdPersona;

	@Column(name="CVE_ID_SEXO")
	private Long cveIdSexo;

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
	private Long indPerAutorizada;

	@Column(name="NOM_NOMBRE", length=255)
	private String nomNombre;

	@Column(name="NOM_PRIMER_APELLIDO", length=255)
	private String nomPrimerApellido;

	@Column(name="NOM_SEGUNDO_APELLIDO", length=255)
	private String nomSegundoApellido;

	@Column(name="NUM_ANIO_NAC_REG", precision=2)
	private Long numAnioNacReg;

	@Column(name="NUM_MES_NAC_REG", precision=2)
	private Long numMesNacReg;

	@Column(name="OBSERVACIONES", length=255)
	private String observaciones;

	@Column(name="RFC", length=50)
	private String rfc;

	public NdtPersonaCbv() {
	}

}
