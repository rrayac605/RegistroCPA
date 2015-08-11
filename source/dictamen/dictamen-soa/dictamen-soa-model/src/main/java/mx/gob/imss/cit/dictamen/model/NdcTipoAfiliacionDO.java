package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the NDC_TIPO_AFILIACION database table.
 * 
 */
@Entity
@Table(name="NDC_TIPO_AFILIACION")
@NamedQuery(name="NdcTipoAfiliacionDO.findAll", query="SELECT n FROM NdcTipoAfiliacionDO n")
public class NdcTipoAfiliacionDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_TIPO_AFILIACION")
	private long cveIdTipoAfiliacion;

	@Column(name="DES_TIPO_AFILIACION")
	private String desTipoAfiliacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to NdtPatronDictamenDO
	@OneToMany(mappedBy="ndcTipoAfiliacion")
	private List<NdtPatronDictamenDO> ndtPatronDictamens;

	public NdcTipoAfiliacionDO() {
	}

	public long getCveIdTipoAfiliacion() {
		return this.cveIdTipoAfiliacion;
	}

	public void setCveIdTipoAfiliacion(long cveIdTipoAfiliacion) {
		this.cveIdTipoAfiliacion = cveIdTipoAfiliacion;
	}

	public String getDesTipoAfiliacion() {
		return this.desTipoAfiliacion;
	}

	public void setDesTipoAfiliacion(String desTipoAfiliacion) {
		this.desTipoAfiliacion = desTipoAfiliacion;
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

	public List<NdtPatronDictamenDO> getNdtPatronDictamens() {
		return this.ndtPatronDictamens;
	}

	public void setNdtPatronDictamens(List<NdtPatronDictamenDO> ndtPatronDictamens) {
		this.ndtPatronDictamens = ndtPatronDictamens;
	}

	

}