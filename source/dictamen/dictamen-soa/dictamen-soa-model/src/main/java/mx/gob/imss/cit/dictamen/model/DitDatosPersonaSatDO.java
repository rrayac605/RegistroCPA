package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the DIT_DATOS_PERSONA_SAT database table.
 * 
 */
@Entity
@Table(name="DIT_DATOS_PERSONA_SAT")
@NamedQuery(name="DitDatosPersonaSatDO.findAll", query="SELECT d FROM DitDatosPersonaSatDO d")
public class DitDatosPersonaSatDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_DATOS_SAT")
	private long cveIdDatosSat;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_CONSTITUCION")
	private Date fecConstitucion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_INICIO_OPERACIONES")
	private Date fecInicioOperaciones;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to DitPersonaFisicaDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA_FISICA")
	private DitPersonaFisicaDO ditPersonaFisica;

	//bi-directional many-to-one association to DitPersonaMoralDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA_MORAL")
	private DitPersonaMoralDO ditPersonaMoral;

	public DitDatosPersonaSatDO() {
	}

	public long getCveIdDatosSat() {
		return this.cveIdDatosSat;
	}

	public void setCveIdDatosSat(long cveIdDatosSat) {
		this.cveIdDatosSat = cveIdDatosSat;
	}

	public Date getFecConstitucion() {
		return this.fecConstitucion;
	}

	public void setFecConstitucion(Date fecConstitucion) {
		this.fecConstitucion = fecConstitucion;
	}

	public Date getFecInicioOperaciones() {
		return this.fecInicioOperaciones;
	}

	public void setFecInicioOperaciones(Date fecInicioOperaciones) {
		this.fecInicioOperaciones = fecInicioOperaciones;
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

	public DitPersonaFisicaDO getDitPersonaFisica() {
		return this.ditPersonaFisica;
	}

	public void setDitPersonaFisica(DitPersonaFisicaDO ditPersonaFisica) {
		this.ditPersonaFisica = ditPersonaFisica;
	}

	public DitPersonaMoralDO getDitPersonaMoral() {
		return this.ditPersonaMoral;
	}

	public void setDitPersonaMoral(DitPersonaMoralDO ditPersonaMoral) {
		this.ditPersonaMoral = ditPersonaMoral;
	}

}