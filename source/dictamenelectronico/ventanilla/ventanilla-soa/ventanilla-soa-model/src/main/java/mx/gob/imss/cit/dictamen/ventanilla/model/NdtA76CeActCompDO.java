/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.ventanilla.model;

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
@Table(name = "NDT_A7_6_CE_ACT_COMP")
@NamedQueries({
    @NamedQuery(name = "NdtA76CeActCompDO.findAll", query = "SELECT n FROM NdtA76CeActCompDO n"),
    @NamedQuery(name = "NdtA76CeActCompDO.findByCveIdA76CeActComp", query = "SELECT n FROM NdtA76CeActCompDO n WHERE n.cveIdA76CeActComp = :cveIdA76CeActComp"),
    @NamedQuery(name = "NdtA76CeActCompDO.findByRegPatronal", query = "SELECT n FROM NdtA76CeActCompDO n WHERE n.regPatronal = :regPatronal"),
    @NamedQuery(name = "NdtA76CeActCompDO.findByDesTipoDistribucion", query = "SELECT n FROM NdtA76CeActCompDO n WHERE n.desTipoDistribucion = :desTipoDistribucion"),
    @NamedQuery(name = "NdtA76CeActCompDO.findByIndAcServInstalacion", query = "SELECT n FROM NdtA76CeActCompDO n WHERE n.indAcServInstalacion = :indAcServInstalacion"),
    @NamedQuery(name = "NdtA76CeActCompDO.findByIndAcServAlmacenaje", query = "SELECT n FROM NdtA76CeActCompDO n WHERE n.indAcServAlmacenaje = :indAcServAlmacenaje"),
    @NamedQuery(name = "NdtA76CeActCompDO.findByIndOtorgaSgmm", query = "SELECT n FROM NdtA76CeActCompDO n WHERE n.indOtorgaSgmm = :indOtorgaSgmm"),
    @NamedQuery(name = "NdtA76CeActCompDO.findByIndPresentoEscrito", query = "SELECT n FROM NdtA76CeActCompDO n WHERE n.indPresentoEscrito = :indPresentoEscrito"),
    @NamedQuery(name = "NdtA76CeActCompDO.findByCveIdUsuario", query = "SELECT n FROM NdtA76CeActCompDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtA76CeActCompDO.findByFecRegistroAlta", query = "SELECT n FROM NdtA76CeActCompDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtA76CeActCompDO.findByFecRegistroBaja", query = "SELECT n FROM NdtA76CeActCompDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtA76CeActCompDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtA76CeActCompDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdtA76CeActCompDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_A7_6_CE_ACT_COMP", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator(name = "NdcColegio_Id_Seq_Gen", sequenceName = "SEQ_NDT_A7_6_CE_ACT_COMP", allocationSize=1)
    @GeneratedValue(generator = "NdcColegio_Id_Seq_Gen")
    private Long cveIdA76CeActComp;
    @Size(max = 13)
    @Column(name = "REG_PATRONAL", length = 13)
    private String regPatronal;
    @Size(max = 20)
    @Column(name = "DES_TIPO_DISTRIBUCION", length = 20)
    private String desTipoDistribucion;
    @Size(max = 2)
    @Column(name = "IND_AC_SERV_INSTALACION", length = 2)
    private String indAcServInstalacion;
    @Size(max = 2)
    @Column(name = "IND_AC_SERV_ALMACENAJE", length = 2)
    private String indAcServAlmacenaje;
    @Size(max = 2)
    @Column(name = "IND_OTORGA_SGMM", length = 2)
    private String indOtorgaSgmm;
    @Size(max = 2)
    @Column(name = "IND_PRESENTO_ESCRITO", length = 2)
    private String indPresentoEscrito;
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

    public NdtA76CeActCompDO() {
    }

    public NdtA76CeActCompDO(Long cveIdA76CeActComp) {
        this.cveIdA76CeActComp = cveIdA76CeActComp;
    }

    public Long getCveIdA76CeActComp() {
        return cveIdA76CeActComp;
    }

    public void setCveIdA76CeActComp(Long cveIdA76CeActComp) {
        this.cveIdA76CeActComp = cveIdA76CeActComp;
    }

    public String getRegPatronal() {
        return regPatronal;
    }

    public void setRegPatronal(String regPatronal) {
        this.regPatronal = regPatronal;
    }

    public String getDesTipoDistribucion() {
        return desTipoDistribucion;
    }

    public void setDesTipoDistribucion(String desTipoDistribucion) {
        this.desTipoDistribucion = desTipoDistribucion;
    }

    public String getIndAcServInstalacion() {
        return indAcServInstalacion;
    }

    public void setIndAcServInstalacion(String indAcServInstalacion) {
        this.indAcServInstalacion = indAcServInstalacion;
    }

    public String getIndAcServAlmacenaje() {
        return indAcServAlmacenaje;
    }

    public void setIndAcServAlmacenaje(String indAcServAlmacenaje) {
        this.indAcServAlmacenaje = indAcServAlmacenaje;
    }

    public String getIndOtorgaSgmm() {
        return indOtorgaSgmm;
    }

    public void setIndOtorgaSgmm(String indOtorgaSgmm) {
        this.indOtorgaSgmm = indOtorgaSgmm;
    }

    public String getIndPresentoEscrito() {
        return indPresentoEscrito;
    }

    public void setIndPresentoEscrito(String indPresentoEscrito) {
        this.indPresentoEscrito = indPresentoEscrito;
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
        hash += (cveIdA76CeActComp != null ? cveIdA76CeActComp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtA76CeActCompDO)) {
            return false;
        }
        NdtA76CeActCompDO other = (NdtA76CeActCompDO) object;
        if ((this.cveIdA76CeActComp == null && other.cveIdA76CeActComp != null) || (this.cveIdA76CeActComp != null && !this.cveIdA76CeActComp.equals(other.cveIdA76CeActComp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtA76CeActCompDO[ cveIdA76CeActComp=" + cveIdA76CeActComp + " ]";
    }
    
}
