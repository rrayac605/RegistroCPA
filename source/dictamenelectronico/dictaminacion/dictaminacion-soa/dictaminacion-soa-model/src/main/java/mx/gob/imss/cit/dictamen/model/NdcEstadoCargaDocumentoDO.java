/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;

import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "NDC_ESTADO_CARGA_DOCUMENTO")
@NamedQueries({
    @NamedQuery(name = "NdcEstadoCargaDocumentoDO.findAll", query = "SELECT n FROM NdcEstadoCargaDocumentoDO n"),
    @NamedQuery(name = "NdcEstadoCargaDocumentoDO.findByCveIdEstadoCargoDoc", query = "SELECT n FROM NdcEstadoCargaDocumentoDO n WHERE n.cveIdEstadoCargoDoc = :cveIdEstadoCargoDoc"),
    @NamedQuery(name = "NdcEstadoCargaDocumentoDO.findByDesStatusCargaAseveraciones", query = "SELECT n FROM NdcEstadoCargaDocumentoDO n WHERE n.desStatusCargaAseveraciones = :desStatusCargaAseveraciones"),
    @NamedQuery(name = "NdcEstadoCargaDocumentoDO.findByFecRegistroAlta", query = "SELECT n FROM NdcEstadoCargaDocumentoDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdcEstadoCargaDocumentoDO.findByFecRegistroBaja", query = "SELECT n FROM NdcEstadoCargaDocumentoDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdcEstadoCargaDocumentoDO.findByFecRegistroActualizado", query = "SELECT n FROM NdcEstadoCargaDocumentoDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdcEstadoCargaDocumentoDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_ESTADO_CARGO_DOC", nullable = false, precision = 22, scale = 0)
    private Long cveIdEstadoCargoDoc;
    @Size(max = 100)
    @Column(name = "DES_STATUS_CARGA_ASEVERACIONES", length = 100)
    private String desStatusCargaAseveraciones;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @OneToMany(mappedBy = "cveIdEstadoCargoDoc", fetch = FetchType.LAZY)
    private List<NdtCargaDocumentoDO> ndtCargaDocumentoDOList;

    public NdcEstadoCargaDocumentoDO() {
    }

    public NdcEstadoCargaDocumentoDO(Long cveIdEstadoCargoDoc) {
        this.cveIdEstadoCargoDoc = cveIdEstadoCargoDoc;
    }

    public Long getCveIdEstadoCargoDoc() {
        return cveIdEstadoCargoDoc;
    }

    public void setCveIdEstadoCargoDoc(Long cveIdEstadoCargoDoc) {
        this.cveIdEstadoCargoDoc = cveIdEstadoCargoDoc;
    }

    public String getDesStatusCargaAseveraciones() {
        return desStatusCargaAseveraciones;
    }

    public void setDesStatusCargaAseveraciones(String desStatusCargaAseveraciones) {
        this.desStatusCargaAseveraciones = desStatusCargaAseveraciones;
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

    public List<NdtCargaDocumentoDO> getNdtCargaDocumentoDOList() {
        return ndtCargaDocumentoDOList;
    }

    public void setNdtCargaDocumentoDOList(List<NdtCargaDocumentoDO> ndtCargaDocumentoDOList) {
        this.ndtCargaDocumentoDOList = ndtCargaDocumentoDOList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdEstadoCargoDoc != null ? cveIdEstadoCargoDoc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdcEstadoCargaDocumentoDO)) {
            return false;
        }
        NdcEstadoCargaDocumentoDO other = (NdcEstadoCargaDocumentoDO) object;
        if ((this.cveIdEstadoCargoDoc == null && other.cveIdEstadoCargoDoc != null) || (this.cveIdEstadoCargoDoc != null && !this.cveIdEstadoCargoDoc.equals(other.cveIdEstadoCargoDoc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdcEstadoCargaDocumentoDO[ cveIdEstadoCargoDoc=" + cveIdEstadoCargoDoc + " ]";
    }
    
}
