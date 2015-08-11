package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the DG_CAT_MUNICIPIO database table.
 * 
 */
@Embeddable
public class DgCatMunicipioDOPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CVE_MUN")
	private String cveMun;

	@Column(name="CVE_ENT", insertable=false, updatable=false)
	private String cveEnt;

	public DgCatMunicipioDOPK() {
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
		if (!(other instanceof DgCatMunicipioDOPK)) {
			return false;
		}
		DgCatMunicipioDOPK castOther = (DgCatMunicipioDOPK)other;
		return 
			this.cveMun.equals(castOther.cveMun)
			&& this.cveEnt.equals(castOther.cveEnt);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cveMun.hashCode();
		hash = hash * prime + this.cveEnt.hashCode();
		
		return hash;
	}
}