/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.ventanilla.model;

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
@Table(name = "NDC_TIPO_PAGO")
@NamedQueries({
    @NamedQuery(name = "NdcTipoPagoDO.findAll", query = "SELECT n FROM NdcTipoPagoDO n"),
    @NamedQuery(name = "NdcTipoPagoDO.findByCveIdTipoPago", query = "SELECT n FROM NdcTipoPagoDO n WHERE n.cveIdTipoPago = :cveIdTipoPago"),
    @NamedQuery(name = "NdcTipoPagoDO.findByDesTipoPago", query = "SELECT n FROM NdcTipoPagoDO n WHERE n.desTipoPago = :desTipoPago"),
    @NamedQuery(name = "NdcTipoPagoDO.findByFecRegistroAlta", query = "SELECT n FROM NdcTipoPagoDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdcTipoPagoDO.findByFecRegistroBaja", query = "SELECT n FROM NdcTipoPagoDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdcTipoPagoDO.findByFecRegistroActualizado", query = "SELECT n FROM NdcTipoPagoDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdcTipoPagoDO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_TIPO_PAGO", nullable = false)
    private Short cveIdTipoPago;
    @Size(max = 50)
    @Column(name = "DES_TIPO_PAGO", length = 50)
    private String desTipoPago;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @OneToMany(mappedBy = "cveIdTipoPago", fetch = FetchType.LAZY)
    private List<NdtModeloOpinionDO> ndtModeloOpinionDOList;
    @OneToMany(mappedBy = "cveIdTipoPago", fetch = FetchType.LAZY)
    private List<NdcFormaPagoDO> ndcFormaPagoDOList;

    public NdcTipoPagoDO() {
    }

    public NdcTipoPagoDO(Short cveIdTipoPago) {
        this.cveIdTipoPago = cveIdTipoPago;
    }

    public Short getCveIdTipoPago() {
        return cveIdTipoPago;
    }

    public void setCveIdTipoPago(Short cveIdTipoPago) {
        this.cveIdTipoPago = cveIdTipoPago;
    }

    public String getDesTipoPago() {
        return desTipoPago;
    }

    public void setDesTipoPago(String desTipoPago) {
        this.desTipoPago = desTipoPago;
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

    public List<NdtModeloOpinionDO> getNdtModeloOpinionDOList() {
        return ndtModeloOpinionDOList;
    }

    public void setNdtModeloOpinionDOList(List<NdtModeloOpinionDO> ndtModeloOpinionDOList) {
        this.ndtModeloOpinionDOList = ndtModeloOpinionDOList;
    }

    public List<NdcFormaPagoDO> getNdcFormaPagoDOList() {
        return ndcFormaPagoDOList;
    }

    public void setNdcFormaPagoDOList(List<NdcFormaPagoDO> ndcFormaPagoDOList) {
        this.ndcFormaPagoDOList = ndcFormaPagoDOList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdTipoPago != null ? cveIdTipoPago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdcTipoPagoDO)) {
            return false;
        }
        NdcTipoPagoDO other = (NdcTipoPagoDO) object;
        if ((this.cveIdTipoPago == null && other.cveIdTipoPago != null) || (this.cveIdTipoPago != null && !this.cveIdTipoPago.equals(other.cveIdTipoPago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdcTipoPagoDO[ cveIdTipoPago=" + cveIdTipoPago + " ]";
    }
    
}
