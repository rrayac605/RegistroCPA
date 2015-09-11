package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Arrays;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveIdTipoTramite ^ (cveIdTipoTramite >>> 32));
		result = prime * result + ((desTipoTramite == null) ? 0 : desTipoTramite.hashCode());
		result = prime * result + ((dicModulos == null) ? 0 : dicModulos.hashCode());
		result = prime * result + ((ditTramites == null) ? 0 : ditTramites.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + Arrays.hashCode(refGuiaDetallada);
		result = prime * result + Arrays.hashCode(refGuiaRapida);
		result = prime * result + ((refSigla == null) ? 0 : refSigla.hashCode());
		result = prime * result + ((tipTipoConclusion == null) ? 0 : tipTipoConclusion.hashCode());
		result = prime * result + ((tipTipoTramite == null) ? 0 : tipTipoTramite.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DicTipoTramiteDO other = (DicTipoTramiteDO) obj;
		if (cveIdTipoTramite != other.cveIdTipoTramite)
			return false;
		if (desTipoTramite == null) {
			if (other.desTipoTramite != null)
				return false;
		} else if (!desTipoTramite.equals(other.desTipoTramite))
			return false;
		if (dicModulos == null) {
			if (other.dicModulos != null)
				return false;
		} else if (!dicModulos.equals(other.dicModulos))
			return false;
		if (ditTramites == null) {
			if (other.ditTramites != null)
				return false;
		} else if (!ditTramites.equals(other.ditTramites))
			return false;
		if (fecRegistroActualizado == null) {
			if (other.fecRegistroActualizado != null)
				return false;
		} else if (!fecRegistroActualizado.equals(other.fecRegistroActualizado))
			return false;
		if (fecRegistroAlta == null) {
			if (other.fecRegistroAlta != null)
				return false;
		} else if (!fecRegistroAlta.equals(other.fecRegistroAlta))
			return false;
		if (fecRegistroBaja == null) {
			if (other.fecRegistroBaja != null)
				return false;
		} else if (!fecRegistroBaja.equals(other.fecRegistroBaja))
			return false;
		if (!Arrays.equals(refGuiaDetallada, other.refGuiaDetallada))
			return false;
		if (!Arrays.equals(refGuiaRapida, other.refGuiaRapida))
			return false;
		if (refSigla == null) {
			if (other.refSigla != null)
				return false;
		} else if (!refSigla.equals(other.refSigla))
			return false;
		if (tipTipoConclusion == null) {
			if (other.tipTipoConclusion != null)
				return false;
		} else if (!tipTipoConclusion.equals(other.tipTipoConclusion))
			return false;
		if (tipTipoTramite == null) {
			if (other.tipTipoTramite != null)
				return false;
		} else if (!tipTipoTramite.equals(other.tipTipoTramite))
			return false;
		return true;
	}
	
	
	
}