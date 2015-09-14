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
@Table(name = "NDT_R1_FORMACONTACTO")
@NamedQueries({
    @NamedQuery(name = "NdtR1Formacontacto.findAll", query = "SELECT n FROM NdtR1FormacontactoDO n"),
    @NamedQuery(name = "NdtR1Formacontacto.findByCveIdR1Formacontacto", query = "SELECT n FROM NdtR1FormacontactoDO n WHERE n.cveIdR1Formacontacto = :cveIdR1Formacontacto"),
    @NamedQuery(name = "NdtR1Formacontacto.findByFecRegistroAlta", query = "SELECT n FROM NdtR1FormacontactoDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtR1Formacontacto.findByFecRegistroBaja", query = "SELECT n FROM NdtR1FormacontactoDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtR1Formacontacto.findByFecRegistroActualizado", query = "SELECT n FROM NdtR1FormacontactoDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado"),
    @NamedQuery(name = "NdtR1Formacontacto.findByCveIdUsuario", query = "SELECT n FROM NdtR1FormacontactoDO n WHERE n.cveIdUsuario = :cveIdUsuario")})
public class NdtR1FormacontactoDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_R1_FORMACONTACTO", nullable = false, precision = 22, scale = 0)
    private Long cveIdR1Formacontacto;
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
    @JoinColumn(name = "CVE_ID_R1_DATOS_PERSONALES", referencedColumnName = "CVE_ID_R1_DATOS_PERSONALES")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtR1DatosPersonalesDO cveIdR1DatosPersonales;

    public NdtR1FormacontactoDO() {
    }

    public NdtR1FormacontactoDO(Long cveIdR1Formacontacto) {
        this.cveIdR1Formacontacto = cveIdR1Formacontacto;
    }

    public Long getCveIdR1Formacontacto() {
        return cveIdR1Formacontacto;
    }

    public void setCveIdR1Formacontacto(Long cveIdR1Formacontacto) {
        this.cveIdR1Formacontacto = cveIdR1Formacontacto;
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

    public NdtR1DatosPersonalesDO getCveIdR1DatosPersonales() {
        return cveIdR1DatosPersonales;
    }

    public void setCveIdR1DatosPersonales(NdtR1DatosPersonalesDO cveIdR1DatosPersonales) {
        this.cveIdR1DatosPersonales = cveIdR1DatosPersonales;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdR1Formacontacto != null ? cveIdR1Formacontacto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtR1FormacontactoDO)) {
            return false;
        }
        NdtR1FormacontactoDO other = (NdtR1FormacontactoDO) object;
        if ((this.cveIdR1Formacontacto == null && other.cveIdR1Formacontacto != null) || (this.cveIdR1Formacontacto != null && !this.cveIdR1Formacontacto.equals(other.cveIdR1Formacontacto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtR1Formacontacto[ cveIdR1Formacontacto=" + cveIdR1Formacontacto + " ]";
    }
    
}
