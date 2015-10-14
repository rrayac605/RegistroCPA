package mx.gob.imss.distss.dictamen.modelo.entidad;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="NDT_R2_DESPACHO")
@NamedQuery(name="NdtR2Despacho.findAll", query="SELECT n FROM NdtR2Despacho n")
public class NdtR2Despacho implements Serializable {
	
	private static final long serialVersionUID = -6532852967087038643L;
	
	@Id
	@Column(name="CVE_ID_R2_DESPACHO", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtR2Despacho_Id_Seq_Gen", sequenceName = "SEQ_NDTR2DESPACHO")
    @GeneratedValue(generator = "NdtR2Despacho_Id_Seq_Gen")
	private Long cveIdR2Despacho;

	@Column(name="CARGO_QUE_DESEMPENA", length=50)
	private String cargoQueDesempena;

	@Column(name="CVE_ID_PMDOM_FISCAL")
	private Long cveIdPmdomFiscal;

	@Column(name="CVE_ID_USUARIO", length=18)
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

	@Column(name="IND_ACTIVO", precision=1)
	private Long indActivo;

	@Column(name="IND_CUENTACON_TRAB", length=2)
	private String indCuentaconTrab;

	@Column(name="IND_TIPO_CPA")
	private Long indTipoCpa;

	@Column(name="NUM_TRABAJADORES_CONTRATADOS")
	private Long numTrabajadoresContratados;

	//bi-directional many-to-one association to NdtContadorPublicoAut
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_CPA", nullable=false)
	private NdtContadorPublicoAut ndtContadorPublicoAut;

	//bi-directional many-to-one association to NdtCpaTramite
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_CPA_TRAMITE")
	private NdtCpaTramite ndtCpaTramite;

	//bi-directional many-to-one association to NdtDespachos
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_DESPACHO")
	private NdtDespachos ndtDespacho;

	//bi-directional many-to-one association to NdtR2Formacontacto
	@OneToMany(mappedBy="ndtR2Despacho", cascade=CascadeType.ALL)
	private List<NdtR2Formacontacto> listNdtR2Formacontactos;

	public NdtR2Despacho() {
	}

	public Long getCveIdR2Despacho() {
		return cveIdR2Despacho;
	}

	public void setCveIdR2Despacho(Long cveIdR2Despacho) {
		this.cveIdR2Despacho = cveIdR2Despacho;
	}

	public String getCargoQueDesempena() {
		return cargoQueDesempena;
	}

	public void setCargoQueDesempena(String cargoQueDesempena) {
		this.cargoQueDesempena = cargoQueDesempena;
	}

	public Long getCveIdPmdomFiscal() {
		return cveIdPmdomFiscal;
	}

	public void setCveIdPmdomFiscal(Long cveIdPmdomFiscal) {
		this.cveIdPmdomFiscal = cveIdPmdomFiscal;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public Date getFecActivacion() {
		return fecActivacion;
	}

	public void setFecActivacion(Date fecActivacion) {
		this.fecActivacion = fecActivacion;
	}

	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado;
	}

	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
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

	public Long getIndActivo() {
		return indActivo;
	}

	public void setIndActivo(Long indActivo) {
		this.indActivo = indActivo;
	}

	public String getIndCuentaconTrab() {
		return indCuentaconTrab;
	}

	public void setIndCuentaconTrab(String indCuentaconTrab) {
		this.indCuentaconTrab = indCuentaconTrab;
	}

	public Long getIndTipoCpa() {
		return indTipoCpa;
	}

	public void setIndTipoCpa(Long indTipoCpa) {
		this.indTipoCpa = indTipoCpa;
	}

	public Long getNumTrabajadoresContratados() {
		return numTrabajadoresContratados;
	}

	public void setNumTrabajadoresContratados(Long numTrabajadoresContratados) {
		this.numTrabajadoresContratados = numTrabajadoresContratados;
	}

	public NdtContadorPublicoAut getNdtContadorPublicoAut() {
		return ndtContadorPublicoAut;
	}

	public void setNdtContadorPublicoAut(NdtContadorPublicoAut ndtContadorPublicoAut) {
		this.ndtContadorPublicoAut = ndtContadorPublicoAut;
	}

	public NdtCpaTramite getNdtCpaTramite() {
		return ndtCpaTramite;
	}

	public void setNdtCpaTramite(NdtCpaTramite ndtCpaTramite) {
		this.ndtCpaTramite = ndtCpaTramite;
	}

	public NdtDespachos getNdtDespacho() {
		return ndtDespacho;
	}

	public void setNdtDespacho(NdtDespachos ndtDespacho) {
		this.ndtDespacho = ndtDespacho;
	}

	public List<NdtR2Formacontacto> getListNdtR2Formacontactos() {
		return listNdtR2Formacontactos;
	}

	public void setListNdtR2Formacontactos(List<NdtR2Formacontacto> listNdtR2Formacontactos) {
		this.listNdtR2Formacontactos = listNdtR2Formacontactos;
	}

}