package mx.gob.imss.cit.dictamen.commons.to;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class PatronDictamenTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8123788222210085400L;

	private long cveIdDictamen;

	private String cveIdUsuario;

	private String desNumeroFolioDictamen;

	private String desObservaciones;

	private Date fecPeriodoFinDictaminaejer;

	private Date fecPeriodoInicioDictaminaej;

	private Date fecRegistroAlta;

	private Date fecRegistroAutorizado;

	private Date fecRegistroBaja;

	private BigDecimal indEmpresaValuada;

	private BigDecimal indPatronObligado;

	private BigDecimal indPatronSustituido;

	private BigDecimal indPatronSustituto;

	private SubdelegacionTO dicSubdelegacion;

	private PatronSujetoObligadoTO ditPatronSujetoObligado;

	private TipoAfiliacionTO ndcTipoAfiliacion;

	private TipoConvenioCotizacionTO ndcTipoConvenioCotizacion;

	private List<PatronDictamenCpaTO> ndtPatronDictamenCpas;

	/**
	 * @return the cveIdDictamen
	 */
	public long getCveIdDictamen() {
		return cveIdDictamen;
	}

	/**
	 * @param cveIdDictamen the cveIdDictamen to set
	 */
	public void setCveIdDictamen(long cveIdDictamen) {
		this.cveIdDictamen = cveIdDictamen;
	}

	/**
	 * @return the cveIdUsuario
	 */
	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	/**
	 * @param cveIdUsuario the cveIdUsuario to set
	 */
	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	/**
	 * @return the desNumeroFolioDictamen
	 */
	public String getDesNumeroFolioDictamen() {
		return desNumeroFolioDictamen;
	}

	/**
	 * @param desNumeroFolioDictamen the desNumeroFolioDictamen to set
	 */
	public void setDesNumeroFolioDictamen(String desNumeroFolioDictamen) {
		this.desNumeroFolioDictamen = desNumeroFolioDictamen;
	}

	/**
	 * @return the desObservaciones
	 */
	public String getDesObservaciones() {
		return desObservaciones;
	}

	/**
	 * @param desObservaciones the desObservaciones to set
	 */
	public void setDesObservaciones(String desObservaciones) {
		this.desObservaciones = desObservaciones;
	}

	/**
	 * @return the fecPeriodoFinDictaminaejer
	 */
	public Date getFecPeriodoFinDictaminaejer() {
		return fecPeriodoFinDictaminaejer != null ? (Date) fecPeriodoFinDictaminaejer.clone() : null;
	}

	/**
	 * @param fecPeriodoFinDictaminaejer the fecPeriodoFinDictaminaejer to set
	 */
	public void setFecPeriodoFinDictaminaejer(Date fecPeriodoFinDictaminaejer) {
		this.fecPeriodoFinDictaminaejer = fecPeriodoFinDictaminaejer;
	}

	/**
	 * @return the fecPeriodoInicioDictaminaej
	 */
	public Date getFecPeriodoInicioDictaminaej() {
		return fecPeriodoInicioDictaminaej != null ? (Date) fecPeriodoInicioDictaminaej.clone() : null;
	}

	/**
	 * @param fecPeriodoInicioDictaminaej the fecPeriodoInicioDictaminaej to set
	 */
	public void setFecPeriodoInicioDictaminaej(Date fecPeriodoInicioDictaminaej) {
		this.fecPeriodoInicioDictaminaej = fecPeriodoInicioDictaminaej;
	}

	/**
	 * @return the fecRegistroAlta
	 */
	public Date getFecRegistroAlta() {
		return fecRegistroAlta != null ? (Date) fecRegistroAlta.clone() : null;
	}

	/**
	 * @param fecRegistroAlta the fecRegistroAlta to set
	 */
	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	/**
	 * @return the fecRegistroAutorizado
	 */
	public Date getFecRegistroAutorizado() {
		return fecRegistroAutorizado != null ? (Date) fecRegistroAutorizado.clone() : null;
	}

	/**
	 * @param fecRegistroAutorizado the fecRegistroAutorizado to set
	 */
	public void setFecRegistroAutorizado(Date fecRegistroAutorizado) {
		this.fecRegistroAutorizado = fecRegistroAutorizado;
	}

	/**
	 * @return the fecRegistroBaja
	 */
	public Date getFecRegistroBaja() {
		return fecRegistroBaja != null ? (Date) fecRegistroBaja.clone() : null;
	}

	/**
	 * @param fecRegistroBaja the fecRegistroBaja to set
	 */
	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	/**
	 * @return the indEmpresaValuada
	 */
	public BigDecimal getIndEmpresaValuada() {
		return indEmpresaValuada;
	}

	/**
	 * @param indEmpresaValuada the indEmpresaValuada to set
	 */
	public void setIndEmpresaValuada(BigDecimal indEmpresaValuada) {
		this.indEmpresaValuada = indEmpresaValuada;
	}

	/**
	 * @return the indPatronObligado
	 */
	public BigDecimal getIndPatronObligado() {
		return indPatronObligado;
	}

	/**
	 * @param indPatronObligado the indPatronObligado to set
	 */
	public void setIndPatronObligado(BigDecimal indPatronObligado) {
		this.indPatronObligado = indPatronObligado;
	}

	/**
	 * @return the indPatronSustituido
	 */
	public BigDecimal getIndPatronSustituido() {
		return indPatronSustituido;
	}

	/**
	 * @param indPatronSustituido the indPatronSustituido to set
	 */
	public void setIndPatronSustituido(BigDecimal indPatronSustituido) {
		this.indPatronSustituido = indPatronSustituido;
	}

	/**
	 * @return the indPatronSustituto
	 */
	public BigDecimal getIndPatronSustituto() {
		return indPatronSustituto;
	}

	/**
	 * @param indPatronSustituto the indPatronSustituto to set
	 */
	public void setIndPatronSustituto(BigDecimal indPatronSustituto) {
		this.indPatronSustituto = indPatronSustituto;
	}

	/**
	 * @return the dicSubdelegacion
	 */
	public SubdelegacionTO getDicSubdelegacion() {
		return dicSubdelegacion;
	}

	/**
	 * @param dicSubdelegacion the dicSubdelegacion to set
	 */
	public void setDicSubdelegacion(SubdelegacionTO dicSubdelegacion) {
		this.dicSubdelegacion = dicSubdelegacion;
	}

	/**
	 * @return the ditPatronSujetoObligado
	 */
	public PatronSujetoObligadoTO getDitPatronSujetoObligado() {
		return ditPatronSujetoObligado;
	}

	/**
	 * @param ditPatronSujetoObligado the ditPatronSujetoObligado to set
	 */
	public void setDitPatronSujetoObligado(
			PatronSujetoObligadoTO ditPatronSujetoObligado) {
		this.ditPatronSujetoObligado = ditPatronSujetoObligado;
	}

	/**
	 * @return the ndcTipoAfiliacion
	 */
	public TipoAfiliacionTO getNdcTipoAfiliacion() {
		return ndcTipoAfiliacion;
	}

	/**
	 * @param ndcTipoAfiliacion the ndcTipoAfiliacion to set
	 */
	public void setNdcTipoAfiliacion(TipoAfiliacionTO ndcTipoAfiliacion) {
		this.ndcTipoAfiliacion = ndcTipoAfiliacion;
	}

	/**
	 * @return the ndcTipoConvenioCotizacion
	 */
	public TipoConvenioCotizacionTO getNdcTipoConvenioCotizacion() {
		return ndcTipoConvenioCotizacion;
	}

	/**
	 * @param ndcTipoConvenioCotizacion the ndcTipoConvenioCotizacion to set
	 */
	public void setNdcTipoConvenioCotizacion(
			TipoConvenioCotizacionTO ndcTipoConvenioCotizacion) {
		this.ndcTipoConvenioCotizacion = ndcTipoConvenioCotizacion;
	}

	/**
	 * @return the ndtPatronDictamenCpas
	 */
	public List<PatronDictamenCpaTO> getNdtPatronDictamenCpas() {
		return ndtPatronDictamenCpas;
	}

	/**
	 * @param ndtPatronDictamenCpas the ndtPatronDictamenCpas to set
	 */
	public void setNdtPatronDictamenCpas(
			List<PatronDictamenCpaTO> ndtPatronDictamenCpas) {
		this.ndtPatronDictamenCpas = ndtPatronDictamenCpas;
	}

	
	
}
