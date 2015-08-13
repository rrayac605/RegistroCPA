package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the NDT_COLEGIO_CONTACTO database table.
 * 
 */
@Entity
@Table(name="NDT_COLEGIO_CONTACTO")
@NamedQuery(name="NdtColegioContactoDO.findAll", query="SELECT n FROM NdtColegioContactoDO n")
public class NdtColegioContactoDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "CVE_ID_COLEGIO_CONTACTO", nullable = false)
    @SequenceGenerator(name = "NdtColegioContacto_Id_Seq_Gen", sequenceName = "SEQ_NDTCOLEGIOCONTACTO")
    @GeneratedValue(generator = "NdtColegioContacto_Id_Seq_Gen")
	private long cveIdColegioContacto;

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

	//bi-directional many-to-one association to NdcColegioDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_COLEGIO")
	private NdcColegioDO ndcColegio;

	public NdtColegioContactoDO() {
	}

	public long getCveIdColegioContacto() {
		return this.cveIdColegioContacto;
	}

	public void setCveIdColegioContacto(long cveIdColegioContacto) {
		this.cveIdColegioContacto = cveIdColegioContacto;
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

	public NdcColegioDO getNdcColegio() {
		return this.ndcColegio;
	}

	public void setNdcColegio(NdcColegioDO ndcColegio) {
		this.ndcColegio = ndcColegio;
	}

}