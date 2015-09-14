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
@Table(name = "NDT_A7_5_CE_PERSONAL")
@NamedQueries({
    @NamedQuery(name = "NdtA75CePersonal.findAll", query = "SELECT n FROM NdtA75CePersonalDO n"),
    @NamedQuery(name = "NdtA75CePersonal.findByCveIdA75CePersonal", query = "SELECT n FROM NdtA75CePersonalDO n WHERE n.cveIdA75CePersonal = :cveIdA75CePersonal"),
    @NamedQuery(name = "NdtA75CePersonal.findByRegPatronal", query = "SELECT n FROM NdtA75CePersonalDO n WHERE n.regPatronal = :regPatronal"),
    @NamedQuery(name = "NdtA75CePersonal.findByNumTrabajadores", query = "SELECT n FROM NdtA75CePersonalDO n WHERE n.numTrabajadores = :numTrabajadores"),
    @NamedQuery(name = "NdtA75CePersonal.findByCveIdUsuario", query = "SELECT n FROM NdtA75CePersonalDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtA75CePersonal.findByFecRegistroAlta", query = "SELECT n FROM NdtA75CePersonalDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtA75CePersonal.findByFecRegistroBaja", query = "SELECT n FROM NdtA75CePersonalDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtA75CePersonal.findByFecRegistroActualizado", query = "SELECT n FROM NdtA75CePersonalDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdtA75CePersonalDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_A7_5_CE_PERSONAL", nullable = false, precision = 22, scale = 0)
    private Long cveIdA75CePersonal;
    @Size(max = 13)
    @Column(name = "REG_PATRONAL", length = 13)
    private String regPatronal;
    @Column(name = "NUM_TRABAJADORES")
    private Integer numTrabajadores;
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
    @JoinColumn(name = "CVE_ID_PATRON_ASOCIADO", referencedColumnName = "CVE_ID_PATRON_ASOCIADO")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtPatronAsociadoDO cveIdPatronAsociado;
    @JoinColumn(name = "CVE_ID_TIPO_OFICIO", referencedColumnName = "CVE_ID_TIPO_OFICIO")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcTipoOficioDO cveIdTipoOficio;

    public NdtA75CePersonalDO() {
    }

    public NdtA75CePersonalDO(Long cveIdA75CePersonal) {
        this.cveIdA75CePersonal = cveIdA75CePersonal;
    }

    public Long getCveIdA75CePersonal() {
        return cveIdA75CePersonal;
    }

    public void setCveIdA75CePersonal(Long cveIdA75CePersonal) {
        this.cveIdA75CePersonal = cveIdA75CePersonal;
    }

    public String getRegPatronal() {
        return regPatronal;
    }

    public void setRegPatronal(String regPatronal) {
        this.regPatronal = regPatronal;
    }

    public Integer getNumTrabajadores() {
        return numTrabajadores;
    }

    public void setNumTrabajadores(Integer numTrabajadores) {
        this.numTrabajadores = numTrabajadores;
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

    public NdtPatronAsociadoDO getCveIdPatronAsociado() {
        return cveIdPatronAsociado;
    }

    public void setCveIdPatronAsociado(NdtPatronAsociadoDO cveIdPatronAsociado) {
        this.cveIdPatronAsociado = cveIdPatronAsociado;
    }

    public NdcTipoOficioDO getCveIdTipoOficio() {
        return cveIdTipoOficio;
    }

    public void setCveIdTipoOficio(NdcTipoOficioDO cveIdTipoOficio) {
        this.cveIdTipoOficio = cveIdTipoOficio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdA75CePersonal != null ? cveIdA75CePersonal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtA75CePersonalDO)) {
            return false;
        }
        NdtA75CePersonalDO other = (NdtA75CePersonalDO) object;
        if ((this.cveIdA75CePersonal == null && other.cveIdA75CePersonal != null) || (this.cveIdA75CePersonal != null && !this.cveIdA75CePersonal.equals(other.cveIdA75CePersonal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtA75CePersonal[ cveIdA75CePersonal=" + cveIdA75CePersonal + " ]";
    }
    
}
