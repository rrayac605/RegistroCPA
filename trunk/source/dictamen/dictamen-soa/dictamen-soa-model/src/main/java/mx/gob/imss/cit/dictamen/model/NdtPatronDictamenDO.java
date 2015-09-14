/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "NDT_PATRON_DICTAMEN")
@NamedQueries({
    @NamedQuery(name = "NdtPatronDictamen.findAll", query = "SELECT n FROM NdtPatronDictamenDO n"),
    @NamedQuery(name = "NdtPatronDictamen.findByCveIdPatronDictamen", query = "SELECT n FROM NdtPatronDictamenDO n WHERE n.cveIdPatronDictamen = :cveIdPatronDictamen"),
    @NamedQuery(name = "NdtPatronDictamen.findByIndPatronObligado", query = "SELECT n FROM NdtPatronDictamenDO n WHERE n.indPatronObligado = :indPatronObligado"),
    @NamedQuery(name = "NdtPatronDictamen.findByFecPeriodoInicioDictaminaej", query = "SELECT n FROM NdtPatronDictamenDO n WHERE n.fecPeriodoInicioDictaminaej = :fecPeriodoInicioDictaminaej"),
    @NamedQuery(name = "NdtPatronDictamen.findByFecPeriodoFinDictaminaejer", query = "SELECT n FROM NdtPatronDictamenDO n WHERE n.fecPeriodoFinDictaminaejer = :fecPeriodoFinDictaminaejer"),
    @NamedQuery(name = "NdtPatronDictamen.findByDesObservaciones", query = "SELECT n FROM NdtPatronDictamenDO n WHERE n.desObservaciones = :desObservaciones"),
    @NamedQuery(name = "NdtPatronDictamen.findByIndPatronSustituto", query = "SELECT n FROM NdtPatronDictamenDO n WHERE n.indPatronSustituto = :indPatronSustituto"),
    @NamedQuery(name = "NdtPatronDictamen.findByIndPatronSustituido", query = "SELECT n FROM NdtPatronDictamenDO n WHERE n.indPatronSustituido = :indPatronSustituido"),
    @NamedQuery(name = "NdtPatronDictamen.findByIndEmpresaValuada", query = "SELECT n FROM NdtPatronDictamenDO n WHERE n.indEmpresaValuada = :indEmpresaValuada"),
    @NamedQuery(name = "NdtPatronDictamen.findByDesNumeroFolioDictamen", query = "SELECT n FROM NdtPatronDictamenDO n WHERE n.desNumeroFolioDictamen = :desNumeroFolioDictamen"),
    @NamedQuery(name = "NdtPatronDictamen.findByCveIdUsuario", query = "SELECT n FROM NdtPatronDictamenDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtPatronDictamen.findByFecRegistroAlta", query = "SELECT n FROM NdtPatronDictamenDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtPatronDictamen.findByFecRegistroBaja", query = "SELECT n FROM NdtPatronDictamenDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtPatronDictamen.findByFecRegistroAutorizado", query = "SELECT n FROM NdtPatronDictamenDO n WHERE n.fecRegistroAutorizado = :fecRegistroAutorizado")})
