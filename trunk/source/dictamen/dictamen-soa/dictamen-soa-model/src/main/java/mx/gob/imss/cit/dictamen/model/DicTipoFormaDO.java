package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIC_TIPO_FORMA database table.
 * 
 */
@Entity
@Table(name="DIC_TIPO_FORMA")
@NamedQuery(name="DicTipoFormaDO.findAll", query="SELECT d FROM DicTipoFormaDO d")
public class DicTipoFormaDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_TIPO_FORMA")
	private long cveIdTipoForma;

	@Column(name="DES_TIPO_FORMA")
	private String desTipoForma;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to DitFormaMigratoriaDO
	@OneToMany(mappedBy="dicTipoForma")
	private List<DitFormaMigratoriaDO> ditFormaMigratorias;

	public DicTipoFormaDO() {
	}

	public long getCveIdTipoForma() {
		return this.cveIdTipoForma;
	}

	public void setCveIdTipoForma(long cveIdTipoForma) {
		this.cveIdTipoForma = cveIdTipoForma;
	}

	public String getDesTipoForma() {
		return this.desTipoForma;
	}

	public void setDesTipoForma(String desTipoForma) {
		this.desTipoForma = desTipoForma;
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

	public List<DitFormaMigratoriaDO> getDitFormaMigratorias() {
		return this.ditFormaMigratorias;
	}

	public void setDitFormaMigratorias(List<DitFormaMigratoriaDO> ditFormaMigratorias) {
		this.ditFormaMigratorias = ditFormaMigratorias;
	}
}