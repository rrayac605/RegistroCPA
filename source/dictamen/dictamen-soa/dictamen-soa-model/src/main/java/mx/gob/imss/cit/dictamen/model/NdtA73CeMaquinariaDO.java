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
@Table(name = "NDT_A7_3_CE_MAQUINARIA")
@NamedQueries({
    @NamedQuery(name = "NdtA73CeMaquinariaDO.findAll", query = "SELECT n FROM NdtA73CeMaquinariaDO n"),
    @NamedQuery(name = "NdtA73CeMaquinariaDO.findByCveIdA73CeMaquinaria", query = "SELECT n FROM NdtA73CeMaquinariaDO n WHERE n.cveIdA73CeMaquinaria = :cveIdA73CeMaquinaria"),
    @NamedQuery(name = "NdtA73CeMaquinariaDO.findByRegPatronal", query = "SELECT n FROM NdtA73CeMaquinariaDO n WHERE n.regPatronal = :regPatronal"),
    @NamedQuery(name = "NdtA73CeMaquinariaDO.findByNumUnidad", query = "SELECT n FROM NdtA73CeMaquinariaDO n WHERE n.numUnidad = :numUnidad"),
    @NamedQuery(name = "NdtA73CeMaquinariaDO.findByNomMaquinaria", query = "SELECT n FROM NdtA73CeMaquinariaDO n WHERE n.nomMaquinaria = :nomMaquinaria"),
    @NamedQuery(name = "NdtA73CeMaquinariaDO.findByDesTipoUso", query = "SELECT n FROM NdtA73CeMaquinariaDO n WHERE n.desTipoUso = :desTipoUso"),
    @NamedQuery(name = "NdtA73CeMaquinariaDO.findByDesTipoMotor", query = "SELECT n FROM NdtA73CeMaquinariaDO n WHERE n.desTipoMotor = :desTipoMotor"),
    @NamedQuery(name = "NdtA73CeMaquinariaDO.findByDesCapacidadPotencia", query = "SELECT n FROM NdtA73CeMaquinariaDO n WHERE n.desCapacidadPotencia = :desCapacidadPotencia"),
    @NamedQuery(name = "NdtA73CeMaquinariaDO.findByCveIdUsuario", query = "SELECT n FROM NdtA73CeMaquinariaDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtA73CeMaquinariaDO.findByFecRegistroAlta", query = "SELECT n FROM NdtA73CeMaquinariaDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtA73CeMaquinariaDO.findByFecRegistroBaja", query = "SELECT n FROM NdtA73CeMaquinariaDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtA73CeMaquinariaDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtA73CeMaquinariaDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdtA73CeMaquinariaDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_A7_3_CE_MAQUINARIA", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator(name = "NdtA73CeMaquinaria_Id_Seq_Gen", sequenceName = "SEQ_NDTA73CEMAQUINARIA")
    @GeneratedValue(generator = "NdtA73CeMaquinaria_Id_Seq_Gen")
    private Long cveIdA73CeMaquinaria;
    @Size(max = 11)
    @Column(name = "REG_PATRONAL", length = 11)
    private String regPatronal;
    @Column(name = "NUM_UNIDAD")
    private Integer numUnidad;
    @Size(max = 100)
    @Column(name = "NOM_MAQUINARIA", length = 100)
    private String nomMaquinaria;
    @Size(max = 20)
    @Column(name = "DES_TIPO_USO", length = 20)
    private String desTipoUso;
    @Size(max = 50)
    @Column(name = "DES_TIPO_MOTOR", length = 50)
    private String desTipoMotor;
    @Size(max = 20)
    @Column(name = "DES_CAPACIDAD_POTENCIA", length = 20)
    private String desCapacidadPotencia;
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

    public NdtA73CeMaquinariaDO() {
    }

    public NdtA73CeMaquinariaDO(Long cveIdA73CeMaquinaria) {
        this.cveIdA73CeMaquinaria = cveIdA73CeMaquinaria;
    }

    public Long getCveIdA73CeMaquinaria() {
        return cveIdA73CeMaquinaria;
    }

    public void setCveIdA73CeMaquinaria(Long cveIdA73CeMaquinaria) {
        this.cveIdA73CeMaquinaria = cveIdA73CeMaquinaria;
    }

    public String getRegPatronal() {
        return regPatronal;
    }

    public void setRegPatronal(String regPatronal) {
        this.regPatronal = regPatronal;
    }

    public Integer getNumUnidad() {
        return numUnidad;
    }

    public void setNumUnidad(Integer numUnidad) {
        this.numUnidad = numUnidad;
    }

    public String getNomMaquinaria() {
        return nomMaquinaria;
    }

    public void setNomMaquinaria(String nomMaquinaria) {
        this.nomMaquinaria = nomMaquinaria;
    }

    public String getDesTipoUso() {
        return desTipoUso;
    }

    public void setDesTipoUso(String desTipoUso) {
        this.desTipoUso = desTipoUso;
    }

    public String getDesTipoMotor() {
        return desTipoMotor;
    }

    public void setDesTipoMotor(String desTipoMotor) {
        this.desTipoMotor = desTipoMotor;
    }

    public String getDesCapacidadPotencia() {
        return desCapacidadPotencia;
    }

    public void setDesCapacidadPotencia(String desCapacidadPotencia) {
        this.desCapacidadPotencia = desCapacidadPotencia;
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
        hash += (cveIdA73CeMaquinaria != null ? cveIdA73CeMaquinaria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtA73CeMaquinariaDO)) {
            return false;
        }
        NdtA73CeMaquinariaDO other = (NdtA73CeMaquinariaDO) object;
        if ((this.cveIdA73CeMaquinaria == null && other.cveIdA73CeMaquinaria != null) || (this.cveIdA73CeMaquinaria != null && !this.cveIdA73CeMaquinaria.equals(other.cveIdA73CeMaquinaria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtA73CeMaquinariaDO[ cveIdA73CeMaquinaria=" + cveIdA73CeMaquinaria + " ]";
    }
    
}
