package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIC_TIPO_DOCUMENTO_PROBATORIO database table.
 * 
 */
@Entity
@Table(name="DIC_TIPO_DOCUMENTO_PROBATORIO")
@NamedQuery(name="DicTipoDocumentoProbatorioDO.findAll", query="SELECT d FROM DicTipoDocumentoProbatorioDO d")
public class DicTipoDocumentoProbatorioDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_TIPO_DOCUMENTO_PROBATOR")
	private long cveIdTipoDocumentoProbator;

	@Column(name="DES_TIPO_DOCUMENTO_PROBATORIO")
	private String desTipoDocumentoProbatorio;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to DitDocumentoPorTipoDO
	@OneToMany(mappedBy="dicTipoDocumentoProbatorio")
	private List<DitDocumentoPorTipoDO> ditDocumentoPorTipos;

	public DicTipoDocumentoProbatorioDO() {
	}

	public long getCveIdTipoDocumentoProbator() {
		return this.cveIdTipoDocumentoProbator;
	}

	public void setCveIdTipoDocumentoProbator(long cveIdTipoDocumentoProbator) {
		this.cveIdTipoDocumentoProbator = cveIdTipoDocumentoProbator;
	}

	public String getDesTipoDocumentoProbatorio() {
		return this.desTipoDocumentoProbatorio;
	}

	public void setDesTipoDocumentoProbatorio(String desTipoDocumentoProbatorio) {
		this.desTipoDocumentoProbatorio = desTipoDocumentoProbatorio;
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

	public List<DitDocumentoPorTipoDO> getDitDocumentoPorTipos() {
		return this.ditDocumentoPorTipos;
	}

	public void setDitDocumentoPorTipos(List<DitDocumentoPorTipoDO> ditDocumentoPorTipos) {
		this.ditDocumentoPorTipos = ditDocumentoPorTipos;
	}
}