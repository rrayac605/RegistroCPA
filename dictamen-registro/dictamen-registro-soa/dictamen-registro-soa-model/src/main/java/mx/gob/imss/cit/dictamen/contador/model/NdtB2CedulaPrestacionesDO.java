/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.contador.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
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
@Table(name = "NDT_B2_CEDULA_PRESTACIONES")
@NamedQueries({
    @NamedQuery(name = "NdtB2CedulaPrestacionesDO.findAll", query = "SELECT n FROM NdtB2CedulaPrestacionesDO n"),
    @NamedQuery(name = "NdtB2CedulaPrestacionesDO.findByCveIdCedulaPrestaciones", query = "SELECT n FROM NdtB2CedulaPrestacionesDO n WHERE n.cveIdCedulaPrestaciones = :cveIdCedulaPrestaciones"),
    @NamedQuery(name = "NdtB2CedulaPrestacionesDO.findByImpImportePrestacion", query = "SELECT n FROM NdtB2CedulaPrestacionesDO n WHERE n.impImportePrestacion = :impImportePrestacion"),
    @NamedQuery(name = "NdtB2CedulaPrestacionesDO.findByFecRegistroAlta", query = "SELECT n FROM NdtB2CedulaPrestacionesDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtB2CedulaPrestacionesDO.findByFecRegistroBaja", query = "SELECT n FROM NdtB2CedulaPrestacionesDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtB2CedulaPrestacionesDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtB2CedulaPrestacionesDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado"),
    @NamedQuery(name = "NdtB2CedulaPrestacionesDO.findByCveIdUsuario", query = "SELECT n FROM NdtB2CedulaPrestacionesDO n WHERE n.cveIdUsuario = :cveIdUsuario")})
public class NdtB2CedulaPrestacionesDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_CEDULA_PRESTACIONES", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator(name = "NdtB2CedulaPrestaciones_Id_Seq_Gen", sequenceName = "SEQ_NDTB2CEDULAPRESTACIONES", allocationSize=1)
    @GeneratedValue(generator = "NdtB2CedulaPrestaciones_Id_Seq_Gen")
    private Long cveIdCedulaPrestaciones;
    @Size(max = 18)
    @Column(name = "IMP_IMPORTE_PRESTACION", length = 18)
    private String impImportePrestacion;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @Size(max = 20)
    @Column(name = "CVE_ID_USUARIO", length = 20)
    private String cveIdUsuario;
    @JoinColumn(name = "CVE_ID_PATRON_DICTAMEN", referencedColumnName = "CVE_ID_PATRON_DICTAMEN")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtPatronDictamenDO cveIdPatronDictamen;
    @JoinColumn(name = "CVE_ID_PRESTACIONES", referencedColumnName = "CVE_ID_PRESTACIONES")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcPrestacionesDO cveIdPrestaciones;
    @JoinColumn(name = "CVE_ID_ESTADO_ATESTIGUAMIENTO", referencedColumnName = "CVE_ID_ESTADO_ATESTIGUAMIENTO")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcEstadoAtestiguamientoDO cveIdEstadoAtestiguamiento;
    @JoinColumn(name = "CVE_ID_ATESTIGUAMIENTO", referencedColumnName = "CVE_ID_ATESTIGUAMIENTO")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcAtestiguamientoDO cveIdAtestiguamiento;

    public NdtB2CedulaPrestacionesDO() {
    }

    public NdtB2CedulaPrestacionesDO(Long cveIdCedulaPrestaciones) {
        this.cveIdCedulaPrestaciones = cveIdCedulaPrestaciones;
    }

    public Long getCveIdCedulaPrestaciones() {
        return cveIdCedulaPrestaciones;
    }

    public void setCveIdCedulaPrestaciones(Long cveIdCedulaPrestaciones) {
        this.cveIdCedulaPrestaciones = cveIdCedulaPrestaciones;
    }

    public String getImpImportePrestacion() {
        return impImportePrestacion;
    }

    public void setImpImportePrestacion(String impImportePrestacion) {
        this.impImportePrestacion = impImportePrestacion;
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

    public String getCveIdUsuario() {
        return cveIdUsuario;
    }

    public void setCveIdUsuario(String cveIdUsuario) {
        this.cveIdUsuario = cveIdUsuario;
    }

    public NdtPatronDictamenDO getCveIdPatronDictamen() {
        return cveIdPatronDictamen;
    }

    public void setCveIdPatronDictamen(NdtPatronDictamenDO cveIdPatronDictamen) {
        this.cveIdPatronDictamen = cveIdPatronDictamen;
    }

    public NdcPrestacionesDO getCveIdPrestaciones() {
        return cveIdPrestaciones;
    }

    public void setCveIdPrestaciones(NdcPrestacionesDO cveIdPrestaciones) {
        this.cveIdPrestaciones = cveIdPrestaciones;
    }

    public NdcEstadoAtestiguamientoDO getCveIdEstadoAtestiguamiento() {
        return cveIdEstadoAtestiguamiento;
    }

    public void setCveIdEstadoAtestiguamiento(NdcEstadoAtestiguamientoDO cveIdEstadoAtestiguamiento) {
        this.cveIdEstadoAtestiguamiento = cveIdEstadoAtestiguamiento;
    }

    public NdcAtestiguamientoDO getCveIdAtestiguamiento() {
        return cveIdAtestiguamiento;
    }

    public void setCveIdAtestiguamiento(NdcAtestiguamientoDO cveIdAtestiguamiento) {
        this.cveIdAtestiguamiento = cveIdAtestiguamiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdCedulaPrestaciones != null ? cveIdCedulaPrestaciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtB2CedulaPrestacionesDO)) {
            return false;
        }
        NdtB2CedulaPrestacionesDO other = (NdtB2CedulaPrestacionesDO) object;
        if ((this.cveIdCedulaPrestaciones == null && other.cveIdCedulaPrestaciones != null) || (this.cveIdCedulaPrestaciones != null && !this.cveIdCedulaPrestaciones.equals(other.cveIdCedulaPrestaciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtB2CedulaPrestacionesDO[ cveIdCedulaPrestaciones=" + cveIdCedulaPrestaciones + " ]";
    }
    
}
