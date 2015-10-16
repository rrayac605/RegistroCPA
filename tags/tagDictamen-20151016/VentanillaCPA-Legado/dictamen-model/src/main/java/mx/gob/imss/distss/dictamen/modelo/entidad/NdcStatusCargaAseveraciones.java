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
@Table(name="NDC_STATUS_CARGA_ASEVERACIONES")
@NamedQuery(name="NdcStatusCargaAseveraciones.findAll", query="SELECT n FROM NdcStatusCargaAseveraciones n")
public class NdcStatusCargaAseveraciones implements Serializable {
	
	private static final long serialVersionUID = 1555134491243544821L;

	@Id
	@Column(name="CVE_ID_STATUS_CARGA", unique=true, nullable=false)
	@SequenceGenerator(name = "NdcStatusCargaAseveraciones_Id_Seq_Gen", sequenceName = "SEQ_NDCSTATUSCARGAASEVERACIONE")
    @GeneratedValue(generator = "NdcStatusCargaAseveraciones_Id_Seq_Gen")
	private Long cveIdStatusCarga;

	@Column(name="DES_STATUS_CARGA_ASEVERACIONES", length=100)
	private String desStatusCargaAseveraciones;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	public NdcStatusCargaAseveraciones() {
	}

	public long getCveIdStatusCarga() {
		return cveIdStatusCarga;
	}

	public void setCveIdStatusCarga(long cveIdStatusCarga) {
		this.cveIdStatusCarga = cveIdStatusCarga;
	}

	public String getDesStatusCargaAseveraciones() {
		return desStatusCargaAseveraciones;
	}

	public void setDesStatusCargaAseveraciones(String desStatusCargaAseveraciones) {
		this.desStatusCargaAseveraciones = desStatusCargaAseveraciones;
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