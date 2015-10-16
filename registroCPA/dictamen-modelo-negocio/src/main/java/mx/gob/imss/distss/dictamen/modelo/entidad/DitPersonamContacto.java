package mx.gob.imss.distss.dictamen.modelo.entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="DIT_PERSONAM_CONTACTO")
@NamedQuery(name="DitPersonamContacto.findAll", query="SELECT d FROM DitPersonamContacto d")
public class DitPersonamContacto implements Serializable {
	
	private static final long serialVersionUID = -450663553661045539L;
	
	@Id
	@Column(name="CVE_ID_PERSONAM_CONTACTO", unique=true, nullable=false)
	private Long cveIdPersonamContacto;
	
	@Column(name="CVE_ID_PERSONA_MORAL")
	private Long cveIdPersonaMoral;
	
	@Column(name="CVE_ID_FORMA_CONTACTO")
	private Long cveIdFormaContacto;
	
	@Temporal( TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;
	
	@Temporal( TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;
	
	@Temporal( TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;
	
	public DitPersonamContacto() {
	}

	public Long getCveIdPersonamContacto() {
		return cveIdPersonamContacto;
	}

	public void setCveIdPersonamContacto(Long cveIdPersonamContacto) {
		this.cveIdPersonamContacto = cveIdPersonamContacto;
	}

	public Long getCveIdPersonaMoral() {
		return cveIdPersonaMoral;
	}

	public void setCveIdPersonaMoral(Long cveIdPersonaMoral) {
		this.cveIdPersonaMoral = cveIdPersonaMoral;
	}

	public Long getCveIdFormaContacto() {
		return cveIdFormaContacto;
	}

	public void setCveIdFormaContacto(Long cveIdFormaContacto) {
		this.cveIdFormaContacto = cveIdFormaContacto;
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

	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado;
	}

	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

}
