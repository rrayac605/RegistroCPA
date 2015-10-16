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
@Table(name = "NDC_PREGUNTA")
@NamedQueries({
    @NamedQuery(name = "NdcPreguntaDO.findAll", query = "SELECT n FROM NdcPreguntaDO n"),
    @NamedQuery(name = "NdcPreguntaDO.findByCveIdPregunta", query = "SELECT n FROM NdcPreguntaDO n WHERE n.cveIdPregunta = :cveIdPregunta"),
    @NamedQuery(name = "NdcPreguntaDO.findByDesPregunta", query = "SELECT n FROM NdcPreguntaDO n WHERE n.desPregunta = :desPregunta"),
    @NamedQuery(name = "NdcPreguntaDO.findByFecRegistroAlta", query = "SELECT n FROM NdcPreguntaDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdcPreguntaDO.findByFecRegistroActualizado", query = "SELECT n FROM NdcPreguntaDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado"),
    @NamedQuery(name = "NdcPreguntaDO.findByFecRegistroBaja", query = "SELECT n FROM NdcPreguntaDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdcPreguntaDO.findByIndOrden", query = "SELECT n FROM NdcPreguntaDO n WHERE n.indOrden = :indOrden")})
public class NdcPreguntaDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_PREGUNTA", nullable = false, precision = 22)
    private Long cveIdPregunta;
    @Size(max = 500)
    @Column(name = "DES_PREGUNTA", length = 500)
    private String desPregunta;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "IND_ORDEN")
    private Integer indOrden;
    @JoinColumn(name = "CVE_ID_RUBRO", referencedColumnName = "CVE_ID_RUBRO", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private NdcRubroDO cveIdRubro;
    @OneToMany(mappedBy = "cveIdPreguntaPadre", fetch = FetchType.LAZY)
    private List<NdcPreguntaDO> ndcPreguntaDOList;
    @JoinColumn(name = "CVE_ID_PREGUNTA_PADRE", referencedColumnName = "CVE_ID_PREGUNTA")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcPreguntaDO cveIdPreguntaPadre;
    @OneToMany(mappedBy = "cveIdPregunta", fetch = FetchType.EAGER)
    private List<NdcOpcionPreguntaDO> ndcOpcionesPregunta;

    public NdcPreguntaDO() {
    }

    public NdcPreguntaDO(Long cveIdPregunta) {
        this.cveIdPregunta = cveIdPregunta;
    }

    public Long getCveIdPregunta() {
        return cveIdPregunta;
    }

    public void setCveIdPregunta(Long cveIdPregunta) {
        this.cveIdPregunta = cveIdPregunta;
    }

    public String getDesPregunta() {
        return desPregunta;
    }

    public void setDesPregunta(String desPregunta) {
        this.desPregunta = desPregunta;
    }

    public Date getFecRegistroAlta() {
        return fecRegistroAlta;
    }

    public void setFecRegistroAlta(Date fecRegistroAlta) {
        this.fecRegistroAlta = fecRegistroAlta;
    }

    public Date getFecRegistroActualizado() {
        return fecRegistroActualizado;
    }

    public void setFecRegistroActualizado(Date fecRegistroActualizado) {
        this.fecRegistroActualizado = fecRegistroActualizado;
    }

    public Date getFecRegistroBaja() {
        return fecRegistroBaja;
    }

    public void setFecRegistroBaja(Date fecRegistroBaja) {
        this.fecRegistroBaja = fecRegistroBaja;
    }

    public Integer getIndOrden() {
        return indOrden;
    }

    public void setIndOrden(Integer indOrden) {
        this.indOrden = indOrden;
    }

    public NdcRubroDO getCveIdRubro() {
        return cveIdRubro;
    }

    public void setCveIdRubro(NdcRubroDO cveIdRubro) {
        this.cveIdRubro = cveIdRubro;
    }

    public List<NdcPreguntaDO> getNdcPreguntaDOList() {
        return ndcPreguntaDOList;
    }

    public void setNdcPreguntaDOList(List<NdcPreguntaDO> ndcPreguntaDOList) {
        this.ndcPreguntaDOList = ndcPreguntaDOList;
    }

    public NdcPreguntaDO getCveIdPreguntaPadre() {
        return cveIdPreguntaPadre;
    }

    public void setCveIdPreguntaPadre(NdcPreguntaDO cveIdPreguntaPadre) {
        this.cveIdPreguntaPadre = cveIdPreguntaPadre;
    }

    public List<NdcOpcionPreguntaDO> getNdcOpcionesPregunta() {
        return ndcOpcionesPregunta;
    }

    public void setNdcOpcionesPregunta(List<NdcOpcionPreguntaDO> ndcOpcionesPregunta) {
        this.ndcOpcionesPregunta = ndcOpcionesPregunta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdPregunta != null ? cveIdPregunta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdcPreguntaDO)) {
            return false;
        }
        NdcPreguntaDO other = (NdcPreguntaDO) object;
        if ((this.cveIdPregunta == null && other.cveIdPregunta != null) || (this.cveIdPregunta != null && !this.cveIdPregunta.equals(other.cveIdPregunta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdcPreguntaDO[ cveIdPregunta=" + cveIdPregunta + " ]";
    }
    
}
