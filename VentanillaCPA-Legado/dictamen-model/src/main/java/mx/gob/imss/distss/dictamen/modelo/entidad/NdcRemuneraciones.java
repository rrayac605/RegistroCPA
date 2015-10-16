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
@Table(name="NDC_REMUNERACIONES")
@NamedQuery(name="NdcRemuneraciones.findAll", query="SELECT n FROM NdcRemuneraciones n")
public class NdcRemuneraciones implements Serializable {
	
	private static final long serialVersionUID = -8783083002371396756L;
	
	@Id
	@Column(name="CVE_ID_REMUNERACIONES", unique=true, nullable=false)
	@SequenceGenerator(name = "NdcRemuneraciones_Id_Seq_Gen", sequenceName = "SEQ_NDCREMUNERACIONES")
    @GeneratedValue(generator = "NdcRemuneraciones_Id_Seq_Gen")
	private Long cveIdRemuneraciones;

	@Column(name="CVE_ID_USUARIO", length=20)
	private String cveIdUsuario;

	@Column(name="DES_REMUNERACIONES", length=200)
	private String desRemuneraciones;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="IND_ORDEN")
	private Long indOrden;

	public NdcRemuneraciones() {
	}

	public Long getCveIdRemuneraciones() {
		return cveIdRemuneraciones;
	}

	public void setCveIdRemuneraciones(Long cveIdRemuneraciones) {
		this.cveIdRemuneraciones = cveIdRemuneraciones;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDesRemuneraciones() {
		return desRemuneraciones;
	}

	public void setDesRemuneraciones(String desRemuneraciones) {
		this.desRemuneraciones = desRemuneraciones;
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

	public Long getIndOrden() {
		return indOrden;
	}

	public void setIndOrden(Long indOrden) {
		this.indOrden = indOrden;
	}

}
