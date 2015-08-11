package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DG_VIALIDAD database table.
 * 
 */
@Entity
@Table(name="DG_VIALIDAD")
@NamedQuery(name="DgVialidadDO.findAll", query="SELECT d FROM DgVialidadDO d")
public class DgVialidadDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_VIA")
	private long cveVia;

	private String agregada;

	@Column(name="NOM_VIA")
	private String nomVia;

	//bi-directional many-to-one association to DgCatAmbitoDO
	@ManyToOne
	@JoinColumn(name="AMBITO")
	private DgCatAmbitoDO dgCatAmbito;

	//bi-directional many-to-one association to DgCatLocalidadDO
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CVE_ENT", referencedColumnName="CVE_ENT"),
		@JoinColumn(name="CVE_LOC", referencedColumnName="CVE_LOC"),
		@JoinColumn(name="CVE_MUN", referencedColumnName="CVE_MUN"),
		@JoinColumn(name="CVE_PERIODO", referencedColumnName="CVE_PERIODO")
		})
	private DgCatLocalidadDO dgCatLocalidad;

	//bi-directional many-to-one association to DgCatVialidadDO
	@ManyToOne
	@JoinColumn(name="CVE_TIPO_VIAL")
	private DgCatVialidadDO dgCatVialidad;

	public DgVialidadDO() {
	}

	public long getCveVia() {
		return this.cveVia;
	}

	public void setCveVia(long cveVia) {
		this.cveVia = cveVia;
	}

	public String getAgregada() {
		return this.agregada;
	}

	public void setAgregada(String agregada) {
		this.agregada = agregada;
	}

	public String getNomVia() {
		return this.nomVia;
	}

	public void setNomVia(String nomVia) {
		this.nomVia = nomVia;
	}

	public DgCatAmbitoDO getDgCatAmbito() {
		return this.dgCatAmbito;
	}

	public void setDgCatAmbito(DgCatAmbitoDO dgCatAmbito) {
		this.dgCatAmbito = dgCatAmbito;
	}

	public DgCatLocalidadDO getDgCatLocalidad() {
		return this.dgCatLocalidad;
	}

	public void setDgCatLocalidad(DgCatLocalidadDO dgCatLocalidad) {
		this.dgCatLocalidad = dgCatLocalidad;
	}

	public DgCatVialidadDO getDgCatVialidad() {
		return this.dgCatVialidad;
	}

	public void setDgCatVialidad(DgCatVialidadDO dgCatVialidad) {
		this.dgCatVialidad = dgCatVialidad;
	}

}