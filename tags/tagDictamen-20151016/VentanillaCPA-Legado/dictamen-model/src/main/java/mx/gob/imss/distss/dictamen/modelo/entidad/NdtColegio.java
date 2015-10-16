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
@Table(name="NDT_COLEGIO")
@NamedQuery(name="NdtColegio.findAll", query="SELECT n FROM NdtColegio n")
public class NdtColegio implements Serializable {
	
	private static final long serialVersionUID = 5985443894929877758L;
	
	@Id
	@Column(name="CVE_ID_COLEGIO", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtColegio_Id_Seq_Gen", sequenceName = "SEQ_NDTCOLEGIO")
    @GeneratedValue(generator = "NdtColegio_Id_Seq_Gen")
	private Long cveIdColegio;

	@Column(name="CVE_ID_PERSONA_MORAL")
	private Long cveIdPersonaMoral;

	@Column(name="CVE_ID_USUARIO", length=18)
	private String cveIdUsuario;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to NdtCpaAcreditacion
	@OneToMany(mappedBy="ndtColegio")
	private List<NdtCpaAcreditacion> listNdtCpaAcreditacions;

	//bi-directional many-to-one association to NdtR3Colegio
	@OneToMany(mappedBy="ndtColegio")
	private List<NdtR3Colegio> listNdtR3Colegios;

	public NdtColegio() {
	}

	public Long getCveIdColegio() {
		return cveIdColegio;
	}

	public void setCveIdColegio(Long cveIdColegio) {
		this.cveIdColegio = cveIdColegio;
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

	public List<NdtCpaAcreditacion> getListNdtCpaAcreditacions() {
		return listNdtCpaAcreditacions;
	}

	public void setListNdtCpaAcreditacions(
			List<NdtCpaAcreditacion> listNdtCpaAcreditacions) {
		this.listNdtCpaAcreditacions = listNdtCpaAcreditacions;
	}

	public List<NdtR3Colegio> getListNdtR3Colegios() {
		return listNdtR3Colegios;
	}

	public void setListNdtR3Colegios(List<NdtR3Colegio> listNdtR3Colegios) {
		this.listNdtR3Colegios = listNdtR3Colegios;
	}

}