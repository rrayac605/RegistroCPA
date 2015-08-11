package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the NDC_COLEGIO database table.
 * 
 */
@Entity
@Table(name="NDC_COLEGIO")
@NamedQuery(name="NdcColegioDO.findAll", query="SELECT n FROM NdcColegioDO n")
public class NdcColegioDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_COLEGIO")
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

	@Column(name="NOM_NOMBRE")
	private String nomNombre;

	private String rfc;

	//bi-directional many-to-one association to DgDomicilioGeograficoDO
	@ManyToOne
	@JoinColumn(name="DOMICILIO_ID")
	private DgDomicilioGeograficoDO dgDomicilioGeografico;

	//bi-directional many-to-one association to NdcAsociacionDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_ASOCIACION")
	private NdcAsociacionDO ndcAsociacion;

	//bi-directional many-to-one association to NdtAcreditacionDO
	@OneToMany(mappedBy="ndcColegio")
	private List<NdtAcreditacionDO> ndtAcreditacions;

	//bi-directional many-to-one association to NdtColegioContactoDO
	@OneToMany(mappedBy="ndcColegio")
	private List<NdtColegioContactoDO> ndtColegioContactos;

	//bi-directional many-to-one association to NdtR3ColegioXcontadorDO
	@OneToMany(mappedBy="ndcColegio")
	private List<NdtR3ColegioXcontadorDO> ndtR3ColegioXcontadors;

	public NdcColegioDO() {
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

	public NdcAsociacionDO getNdcAsociacion() {
		return this.ndcAsociacion;
	}

	public void setNdcAsociacion(NdcAsociacionDO ndcAsociacion) {
		this.ndcAsociacion = ndcAsociacion;
	}

	public List<NdtAcreditacionDO> getNdtAcreditacions() {
		return this.ndtAcreditacions;
	}

	public void setNdtAcreditacions(List<NdtAcreditacionDO> ndtAcreditacions) {
		this.ndtAcreditacions = ndtAcreditacions;
	}


	public List<NdtColegioContactoDO> getNdtColegioContactos() {
		return this.ndtColegioContactos;
	}

	public void setNdtColegioContactos(List<NdtColegioContactoDO> ndtColegioContactos) {
		this.ndtColegioContactos = ndtColegioContactos;
	}

	public List<NdtR3ColegioXcontadorDO> getNdtR3ColegioXcontadors() {
		return this.ndtR3ColegioXcontadors;
	}

	public void setNdtR3ColegioXcontadors(List<NdtR3ColegioXcontadorDO> ndtR3ColegioXcontadors) {
		this.ndtR3ColegioXcontadors = ndtR3ColegioXcontadors;
	}

}