/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;

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
@Table(name = "NDC_ATESTIGUAMIENTO")
@NamedQueries({
    @NamedQuery(name = "NdcAtestiguamientoDO.findAll", query = "SELECT n FROM NdcAtestiguamientoDO n"),
    @NamedQuery(name = "NdcAtestiguamientoDO.findByCveIdAtestiguamiento", query = "SELECT n FROM NdcAtestiguamientoDO n WHERE n.cveIdAtestiguamiento = :cveIdAtestiguamiento"),
    @NamedQuery(name = "NdcAtestiguamientoDO.findByDesAtestiguamiento", query = "SELECT n FROM NdcAtestiguamientoDO n WHERE n.desAtestiguamiento = :desAtestiguamiento"),
    @NamedQuery(name = "NdcAtestiguamientoDO.findByFecRegistroAlta", query = "SELECT n FROM NdcAtestiguamientoDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdcAtestiguamientoDO.findByFecRegistroActualizado", query = "SELECT n FROM NdcAtestiguamientoDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado"),
    @NamedQuery(name = "NdcAtestiguamientoDO.findByFecRegistroBaja", query = "SELECT n FROM NdcAtestiguamientoDO n WHERE n.fecRegistroBaja = :fecRegistroBaja")})
public class NdcAtestiguamientoDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_ATESTIGUAMIENTO", nullable = false, precision = 22, scale = 0)
    private Long cveIdAtestiguamiento;
    @Size(max = 100)
    @Column(name = "DES_ATESTIGUAMIENTO", length = 100)
    private String desAtestiguamiento;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @OneToMany(mappedBy = "cveIdAtestiguamiento", fetch = FetchType.LAZY)
    private List<NdtAtestiguamientoDictamenDO> ndtAtestiguamientoDictamenDOList;
    @OneToMany(mappedBy = "cveIdAtestiguamiento", fetch = FetchType.EAGER)
    private List<NdcRubroDO> ndcRubroDOList;
    @OneToMany(mappedBy = "cveIdAtestiguamiento", fetch = FetchType.LAZY)
    private List<NdtB1CedulaRemuneracionesDO> ndtB1CedulaRemuneracionesDOList;
    @OneToMany(mappedBy = "cveIdAtestiguamiento", fetch = FetchType.LAZY)
    private List<NdtB2CedulaPrestacionesDO> ndtB2CedulaPrestacionesDOList;
    @JoinColumn(name = "CVE_ID_ASEVERACION", referencedColumnName = "CVE_ID_ASEVERACION")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcAseveracionesDO cveIdAseveracion;

    public NdcAtestiguamientoDO() {
    }

    public NdcAtestiguamientoDO(Long cveIdAtestiguamiento) {
        this.cveIdAtestiguamiento = cveIdAtestiguamiento;
    }

    public Long getCveIdAtestiguamiento() {
        return cveIdAtestiguamiento;
    }

    public void setCveIdAtestiguamiento(Long cveIdAtestiguamiento) {
        this.cveIdAtestiguamiento = cveIdAtestiguamiento;
    }

    public String getDesAtestiguamiento() {
        return desAtestiguamiento;
    }

    public void setDesAtestiguamiento(String desAtestiguamiento) {
        this.desAtestiguamiento = desAtestiguamiento;
    }

    public Date getFecRegistroAlta() {
        return fecRegistroAlta;
    }

    public void setFecRegistroAlta(Date fecRegistroAlta) {
        this.fecRegistroAlta = fecRegistroAlta;
    }

    public Date getFecRegistroActualizado() {
        return fecRegistroActualizado;
    }

    public void setFecRegistroActualizado(Date fecRegistroActualizado) {
        this.fecRegistroActualizado = fecRegistroActualizado;
    }

    public Date getFecRegistroBaja() {
        return fecRegistroBaja;
    }

    public void setFecRegistroBaja(Date fecRegistroBaja) {
        this.fecRegistroBaja = fecRegistroBaja;
    }

    public List<NdtAtestiguamientoDictamenDO> getNdtAtestiguamientoDictamenDOList() {
        return ndtAtestiguamientoDictamenDOList;
    }

    public void setNdtAtestiguamientoDictamenDOList(List<NdtAtestiguamientoDictamenDO> ndtAtestiguamientoDictamenDOList) {
        this.ndtAtestiguamientoDictamenDOList = ndtAtestiguamientoDictamenDOList;
    }

    public List<NdcRubroDO> getNdcRubroDOList() {
        return ndcRubroDOList;
    }

    public void setNdcRubroDOList(List<NdcRubroDO> ndcRubroDOList) {
        this.ndcRubroDOList = ndcRubroDOList;
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

    public NdcAseveracionesDO getCveIdAseveracion() {
        return cveIdAseveracion;
    }

    public void setCveIdAseveracion(NdcAseveracionesDO cveIdAseveracion) {
        this.cveIdAseveracion = cveIdAseveracion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdAtestiguamiento != null ? cveIdAtestiguamiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdcAtestiguamientoDO)) {
            return false;
        }
        NdcAtestiguamientoDO other = (NdcAtestiguamientoDO) object;
        if ((this.cveIdAtestiguamiento == null && other.cveIdAtestiguamiento != null) || (this.cveIdAtestiguamiento != null && !this.cveIdAtestiguamiento.equals(other.cveIdAtestiguamiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdcAtestiguamientoDO[ cveIdAtestiguamiento=" + cveIdAtestiguamiento + " ]";
    }
    
}
