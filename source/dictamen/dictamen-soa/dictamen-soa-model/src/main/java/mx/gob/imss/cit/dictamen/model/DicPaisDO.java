package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


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

	



}