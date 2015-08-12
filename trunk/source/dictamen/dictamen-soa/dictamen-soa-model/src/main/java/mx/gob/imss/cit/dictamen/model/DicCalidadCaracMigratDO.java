package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIC_CALIDAD_CARAC_MIGRAT database table.
 * 
 */
@Entity
@Table(name="DIC_CALIDAD_CARAC_MIGRAT")
@NamedQuery(name="DicCalidadCaracMigratDO.findAll", query="SELECT d FROM DicCalidadCaracMigratDO d")
public class DicCalidadCaracMigratDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_CALIDAD_CARAC_MIGRAT")
	private long cveIdCalidadCaracMigrat;

	@Column(name="DES_CALIDAD_MIGRATORIA")
	private String desCalidadMigratoria;

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
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dicCalidadCaracMigrat")
	private List<DitFormaMigratoriaDO> ditFormaMigratorias;

	public DicCalidadCaracMigratDO() {
	}

	public long getCveIdCalidadCaracMigrat() {
		return this.cveIdCalidadCaracMigrat;
	}

	public void setCveIdCalidadCaracMigrat(long cveIdCalidadCaracMigrat) {
		this.cveIdCalidadCaracMigrat = cveIdCalidadCaracMigrat;
	}

	public String getDesCalidadMigratoria() {
		return this.desCalidadMigratoria;
	}

	public void setDesCalidadMigratoria(String desCalidadMigratoria) {
		this.desCalidadMigratoria = desCalidadMigratoria;
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