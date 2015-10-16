package mx.gob.imss.distss.dictamen.modelo.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="NDV_CONTADOR_PUBLICO_AUT")
@NamedQuery(name="NdvContadorPublicoAut.findAll", query="SELECT n FROM NdvContadorPublicoAut n")
public class NdvContadorPublicoAut implements Serializable {
	
	private static final long serialVersionUID = 2891068325901503522L;
	
	@Id
	@Column(name="CVE_ID_CPA")
	private Long cveIdCpa;
	
	@Column(name="NUM_REGISTRO_CPA", precision=5)
	private Long numRegistroCpa;
	
	@Column(name="DES_DELEG", length=255)
	private String desDeleg;

	@Column(name="DES_ESTADO_CPA", length=50)
	private String desEstadoCpa;

	@Column(name="DES_SUBDELEGACION", length=255)
	private String desSubdelegacion;

	@Column(name="NOMBRE", length=767)
	private String nombre;

	@Column(name="NOMBRE_COMERCIAL_COLEGIO", length=255)
	private String nombreComercialColegio;

	@Column(name="NOMBRE_COMERCIAL_DESPACHO", length=255)
	private String nombreComercialDespacho;

	@Column(name="RFC", length=50)
	private String rfc;

	public NdvContadorPublicoAut() {
	}

	public Long getCveIdCpa() {
		return cveIdCpa;
	}

	public void setCveIdCpa(Long cveIdCpa) {
		this.cveIdCpa = cveIdCpa;
	}

	public String getDesDeleg() {
		return desDeleg;
	}

	public void setDesDeleg(String desDeleg) {
		this.desDeleg = desDeleg;
	}

	public String getDesEstadoCpa() {
		return desEstadoCpa;
	}

	public void setDesEstadoCpa(String desEstadoCpa) {
		this.desEstadoCpa = desEstadoCpa;
	}

	public String getDesSubdelegacion() {
		return desSubdelegacion;
	}

	public void setDesSubdelegacion(String desSubdelegacion) {
		this.desSubdelegacion = desSubdelegacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreComercialColegio() {
		return nombreComercialColegio;
	}

	public void setNombreComercialColegio(String nombreComercialColegio) {
		this.nombreComercialColegio = nombreComercialColegio;
	}

	public String getNombreComercialDespacho() {
		return nombreComercialDespacho;
	}

	public void setNombreComercialDespacho(String nombreComercialDespacho) {
		this.nombreComercialDespacho = nombreComercialDespacho;
	}

	public Long getNumRegistroCpa() {
		return numRegistroCpa;
	}

	public void setNumRegistroCpa(Long numRegistroCpa) {
		this.numRegistroCpa = numRegistroCpa;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	
	

}
