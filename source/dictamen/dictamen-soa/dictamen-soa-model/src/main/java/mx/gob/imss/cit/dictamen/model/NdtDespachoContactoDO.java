package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the NDT_DESPACHO_CONTACTO database table.
 * 
 */
@Entity
@Table(name="NDT_DESPACHO_CONTACTO")
@NamedQuery(name="NdtDespachoContactoDO.findAll", query="SELECT n FROM NdtDespachoContactoDO n")
public class NdtDespachoContactoDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_DESPACHO_CONTACTO")
	private long cveIdDespachoContacto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to DitFormaContactoDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_FORMA_CONTACTO")
	private DitFormaContactoDO ditFormaContacto;

	//bi-directional many-to-one association to NdcDespachoDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_DESPACHO")
	private NdcDespachoDO ndcDespacho;

	public NdtDespachoContactoDO() {
	}

	public long getCveIdDespachoContacto() {
		return this.cveIdDespachoContacto;
	}

	public void setCveIdDespachoContacto(long cveIdDespachoContacto) {
		this.cveIdDespachoContacto = cveIdDespachoContacto;
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

	public DitFormaContactoDO getDitFormaContacto() {
		return this.ditFormaContacto;
	}

	public void setDitFormaContacto(DitFormaContactoDO ditFormaContacto) {
		this.ditFormaContacto = ditFormaContacto;
	}

	public NdcDespachoDO getNdcDespacho() {
		return this.ndcDespacho;
	}

	public void setNdcDespacho(NdcDespachoDO ndcDespacho) {
		this.ndcDespacho = ndcDespacho;
	}

}