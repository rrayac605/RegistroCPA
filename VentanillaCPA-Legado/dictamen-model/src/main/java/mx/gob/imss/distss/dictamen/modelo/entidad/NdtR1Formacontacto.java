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
@Table(name="NDT_R1_FORMACONTACTO")
@NamedQuery(name="NdtR1Formacontacto.findAll", query="SELECT n FROM NdtR1Formacontacto n")
public class NdtR1Formacontacto implements Serializable {
	
	private static final long serialVersionUID = 6640360477205526981L;
	
	@Id
	@Column(name="CVE_ID_R1_FORMACONTACTO", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtR1Formacontacto_Id_Seq_Gen", sequenceName = "SEQ_NDTR1FORMACONTACTO")
    @GeneratedValue(generator = "NdtR1Formacontacto_Id_Seq_Gen")
	private Long cveIdR1Formacontacto;

	@Column(name="CVE_ID_PERSONAF_CONTACTO")
	private Long cveIdPersonafContacto;

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

	//bi-directional many-to-one association to NdtR1DatosPersonales
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_R1_DATOS_PERSONALES")
	private NdtR1DatosPersonales ndtR1DatosPersonales;

	public NdtR1Formacontacto() {
	}

	public Long getCveIdR1Formacontacto() {
		return cveIdR1Formacontacto;
	}

	public void setCveIdR1Formacontacto(Long cveIdR1Formacontacto) {
		this.cveIdR1Formacontacto = cveIdR1Formacontacto;
	}

	public Long getCveIdPersonafContacto() {
		return cveIdPersonafContacto;
	}

	public void setCveIdPersonafContacto(Long cveIdPersonafContacto) {
		this.cveIdPersonafContacto = cveIdPersonafContacto;
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

	public NdtR1DatosPersonales getNdtR1DatosPersonales() {
		return ndtR1DatosPersonales;
	}

	public void setNdtR1DatosPersonales(NdtR1DatosPersonales ndtR1DatosPersonales) {
		this.ndtR1DatosPersonales = ndtR1DatosPersonales;
	}

}