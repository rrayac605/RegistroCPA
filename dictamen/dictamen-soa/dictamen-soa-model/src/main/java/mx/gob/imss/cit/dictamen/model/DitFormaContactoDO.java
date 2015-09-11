package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIT_FORMA_CONTACTO database table.
 * 
 */
@Entity
@Table(name="DIT_FORMA_CONTACTO")
@NamedQuery(name="DitFormaContactoDO.findAll", query="SELECT d FROM DitFormaContactoDO d")
public class DitFormaContactoDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_FORMA_CONTACTO")
	private long cveIdFormaContacto;

	@Column(name="CVE_ID_TIPO_CONTACTO")
	private BigDecimal cveIdTipoContacto;

	@Column(name="DES_FORMA_CONTACTO")
	private String desFormaContacto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to NdtAsociacionContactoDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditFormaContacto")
	private List<NdtAsociacionContactoDO> ndtAsociacionContactos;

	//bi-directional many-to-one association to NdtColegioContactoDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditFormaContacto")
	private List<NdtColegioContactoDO> ndtColegioContactos;

	//bi-directional many-to-one association to NdtDespachoContactoDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditFormaContacto")
	private List<NdtDespachoContactoDO> ndtDespachoContactos;

	//bi-directional many-to-one association to NdtTipFormaContactoDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditFormaContacto")
	private List<NdtTipFormaContactoDO> ndtTipFormaContactos;

	public DitFormaContactoDO() {
	}

	public long getCveIdFormaContacto() {
		return this.cveIdFormaContacto;
	}

	public void setCveIdFormaContacto(long cveIdFormaContacto) {
		this.cveIdFormaContacto = cveIdFormaContacto;
	}

	public BigDecimal getCveIdTipoContacto() {
		return this.cveIdTipoContacto;
	}

	public void setCveIdTipoContacto(BigDecimal cveIdTipoContacto) {
		this.cveIdTipoContacto = cveIdTipoContacto;
	}

	public String getDesFormaContacto() {
		return this.desFormaContacto;
	}

	public void setDesFormaContacto(String desFormaContacto) {
		this.desFormaContacto = desFormaContacto;
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

	public List<NdtAsociacionContactoDO> getNdtAsociacionContactos() {
		return this.ndtAsociacionContactos;
	}

	public void setNdtAsociacionContactos(List<NdtAsociacionContactoDO> ndtAsociacionContactos) {
		this.ndtAsociacionContactos = ndtAsociacionContactos;
	}
	
	public List<NdtColegioContactoDO> getNdtColegioContactos() {
		return this.ndtColegioContactos;
	}

	public void setNdtColegioContactos(List<NdtColegioContactoDO> ndtColegioContactos) {
		this.ndtColegioContactos = ndtColegioContactos;
	}

	public List<NdtDespachoContactoDO> getNdtDespachoContactos() {
		return this.ndtDespachoContactos;
	}

	public void setNdtDespachoContactos(List<NdtDespachoContactoDO> ndtDespachoContactos) {
		this.ndtDespachoContactos = ndtDespachoContactos;
	}

	public List<NdtTipFormaContactoDO> getNdtTipFormaContactos() {
		return this.ndtTipFormaContactos;
	}

	public void setNdtTipFormaContactos(List<NdtTipFormaContactoDO> ndtTipFormaContactos) {
		this.ndtTipFormaContactos = ndtTipFormaContactos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveIdFormaContacto ^ (cveIdFormaContacto >>> 32));
		result = prime * result + ((cveIdTipoContacto == null) ? 0 : cveIdTipoContacto.hashCode());
		result = prime * result + ((desFormaContacto == null) ? 0 : desFormaContacto.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((ndtAsociacionContactos == null) ? 0 : ndtAsociacionContactos.hashCode());
		result = prime * result + ((ndtColegioContactos == null) ? 0 : ndtColegioContactos.hashCode());
		result = prime * result + ((ndtDespachoContactos == null) ? 0 : ndtDespachoContactos.hashCode());
		result = prime * result + ((ndtTipFormaContactos == null) ? 0 : ndtTipFormaContactos.hashCode());
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
		DitFormaContactoDO other = (DitFormaContactoDO) obj;
		if (cveIdFormaContacto != other.cveIdFormaContacto)
			return false;
		if (cveIdTipoContacto == null) {
			if (other.cveIdTipoContacto != null)
				return false;
		} else if (!cveIdTipoContacto.equals(other.cveIdTipoContacto))
			return false;
		if (desFormaContacto == null) {
			if (other.desFormaContacto != null)
				return false;
		} else if (!desFormaContacto.equals(other.desFormaContacto))
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
		if (ndtAsociacionContactos == null) {
			if (other.ndtAsociacionContactos != null)
				return false;
		} else if (!ndtAsociacionContactos.equals(other.ndtAsociacionContactos))
			return false;
		if (ndtColegioContactos == null) {
			if (other.ndtColegioContactos != null)
				return false;
		} else if (!ndtColegioContactos.equals(other.ndtColegioContactos))
			return false;
		if (ndtDespachoContactos == null) {
			if (other.ndtDespachoContactos != null)
				return false;
		} else if (!ndtDespachoContactos.equals(other.ndtDespachoContactos))
			return false;
		if (ndtTipFormaContactos == null) {
			if (other.ndtTipFormaContactos != null)
				return false;
		} else if (!ndtTipFormaContactos.equals(other.ndtTipFormaContactos))
			return false;
		return true;
	}
	
	
}