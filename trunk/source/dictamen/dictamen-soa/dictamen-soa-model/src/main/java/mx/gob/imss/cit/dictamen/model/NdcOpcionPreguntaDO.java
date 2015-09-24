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
@Table(name = "NDC_OPCION_PREGUNTA")
@NamedQueries({
    @NamedQuery(name = "NdcOpcionPreguntaDO.findAll", query = "SELECT n FROM NdcOpcionPreguntaDO n"),
    @NamedQuery(name = "NdcOpcionPreguntaDO.findByCveIdOpcionPregunta", query = "SELECT n FROM NdcOpcionPreguntaDO n WHERE n.cveIdOpcionPregunta = :cveIdOpcionPregunta"),
    @NamedQuery(name = "NdcOpcionPreguntaDO.findByDesOpcionPregunta", query = "SELECT n FROM NdcOpcionPreguntaDO n WHERE n.desOpcionPregunta = :desOpcionPregunta"),
    @NamedQuery(name = "NdcOpcionPreguntaDO.findByFecAltaRegistro", query = "SELECT n FROM NdcOpcionPreguntaDO n WHERE n.fecAltaRegistro = :fecAltaRegistro"),
    @NamedQuery(name = "NdcOpcionPreguntaDO.findByFecBajaRegistro", query = "SELECT n FROM NdcOpcionPreguntaDO n WHERE n.fecBajaRegistro = :fecBajaRegistro")})
public class NdcOpcionPreguntaDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_OPCION_PREGUNTA", nullable = false, precision = 22)
    private Long cveIdOpcionPregunta;
    @Size(max = 300)
    @Column(name = "DES_OPCION_PREGUNTA", length = 300)
    private String desOpcionPregunta;
    @Column(name = "FEC_ALTA_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecAltaRegistro;
    @Column(name = "FEC_BAJA_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecBajaRegistro;
    @JoinColumn(name = "CVE_ID_RESPUESTA", referencedColumnName = "CVE_ID_RESPUESTA")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcTipoRespuestaDO cveIdRespuesta;
    @JoinColumn(name = "CVE_ID_PREGUNTA", referencedColumnName = "CVE_ID_PREGUNTA")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcPreguntaDO cveIdPregunta;
    @OneToMany(mappedBy = "cveIdOpcionPregunta", fetch = FetchType.LAZY)
    private List<NdtAtestigPreguntasRespuestDO> ndtAtestigPreguntasRespuestDOList;

    public NdcOpcionPreguntaDO() {
    }

    public NdcOpcionPreguntaDO(Long cveIdOpcionPregunta) {
        this.cveIdOpcionPregunta = cveIdOpcionPregunta;
    }

    public Long getCveIdOpcionPregunta() {
        return cveIdOpcionPregunta;
    }

    public void setCveIdOpcionPregunta(Long cveIdOpcionPregunta) {
        this.cveIdOpcionPregunta = cveIdOpcionPregunta;
    }

    public String getDesOpcionPregunta() {
        return desOpcionPregunta;
    }

    public void setDesOpcionPregunta(String desOpcionPregunta) {
        this.desOpcionPregunta = desOpcionPregunta;
    }

    public Date getFecAltaRegistro() {
        return fecAltaRegistro;
    }

    public void setFecAltaRegistro(Date fecAltaRegistro) {
        this.fecAltaRegistro = fecAltaRegistro;
    }

    public Date getFecBajaRegistro() {
        return fecBajaRegistro;
    }

    public void setFecBajaRegistro(Date fecBajaRegistro) {
        this.fecBajaRegistro = fecBajaRegistro;
    }

    public NdcTipoRespuestaDO getCveIdRespuesta() {
        return cveIdRespuesta;
    }

    public void setCveIdRespuesta(NdcTipoRespuestaDO cveIdRespuesta) {
        this.cveIdRespuesta = cveIdRespuesta;
    }

    public NdcPreguntaDO getCveIdPregunta() {
        return cveIdPregunta;
    }

    public void setCveIdPregunta(NdcPreguntaDO cveIdPregunta) {
        this.cveIdPregunta = cveIdPregunta;
    }

    public List<NdtAtestigPreguntasRespuestDO> getNdtAtestigPreguntasRespuestDOList() {
        return ndtAtestigPreguntasRespuestDOList;
    }

    public void setNdtAtestigPreguntasRespuestDOList(List<NdtAtestigPreguntasRespuestDO> ndtAtestigPreguntasRespuestDOList) {
        this.ndtAtestigPreguntasRespuestDOList = ndtAtestigPreguntasRespuestDOList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdOpcionPregunta != null ? cveIdOpcionPregunta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdcOpcionPreguntaDO)) {
            return false;
        }
        NdcOpcionPreguntaDO other = (NdcOpcionPreguntaDO) object;
        if ((this.cveIdOpcionPregunta == null && other.cveIdOpcionPregunta != null) || (this.cveIdOpcionPregunta != null && !this.cveIdOpcionPregunta.equals(other.cveIdOpcionPregunta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdcOpcionPreguntaDO[ cveIdOpcionPregunta=" + cveIdOpcionPregunta + " ]";
    }
    
}
