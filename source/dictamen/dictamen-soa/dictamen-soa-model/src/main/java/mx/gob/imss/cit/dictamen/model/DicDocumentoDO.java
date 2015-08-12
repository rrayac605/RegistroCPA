package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIC_DOCUMENTO database table.
 * 
 */
@Entity
@Table(name="DIC_DOCUMENTO")
@NamedQuery(name="DicDocumentoDO.findAll", query="SELECT d FROM DicDocumentoDO d")
public class DicDocumentoDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_DOCUMENTO")
	private long cveIdDocumento;

	@Column(name="DES_DOCUMENTO")
	private String desDocumento;

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
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dicDocumento")
	private List<DitDocumentoPorTipoDO> ditDocumentoPorTipos;

	public DicDocumentoDO() {
	}

	public long getCveIdDocumento() {
		return this.cveIdDocumento;
	}

	public void setCveIdDocumento(long cveIdDocumento) {
		this.cveIdDocumento = cveIdDocumento;
	}

	public String getDesDocumento() {
		return this.desDocumento;
	}

	public void setDesDocumento(String desDocumento) {
		this.desDocumento = desDocumento;
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