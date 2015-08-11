package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the DIT_PERSONA_DOM_EXTRANJERO database table.
 * 
 */
@Entity
@Table(name="DIT_PERSONA_DOM_EXTRANJERO")
@NamedQuery(name="DitPersonaDomExtranjeroDO.findAll", query="SELECT d FROM DitPersonaDomExtranjeroDO d")
public class DitPersonaDomExtranjeroDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_DOM_PERSONA_EXTRANJERO")
	private long cveIdDomPersonaExtranjero;

	@Column(name="DES_CALLE")
	private String desCalle;

	@Column(name="DES_CIUDAD")
	private String desCiudad;

	@Column(name="DES_ENTIDAD")
	private String desEntidad;

	@Column(name="DES_LOCALIDAD")
	private String desLocalidad;

	@Column(name="DES_PAIS")
	private String desPais;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="NUM_EXT")
	private String numExt;

	@Column(name="NUM_INT")
	private String numInt;

	@Column(name="REF_CODIGO")
	private String refCodigo;

	//bi-directional many-to-one association to DitPersonaDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA")
	private DitPersonaDO ditPersona;

	public DitPersonaDomExtranjeroDO() {
	}

	public long getCveIdDomPersonaExtranjero() {
		return this.cveIdDomPersonaExtranjero;
	}

	public void setCveIdDomPersonaExtranjero(long cveIdDomPersonaExtranjero) {
		this.cveIdDomPersonaExtranjero = cveIdDomPersonaExtranjero;
	}

	public String getDesCalle() {
		return this.desCalle;
	}

	public void setDesCalle(String desCalle) {
		this.desCalle = desCalle;
	}

	public String getDesCiudad() {
		return this.desCiudad;
	}

	public void setDesCiudad(String desCiudad) {
		this.desCiudad = desCiudad;
	}

	public String getDesEntidad() {
		return this.desEntidad;
	}

	public void setDesEntidad(String desEntidad) {
		this.desEntidad = desEntidad;
	}

	public String getDesLocalidad() {
		return this.desLocalidad;
	}

	public void setDesLocalidad(String desLocalidad) {
		this.desLocalidad = desLocalidad;
	}

	public String getDesPais() {
		return this.desPais;
	}

	public void setDesPais(String desPais) {
		this.desPais = desPais;
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

	public String getNumExt() {
		return this.numExt;
	}

	public void setNumExt(String numExt) {
		this.numExt = numExt;
	}

	public String getNumInt() {
		return this.numInt;
	}

	public void setNumInt(String numInt) {
		this.numInt = numInt;
	}

	public String getRefCodigo() {
		return this.refCodigo;
	}

	public void setRefCodigo(String refCodigo) {
		this.refCodigo = refCodigo;
	}

	public DitPersonaDO getDitPersona() {
		return this.ditPersona;
	}

	public void setDitPersona(DitPersonaDO ditPersona) {
		this.ditPersona = ditPersona;
	}

}