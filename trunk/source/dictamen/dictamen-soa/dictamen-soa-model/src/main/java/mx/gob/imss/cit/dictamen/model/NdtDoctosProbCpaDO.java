package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Arrays;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveIdDoctosProbCpa ^ (cveIdDoctosProbCpa >>> 32));
		result = prime * result + ((ditDocumentoPorTipo == null) ? 0 : ditDocumentoPorTipo.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((ndtRegBajaReactiv == null) ? 0 : ndtRegBajaReactiv.hashCode());
		result = prime * result + Arrays.hashCode(refDocumentoDigitalizado);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NdtDoctosProbCpaDO other = (NdtDoctosProbCpaDO) obj;
		if (cveIdDoctosProbCpa != other.cveIdDoctosProbCpa)
			return false;
		if (ditDocumentoPorTipo == null) {
			if (other.ditDocumentoPorTipo != null)
				return false;
		} else if (!ditDocumentoPorTipo.equals(other.ditDocumentoPorTipo))
			return false;
		if (fecRegistroActualizado == null) {
			if (other.fecRegistroActualizado != null)
				return false;
		} else if (!fecRegistroActualizado.equals(other.fecRegistroActualizado))
			return false;
		if (fecRegistroAlta == null) {
			if (other.fecRegistroAlta != null)
				return false;
		} else if (!fecRegistroAlta.equals(other.fecRegistroAlta))
			return false;
		if (fecRegistroBaja == null) {
			if (other.fecRegistroBaja != null)
				return false;
		} else if (!fecRegistroBaja.equals(other.fecRegistroBaja))
			return false;
		if (ndtRegBajaReactiv == null) {
			if (other.ndtRegBajaReactiv != null)
				return false;
		} else if (!ndtRegBajaReactiv.equals(other.ndtRegBajaReactiv))
			return false;
		if (!Arrays.equals(refDocumentoDigitalizado, other.refDocumentoDigitalizado))
			return false;
		return true;
	}
	
	

}