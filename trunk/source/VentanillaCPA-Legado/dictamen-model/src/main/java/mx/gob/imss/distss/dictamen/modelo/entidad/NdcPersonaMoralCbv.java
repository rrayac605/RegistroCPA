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
@Table(name="NDC_PERSONA_MORAL_CBV")
@NamedQuery(name="NdcPersonaMoralCbv.findAll", query="SELECT n FROM NdcPersonaMoralCbv n")
public class NdcPersonaMoralCbv implements Serializable {
	
	private static final long serialVersionUID = 7810175672621713258L;
	
	@Column(name="CVE_ID_PERSONA_MORAL", nullable=false)
	private Long cveIdPersonaMoral;

	@Column(name="CVE_ID_TIPO_SOCIEDAD")
	private Long cveIdTipoSociedad;

	@Column(name="DENOMINACION_RAZON_SOCIAL", length=255)
	private String denominacionRazonSocial;

	@Column(name="DES_CAMARA_ORGANIZACION", length=255)
	private String desCamaraOrganizacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="IND_ACREDITADO")
	private Long indAcreditado;

	@Column(name="IND_CONCURSO_MER")
	private Long indConcursoMer;

	@Column(name="NOMBRE_COMERCIAL", length=255)
	private String nombreComercial;

	@Column(length=50)
	private String rfc;

	public NdcPersonaMoralCbv() {
	}

}
