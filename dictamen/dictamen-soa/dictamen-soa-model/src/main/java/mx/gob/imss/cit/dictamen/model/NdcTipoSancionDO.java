package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the NDC_TIPO_SANCION database table.
 * 
 */
@Entity
@Table(name="NDC_TIPO_SANCION")
@NamedQuery(name="NdcTipoSancionDO.findAll", query="SELECT n FROM NdcTipoSancionDO n")
public class NdcTipoSancionDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "CVE_ID_TIPOSANCION", nullable = false)
    @SequenceGenerator(name = "NdcTipoSancion_Id_Seq_Gen", sequenceName = "SEQ_NDCTIPOSANCION")
    @GeneratedValue(generator = "NdcTipoSancion_Id_Seq_Gen")
	private long cveIdTiposancion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	private String sancion;

	//bi-directional many-to-many association to NdtContadorPublicoAutDO
	@ManyToMany(mappedBy="ndcTipoSancions")
	private List<NdtContadorPublicoAutDO> ndtContadorPublicoAuts;

	public NdcTipoSancionDO() {
	}

	public long getCveIdTiposancion() {
		return this.cveIdTiposancion;
	}

	public void setCveIdTiposancion(long cveIdTiposancion) {
		this.cveIdTiposancion = cveIdTiposancion;
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

	public String getSancion() {
		return this.sancion;
	}

	public void setSancion(String sancion) {
		this.sancion = sancion;
	}

	public List<NdtContadorPublicoAutDO> getNdtContadorPublicoAuts() {
		return this.ndtContadorPublicoAuts;
	}

	public void setNdtContadorPublicoAuts(List<NdtContadorPublicoAutDO> ndtContadorPublicoAuts) {
		this.ndtContadorPublicoAuts = ndtContadorPublicoAuts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveIdTiposancion ^ (cveIdTiposancion >>> 32));
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((ndtContadorPublicoAuts == null) ? 0 : ndtContadorPublicoAuts.hashCode());
		result = prime * result + ((sancion == null) ? 0 : sancion.hashCode());
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
		NdcTipoSancionDO other = (NdcTipoSancionDO) obj;
		if (cveIdTiposancion != other.cveIdTiposancion)
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
		if (sancion == null) {
			if (other.sancion != null)
				return false;
		} else if (!sancion.equals(other.sancion))
			return false;
		return true;
	}
	
	

}