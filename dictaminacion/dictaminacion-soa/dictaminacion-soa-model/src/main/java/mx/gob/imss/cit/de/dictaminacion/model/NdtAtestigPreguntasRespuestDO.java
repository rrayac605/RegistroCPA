/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.de.dictaminacion.model;

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
@Table(name = "NDT_ATESTIG_PREGUNTAS_RESPUEST")
@NamedQueries({
    @NamedQuery(name = "NdtAtestigPreguntasRespuestDO.findAll", query = "SELECT n FROM NdtAtestigPreguntasRespuestDO n"),
    @NamedQuery(name = "NdtAtestigPreguntasRespuestDO.findByCveIdAtestiguamientos", query = "SELECT n FROM NdtAtestigPreguntasRespuestDO n WHERE n.cveIdAtestiguamientos = :cveIdAtestiguamientos"),
    @NamedQuery(name = "NdtAtestigPreguntasRespuestDO.findByDesObservaciones", query = "SELECT n FROM NdtAtestigPreguntasRespuestDO n WHERE n.desObservaciones = :desObservaciones"),
    @NamedQuery(name = "NdtAtestigPreguntasRespuestDO.findByFecRegistroAlta", query = "SELECT n FROM NdtAtestigPreguntasRespuestDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtAtestigPreguntasRespuestDO.findByFecRegistroBaja", query = "SELECT n FROM NdtAtestigPreguntasRespuestDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtAtestigPreguntasRespuestDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtAtestigPreguntasRespuestDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado"),
    @NamedQuery(name = "NdtAtestigPreguntasRespuestDO.findByCveIdUsuario", query = "SELECT n FROM NdtAtestigPreguntasRespuestDO n WHERE n.cveIdUsuario = :cveIdUsuario")})
public class NdtAtestigPreguntasRespuestDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_ATESTIGUAMIENTOS", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator(name = "NdtAtestigPreguntasRespuest_Id_Seq_Gen", sequenceName = "SEQ_NDTATESTIGPREGUNTASRESPUES", allocationSize=1)
    @GeneratedValue(generator = "NdtAtestigPreguntasRespuest_Id_Seq_Gen")
    private Long cveIdAtestiguamientos;
    @Size(max = 3000)
    @Column(name = "DES_OBSERVACIONES", length = 3000)
    private String desObservaciones;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @Size(max = 20)
    @Column(name = "CVE_ID_USUARIO", length = 20)
    private String cveIdUsuario;
    @JoinColumn(name = "CVE_ID_RUBRO_ATESTIG_DICTAMEN", referencedColumnName = "CVE_ID_RUBRO_ATESTIG_DICTAMEN")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtRubroAtestiguamientoDictDO cveIdRubroAtestigDictamen;
    @JoinColumn(name = "CVE_ID_OPCION_PREGUNTA", referencedColumnName = "CVE_ID_OPCION_PREGUNTA")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcOpcionPreguntaDO cveIdOpcionPregunta;

    public NdtAtestigPreguntasRespuestDO() {
    }

    public NdtAtestigPreguntasRespuestDO(Long cveIdAtestiguamientos) {
        this.cveIdAtestiguamientos = cveIdAtestiguamientos;
    }

    public Long getCveIdAtestiguamientos() {
        return cveIdAtestiguamientos;
    }

    public void setCveIdAtestiguamientos(Long cveIdAtestiguamientos) {
        this.cveIdAtestiguamientos = cveIdAtestiguamientos;
    }

    public String getDesObservaciones() {
        return desObservaciones;
    }

    public void setDesObservaciones(String desObservaciones) {
        this.desObservaciones = desObservaciones;
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

    public String getCveIdUsuario() {
        return cveIdUsuario;
    }

    public void setCveIdUsuario(String cveIdUsuario) {
        this.cveIdUsuario = cveIdUsuario;
    }

    public NdtRubroAtestiguamientoDictDO getCveIdRubroAtestigDictamen() {
        return cveIdRubroAtestigDictamen;
    }

    public void setCveIdRubroAtestigDictamen(NdtRubroAtestiguamientoDictDO cveIdRubroAtestigDictamen) {
        this.cveIdRubroAtestigDictamen = cveIdRubroAtestigDictamen;
    }

    public NdcOpcionPreguntaDO getCveIdOpcionPregunta() {
        return cveIdOpcionPregunta;
    }

    public void setCveIdOpcionPregunta(NdcOpcionPreguntaDO cveIdOpcionPregunta) {
        this.cveIdOpcionPregunta = cveIdOpcionPregunta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdAtestiguamientos != null ? cveIdAtestiguamientos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtAtestigPreguntasRespuestDO)) {
            return false;
        }
        NdtAtestigPreguntasRespuestDO other = (NdtAtestigPreguntasRespuestDO) object;
        if ((this.cveIdAtestiguamientos == null && other.cveIdAtestiguamientos != null) || (this.cveIdAtestiguamientos != null && !this.cveIdAtestiguamientos.equals(other.cveIdAtestiguamientos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtAtestigPreguntasRespuestDO[ cveIdAtestiguamientos=" + cveIdAtestiguamientos + " ]";
    }
    
}
