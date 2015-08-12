package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the NDC_DESPACHO database table.
 * 
 */
@Entity
@Table(name="NDC_DESPACHO")
@NamedQuery(name="NdcDespachoDO.findAll", query="SELECT n FROM NdcDespachoDO n")
public class NdcDespachoDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_DESPACHO")
	private long cveIdDespacho;

	@Column(name="CVE_ID_USUARIO")
	private String cveIdUsuario;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_ACTIVACION")
	private Date fecActivacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="IND_ACTIVO")
	private String indActivo;

	@Column(name="NOM_RAZON_SOCIAL")
	private String nomRazonSocial;

	@Column(name="REGISTRO_PATRONAL_U")
	private String registroPatronalU;

	private String rfc;

	//bi-directional many-to-one association to DgDomicilioGeograficoDO
	@ManyToOne
	@JoinColumn(name="DOMICILIO_ID")
	private DgDomicilioGeograficoDO dgDomicilioGeografico;

	//bi-directional many-to-one association to NdtDespachoContactoDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ndcDespacho")
	private List<NdtDespachoContactoDO> ndtDespachoContactos;

	//bi-directional many-to-one association to NdtR2DespachoDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ndcDespacho")
	private List<NdtR2DespachoDO> ndtR2Despachos;

	public NdcDespachoDO() {
	}

	public long getCveIdDespacho() {
		return this.cveIdDespacho;
	}

	public void setCveIdDespacho(long cveIdDespacho) {
		this.cveIdDespacho = cveIdDespacho;
	}

	public String getCveIdUsuario() {
		return this.cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public Date getFecActivacion() {
		return this.fecActivacion;
	}

	public void setFecActivacion(Date fecActivacion) {
		this.fecActivacion = fecActivacion;
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

	public String getIndActivo() {
		return this.indActivo;
	}

	public void setIndActivo(String indActivo) {
		this.indActivo = indActivo;
	}

	public String getNomRazonSocial() {
		return this.nomRazonSocial;
	}

	public void setNomRazonSocial(String nomRazonSocial) {
		this.nomRazonSocial = nomRazonSocial;
	}

	public String getRegistroPatronalU() {
		return this.registroPatronalU;
	}

	public void setRegistroPatronalU(String registroPatronalU) {
		this.registroPatronalU = registroPatronalU;
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

	public List<NdtDespachoContactoDO> getNdtDespachoContactos() {
		return this.ndtDespachoContactos;
	}

	public void setNdtDespachoContactos(List<NdtDespachoContactoDO> ndtDespachoContactos) {
		this.ndtDespachoContactos = ndtDespachoContactos;
	}

	public List<NdtR2DespachoDO> getNdtR2Despachos() {
		return this.ndtR2Despachos;
	}

	public void setNdtR2Despachos(List<NdtR2DespachoDO> ndtR2Despachos) {
		this.ndtR2Despachos = ndtR2Despachos;
	}

}