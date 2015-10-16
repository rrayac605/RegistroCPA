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
@Table(name="NDT_RUBRO_ATESTIGUAMIENTO_DICT")
@NamedQuery(name="NdtRubroAtestiguamientoDict.findAll", query="SELECT n FROM NdtRubroAtestiguamientoDict n")
public class NdtRubroAtestiguamientoDict implements Serializable {
	
	private static final long serialVersionUID = -365016007271980408L;
	
	@Id
	@Column(name="CVE_ID_RUBRO_ATESTIG_DICTAMEN", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtRubroAtestiguamientoDict_Id_Seq_Gen", sequenceName = "SEQ_NDTRUBROATESTIGUAMIENTO_DICT")
    @GeneratedValue(generator = "NdtRubroAtestiguamientoDict_Id_Seq_Gen")
	private Long cveIdRubroAtestigDictamen;

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

	@Column(name="IND_APLICA", precision=1)
	private Long indAplica;

	//bi-directional many-to-one association to NdtAtestigPreguntasRespuest
	@OneToMany(mappedBy="ndtRubroAtestiguamientoDict")
	private List<NdtAtestigPreguntasRespuest> listNdtAtestigPreguntasRespuests;

	//bi-directional many-to-one association to NdtAtestiguamientoDictamen
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_ATESTIG_DICTAMEN")
	private NdtAtestiguamientoDictamen ndtAtestiguamientoDictamen;

	//bi-directional many-to-one association to NdcRubro
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_RUBRO")
	private NdcRubro ndcRubro;

	public NdtRubroAtestiguamientoDict() {
	}

	public Long getCveIdRubroAtestigDictamen() {
		return cveIdRubroAtestigDictamen;
	}

	public void setCveIdRubroAtestigDictamen(Long cveIdRubroAtestigDictamen) {
		this.cveIdRubroAtestigDictamen = cveIdRubroAtestigDictamen;
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

	public Long getIndAplica() {
		return indAplica;
	}

	public void setIndAplica(Long indAplica) {
		this.indAplica = indAplica;
	}

	public List<NdtAtestigPreguntasRespuest> getListNdtAtestigPreguntasRespuests() {
		return listNdtAtestigPreguntasRespuests;
	}

	public void setListNdtAtestigPreguntasRespuests(List<NdtAtestigPreguntasRespuest> listNdtAtestigPreguntasRespuests) {
		this.listNdtAtestigPreguntasRespuests = listNdtAtestigPreguntasRespuests;
	}

	public NdtAtestiguamientoDictamen getNdtAtestiguamientoDictamen() {
		return ndtAtestiguamientoDictamen;
	}

	public void setNdtAtestiguamientoDictamen(NdtAtestiguamientoDictamen ndtAtestiguamientoDictamen) {
		this.ndtAtestiguamientoDictamen = ndtAtestiguamientoDictamen;
	}

	public NdcRubro getNdcRubro() {
		return ndcRubro;
	}

	public void setNdcRubro(NdcRubro ndcRubro) {
		this.ndcRubro = ndcRubro;
	}

}
