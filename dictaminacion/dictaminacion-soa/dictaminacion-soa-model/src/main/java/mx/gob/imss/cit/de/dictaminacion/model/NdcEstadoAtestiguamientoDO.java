/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.de.dictaminacion.model;

import java.io.Serializable;

import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "NDC_ESTADO_ATESTIGUAMIENTO")
@NamedQueries({
    @NamedQuery(name = "NdcEstadoAtestiguamientoDO.findAll", query = "SELECT n FROM NdcEstadoAtestiguamientoDO n"),
    @NamedQuery(name = "NdcEstadoAtestiguamientoDO.findByCveIdEstadoAtestiguamiento", query = "SELECT n FROM NdcEstadoAtestiguamientoDO n WHERE n.cveIdEstadoAtestiguamiento = :cveIdEstadoAtestiguamiento"),
    @NamedQuery(name = "NdcEstadoAtestiguamientoDO.findByDesEstadoAtestiguamiento", query = "SELECT n FROM NdcEstadoAtestiguamientoDO n WHERE n.desEstadoAtestiguamiento = :desEstadoAtestiguamiento"),
    @NamedQuery(name = "NdcEstadoAtestiguamientoDO.findByFecRegistroAlta", query = "SELECT n FROM NdcEstadoAtestiguamientoDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdcEstadoAtestiguamientoDO.findByFecRegistroBaja", query = "SELECT n FROM NdcEstadoAtestiguamientoDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdcEstadoAtestiguamientoDO.findByFecRegistroActualizado", query = "SELECT n FROM NdcEstadoAtestiguamientoDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdcEstadoAtestiguamientoDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_ESTADO_ATESTIGUAMIENTO", nullable = false, precision = 22, scale = 0)
    private Long cveIdEstadoAtestiguamiento;
    @Size(max = 50)
    @Column(name = "DES_ESTADO_ATESTIGUAMIENTO", length = 50)
    private String desEstadoAtestiguamiento;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @OneToMany(mappedBy = "cveIdEstadoAtestiguamiento", fetch = FetchType.LAZY)
    private List<NdtAtestiguamientoDictamenDO> ndtAtestiguamientoDictamenDOList;
    @OneToMany(mappedBy = "cveIdEstadoAtestiguamiento", fetch = FetchType.LAZY)
    private List<NdtB1CedulaRemuneracionesDO> ndtB1CedulaRemuneracionesDOList;
    @OneToMany(mappedBy = "cveIdEstadoAtestiguamiento", fetch = FetchType.LAZY)
    private List<NdtB2CedulaPrestacionesDO> ndtB2CedulaPrestacionesDOList;

    public NdcEstadoAtestiguamientoDO() {
    }

    public NdcEstadoAtestiguamientoDO(Long cveIdEstadoAtestiguamiento) {
        this.cveIdEstadoAtestiguamiento = cveIdEstadoAtestiguamiento;
    }

    public Long getCveIdEstadoAtestiguamiento() {
        return cveIdEstadoAtestiguamiento;
    }

    public void setCveIdEstadoAtestiguamiento(Long cveIdEstadoAtestiguamiento) {
        this.cveIdEstadoAtestiguamiento = cveIdEstadoAtestiguamiento;
    }

    public String getDesEstadoAtestiguamiento() {
        return desEstadoAtestiguamiento;
    }

    public void setDesEstadoAtestiguamiento(String desEstadoAtestiguamiento) {
        this.desEstadoAtestiguamiento = desEstadoAtestiguamiento;
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

    public List<NdtAtestiguamientoDictamenDO> getNdtAtestiguamientoDictamenDOList() {
        return ndtAtestiguamientoDictamenDOList;
    }

    public void setNdtAtestiguamientoDictamenDOList(List<NdtAtestiguamientoDictamenDO> ndtAtestiguamientoDictamenDOList) {
        this.ndtAtestiguamientoDictamenDOList = ndtAtestiguamientoDictamenDOList;
    }

    public List<NdtB1CedulaRemuneracionesDO> getNdtB1CedulaRemuneracionesDOList() {
        return ndtB1CedulaRemuneracionesDOList;
    }

    public void setNdtB1CedulaRemuneracionesDOList(List<NdtB1CedulaRemuneracionesDO> ndtB1CedulaRemuneracionesDOList) {
        this.ndtB1CedulaRemuneracionesDOList = ndtB1CedulaRemuneracionesDOList;
    }

    public List<NdtB2CedulaPrestacionesDO> getNdtB2CedulaPrestacionesDOList() {
        return ndtB2CedulaPrestacionesDOList;
    }

    public void setNdtB2CedulaPrestacionesDOList(List<NdtB2CedulaPrestacionesDO> ndtB2CedulaPrestacionesDOList) {
        this.ndtB2CedulaPrestacionesDOList = ndtB2CedulaPrestacionesDOList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdEstadoAtestiguamiento != null ? cveIdEstadoAtestiguamiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdcEstadoAtestiguamientoDO)) {
            return false;
        }
        NdcEstadoAtestiguamientoDO other = (NdcEstadoAtestiguamientoDO) object;
        if ((this.cveIdEstadoAtestiguamiento == null && other.cveIdEstadoAtestiguamiento != null) || (this.cveIdEstadoAtestiguamiento != null && !this.cveIdEstadoAtestiguamiento.equals(other.cveIdEstadoAtestiguamiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdcEstadoAtestiguamientoDO[ cveIdEstadoAtestiguamiento=" + cveIdEstadoAtestiguamiento + " ]";
    }
    
}
