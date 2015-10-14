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
@Table(name="NDT_B1_DET_OTROS_ING_XSALARIO")
@NamedQuery(name="NdtB1DetOtrosIngXsalario.findAll", query="SELECT n FROM NdtB1DetOtrosIngXsalario n")
public class NdtB1DetOtrosIngXsalario implements Serializable {
	
	private static final long serialVersionUID = -6189553721054798170L;
	
	@Id
	@Column(name="CVE_ID_A1_DET_OTROS_ING_XSAL", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtB1DetOtrosIngXsalario_Id_Seq_Gen", sequenceName = "SEQ_NDTB1DETOTROSINGXSALARIO")
    @GeneratedValue(generator = "NdtB1DetOtrosIngXsalario_Id_Seq_Gen")
	private Long cveIdA1DetOtrosIngXsal;

	@Column(name="DES_CONCEPTO", length=50)
	private String desConcepto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="IMP_IMPORTE_PAGADO", precision=13, scale=2)
	private Long impImportePagado;

	@Column(name="IND_FIJA_VARIABLE", precision=1)
	private Long indFijaVariable;

	@Column(name="IND_INTEGRA_SBC", precision=1)
	private Long indIntegraSbc;

	//bi-directional many-to-one association to NdtB1CedulaRemuneraciones
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_B1_CED_REMUNERA")
	private NdtB1CedulaRemuneraciones ndtB1CedulaRemuneracione;

	public NdtB1DetOtrosIngXsalario() {
	}

	public Long getCveIdA1DetOtrosIngXsal() {
		return cveIdA1DetOtrosIngXsal;
	}

	public void setCveIdA1DetOtrosIngXsal(Long cveIdA1DetOtrosIngXsal) {
		this.cveIdA1DetOtrosIngXsal = cveIdA1DetOtrosIngXsal;
	}

	public String getDesConcepto() {
		return desConcepto;
	}

	public void setDesConcepto(String desConcepto) {
		this.desConcepto = desConcepto;
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

	public Long getImpImportePagado() {
		return impImportePagado;
	}

	public void setImpImportePagado(Long impImportePagado) {
		this.impImportePagado = impImportePagado;
	}

	public Long getIndFijaVariable() {
		return indFijaVariable;
	}

	public void setIndFijaVariable(Long indFijaVariable) {
		this.indFijaVariable = indFijaVariable;
	}

	public Long getIndIntegraSbc() {
		return indIntegraSbc;
	}

	public void setIndIntegraSbc(Long indIntegraSbc) {
		this.indIntegraSbc = indIntegraSbc;
	}

	public NdtB1CedulaRemuneraciones getNdtB1CedulaRemuneracione() {
		return ndtB1CedulaRemuneracione;
	}

	public void setNdtB1CedulaRemuneracione(NdtB1CedulaRemuneraciones ndtB1CedulaRemuneracione) {
		this.ndtB1CedulaRemuneracione = ndtB1CedulaRemuneracione;
	}

}