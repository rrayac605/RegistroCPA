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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "NDT_COLEGIO")
@NamedQueries({
    @NamedQuery(name = "NdtColegioDO.findAll", query = "SELECT n FROM NdtColegioDO n"),
    @NamedQuery(name = "NdtColegioDO.findByCveIdColegio", query = "SELECT n FROM NdtColegioDO n WHERE n.cveIdColegio = :cveIdColegio"),
    @NamedQuery(name = "NdtColegioDO.findByCveIdUsuario", query = "SELECT n FROM NdtColegioDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtColegioDO.findByFecRegistroAlta", query = "SELECT n FROM NdtColegioDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtColegioDO.findByFecRegistroBaja", query = "SELECT n FROM NdtColegioDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtColegioDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtColegioDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdtColegioDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_COLEGIO", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator( allocationSize=1,name = "NdtColegio_Id_Seq_Gen", sequenceName = "SEQ_NDTCOLEGIO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NdtColegio_Id_Seq_Gen")
    private Long cveIdColegio;
    @Size(max = 18)
    @Column(name = "CVE_ID_USUARIO", length = 18)
    private String cveIdUsuario;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @OneToMany(mappedBy = "cveIdColegio", fetch = FetchType.LAZY)
    private List<NdtCpaAcreditacionDO> ndtCpaAcreditacionDOList;
    @OneToMany(mappedBy = "cveIdColegio", fetch = FetchType.LAZY)
    private List<NdtR3ColegioDO> ndtR3ColegioDOList;

    public NdtColegioDO() {
    }

    public NdtColegioDO(Long cveIdColegio) {
        this.cveIdColegio = cveIdColegio;
    }

    public Long getCveIdColegio() {
        return cveIdColegio;
    }

    public void setCveIdColegio(Long cveIdColegio) {
        this.cveIdColegio = cveIdColegio;
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

    public Date getFecRegistroActualizado() {
        return fecRegistroActualizado;
    }

    public void setFecRegistroActualizado(Date fecRegistroActualizado) {
        this.fecRegistroActualizado = fecRegistroActualizado;
    }

    public List<NdtCpaAcreditacionDO> getNdtCpaAcreditacionDOList() {
        return ndtCpaAcreditacionDOList;
    }

    public void setNdtCpaAcreditacionDOList(List<NdtCpaAcreditacionDO> ndtCpaAcreditacionDOList) {
        this.ndtCpaAcreditacionDOList = ndtCpaAcreditacionDOList;
    }

    public List<NdtR3ColegioDO> getNdtR3ColegioDOList() {
        return ndtR3ColegioDOList;
    }

    public void setNdtR3ColegioDOList(List<NdtR3ColegioDO> ndtR3ColegioDOList) {
        this.ndtR3ColegioDOList = ndtR3ColegioDOList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdColegio != null ? cveIdColegio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtColegioDO)) {
            return false;
        }
        NdtColegioDO other = (NdtColegioDO) object;
        if ((this.cveIdColegio == null && other.cveIdColegio != null) || (this.cveIdColegio != null && !this.cveIdColegio.equals(other.cveIdColegio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtColegioDO[ cveIdColegio=" + cveIdColegio + " ]";
    }
    
}
