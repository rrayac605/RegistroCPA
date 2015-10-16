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
@Table(name="NDC_EJERCICIO_FISCAL")
@NamedQuery(name="NdcEjercicioFiscal.findAll", query="SELECT n FROM NdcEjercicioFiscal n")
public class NdcEjercicioFiscal implements Serializable {
	
	private static final long serialVersionUID = -7590952235223194725L;
	
	@Id
	@Column(name="CVE_ID_EJER_FISCAL", unique=true, nullable=false)
	@SequenceGenerator(name = "NdcEjercicioFiscal_Id_Seq_Gen", sequenceName = "SEQ_NDCEJERCICIOFISCAL")
    @GeneratedValue(generator = "NdcEjercicioFiscal_Id_Seq_Gen")
	private Long cveIdEjerFiscal;

	@Column(name="DES_EJER_FISCAL", length=20)
	private String desEjerFiscal;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	public NdcEjercicioFiscal() {
	}

	public long getCveIdEjerFiscal() {
		return cveIdEjerFiscal;
	}

	public void setCveIdEjerFiscal(long cveIdEjerFiscal) {
		this.cveIdEjerFiscal = cveIdEjerFiscal;
	}

	public String getDesEjerFiscal() {
		return desEjerFiscal;
	}

	public void setDesEjerFiscal(String desEjerFiscal) {
		this.desEjerFiscal = desEjerFiscal;
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
