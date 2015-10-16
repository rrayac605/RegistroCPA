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
@Table(name="NDC_TIPO_DICTAMEN")
@NamedQuery(name="NdcTipoDictamen.findAll", query="SELECT n FROM NdcTipoDictamen n")
public class NdcTipoDictamen implements Serializable {
	
	private static final long serialVersionUID = -9139070073575131473L;
	
	@Id
	@Column(name="CVE_ID_TIPO_DICTAMEN", unique=true, nullable=false)
	@SequenceGenerator(name = "NdcTipoDictamen_Id_Seq_Gen", sequenceName = "SEQ_NDCTIPODICTAMEN")
    @GeneratedValue(generator = "NdcTipoDictamen_Id_Seq_Gen")
	private Long cveIdTipoDictamen;

	@Column(name="DES_TIPO_DICTAMEN", length=50)
	private String desTipoDictamen;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	public NdcTipoDictamen() {
	}

	public Long getCveIdTipoDictamen() {
		return cveIdTipoDictamen;
	}

	public void setCveIdTipoDictamen(Long cveIdTipoDictamen) {
		this.cveIdTipoDictamen = cveIdTipoDictamen;
	}

	public String getDesTipoDictamen() {
		return desTipoDictamen;
	}

	public void setDesTipoDictamen(String desTipoDictamen) {
		this.desTipoDictamen = desTipoDictamen;
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
