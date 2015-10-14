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
@Table(name="NDC_OPCION_PREGUNTA")
@NamedQuery(name="NdcOpcionPregunta.findAll", query="SELECT n FROM NdcOpcionPregunta n")
public class NdcOpcionPregunta implements Serializable {
	
	private static final long serialVersionUID = 1659592073117374239L;
	
	@Id
	@Column(name="CVE_ID_OPCION_PREGUNTA", unique=true, nullable=false)
	@SequenceGenerator(name = "NdcOpcionPregunta_Id_Seq_Gen", sequenceName = "SEQ_NDCOPCIONPREGUNTA")
    @GeneratedValue(generator = "NdcOpcionPregunta_Id_Seq_Gen")
	private Long cveIdOpcionPregunta;

	@Column(name="DES_OPCION_PREGUNTA", length=300)
	private String desOpcionPregunta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_ALTA_REGISTRO")
	private Date fecAltaRegistro;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_BAJA_REGISTRO")
	private Date fecBajaRegistro;

	//bi-directional many-to-one association to NdcPregunta
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_PREGUNTA")
	private NdcPregunta ndcPregunta;

	//bi-directional many-to-one association to NdcTipoRespuesta
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_RESPUESTA")
	private NdcTipoRespuesta ndcTipoRespuesta;

	public NdcOpcionPregunta() {
	}

	public Long getCveIdOpcionPregunta() {
		return cveIdOpcionPregunta;
	}

	public void setCveIdOpcionPregunta(Long cveIdOpcionPregunta) {
		this.cveIdOpcionPregunta = cveIdOpcionPregunta;
	}

	public String getDesOpcionPregunta() {
		return desOpcionPregunta;
	}

	public void setDesOpcionPregunta(String desOpcionPregunta) {
		this.desOpcionPregunta = desOpcionPregunta;
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

	public NdcPregunta getNdcPregunta() {
		return ndcPregunta;
	}

	public void setNdcPregunta(NdcPregunta ndcPregunta) {
		this.ndcPregunta = ndcPregunta;
	}

	public NdcTipoRespuesta getNdcTipoRespuesta() {
		return ndcTipoRespuesta;
	}

	public void setNdcTipoRespuesta(NdcTipoRespuesta ndcTipoRespuesta) {
		this.ndcTipoRespuesta = ndcTipoRespuesta;
	}

}
