package mx.gob.imss.distss.dictamen.modelo.entidad;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="NDC_ASEVERACIONES")
@NamedQuery(name="NdcAseveraciones.findAll", query="SELECT n FROM NdcAseveraciones n")
public class NdcAseveraciones implements Serializable {
	
	private static final long serialVersionUID = -4261620201046394961L;
	
	@Id
	@Column(name="CVE_ID_ASEVERACION", unique=true, nullable=false)
	@SequenceGenerator(name = "NdcAseveraciones_Id_Seq_Gen", sequenceName = "SEQ_NDCASEVERACIONES")
    @GeneratedValue(generator = "NdcAseveraciones_Id_Seq_Gen")
	private Long cveIdAseveracion;

	@Column(name="DES_TIPO_ASEVERACION", length=80)
	private String desTipoAseveracion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="IND_CONSTRUCCION", precision=1)
	private Long indConstruccion;

	@Column(name="IND_OBLIGATORIO", precision=1)
	private Long indObligatorio;

	//bi-directional many-to-one association to NdcAtestiguamiento
	@OneToMany(mappedBy="ndcAseveraciones")
	private List<NdcAtestiguamiento> listNdcAtestiguamientos;

	public NdcAseveraciones() {
	}

	public Long getCveIdAseveracion() {
		return cveIdAseveracion;
	}

	public void setCveIdAseveracion(Long cveIdAseveracion) {
		this.cveIdAseveracion = cveIdAseveracion;
	}

	public String getDesTipoAseveracion() {
		return desTipoAseveracion;
	}

	public void setDesTipoAseveracion(String desTipoAseveracion) {
		this.desTipoAseveracion = desTipoAseveracion;
	}

	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado;
	}

	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	public Date getFecRegistroAlta() {
		return fecRegistroAlta;
	}

	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	public Date getFecRegistroBaja() {
		return fecRegistroBaja;
	}

	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	public Long getIndConstruccion() {
		return indConstruccion;
	}

	public void setIndConstruccion(Long indConstruccion) {
		this.indConstruccion = indConstruccion;
	}

	public Long getIndObligatorio() {
		return indObligatorio;
	}

	public void setIndObligatorio(Long indObligatorio) {
		this.indObligatorio = indObligatorio;
	}

	public List<NdcAtestiguamiento> getListNdcAtestiguamientos() {
		return listNdcAtestiguamientos;
	}

	public void setListNdcAtestiguamientos(List<NdcAtestiguamiento> listNdcAtestiguamientos) {
		this.listNdcAtestiguamientos = listNdcAtestiguamientos;
	}

}
