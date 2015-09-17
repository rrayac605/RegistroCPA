/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "NDT_R3_COLEGIO")
@NamedQueries({
    @NamedQuery(name = "NdtR3ColegioDO.findAll", query = "SELECT n FROM NdtR3ColegioDO n"),
    @NamedQuery(name = "NdtR3ColegioDO.findByCveIdR3ColegioXcontador", query = "SELECT n FROM NdtR3ColegioDO n WHERE n.cveIdR3ColegioXcontador = :cveIdR3ColegioXcontador"),
    @NamedQuery(name = "NdtR3ColegioDO.findByCveIdUsuario", query = "SELECT n FROM NdtR3ColegioDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtR3ColegioDO.findByUrlAcuseNotaria", query = "SELECT n FROM NdtR3ColegioDO n WHERE n.urlAcuseNotaria = :urlAcuseNotaria"),
    @NamedQuery(name = "NdtR3ColegioDO.findByNumTramiteNotaria", query = "SELECT n FROM NdtR3ColegioDO n WHERE n.numTramiteNotaria = :numTramiteNotaria"),
    @NamedQuery(name = "NdtR3ColegioDO.findByFecRegistroAlta", query = "SELECT n FROM NdtR3ColegioDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtR3ColegioDO.findByFecRegistroBaja", query = "SELECT n FROM NdtR3ColegioDO n WHERE n.fecRegistroBaja = :fecRegistroBaja")})
public class NdtR3ColegioDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_R3_COLEGIO_XCONTADOR_", nullable = false, precision = 22, scale = 0)
    private BigDecimal cveIdR3ColegioXcontador;
    @Size(max = 18)
    @Column(name = "CVE_ID_USUARIO", length = 18)
    private String cveIdUsuario;
    @Size(max = 300)
    @Column(name = "URL_ACUSE_NOTARIA", length = 300)
    private String urlAcuseNotaria;
    @Size(max = 70)
    @Column(name = "NUM_TRAMITE_NOTARIA", length = 70)
    private String numTramiteNotaria;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @JoinColumn(name = "CVE_ID_CPA_TRAMITE", referencedColumnName = "CVE_ID_CPA_TRAMITE")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtCpaTramiteDO cveIdCpaTramite;
    @JoinColumn(name = "CVE_ID_CPA", referencedColumnName = "CVE_ID_CPA", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private NdtContadorPublicoAutDO cveIdCpa;
    @JoinColumn(name = "CVE_ID_COLEGIO", referencedColumnName = "CVE_ID_COLEGIO")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtColegioDO cveIdColegio;

    public NdtR3ColegioDO() {
    }

    public NdtR3ColegioDO(BigDecimal cveIdR3ColegioXcontador) {
        this.cveIdR3ColegioXcontador = cveIdR3ColegioXcontador;
    }

    public BigDecimal getCveIdR3ColegioXcontador() {
        return cveIdR3ColegioXcontador;
    }

    public void setCveIdR3ColegioXcontador(BigDecimal cveIdR3ColegioXcontador) {
        this.cveIdR3ColegioXcontador = cveIdR3ColegioXcontador;
    }

    public String getCveIdUsuario() {
        return cveIdUsuario;
    }

    public void setCveIdUsuario(String cveIdUsuario) {
        this.cveIdUsuario = cveIdUsuario;
    }

    public String getUrlAcuseNotaria() {
        return urlAcuseNotaria;
    }

    public void setUrlAcuseNotaria(String urlAcuseNotaria) {
        this.urlAcuseNotaria = urlAcuseNotaria;
    }

    public String getNumTramiteNotaria() {
        return numTramiteNotaria;
    }

    public void setNumTramiteNotaria(String numTramiteNotaria) {
        this.numTramiteNotaria = numTramiteNotaria;
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

    public NdtCpaTramiteDO getCveIdCpaTramite() {
        return cveIdCpaTramite;
    }

    public void setCveIdCpaTramite(NdtCpaTramiteDO cveIdCpaTramite) {
        this.cveIdCpaTramite = cveIdCpaTramite;
    }

    public NdtContadorPublicoAutDO getCveIdCpa() {
        return cveIdCpa;
    }

    public void setCveIdCpa(NdtContadorPublicoAutDO cveIdCpa) {
        this.cveIdCpa = cveIdCpa;
    }

    public NdtColegioDO getCveIdColegio() {
        return cveIdColegio;
    }

    public void setCveIdColegio(NdtColegioDO cveIdColegio) {
        this.cveIdColegio = cveIdColegio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdR3ColegioXcontador != null ? cveIdR3ColegioXcontador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtR3ColegioDO)) {
            return false;
        }
        NdtR3ColegioDO other = (NdtR3ColegioDO) object;
        if ((this.cveIdR3ColegioXcontador == null && other.cveIdR3ColegioXcontador != null) || (this.cveIdR3ColegioXcontador != null && !this.cveIdR3ColegioXcontador.equals(other.cveIdR3ColegioXcontador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtR3ColegioDO[ cveIdR3ColegioXcontador=" + cveIdR3ColegioXcontador + " ]";
    }
    
}
