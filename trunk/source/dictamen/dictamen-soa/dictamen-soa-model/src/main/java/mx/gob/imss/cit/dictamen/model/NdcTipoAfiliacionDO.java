package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the NDC_TIPO_AFILIACION database table.
 * 
 */
@Entity
@Table(name="NDC_TIPO_AFILIACION")
@NamedQuery(name="NdcTipoAfiliacionDO.findAll", query="SELECT n FROM NdcTipoAfiliacionDO n")
public class NdcTipoAfiliacionDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "CVE_ID_TIPO_AFILIACION", nullable = false)
    @SequenceGenerator(name = "NdcTipoAfiliacion_Id_Seq_Gen", sequenceName = "SEQ_NDCTIPOAFILIACION")
    @GeneratedValue(generator = "NdcTipoAfiliacion_Id_Seq_Gen")
	private long cveIdTipoAfiliacion;

	@Column(name="DES_TIPO_AFILIACION")
	private String desTipoAfiliacion;

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
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ndcTipoAfiliacion")
	private List<NdtPatronDictamenDO> ndtPatronDictamens;

	public NdcTipoAfiliacionDO() {
	}

	public long getCveIdTipoAfiliacion() {
		return this.cveIdTipoAfiliacion;
	}

	public void setCveIdTipoAfiliacion(long cveIdTipoAfiliacion) {
		this.cveIdTipoAfiliacion = cveIdTipoAfiliacion;
	}

	public String getDesTipoAfiliacion() {
		return this.desTipoAfiliacion;
	}

	public void setDesTipoAfiliacion(String desTipoAfiliacion) {
		this.desTipoAfiliacion = desTipoAfiliacion;
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
		result = prime * result + (int) (cveIdTipoAfiliacion ^ (cveIdTipoAfiliacion >>> 32));
		result = prime * result + ((desTipoAfiliacion == null) ? 0 : desTipoAfiliacion.hashCode());
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
		NdcTipoAfiliacionDO other = (NdcTipoAfiliacionDO) obj;
		if (cveIdTipoAfiliacion != other.cveIdTipoAfiliacion)
			return false;
		if (desTipoAfiliacion == null) {
			if (other.desTipoAfiliacion != null)
				return false;
		} else if (!desTipoAfiliacion.equals(other.desTipoAfiliacion))
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