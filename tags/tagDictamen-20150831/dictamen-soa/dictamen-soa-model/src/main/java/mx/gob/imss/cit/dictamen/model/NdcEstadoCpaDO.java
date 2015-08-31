package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the NDC_ESTADO_CPA database table.
 * 
 */
@Entity
@Table(name="NDC_ESTADO_CPA")
@NamedQuery(name="NdcEstadoCpaDO.findAll", query="SELECT n FROM NdcEstadoCpaDO n")
public class NdcEstadoCpaDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "CVE_ID_ESTADO_CPA", nullable = false)
    @SequenceGenerator(name = "NdcEstadoCpa_Id_Seq_Gen", sequenceName = "SEQ_NDCESTADOCPA")
    @GeneratedValue(generator = "NdcEstadoCpa_Id_Seq_Gen")
	private long cveIdEstadoCpa;

	@Column(name="DES_ESTADO_CPA")
	private String desEstadoCpa;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to NdtContadorPublicoAutDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ndcEstadoCpa")
	private List<NdtContadorPublicoAutDO> ndtContadorPublicoAuts;

	//bi-directional many-to-one association to NdtRegBajaReactivDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ndcEstadoCpa")
	private List<NdtRegBajaReactivDO> ndtRegBajaReactivs;

	public NdcEstadoCpaDO() {
	}

	public long getCveIdEstadoCpa() {
		return this.cveIdEstadoCpa;
	}

	public void setCveIdEstadoCpa(long cveIdEstadoCpa) {
		this.cveIdEstadoCpa = cveIdEstadoCpa;
	}

	public String getDesEstadoCpa() {
		return this.desEstadoCpa;
	}

	public void setDesEstadoCpa(String desEstadoCpa) {
		this.desEstadoCpa = desEstadoCpa;
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

	public List<NdtContadorPublicoAutDO> getNdtContadorPublicoAuts() {
		return this.ndtContadorPublicoAuts;
	}

	public void setNdtContadorPublicoAuts(List<NdtContadorPublicoAutDO> ndtContadorPublicoAuts) {
		this.ndtContadorPublicoAuts = ndtContadorPublicoAuts;
	}


	public List<NdtRegBajaReactivDO> getNdtRegBajaReactivs() {
		return this.ndtRegBajaReactivs;
	}

	public void setNdtRegBajaReactivs(List<NdtRegBajaReactivDO> ndtRegBajaReactivs) {
		this.ndtRegBajaReactivs = ndtRegBajaReactivs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveIdEstadoCpa ^ (cveIdEstadoCpa >>> 32));
		result = prime * result + ((desEstadoCpa == null) ? 0 : desEstadoCpa.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((ndtContadorPublicoAuts == null) ? 0 : ndtContadorPublicoAuts.hashCode());
		result = prime * result + ((ndtRegBajaReactivs == null) ? 0 : ndtRegBajaReactivs.hashCode());
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
		NdcEstadoCpaDO other = (NdcEstadoCpaDO) obj;
		if (cveIdEstadoCpa != other.cveIdEstadoCpa)
			return false;
		if (desEstadoCpa == null) {
			if (other.desEstadoCpa != null)
				return false;
		} else if (!desEstadoCpa.equals(other.desEstadoCpa))
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
		if (ndtContadorPublicoAuts == null) {
			if (other.ndtContadorPublicoAuts != null)
				return false;
		} else if (!ndtContadorPublicoAuts.equals(other.ndtContadorPublicoAuts))
			return false;
		if (ndtRegBajaReactivs == null) {
			if (other.ndtRegBajaReactivs != null)
				return false;
		} else if (!ndtRegBajaReactivs.equals(other.ndtRegBajaReactivs))
			return false;
		return true;
	}
	
	

}