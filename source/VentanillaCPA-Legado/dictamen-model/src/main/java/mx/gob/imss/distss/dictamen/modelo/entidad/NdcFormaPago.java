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
@Table(name="NDC_FORMA_PAGO")
@NamedQuery(name="NdcFormaPago.findAll", query="SELECT n FROM NdcFormaPago n")
public class NdcFormaPago implements Serializable {
	
	private static final long serialVersionUID = -8866934742448898058L;
	
	@Id
	@Column(name="CVE_ID_FORMA_PAGO", unique=true, nullable=false, precision=1)
	@SequenceGenerator(name = "NdcFormaPago_Id_Seq_Gen", sequenceName = "SEQ_NDCFORMAPAGO")
    @GeneratedValue(generator = "NdcFormaPago_Id_Seq_Gen")
	private Long cveIdFormaPago;

	@Column(name="DES_FORMA_PAGO", length=50)
	private String desFormaPago;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to NdcTipoPago
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_TIPO_PAGO")
	private NdcTipoPago ndcTipoPago;

	public NdcFormaPago() {
	}

	public Long getCveIdFormaPago() {
		return cveIdFormaPago;
	}

	public void setCveIdFormaPago(Long cveIdFormaPago) {
		this.cveIdFormaPago = cveIdFormaPago;
	}

	public String getDesFormaPago() {
		return desFormaPago;
	}

	public void setDesFormaPago(String desFormaPago) {
		this.desFormaPago = desFormaPago;
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

	public NdcTipoPago getNdcTipoPago() {
		return ndcTipoPago;
	}

	public void setNdcTipoPago(NdcTipoPago ndcTipoPago) {
		this.ndcTipoPago = ndcTipoPago;
	}

}
