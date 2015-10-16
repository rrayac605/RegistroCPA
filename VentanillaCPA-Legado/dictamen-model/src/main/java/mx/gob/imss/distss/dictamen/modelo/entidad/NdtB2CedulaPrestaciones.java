package mx.gob.imss.distss.dictamen.modelo.entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="NDT_B2_CEDULA_PRESTACIONES")
@NamedQuery(name="NdtB2CedulaPrestaciones.findAll", query="SELECT n FROM NdtB2CedulaPrestaciones n")
public class NdtB2CedulaPrestaciones implements Serializable {
	
	private static final long serialVersionUID = 3406586068723274065L;
	
	@Id
	@Column(name="CVE_ID_CEDULA_PRESTACIONES", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtB2CedulaPrestaciones_Id_Seq_Gen", sequenceName = "SEQ_NDTB2CEDULAPRESTACIONES")
    @GeneratedValue(generator = "NdtB2CedulaPrestaciones_Id_Seq_Gen")
	private Long cveIdCedulaPrestaciones;

	@Column(name="CVE_ID_USUARIO", length=20)
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

	@Column(name="IMP_IMPORTE_PRESTACION", length=18)
	private String impImportePrestacion;

	//bi-directional many-to-one association to NdcAtestiguamiento
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_ATESTIGUAMIENTO")
	private NdcAtestiguamiento ndcAtestiguamiento;

	//bi-directional many-to-one association to NdcPrestaciones
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_PRESTACIONES")
	private NdcPrestaciones ndcPrestacione;

	//bi-directional many-to-one association to NdtPatronDictamen
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_PATRON_DICTAMEN")
	private NdtPatronDictamen ndtPatronDictamen;

	public NdtB2CedulaPrestaciones() {
	}

	public Long getCveIdCedulaPrestaciones() {
		return cveIdCedulaPrestaciones;
	}

	public void setCveIdCedulaPrestaciones(Long cveIdCedulaPrestaciones) {
		this.cveIdCedulaPrestaciones = cveIdCedulaPrestaciones;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
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

	public String getImpImportePrestacion() {
		return impImportePrestacion;
	}

	public void setImpImportePrestacion(String impImportePrestacion) {
		this.impImportePrestacion = impImportePrestacion;
	}

	public NdcAtestiguamiento getNdcAtestiguamiento() {
		return ndcAtestiguamiento;
	}

	public void setNdcAtestiguamiento(NdcAtestiguamiento ndcAtestiguamiento) {
		this.ndcAtestiguamiento = ndcAtestiguamiento;
	}

	public NdcPrestaciones getNdcPrestacione() {
		return ndcPrestacione;
	}

	public void setNdcPrestacione(NdcPrestaciones ndcPrestacione) {
		this.ndcPrestacione = ndcPrestacione;
	}

	public NdtPatronDictamen getNdtPatronDictamen() {
		return ndtPatronDictamen;
	}

	public void setNdtPatronDictamen(NdtPatronDictamen ndtPatronDictamen) {
		this.ndtPatronDictamen = ndtPatronDictamen;
	}

}
