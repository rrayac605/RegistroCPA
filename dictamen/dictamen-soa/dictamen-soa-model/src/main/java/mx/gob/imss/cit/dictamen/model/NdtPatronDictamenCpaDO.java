package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the NDT_PATRON_DICTAMEN_CPA database table.
 * 
 */
@Entity
@Table(name="NDT_PATRON_DICTAMEN_CPA")
@NamedQuery(name="NdtPatronDictamenCpaDO.findAll", query="SELECT n FROM NdtPatronDictamenCpaDO n")
public class NdtPatronDictamenCpaDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "CVE_ID_PATRON_CPA_DICTAMEN", nullable = false)
    @SequenceGenerator(name = "NdtPatronDictamenCpa_Id_Seq_Gen", sequenceName = "SEQ_NDTPATRONDICTAMENCPA")
    @GeneratedValue(generator = "NdtPatronDictamenCpa_Id_Seq_Gen")
	private long cveIdPatronCpaDictamen;

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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_SOLICITUD_PATRON_CPA")
	private Date fecSolicitudPatronCpa;

	//bi-directional many-to-one association to NdtContadorPublicoAutDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_CPA")
	private NdtContadorPublicoAutDO ndtContadorPublicoAut;

	//bi-directional many-to-one association to NdtPatronDictamenDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_DICTAMEN")
	private NdtPatronDictamenDO ndtPatronDictamen;

	public NdtPatronDictamenCpaDO() {
	}

	public long getCveIdPatronCpaDictamen() {
		return this.cveIdPatronCpaDictamen;
	}

	public void setCveIdPatronCpaDictamen(long cveIdPatronCpaDictamen) {
		this.cveIdPatronCpaDictamen = cveIdPatronCpaDictamen;
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

	public Date getFecSolicitudPatronCpa() {
		return this.fecSolicitudPatronCpa;
	}

	public void setFecSolicitudPatronCpa(Date fecSolicitudPatronCpa) {
		this.fecSolicitudPatronCpa = fecSolicitudPatronCpa;
	}

	public NdtContadorPublicoAutDO getNdtContadorPublicoAut() {
		return this.ndtContadorPublicoAut;
	}

	public void setNdtContadorPublicoAut(NdtContadorPublicoAutDO ndtContadorPublicoAut) {
		this.ndtContadorPublicoAut = ndtContadorPublicoAut;
	}

	public NdtPatronDictamenDO getNdtPatronDictamen() {
		return this.ndtPatronDictamen;
	}

	public void setNdtPatronDictamen(NdtPatronDictamenDO ndtPatronDictamen) {
		this.ndtPatronDictamen = ndtPatronDictamen;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveIdPatronCpaDictamen ^ (cveIdPatronCpaDictamen >>> 32));
		result = prime * result + ((cveIdUsuario == null) ? 0 : cveIdUsuario.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((fecSolicitudPatronCpa == null) ? 0 : fecSolicitudPatronCpa.hashCode());
		result = prime * result + ((ndtContadorPublicoAut == null) ? 0 : ndtContadorPublicoAut.hashCode());
		result = prime * result + ((ndtPatronDictamen == null) ? 0 : ndtPatronDictamen.hashCode());
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
		NdtPatronDictamenCpaDO other = (NdtPatronDictamenCpaDO) obj;
		if (cveIdPatronCpaDictamen != other.cveIdPatronCpaDictamen)
			return false;
		if (cveIdUsuario == null) {
			if (other.cveIdUsuario != null)
				return false;
		} else if (!cveIdUsuario.equals(other.cveIdUsuario))
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
		if (fecSolicitudPatronCpa == null) {
			if (other.fecSolicitudPatronCpa != null)
				return false;
		} else if (!fecSolicitudPatronCpa.equals(other.fecSolicitudPatronCpa))
			return false;
		if (ndtContadorPublicoAut == null) {
			if (other.ndtContadorPublicoAut != null)
				return false;
		} else if (!ndtContadorPublicoAut.equals(other.ndtContadorPublicoAut))
			return false;
		if (ndtPatronDictamen == null) {
			if (other.ndtPatronDictamen != null)
				return false;
		} else if (!ndtPatronDictamen.equals(other.ndtPatronDictamen))
			return false;
		return true;
	}
	
	

}