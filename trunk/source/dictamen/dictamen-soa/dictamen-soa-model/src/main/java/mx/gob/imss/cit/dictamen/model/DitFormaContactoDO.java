package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIT_FORMA_CONTACTO database table.
 * 
 */
@Entity
@Table(name="DIT_FORMA_CONTACTO")
@NamedQuery(name="DitFormaContactoDO.findAll", query="SELECT d FROM DitFormaContactoDO d")
public class DitFormaContactoDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_FORMA_CONTACTO")
	private long cveIdFormaContacto;

	@Column(name="CVE_ID_TIPO_CONTACTO")
	private BigDecimal cveIdTipoContacto;

	@Column(name="DES_FORMA_CONTACTO")
	private String desFormaContacto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to NdtAsociacionContactoDO
	@OneToMany(mappedBy="ditFormaContacto")
	private List<NdtAsociacionContactoDO> ndtAsociacionContactos;

	//bi-directional many-to-one association to NdtColegioContactoDO
	@OneToMany(mappedBy="ditFormaContacto")
	private List<NdtColegioContactoDO> ndtColegioContactos;

	//bi-directional many-to-one association to NdtDespachoContactoDO
	@OneToMany(mappedBy="ditFormaContacto")
	private List<NdtDespachoContactoDO> ndtDespachoContactos;

	//bi-directional many-to-one association to NdtTipFormaContactoDO
	@OneToMany(mappedBy="ditFormaContacto")
	private List<NdtTipFormaContactoDO> ndtTipFormaContactos;

	public DitFormaContactoDO() {
	}

	public long getCveIdFormaContacto() {
		return this.cveIdFormaContacto;
	}

	public void setCveIdFormaContacto(long cveIdFormaContacto) {
		this.cveIdFormaContacto = cveIdFormaContacto;
	}

	public BigDecimal getCveIdTipoContacto() {
		return this.cveIdTipoContacto;
	}

	public void setCveIdTipoContacto(BigDecimal cveIdTipoContacto) {
		this.cveIdTipoContacto = cveIdTipoContacto;
	}

	public String getDesFormaContacto() {
		return this.desFormaContacto;
	}

	public void setDesFormaContacto(String desFormaContacto) {
		this.desFormaContacto = desFormaContacto;
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

	public List<NdtAsociacionContactoDO> getNdtAsociacionContactos() {
		return this.ndtAsociacionContactos;
	}

	public void setNdtAsociacionContactos(List<NdtAsociacionContactoDO> ndtAsociacionContactos) {
		this.ndtAsociacionContactos = ndtAsociacionContactos;
	}
	
	public List<NdtColegioContactoDO> getNdtColegioContactos() {
		return this.ndtColegioContactos;
	}

	public void setNdtColegioContactos(List<NdtColegioContactoDO> ndtColegioContactos) {
		this.ndtColegioContactos = ndtColegioContactos;
	}

	public List<NdtDespachoContactoDO> getNdtDespachoContactos() {
		return this.ndtDespachoContactos;
	}

	public void setNdtDespachoContactos(List<NdtDespachoContactoDO> ndtDespachoContactos) {
		this.ndtDespachoContactos = ndtDespachoContactos;
	}

	public List<NdtTipFormaContactoDO> getNdtTipFormaContactos() {
		return this.ndtTipFormaContactos;
	}

	public void setNdtTipFormaContactos(List<NdtTipFormaContactoDO> ndtTipFormaContactos) {
		this.ndtTipFormaContactos = ndtTipFormaContactos;
	}
}