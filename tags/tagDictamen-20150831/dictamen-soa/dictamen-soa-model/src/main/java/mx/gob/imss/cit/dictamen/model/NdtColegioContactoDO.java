package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the NDT_COLEGIO_CONTACTO database table.
 * 
 */
@Entity
@Table(name="NDT_COLEGIO_CONTACTO")
@NamedQuery(name="NdtColegioContactoDO.findAll", query="SELECT n FROM NdtColegioContactoDO n")
public class NdtColegioContactoDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "CVE_ID_COLEGIO_CONTACTO", nullable = false)
    @SequenceGenerator(name = "NdtColegioContacto_Id_Seq_Gen", sequenceName = "SEQ_NDTCOLEGIOCONTACTO")
    @GeneratedValue(generator = "NdtColegioContacto_Id_Seq_Gen")
	private long cveIdColegioContacto;

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

	//bi-directional many-to-one association to NdcColegioDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_COLEGIO")
	private NdcColegioDO ndcColegio;

	public NdtColegioContactoDO() {
	}

	public long getCveIdColegioContacto() {
		return this.cveIdColegioContacto;
	}

	public void setCveIdColegioContacto(long cveIdColegioContacto) {
		this.cveIdColegioContacto = cveIdColegioContacto;
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

	public NdcColegioDO getNdcColegio() {
		return this.ndcColegio;
	}

	public void setNdcColegio(NdcColegioDO ndcColegio) {
		this.ndcColegio = ndcColegio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveIdColegioContacto ^ (cveIdColegioContacto >>> 32));
		result = prime * result + ((ditFormaContacto == null) ? 0 : ditFormaContacto.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((ndcColegio == null) ? 0 : ndcColegio.hashCode());
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
		NdtColegioContactoDO other = (NdtColegioContactoDO) obj;
		if (cveIdColegioContacto != other.cveIdColegioContacto)
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
		if (ndcColegio == null) {
			if (other.ndcColegio != null)
				return false;
		} else if (!ndcColegio.equals(other.ndcColegio))
			return false;
		return true;
	}
	
	
}