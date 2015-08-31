package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the DG_ASENTAMIENTO database table.
 * 
 */
@Embeddable
public class DgAsentamientoDOPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CVE_ASEN")
	private String cveAsen;

	@Column(name="CVE_MUN", insertable=false, updatable=false)
	private String cveMun;

	@Column(name="CVE_ENT", insertable=false, updatable=false)
	private String cveEnt;

	public DgAsentamientoDOPK() {
	}
	public String getCveAsen() {
		return this.cveAsen;
	}
	public void setCveAsen(String cveAsen) {
		this.cveAsen = cveAsen;
	}
	public String getCveMun() {
		return this.cveMun;
	}
	public void setCveMun(String cveMun) {
		this.cveMun = cveMun;
	}
	public String getCveEnt() {
		return this.cveEnt;
	}
	public void setCveEnt(String cveEnt) {
		this.cveEnt = cveEnt;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DgAsentamientoDOPK)) {
			return false;
		}
		DgAsentamientoDOPK castOther = (DgAsentamientoDOPK)other;
		return 
			this.cveAsen.equals(castOther.cveAsen)
			&& this.cveMun.equals(castOther.cveMun)
			&& this.cveEnt.equals(castOther.cveEnt);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cveAsen.hashCode();
		hash = hash * prime + this.cveMun.hashCode();
		hash = hash * prime + this.cveEnt.hashCode();
		
		return hash;
	}
}