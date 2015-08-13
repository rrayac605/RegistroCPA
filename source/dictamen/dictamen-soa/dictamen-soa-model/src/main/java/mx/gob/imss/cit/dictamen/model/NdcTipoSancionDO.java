package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the NDC_TIPO_SANCION database table.
 * 
 */
@Entity
@Table(name="NDC_TIPO_SANCION")
@NamedQuery(name="NdcTipoSancionDO.findAll", query="SELECT n FROM NdcTipoSancionDO n")
public class NdcTipoSancionDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "CVE_ID_TIPOSANCION", nullable = false)
    @SequenceGenerator(name = "NdcTipoSancion_Id_Seq_Gen", sequenceName = "SEQ_NDCTIPOSANCION")
    @GeneratedValue(generator = "NdcTipoSancion_Id_Seq_Gen")
	private long cveIdTiposancion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	private String sancion;

	//bi-directional many-to-many association to NdtContadorPublicoAutDO
	@ManyToMany(mappedBy="ndcTipoSancions")
	private List<NdtContadorPublicoAutDO> ndtContadorPublicoAuts;

	public NdcTipoSancionDO() {
	}

	public long getCveIdTiposancion() {
		return this.cveIdTiposancion;
	}

	public void setCveIdTiposancion(long cveIdTiposancion) {
		this.cveIdTiposancion = cveIdTiposancion;
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

	public String getSancion() {
		return this.sancion;
	}

	public void setSancion(String sancion) {
		this.sancion = sancion;
	}

	public List<NdtContadorPublicoAutDO> getNdtContadorPublicoAuts() {
		return this.ndtContadorPublicoAuts;
	}

	public void setNdtContadorPublicoAuts(List<NdtContadorPublicoAutDO> ndtContadorPublicoAuts) {
		this.ndtContadorPublicoAuts = ndtContadorPublicoAuts;
	}

}