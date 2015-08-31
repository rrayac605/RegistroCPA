package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the DIT_HIST_ESTADO_PERSONA_MORAL database table.
 * 
 */
@Embeddable
public class DitHistEstadoPersonaMoralDOPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CVE_ESTADO_PERSONA")
	private long cveEstadoPersona;

	@Column(name="CVE_ID_PERSONA_MORAL", insertable=false, updatable=false)
	private long cveIdPersonaMoral;

	public DitHistEstadoPersonaMoralDOPK() {
	}
	public long getCveEstadoPersona() {
		return this.cveEstadoPersona;
	}
	public void setCveEstadoPersona(long cveEstadoPersona) {
		this.cveEstadoPersona = cveEstadoPersona;
	}
	public long getCveIdPersonaMoral() {
		return this.cveIdPersonaMoral;
	}
	public void setCveIdPersonaMoral(long cveIdPersonaMoral) {
		this.cveIdPersonaMoral = cveIdPersonaMoral;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DitHistEstadoPersonaMoralDOPK)) {
			return false;
		}
		DitHistEstadoPersonaMoralDOPK castOther = (DitHistEstadoPersonaMoralDOPK)other;
		return 
			(this.cveEstadoPersona == castOther.cveEstadoPersona)
			&& (this.cveIdPersonaMoral == castOther.cveIdPersonaMoral);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cveEstadoPersona ^ (this.cveEstadoPersona >>> 32)));
		hash = hash * prime + ((int) (this.cveIdPersonaMoral ^ (this.cveIdPersonaMoral >>> 32)));
		
		return hash;
	}
}