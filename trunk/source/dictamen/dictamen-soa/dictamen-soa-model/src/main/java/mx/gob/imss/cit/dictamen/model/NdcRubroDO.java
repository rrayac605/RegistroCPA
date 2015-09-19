/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "NDC_RUBRO")
@NamedQueries({
    @NamedQuery(name = "NdcRubroDO.findAll", query = "SELECT n FROM NdcRubroDO n"),
    @NamedQuery(name = "NdcRubroDO.findByCveIdRubro", query = "SELECT n FROM NdcRubroDO n WHERE n.cveIdRubro = :cveIdRubro"),
    @NamedQuery(name = "NdcRubroDO.findByDesRubro", query = "SELECT n FROM NdcRubroDO n WHERE n.desRubro = :desRubro"),
    @NamedQuery(name = "NdcRubroDO.findByFecAltaRegistro", query = "SELECT n FROM NdcRubroDO n WHERE n.fecAltaRegistro = :fecAltaRegistro"),
    @NamedQuery(name = "NdcRubroDO.findByFecActualizadoRegistro", query = "SELECT n FROM NdcRubroDO n WHERE n.fecActualizadoRegistro = :fecActualizadoRegistro"),
    @NamedQuery(name = "NdcRubroDO.findByFecBajaRegistro", query = "SELECT n FROM NdcRubroDO n WHERE n.fecBajaRegistro = :fecBajaRegistro"),
    @NamedQuery(name = "NdcRubroDO.findByIndOrden", query = "SELECT n FROM NdcRubroDO n WHERE n.indOrden = :indOrden")})
public class NdcRubroDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_RUBRO", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator( allocationSize=1,name = "NdcRubro_Id_Seq_Gen", sequenceName = "SEQ_NDCRUBRO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NdcRubro_Id_Seq_Gen")
    private Long cveIdRubro;

    @Size(max = 100)
    @Column(name = "DES_RUBRO", length = 100)
    private String desRubro;
    @Column(name = "FEC_ALTA_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecAltaRegistro;
    @Column(name = "FEC_ACTUALIZADO_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecActualizadoRegistro;
    @Column(name = "FEC_BAJA_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecBajaRegistro;
    @Column(name = "IND_ORDEN")
    private BigInteger indOrden;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cveIdRubro", fetch = FetchType.LAZY)
    private List<NdcPreguntaDO> ndcPreguntaDOList;
    @JoinColumn(name = "CVE_ID_ATESTIGUAMIENTO", referencedColumnName = "CVE_ID_ATESTIGUAMIENTO")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcAtestiguamientoDO cveIdAtestiguamiento;

    public NdcRubroDO() {
    }

    public NdcRubroDO(Long cveIdRubro) {
        this.cveIdRubro = cveIdRubro;
    }

    public Long getCveIdRubro() {
        return cveIdRubro;
    }

    public void setCveIdRubro(Long cveIdRubro) {
        this.cveIdRubro = cveIdRubro;
    }

    public String getDesRubro() {
        return desRubro;
    }

    public void setDesRubro(String desRubro) {
        this.desRubro = desRubro;
    }

    public Date getFecAltaRegistro() {
        return fecAltaRegistro;
    }

    public void setFecAltaRegistro(Date fecAltaRegistro) {
        this.fecAltaRegistro = fecAltaRegistro;
    }

    public Date getFecActualizadoRegistro() {
        return fecActualizadoRegistro;
    }

    public void setFecActualizadoRegistro(Date fecActualizadoRegistro) {
        this.fecActualizadoRegistro = fecActualizadoRegistro;
    }

    public Date getFecBajaRegistro() {
        return fecBajaRegistro;
    }

    public void setFecBajaRegistro(Date fecBajaRegistro) {
        this.fecBajaRegistro = fecBajaRegistro;
    }

    public BigInteger getIndOrden() {
        return indOrden;
    }

    public void setIndOrden(BigInteger indOrden) {
        this.indOrden = indOrden;
    }

    public List<NdcPreguntaDO> getNdcPreguntaDOList() {
        return ndcPreguntaDOList;
    }

    public void setNdcPreguntaDOList(List<NdcPreguntaDO> ndcPreguntaDOList) {
        this.ndcPreguntaDOList = ndcPreguntaDOList;
    }

    public NdcAtestiguamientoDO getCveIdAtestiguamiento() {
        return cveIdAtestiguamiento;
    }

    public void setCveIdAtestiguamiento(NdcAtestiguamientoDO cveIdAtestiguamiento) {
        this.cveIdAtestiguamiento = cveIdAtestiguamiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdRubro != null ? cveIdRubro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdcRubroDO)) {
            return false;
        }
        NdcRubroDO other = (NdcRubroDO) object;
        if ((this.cveIdRubro == null && other.cveIdRubro != null) || (this.cveIdRubro != null && !this.cveIdRubro.equals(other.cveIdRubro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdcRubroDO[ cveIdRubro=" + cveIdRubro + " ]";
    }
    
}
