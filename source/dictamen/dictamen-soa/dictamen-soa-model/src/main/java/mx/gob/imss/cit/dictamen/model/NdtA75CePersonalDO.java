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
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "NDT_A7_5_CE_PERSONAL")
@NamedQueries({
    @NamedQuery(name = "NdtA75CePersonalDO.findAll", query = "SELECT n FROM NdtA75CePersonalDO n"),
    @NamedQuery(name = "NdtA75CePersonalDO.findByCveIdA75CePersonal", query = "SELECT n FROM NdtA75CePersonalDO n WHERE n.cveIdA75CePersonal = :cveIdA75CePersonal"),
    @NamedQuery(name = "NdtA75CePersonalDO.findByRegPatronal", query = "SELECT n FROM NdtA75CePersonalDO n WHERE n.regPatronal = :regPatronal"),
    @NamedQuery(name = "NdtA75CePersonalDO.findByNumTrabajadores", query = "SELECT n FROM NdtA75CePersonalDO n WHERE n.numTrabajadores = :numTrabajadores"),
    @NamedQuery(name = "NdtA75CePersonalDO.findByDesTipoOficioOcupacion", query = "SELECT n FROM NdtA75CePersonalDO n WHERE n.desTipoOficioOcupacion = :desTipoOficioOcupacion"),
    @NamedQuery(name = "NdtA75CePersonalDO.findByCveIdUsuario", query = "SELECT n FROM NdtA75CePersonalDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtA75CePersonalDO.findByFecRegistroAlta", query = "SELECT n FROM NdtA75CePersonalDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtA75CePersonalDO.findByFecRegistroBaja", query = "SELECT n FROM NdtA75CePersonalDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtA75CePersonalDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtA75CePersonalDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdtA75CePersonalDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_A7_5_CE_PERSONAL", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator(name = "NdtA75CePersonal_Id_Seq_Gen", sequenceName = "SEQ_NDTA75CEPERSONAL")
    @GeneratedValue(generator = "NdtA75CePersonal_Id_Seq_Gen")
    private Long cveIdA75CePersonal;
    @Size(max = 11)
    @Column(name = "REG_PATRONAL", length = 11)
    private String regPatronal;
    @Column(name = "NUM_TRABAJADORES")
    private Integer numTrabajadores;
    @Size(max = 50)
    @Column(name = "DES_TIPO_OFICIO_OCUPACION", length = 50)
    private String desTipoOficioOcupacion;
    @Size(max = 20)
    @Column(name = "CVE_ID_USUARIO", length = 20)
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
    @JoinColumn(name = "CVE_ID_PATRON_DICTAMEN", referencedColumnName = "CVE_ID_PATRON_DICTAMEN")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtPatronDictamenDO cveIdPatronDictamen;

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

    public String getDesTipoOficioOcupacion() {
        return desTipoOficioOcupacion;
    }

    public void setDesTipoOficioOcupacion(String desTipoOficioOcupacion) {
        this.desTipoOficioOcupacion = desTipoOficioOcupacion;
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

    public NdtPatronDictamenDO getCveIdPatronDictamen() {
        return cveIdPatronDictamen;
    }

    public void setCveIdPatronDictamen(NdtPatronDictamenDO cveIdPatronDictamen) {
        this.cveIdPatronDictamen = cveIdPatronDictamen;
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
        return "mx.gob.imss.cit.dictamen.model.NdtA75CePersonalDO[ cveIdA75CePersonal=" + cveIdA75CePersonal + " ]";
    }
    
}
