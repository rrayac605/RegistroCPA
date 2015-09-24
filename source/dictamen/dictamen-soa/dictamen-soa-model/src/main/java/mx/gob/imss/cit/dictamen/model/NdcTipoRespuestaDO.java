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
@Table(name = "NDC_TIPO_RESPUESTA")
@NamedQueries({
    @NamedQuery(name = "NdcTipoRespuestaDO.findAll", query = "SELECT n FROM NdcTipoRespuestaDO n"),
    @NamedQuery(name = "NdcTipoRespuestaDO.findByCveIdRespuesta", query = "SELECT n FROM NdcTipoRespuestaDO n WHERE n.cveIdRespuesta = :cveIdRespuesta"),
    @NamedQuery(name = "NdcTipoRespuestaDO.findByDesTipoRespuesta", query = "SELECT n FROM NdcTipoRespuestaDO n WHERE n.desTipoRespuesta = :desTipoRespuesta"),
    @NamedQuery(name = "NdcTipoRespuestaDO.findByFecRegistroAlta", query = "SELECT n FROM NdcTipoRespuestaDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdcTipoRespuestaDO.findByFecRegistroActualizado", query = "SELECT n FROM NdcTipoRespuestaDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado"),
    @NamedQuery(name = "NdcTipoRespuestaDO.findByFecRegistroBaja", query = "SELECT n FROM NdcTipoRespuestaDO n WHERE n.fecRegistroBaja = :fecRegistroBaja")})
public class NdcTipoRespuestaDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_RESPUESTA", nullable = false, precision = 22, scale = 0)
    private Long cveIdRespuesta;
    @Size(max = 50)
    @Column(name = "DES_TIPO_RESPUESTA", length = 50)
    private String desTipoRespuesta;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @OneToMany(mappedBy = "cveIdRespuesta", fetch = FetchType.LAZY)
    private List<NdcOpcionPreguntaDO> ndcOpcionPreguntaDOList;

    public NdcTipoRespuestaDO() {
    }

    public NdcTipoRespuestaDO(Long cveIdRespuesta) {
        this.cveIdRespuesta = cveIdRespuesta;
    }

    public Long getCveIdRespuesta() {
        return cveIdRespuesta;
    }

    public void setCveIdRespuesta(Long cveIdRespuesta) {
        this.cveIdRespuesta = cveIdRespuesta;
    }

    public String getDesTipoRespuesta() {
        return desTipoRespuesta;
    }

    public void setDesTipoRespuesta(String desTipoRespuesta) {
        this.desTipoRespuesta = desTipoRespuesta;
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

    public List<NdcOpcionPreguntaDO> getNdcOpcionPreguntaDOList() {
        return ndcOpcionPreguntaDOList;
    }

    public void setNdcOpcionPreguntaDOList(List<NdcOpcionPreguntaDO> ndcOpcionPreguntaDOList) {
        this.ndcOpcionPreguntaDOList = ndcOpcionPreguntaDOList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdRespuesta != null ? cveIdRespuesta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdcTipoRespuestaDO)) {
            return false;
        }
        NdcTipoRespuestaDO other = (NdcTipoRespuestaDO) object;
        if ((this.cveIdRespuesta == null && other.cveIdRespuesta != null) || (this.cveIdRespuesta != null && !this.cveIdRespuesta.equals(other.cveIdRespuesta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdcTipoRespuestaDO[ cveIdRespuesta=" + cveIdRespuesta + " ]";
    }
    
}
