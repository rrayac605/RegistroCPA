package mx.gob.imss.distss.dictamen.modelo.entidad;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
@Table(name="NDT_CARGA_ASEVERACIONES")
@NamedQuery(name="NdtCargaAseveraciones.findAll", query="SELECT n FROM NdtCargaAseveraciones n")
public class NdtCargaAseveraciones implements Serializable {
	
	private static final long serialVersionUID = -7897507977379594190L;
	
	@Id
	@Column(name="CVE_ID_BITACORA_CARGA_ASEV", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtCargaAseveraciones_Id_Seq_Gen", sequenceName = "SEQ_NDTCARGAASEVERACIONES")
    @GeneratedValue(generator = "NdtCargaAseveraciones_Id_Seq_Gen")
	private Long cveIdBitacoraCargaAsev;

	@Column(name="CVE_ID_USUARIO", length=20)
	private String cveIdUsuario;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_FECHA_CARGA")
	private Date fecFechaCarga;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to NdtBitacoraErrores
	@OneToMany(mappedBy="ndtCargaAseveracione")
	private List<NdtBitacoraErrores> listNdtBitacoraErrores;

	//bi-directional many-to-one association to NdcAseveraciones
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_ASEVERACION")
	private NdcAseveraciones ndcAseveracione;

	//bi-directional many-to-one association to NdcStatusCargaAseveraciones
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_STATUS_CARGA")
	private NdcStatusCargaAseveraciones ndcStatusCargaAseveracione;

	//bi-directional many-to-one association to NdtPatronDictamen
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_PATRON_DICTAMEN")
	private NdtPatronDictamen ndtPatronDictamen;

	public NdtCargaAseveraciones() {
	}

	public Long getCveIdBitacoraCargaAsev() {
		return cveIdBitacoraCargaAsev;
	}

	public void setCveIdBitacoraCargaAsev(Long cveIdBitacoraCargaAsev) {
		this.cveIdBitacoraCargaAsev = cveIdBitacoraCargaAsev;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public Date getFecFechaCarga() {
		return fecFechaCarga;
	}

	public void setFecFechaCarga(Date fecFechaCarga) {
		this.fecFechaCarga = fecFechaCarga;
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

	public List<NdtBitacoraErrores> getListNdtBitacoraErrores() {
		return listNdtBitacoraErrores;
	}

	public void setListNdtBitacoraErrores(List<NdtBitacoraErrores> listNdtBitacoraErrores) {
		this.listNdtBitacoraErrores = listNdtBitacoraErrores;
	}

	public NdcAseveraciones getNdcAseveracione() {
		return ndcAseveracione;
	}

	public void setNdcAseveracione(NdcAseveraciones ndcAseveracione) {
		this.ndcAseveracione = ndcAseveracione;
	}

	public NdcStatusCargaAseveraciones getNdcStatusCargaAseveracione() {
		return ndcStatusCargaAseveracione;
	}

	public void setNdcStatusCargaAseveracione(NdcStatusCargaAseveraciones ndcStatusCargaAseveracione) {
		this.ndcStatusCargaAseveracione = ndcStatusCargaAseveracione;
	}

	public NdtPatronDictamen getNdtPatronDictamen() {
		return ndtPatronDictamen;
	}

	public void setNdtPatronDictamen(NdtPatronDictamen ndtPatronDictamen) {
		this.ndtPatronDictamen = ndtPatronDictamen;
	}

}
