package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIT_DOCUMENTO_POR_TIPO database table.
 * 
 */
@Entity
@Table(name="DIT_DOCUMENTO_POR_TIPO")
@NamedQuery(name="DitDocumentoPorTipoDO.findAll", query="SELECT d FROM DitDocumentoPorTipoDO d")
public class DitDocumentoPorTipoDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_DOCTO_PROB_POR_TIPO")
	private long cveIdDoctoProbPorTipo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to DicDocumentoDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_DOCUMENTO")
	private DicDocumentoDO dicDocumento;

	//bi-directional many-to-one association to DicTipoDocumentoProbatorioDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_TIPO_DOCUMENTO_PROBATOR")
	private DicTipoDocumentoProbatorioDO dicTipoDocumentoProbatorio;

	//bi-directional many-to-one association to NdtDoctosProbCpaDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditDocumentoPorTipo")
	private List<NdtDoctosProbCpaDO> ndtDoctosProbCpas;

	public DitDocumentoPorTipoDO() {
	}

	public long getCveIdDoctoProbPorTipo() {
		return this.cveIdDoctoProbPorTipo;
	}

	public void setCveIdDoctoProbPorTipo(long cveIdDoctoProbPorTipo) {
		this.cveIdDoctoProbPorTipo = cveIdDoctoProbPorTipo;
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

	public DicDocumentoDO getDicDocumento() {
		return this.dicDocumento;
	}

	public void setDicDocumento(DicDocumentoDO dicDocumento) {
		this.dicDocumento = dicDocumento;
	}

	public DicTipoDocumentoProbatorioDO getDicTipoDocumentoProbatorio() {
		return this.dicTipoDocumentoProbatorio;
	}

	public void setDicTipoDocumentoProbatorio(DicTipoDocumentoProbatorioDO dicTipoDocumentoProbatorio) {
		this.dicTipoDocumentoProbatorio = dicTipoDocumentoProbatorio;
	}

	public List<NdtDoctosProbCpaDO> getNdtDoctosProbCpas() {
		return this.ndtDoctosProbCpas;
	}

	public void setNdtDoctosProbCpas(List<NdtDoctosProbCpaDO> ndtDoctosProbCpas) {
		this.ndtDoctosProbCpas = ndtDoctosProbCpas;
	}

}