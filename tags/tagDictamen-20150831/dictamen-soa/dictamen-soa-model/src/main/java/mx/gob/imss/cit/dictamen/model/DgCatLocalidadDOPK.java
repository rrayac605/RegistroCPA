package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the DG_CAT_LOCALIDAD database table.
 * 
 */
@Embeddable
public class DgCatLocalidadDOPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CVE_ENT", insertable=false, updatable=false)
	private String cveEnt;

	@Column(name="CVE_MUN", insertable=false, updatable=false)
	private String cveMun;

	@Column(name="CVE_LOC")
	private String cveLoc;

	@Column(name="CVE_PERIODO", insertable=false, updatable=false)
	private long cvePeriodo;

	public DgCatLocalidadDOPK() {
	}
	public String getCveEnt() {
		return this.cveEnt;
	}
	public void setCveEnt(String cveEnt) {
		this.cveEnt = cveEnt;
	}
	public String getCveMun() {
		return this.cveMun;
	}
	public void setCveMun(String cveMun) {
		this.cveMun = cveMun;
	}
	public String getCveLoc() {
		return this.cveLoc;
	}
	public void setCveLoc(String cveLoc) {
		this.cveLoc = cveLoc;
	}
	public long getCvePeriodo() {
		return this.cvePeriodo;
	}
	public void setCvePeriodo(long cvePeriodo) {
		this.cvePeriodo = cvePeriodo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DgCatLocalidadDOPK)) {
			return false;
		}
		DgCatLocalidadDOPK castOther = (DgCatLocalidadDOPK)other;
		return 
			this.cveEnt.equals(castOther.cveEnt)
			&& this.cveMun.equals(castOther.cveMun)
			&& this.cveLoc.equals(castOther.cveLoc)
			&& (this.cvePeriodo == castOther.cvePeriodo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cveEnt.hashCode();
		hash = hash * prime + this.cveMun.hashCode();
		hash = hash * prime + this.cveLoc.hashCode();
		hash = hash * prime + ((int) (this.cvePeriodo ^ (this.cvePeriodo >>> 32)));
		
		return hash;
	}
}