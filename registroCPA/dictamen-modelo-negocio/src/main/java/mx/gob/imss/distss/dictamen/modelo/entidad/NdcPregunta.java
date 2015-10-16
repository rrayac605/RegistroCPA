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
@Table(name="NDC_PREGUNTA")
@NamedQuery(name="NdcPregunta.findAll", query="SELECT n FROM NdcPregunta n")
public class NdcPregunta implements Serializable {
	
	private static final long serialVersionUID = 539420309001728302L;
	
	@Id
	@Column(name="CVE_ID_PREGUNTA", unique=true, nullable=false)
	@SequenceGenerator(name = "NdcPregunta_Id_Seq_Gen", sequenceName = "SEQ_NDCPREGUNTA")
    @GeneratedValue(generator = "NdcPregunta_Id_Seq_Gen")
	private Long cveIdPregunta;

	@Column(name="DES_PREGUNTA", length=4000)
	private String desPregunta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="IND_ORDEN")
	private Long indOrden;

	//bi-directional many-to-one association to NdcOpcionPregunta
	@OneToMany(mappedBy="ndcPregunta")
	private List<NdcOpcionPregunta> listNdcOpcionPreguntas;

	//bi-directional many-to-one association to NdcPregunta
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_PREGUNTA_PADRE")
	private NdcPregunta ndcPregunta;

	//bi-directional many-to-one association to NdcPregunta
	@OneToMany(mappedBy="ndcPregunta")
	private List<NdcPregunta> listNdcPreguntas;

	//bi-directional many-to-one association to NdcRubro
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_RUBRO", nullable=false)
	private NdcRubro ndcRubro;

	public NdcPregunta() {
	}

	public Long getCveIdPregunta() {
		return cveIdPregunta;
	}

	public void setCveIdPregunta(Long cveIdPregunta) {
		this.cveIdPregunta = cveIdPregunta;
	}

	public String getDesPregunta() {
		return desPregunta;
	}

	public void setDesPregunta(String desPregunta) {
		this.desPregunta = desPregunta;
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

	public Long getIndOrden() {
		return indOrden;
	}

	public void setIndOrden(Long indOrden) {
		this.indOrden = indOrden;
	}

	public List<NdcOpcionPregunta> getListNdcOpcionPreguntas() {
		return listNdcOpcionPreguntas;
	}

	public void setListNdcOpcionPreguntas(List<NdcOpcionPregunta> listNdcOpcionPreguntas) {
		this.listNdcOpcionPreguntas = listNdcOpcionPreguntas;
	}

	public NdcPregunta getNdcPregunta() {
		return ndcPregunta;
	}

	public void setNdcPregunta(NdcPregunta ndcPregunta) {
		this.ndcPregunta = ndcPregunta;
	}

	public List<NdcPregunta> getListNdcPreguntas() {
		return listNdcPreguntas;
	}

	public void setListNdcPreguntas(List<NdcPregunta> listNdcPreguntas) {
		this.listNdcPreguntas = listNdcPreguntas;
	}

	public NdcRubro getNdcRubro() {
		return ndcRubro;
	}

	public void setNdcRubro(NdcRubro ndcRubro) {
		this.ndcRubro = ndcRubro;
	}

}
