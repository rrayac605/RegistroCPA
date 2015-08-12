package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIC_TIPO_TRAMITE database table.
 * 
 */
@Entity
@Table(name="DIC_TIPO_TRAMITE")
@NamedQuery(name="DicTipoTramiteDO.findAll", query="SELECT d FROM DicTipoTramiteDO d")
public class DicTipoTramiteDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_TIPO_TRAMITE")
	private long cveIdTipoTramite;

	@Column(name="DES_TIPO_TRAMITE")
	private String desTipoTramite;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Lob
	@Column(name="REF_GUIA_DETALLADA")
	private byte[] refGuiaDetallada;

	@Lob
	@Column(name="REF_GUIA_RAPIDA")
	private byte[] refGuiaRapida;

	@Column(name="REF_SIGLA")
	private String refSigla;

	@Column(name="TIP_TIPO_CONCLUSION")
	private BigDecimal tipTipoConclusion;

	@Column(name="TIP_TIPO_TRAMITE")
	private BigDecimal tipTipoTramite;

	//bi-directional many-to-many association to DicModuloDO
	@ManyToMany
	@JoinTable(
		name="DIC_MODULO_TIPO_TRAMITE"
		, joinColumns={
			@JoinColumn(name="CVE_ID_TIPO_TRAMITE")
			}
		, inverseJoinColumns={
			@JoinColumn(name="CVE_ID_MODULO")
			}
		)
	private List<DicModuloDO> dicModulos;

	//bi-directional many-to-one association to DitTramiteDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dicTipoTramite")
	private List<DitTramiteDO> ditTramites;

	public DicTipoTramiteDO() {
	}

	public long getCveIdTipoTramite() {
		return this.cveIdTipoTramite;
	}

	public void setCveIdTipoTramite(long cveIdTipoTramite) {
		this.cveIdTipoTramite = cveIdTipoTramite;
	}

	public String getDesTipoTramite() {
		return this.desTipoTramite;
	}

	public void setDesTipoTramite(String desTipoTramite) {
		this.desTipoTramite = desTipoTramite;
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

	public byte[] getRefGuiaDetallada() {
		return this.refGuiaDetallada;
	}

	public void setRefGuiaDetallada(byte[] refGuiaDetallada) {
		this.refGuiaDetallada = refGuiaDetallada;
	}

	public byte[] getRefGuiaRapida() {
		return this.refGuiaRapida;
	}

	public void setRefGuiaRapida(byte[] refGuiaRapida) {
		this.refGuiaRapida = refGuiaRapida;
	}

	public String getRefSigla() {
		return this.refSigla;
	}

	public void setRefSigla(String refSigla) {
		this.refSigla = refSigla;
	}

	public BigDecimal getTipTipoConclusion() {
		return this.tipTipoConclusion;
	}

	public void setTipTipoConclusion(BigDecimal tipTipoConclusion) {
		this.tipTipoConclusion = tipTipoConclusion;
	}

	public BigDecimal getTipTipoTramite() {
		return this.tipTipoTramite;
	}

	public void setTipTipoTramite(BigDecimal tipTipoTramite) {
		this.tipTipoTramite = tipTipoTramite;
	}

	public List<DicModuloDO> getDicModulos() {
		return this.dicModulos;
	}

	public void setDicModulos(List<DicModuloDO> dicModulos) {
		this.dicModulos = dicModulos;
	}

	public List<DitTramiteDO> getDitTramites() {
		return this.ditTramites;
	}

	public void setDitTramites(List<DitTramiteDO> ditTramites) {
		this.ditTramites = ditTramites;
	}
	
}