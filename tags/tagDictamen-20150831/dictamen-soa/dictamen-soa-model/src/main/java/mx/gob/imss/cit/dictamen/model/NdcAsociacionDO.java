package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the NDC_ASOCIACION database table.
 * 
 */
@Entity
@Table(name="NDC_ASOCIACION")
@NamedQuery(name="NdcAsociacionDO.findAll", query="SELECT n FROM NdcAsociacionDO n")
public class NdcAsociacionDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "CVE_ID_ASOCIACION", nullable = false)
	@SequenceGenerator(name = "NdcAsociacion_Id_Seq_Gen", sequenceName = "SEQ_NDCASOCIACION")
    @GeneratedValue(generator = "NdcAsociacion_Id_Seq_Gen")
	private long cveIdAsociacion;

	@Column(name="CVE_ID_USUARIO")
	private String cveIdUsuario;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="NOM_NOMBRE")
	private String nomNombre;

	private String rfc;

	//bi-directional many-to-one association to DgDomicilioGeograficoDO
	@ManyToOne
	@JoinColumn(name="DOMICILIO_ID")
	private DgDomicilioGeograficoDO dgDomicilioGeografico;

	//bi-directional many-to-one association to NdcColegioDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ndcAsociacion")
	private List<NdcColegioDO> ndcColegios;

	//bi-directional many-to-one association to NdtAsociacionContactoDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ndcAsociacion")
	private List<NdtAsociacionContactoDO> ndtAsociacionContactos;

	public NdcAsociacionDO() {
	}

	public long getCveIdAsociacion() {
		return this.cveIdAsociacion;
	}

	public void setCveIdAsociacion(long cveIdAsociacion) {
		this.cveIdAsociacion = cveIdAsociacion;
	}

	public String getCveIdUsuario() {
		return this.cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
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

	public String getNomNombre() {
		return this.nomNombre;
	}

	public void setNomNombre(String nomNombre) {
		this.nomNombre = nomNombre;
	}

	public String getRfc() {
		return this.rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public DgDomicilioGeograficoDO getDgDomicilioGeografico() {
		return this.dgDomicilioGeografico;
	}

	public void setDgDomicilioGeografico(DgDomicilioGeograficoDO dgDomicilioGeografico) {
		this.dgDomicilioGeografico = dgDomicilioGeografico;
	}

	public List<NdcColegioDO> getNdcColegios() {
		return this.ndcColegios;
	}

	public void setNdcColegios(List<NdcColegioDO> ndcColegios) {
		this.ndcColegios = ndcColegios;
	}

	public List<NdtAsociacionContactoDO> getNdtAsociacionContactos() {
		return this.ndtAsociacionContactos;
	}

	public void setNdtAsociacionContactos(List<NdtAsociacionContactoDO> ndtAsociacionContactos) {
		this.ndtAsociacionContactos = ndtAsociacionContactos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveIdAsociacion ^ (cveIdAsociacion >>> 32));
		result = prime * result + ((cveIdUsuario == null) ? 0 : cveIdUsuario.hashCode());
		result = prime * result + ((dgDomicilioGeografico == null) ? 0 : dgDomicilioGeografico.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((ndcColegios == null) ? 0 : ndcColegios.hashCode());
		result = prime * result + ((ndtAsociacionContactos == null) ? 0 : ndtAsociacionContactos.hashCode());
		result = prime * result + ((nomNombre == null) ? 0 : nomNombre.hashCode());
		result = prime * result + ((rfc == null) ? 0 : rfc.hashCode());
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
		NdcAsociacionDO other = (NdcAsociacionDO) obj;
		if (cveIdAsociacion != other.cveIdAsociacion)
			return false;
		if (cveIdUsuario == null) {
			if (other.cveIdUsuario != null)
				return false;
		} else if (!cveIdUsuario.equals(other.cveIdUsuario))
			return false;
		if (dgDomicilioGeografico == null) {
			if (other.dgDomicilioGeografico != null)
				return false;
		} else if (!dgDomicilioGeografico.equals(other.dgDomicilioGeografico))
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
		if (ndcColegios == null) {
			if (other.ndcColegios != null)
				return false;
		} else if (!ndcColegios.equals(other.ndcColegios))
			return false;
		if (ndtAsociacionContactos == null) {
			if (other.ndtAsociacionContactos != null)
				return false;
		} else if (!ndtAsociacionContactos.equals(other.ndtAsociacionContactos))
			return false;
		if (nomNombre == null) {
			if (other.nomNombre != null)
				return false;
		} else if (!nomNombre.equals(other.nomNombre))
			return false;
		if (rfc == null) {
			if (other.rfc != null)
				return false;
		} else if (!rfc.equals(other.rfc))
			return false;
		return true;
	}
	
	
}