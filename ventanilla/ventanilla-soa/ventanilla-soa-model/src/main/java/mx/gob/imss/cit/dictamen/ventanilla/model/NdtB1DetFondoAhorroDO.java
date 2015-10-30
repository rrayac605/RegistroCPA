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
@Table(name = "NDT_B1_DET_FONDO_AHORRO")
@NamedQueries({
    @NamedQuery(name = "NdtB1DetFondoAhorroDO.findAll", query = "SELECT n FROM NdtB1DetFondoAhorroDO n"),
    @NamedQuery(name = "NdtB1DetFondoAhorroDO.findByCveIdB1DetFondoAhorro", query = "SELECT n FROM NdtB1DetFondoAhorroDO n WHERE n.cveIdB1DetFondoAhorro = :cveIdB1DetFondoAhorro"),
    @NamedQuery(name = "NdtB1DetFondoAhorroDO.findByImpImportePagado", query = "SELECT n FROM NdtB1DetFondoAhorroDO n WHERE n.impImportePagado = :impImportePagado"),
    @NamedQuery(name = "NdtB1DetFondoAhorroDO.findByPorPorcentajeAportacion", query = "SELECT n FROM NdtB1DetFondoAhorroDO n WHERE n.porPorcentajeAportacion = :porPorcentajeAportacion"),
    @NamedQuery(name = "NdtB1DetFondoAhorroDO.findByIndTipoAportacion", query = "SELECT n FROM NdtB1DetFondoAhorroDO n WHERE n.indTipoAportacion = :indTipoAportacion"),
    @NamedQuery(name = "NdtB1DetFondoAhorroDO.findByCveIdUsuario", query = "SELECT n FROM NdtB1DetFondoAhorroDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtB1DetFondoAhorroDO.findByFecRegistroAlta", query = "SELECT n FROM NdtB1DetFondoAhorroDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtB1DetFondoAhorroDO.findByFecRegistroBaja", query = "SELECT n FROM NdtB1DetFondoAhorroDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtB1DetFondoAhorroDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtB1DetFondoAhorroDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdtB1DetFondoAhorroDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_B1_DET_FONDO_AHORRO", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator(name = "NdtB1DetFondoAhorro_Id_Seq_Gen", sequenceName = "SEQ_NDTB1DETFONDOAHORRO", allocationSize=1)
    @GeneratedValue(generator = "NdtB1DetFondoAhorro_Id_Seq_Gen")
    private Long cveIdB1DetFondoAhorro;
    @Column(name = "IMP_IMPORTE_PAGADO", precision = 13, scale = 2)
    private Long impImportePagado;
    @Column(name = "POR_PORCENTAJE_APORTACION")
    private Integer porPorcentajeAportacion;
    @Column(name = "IND_TIPO_APORTACION")
    private Integer indTipoAportacion;
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
    @JoinColumn(name = "CVE_ID_B1_CED_REMUNERA", referencedColumnName = "CVE_ID_B1_CED_REMUNERA")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtB1CedulaRemuneracionesDO cveIdB1CedRemunera;

    public NdtB1DetFondoAhorroDO() {
    }

    public NdtB1DetFondoAhorroDO(Long cveIdB1DetFondoAhorro) {
        this.cveIdB1DetFondoAhorro = cveIdB1DetFondoAhorro;
    }

    public Long getCveIdB1DetFondoAhorro() {
        return cveIdB1DetFondoAhorro;
    }

    public void setCveIdB1DetFondoAhorro(Long cveIdB1DetFondoAhorro) {
        this.cveIdB1DetFondoAhorro = cveIdB1DetFondoAhorro;
    }

    public Long getImpImportePagado() {
        return impImportePagado;
    }

    public void setImpImportePagado(Long impImportePagado) {
        this.impImportePagado = impImportePagado;
    }

    public Integer getPorPorcentajeAportacion() {
        return porPorcentajeAportacion;
    }

    public void setPorPorcentajeAportacion(Integer porPorcentajeAportacion) {
        this.porPorcentajeAportacion = porPorcentajeAportacion;
    }

    public Integer getIndTipoAportacion() {
        return indTipoAportacion;
    }

    public void setIndTipoAportacion(Integer indTipoAportacion) {
        this.indTipoAportacion = indTipoAportacion;
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

    public NdtB1CedulaRemuneracionesDO getCveIdB1CedRemunera() {
        return cveIdB1CedRemunera;
    }

    public void setCveIdB1CedRemunera(NdtB1CedulaRemuneracionesDO cveIdB1CedRemunera) {
        this.cveIdB1CedRemunera = cveIdB1CedRemunera;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdB1DetFondoAhorro != null ? cveIdB1DetFondoAhorro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtB1DetFondoAhorroDO)) {
            return false;
        }
        NdtB1DetFondoAhorroDO other = (NdtB1DetFondoAhorroDO) object;
        if ((this.cveIdB1DetFondoAhorro == null && other.cveIdB1DetFondoAhorro != null) || (this.cveIdB1DetFondoAhorro != null && !this.cveIdB1DetFondoAhorro.equals(other.cveIdB1DetFondoAhorro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtB1DetFondoAhorroDO[ cveIdB1DetFondoAhorro=" + cveIdB1DetFondoAhorro + " ]";
    }
    
}
