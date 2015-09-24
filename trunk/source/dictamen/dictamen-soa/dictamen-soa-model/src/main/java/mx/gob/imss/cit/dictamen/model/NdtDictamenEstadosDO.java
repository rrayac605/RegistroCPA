/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;

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

/**
 *
 * @author ajfuentes
 */
@Entity
@Table(name = "NDT_DICTAMEN_ESTADOS")
@NamedQueries({
    @NamedQuery(name = "NdtDictamenEstadosDO.findAll", query = "SELECT n FROM NdtDictamenEstadosDO n"),
    @NamedQuery(name = "NdtDictamenEstadosDO.findByCveIdDictamenEstados", query = "SELECT n FROM NdtDictamenEstadosDO n WHERE n.cveIdDictamenEstados = :cveIdDictamenEstados"),
    @NamedQuery(name = "NdtDictamenEstadosDO.findByFecCambioEstado", query = "SELECT n FROM NdtDictamenEstadosDO n WHERE n.fecCambioEstado = :fecCambioEstado"),
    @NamedQuery(name = "NdtDictamenEstadosDO.findByFecRegistroAlta", query = "SELECT n FROM NdtDictamenEstadosDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtDictamenEstadosDO.findByFecRegistroBaja", query = "SELECT n FROM NdtDictamenEstadosDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtDictamenEstadosDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtDictamenEstadosDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdtDictamenEstadosDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_DICTAMEN_ESTADOS", nullable = false, precision = 22, scale = 0)
    private Long cveIdDictamenEstados;
    @Column(name = "FEC_CAMBIO_ESTADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecCambioEstado;
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
    @JoinColumn(name = "CVE_ID_ESTADO_DICTAMEN", referencedColumnName = "CVE_ID_ESTADO_DICTAMEN")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcEstadoDictamenDO cveIdEstadoDictamen;

    public NdtDictamenEstadosDO() {
    }

    public NdtDictamenEstadosDO(Long cveIdDictamenEstados) {
        this.cveIdDictamenEstados = cveIdDictamenEstados;
    }

    public Long getCveIdDictamenEstados() {
        return cveIdDictamenEstados;
    }

    public void setCveIdDictamenEstados(Long cveIdDictamenEstados) {
        this.cveIdDictamenEstados = cveIdDictamenEstados;
    }

    public Date getFecCambioEstado() {
        return fecCambioEstado;
    }

    public void setFecCambioEstado(Date fecCambioEstado) {
        this.fecCambioEstado = fecCambioEstado;
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

    public NdcEstadoDictamenDO getCveIdEstadoDictamen() {
        return cveIdEstadoDictamen;
    }

    public void setCveIdEstadoDictamen(NdcEstadoDictamenDO cveIdEstadoDictamen) {
        this.cveIdEstadoDictamen = cveIdEstadoDictamen;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdDictamenEstados != null ? cveIdDictamenEstados.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtDictamenEstadosDO)) {
            return false;
        }
        NdtDictamenEstadosDO other = (NdtDictamenEstadosDO) object;
        if ((this.cveIdDictamenEstados == null && other.cveIdDictamenEstados != null) || (this.cveIdDictamenEstados != null && !this.cveIdDictamenEstados.equals(other.cveIdDictamenEstados))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtDictamenEstadosDO[ cveIdDictamenEstados=" + cveIdDictamenEstados + " ]";
    }
    
}
