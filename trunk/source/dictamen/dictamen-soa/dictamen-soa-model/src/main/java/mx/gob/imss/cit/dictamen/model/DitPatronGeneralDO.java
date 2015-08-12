package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIT_PATRON_GENERAL database table.
 * 
 */
@Entity
@Table(name="DIT_PATRON_GENERAL")
@NamedQuery(name="DitPatronGeneralDO.findAll", query="SELECT d FROM DitPatronGeneralDO d")
public class DitPatronGeneralDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_PATRON_GENERAL")
	private long cveIdPatronGeneral;

	@Column(name="CVE_ID_TIPO_REG_PATRON")
	private BigDecimal cveIdTipoRegPatron;

	@Column(name="DIG_VER")
	private String digVer;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Column(name="POR_AUSENTISMO")
	private BigDecimal porAusentismo;

	@Column(name="REG_PATRON")
	private String regPatron;

	//bi-directional many-to-one association to DitPatronGeneralDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PATRON_RELACIONADO")
	private DitPatronGeneralDO ditPatronGeneral;

	//bi-directional many-to-one association to DitPatronGeneralDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPatronGeneral")
	private List<DitPatronGeneralDO> ditPatronGenerals;

	//bi-directional many-to-one association to DitPatronSujetoObligadoDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PATRON_SUJETO_OBLIGADO")
	private DitPatronSujetoObligadoDO ditPatronSujetoObligado;

	public DitPatronGeneralDO() {
	}

	public long getCveIdPatronGeneral() {
		return this.cveIdPatronGeneral;
	}

	public void setCveIdPatronGeneral(long cveIdPatronGeneral) {
		this.cveIdPatronGeneral = cveIdPatronGeneral;
	}

	public BigDecimal getCveIdTipoRegPatron() {
		return this.cveIdTipoRegPatron;
	}

	public void setCveIdTipoRegPatron(BigDecimal cveIdTipoRegPatron) {
		this.cveIdTipoRegPatron = cveIdTipoRegPatron;
	}

	public String getDigVer() {
		return this.digVer;
	}

	public void setDigVer(String digVer) {
		this.digVer = digVer;
	}

	public Date getFecRegistroActualizado() {
		return this.fecRegistroActualizado;
	}

	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	public BigDecimal getPorAusentismo() {
		return this.porAusentismo;
	}

	public void setPorAusentismo(BigDecimal porAusentismo) {
		this.porAusentismo = porAusentismo;
	}

	public String getRegPatron() {
		return this.regPatron;
	}

	public void setRegPatron(String regPatron) {
		this.regPatron = regPatron;
	}

	public DitPatronGeneralDO getDitPatronGeneral() {
		return this.ditPatronGeneral;
	}

	public void setDitPatronGeneral(DitPatronGeneralDO ditPatronGeneral) {
		this.ditPatronGeneral = ditPatronGeneral;
	}

	public List<DitPatronGeneralDO> getDitPatronGenerals() {
		return this.ditPatronGenerals;
	}

	public void setDitPatronGenerals(List<DitPatronGeneralDO> ditPatronGenerals) {
		this.ditPatronGenerals = ditPatronGenerals;
	}

	public DitPatronSujetoObligadoDO getDitPatronSujetoObligado() {
		return this.ditPatronSujetoObligado;
	}

	public void setDitPatronSujetoObligado(DitPatronSujetoObligadoDO ditPatronSujetoObligado) {
		this.ditPatronSujetoObligado = ditPatronSujetoObligado;
	}

}