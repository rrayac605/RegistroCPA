package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIC_TIPO_DOCUMENTO_PROBATORIO database table.
 * 
 */
@Entity
@Table(name="DIC_TIPO_DOCUMENTO_PROBATORIO")
@NamedQuery(name="DicTipoDocumentoProbatorioDO.findAll", query="SELECT d FROM DicTipoDocumentoProbatorioDO d")
public class DicTipoDocumentoProbatorioDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_TIPO_DOCUMENTO_PROBATOR")
	private long cveIdTipoDocumentoProbator;

	@Column(name="DES_TIPO_DOCUMENTO_PROBATORIO")
	private String desTipoDocumentoProbatorio;

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
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dicTipoDocumentoProbatorio")
	private List<DitDocumentoPorTipoDO> ditDocumentoPorTipos;

	public DicTipoDocumentoProbatorioDO() {
	}

	public long getCveIdTipoDocumentoProbator() {
		return this.cveIdTipoDocumentoProbator;
	}

	public void setCveIdTipoDocumentoProbator(long cveIdTipoDocumentoProbator) {
		this.cveIdTipoDocumentoProbator = cveIdTipoDocumentoProbator;
	}

	public String getDesTipoDocumentoProbatorio() {
		return this.desTipoDocumentoProbatorio;
	}

	public void setDesTipoDocumentoProbatorio(String desTipoDocumentoProbatorio) {
		this.desTipoDocumentoProbatorio = desTipoDocumentoProbatorio;
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
		result = prime * result + (int) (cveIdTipoDocumentoProbator ^ (cveIdTipoDocumentoProbator >>> 32));
		result = prime * result + ((desTipoDocumentoProbatorio == null) ? 0 : desTipoDocumentoProbatorio.hashCode());
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
		DicTipoDocumentoProbatorioDO other = (DicTipoDocumentoProbatorioDO) obj;
		if (cveIdTipoDocumentoProbator != other.cveIdTipoDocumentoProbator)
			return false;
		if (desTipoDocumentoProbatorio == null) {
			if (other.desTipoDocumentoProbatorio != null)
				return false;
		} else if (!desTipoDocumentoProbatorio.equals(other.desTipoDocumentoProbatorio))
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