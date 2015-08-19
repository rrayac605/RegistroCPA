package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the NDC_TIPO_CONVENIO_COTIZACION database table.
 * 
 */
@Entity
@Table(name="NDC_TIPO_CONVENIO_COTIZACION")
@NamedQuery(name="NdcTipoConvenioCotizacionDO.findAll", query="SELECT n FROM NdcTipoConvenioCotizacionDO n")
public class NdcTipoConvenioCotizacionDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "CVE_ID_TIPO_CONVENIO_COT", nullable = false)
	@SequenceGenerator(name = "NdcTipoConvenioCotizacion_Id_Seq_Gen", sequenceName = "SEQ_NDCTIPOCONVENIOCOTIZACION")
    @GeneratedValue(generator = "NdcTipoConvenioCotizacion_Id_Seq_Gen")
	private long cveIdTipoConvenioCot;

	@Column(name="DES_TIPO_CONVENIO_COT")
	private String desTipoConvenioCot;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to NdtPatronDictamenDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ndcTipoConvenioCotizacion")
	private List<NdtPatronDictamenDO> ndtPatronDictamens;

	public NdcTipoConvenioCotizacionDO() {
	}

	public long getCveIdTipoConvenioCot() {
		return this.cveIdTipoConvenioCot;
	}

	public void setCveIdTipoConvenioCot(long cveIdTipoConvenioCot) {
		this.cveIdTipoConvenioCot = cveIdTipoConvenioCot;
	}

	public String getDesTipoConvenioCot() {
		return this.desTipoConvenioCot;
	}

	public void setDesTipoConvenioCot(String desTipoConvenioCot) {
		this.desTipoConvenioCot = desTipoConvenioCot;
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

	public List<NdtPatronDictamenDO> getNdtPatronDictamens() {
		return this.ndtPatronDictamens;
	}

	public void setNdtPatronDictamens(List<NdtPatronDictamenDO> ndtPatronDictamens) {
		this.ndtPatronDictamens = ndtPatronDictamens;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveIdTipoConvenioCot ^ (cveIdTipoConvenioCot >>> 32));
		result = prime * result + ((desTipoConvenioCot == null) ? 0 : desTipoConvenioCot.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((ndtPatronDictamens == null) ? 0 : ndtPatronDictamens.hashCode());
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
		NdcTipoConvenioCotizacionDO other = (NdcTipoConvenioCotizacionDO) obj;
		if (cveIdTipoConvenioCot != other.cveIdTipoConvenioCot)
			return false;
		if (desTipoConvenioCot == null) {
			if (other.desTipoConvenioCot != null)
				return false;
		} else if (!desTipoConvenioCot.equals(other.desTipoConvenioCot))
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
		if (ndtPatronDictamens == null) {
			if (other.ndtPatronDictamens != null)
				return false;
		} else if (!ndtPatronDictamens.equals(other.ndtPatronDictamens))
			return false;
		return true;
	}
	
	

}