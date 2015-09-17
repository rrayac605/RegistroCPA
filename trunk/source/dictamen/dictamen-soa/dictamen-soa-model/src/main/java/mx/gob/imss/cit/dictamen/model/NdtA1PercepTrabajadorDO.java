/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author ajfuentes
 */
@Entity
@Table(name = "NDT_A1_PERCEP_TRABAJADOR")
@NamedQueries({
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findAll", query = "SELECT n FROM NdtA1PercepTrabajadorDO n"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByCveIdA1Perceptrab", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.cveIdA1Perceptrab = :cveIdA1Perceptrab"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByRegPatronal", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.regPatronal = :regPatronal"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByNomPrimerApellidoTrabajador", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.nomPrimerApellidoTrabajador = :nomPrimerApellidoTrabajador"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByNomSegundoAellidoTrabajador", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.nomSegundoAellidoTrabajador = :nomSegundoAellidoTrabajador"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByNomNombreTrabajador", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.nomNombreTrabajador = :nomNombreTrabajador"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByNumNssTrabajador", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.numNssTrabajador = :numNssTrabajador"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByRfcTrabajador", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.rfcTrabajador = :rfcTrabajador"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByCurpTrabajador", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.curpTrabajador = :curpTrabajador"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpSueldosSalarios", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impSueldosSalarios = :impSueldosSalarios"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpGratificaciones", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impGratificaciones = :impGratificaciones"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpViaticos", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impViaticos = :impViaticos"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpTiempoExtra", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impTiempoExtra = :impTiempoExtra"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpPrimaVacacional", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impPrimaVacacional = :impPrimaVacacional"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpPrimaDominical", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impPrimaDominical = :impPrimaDominical"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpPtu", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impPtu = :impPtu"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpReembolsoGm", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impReembolsoGm = :impReembolsoGm"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpFondoAhorro", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impFondoAhorro = :impFondoAhorro"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpCajaAhorro", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impCajaAhorro = :impCajaAhorro"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpValesDespensa", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impValesDespensa = :impValesDespensa"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpAyudaGf", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impAyudaGf = :impAyudaGf"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpContribucionPatron", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impContribucionPatron = :impContribucionPatron"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpPremioPuntualidad", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impPremioPuntualidad = :impPremioPuntualidad"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpPremioAsistencia", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impPremioAsistencia = :impPremioAsistencia"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpPrimaSeguroVida", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impPrimaSeguroVida = :impPrimaSeguroVida"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpSeguroGmm", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impSeguroGmm = :impSeguroGmm"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpValesRestaurant", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impValesRestaurant = :impValesRestaurant"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpValesGasolina", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impValesGasolina = :impValesGasolina"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpValesRopa", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impValesRopa = :impValesRopa"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpAyudaRenta", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impAyudaRenta = :impAyudaRenta"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpAyudaEscolar", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impAyudaEscolar = :impAyudaEscolar"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpAyudaAnteojos", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impAyudaAnteojos = :impAyudaAnteojos"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpAyudaTransporte", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impAyudaTransporte = :impAyudaTransporte"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpCuotaSindical", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impCuotaSindical = :impCuotaSindical"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpSubsidioIncapacidad", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impSubsidioIncapacidad = :impSubsidioIncapacidad"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpBecaTrabajadorHijo", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impBecaTrabajadorHijo = :impBecaTrabajadorHijo"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpOtrosIngresosXsalario", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impOtrosIngresosXsalario = :impOtrosIngresosXsalario"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpPagoOtroEmpleador", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impPagoOtroEmpleador = :impPagoOtroEmpleador"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpJubPenRetiro", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impJubPenRetiro = :impJubPenRetiro"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpOtrosPagosXseparacion", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impOtrosPagosXseparacion = :impOtrosPagosXseparacion"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByImpTotal", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.impTotal = :impTotal"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByCveIdUsuario", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByFecRegistroAlta", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByFecRegistroBaja", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtA1PercepTrabajadorDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtA1PercepTrabajadorDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdtA1PercepTrabajadorDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_A1_PERCEPTRAB", nullable = false, precision = 22, scale = 0)
    private BigDecimal cveIdA1Perceptrab;
    @Size(max = 13)
    @Column(name = "REG_PATRONAL", length = 13)
    private String regPatronal;
    @Size(max = 100)
    @Column(name = "NOM_PRIMER_APELLIDO_TRABAJADOR", length = 100)
    private String nomPrimerApellidoTrabajador;
    @Size(max = 100)
    @Column(name = "NOM_SEGUNDO_AELLIDO_TRABAJADOR", length = 100)
    private String nomSegundoAellidoTrabajador;
    @Size(max = 100)
    @Column(name = "NOM_NOMBRE_TRABAJADOR", length = 100)
    private String nomNombreTrabajador;
    @Size(max = 11)
    @Column(name = "NUM_NSS_TRABAJADOR", length = 11)
    private String numNssTrabajador;
    @Size(max = 13)
    @Column(name = "RFC_TRABAJADOR", length = 13)
    private String rfcTrabajador;
    @Size(max = 18)
    @Column(name = "CURP_TRABAJADOR", length = 18)
    private String curpTrabajador;
    @Column(name = "IMP_SUELDOS_SALARIOS", precision = 14, scale = 2)
    private BigDecimal impSueldosSalarios;
    @Column(name = "IMP_GRATIFICACIONES", precision = 14, scale = 2)
    private BigDecimal impGratificaciones;
    @Column(name = "IMP_VIATICOS", precision = 14, scale = 2)
    private BigDecimal impViaticos;
    @Column(name = "IMP_TIEMPO_EXTRA", precision = 14, scale = 2)
    private BigDecimal impTiempoExtra;
    @Column(name = "IMP_PRIMA_VACACIONAL", precision = 14, scale = 2)
    private BigDecimal impPrimaVacacional;
    @Column(name = "IMP_PRIMA_DOMINICAL", precision = 14, scale = 2)
    private BigDecimal impPrimaDominical;
    @Column(name = "IMP_PTU", precision = 14, scale = 2)
    private BigDecimal impPtu;
    @Column(name = "IMP_REEMBOLSO_GM", precision = 14, scale = 2)
    private BigDecimal impReembolsoGm;
    @Column(name = "IMP_FONDO_AHORRO", precision = 14, scale = 2)
    private BigDecimal impFondoAhorro;
    @Column(name = "IMP_CAJA_AHORRO", precision = 14, scale = 2)
    private BigDecimal impCajaAhorro;
    @Column(name = "IMP_VALES_DESPENSA", precision = 14, scale = 2)
    private BigDecimal impValesDespensa;
    @Column(name = "IMP_AYUDA_GF", precision = 14, scale = 2)
    private BigDecimal impAyudaGf;
    @Column(name = "IMP_CONTRIBUCION_PATRON", precision = 14, scale = 2)
    private BigDecimal impContribucionPatron;
    @Column(name = "IMP_PREMIO_PUNTUALIDAD", precision = 14, scale = 2)
    private BigDecimal impPremioPuntualidad;
    @Column(name = "IMP_PREMIO_ASISTENCIA", precision = 14, scale = 2)
    private BigDecimal impPremioAsistencia;
    @Column(name = "IMP_PRIMA_SEGURO_VIDA", precision = 14, scale = 2)
    private BigDecimal impPrimaSeguroVida;
    @Column(name = "IMP_SEGURO_GMM", precision = 14, scale = 2)
    private BigDecimal impSeguroGmm;
    @Column(name = "IMP_VALES_RESTAURANT", precision = 14, scale = 2)
    private BigDecimal impValesRestaurant;
    @Column(name = "IMP_VALES_GASOLINA", precision = 14, scale = 2)
    private BigDecimal impValesGasolina;
    @Column(name = "IMP_VALES_ROPA", precision = 14, scale = 2)
    private BigDecimal impValesRopa;
    @Column(name = "IMP_AYUDA_RENTA", precision = 14, scale = 2)
    private BigDecimal impAyudaRenta;
    @Column(name = "IMP_AYUDA_ESCOLAR", precision = 14, scale = 2)
    private BigDecimal impAyudaEscolar;
    @Column(name = "IMP_AYUDA_ANTEOJOS", precision = 14, scale = 2)
    private BigDecimal impAyudaAnteojos;
    @Column(name = "IMP_AYUDA_TRANSPORTE", precision = 14, scale = 2)
    private BigDecimal impAyudaTransporte;
    @Column(name = "IMP_CUOTA_SINDICAL", precision = 14, scale = 2)
    private BigDecimal impCuotaSindical;
    @Column(name = "IMP_SUBSIDIO_INCAPACIDAD", precision = 14, scale = 2)
    private BigDecimal impSubsidioIncapacidad;
    @Column(name = "IMP_BECA_TRABAJADOR_HIJO", precision = 14, scale = 2)
    private BigDecimal impBecaTrabajadorHijo;
    @Column(name = "IMP_OTROS_INGRESOS_XSALARIO", precision = 14, scale = 2)
    private BigDecimal impOtrosIngresosXsalario;
    @Column(name = "IMP_PAGO_OTRO_EMPLEADOR", precision = 14, scale = 2)
    private BigDecimal impPagoOtroEmpleador;
    @Column(name = "IMP_JUB_PEN_RETIRO", precision = 14, scale = 2)
    private BigDecimal impJubPenRetiro;
    @Column(name = "IMP_OTROS_PAGOS_XSEPARACION", precision = 14, scale = 2)
    private BigDecimal impOtrosPagosXseparacion;
    @Column(name = "IMP_TOTAL", precision = 14, scale = 2)
    private BigDecimal impTotal;
    @Size(max = 18)
    @Column(name = "CVE_ID_USUARIO", length = 18)
    private String cveIdUsuario;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @JoinColumn(name = "CVE_ID_PATRON_DICTAMEN", referencedColumnName = "CVE_ID_PATRON_DICTAMEN")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtPatronDictamenDO cveIdPatronDictamen;

    public NdtA1PercepTrabajadorDO() {
    }

    public NdtA1PercepTrabajadorDO(BigDecimal cveIdA1Perceptrab) {
        this.cveIdA1Perceptrab = cveIdA1Perceptrab;
    }

    public BigDecimal getCveIdA1Perceptrab() {
        return cveIdA1Perceptrab;
    }

    public void setCveIdA1Perceptrab(BigDecimal cveIdA1Perceptrab) {
        this.cveIdA1Perceptrab = cveIdA1Perceptrab;
    }

    public String getRegPatronal() {
        return regPatronal;
    }

    public void setRegPatronal(String regPatronal) {
        this.regPatronal = regPatronal;
    }

    public String getNomPrimerApellidoTrabajador() {
        return nomPrimerApellidoTrabajador;
    }

    public void setNomPrimerApellidoTrabajador(String nomPrimerApellidoTrabajador) {
        this.nomPrimerApellidoTrabajador = nomPrimerApellidoTrabajador;
    }

    public String getNomSegundoAellidoTrabajador() {
        return nomSegundoAellidoTrabajador;
    }

    public void setNomSegundoAellidoTrabajador(String nomSegundoAellidoTrabajador) {
        this.nomSegundoAellidoTrabajador = nomSegundoAellidoTrabajador;
    }

    public String getNomNombreTrabajador() {
        return nomNombreTrabajador;
    }

    public void setNomNombreTrabajador(String nomNombreTrabajador) {
        this.nomNombreTrabajador = nomNombreTrabajador;
    }

    public String getNumNssTrabajador() {
        return numNssTrabajador;
    }

    public void setNumNssTrabajador(String numNssTrabajador) {
        this.numNssTrabajador = numNssTrabajador;
    }

    public String getRfcTrabajador() {
        return rfcTrabajador;
    }

    public void setRfcTrabajador(String rfcTrabajador) {
        this.rfcTrabajador = rfcTrabajador;
    }

    public String getCurpTrabajador() {
        return curpTrabajador;
    }

    public void setCurpTrabajador(String curpTrabajador) {
        this.curpTrabajador = curpTrabajador;
    }

    public BigDecimal getImpSueldosSalarios() {
        return impSueldosSalarios;
    }

    public void setImpSueldosSalarios(BigDecimal impSueldosSalarios) {
        this.impSueldosSalarios = impSueldosSalarios;
    }

    public BigDecimal getImpGratificaciones() {
        return impGratificaciones;
    }

    public void setImpGratificaciones(BigDecimal impGratificaciones) {
        this.impGratificaciones = impGratificaciones;
    }

    public BigDecimal getImpViaticos() {
        return impViaticos;
    }

    public void setImpViaticos(BigDecimal impViaticos) {
        this.impViaticos = impViaticos;
    }

    public BigDecimal getImpTiempoExtra() {
        return impTiempoExtra;
    }

    public void setImpTiempoExtra(BigDecimal impTiempoExtra) {
        this.impTiempoExtra = impTiempoExtra;
    }

    public BigDecimal getImpPrimaVacacional() {
        return impPrimaVacacional;
    }

    public void setImpPrimaVacacional(BigDecimal impPrimaVacacional) {
        this.impPrimaVacacional = impPrimaVacacional;
    }

    public BigDecimal getImpPrimaDominical() {
        return impPrimaDominical;
    }

    public void setImpPrimaDominical(BigDecimal impPrimaDominical) {
        this.impPrimaDominical = impPrimaDominical;
    }

    public BigDecimal getImpPtu() {
        return impPtu;
    }

    public void setImpPtu(BigDecimal impPtu) {
        this.impPtu = impPtu;
    }

    public BigDecimal getImpReembolsoGm() {
        return impReembolsoGm;
    }

    public void setImpReembolsoGm(BigDecimal impReembolsoGm) {
        this.impReembolsoGm = impReembolsoGm;
    }

    public BigDecimal getImpFondoAhorro() {
        return impFondoAhorro;
    }

    public void setImpFondoAhorro(BigDecimal impFondoAhorro) {
        this.impFondoAhorro = impFondoAhorro;
    }

    public BigDecimal getImpCajaAhorro() {
        return impCajaAhorro;
    }

    public void setImpCajaAhorro(BigDecimal impCajaAhorro) {
        this.impCajaAhorro = impCajaAhorro;
    }

    public BigDecimal getImpValesDespensa() {
        return impValesDespensa;
    }

    public void setImpValesDespensa(BigDecimal impValesDespensa) {
        this.impValesDespensa = impValesDespensa;
    }

    public BigDecimal getImpAyudaGf() {
        return impAyudaGf;
    }

    public void setImpAyudaGf(BigDecimal impAyudaGf) {
        this.impAyudaGf = impAyudaGf;
    }

    public BigDecimal getImpContribucionPatron() {
        return impContribucionPatron;
    }

    public void setImpContribucionPatron(BigDecimal impContribucionPatron) {
        this.impContribucionPatron = impContribucionPatron;
    }

    public BigDecimal getImpPremioPuntualidad() {
        return impPremioPuntualidad;
    }

    public void setImpPremioPuntualidad(BigDecimal impPremioPuntualidad) {
        this.impPremioPuntualidad = impPremioPuntualidad;
    }

    public BigDecimal getImpPremioAsistencia() {
        return impPremioAsistencia;
    }

    public void setImpPremioAsistencia(BigDecimal impPremioAsistencia) {
        this.impPremioAsistencia = impPremioAsistencia;
    }

    public BigDecimal getImpPrimaSeguroVida() {
        return impPrimaSeguroVida;
    }

    public void setImpPrimaSeguroVida(BigDecimal impPrimaSeguroVida) {
        this.impPrimaSeguroVida = impPrimaSeguroVida;
    }

    public BigDecimal getImpSeguroGmm() {
        return impSeguroGmm;
    }

    public void setImpSeguroGmm(BigDecimal impSeguroGmm) {
        this.impSeguroGmm = impSeguroGmm;
    }

    public BigDecimal getImpValesRestaurant() {
        return impValesRestaurant;
    }

    public void setImpValesRestaurant(BigDecimal impValesRestaurant) {
        this.impValesRestaurant = impValesRestaurant;
    }

    public BigDecimal getImpValesGasolina() {
        return impValesGasolina;
    }

    public void setImpValesGasolina(BigDecimal impValesGasolina) {
        this.impValesGasolina = impValesGasolina;
    }

    public BigDecimal getImpValesRopa() {
        return impValesRopa;
    }

    public void setImpValesRopa(BigDecimal impValesRopa) {
        this.impValesRopa = impValesRopa;
    }

    public BigDecimal getImpAyudaRenta() {
        return impAyudaRenta;
    }

    public void setImpAyudaRenta(BigDecimal impAyudaRenta) {
        this.impAyudaRenta = impAyudaRenta;
    }

    public BigDecimal getImpAyudaEscolar() {
        return impAyudaEscolar;
    }

    public void setImpAyudaEscolar(BigDecimal impAyudaEscolar) {
        this.impAyudaEscolar = impAyudaEscolar;
    }

    public BigDecimal getImpAyudaAnteojos() {
        return impAyudaAnteojos;
    }

    public void setImpAyudaAnteojos(BigDecimal impAyudaAnteojos) {
        this.impAyudaAnteojos = impAyudaAnteojos;
    }

    public BigDecimal getImpAyudaTransporte() {
        return impAyudaTransporte;
    }

    public void setImpAyudaTransporte(BigDecimal impAyudaTransporte) {
        this.impAyudaTransporte = impAyudaTransporte;
    }

    public BigDecimal getImpCuotaSindical() {
        return impCuotaSindical;
    }

    public void setImpCuotaSindical(BigDecimal impCuotaSindical) {
        this.impCuotaSindical = impCuotaSindical;
    }

    public BigDecimal getImpSubsidioIncapacidad() {
        return impSubsidioIncapacidad;
    }

    public void setImpSubsidioIncapacidad(BigDecimal impSubsidioIncapacidad) {
        this.impSubsidioIncapacidad = impSubsidioIncapacidad;
    }

    public BigDecimal getImpBecaTrabajadorHijo() {
        return impBecaTrabajadorHijo;
    }

    public void setImpBecaTrabajadorHijo(BigDecimal impBecaTrabajadorHijo) {
        this.impBecaTrabajadorHijo = impBecaTrabajadorHijo;
    }

    public BigDecimal getImpOtrosIngresosXsalario() {
        return impOtrosIngresosXsalario;
    }

    public void setImpOtrosIngresosXsalario(BigDecimal impOtrosIngresosXsalario) {
        this.impOtrosIngresosXsalario = impOtrosIngresosXsalario;
    }

    public BigDecimal getImpPagoOtroEmpleador() {
        return impPagoOtroEmpleador;
    }

    public void setImpPagoOtroEmpleador(BigDecimal impPagoOtroEmpleador) {
        this.impPagoOtroEmpleador = impPagoOtroEmpleador;
    }

    public BigDecimal getImpJubPenRetiro() {
        return impJubPenRetiro;
    }

    public void setImpJubPenRetiro(BigDecimal impJubPenRetiro) {
        this.impJubPenRetiro = impJubPenRetiro;
    }

    public BigDecimal getImpOtrosPagosXseparacion() {
        return impOtrosPagosXseparacion;
    }

    public void setImpOtrosPagosXseparacion(BigDecimal impOtrosPagosXseparacion) {
        this.impOtrosPagosXseparacion = impOtrosPagosXseparacion;
    }

    public BigDecimal getImpTotal() {
        return impTotal;
    }

    public void setImpTotal(BigDecimal impTotal) {
        this.impTotal = impTotal;
    }

    public String getCveIdUsuario() {
        return cveIdUsuario;
    }

    public void setCveIdUsuario(String cveIdUsuario) {
        this.cveIdUsuario = cveIdUsuario;
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

    public Date getFecRegistroActualizado() {
        return fecRegistroActualizado;
    }

    public void setFecRegistroActualizado(Date fecRegistroActualizado) {
        this.fecRegistroActualizado = fecRegistroActualizado;
    }

    public NdtPatronDictamenDO getCveIdPatronDictamen() {
        return cveIdPatronDictamen;
    }

    public void setCveIdPatronDictamen(NdtPatronDictamenDO cveIdPatronDictamen) {
        this.cveIdPatronDictamen = cveIdPatronDictamen;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdA1Perceptrab != null ? cveIdA1Perceptrab.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtA1PercepTrabajadorDO)) {
            return false;
        }
        NdtA1PercepTrabajadorDO other = (NdtA1PercepTrabajadorDO) object;
        if ((this.cveIdA1Perceptrab == null && other.cveIdA1Perceptrab != null) || (this.cveIdA1Perceptrab != null && !this.cveIdA1Perceptrab.equals(other.cveIdA1Perceptrab))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtA1PercepTrabajadorDO[ cveIdA1Perceptrab=" + cveIdA1Perceptrab + " ]";
    }
    
}
