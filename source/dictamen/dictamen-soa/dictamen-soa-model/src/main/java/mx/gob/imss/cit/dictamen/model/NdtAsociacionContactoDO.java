package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the NDT_ASOCIACION_CONTACTO database table.
 * 
 */
@Entity
@Table(name="NDT_ASOCIACION_CONTACTO")
@NamedQuery(name="NdtAsociacionContactoDO.findAll", query="SELECT n FROM NdtAsociacionContactoDO n")
public class NdtAsociacionContactoDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "CVE_ID_ASOCIACION_CONTACTO", nullable = false)
    @SequenceGenerator(name = "NdtAsociacionContacto_Id_Seq_Gen", sequenceName = "SEQ_NDTASOCIACIONCONTACTO")
    @GeneratedValue(generator = "NdtAsociacionContacto_Id_Seq_Gen")
	private long cveIdAsociacionContacto;

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

	//bi-directional many-to-one association to NdcAsociacionDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_ASOCIACION")
	private NdcAsociacionDO ndcAsociacion;

	public NdtAsociacionContactoDO() {
	}

	public long getCveIdAsociacionContacto() {
		return this.cveIdAsociacionContacto;
	}

	public void setCveIdAsociacionContacto(long cveIdAsociacionContacto) {
		this.cveIdAsociacionContacto = cveIdAsociacionContacto;
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

	public NdcAsociacionDO getNdcAsociacion() {
		return this.ndcAsociacion;
	}

	public void setNdcAsociacion(NdcAsociacionDO ndcAsociacion) {
		this.ndcAsociacion = ndcAsociacion;
	}

}