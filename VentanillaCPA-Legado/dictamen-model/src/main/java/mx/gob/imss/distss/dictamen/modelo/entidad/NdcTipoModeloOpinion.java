package mx.gob.imss.distss.dictamen.modelo.entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="NDC_TIPO_MODELO_OPINION")
@NamedQuery(name="NdcTipoModeloOpinion.findAll", query="SELECT n FROM NdcTipoModeloOpinion n")
public class NdcTipoModeloOpinion implements Serializable {
	
	private static final long serialVersionUID = -213669934234462966L;

	@Id
	@Column(name="CVE_ID_TIPO_OPINION", unique=true, nullable=false)
	@SequenceGenerator(name = "NdcTipoModeloOpinion_Id_Seq_Gen", sequenceName = "SEQ_NDCTIPOMODELOOPINION")
    @GeneratedValue(generator = "NdcTipoModeloOpinion_Id_Seq_Gen")
	private Long cveIdTipoOpinion;

	@Column(name="DES_MODELO_OPINION", length=50)
	private String desModeloOpinion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	public NdcTipoModeloOpinion() {
	}

	public Long getCveIdTipoOpinion() {
		return cveIdTipoOpinion;
	}

	public void setCveIdTipoOpinion(Long cveIdTipoOpinion) {
		this.cveIdTipoOpinion = cveIdTipoOpinion;
	}

	public String getDesModeloOpinion() {
		return desModeloOpinion;
	}

	public void setDesModeloOpinion(String desModeloOpinion) {
		this.desModeloOpinion = desModeloOpinion;
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

}