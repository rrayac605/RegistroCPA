package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIC_TIPO_SOCIEDAD database table.
 * 
 */
@Entity
@Table(name="DIC_TIPO_SOCIEDAD")
@NamedQuery(name="DicTipoSociedadDO.findAll", query="SELECT d FROM DicTipoSociedadDO d")
public class DicTipoSociedadDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_TIPO_SOCIEDAD")
	private long cveIdTipoSociedad;

	@Column(name="DES_TIPO_SOCIEDAD")
	private String desTipoSociedad;

	@Column(name="DES_TIPO_SOCIEDAD_ABREV")
	private String desTipoSociedadAbrev;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to DitPersonaMoralDO
	@OneToMany(mappedBy="dicTipoSociedad")
	private List<DitPersonaMoralDO> ditPersonaMorals;

	public DicTipoSociedadDO() {
	}

	public long getCveIdTipoSociedad() {
		return this.cveIdTipoSociedad;
	}

	public void setCveIdTipoSociedad(long cveIdTipoSociedad) {
		this.cveIdTipoSociedad = cveIdTipoSociedad;
	}

	public String getDesTipoSociedad() {
		return this.desTipoSociedad;
	}

	public void setDesTipoSociedad(String desTipoSociedad) {
		this.desTipoSociedad = desTipoSociedad;
	}

	public String getDesTipoSociedadAbrev() {
		return this.desTipoSociedadAbrev;
	}

	public void setDesTipoSociedadAbrev(String desTipoSociedadAbrev) {
		this.desTipoSociedadAbrev = desTipoSociedadAbrev;
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

	public List<DitPersonaMoralDO> getDitPersonaMorals() {
		return this.ditPersonaMorals;
	}

	public void setDitPersonaMorals(List<DitPersonaMoralDO> ditPersonaMorals) {
		this.ditPersonaMorals = ditPersonaMorals;
	}
}