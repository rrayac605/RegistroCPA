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
@Table(name = "NDT_A7_2_CE_BIEN")
@NamedQueries({
    @NamedQuery(name = "NdtA72CeBienDO.findAll", query = "SELECT n FROM NdtA72CeBienDO n"),
    @NamedQuery(name = "NdtA72CeBienDO.findByCveIdA72CeBien", query = "SELECT n FROM NdtA72CeBienDO n WHERE n.cveIdA72CeBien = :cveIdA72CeBien"),
    @NamedQuery(name = "NdtA72CeBienDO.findByRegPatronal", query = "SELECT n FROM NdtA72CeBienDO n WHERE n.regPatronal = :regPatronal"),
    @NamedQuery(name = "NdtA72CeBienDO.findByDesBienElaboradoSp", query = "SELECT n FROM NdtA72CeBienDO n WHERE n.desBienElaboradoSp = :desBienElaboradoSp"),
    @NamedQuery(name = "NdtA72CeBienDO.findByDesMateriaPrimaUtilizada", query = "SELECT n FROM NdtA72CeBienDO n WHERE n.desMateriaPrimaUtilizada = :desMateriaPrimaUtilizada"),
    @NamedQuery(name = "NdtA72CeBienDO.findByCveIdUsuario", query = "SELECT n FROM NdtA72CeBienDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtA72CeBienDO.findByFecRegistroAlta", query = "SELECT n FROM NdtA72CeBienDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtA72CeBienDO.findByFecRegistroBaja", query = "SELECT n FROM NdtA72CeBienDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtA72CeBienDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtA72CeBienDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdtA72CeBienDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_A7_2_CE_BIEN", nullable = false, precision = 22, scale = 0)
    private BigDecimal cveIdA72CeBien;
    @Size(max = 11)
    @Column(name = "REG_PATRONAL", length = 11)
    private String regPatronal;
    @Size(max = 1000)
    @Column(name = "DES_BIEN_ELABORADO_SP", length = 1000)
    private String desBienElaboradoSp;
    @Size(max = 1000)
    @Column(name = "DES_MATERIA_PRIMA_UTILIZADA", length = 1000)
    private String desMateriaPrimaUtilizada;
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

    public NdtA72CeBienDO() {
    }

    public NdtA72CeBienDO(BigDecimal cveIdA72CeBien) {
        this.cveIdA72CeBien = cveIdA72CeBien;
    }

    public BigDecimal getCveIdA72CeBien() {
        return cveIdA72CeBien;
    }

    public void setCveIdA72CeBien(BigDecimal cveIdA72CeBien) {
        this.cveIdA72CeBien = cveIdA72CeBien;
    }

    public String getRegPatronal() {
        return regPatronal;
    }

    public void setRegPatronal(String regPatronal) {
        this.regPatronal = regPatronal;
    }

    public String getDesBienElaboradoSp() {
        return desBienElaboradoSp;
    }

    public void setDesBienElaboradoSp(String desBienElaboradoSp) {
        this.desBienElaboradoSp = desBienElaboradoSp;
    }

    public String getDesMateriaPrimaUtilizada() {
        return desMateriaPrimaUtilizada;
    }

    public void setDesMateriaPrimaUtilizada(String desMateriaPrimaUtilizada) {
        this.desMateriaPrimaUtilizada = desMateriaPrimaUtilizada;
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
        hash += (cveIdA72CeBien != null ? cveIdA72CeBien.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtA72CeBienDO)) {
            return false;
        }
        NdtA72CeBienDO other = (NdtA72CeBienDO) object;
        if ((this.cveIdA72CeBien == null && other.cveIdA72CeBien != null) || (this.cveIdA72CeBien != null && !this.cveIdA72CeBien.equals(other.cveIdA72CeBien))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtA72CeBienDO[ cveIdA72CeBien=" + cveIdA72CeBien + " ]";
    }
    
}
