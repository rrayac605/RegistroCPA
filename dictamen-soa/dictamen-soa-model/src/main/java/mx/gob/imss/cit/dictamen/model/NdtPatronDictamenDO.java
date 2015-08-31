package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the NDT_PATRON_DICTAMEN database table.
 * 
 */
@Entity
@Table(name="NDT_PATRON_DICTAMEN")
@NamedQuery(name="NdtPatronDictamenDO.findAll", query="SELECT n FROM NdtPatronDictamenDO n")
public class NdtPatronDictamenDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "CVE_ID_DICTAMEN", nullable = false)
    @SequenceGenerator(name = "NdtPatronDictamen_Id_Seq_Gen", sequenceName = "SEQ_NDTPATRONDICTAMEN")
    @GeneratedValue(generator = "NdtPatronDictamen_Id_Seq_Gen")
	private long cveIdDictamen;

	@Column(name="CVE_ID_USUARIO")
	private String cveIdUsuario;

	@Column(name="DES_NUMERO_FOLIO_DICTAMEN")
	private String desNumeroFolioDictamen;

	@Column(name="DES_OBSERVACIONES")
	private String desObservaciones;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_PERIODO_FIN_DICTAMINAEJER")
	private Date fecPeriodoFinDictaminaejer;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_PERIODO_INICIO_DICTAMINAEJ")
	private Date fecPeriodoInicioDictaminaej;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_AUTORIZADO")
	private Date fecRegistroAutorizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="IND_EMPRESA_VALUADA")
	private BigDecimal indEmpresaValuada;

	@Column(name="IND_PATRON_OBLIGADO")
	private BigDecimal indPatronObligado;

	@Column(name="IND_PATRON_SUSTITUIDO")
	private BigDecimal indPatronSustituido;

	@Column(name="IND_PATRON_SUSTITUTO")
	private BigDecimal indPatronSustituto;

	//bi-directional many-to-one association to DicSubdelegacionDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_SUBDELEGACION")
	private DicSubdelegacionDO dicSubdelegacion;

	//bi-directional many-to-one association to DitPatronSujetoObligadoDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PATRON_SUJETO_OBLIGADO")
	private DitPatronSujetoObligadoDO ditPatronSujetoObligado;

	//bi-directional many-to-one association to NdcTipoAfiliacionDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_TIPO_AFILIACION")
	private NdcTipoAfiliacionDO ndcTipoAfiliacion;

	//bi-directional many-to-one association to NdcTipoConvenioCotizacionDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_TIPO_CONVENIO_COT")
	private NdcTipoConvenioCotizacionDO ndcTipoConvenioCotizacion;

	//bi-directional many-to-one association to NdtPatronDictamenCpaDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ndtPatronDictamen")
	private List<NdtPatronDictamenCpaDO> ndtPatronDictamenCpas;

	public NdtPatronDictamenDO() {
	}

	public long getCveIdDictamen() {
		return this.cveIdDictamen;
	}

	public void setCveIdDictamen(long cveIdDictamen) {
		this.cveIdDictamen = cveIdDictamen;
	}

	public String getCveIdUsuario() {
		return this.cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDesNumeroFolioDictamen() {
		return this.desNumeroFolioDictamen;
	}

	public void setDesNumeroFolioDictamen(String desNumeroFolioDictamen) {
		this.desNumeroFolioDictamen = desNumeroFolioDictamen;
	}

	public String getDesObservaciones() {
		return this.desObservaciones;
	}

	public void setDesObservaciones(String desObservaciones) {
		this.desObservaciones = desObservaciones;
	}

	public Date getFecPeriodoFinDictaminaejer() {
		return this.fecPeriodoFinDictaminaejer;
	}

	public void setFecPeriodoFinDictaminaejer(Date fecPeriodoFinDictaminaejer) {
		this.fecPeriodoFinDictaminaejer = fecPeriodoFinDictaminaejer;
	}

	public Date getFecPeriodoInicioDictaminaej() {
		return this.fecPeriodoInicioDictaminaej;
	}

	public void setFecPeriodoInicioDictaminaej(Date fecPeriodoInicioDictaminaej) {
		this.fecPeriodoInicioDictaminaej = fecPeriodoInicioDictaminaej;
	}

	public Date getFecRegistroAlta() {
		return this.fecRegistroAlta;
	}

	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	public Date getFecRegistroAutorizado() {
		return this.fecRegistroAutorizado;
	}

	public void setFecRegistroAutorizado(Date fecRegistroAutorizado) {
		this.fecRegistroAutorizado = fecRegistroAutorizado;
	}

	public Date getFecRegistroBaja() {
		return this.fecRegistroBaja;
	}

	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	public BigDecimal getIndEmpresaValuada() {
		return this.indEmpresaValuada;
	}

	public void setIndEmpresaValuada(BigDecimal indEmpresaValuada) {
		this.indEmpresaValuada = indEmpresaValuada;
	}

	public BigDecimal getIndPatronObligado() {
		return this.indPatronObligado;
	}

	public void setIndPatronObligado(BigDecimal indPatronObligado) {
		this.indPatronObligado = indPatronObligado;
	}

	public BigDecimal getIndPatronSustituido() {
		return this.indPatronSustituido;
	}

	public void setIndPatronSustituido(BigDecimal indPatronSustituido) {
		this.indPatronSustituido = indPatronSustituido;
	}

	public BigDecimal getIndPatronSustituto() {
		return this.indPatronSustituto;
	}

	public void setIndPatronSustituto(BigDecimal indPatronSustituto) {
		this.indPatronSustituto = indPatronSustituto;
	}

	public DicSubdelegacionDO getDicSubdelegacion() {
		return this.dicSubdelegacion;
	}

	public void setDicSubdelegacion(DicSubdelegacionDO dicSubdelegacion) {
		this.dicSubdelegacion = dicSubdelegacion;
	}

	public DitPatronSujetoObligadoDO getDitPatronSujetoObligado() {
		return this.ditPatronSujetoObligado;
	}

	public void setDitPatronSujetoObligado(DitPatronSujetoObligadoDO ditPatronSujetoObligado) {
		this.ditPatronSujetoObligado = ditPatronSujetoObligado;
	}

	public NdcTipoAfiliacionDO getNdcTipoAfiliacion() {
		return this.ndcTipoAfiliacion;
	}

	public void setNdcTipoAfiliacion(NdcTipoAfiliacionDO ndcTipoAfiliacion) {
		this.ndcTipoAfiliacion = ndcTipoAfiliacion;
	}

	public NdcTipoConvenioCotizacionDO getNdcTipoConvenioCotizacion() {
		return this.ndcTipoConvenioCotizacion;
	}

	public void setNdcTipoConvenioCotizacion(NdcTipoConvenioCotizacionDO ndcTipoConvenioCotizacion) {
		this.ndcTipoConvenioCotizacion = ndcTipoConvenioCotizacion;
	}

	public List<NdtPatronDictamenCpaDO> getNdtPatronDictamenCpas() {
		return this.ndtPatronDictamenCpas;
	}

	public void setNdtPatronDictamenCpas(List<NdtPatronDictamenCpaDO> ndtPatronDictamenCpas) {
		this.ndtPatronDictamenCpas = ndtPatronDictamenCpas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveIdDictamen ^ (cveIdDictamen >>> 32));
		result = prime * result + ((cveIdUsuario == null) ? 0 : cveIdUsuario.hashCode());
		result = prime * result + ((desNumeroFolioDictamen == null) ? 0 : desNumeroFolioDictamen.hashCode());
		result = prime * result + ((desObservaciones == null) ? 0 : desObservaciones.hashCode());
		result = prime * result + ((dicSubdelegacion == null) ? 0 : dicSubdelegacion.hashCode());
		result = prime * result + ((ditPatronSujetoObligado == null) ? 0 : ditPatronSujetoObligado.hashCode());
		result = prime * result + ((fecPeriodoFinDictaminaejer == null) ? 0 : fecPeriodoFinDictaminaejer.hashCode());
		result = prime * result + ((fecPeriodoInicioDictaminaej == null) ? 0 : fecPeriodoInicioDictaminaej.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroAutorizado == null) ? 0 : fecRegistroAutorizado.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((indEmpresaValuada == null) ? 0 : indEmpresaValuada.hashCode());
		result = prime * result + ((indPatronObligado == null) ? 0 : indPatronObligado.hashCode());
		result = prime * result + ((indPatronSustituido == null) ? 0 : indPatronSustituido.hashCode());
		result = prime * result + ((indPatronSustituto == null) ? 0 : indPatronSustituto.hashCode());
		result = prime * result + ((ndcTipoAfiliacion == null) ? 0 : ndcTipoAfiliacion.hashCode());
		result = prime * result + ((ndcTipoConvenioCotizacion == null) ? 0 : ndcTipoConvenioCotizacion.hashCode());
		result = prime * result + ((ndtPatronDictamenCpas == null) ? 0 : ndtPatronDictamenCpas.hashCode());
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
		NdtPatronDictamenDO other = (NdtPatronDictamenDO) obj;
		if (cveIdDictamen != other.cveIdDictamen)
			return false;
		if (cveIdUsuario == null) {
			if (other.cveIdUsuario != null)
				return false;
		} else if (!cveIdUsuario.equals(other.cveIdUsuario))
			return false;
		if (desNumeroFolioDictamen == null) {
			if (other.desNumeroFolioDictamen != null)
				return false;
		} else if (!desNumeroFolioDictamen.equals(other.desNumeroFolioDictamen))
			return false;
		if (desObservaciones == null) {
			if (other.desObservaciones != null)
				return false;
		} else if (!desObservaciones.equals(other.desObservaciones))
			return false;
		if (dicSubdelegacion == null) {
			if (other.dicSubdelegacion != null)
				return false;
		} else if (!dicSubdelegacion.equals(other.dicSubdelegacion))
			return false;
		if (ditPatronSujetoObligado == null) {
			if (other.ditPatronSujetoObligado != null)
				return false;
		} else if (!ditPatronSujetoObligado.equals(other.ditPatronSujetoObligado))
			return false;
		if (fecPeriodoFinDictaminaejer == null) {
			if (other.fecPeriodoFinDictaminaejer != null)
				return false;
		} else if (!fecPeriodoFinDictaminaejer.equals(other.fecPeriodoFinDictaminaejer))
			return false;
		if (fecPeriodoInicioDictaminaej == null) {
			if (other.fecPeriodoInicioDictaminaej != null)
				return false;
		} else if (!fecPeriodoInicioDictaminaej.equals(other.fecPeriodoInicioDictaminaej))
			return false;
		if (fecRegistroAlta == null) {
			if (other.fecRegistroAlta != null)
				return false;
		} else if (!fecRegistroAlta.equals(other.fecRegistroAlta))
			return false;
		if (fecRegistroAutorizado == null) {
			if (other.fecRegistroAutorizado != null)
				return false;
		} else if (!fecRegistroAutorizado.equals(other.fecRegistroAutorizado))
			return false;
		if (fecRegistroBaja == null) {
			if (other.fecRegistroBaja != null)
				return false;
		} else if (!fecRegistroBaja.equals(other.fecRegistroBaja))
			return false;
		if (indEmpresaValuada == null) {
			if (other.indEmpresaValuada != null)
				return false;
		} else if (!indEmpresaValuada.equals(other.indEmpresaValuada))
			return false;
		if (indPatronObligado == null) {
			if (other.indPatronObligado != null)
				return false;
		} else if (!indPatronObligado.equals(other.indPatronObligado))
			return false;
		if (indPatronSustituido == null) {
			if (other.indPatronSustituido != null)
				return false;
		} else if (!indPatronSustituido.equals(other.indPatronSustituido))
			return false;
		if (indPatronSustituto == null) {
			if (other.indPatronSustituto != null)
				return false;
		} else if (!indPatronSustituto.equals(other.indPatronSustituto))
			return false;
		if (ndcTipoAfiliacion == null) {
			if (other.ndcTipoAfiliacion != null)
				return false;
		} else if (!ndcTipoAfiliacion.equals(other.ndcTipoAfiliacion))
			return false;
		if (ndcTipoConvenioCotizacion == null) {
			if (other.ndcTipoConvenioCotizacion != null)
				return false;
		} else if (!ndcTipoConvenioCotizacion.equals(other.ndcTipoConvenioCotizacion))
			return false;
		if (ndtPatronDictamenCpas == null) {
			if (other.ndtPatronDictamenCpas != null)
				return false;
		} else if (!ndtPatronDictamenCpas.equals(other.ndtPatronDictamenCpas))
			return false;
		return true;
	}

	
	
}