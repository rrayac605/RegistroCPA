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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "NDC_ASEVERACIONES")
@NamedQueries({
    @NamedQuery(name = "NdcAseveracionesDO.findAll", query = "SELECT n FROM NdcAseveracionesDO n"),
    @NamedQuery(name = "NdcAseveracionesDO.findByCveIdAseveracion", query = "SELECT n FROM NdcAseveracionesDO n WHERE n.cveIdAseveracion = :cveIdAseveracion"),
    @NamedQuery(name = "NdcAseveracionesDO.findByDesTipoAseveracion", query = "SELECT n FROM NdcAseveracionesDO n WHERE n.desTipoAseveracion = :desTipoAseveracion"),
    @NamedQuery(name = "NdcAseveracionesDO.findByFecRegistroAlta", query = "SELECT n FROM NdcAseveracionesDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdcAseveracionesDO.findByFecRegistroBaja", query = "SELECT n FROM NdcAseveracionesDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdcAseveracionesDO.findByFecRegistroActualizado", query = "SELECT n FROM NdcAseveracionesDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado"),
    @NamedQuery(name = "NdcAseveracionesDO.findByIndObligatorio", query = "SELECT n FROM NdcAseveracionesDO n WHERE n.indObligatorio = :indObligatorio"),
    @NamedQuery(name = "NdcAseveracionesDO.findByIndConstruccion", query = "SELECT n FROM NdcAseveracionesDO n WHERE n.indConstruccion = :indConstruccion")})
public class NdcAseveracionesDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_ASEVERACION", nullable = false, precision = 22, scale = 0)
    private Long cveIdAseveracion;
    @Size(max = 50)
    @Column(name = "DES_TIPO_ASEVERACION", length = 50)
    private String desTipoAseveracion;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @Column(name = "IND_OBLIGATORIO")
    private Short indObligatorio;
    @Column(name = "IND_CONSTRUCCION")
    private Short indConstruccion;
    @OneToMany(mappedBy = "cveIdAseveracionPadre", fetch = FetchType.LAZY)
    private List<NdcAseveracionesDO> ndcAseveracionesDOList;
    @JoinColumn(name = "CVE_ID_ASEVERACION_PADRE", referencedColumnName = "CVE_ID_ASEVERACION")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcAseveracionesDO cveIdAseveracionPadre;
    @OneToMany(mappedBy = "cveIdAseveracion", fetch = FetchType.LAZY)
    private List<NdtCargaDocumentoDO> ndtCargaDocumentoDOList;
    @OneToMany(mappedBy = "cveIdAseveracion", fetch = FetchType.LAZY)
    private List<NdcAtestiguamientoDO> ndcAtestiguamientoDOList;

    public NdcAseveracionesDO() {
    }

    public NdcAseveracionesDO(Long cveIdAseveracion) {
        this.cveIdAseveracion = cveIdAseveracion;
    }

    public Long getCveIdAseveracion() {
        return cveIdAseveracion;
    }

    public void setCveIdAseveracion(Long cveIdAseveracion) {
        this.cveIdAseveracion = cveIdAseveracion;
    }

    public String getDesTipoAseveracion() {
        return desTipoAseveracion;
    }

    public void setDesTipoAseveracion(String desTipoAseveracion) {
        this.desTipoAseveracion = desTipoAseveracion;
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

    public Short getIndObligatorio() {
        return indObligatorio;
    }

    public void setIndObligatorio(Short indObligatorio) {
        this.indObligatorio = indObligatorio;
    }

    public Short getIndConstruccion() {
        return indConstruccion;
    }

    public void setIndConstruccion(Short indConstruccion) {
        this.indConstruccion = indConstruccion;
    }

    public List<NdcAseveracionesDO> getNdcAseveracionesDOList() {
        return ndcAseveracionesDOList;
    }

    public void setNdcAseveracionesDOList(List<NdcAseveracionesDO> ndcAseveracionesDOList) {
        this.ndcAseveracionesDOList = ndcAseveracionesDOList;
    }

    public NdcAseveracionesDO getCveIdAseveracionPadre() {
        return cveIdAseveracionPadre;
    }

    public void setCveIdAseveracionPadre(NdcAseveracionesDO cveIdAseveracionPadre) {
        this.cveIdAseveracionPadre = cveIdAseveracionPadre;
    }

    public List<NdtCargaDocumentoDO> getNdtCargaDocumentoDOList() {
        return ndtCargaDocumentoDOList;
    }

    public void setNdtCargaDocumentoDOList(List<NdtCargaDocumentoDO> ndtCargaDocumentoDOList) {
        this.ndtCargaDocumentoDOList = ndtCargaDocumentoDOList;
    }

    public List<NdcAtestiguamientoDO> getNdcAtestiguamientoDOList() {
        return ndcAtestiguamientoDOList;
    }

    public void setNdcAtestiguamientoDOList(List<NdcAtestiguamientoDO> ndcAtestiguamientoDOList) {
        this.ndcAtestiguamientoDOList = ndcAtestiguamientoDOList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdAseveracion != null ? cveIdAseveracion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdcAseveracionesDO)) {
            return false;
        }
        NdcAseveracionesDO other = (NdcAseveracionesDO) object;
        if ((this.cveIdAseveracion == null && other.cveIdAseveracion != null) || (this.cveIdAseveracion != null && !this.cveIdAseveracion.equals(other.cveIdAseveracion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdcAseveracionesDO[ cveIdAseveracion=" + cveIdAseveracion + " ]";
    }
    
}
