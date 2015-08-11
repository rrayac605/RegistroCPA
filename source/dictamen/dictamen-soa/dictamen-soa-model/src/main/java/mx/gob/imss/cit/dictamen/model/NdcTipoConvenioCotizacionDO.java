package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the NDC_TIPO_CONVENIO_COTIZACION database table.
 * 
 */
@Entity
@Table(name="NDC_TIPO_CONVENIO_COTIZACION")
@NamedQuery(name="NdcTipoConvenioCotizacionDO.findAll", query="SELECT n FROM NdcTipoConvenioCotizacionDO n")
public class NdcTipoConvenioCotizacionDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_TIPO_CONVENIO_COT")
	private long cveIdTipoConvenioCot;

	@Column(name="DES_TIPO_CONVENIO_COT")
	private String desTipoConvenioCot;

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
	@OneToMany(mappedBy="ndcTipoConvenioCotizacion")
	private List<NdtPatronDictamenDO> ndtPatronDictamens;

	public NdcTipoConvenioCotizacionDO() {
	}

	public long getCveIdTipoConvenioCot() {
		return this.cveIdTipoConvenioCot;
	}

	public void setCveIdTipoConvenioCot(long cveIdTipoConvenioCot) {
		this.cveIdTipoConvenioCot = cveIdTipoConvenioCot;
	}

	public String getDesTipoConvenioCot() {
		return this.desTipoConvenioCot;
	}

	public void setDesTipoConvenioCot(String desTipoConvenioCot) {
		this.desTipoConvenioCot = desTipoConvenioCot;
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