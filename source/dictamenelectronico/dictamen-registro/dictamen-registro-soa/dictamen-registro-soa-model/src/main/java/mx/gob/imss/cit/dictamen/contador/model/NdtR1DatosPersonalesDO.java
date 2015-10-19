/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.contador.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
@Table(name = "NDT_R1_DATOS_PERSONALES")
@NamedQueries({
    @NamedQuery(name = "NdtR1DatosPersonalesDO.findAll", query = "SELECT n FROM NdtR1DatosPersonalesDO n"),
    @NamedQuery(name = "NdtR1DatosPersonalesDO.findByCveIdR1DatosPersonales", query = "SELECT n FROM NdtR1DatosPersonalesDO n WHERE n.cveIdR1DatosPersonales = :cveIdR1DatosPersonales"),
    @NamedQuery(name = "NdtR1DatosPersonalesDO.findByCedulaProfesional", query = "SELECT n FROM NdtR1DatosPersonalesDO n WHERE n.cedulaProfesional = :cedulaProfesional"),
    @NamedQuery(name = "NdtR1DatosPersonalesDO.findByDesTituloExpedidoPor", query = "SELECT n FROM NdtR1DatosPersonalesDO n WHERE n.desTituloExpedidoPor = :desTituloExpedidoPor"),
    @NamedQuery(name = "NdtR1DatosPersonalesDO.findByFecExpedicionCedprof", query = "SELECT n FROM NdtR1DatosPersonalesDO n WHERE n.fecExpedicionCedprof = :fecExpedicionCedprof"),
    @NamedQuery(name = "NdtR1DatosPersonalesDO.findByFecRegistroAlta", query = "SELECT n FROM NdtR1DatosPersonalesDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtR1DatosPersonalesDO.findByFecRegistroBaja", query = "SELECT n FROM NdtR1DatosPersonalesDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtR1DatosPersonalesDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtR1DatosPersonalesDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado"),
    @NamedQuery(name = "NdtR1DatosPersonalesDO.findByCveIdUsuario", query = "SELECT n FROM NdtR1DatosPersonalesDO n WHERE n.cveIdUsuario = :cveIdUsuario")})
public class NdtR1DatosPersonalesDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_R1_DATOS_PERSONALES", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator(name = "NdtR1DatosPersonales_Id_Seq_Gen", sequenceName = "SEQ_NDTR1DATOSPERSONALES", allocationSize=1)
    @GeneratedValue(generator = "NdtR1DatosPersonales_Id_Seq_Gen")
    private Long cveIdR1DatosPersonales;
    @Size(max = 50)
    @Column(name = "CEDULA_PROFESIONAL", length = 50)
    private String cedulaProfesional;
    @Size(max = 200)
    @Column(name = "DES_TITULO_EXPEDIDO_POR", length = 200)
    private String desTituloExpedidoPor;
    @Column(name = "FEC_EXPEDICION_CEDPROF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecExpedicionCedprof;
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
    @OneToMany(mappedBy = "cveIdR1DatosPersonales", fetch = FetchType.LAZY)
    private List<NdtR1FormacontactoDO> ndtR1FormacontactoDOList;
    @JoinColumn(name = "CVE_ID_CPA_TRAMITE", referencedColumnName = "CVE_ID_CPA_TRAMITE")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtCpaTramiteDO cveIdCpaTramite;
    @JoinColumn(name = "CVE_ID_CPA", referencedColumnName = "CVE_ID_CPA", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private NdtContadorPublicoAutDO cveIdCpa;

    public NdtR1DatosPersonalesDO() {
    }

    public NdtR1DatosPersonalesDO(Long cveIdR1DatosPersonales) {
        this.cveIdR1DatosPersonales = cveIdR1DatosPersonales;
    }

    public Long getCveIdR1DatosPersonales() {
        return cveIdR1DatosPersonales;
    }

    public void setCveIdR1DatosPersonales(Long cveIdR1DatosPersonales) {
        this.cveIdR1DatosPersonales = cveIdR1DatosPersonales;
    }

    public String getCedulaProfesional() {
        return cedulaProfesional;
    }

    public void setCedulaProfesional(String cedulaProfesional) {
        this.cedulaProfesional = cedulaProfesional;
    }

    public String getDesTituloExpedidoPor() {
        return desTituloExpedidoPor;
    }

    public void setDesTituloExpedidoPor(String desTituloExpedidoPor) {
        this.desTituloExpedidoPor = desTituloExpedidoPor;
    }

    public Date getFecExpedicionCedprof() {
        return fecExpedicionCedprof;
    }

    public void setFecExpedicionCedprof(Date fecExpedicionCedprof) {
        this.fecExpedicionCedprof = fecExpedicionCedprof;
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

    public List<NdtR1FormacontactoDO> getNdtR1FormacontactoDOList() {
        return ndtR1FormacontactoDOList;
    }

    public void setNdtR1FormacontactoDOList(List<NdtR1FormacontactoDO> ndtR1FormacontactoDOList) {
        this.ndtR1FormacontactoDOList = ndtR1FormacontactoDOList;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdR1DatosPersonales != null ? cveIdR1DatosPersonales.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtR1DatosPersonalesDO)) {
            return false;
        }
        NdtR1DatosPersonalesDO other = (NdtR1DatosPersonalesDO) object;
        if ((this.cveIdR1DatosPersonales == null && other.cveIdR1DatosPersonales != null) || (this.cveIdR1DatosPersonales != null && !this.cveIdR1DatosPersonales.equals(other.cveIdR1DatosPersonales))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtR1DatosPersonalesDO[ cveIdR1DatosPersonales=" + cveIdR1DatosPersonales + " ]";
    }
    
}
