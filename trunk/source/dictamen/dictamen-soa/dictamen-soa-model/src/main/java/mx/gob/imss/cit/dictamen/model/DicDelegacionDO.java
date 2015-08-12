package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIC_DELEGACION database table.
 * 
 */
@Entity
@Table(name="DIC_DELEGACION")
@NamedQuery(name="DicDelegacionDO.findAll", query="SELECT d FROM DicDelegacionDO d")
public class DicDelegacionDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_DELEGACION")
	private long cveIdDelegacion;

	@Column(name="ANIO_INI_OPER")
	private String anioIniOper;

	@Column(name="CLAVE_DELEGACION")
	private String claveDelegacion;

	@Column(name="CVE_CIZ")
	private BigDecimal cveCiz;

	@Column(name="DES_DELEG")
	private String desDeleg;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="TIP_DELEGACION")
	private BigDecimal tipDelegacion;

	//bi-directional many-to-one association to DgDomicilioGeograficoDO
	@ManyToOne
	@JoinColumn(name="DOMICILIO_ID")
	private DgDomicilioGeograficoDO dgDomicilioGeografico;

	//bi-directional many-to-one association to DicSubdelegacionDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dicDelegacion")
	private List<DicSubdelegacionDO> dicSubdelegacions;

	public DicDelegacionDO() {
	}

	public long getCveIdDelegacion() {
		return this.cveIdDelegacion;
	}

	public void setCveIdDelegacion(long cveIdDelegacion) {
		this.cveIdDelegacion = cveIdDelegacion;
	}

	public String getAnioIniOper() {
		return this.anioIniOper;
	}

	public void setAnioIniOper(String anioIniOper) {
		this.anioIniOper = anioIniOper;
	}

	public String getClaveDelegacion() {
		return this.claveDelegacion;
	}

	public void setClaveDelegacion(String claveDelegacion) {
		this.claveDelegacion = claveDelegacion;
	}

	public BigDecimal getCveCiz() {
		return this.cveCiz;
	}

	public void setCveCiz(BigDecimal cveCiz) {
		this.cveCiz = cveCiz;
	}

	public String getDesDeleg() {
		return this.desDeleg;
	}

	public void setDesDeleg(String desDeleg) {
		this.desDeleg = desDeleg;
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

	public BigDecimal getTipDelegacion() {
		return this.tipDelegacion;
	}

	public void setTipDelegacion(BigDecimal tipDelegacion) {
		this.tipDelegacion = tipDelegacion;
	}

	public DgDomicilioGeograficoDO getDgDomicilioGeografico() {
		return this.dgDomicilioGeografico;
	}

	public void setDgDomicilioGeografico(DgDomicilioGeograficoDO dgDomicilioGeografico) {
		this.dgDomicilioGeografico = dgDomicilioGeografico;
	}

	public List<DicSubdelegacionDO> getDicSubdelegacions() {
		return this.dicSubdelegacions;
	}

	public void setDicSubdelegacions(List<DicSubdelegacionDO> dicSubdelegacions) {
		this.dicSubdelegacions = dicSubdelegacions;
	}

}