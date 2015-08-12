package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the NDC_ASOCIACION database table.
 * 
 */
@Entity
@Table(name="NDC_ASOCIACION")
@NamedQuery(name="NdcAsociacionDO.findAll", query="SELECT n FROM NdcAsociacionDO n")
public class NdcAsociacionDO implements Serializable {
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

	@Column(name="NOM_NOMBRE")
	private String nomNombre;

	private String rfc;

	//bi-directional many-to-one association to DgDomicilioGeograficoDO
	@ManyToOne
	@JoinColumn(name="DOMICILIO_ID")
	private DgDomicilioGeograficoDO dgDomicilioGeografico;

	//bi-directional many-to-one association to NdcColegioDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ndcAsociacion")
	private List<NdcColegioDO> ndcColegios;

	//bi-directional many-to-one association to NdtAsociacionContactoDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ndcAsociacion")
	private List<NdtAsociacionContactoDO> ndtAsociacionContactos;

	public NdcAsociacionDO() {
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

	public String getNomNombre() {
		return this.nomNombre;
	}

	public void setNomNombre(String nomNombre) {
		this.nomNombre = nomNombre;
	}

	public String getRfc() {
		return this.rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public DgDomicilioGeograficoDO getDgDomicilioGeografico() {
		return this.dgDomicilioGeografico;
	}

	public void setDgDomicilioGeografico(DgDomicilioGeograficoDO dgDomicilioGeografico) {
		this.dgDomicilioGeografico = dgDomicilioGeografico;
	}

	public List<NdcColegioDO> getNdcColegios() {
		return this.ndcColegios;
	}

	public void setNdcColegios(List<NdcColegioDO> ndcColegios) {
		this.ndcColegios = ndcColegios;
	}

	public List<NdtAsociacionContactoDO> getNdtAsociacionContactos() {
		return this.ndtAsociacionContactos;
	}

	public void setNdtAsociacionContactos(List<NdtAsociacionContactoDO> ndtAsociacionContactos) {
		this.ndtAsociacionContactos = ndtAsociacionContactos;
	}
}