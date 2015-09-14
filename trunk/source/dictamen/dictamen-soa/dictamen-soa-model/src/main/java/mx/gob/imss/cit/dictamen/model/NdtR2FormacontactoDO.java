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
import javax.validation.constraints.Size;

/**
 *
 * @author ajfuentes
 */
@Entity
@Table(name = "NDT_R2_FORMACONTACTO")
@NamedQueries({
    @NamedQuery(name = "NdtR2Formacontacto.findAll", query = "SELECT n FROM NdtR2FormacontactoDO n"),
    @NamedQuery(name = "NdtR2Formacontacto.findByCveIdR2Fcontacto", query = "SELECT n FROM NdtR2FormacontactoDO n WHERE n.cveIdR2Fcontacto = :cveIdR2Fcontacto"),
    @NamedQuery(name = "NdtR2Formacontacto.findByFecRegistroAlta", query = "SELECT n FROM NdtR2FormacontactoDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtR2Formacontacto.findByFecRegistroBaja", query = "SELECT n FROM NdtR2FormacontactoDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtR2Formacontacto.findByFecRegistroActualizado", query = "SELECT n FROM NdtR2FormacontactoDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado"),
    @NamedQuery(name = "NdtR2Formacontacto.findByCveIdUsuario", query = "SELECT n FROM NdtR2FormacontactoDO n WHERE n.cveIdUsuario = :cveIdUsuario")})
public class NdtR2FormacontactoDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_R2_FCONTACTO", nullable = false, precision = 22, scale = 0)
    private Long cveIdR2Fcontacto;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @Size(max = 18)
    @Column(name = "CVE_ID_USUARIO", length = 18)
    private String cveIdUsuario;
    @JoinColumn(name = "CVE_ID_R2_DESPACHO", referencedColumnName = "CVE_ID_R2_DESPACHO")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtR2DespachoDO cveIdR2Despacho;

    public NdtR2FormacontactoDO() {
    }

    public NdtR2FormacontactoDO(Long cveIdR2Fcontacto) {
        this.cveIdR2Fcontacto = cveIdR2Fcontacto;
    }

    public Long getCveIdR2Fcontacto() {
        return cveIdR2Fcontacto;
    }

    public void setCveIdR2Fcontacto(Long cveIdR2Fcontacto) {
        this.cveIdR2Fcontacto = cveIdR2Fcontacto;
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

    public NdtR2DespachoDO getCveIdR2Despacho() {
        return cveIdR2Despacho;
    }

    public void setCveIdR2Despacho(NdtR2DespachoDO cveIdR2Despacho) {
        this.cveIdR2Despacho = cveIdR2Despacho;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdR2Fcontacto != null ? cveIdR2Fcontacto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtR2FormacontactoDO)) {
            return false;
        }
        NdtR2FormacontactoDO other = (NdtR2FormacontactoDO) object;
        if ((this.cveIdR2Fcontacto == null && other.cveIdR2Fcontacto != null) || (this.cveIdR2Fcontacto != null && !this.cveIdR2Fcontacto.equals(other.cveIdR2Fcontacto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtR2Formacontacto[ cveIdR2Fcontacto=" + cveIdR2Fcontacto + " ]";
    }
    
}
