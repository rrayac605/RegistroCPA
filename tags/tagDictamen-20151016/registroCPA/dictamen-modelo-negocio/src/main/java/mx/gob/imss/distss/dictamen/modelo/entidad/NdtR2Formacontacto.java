package mx.gob.imss.distss.dictamen.modelo.entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="NDT_R2_FORMACONTACTO")
@NamedQuery(name="NdtR2Formacontacto.findAll", query="SELECT n FROM NdtR2Formacontacto n")
public class NdtR2Formacontacto implements Serializable {
	
	private static final long serialVersionUID = -4416272940192645605L;
	
	@Id
	@Column(name="CVE_ID_R2_FCONTACTO", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtR2Formacontacto_Id_Seq_Gen", sequenceName = "SEQ_NDTR2FORMACONTACTO")
    @GeneratedValue(generator = "NdtR2Formacontacto_Id_Seq_Gen")
	private Long cveIdR2Fcontacto;

	@Column(name="CVE_ID_PERSONAM_CONTACTO")
	private Long cveIdPersonamContacto;

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

	//bi-directional many-to-one association to NdtR2Despacho
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_R2_DESPACHO")
	private NdtR2Despacho ndtR2Despacho;

	public NdtR2Formacontacto() {
	}

	public Long getCveIdR2Fcontacto() {
		return cveIdR2Fcontacto;
	}

	public void setCveIdR2Fcontacto(Long cveIdR2Fcontacto) {
		this.cveIdR2Fcontacto = cveIdR2Fcontacto;
	}

	public Long getCveIdPersonamContacto() {
		return cveIdPersonamContacto;
	}

	public void setCveIdPersonamContacto(Long cveIdPersonamContacto) {
		this.cveIdPersonamContacto = cveIdPersonamContacto;
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

	public NdtR2Despacho getNdtR2Despacho() {
		return ndtR2Despacho;
	}

	public void setNdtR2Despacho(NdtR2Despacho ndtR2Despacho) {
		this.ndtR2Despacho = ndtR2Despacho;
	}

}