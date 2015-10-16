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
@Table(name="NDT_DESPACHOS")
@NamedQuery(name="NdtDespachos.findAll", query="SELECT n FROM NdtDespachos n")
public class NdtDespachos implements Serializable {
	
	private static final long serialVersionUID = 5548196842770088944L;
	
	@Id
	@Column(name="CVE_ID_DESPACHO", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtDespachos_Id_Seq_Gen", sequenceName = "SEQ_NDTDESPACHOS")
    @GeneratedValue(generator = "NdtDespachos_Id_Seq_Gen")
	private Long cveIdDespacho;

	@Column(name="CVE_ID_PERSONA_MORAL")
	private Long cveIdPersonaMoral;

	@Column(name="CVE_ID_USUARIO", length=18)
	private String cveIdUsuario;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_ACTUALIZADO")
	private Date fecActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to NdtR2Despacho
	@OneToMany(mappedBy="ndtDespacho")
	private List<NdtR2Despacho> listNdtR2Despachos;

	public NdtDespachos() {
	}

	public Long getCveIdDespacho() {
		return cveIdDespacho;
	}

	public void setCveIdDespacho(Long cveIdDespacho) {
		this.cveIdDespacho = cveIdDespacho;
	}

	public Long getCveIdPersonaMoral() {
		return cveIdPersonaMoral;
	}

	public void setCveIdPersonaMoral(Long cveIdPersonaMoral) {
		this.cveIdPersonaMoral = cveIdPersonaMoral;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public Date getFecActualizado() {
		return fecActualizado;
	}

	public void setFecActualizado(Date fecActualizado) {
		this.fecActualizado = fecActualizado;
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

	public List<NdtR2Despacho> getListNdtR2Despachos() {
		return listNdtR2Despachos;
	}

	public void setListNdtR2Despachos(List<NdtR2Despacho> listNdtR2Despachos) {
		this.listNdtR2Despachos = listNdtR2Despachos;
	}

}