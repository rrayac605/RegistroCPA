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
    @Column(name = "CVE_ID_ORIGEN_CONTACTO", nullable = false)
    @SequenceGenerator(name = "NdcOrigenContacto_Id_Seq_Gen", sequenceName = "SEQ_NDCORIGENCONTACTO")
    @GeneratedValue(generator = "NdcOrigenContacto_Id_Seq_Gen")
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveIdOrigenContacto ^ (cveIdOrigenContacto >>> 32));
		result = prime * result + ((desTablaOrigen == null) ? 0 : desTablaOrigen.hashCode());
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
		NdcOrigenContactoDO other = (NdcOrigenContactoDO) obj;
		if (cveIdOrigenContacto != other.cveIdOrigenContacto)
			return false;
		if (desTablaOrigen == null) {
			if (other.desTablaOrigen != null)
				return false;
		} else if (!desTablaOrigen.equals(other.desTablaOrigen))
			return false;
		if (ndtTipFormaContactos == null) {
			if (other.ndtTipFormaContactos != null)
				return false;
		} else if (!ndtTipFormaContactos.equals(other.ndtTipFormaContactos))
			return false;
		return true;
	}
	
	
	
}