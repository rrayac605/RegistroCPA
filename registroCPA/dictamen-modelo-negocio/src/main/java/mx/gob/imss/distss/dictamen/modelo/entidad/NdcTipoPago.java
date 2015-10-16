package mx.gob.imss.distss.dictamen.modelo.entidad;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="NDC_TIPO_PAGO")
@NamedQuery(name="NdcTipoPago.findAll", query="SELECT n FROM NdcTipoPago n")
public class NdcTipoPago implements Serializable {
	
	private static final long serialVersionUID = -4890595165479253187L;
	
	@Id
	@Column(name="CVE_ID_TIPO_PAGO", unique=true, nullable=false, precision=1)
	@SequenceGenerator(name = "NdcTipoPago_Id_Seq_Gen", sequenceName = "SEQ_NDCTIPOPAGO")
    @GeneratedValue(generator = "NdcTipoPago_Id_Seq_Gen")
	private Long cveIdTipoPago;

	@Column(name="DES_TIPO_PAGO", length=50)
	private String desTipoPago;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to NdcFormaPago
	@OneToMany(mappedBy="ndcTipoPago")
	private List<NdcFormaPago> listNdcFormaPagos;

	public NdcTipoPago() {
	}

	public Long getCveIdTipoPago() {
		return cveIdTipoPago;
	}

	public void setCveIdTipoPago(Long cveIdTipoPago) {
		this.cveIdTipoPago = cveIdTipoPago;
	}

	public String getDesTipoPago() {
		return desTipoPago;
	}

	public void setDesTipoPago(String desTipoPago) {
		this.desTipoPago = desTipoPago;
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

	public List<NdcFormaPago> getListNdcFormaPagos() {
		return listNdcFormaPagos;
	}

	public void setListNdcFormaPagos(List<NdcFormaPago> listNdcFormaPagos) {
		this.listNdcFormaPagos = listNdcFormaPagos;
	}

}