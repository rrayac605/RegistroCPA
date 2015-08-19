package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DIT_TIPO_CONTACTO database table.
 * 
 */
@Entity
@Table(name="DIT_TIPO_CONTACTO")
@NamedQuery(name="DitTipoContactoDO.findAll", query="SELECT d FROM DitTipoContactoDO d")
public class DitTipoContactoDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_TIPO_CONTACTO")
	private long cveIdTipoContacto;

	@Column(name="DES_ESTRUCTURA")
	private String desEstructura;

	@Column(name="DES_MASCARA")
	private String desMascara;

	@Column(name="DES_TIPO_CONTACTO")
	private String desTipoContacto;

	public DitTipoContactoDO() {
	}

	public long getCveIdTipoContacto() {
		return this.cveIdTipoContacto;
	}

	public void setCveIdTipoContacto(long cveIdTipoContacto) {
		this.cveIdTipoContacto = cveIdTipoContacto;
	}

	public String getDesEstructura() {
		return this.desEstructura;
	}

	public void setDesEstructura(String desEstructura) {
		this.desEstructura = desEstructura;
	}

	public String getDesMascara() {
		return this.desMascara;
	}

	public void setDesMascara(String desMascara) {
		this.desMascara = desMascara;
	}

	public String getDesTipoContacto() {
		return this.desTipoContacto;
	}

	public void setDesTipoContacto(String desTipoContacto) {
		this.desTipoContacto = desTipoContacto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveIdTipoContacto ^ (cveIdTipoContacto >>> 32));
		result = prime * result + ((desEstructura == null) ? 0 : desEstructura.hashCode());
		result = prime * result + ((desMascara == null) ? 0 : desMascara.hashCode());
		result = prime * result + ((desTipoContacto == null) ? 0 : desTipoContacto.hashCode());
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
		DitTipoContactoDO other = (DitTipoContactoDO) obj;
		if (cveIdTipoContacto != other.cveIdTipoContacto)
			return false;
		if (desEstructura == null) {
			if (other.desEstructura != null)
				return false;
		} else if (!desEstructura.equals(other.desEstructura))
			return false;
		if (desMascara == null) {
			if (other.desMascara != null)
				return false;
		} else if (!desMascara.equals(other.desMascara))
			return false;
		if (desTipoContacto == null) {
			if (other.desTipoContacto != null)
				return false;
		} else if (!desTipoContacto.equals(other.desTipoContacto))
			return false;
		return true;
	}
	
	
}