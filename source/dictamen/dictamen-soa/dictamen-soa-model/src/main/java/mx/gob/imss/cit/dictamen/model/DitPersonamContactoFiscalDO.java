package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the DIT_PERSONAM_CONTACTO_FISCAL database table.
 * 
 */
@Entity
@Table(name="DIT_PERSONAM_CONTACTO_FISCAL")
@NamedQuery(name="DitPersonamContactoFiscalDO.findAll", query="SELECT d FROM DitPersonamContactoFiscalDO d")
public class DitPersonamContactoFiscalDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_PMCONT_FISCAL")
	private long cveIdPmcontFiscal;

	@Column(name="CVE_ID_FORMA_CONTACTO")
	private BigDecimal cveIdFormaContacto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to DitPersonaMoralDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA_MORAL")
	private DitPersonaMoralDO ditPersonaMoral;

	public DitPersonamContactoFiscalDO() {
	}

	public long getCveIdPmcontFiscal() {
		return this.cveIdPmcontFiscal;
	}

	public void setCveIdPmcontFiscal(long cveIdPmcontFiscal) {
		this.cveIdPmcontFiscal = cveIdPmcontFiscal;
	}

	public BigDecimal getCveIdFormaContacto() {
		return this.cveIdFormaContacto;
	}

	public void setCveIdFormaContacto(BigDecimal cveIdFormaContacto) {
		this.cveIdFormaContacto = cveIdFormaContacto;
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

	public DitPersonaMoralDO getDitPersonaMoral() {
		return this.ditPersonaMoral;
	}

	public void setDitPersonaMoral(DitPersonaMoralDO ditPersonaMoral) {
		this.ditPersonaMoral = ditPersonaMoral;
	}

}