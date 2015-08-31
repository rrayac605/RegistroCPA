package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIC_DOCUMENTO database table.
 * 
 */
@Entity
@Table(name="DIC_DOCUMENTO")
@NamedQuery(name="DicDocumentoDO.findAll", query="SELECT d FROM DicDocumentoDO d")
public class DicDocumentoDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_DOCUMENTO")
	private long cveIdDocumento;

	@Column(name="DES_DOCUMENTO")
	private String desDocumento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to DitDocumentoPorTipoDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dicDocumento")
	private List<DitDocumentoPorTipoDO> ditDocumentoPorTipos;

	public DicDocumentoDO() {
	}

	public long getCveIdDocumento() {
		return this.cveIdDocumento;
	}

	public void setCveIdDocumento(long cveIdDocumento) {
		this.cveIdDocumento = cveIdDocumento;
	}

	public String getDesDocumento() {
		return this.desDocumento;
	}

	public void setDesDocumento(String desDocumento) {
		this.desDocumento = desDocumento;
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

	public List<DitDocumentoPorTipoDO> getDitDocumentoPorTipos() {
		return this.ditDocumentoPorTipos;
	}

	public void setDitDocumentoPorTipos(List<DitDocumentoPorTipoDO> ditDocumentoPorTipos) {
		this.ditDocumentoPorTipos = ditDocumentoPorTipos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveIdDocumento ^ (cveIdDocumento >>> 32));
		result = prime * result + ((desDocumento == null) ? 0 : desDocumento.hashCode());
		result = prime * result + ((ditDocumentoPorTipos == null) ? 0 : ditDocumentoPorTipos.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
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
		DicDocumentoDO other = (DicDocumentoDO) obj;
		if (cveIdDocumento != other.cveIdDocumento)
			return false;
		if (desDocumento == null) {
			if (other.desDocumento != null)
				return false;
		} else if (!desDocumento.equals(other.desDocumento))
			return false;
		if (ditDocumentoPorTipos == null) {
			if (other.ditDocumentoPorTipos != null)
				return false;
		} else if (!ditDocumentoPorTipos.equals(other.ditDocumentoPorTipos))
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
		return true;
	}
	
	
	
}