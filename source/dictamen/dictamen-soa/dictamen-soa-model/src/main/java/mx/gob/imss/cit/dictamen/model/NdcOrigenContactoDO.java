package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the NDC_ORIGEN_CONTACTO database table.
 * 
 */
@Entity
@Table(name="NDC_ORIGEN_CONTACTO")
@NamedQuery(name="NdcOrigenContactoDO.findAll", query="SELECT n FROM NdcOrigenContactoDO n")
public class NdcOrigenContactoDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_ORIGEN_CONTACTO")
	private long cveIdOrigenContacto;

	@Column(name="DES_TABLA_ORIGEN")
	private String desTablaOrigen;

	//bi-directional many-to-one association to NdtTipFormaContactoDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ndcOrigenContacto")
	private List<NdtTipFormaContactoDO> ndtTipFormaContactos;

	public NdcOrigenContactoDO() {
	}

	public long getCveIdOrigenContacto() {
		return this.cveIdOrigenContacto;
	}

	public void setCveIdOrigenContacto(long cveIdOrigenContacto) {
		this.cveIdOrigenContacto = cveIdOrigenContacto;
	}

	public String getDesTablaOrigen() {
		return this.desTablaOrigen;
	}

	public void setDesTablaOrigen(String desTablaOrigen) {
		this.desTablaOrigen = desTablaOrigen;
	}

	public List<NdtTipFormaContactoDO> getNdtTipFormaContactos() {
		return this.ndtTipFormaContactos;
	}

	public void setNdtTipFormaContactos(List<NdtTipFormaContactoDO> ndtTipFormaContactos) {
		this.ndtTipFormaContactos = ndtTipFormaContactos;
	}

}