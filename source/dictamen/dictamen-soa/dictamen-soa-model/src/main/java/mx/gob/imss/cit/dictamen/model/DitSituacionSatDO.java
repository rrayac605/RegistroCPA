package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the DIT_SITUACION_SAT database table.
 * 
 */
@Entity
@Table(name="DIT_SITUACION_SAT")
@NamedQuery(name="DitSituacionSatDO.findAll", query="SELECT d FROM DitSituacionSatDO d")
public class DitSituacionSatDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_SITUACION_SAT")
	private long cveSituacionSat;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_SITUACION")
	private Date fecSituacion;

	@Column(name="REF_DESCRIPCION")
	private String refDescripcion;

	//bi-directional many-to-one association to DitPersonaFisicaDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA_FISICA")
	private DitPersonaFisicaDO ditPersonaFisica;

	//bi-directional many-to-one association to DitPersonaMoralDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA_MORAL")
	private DitPersonaMoralDO ditPersonaMoral;

	public DitSituacionSatDO() {
	}

	public long getCveSituacionSat() {
		return this.cveSituacionSat;
	}

	public void setCveSituacionSat(long cveSituacionSat) {
		this.cveSituacionSat = cveSituacionSat;
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

	public Date getFecSituacion() {
		return this.fecSituacion;
	}

	public void setFecSituacion(Date fecSituacion) {
		this.fecSituacion = fecSituacion;
	}

	public String getRefDescripcion() {
		return this.refDescripcion;
	}

	public void setRefDescripcion(String refDescripcion) {
		this.refDescripcion = refDescripcion;
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