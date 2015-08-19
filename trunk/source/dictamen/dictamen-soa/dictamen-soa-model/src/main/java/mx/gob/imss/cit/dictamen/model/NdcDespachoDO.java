package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the NDC_DESPACHO database table.
 * 
 */
@Entity
@Table(name="NDC_DESPACHO")
@NamedQuery(name="NdcDespachoDO.findAll", query="SELECT n FROM NdcDespachoDO n")
public class NdcDespachoDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "CVE_ID_DESPACHO", nullable = false)
    @SequenceGenerator(name = "NdcDespacho_Id_Seq_Gen", sequenceName = "SEQ_NDCDESPACHO")
    @GeneratedValue(generator = "NdcDespacho_Id_Seq_Gen")
	private long cveIdDespacho;

	@Column(name="CVE_ID_USUARIO")
	private String cveIdUsuario;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_ACTIVACION")
	private Date fecActivacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="IND_ACTIVO")
	private String indActivo;

	@Column(name="NOM_RAZON_SOCIAL")
	private String nomRazonSocial;

	@Column(name="REGISTRO_PATRONAL_U")
	private String registroPatronalU;

	private String rfc;

	//bi-directional many-to-one association to DgDomicilioGeograficoDO
	@ManyToOne
	@JoinColumn(name="DOMICILIO_ID")
	private DgDomicilioGeograficoDO dgDomicilioGeografico;

	//bi-directional many-to-one association to NdtDespachoContactoDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ndcDespacho")
	private List<NdtDespachoContactoDO> ndtDespachoContactos;

	//bi-directional many-to-one association to NdtR2DespachoDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ndcDespacho")
	private List<NdtR2DespachoDO> ndtR2Despachos;

	public NdcDespachoDO() {
	}

	public long getCveIdDespacho() {
		return this.cveIdDespacho;
	}

	public void setCveIdDespacho(long cveIdDespacho) {
		this.cveIdDespacho = cveIdDespacho;
	}

	public String getCveIdUsuario() {
		return this.cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public Date getFecActivacion() {
		return this.fecActivacion;
	}

	public void setFecActivacion(Date fecActivacion) {
		this.fecActivacion = fecActivacion;
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

	public String getIndActivo() {
		return this.indActivo;
	}

	public void setIndActivo(String indActivo) {
		this.indActivo = indActivo;
	}

	public String getNomRazonSocial() {
		return this.nomRazonSocial;
	}

	public void setNomRazonSocial(String nomRazonSocial) {
		this.nomRazonSocial = nomRazonSocial;
	}

	public String getRegistroPatronalU() {
		return this.registroPatronalU;
	}

	public void setRegistroPatronalU(String registroPatronalU) {
		this.registroPatronalU = registroPatronalU;
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

	public List<NdtDespachoContactoDO> getNdtDespachoContactos() {
		return this.ndtDespachoContactos;
	}

	public void setNdtDespachoContactos(List<NdtDespachoContactoDO> ndtDespachoContactos) {
		this.ndtDespachoContactos = ndtDespachoContactos;
	}

	public List<NdtR2DespachoDO> getNdtR2Despachos() {
		return this.ndtR2Despachos;
	}

	public void setNdtR2Despachos(List<NdtR2DespachoDO> ndtR2Despachos) {
		this.ndtR2Despachos = ndtR2Despachos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveIdDespacho ^ (cveIdDespacho >>> 32));
		result = prime * result + ((cveIdUsuario == null) ? 0 : cveIdUsuario.hashCode());
		result = prime * result + ((dgDomicilioGeografico == null) ? 0 : dgDomicilioGeografico.hashCode());
		result = prime * result + ((fecActivacion == null) ? 0 : fecActivacion.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((indActivo == null) ? 0 : indActivo.hashCode());
		result = prime * result + ((ndtDespachoContactos == null) ? 0 : ndtDespachoContactos.hashCode());
		result = prime * result + ((ndtR2Despachos == null) ? 0 : ndtR2Despachos.hashCode());
		result = prime * result + ((nomRazonSocial == null) ? 0 : nomRazonSocial.hashCode());
		result = prime * result + ((registroPatronalU == null) ? 0 : registroPatronalU.hashCode());
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
		NdcDespachoDO other = (NdcDespachoDO) obj;
		if (cveIdDespacho != other.cveIdDespacho)
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
		if (fecActivacion == null) {
			if (other.fecActivacion != null)
				return false;
		} else if (!fecActivacion.equals(other.fecActivacion))
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
		if (indActivo == null) {
			if (other.indActivo != null)
				return false;
		} else if (!indActivo.equals(other.indActivo))
			return false;
		if (ndtDespachoContactos == null) {
			if (other.ndtDespachoContactos != null)
				return false;
		} else if (!ndtDespachoContactos.equals(other.ndtDespachoContactos))
			return false;
		if (ndtR2Despachos == null) {
			if (other.ndtR2Despachos != null)
				return false;
		} else if (!ndtR2Despachos.equals(other.ndtR2Despachos))
			return false;
		if (nomRazonSocial == null) {
			if (other.nomRazonSocial != null)
				return false;
		} else if (!nomRazonSocial.equals(other.nomRazonSocial))
			return false;
		if (registroPatronalU == null) {
			if (other.registroPatronalU != null)
				return false;
		} else if (!registroPatronalU.equals(other.registroPatronalU))
			return false;
		if (rfc == null) {
			if (other.rfc != null)
				return false;
		} else if (!rfc.equals(other.rfc))
			return false;
		return true;
	}
	
	
	
}