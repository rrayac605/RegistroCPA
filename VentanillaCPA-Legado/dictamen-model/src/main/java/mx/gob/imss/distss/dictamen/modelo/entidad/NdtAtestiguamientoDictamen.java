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
@Table(name="NDT_ATESTIGUAMIENTO_DICTAMEN")
@NamedQuery(name="NdtAtestiguamientoDictamen.findAll", query="SELECT n FROM NdtAtestiguamientoDictamen n")
public class NdtAtestiguamientoDictamen implements Serializable {
	
	private static final long serialVersionUID = -3612569271015538140L;
	
	@Id
	@Column(name="CVE_ID_ATESTIG_DICTAMEN", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtAtestiguamientoDictamen_Id_Seq_Gen", sequenceName = "SEQ_NDTATESTIGUAMIENTODICTAMEN")
    @GeneratedValue(generator = "NdtAtestiguamientoDictamen_Id_Seq_Gen")
	private Long cveIdAtestigDictamen;

	@Column(name="CVE_ID_DICTAMEN")
	private Long cveIdDictamen;

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

	//bi-directional many-to-one association to NdcAtestiguamiento
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_ATESTIGUAMIENTO")
	private NdcAtestiguamiento ndcAtestiguamiento;

	//bi-directional many-to-one association to NdtPatronDictamen
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_PATRON_DICTAMEN")
	private NdtPatronDictamen ndtPatronDictamen;

	//bi-directional many-to-one association to NdtRubroAtestiguamientoDict
	@OneToMany(mappedBy="ndtAtestiguamientoDictamen")
	private List<NdtRubroAtestiguamientoDict> listNdtRubroAtestiguamientoDicts;

	public NdtAtestiguamientoDictamen() {
	}

	public Long getCveIdAtestigDictamen() {
		return cveIdAtestigDictamen;
	}

	public void setCveIdAtestigDictamen(Long cveIdAtestigDictamen) {
		this.cveIdAtestigDictamen = cveIdAtestigDictamen;
	}

	public Long getCveIdDictamen() {
		return cveIdDictamen;
	}

	public void setCveIdDictamen(Long cveIdDictamen) {
		this.cveIdDictamen = cveIdDictamen;
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

	public NdcAtestiguamiento getNdcAtestiguamiento() {
		return ndcAtestiguamiento;
	}

	public void setNdcAtestiguamiento(NdcAtestiguamiento ndcAtestiguamiento) {
		this.ndcAtestiguamiento = ndcAtestiguamiento;
	}

	public NdtPatronDictamen getNdtPatronDictamen() {
		return ndtPatronDictamen;
	}

	public void setNdtPatronDictamen(NdtPatronDictamen ndtPatronDictamen) {
		this.ndtPatronDictamen = ndtPatronDictamen;
	}

	public List<NdtRubroAtestiguamientoDict> getListNdtRubroAtestiguamientoDicts() {
		return listNdtRubroAtestiguamientoDicts;
	}

	public void setListNdtRubroAtestiguamientoDicts(List<NdtRubroAtestiguamientoDict> listNdtRubroAtestiguamientoDicts) {
		this.listNdtRubroAtestiguamientoDicts = listNdtRubroAtestiguamientoDicts;
	}

}
