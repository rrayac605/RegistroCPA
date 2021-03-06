/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.de.dictaminacion.model;

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
@Table(name = "NDT_A7_4_CE_TRANSPORTE")
@NamedQueries({
    @NamedQuery(name = "NdtA74CeTransporteDO.findAll", query = "SELECT n FROM NdtA74CeTransporteDO n"),
    @NamedQuery(name = "NdtA74CeTransporteDO.findByCveIdA74CeTransporte", query = "SELECT n FROM NdtA74CeTransporteDO n WHERE n.cveIdA74CeTransporte = :cveIdA74CeTransporte"),
    @NamedQuery(name = "NdtA74CeTransporteDO.findByRegPatronal", query = "SELECT n FROM NdtA74CeTransporteDO n WHERE n.regPatronal = :regPatronal"),
    @NamedQuery(name = "NdtA74CeTransporteDO.findByNumUnidad", query = "SELECT n FROM NdtA74CeTransporteDO n WHERE n.numUnidad = :numUnidad"),
    @NamedQuery(name = "NdtA74CeTransporteDO.findByNomTransporte", query = "SELECT n FROM NdtA74CeTransporteDO n WHERE n.nomTransporte = :nomTransporte"),
    @NamedQuery(name = "NdtA74CeTransporteDO.findByDesTipoUso", query = "SELECT n FROM NdtA74CeTransporteDO n WHERE n.desTipoUso = :desTipoUso"),
    @NamedQuery(name = "NdtA74CeTransporteDO.findByDesTipoCombustible", query = "SELECT n FROM NdtA74CeTransporteDO n WHERE n.desTipoCombustible = :desTipoCombustible"),
    @NamedQuery(name = "NdtA74CeTransporteDO.findByDesCapacidadPotencia", query = "SELECT n FROM NdtA74CeTransporteDO n WHERE n.desCapacidadPotencia = :desCapacidadPotencia"),
    @NamedQuery(name = "NdtA74CeTransporteDO.findByCveIdUsuario", query = "SELECT n FROM NdtA74CeTransporteDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtA74CeTransporteDO.findByFecRegistroAlta", query = "SELECT n FROM NdtA74CeTransporteDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtA74CeTransporteDO.findByFecRegistroBaja", query = "SELECT n FROM NdtA74CeTransporteDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtA74CeTransporteDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtA74CeTransporteDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdtA74CeTransporteDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_A7_4_CE_TRANSPORTE", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator(name = "NdtA74CeTransporte_Id_Seq_Gen", sequenceName = "SEQ_NDTA74CETRANSPORTE", allocationSize=1)
    @GeneratedValue(generator = "NdtA74CeTransporteo_Id_Seq_Gen")
    private Long cveIdA74CeTransporte;
    @Size(max = 11)
    @Column(name = "REG_PATRONAL", length = 11)
    private String regPatronal;
    @Column(name = "NUM_UNIDAD")
    private Integer numUnidad;
    @Size(max = 100)
    @Column(name = "NOM_TRANSPORTE", length = 100)
    private String nomTransporte;
    @Size(max = 30)
    @Column(name = "DES_TIPO_USO", length = 30)
    private String desTipoUso;
    @Size(max = 50)
    @Column(name = "DES_TIPO_COMBUSTIBLE", length = 50)
    private String desTipoCombustible;
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
    @JoinColumn(name = "CVE_ID_PATRON_ASOCIADO", referencedColumnName = "CVE_ID_PATRON_ASOCIADO")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtPatronAsociadoDO cveIdPatronAsociado;

    public NdtA74CeTransporteDO() {
    }

    public NdtA74CeTransporteDO(Long cveIdA74CeTransporte) {
        this.cveIdA74CeTransporte = cveIdA74CeTransporte;
    }

    public Long getCveIdA74CeTransporte() {
        return cveIdA74CeTransporte;
    }

    public void setCveIdA74CeTransporte(Long cveIdA74CeTransporte) {
        this.cveIdA74CeTransporte = cveIdA74CeTransporte;
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

    public String getNomTransporte() {
        return nomTransporte;
    }

    public void setNomTransporte(String nomTransporte) {
        this.nomTransporte = nomTransporte;
    }

    public String getDesTipoUso() {
        return desTipoUso;
    }

    public void setDesTipoUso(String desTipoUso) {
        this.desTipoUso = desTipoUso;
    }

    public String getDesTipoCombustible() {
        return desTipoCombustible;
    }

    public void setDesTipoCombustible(String desTipoCombustible) {
        this.desTipoCombustible = desTipoCombustible;
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

    public NdtPatronAsociadoDO getCveIdPatronAsociado() {
        return cveIdPatronAsociado;
    }

    public void setCveIdPatronAsociado(NdtPatronAsociadoDO cveIdPatronAsociado) {
        this.cveIdPatronAsociado = cveIdPatronAsociado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdA74CeTransporte != null ? cveIdA74CeTransporte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtA74CeTransporteDO)) {
            return false;
        }
        NdtA74CeTransporteDO other = (NdtA74CeTransporteDO) object;
        if ((this.cveIdA74CeTransporte == null && other.cveIdA74CeTransporte != null) || (this.cveIdA74CeTransporte != null && !this.cveIdA74CeTransporte.equals(other.cveIdA74CeTransporte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtA74CeTransporteDO[ cveIdA74CeTransporte=" + cveIdA74CeTransporte + " ]";
    }
    
}
