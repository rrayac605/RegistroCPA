package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the NDT_ASOCIACION database table.
 * 
 */
@Entity
@Table(name="NDT_ASOCIACION")
@NamedQuery(name="NdtAsociacionDO.findAll", query="SELECT n FROM NdtAsociacionDO n")
public class NdtAsociacionDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_ASOCIACION")
	private long cveIdAsociacion;

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

	//bi-directional many-to-one association to NdtColegioContadorDO
	@OneToMany(mappedBy="ndtAsociacion")
	private List<NdtColegioContadorDO> ndtColegioContadors;

	public NdtAsociacionDO() {
	}

	public long getCveIdAsociacion() {
		return this.cveIdAsociacion;
	}

	public void setCveIdAsociacion(long cveIdAsociacion) {
		this.cveIdAsociacion = cveIdAsociacion;
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

	public List<NdtColegioContadorDO> getNdtColegioContadors() {
		return this.ndtColegioContadors;
	}

	public void setNdtColegioContadors(List<NdtColegioContadorDO> ndtColegioContadors) {
		this.ndtColegioContadors = ndtColegioContadors;
	}

}