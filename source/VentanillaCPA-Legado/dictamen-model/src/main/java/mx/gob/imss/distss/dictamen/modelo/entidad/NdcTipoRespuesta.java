package mx.gob.imss.distss.dictamen.modelo.entidad;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="NDC_TIPO_RESPUESTA")
@NamedQuery(name="NdcTipoRespuesta.findAll", query="SELECT n FROM NdcTipoRespuesta n")
public class NdcTipoRespuesta implements Serializable {
	
	private static final long serialVersionUID = -2992880477362406333L;
	
	@Id
	@Column(name="CVE_ID_RESPUESTA", unique=true, nullable=false)
	@SequenceGenerator(name = "NdcTipoRespuesta_Id_Seq_Gen", sequenceName = "SEQ_NDCTIPORESPUESTA")
    @GeneratedValue(generator = "NdcTipoRespuesta_Id_Seq_Gen")
	private Long cveIdRespuesta;

	@Column(name="DES_TIPO_RESPUESTA", length=50)
	private String desTipoRespuesta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to NdcOpcionPregunta
	@OneToMany(mappedBy="ndcTipoRespuesta")
	private List<NdcOpcionPregunta> listNdcOpcionPreguntas;

	public NdcTipoRespuesta() {
	}

	public Long getCveIdRespuesta() {
		return cveIdRespuesta;
	}

	public void setCveIdRespuesta(Long cveIdRespuesta) {
		this.cveIdRespuesta = cveIdRespuesta;
	}

	public String getDesTipoRespuesta() {
		return desTipoRespuesta;
	}

	public void setDesTipoRespuesta(String desTipoRespuesta) {
		this.desTipoRespuesta = desTipoRespuesta;
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

	public List<NdcOpcionPregunta> getListNdcOpcionPreguntas() {
		return listNdcOpcionPreguntas;
	}

	public void setListNdcOpcionPreguntas(List<NdcOpcionPregunta> listNdcOpcionPreguntas) {
		this.listNdcOpcionPreguntas = listNdcOpcionPreguntas;
	}

}