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
@Table(name="NDC_RUBRO")
@NamedQuery(name="NdcRubro.findAll", query="SELECT n FROM NdcRubro n")
public class NdcRubro implements Serializable {
	
	private static final long serialVersionUID = -6849175386449238878L;
	
	@Id
	@Column(name="CVE_ID_RUBRO", unique=true, nullable=false)
	@SequenceGenerator(name = "NdcRubro_Id_Seq_Gen", sequenceName = "SEQ_NDCRUBRO")
    @GeneratedValue(generator = "NdcRubro_Id_Seq_Gen")
	private Long cveIdRubro;

	@Column(name="DES_RUBRO", length=100)
	private String desRubro;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_ACTUALIZADO_REGISTRO")
	private Date fecActualizadoRegistro;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_ALTA_REGISTRO")
	private Date fecAltaRegistro;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_BAJA_REGISTRO")
	private Date fecBajaRegistro;

	@Column(name="IND_ORDEN")
	private Long indOrden;

	//bi-directional many-to-one association to NdcPregunta
	@OneToMany(mappedBy="ndcRubro")
	private List<NdcPregunta> listNdcPreguntas;

	//bi-directional many-to-one association to NdcAtestiguamiento
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_ATESTIGUAMIENTO")
	private NdcAtestiguamiento ndcAtestiguamiento;

	public NdcRubro() {
	}

	public Long getCveIdRubro() {
		return cveIdRubro;
	}

	public void setCveIdRubro(Long cveIdRubro) {
		this.cveIdRubro = cveIdRubro;
	}

	public String getDesRubro() {
		return desRubro;
	}

	public void setDesRubro(String desRubro) {
		this.desRubro = desRubro;
	}

	public Date getFecActualizadoRegistro() {
		return fecActualizadoRegistro;
	}

	public void setFecActualizadoRegistro(Date fecActualizadoRegistro) {
		this.fecActualizadoRegistro = fecActualizadoRegistro;
	}

	public Date getFecAltaRegistro() {
		return fecAltaRegistro;
	}

	public void setFecAltaRegistro(Date fecAltaRegistro) {
		this.fecAltaRegistro = fecAltaRegistro;
	}

	public Date getFecBajaRegistro() {
		return fecBajaRegistro;
	}

	public void setFecBajaRegistro(Date fecBajaRegistro) {
		this.fecBajaRegistro = fecBajaRegistro;
	}

	public Long getIndOrden() {
		return indOrden;
	}

	public void setIndOrden(Long indOrden) {
		this.indOrden = indOrden;
	}

	public List<NdcPregunta> getListNdcPreguntas() {
		return listNdcPreguntas;
	}

	public void setListNdcPreguntas(List<NdcPregunta> listNdcPreguntas) {
		this.listNdcPreguntas = listNdcPreguntas;
	}

	public NdcAtestiguamiento getNdcAtestiguamiento() {
		return ndcAtestiguamiento;
	}

	public void setNdcAtestiguamiento(NdcAtestiguamiento ndcAtestiguamiento) {
		this.ndcAtestiguamiento = ndcAtestiguamiento;
	}

}