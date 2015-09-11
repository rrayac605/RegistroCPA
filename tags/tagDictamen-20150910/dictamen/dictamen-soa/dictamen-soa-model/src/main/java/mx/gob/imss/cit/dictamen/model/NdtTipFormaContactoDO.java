package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the NDT_TIP_FORMA_CONTACTO database table.
 * 
 */
@Entity
@Table(name="NDT_TIP_FORMA_CONTACTO")
@NamedQuery(name="NdtTipFormaContactoDO.findAll", query="SELECT n FROM NdtTipFormaContactoDO n")
public class NdtTipFormaContactoDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_TIP_FORMA_CONTACTO")
	private String cveIdTipFormaContacto;

	@Column(name="CVE_ORIGEN")
	private BigDecimal cveOrigen;

	//bi-directional many-to-one association to DitFormaContactoDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_FORMA_CONTACTO")
	private DitFormaContactoDO ditFormaContacto;

	//bi-directional many-to-one association to NdcOrigenContactoDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_ORIGEN_CONTACTO")
	private NdcOrigenContactoDO ndcOrigenContacto;

	public NdtTipFormaContactoDO() {
	}

	public String getCveIdTipFormaContacto() {
		return this.cveIdTipFormaContacto;
	}

	public void setCveIdTipFormaContacto(String cveIdTipFormaContacto) {
		this.cveIdTipFormaContacto = cveIdTipFormaContacto;
	}

	public BigDecimal getCveOrigen() {
		return this.cveOrigen;
	}

	public void setCveOrigen(BigDecimal cveOrigen) {
		this.cveOrigen = cveOrigen;
	}

	public DitFormaContactoDO getDitFormaContacto() {
		return this.ditFormaContacto;
	}

	public void setDitFormaContacto(DitFormaContactoDO ditFormaContacto) {
		this.ditFormaContacto = ditFormaContacto;
	}

	public NdcOrigenContactoDO getNdcOrigenContacto() {
		return this.ndcOrigenContacto;
	}

	public void setNdcOrigenContacto(NdcOrigenContactoDO ndcOrigenContacto) {
		this.ndcOrigenContacto = ndcOrigenContacto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cveIdTipFormaContacto == null) ? 0 : cveIdTipFormaContacto.hashCode());
		result = prime * result + ((cveOrigen == null) ? 0 : cveOrigen.hashCode());
		result = prime * result + ((ditFormaContacto == null) ? 0 : ditFormaContacto.hashCode());
		result = prime * result + ((ndcOrigenContacto == null) ? 0 : ndcOrigenContacto.hashCode());
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
		NdtTipFormaContactoDO other = (NdtTipFormaContactoDO) obj;
		if (cveIdTipFormaContacto == null) {
			if (other.cveIdTipFormaContacto != null)
				return false;
		} else if (!cveIdTipFormaContacto.equals(other.cveIdTipFormaContacto))
			return false;
		if (cveOrigen == null) {
			if (other.cveOrigen != null)
				return false;
		} else if (!cveOrigen.equals(other.cveOrigen))
			return false;
		if (ditFormaContacto == null) {
			if (other.ditFormaContacto != null)
				return false;
		} else if (!ditFormaContacto.equals(other.ditFormaContacto))
			return false;
		if (ndcOrigenContacto == null) {
			if (other.ndcOrigenContacto != null)
				return false;
		} else if (!ndcOrigenContacto.equals(other.ndcOrigenContacto))
			return false;
		return true;
	}
	
	

}