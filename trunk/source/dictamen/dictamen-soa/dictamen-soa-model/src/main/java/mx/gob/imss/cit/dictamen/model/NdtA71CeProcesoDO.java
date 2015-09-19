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
import javax.persistence.GenerationType;
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
@Table(name = "NDT_A7_1_CE_PROCESO")
@NamedQueries({
    @NamedQuery(name = "NdtA71CeProcesoDO.findAll", query = "SELECT n FROM NdtA71CeProcesoDO n"),
    @NamedQuery(name = "NdtA71CeProcesoDO.findByCveIdA71CeProceso", query = "SELECT n FROM NdtA71CeProcesoDO n WHERE n.cveIdA71CeProceso = :cveIdA71CeProceso"),
    @NamedQuery(name = "NdtA71CeProcesoDO.findByRegPatronal", query = "SELECT n FROM NdtA71CeProcesoDO n WHERE n.regPatronal = :regPatronal"),
    @NamedQuery(name = "NdtA71CeProcesoDO.findByDesProcesoInicialXct", query = "SELECT n FROM NdtA71CeProcesoDO n WHERE n.desProcesoInicialXct = :desProcesoInicialXct"),
    @NamedQuery(name = "NdtA71CeProcesoDO.findByDesProcesoIntermedioXct", query = "SELECT n FROM NdtA71CeProcesoDO n WHERE n.desProcesoIntermedioXct = :desProcesoIntermedioXct"),
    @NamedQuery(name = "NdtA71CeProcesoDO.findByDesProcesoFinalXct", query = "SELECT n FROM NdtA71CeProcesoDO n WHERE n.desProcesoFinalXct = :desProcesoFinalXct"),
    @NamedQuery(name = "NdtA71CeProcesoDO.findByCveIdUsuario", query = "SELECT n FROM NdtA71CeProcesoDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtA71CeProcesoDO.findByFecRegistroAlta", query = "SELECT n FROM NdtA71CeProcesoDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtA71CeProcesoDO.findByFecRegistroBaja", query = "SELECT n FROM NdtA71CeProcesoDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtA71CeProcesoDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtA71CeProcesoDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdtA71CeProcesoDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_A7_1_CE_PROCESO", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator( allocationSize=1,name = "NdtA71CeProceso_Id_Seq_Gen", sequenceName = "SEQ_NDTA71CEPROCESO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NdtA71CeProceso_Id_Seq_Gen")
    private Long cveIdA71CeProceso;
    @Size(max = 11)
    @Column(name = "REG_PATRONAL", length = 11)
    private String regPatronal;
    @Size(max = 1000)
    @Column(name = "DES_PROCESO_INICIAL_XCT", length = 1000)
    private String desProcesoInicialXct;
    @Size(max = 1000)
    @Column(name = "DES_PROCESO_INTERMEDIO_XCT", length = 1000)
    private String desProcesoIntermedioXct;
    @Size(max = 1000)
    @Column(name = "DES_PROCESO_FINAL_XCT", length = 1000)
    private String desProcesoFinalXct;
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

    public NdtA71CeProcesoDO() {
    }

    public NdtA71CeProcesoDO(Long cveIdA71CeProceso) {
        this.cveIdA71CeProceso = cveIdA71CeProceso;
    }

    public Long getCveIdA71CeProceso() {
        return cveIdA71CeProceso;
    }

    public void setCveIdA71CeProceso(Long cveIdA71CeProceso) {
        this.cveIdA71CeProceso = cveIdA71CeProceso;
    }

    public String getRegPatronal() {
        return regPatronal;
    }

    public void setRegPatronal(String regPatronal) {
        this.regPatronal = regPatronal;
    }

    public String getDesProcesoInicialXct() {
        return desProcesoInicialXct;
    }

    public void setDesProcesoInicialXct(String desProcesoInicialXct) {
        this.desProcesoInicialXct = desProcesoInicialXct;
    }

    public String getDesProcesoIntermedioXct() {
        return desProcesoIntermedioXct;
    }

    public void setDesProcesoIntermedioXct(String desProcesoIntermedioXct) {
        this.desProcesoIntermedioXct = desProcesoIntermedioXct;
    }

    public String getDesProcesoFinalXct() {
        return desProcesoFinalXct;
    }

    public void setDesProcesoFinalXct(String desProcesoFinalXct) {
        this.desProcesoFinalXct = desProcesoFinalXct;
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
        hash += (cveIdA71CeProceso != null ? cveIdA71CeProceso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtA71CeProcesoDO)) {
            return false;
        }
        NdtA71CeProcesoDO other = (NdtA71CeProcesoDO) object;
        if ((this.cveIdA71CeProceso == null && other.cveIdA71CeProceso != null) || (this.cveIdA71CeProceso != null && !this.cveIdA71CeProceso.equals(other.cveIdA71CeProceso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtA71CeProcesoDODO[ cveIdA71CeProceso=" + cveIdA71CeProceso + " ]";
    }
    
}