public class NdtPatronDictamenDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_PATRON_DICTAMEN", nullable = false, precision = 22, scale = 0)
    private Long cveIdPatronDictamen;
    @Column(name = "IND_PATRON_OBLIGADO")
    private BigInteger indPatronObligado;
    @Column(name = "FEC_PERIODO_INICIO_DICTAMINAEJ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecPeriodoInicioDictaminaej;
    @Column(name = "FEC_PERIODO_FIN_DICTAMINAEJER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecPeriodoFinDictaminaejer;
    @Size(max = 100)
    @Column(name = "DES_OBSERVACIONES", length = 100)
    private String desObservaciones;
    @Column(name = "IND_PATRON_SUSTITUTO")
    private BigInteger indPatronSustituto;
    @Column(name = "IND_PATRON_SUSTITUIDO")
    private BigInteger indPatronSustituido;
    @Column(name = "IND_EMPRESA_VALUADA")
    private BigInteger indEmpresaValuada;
    @Size(max = 50)
    @Column(name = "DES_NUMERO_FOLIO_DICTAMEN", length = 50)
    private String desNumeroFolioDictamen;
    @Size(max = 18)
    @Column(name = "CVE_ID_USUARIO", length = 18)
    private String cveIdUsuario;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_AUTORIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAutorizado;
    @JoinColumn(name = "CVE_ID_TIPO_CONVENIO_COT", referencedColumnName = "CVE_ID_TIPO_CONVENIO_COT")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcTipoConvenioCotizacionDO cveIdTipoConvenioCot;
    @JoinColumn(name = "CVE_ID_TIPO_AFILIACION", referencedColumnName = "CVE_ID_TIPO_AFILIACION")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcTipoAfiliacionDO cveIdTipoAfiliacion;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtPatronAsociadoDO> ndtPatronAsociadoList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtNotasDictamenDO> ndtNotasDictamenList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtModeloOpinionDO> ndtModeloOpinionList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtB1RespuestaAtestiguamienDO> ndtB1RespuestaAtestiguamienList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtPatronDictamenCpaDO> ndtPatronDictamenCpaList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtMedioContactoDO> ndtMedioContactoList;

    public NdtPatronDictamenDO() {
    }

    public NdtPatronDictamenDO(Long cveIdPatronDictamen) {
        this.cveIdPatronDictamen = cveIdPatronDictamen;
    }

    public Long getCveIdPatronDictamen() {
        return cveIdPatronDictamen;
    }

    public void setCveIdPatronDictamen(Long cveIdPatronDictamen) {
        this.cveIdPatronDictamen = cveIdPatronDictamen;
    }

    public BigInteger getIndPatronObligado() {
        return indPatronObligado;
    }

    public void setIndPatronObligado(BigInteger indPatronObligado) {
        this.indPatronObligado = indPatronObligado;
    }

    public Date getFecPeriodoInicioDictaminaej() {
        return fecPeriodoInicioDictaminaej;
    }

    public void setFecPeriodoInicioDictaminaej(Date fecPeriodoInicioDictaminaej) {
        this.fecPeriodoInicioDictaminaej = fecPeriodoInicioDictaminaej;
    }

    public Date getFecPeriodoFinDictaminaejer() {
        return fecPeriodoFinDictaminaejer;
    }

    public void setFecPeriodoFinDictaminaejer(Date fecPeriodoFinDictaminaejer) {
        this.fecPeriodoFinDictaminaejer = fecPeriodoFinDictaminaejer;
    }

    public String getDesObservaciones() {
        return desObservaciones;
    }

    public void setDesObservaciones(String desObservaciones) {
        this.desObservaciones = desObservaciones;
    }

    public BigInteger getIndPatronSustituto() {
        return indPatronSustituto;
    }

    public void setIndPatronSustituto(BigInteger indPatronSustituto) {
        this.indPatronSustituto = indPatronSustituto;
    }

    public BigInteger getIndPatronSustituido() {
        return indPatronSustituido;
    }

    public void setIndPatronSustituido(BigInteger indPatronSustituido) {
        this.indPatronSustituido = indPatronSustituido;
    }

    public BigInteger getIndEmpresaValuada() {
        return indEmpresaValuada;
    }

    public void setIndEmpresaValuada(BigInteger indEmpresaValuada) {
        this.indEmpresaValuada = indEmpresaValuada;
    }

    public String getDesNumeroFolioDictamen() {
        return desNumeroFolioDictamen;
    }

    public void setDesNumeroFolioDictamen(String desNumeroFolioDictamen) {
        this.desNumeroFolioDictamen = desNumeroFolioDictamen;
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

    public Date getFecRegistroAutorizado() {
        return fecRegistroAutorizado;
    }

    public void setFecRegistroAutorizado(Date fecRegistroAutorizado) {
        this.fecRegistroAutorizado = fecRegistroAutorizado;
    }

    public NdcTipoConvenioCotizacionDO getCveIdTipoConvenioCot() {
        return cveIdTipoConvenioCot;
    }

    public void setCveIdTipoConvenioCot(NdcTipoConvenioCotizacionDO cveIdTipoConvenioCot) {
        this.cveIdTipoConvenioCot = cveIdTipoConvenioCot;
    }

    public NdcTipoAfiliacionDO getCveIdTipoAfiliacion() {
        return cveIdTipoAfiliacion;
    }

    public void setCveIdTipoAfiliacion(NdcTipoAfiliacionDO cveIdTipoAfiliacion) {
        this.cveIdTipoAfiliacion = cveIdTipoAfiliacion;
    }

    public List<NdtPatronAsociadoDO> getNdtPatronAsociadoList() {
        return ndtPatronAsociadoList;
    }

    public void setNdtPatronAsociadoList(List<NdtPatronAsociadoDO> ndtPatronAsociadoList) {
        this.ndtPatronAsociadoList = ndtPatronAsociadoList;
    }

    public List<NdtNotasDictamenDO> getNdtNotasDictamenList() {
        return ndtNotasDictamenList;
    }

    public void setNdtNotasDictamenList(List<NdtNotasDictamenDO> ndtNotasDictamenList) {
        this.ndtNotasDictamenList = ndtNotasDictamenList;
    }

    public List<NdtModeloOpinionDO> getNdtModeloOpinionList() {
        return ndtModeloOpinionList;
    }

    public void setNdtModeloOpinionList(List<NdtModeloOpinionDO> ndtModeloOpinionList) {
        this.ndtModeloOpinionList = ndtModeloOpinionList;
    }

    public List<NdtB1RespuestaAtestiguamienDO> getNdtB1RespuestaAtestiguamienList() {
        return ndtB1RespuestaAtestiguamienList;
    }

    public void setNdtB1RespuestaAtestiguamienList(List<NdtB1RespuestaAtestiguamienDO> ndtB1RespuestaAtestiguamienList) {
        this.ndtB1RespuestaAtestiguamienList = ndtB1RespuestaAtestiguamienList;
    }

    public List<NdtPatronDictamenCpaDO> getNdtPatronDictamenCpaList() {
        return ndtPatronDictamenCpaList;
    }

    public void setNdtPatronDictamenCpaList(List<NdtPatronDictamenCpaDO> ndtPatronDictamenCpaList) {
        this.ndtPatronDictamenCpaList = ndtPatronDictamenCpaList;
    }

    public List<NdtMedioContactoDO> getNdtMedioContactoList() {
        return ndtMedioContactoList;
    }

    public void setNdtMedioContactoList(List<NdtMedioContactoDO> ndtMedioContactoList) {
        this.ndtMedioContactoList = ndtMedioContactoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdPatronDictamen != null ? cveIdPatronDictamen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtPatronDictamenDO)) {
            return false;
        }
        NdtPatronDictamenDO other = (NdtPatronDictamenDO) object;
        if ((this.cveIdPatronDictamen == null && other.cveIdPatronDictamen != null) || (this.cveIdPatronDictamen != null && !this.cveIdPatronDictamen.equals(other.cveIdPatronDictamen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtPatronDictamen[ cveIdPatronDictamen=" + cveIdPatronDictamen + " ]";
    }
    
}
