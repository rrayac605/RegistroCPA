package mx.gob.imss.distss.dictamen.modelo.entidad;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="NDC_ATESTIGUAMIENTO")
@NamedQuery(name="NdcAtestiguamiento.findAll", query="SELECT n FROM NdcAtestiguamiento n")
public class NdcAtestiguamiento implements Serializable {
	
	private static final long serialVersionUID = 1882476987141314802L;
	
	@Id
	@Column(name="CVE_ID_ATESTIGUAMIENTO", unique=true, nullable=false)
	@SequenceGenerator(name = "NdcAtestiguamiento_Id_Seq_Gen", sequenceName = "SEQ_NDCATESTIGUAMIENTO")
    @GeneratedValue(generator = "NdcAtestiguamiento_Id_Seq_Gen")
	private Long cveIdAtestiguamiento;

	@Column(name="DES_ATESTIGUAMIENTO", length=100)
	private String desAtestiguamiento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to NdcRubro
	@OneToMany(mappedBy="ndcAtestiguamiento")
	private List<NdcRubro> listNdcRubros;

	//bi-directional many-to-one association to NdcAseveraciones
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_ASEVERACION")
	private NdcAseveraciones ndcAseveraciones;

	public NdcAtestiguamiento() {
	}

	public Long getCveIdAtestiguamiento() {
		return cveIdAtestiguamiento;
	}

	public void setCveIdAtestiguamiento(Long cveIdAtestiguamiento) {
		this.cveIdAtestiguamiento = cveIdAtestiguamiento;
	}

	public String getDesAtestiguamiento() {
		return desAtestiguamiento;
	}

	public void setDesAtestiguamiento(String desAtestiguamiento) {
		this.desAtestiguamiento = desAtestiguamiento;
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

	public List<NdcRubro> getListNdcRubros() {
		return listNdcRubros;
	}

	public void setListNdcRubros(List<NdcRubro> listNdcRubros) {
		this.listNdcRubros = listNdcRubros;
	}

	public NdcAseveraciones getNdcAseveraciones() {
		return ndcAseveraciones;
	}

	public void setNdcAseveraciones(NdcAseveraciones ndcAseveraciones) {
		this.ndcAseveraciones = ndcAseveraciones;
	}

}
