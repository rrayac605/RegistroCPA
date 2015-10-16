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
@Table(name="NDT_ATESTIG_PREGUNTAS_RESPUEST")
@NamedQuery(name="NdtAtestigPreguntasRespuest.findAll", query="SELECT n FROM NdtAtestigPreguntasRespuest n")
public class NdtAtestigPreguntasRespuest implements Serializable {
	
	private static final long serialVersionUID = 4872066928996850782L;
	
	@Id
	@Column(name="CVE_ID_ATESTIGUAMIENTOS", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtAtestigPreguntasRespuest_Id_Seq_Gen", sequenceName = "SEQ_NDTATESTIGPREGUNTASRESPUEST")
    @GeneratedValue(generator = "NdtAtestigPreguntasRespuest_Id_Seq_Gen")
	private Long cveIdAtestiguamientos;

	@Column(name="CVE_ID_USUARIO", length=20)
	private String cveIdUsuario;

	@Column(name="DES_OBSERVACIONES", length=3000)
	private String desObservaciones;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to NdtRubroAtestiguamientoDict
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_RUBRO_ATESTIG_DICTAMEN")
	private NdtRubroAtestiguamientoDict ndtRubroAtestiguamientoDict;

	//bi-directional many-to-one association to NdcOpcionPregunta
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_OPCION_PREGUNTA")
	private NdcOpcionPregunta ndcOpcionPregunta;

	public NdtAtestigPreguntasRespuest() {
	}

	public Long getCveIdAtestiguamientos() {
		return cveIdAtestiguamientos;
	}

	public void setCveIdAtestiguamientos(Long cveIdAtestiguamientos) {
		this.cveIdAtestiguamientos = cveIdAtestiguamientos;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDesObservaciones() {
		return desObservaciones;
	}

	public void setDesObservaciones(String desObservaciones) {
		this.desObservaciones = desObservaciones;
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

	public NdtRubroAtestiguamientoDict getNdtRubroAtestiguamientoDict() {
		return ndtRubroAtestiguamientoDict;
	}

	public void setNdtRubroAtestiguamientoDict(NdtRubroAtestiguamientoDict ndtRubroAtestiguamientoDict) {
		this.ndtRubroAtestiguamientoDict = ndtRubroAtestiguamientoDict;
	}

	public NdcOpcionPregunta getNdcOpcionPregunta() {
		return ndcOpcionPregunta;
	}

	public void setNdcOpcionPregunta(NdcOpcionPregunta ndcOpcionPregunta) {
		this.ndcOpcionPregunta = ndcOpcionPregunta;
	}

}
