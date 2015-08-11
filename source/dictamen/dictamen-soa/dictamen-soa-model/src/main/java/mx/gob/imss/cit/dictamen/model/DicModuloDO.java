package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIC_MODULO database table.
 * 
 */
@Entity
@Table(name="DIC_MODULO")
@NamedQuery(name="DicModuloDO.findAll", query="SELECT d FROM DicModuloDO d")
public class DicModuloDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_MODULO")
	private long cveIdModulo;

	@Column(name="DES_MODULO")
	private String desModulo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-many association to DicTipoTramiteDO
	@ManyToMany(mappedBy="dicModulos")
	private List<DicTipoTramiteDO> dicTipoTramites;

	public DicModuloDO() {
	}

	public long getCveIdModulo() {
		return this.cveIdModulo;
	}

	public void setCveIdModulo(long cveIdModulo) {
		this.cveIdModulo = cveIdModulo;
	}

	public String getDesModulo() {
		return this.desModulo;
	}

	public void setDesModulo(String desModulo) {
		this.desModulo = desModulo;
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

	public List<DicTipoTramiteDO> getDicTipoTramites() {
		return this.dicTipoTramites;
	}

	public void setDicTipoTramites(List<DicTipoTramiteDO> dicTipoTramites) {
		this.dicTipoTramites = dicTipoTramites;
	}

}