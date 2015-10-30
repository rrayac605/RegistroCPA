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
@Table(name = "NDC_FORMA_PAGO")
@NamedQueries({
    @NamedQuery(name = "NdcFormaPagoDO.findAll", query = "SELECT n FROM NdcFormaPagoDO n"),
    @NamedQuery(name = "NdcFormaPagoDO.findByCveIdFormaPago", query = "SELECT n FROM NdcFormaPagoDO n WHERE n.cveIdFormaPago = :cveIdFormaPago"),
    @NamedQuery(name = "NdcFormaPagoDO.findByDesFormaPago", query = "SELECT n FROM NdcFormaPagoDO n WHERE n.desFormaPago = :desFormaPago"),
    @NamedQuery(name = "NdcFormaPagoDO.findByFecRegistroAlta", query = "SELECT n FROM NdcFormaPagoDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdcFormaPagoDO.findByFecRegistroBaja", query = "SELECT n FROM NdcFormaPagoDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdcFormaPagoDO.findByFecRegistroActualizado", query = "SELECT n FROM NdcFormaPagoDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdcFormaPagoDO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_FORMA_PAGO", nullable = false)
    private Short cveIdFormaPago;
    @Size(max = 50)
    @Column(name = "DES_FORMA_PAGO", length = 50)
    private String desFormaPago;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @OneToMany(mappedBy = "cveIdFormaPago", fetch = FetchType.LAZY)
    private List<NdtModeloOpinionDO> ndtModeloOpinionDOList;
    @JoinColumn(name = "CVE_ID_TIPO_PAGO", referencedColumnName = "CVE_ID_TIPO_PAGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcTipoPagoDO cveIdTipoPago;

    public NdcFormaPagoDO() {
    }

    public NdcFormaPagoDO(Short cveIdFormaPago) {
        this.cveIdFormaPago = cveIdFormaPago;
    }

    public Short getCveIdFormaPago() {
        return cveIdFormaPago;
    }

    public void setCveIdFormaPago(Short cveIdFormaPago) {
        this.cveIdFormaPago = cveIdFormaPago;
    }

    public String getDesFormaPago() {
        return desFormaPago;
    }

    public void setDesFormaPago(String desFormaPago) {
        this.desFormaPago = desFormaPago;
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

    public NdcTipoPagoDO getCveIdTipoPago() {
        return cveIdTipoPago;
    }

    public void setCveIdTipoPago(NdcTipoPagoDO cveIdTipoPago) {
        this.cveIdTipoPago = cveIdTipoPago;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdFormaPago != null ? cveIdFormaPago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdcFormaPagoDO)) {
            return false;
        }
        NdcFormaPagoDO other = (NdcFormaPagoDO) object;
        if ((this.cveIdFormaPago == null && other.cveIdFormaPago != null) || (this.cveIdFormaPago != null && !this.cveIdFormaPago.equals(other.cveIdFormaPago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdcFormaPagoDO[ cveIdFormaPago=" + cveIdFormaPago + " ]";
    }
    
}
