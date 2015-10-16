package mx.gob.imss.distss.dictamen.modelo.entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="NDT_BITACORA_ERRORES")
@NamedQuery(name="NdtBitacoraErrores.findAll", query="SELECT n FROM NdtBitacoraErrores n")
public class NdtBitacoraErrores implements Serializable {
	
	private static final long serialVersionUID = 1884124276229991551L;
	
	@Id
	@Column(name="CVE_ID_BIT_ERRORES", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtBitacoraErrores_Id_Seq_Gen", sequenceName = "SEQ_NDTBITACORAERRORES")
    @GeneratedValue(generator = "NdtBitacoraErrores_Id_Seq_Gen")
	private Long cveIdBitErrores;

	@Column(name="DES_ERRORES", length=3000)
	private String desErrores;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to NdtCargaAseveraciones
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_BITACORA_CARGA_ASEV")
	private NdtCargaAseveraciones ndtCargaAseveracione;

	public NdtBitacoraErrores() {
	}

	public Long getCveIdBitErrores() {
		return cveIdBitErrores;
	}

	public void setCveIdBitErrores(Long cveIdBitErrores) {
		this.cveIdBitErrores = cveIdBitErrores;
	}

	public String getDesErrores() {
		return desErrores;
	}

	public void setDesErrores(String desErrores) {
		this.desErrores = desErrores;
	}

	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado;
	}

	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	public Date getFecRegistroAlta() {
		return fecRegistroAlta;
	}

	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	public Date getFecRegistroBaja() {
		return fecRegistroBaja;
	}

	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	public NdtCargaAseveraciones getNdtCargaAseveracione() {
		return ndtCargaAseveracione;
	}

	public void setNdtCargaAseveracione(NdtCargaAseveraciones ndtCargaAseveracione) {
		this.ndtCargaAseveracione = ndtCargaAseveracione;
	}

}
