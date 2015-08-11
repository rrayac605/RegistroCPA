package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIC_PAIS database table.
 * 
 */
@Entity
@Table(name="DIC_PAIS")
@NamedQuery(name="DicPaisDO.findAll", query="SELECT d FROM DicPaisDO d")
public class DicPaisDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_PAIS")
	private long cveIdPais;

	@Column(name="DES_NACIONALIDAD")
	private String desNacionalidad;

	@Column(name="DES_PAIS")
	private String desPais;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	private String siglas;

	//bi-directional many-to-one association to DgCatEstadoDO
	@OneToMany(mappedBy="dicPai")
	private List<DgCatEstadoDO> dgCatEstados;

	//bi-directional many-to-one association to DitPersonaDO
	@OneToMany(mappedBy="dicPai")
	private List<DitPersonaDO> ditPersonas;

	public DicPaisDO() {
	}

	public long getCveIdPais() {
		return this.cveIdPais;
	}

	public void setCveIdPais(long cveIdPais) {
		this.cveIdPais = cveIdPais;
	}

	public String getDesNacionalidad() {
		return this.desNacionalidad;
	}

	public void setDesNacionalidad(String desNacionalidad) {
		this.desNacionalidad = desNacionalidad;
	}

	public String getDesPais() {
		return this.desPais;
	}

	public void setDesPais(String desPais) {
		this.desPais = desPais;
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

	public String getSiglas() {
		return this.siglas;
	}

	public void setSiglas(String siglas) {
		this.siglas = siglas;
	}

	public List<DgCatEstadoDO> getDgCatEstados() {
		return this.dgCatEstados;
	}

	public void setDgCatEstados(List<DgCatEstadoDO> dgCatEstados) {
		this.dgCatEstados = dgCatEstados;
	}

	public List<DitPersonaDO> getDitPersonas() {
		return this.ditPersonas;
	}

	public void setDitPersonas(List<DitPersonaDO> ditPersonas) {
		this.ditPersonas = ditPersonas;
	}

}