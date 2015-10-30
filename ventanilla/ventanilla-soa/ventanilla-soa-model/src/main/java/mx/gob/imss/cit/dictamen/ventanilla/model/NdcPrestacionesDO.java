/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.ventanilla.model;

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
@Table(name = "NDC_PRESTACIONES")
@NamedQueries({
    @NamedQuery(name = "NdcPrestacionesDO.findAll", query = "SELECT n FROM NdcPrestacionesDO n"),
    @NamedQuery(name = "NdcPrestacionesDO.findByCveIdPrestaciones", query = "SELECT n FROM NdcPrestacionesDO n WHERE n.cveIdPrestaciones = :cveIdPrestaciones"),
    @NamedQuery(name = "NdcPrestacionesDO.findByDesPrestaciones", query = "SELECT n FROM NdcPrestacionesDO n WHERE n.desPrestaciones = :desPrestaciones"),
    @NamedQuery(name = "NdcPrestacionesDO.findByFecRegistroAlta", query = "SELECT n FROM NdcPrestacionesDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdcPrestacionesDO.findByFecRegistroBaja", query = "SELECT n FROM NdcPrestacionesDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdcPrestacionesDO.findByFecRegistroActualizado", query = "SELECT n FROM NdcPrestacionesDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdcPrestacionesDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_PRESTACIONES", nullable = false, precision = 22, scale = 0)
    private Long cveIdPrestaciones;
    @Size(max = 200)
    @Column(name = "DES_PRESTACIONES", length = 200)
    private String desPrestaciones;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @OneToMany(mappedBy = "cveIdPrestaciones", fetch = FetchType.LAZY)
    private List<NdtB2CedulaPrestacionesDO> ndtB2CedulaPrestacionesDOList;

    public NdcPrestacionesDO() {
    }

    public NdcPrestacionesDO(Long cveIdPrestaciones) {
        this.cveIdPrestaciones = cveIdPrestaciones;
    }

    public Long getCveIdPrestaciones() {
        return cveIdPrestaciones;
    }

    public void setCveIdPrestaciones(Long cveIdPrestaciones) {
        this.cveIdPrestaciones = cveIdPrestaciones;
    }

    public String getDesPrestaciones() {
        return desPrestaciones;
    }

    public void setDesPrestaciones(String desPrestaciones) {
        this.desPrestaciones = desPrestaciones;
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

    public List<NdtB2CedulaPrestacionesDO> getNdtB2CedulaPrestacionesDOList() {
        return ndtB2CedulaPrestacionesDOList;
    }

    public void setNdtB2CedulaPrestacionesDOList(List<NdtB2CedulaPrestacionesDO> ndtB2CedulaPrestacionesDOList) {
        this.ndtB2CedulaPrestacionesDOList = ndtB2CedulaPrestacionesDOList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdPrestaciones != null ? cveIdPrestaciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdcPrestacionesDO)) {
            return false;
        }
        NdcPrestacionesDO other = (NdcPrestacionesDO) object;
        if ((this.cveIdPrestaciones == null && other.cveIdPrestaciones != null) || (this.cveIdPrestaciones != null && !this.cveIdPrestaciones.equals(other.cveIdPrestaciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdcPrestacionesDO[ cveIdPrestaciones=" + cveIdPrestaciones + " ]";
    }
    
}
