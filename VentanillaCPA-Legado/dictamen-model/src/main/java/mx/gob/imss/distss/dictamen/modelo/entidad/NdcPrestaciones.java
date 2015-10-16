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
@Table(name="NDC_PRESTACIONES")
@NamedQuery(name="NdcPrestaciones.findAll", query="SELECT n FROM NdcPrestaciones n")
public class NdcPrestaciones implements Serializable {
	
	private static final long serialVersionUID = -4844219964999340810L;
	
	@Id
	@Column(name="CVE_ID_PRESTACIONES", unique=true, nullable=false)
	@SequenceGenerator(name = "NdcPrestaciones_Id_Seq_Gen", sequenceName = "SEQ_NDCPRESTACIONES")
    @GeneratedValue(generator = "NdcPrestaciones_Id_Seq_Gen")
	private Long cveIdPrestaciones;

	@Column(name="DES_PRESTACIONES", length=200)
	private String desPrestaciones;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	public NdcPrestaciones() {
	}

	public Long getCveIdPrestaciones() {
		return cveIdPrestaciones;
	}

	public void setCveIdPrestaciones(Long cveIdPrestaciones) {
		this.cveIdPrestaciones = cveIdPrestaciones;
	}

	public String getDesPrestaciones() {
		return desPrestaciones;
	}

	public void setDesPrestaciones(String desPrestaciones) {
		this.desPrestaciones = desPrestaciones;
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
