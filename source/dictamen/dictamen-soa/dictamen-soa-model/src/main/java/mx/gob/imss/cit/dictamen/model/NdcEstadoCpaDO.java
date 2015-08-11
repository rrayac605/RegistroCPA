package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the NDC_ESTADO_CPA database table.
 * 
 */
@Entity
@Table(name="NDC_ESTADO_CPA")
@NamedQuery(name="NdcEstadoCpaDO.findAll", query="SELECT n FROM NdcEstadoCpaDO n")
public class NdcEstadoCpaDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_ESTADO_CPA")
	private long cveIdEstadoCpa;

	@Column(name="DES_ESTADO_CPA")
	private String desEstadoCpa;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to NdtContadorPublicoAutDO
	@OneToMany(mappedBy="ndcEstadoCpa")
	private List<NdtContadorPublicoAutDO> ndtContadorPublicoAuts;

	//bi-directional many-to-one association to NdtRegBajaReactivDO
	@OneToMany(mappedBy="ndcEstadoCpa")
	private List<NdtRegBajaReactivDO> ndtRegBajaReactivs;

	public NdcEstadoCpaDO() {
	}

	public long getCveIdEstadoCpa() {
		return this.cveIdEstadoCpa;
	}

	public void setCveIdEstadoCpa(long cveIdEstadoCpa) {
		this.cveIdEstadoCpa = cveIdEstadoCpa;
	}

	public String getDesEstadoCpa() {
		return this.desEstadoCpa;
	}

	public void setDesEstadoCpa(String desEstadoCpa) {
		this.desEstadoCpa = desEstadoCpa;
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

	public List<NdtContadorPublicoAutDO> getNdtContadorPublicoAuts() {
		return this.ndtContadorPublicoAuts;
	}

	public void setNdtContadorPublicoAuts(List<NdtContadorPublicoAutDO> ndtContadorPublicoAuts) {
		this.ndtContadorPublicoAuts = ndtContadorPublicoAuts;
	}


	public List<NdtRegBajaReactivDO> getNdtRegBajaReactivs() {
		return this.ndtRegBajaReactivs;
	}

	public void setNdtRegBajaReactivs(List<NdtRegBajaReactivDO> ndtRegBajaReactivs) {
		this.ndtRegBajaReactivs = ndtRegBajaReactivs;
	}

}