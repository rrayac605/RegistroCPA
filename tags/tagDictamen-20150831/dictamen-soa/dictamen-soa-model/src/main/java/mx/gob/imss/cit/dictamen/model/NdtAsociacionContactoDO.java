package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the NDT_ASOCIACION_CONTACTO database table.
 * 
 */
@Entity
@Table(name="NDT_ASOCIACION_CONTACTO")
@NamedQuery(name="NdtAsociacionContactoDO.findAll", query="SELECT n FROM NdtAsociacionContactoDO n")
public class NdtAsociacionContactoDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "CVE_ID_ASOCIACION_CONTACTO", nullable = false)
    @SequenceGenerator(name = "NdtAsociacionContacto_Id_Seq_Gen", sequenceName = "SEQ_NDTASOCIACIONCONTACTO")
    @GeneratedValue(generator = "NdtAsociacionContacto_Id_Seq_Gen")
	private long cveIdAsociacionContacto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to DitFormaContactoDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_FORMA_CONTACTO")
	private DitFormaContactoDO ditFormaContacto;

	//bi-directional many-to-one association to NdcAsociacionDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_ASOCIACION")
	private NdcAsociacionDO ndcAsociacion;

	public NdtAsociacionContactoDO() {
	}

	public long getCveIdAsociacionContacto() {
		return this.cveIdAsociacionContacto;
	}

	public void setCveIdAsociacionContacto(long cveIdAsociacionContacto) {
		this.cveIdAsociacionContacto = cveIdAsociacionContacto;
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

	public DitFormaContactoDO getDitFormaContacto() {
		return this.ditFormaContacto;
	}

	public void setDitFormaContacto(DitFormaContactoDO ditFormaContacto) {
		this.ditFormaContacto = ditFormaContacto;
	}

	public NdcAsociacionDO getNdcAsociacion() {
		return this.ndcAsociacion;
	}

	public void setNdcAsociacion(NdcAsociacionDO ndcAsociacion) {
		this.ndcAsociacion = ndcAsociacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveIdAsociacionContacto ^ (cveIdAsociacionContacto >>> 32));
		result = prime * result + ((ditFormaContacto == null) ? 0 : ditFormaContacto.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((ndcAsociacion == null) ? 0 : ndcAsociacion.hashCode());
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
		NdtAsociacionContactoDO other = (NdtAsociacionContactoDO) obj;
		if (cveIdAsociacionContacto != other.cveIdAsociacionContacto)
			return false;
		if (ditFormaContacto == null) {
			if (other.ditFormaContacto != null)
				return false;
		} else if (!ditFormaContacto.equals(other.ditFormaContacto))
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
		if (ndcAsociacion == null) {
			if (other.ndcAsociacion != null)
				return false;
		} else if (!ndcAsociacion.equals(other.ndcAsociacion))
			return false;
		return true;
	}
	
	

}