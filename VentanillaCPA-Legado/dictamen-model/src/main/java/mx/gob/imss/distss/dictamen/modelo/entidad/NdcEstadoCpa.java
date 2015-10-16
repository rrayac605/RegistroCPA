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
@Table(name="NDC_ESTADO_CPA")
@NamedQuery(name="NdcEstadoCpa.findAll", query="SELECT n FROM NdcEstadoCpa n")
public class NdcEstadoCpa implements Serializable {
	
	private static final long serialVersionUID = 6661141320367420090L;

	@Id
	@Column(name="CVE_ID_ESTADO_CPA", unique=true, nullable=false)
	@SequenceGenerator(name = "NdcEstadoCpa_Id_Seq_Gen", sequenceName = "SEQ_NDCESTADOCPA")
    @GeneratedValue(generator = "NdcEstadoCpa_Id_Seq_Gen")
	private Long cveIdEstadoCpa;

	@Column(name="DES_ESTADO_CPA", length=50)
	private String desEstadoCpa;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;
	
	public NdcEstadoCpa() {
	}

	public Long getCveIdEstadoCpa() {
		return cveIdEstadoCpa;
	}

	public void setCveIdEstadoCpa(Long cveIdEstadoCpa) {
		this.cveIdEstadoCpa = cveIdEstadoCpa;
	}

	public String getDesEstadoCpa() {
		return desEstadoCpa;
	}

	public void setDesEstadoCpa(String desEstadoCpa) {
		this.desEstadoCpa = desEstadoCpa;
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
