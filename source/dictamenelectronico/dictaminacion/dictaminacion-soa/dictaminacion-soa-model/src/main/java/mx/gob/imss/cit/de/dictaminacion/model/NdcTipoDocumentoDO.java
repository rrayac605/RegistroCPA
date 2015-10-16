/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.de.dictaminacion.model;

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
@Table(name = "NDC_TIPO_DOCUMENTO")
@NamedQueries({
    @NamedQuery(name = "NdcTipoDocumentoDO.findAll", query = "SELECT n FROM NdcTipoDocumentoDO n"),
    @NamedQuery(name = "NdcTipoDocumentoDO.findByCveIdTipoDocumento", query = "SELECT n FROM NdcTipoDocumentoDO n WHERE n.cveIdTipoDocumento = :cveIdTipoDocumento"),
    @NamedQuery(name = "NdcTipoDocumentoDO.findByDesTipoDocumento", query = "SELECT n FROM NdcTipoDocumentoDO n WHERE n.desTipoDocumento = :desTipoDocumento"),
    @NamedQuery(name = "NdcTipoDocumentoDO.findByFecRegistroAlta", query = "SELECT n FROM NdcTipoDocumentoDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdcTipoDocumentoDO.findByFecRegistroBaja", query = "SELECT n FROM NdcTipoDocumentoDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdcTipoDocumentoDO.findByFecRegistroActualizado", query = "SELECT n FROM NdcTipoDocumentoDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdcTipoDocumentoDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_TIPO_DOCUMENTO", nullable = false, precision = 22, scale = 0)
    private Long cveIdTipoDocumento;
    @Size(max = 50)
    @Column(name = "DES_TIPO_DOCUMENTO", length = 50)
    private String desTipoDocumento;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @OneToMany(mappedBy = "cveIdTipoDocumento", fetch = FetchType.LAZY)
    private List<NdtCargaDocumentoDO> ndtCargaDocumentoDOList;

    public NdcTipoDocumentoDO() {
    }

    public NdcTipoDocumentoDO(Long cveIdTipoDocumento) {
        this.cveIdTipoDocumento = cveIdTipoDocumento;
    }

    public Long getCveIdTipoDocumento() {
        return cveIdTipoDocumento;
    }

    public void setCveIdTipoDocumento(Long cveIdTipoDocumento) {
        this.cveIdTipoDocumento = cveIdTipoDocumento;
    }

    public String getDesTipoDocumento() {
        return desTipoDocumento;
    }

    public void setDesTipoDocumento(String desTipoDocumento) {
        this.desTipoDocumento = desTipoDocumento;
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
        hash += (cveIdTipoDocumento != null ? cveIdTipoDocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdcTipoDocumentoDO)) {
            return false;
        }
        NdcTipoDocumentoDO other = (NdcTipoDocumentoDO) object;
        if ((this.cveIdTipoDocumento == null && other.cveIdTipoDocumento != null) || (this.cveIdTipoDocumento != null && !this.cveIdTipoDocumento.equals(other.cveIdTipoDocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdcTipoDocumentoDO[ cveIdTipoDocumento=" + cveIdTipoDocumento + " ]";
    }
    
}
