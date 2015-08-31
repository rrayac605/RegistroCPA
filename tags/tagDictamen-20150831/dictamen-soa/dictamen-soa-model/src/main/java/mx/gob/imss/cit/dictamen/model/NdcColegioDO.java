package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the NDC_COLEGIO database table.
 * 
 */
@Entity
@Table(name="NDC_COLEGIO")
@NamedQuery(name="NdcColegioDO.findAll", query="SELECT n FROM NdcColegioDO n")
public class NdcColegioDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "CVE_ID_COLEGIO", nullable = false)
    @SequenceGenerator(name = "NdcColegio_Id_Seq_Gen", sequenceName = "SEQ_NDCCOLEGIO")
    @GeneratedValue(generator = "NdcColegio_Id_Seq_Gen")
	private long cveIdColegio;

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

	//bi-directional many-to-one association to NdcAsociacionDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_ASOCIACION")
	private NdcAsociacionDO ndcAsociacion;

	//bi-directional many-to-one association to NdtAcreditacionDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ndcColegio")
	private List<NdtAcreditacionDO> ndtAcreditacions;

	//bi-directional many-to-one association to NdtColegioContactoDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ndcColegio")
	private List<NdtColegioContactoDO> ndtColegioContactos;

	//bi-directional many-to-one association to NdtR3ColegioXcontadorDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ndcColegio")
	private List<NdtR3ColegioXcontadorDO> ndtR3ColegioXcontadors;

	public NdcColegioDO() {
	}

	public long getCveIdColegio() {
		return this.cveIdColegio;
	}

	public void setCveIdColegio(long cveIdColegio) {
		this.cveIdColegio = cveIdColegio;
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

	public NdcAsociacionDO getNdcAsociacion() {
		return this.ndcAsociacion;
	}

	public void setNdcAsociacion(NdcAsociacionDO ndcAsociacion) {
		this.ndcAsociacion = ndcAsociacion;
	}

	public List<NdtAcreditacionDO> getNdtAcreditacions() {
		return this.ndtAcreditacions;
	}

	public void setNdtAcreditacions(List<NdtAcreditacionDO> ndtAcreditacions) {
		this.ndtAcreditacions = ndtAcreditacions;
	}


	public List<NdtColegioContactoDO> getNdtColegioContactos() {
		return this.ndtColegioContactos;
	}

	public void setNdtColegioContactos(List<NdtColegioContactoDO> ndtColegioContactos) {
		this.ndtColegioContactos = ndtColegioContactos;
	}

	public List<NdtR3ColegioXcontadorDO> getNdtR3ColegioXcontadors() {
		return this.ndtR3ColegioXcontadors;
	}

	public void setNdtR3ColegioXcontadors(List<NdtR3ColegioXcontadorDO> ndtR3ColegioXcontadors) {
		this.ndtR3ColegioXcontadors = ndtR3ColegioXcontadors;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveIdColegio ^ (cveIdColegio >>> 32));
		result = prime * result + ((cveIdUsuario == null) ? 0 : cveIdUsuario.hashCode());
		result = prime * result + ((dgDomicilioGeografico == null) ? 0 : dgDomicilioGeografico.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((ndcAsociacion == null) ? 0 : ndcAsociacion.hashCode());
		result = prime * result + ((ndtAcreditacions == null) ? 0 : ndtAcreditacions.hashCode());
		result = prime * result + ((ndtColegioContactos == null) ? 0 : ndtColegioContactos.hashCode());
		result = prime * result + ((ndtR3ColegioXcontadors == null) ? 0 : ndtR3ColegioXcontadors.hashCode());
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
		NdcColegioDO other = (NdcColegioDO) obj;
		if (cveIdColegio != other.cveIdColegio)
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
		if (ndcAsociacion == null) {
			if (other.ndcAsociacion != null)
				return false;
		} else if (!ndcAsociacion.equals(other.ndcAsociacion))
			return false;
		if (ndtAcreditacions == null) {
			if (other.ndtAcreditacions != null)
				return false;
		} else if (!ndtAcreditacions.equals(other.ndtAcreditacions))
			return false;
		if (ndtColegioContactos == null) {
			if (other.ndtColegioContactos != null)
				return false;
		} else if (!ndtColegioContactos.equals(other.ndtColegioContactos))
			return false;
		if (ndtR3ColegioXcontadors == null) {
			if (other.ndtR3ColegioXcontadors != null)
				return false;
		} else if (!ndtR3ColegioXcontadors.equals(other.ndtR3ColegioXcontadors))
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