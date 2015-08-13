package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the NDT_COLEGIO_CONTADOR database table.
 * 
 */
@Entity
@Table(name="NDT_COLEGIO_CONTADOR")
@NamedQuery(name="NdtColegioContadorDO.findAll", query="SELECT n FROM NdtColegioContadorDO n")
public class NdtColegioContadorDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "CVE_ID_COLEGIO", nullable = false)
    @SequenceGenerator(name = "NdtColegioContador_Id_Seq_Gen", sequenceName = "SEQ_NDTCOLEGIOCONTADOR")
    @GeneratedValue(generator = "NdtColegioContador_Id_Seq_Gen")
	private long cveIdColegio;

	@Column(name="CVE_ID_USUARIO")
	private String cveIdUsuario;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to DitPersonaMoralDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA_MORAL")
	private DitPersonaMoralDO ditPersonaMoral;

	//bi-directional many-to-one association to NdtAsociacionDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_ASOCIACION")
	private NdtAsociacionDO ndtAsociacion;

	public NdtColegioContadorDO() {
	}

	public long getCveIdColegio() {
		return this.cveIdColegio;
	}

	public void setCveIdColegio(long cveIdColegio) {
		this.cveIdColegio = cveIdColegio;
	}

	public String getCveIdUsuario() {
		return this.cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
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

	public DitPersonaMoralDO getDitPersonaMoral() {
		return this.ditPersonaMoral;
	}

	public void setDitPersonaMoral(DitPersonaMoralDO ditPersonaMoral) {
		this.ditPersonaMoral = ditPersonaMoral;
	}

	public NdtAsociacionDO getNdtAsociacion() {
		return this.ndtAsociacion;
	}

	public void setNdtAsociacion(NdtAsociacionDO ndtAsociacion) {
		this.ndtAsociacion = ndtAsociacion;
	}

}