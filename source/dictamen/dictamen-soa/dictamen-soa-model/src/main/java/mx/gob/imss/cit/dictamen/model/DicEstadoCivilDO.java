package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIC_ESTADO_CIVIL database table.
 * 
 */
@Entity
@Table(name="DIC_ESTADO_CIVIL")
@NamedQuery(name="DicEstadoCivilDO.findAll", query="SELECT d FROM DicEstadoCivilDO d")
public class DicEstadoCivilDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_ESTADO_CIVIL")
	private long cveIdEstadoCivil;

	@Column(name="DES_ESTADO_CIVIL")
	private String desEstadoCivil;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to DitPersonaDO
	@OneToMany(mappedBy="dicEstadoCivil")
	private List<DitPersonaDO> ditPersonas;

	public DicEstadoCivilDO() {
	}

	public long getCveIdEstadoCivil() {
		return this.cveIdEstadoCivil;
	}

	public void setCveIdEstadoCivil(long cveIdEstadoCivil) {
		this.cveIdEstadoCivil = cveIdEstadoCivil;
	}

	public String getDesEstadoCivil() {
		return this.desEstadoCivil;
	}

	public void setDesEstadoCivil(String desEstadoCivil) {
		this.desEstadoCivil = desEstadoCivil;
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

	public List<DitPersonaDO> getDitPersonas() {
		return this.ditPersonas;
	}

	public void setDitPersonas(List<DitPersonaDO> ditPersonas) {
		this.ditPersonas = ditPersonas;
	}

}