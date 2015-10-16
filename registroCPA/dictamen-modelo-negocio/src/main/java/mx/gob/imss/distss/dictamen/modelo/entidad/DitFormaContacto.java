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
@Table(name="DIT_FORMA_CONTACTO")
@NamedQuery(name="DitFormaContacto.findAll", query="SELECT d FROM DitFormaContacto d")
public class DitFormaContacto implements Serializable {
	
	private static final long serialVersionUID = -4611884881236027307L;
	
	@Id
	@Column(name="CVE_ID_FORMA_CONTACTO", unique=true, nullable=false)
	private Long cveIdFormaContacto;
	
	@Column(name="CVE_ID_TIPO_CONTACTO")
	private Long cveIdTipoContacto;
	
	@Column(name="DES_FORMA_CONTACTO")
	private String desFormaContacto;
	
	@Temporal( TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;
	
	@Temporal( TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;
	
	@Temporal( TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;
	
	public DitFormaContacto() {
	}

	public Long getCveIdFormaContacto() {
		return cveIdFormaContacto;
	}

	public void setCveIdFormaContacto(Long cveIdFormaContacto) {
		this.cveIdFormaContacto = cveIdFormaContacto;
	}

	public Long getCveIdTipoContacto() {
		return cveIdTipoContacto;
	}

	public void setCveIdTipoContacto(Long cveIdTipoContacto) {
		this.cveIdTipoContacto = cveIdTipoContacto;
	}

	public String getDesFormaContacto() {
		return desFormaContacto;
	}

	public void setDesFormaContacto(String desFormaContacto) {
		this.desFormaContacto = desFormaContacto;
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
