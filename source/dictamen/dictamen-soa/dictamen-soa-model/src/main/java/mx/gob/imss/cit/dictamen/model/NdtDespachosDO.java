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
@Table(name = "NDT_DESPACHOS")
@NamedQueries({
    @NamedQuery(name = "NdtDespachos.findAll", query = "SELECT n FROM NdtDespachosDO n"),
    @NamedQuery(name = "NdtDespachos.findByCveIdDespacho", query = "SELECT n FROM NdtDespachosDO n WHERE n.cveIdDespacho = :cveIdDespacho"),
    @NamedQuery(name = "NdtDespachos.findByCveIdUsuario", query = "SELECT n FROM NdtDespachosDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtDespachos.findByFecRegistroAlta", query = "SELECT n FROM NdtDespachosDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtDespachos.findByFecRegistroBaja", query = "SELECT n FROM NdtDespachosDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtDespachos.findByFecActualizado", query = "SELECT n FROM NdtDespachosDO n WHERE n.fecActualizado = :fecActualizado")})
public class NdtDespachosDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_DESPACHO", nullable = false, precision = 22, scale = 0)
    private Long cveIdDespacho;
    @Size(max = 18)
    @Column(name = "CVE_ID_USUARIO", length = 18)
    private String cveIdUsuario;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecActualizado;
    @OneToMany(mappedBy = "cveIdDespacho", fetch = FetchType.LAZY)
    private List<NdtR2DespachoDO> ndtR2DespachoList;

    public NdtDespachosDO() {
    }

    public NdtDespachosDO(Long cveIdDespacho) {
        this.cveIdDespacho = cveIdDespacho;
    }

    public Long getCveIdDespacho() {
        return cveIdDespacho;
    }

    public void setCveIdDespacho(Long cveIdDespacho) {
        this.cveIdDespacho = cveIdDespacho;
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

    public Date getFecActualizado() {
        return fecActualizado;
    }

    public void setFecActualizado(Date fecActualizado) {
        this.fecActualizado = fecActualizado;
    }

    public List<NdtR2DespachoDO> getNdtR2DespachoList() {
        return ndtR2DespachoList;
    }

    public void setNdtR2DespachoList(List<NdtR2DespachoDO> ndtR2DespachoList) {
        this.ndtR2DespachoList = ndtR2DespachoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdDespacho != null ? cveIdDespacho.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtDespachosDO)) {
            return false;
        }
        NdtDespachosDO other = (NdtDespachosDO) object;
        if ((this.cveIdDespacho == null && other.cveIdDespacho != null) || (this.cveIdDespacho != null && !this.cveIdDespacho.equals(other.cveIdDespacho))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtDespachos[ cveIdDespacho=" + cveIdDespacho + " ]";
    }
    
}
