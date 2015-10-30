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
@Table(name = "NDT_R2_DESPACHO")
@NamedQueries({
    @NamedQuery(name = "NdtR2DespachoDO.findAll", query = "SELECT n FROM NdtR2DespachoDO n"),
    @NamedQuery(name = "NdtR2DespachoDO.findByCveIdR2Despacho", query = "SELECT n FROM NdtR2DespachoDO n WHERE n.cveIdR2Despacho = :cveIdR2Despacho"),
    @NamedQuery(name = "NdtR2DespachoDO.findByFecActivacion", query = "SELECT n FROM NdtR2DespachoDO n WHERE n.fecActivacion = :fecActivacion"),
    @NamedQuery(name = "NdtR2DespachoDO.findByIndActivo", query = "SELECT n FROM NdtR2DespachoDO n WHERE n.indActivo = :indActivo"),
    @NamedQuery(name = "NdtR2DespachoDO.findByIndTipoCpa", query = "SELECT n FROM NdtR2DespachoDO n WHERE n.indTipoCpa = :indTipoCpa"),
    @NamedQuery(name = "NdtR2DespachoDO.findByNumTrabajadoresContratados", query = "SELECT n FROM NdtR2DespachoDO n WHERE n.numTrabajadoresContratados = :numTrabajadoresContratados"),
    @NamedQuery(name = "NdtR2DespachoDO.findByCargoQueDesempena", query = "SELECT n FROM NdtR2DespachoDO n WHERE n.cargoQueDesempena = :cargoQueDesempena"),
    @NamedQuery(name = "NdtR2DespachoDO.findByFecRegistroAlta", query = "SELECT n FROM NdtR2DespachoDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtR2DespachoDO.findByFecRegistroBaja", query = "SELECT n FROM NdtR2DespachoDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtR2DespachoDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtR2DespachoDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado"),
    @NamedQuery(name = "NdtR2DespachoDO.findByCveIdUsuario", query = "SELECT n FROM NdtR2DespachoDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtR2DespachoDO.findByIndCuentaconTrab", query = "SELECT n FROM NdtR2DespachoDO n WHERE n.indCuentaconTrab = :indCuentaconTrab")})
public class NdtR2DespachoDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_R2_DESPACHO", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator(name = "NdtR2Despacho_Id_Seq_Gen", sequenceName = "SEQ_NDT_R2_DESPACHO", allocationSize=1)
    @GeneratedValue(generator = "NdtR2Despachoo_Id_Seq_Gen")
    private Long cveIdR2Despacho;
    @Column(name = "FEC_ACTIVACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecActivacion;
    @Column(name = "IND_ACTIVO")
    private Short indActivo;
    @Column(name = "IND_TIPO_CPA")
    private Integer indTipoCpa;
    @Column(name = "NUM_TRABAJADORES_CONTRATADOS")
    private Integer numTrabajadoresContratados;
    @Size(max = 50)
    @Column(name = "CARGO_QUE_DESEMPENA", length = 50)
    private String cargoQueDesempena;
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
    @Size(max = 2)
    @Column(name = "IND_CUENTACON_TRAB", length = 2)
    private String indCuentaconTrab;
    @JoinColumn(name = "CVE_ID_DESPACHO", referencedColumnName = "CVE_ID_DESPACHO")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtDespachosDO cveIdDespacho;
    @JoinColumn(name = "CVE_ID_CPA_TRAMITE", referencedColumnName = "CVE_ID_CPA_TRAMITE")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtCpaTramiteDO cveIdCpaTramite;
    @JoinColumn(name = "CVE_ID_CPA", referencedColumnName = "CVE_ID_CPA", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private NdtContadorPublicoAutDO cveIdCpa;
    @OneToMany(mappedBy = "cveIdR2Despacho", fetch = FetchType.LAZY)
    private List<NdtR2FormacontactoDO> ndtR2FormacontactoDOList;

    public NdtR2DespachoDO() {
    }

    public NdtR2DespachoDO(Long cveIdR2Despacho) {
        this.cveIdR2Despacho = cveIdR2Despacho;
    }

    public Long getCveIdR2Despacho() {
        return cveIdR2Despacho;
    }

    public void setCveIdR2Despacho(Long cveIdR2Despacho) {
        this.cveIdR2Despacho = cveIdR2Despacho;
    }

    public Date getFecActivacion() {
        return fecActivacion;
    }

    public void setFecActivacion(Date fecActivacion) {
        this.fecActivacion = fecActivacion;
    }

    public Short getIndActivo() {
        return indActivo;
    }

    public void setIndActivo(Short indActivo) {
        this.indActivo = indActivo;
    }

    public Integer getIndTipoCpa() {
        return indTipoCpa;
    }

    public void setIndTipoCpa(Integer indTipoCpa) {
        this.indTipoCpa = indTipoCpa;
    }

    public Integer getNumTrabajadoresContratados() {
        return numTrabajadoresContratados;
    }

    public void setNumTrabajadoresContratados(Integer numTrabajadoresContratados) {
        this.numTrabajadoresContratados = numTrabajadoresContratados;
    }

    public String getCargoQueDesempena() {
        return cargoQueDesempena;
    }

    public void setCargoQueDesempena(String cargoQueDesempena) {
        this.cargoQueDesempena = cargoQueDesempena;
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

    public String getIndCuentaconTrab() {
        return indCuentaconTrab;
    }

    public void setIndCuentaconTrab(String indCuentaconTrab) {
        this.indCuentaconTrab = indCuentaconTrab;
    }

    public NdtDespachosDO getCveIdDespacho() {
        return cveIdDespacho;
    }

    public void setCveIdDespacho(NdtDespachosDO cveIdDespacho) {
        this.cveIdDespacho = cveIdDespacho;
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

    public List<NdtR2FormacontactoDO> getNdtR2FormacontactoDOList() {
        return ndtR2FormacontactoDOList;
    }

    public void setNdtR2FormacontactoDOList(List<NdtR2FormacontactoDO> ndtR2FormacontactoDOList) {
        this.ndtR2FormacontactoDOList = ndtR2FormacontactoDOList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdR2Despacho != null ? cveIdR2Despacho.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtR2DespachoDO)) {
            return false;
        }
        NdtR2DespachoDO other = (NdtR2DespachoDO) object;
        if ((this.cveIdR2Despacho == null && other.cveIdR2Despacho != null) || (this.cveIdR2Despacho != null && !this.cveIdR2Despacho.equals(other.cveIdR2Despacho))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtR2DespachoDO[ cveIdR2Despacho=" + cveIdR2Despacho + " ]";
    }
    
}
