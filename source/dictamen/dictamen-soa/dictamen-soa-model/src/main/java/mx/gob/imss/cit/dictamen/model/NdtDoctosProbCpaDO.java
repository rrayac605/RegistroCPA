package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the NDT_DOCTOS_PROB_CPA database table.
 * 
 */
@Entity
@Table(name="NDT_DOCTOS_PROB_CPA")
@NamedQuery(name="NdtDoctosProbCpaDO.findAll", query="SELECT n FROM NdtDoctosProbCpaDO n")
public class NdtDoctosProbCpaDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "CVE_ID_DOCTOS_PROB_CPA", nullable = false)
    @SequenceGenerator(name = "NdtDoctosProbCpa_Id_Seq_Gen", sequenceName = "SEQ_NDTDOCTOSPROBCPA")
    @GeneratedValue(generator = "NdtDoctosProbCpa_Id_Seq_Gen")
	private long cveIdDoctosProbCpa;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Lob
	@Column(name="REF_DOCUMENTO_DIGITALIZADO")
	private byte[] refDocumentoDigitalizado;

	//bi-directional many-to-one association to DitDocumentoPorTipoDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_DOCTO_PROB_POR_TIPO")
	private DitDocumentoPorTipoDO ditDocumentoPorTipo;

	//bi-directional many-to-one association to NdtRegBajaReactivDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_CPA_REGISTRO")
	private NdtRegBajaReactivDO ndtRegBajaReactiv;

	public NdtDoctosProbCpaDO() {
	}

	public long getCveIdDoctosProbCpa() {
		return this.cveIdDoctosProbCpa;
	}

	public void setCveIdDoctosProbCpa(long cveIdDoctosProbCpa) {
		this.cveIdDoctosProbCpa = cveIdDoctosProbCpa;
	}

	public Date getFecRegistroActualizado() {
		return this.fecRegistroActualizado;
	}

	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	public Date getFecRegistroAlta() {
		return this.fecRegistroAlta;
	}

	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	public Date getFecRegistroBaja() {
		return this.fecRegistroBaja;
	}

	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	public byte[] getRefDocumentoDigitalizado() {
		return this.refDocumentoDigitalizado;
	}

	public void setRefDocumentoDigitalizado(byte[] refDocumentoDigitalizado) {
		this.refDocumentoDigitalizado = refDocumentoDigitalizado;
	}

	public DitDocumentoPorTipoDO getDitDocumentoPorTipo() {
		return this.ditDocumentoPorTipo;
	}

	public void setDitDocumentoPorTipo(DitDocumentoPorTipoDO ditDocumentoPorTipo) {
		this.ditDocumentoPorTipo = ditDocumentoPorTipo;
	}

	public NdtRegBajaReactivDO getNdtRegBajaReactiv() {
		return this.ndtRegBajaReactiv;
	}

	public void setNdtRegBajaReactiv(NdtRegBajaReactivDO ndtRegBajaReactiv) {
		this.ndtRegBajaReactiv = ndtRegBajaReactiv;
	}

}