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
@Table(name = "NDC_REMUNERACIONES")
@NamedQueries({
    @NamedQuery(name = "NdcRemuneracionesDO.findAll", query = "SELECT n FROM NdcRemuneracionesDO n"),
    @NamedQuery(name = "NdcRemuneracionesDO.findByCveIdRemuneraciones", query = "SELECT n FROM NdcRemuneracionesDO n WHERE n.cveIdRemuneraciones = :cveIdRemuneraciones"),
    @NamedQuery(name = "NdcRemuneracionesDO.findByDesRemuneraciones", query = "SELECT n FROM NdcRemuneracionesDO n WHERE n.desRemuneraciones = :desRemuneraciones"),
    @NamedQuery(name = "NdcRemuneracionesDO.findByIndOrden", query = "SELECT n FROM NdcRemuneracionesDO n WHERE n.indOrden = :indOrden"),
    @NamedQuery(name = "NdcRemuneracionesDO.findByFecRegistroAlta", query = "SELECT n FROM NdcRemuneracionesDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdcRemuneracionesDO.findByFecRegistroBaja", query = "SELECT n FROM NdcRemuneracionesDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdcRemuneracionesDO.findByFecRegistroActualizado", query = "SELECT n FROM NdcRemuneracionesDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado"),
    @NamedQuery(name = "NdcRemuneracionesDO.findByCveIdUsuario", query = "SELECT n FROM NdcRemuneracionesDO n WHERE n.cveIdUsuario = :cveIdUsuario")})
public class NdcRemuneracionesDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_REMUNERACIONES", nullable = false, precision = 22, scale = 0)
    private Long cveIdRemuneraciones;
    @Size(max = 200)
    @Column(name = "DES_REMUNERACIONES", length = 200)
    private String desRemuneraciones;
    @Column(name = "IND_ORDEN")
    private Integer indOrden;
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
    @OneToMany(mappedBy = "cveIdRemuneraciones", fetch = FetchType.LAZY)
    private List<NdtB1CedulaRemuneracionesDO> ndtB1CedulaRemuneracionesDOList;

    public NdcRemuneracionesDO() {
    }

    public NdcRemuneracionesDO(Long cveIdRemuneraciones) {
        this.cveIdRemuneraciones = cveIdRemuneraciones;
    }

    public Long getCveIdRemuneraciones() {
        return cveIdRemuneraciones;
    }

    public void setCveIdRemuneraciones(Long cveIdRemuneraciones) {
        this.cveIdRemuneraciones = cveIdRemuneraciones;
    }

    public String getDesRemuneraciones() {
        return desRemuneraciones;
    }

    public void setDesRemuneraciones(String desRemuneraciones) {
        this.desRemuneraciones = desRemuneraciones;
    }

    public Integer getIndOrden() {
        return indOrden;
    }

    public void setIndOrden(Integer indOrden) {
        this.indOrden = indOrden;
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

    public List<NdtB1CedulaRemuneracionesDO> getNdtB1CedulaRemuneracionesDOList() {
        return ndtB1CedulaRemuneracionesDOList;
    }

    public void setNdtB1CedulaRemuneracionesDOList(List<NdtB1CedulaRemuneracionesDO> ndtB1CedulaRemuneracionesDOList) {
        this.ndtB1CedulaRemuneracionesDOList = ndtB1CedulaRemuneracionesDOList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdRemuneraciones != null ? cveIdRemuneraciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdcRemuneracionesDO)) {
            return false;
        }
        NdcRemuneracionesDO other = (NdcRemuneracionesDO) object;
        if ((this.cveIdRemuneraciones == null && other.cveIdRemuneraciones != null) || (this.cveIdRemuneraciones != null && !this.cveIdRemuneraciones.equals(other.cveIdRemuneraciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdcRemuneracionesDO[ cveIdRemuneraciones=" + cveIdRemuneraciones + " ]";
    }
    
}
