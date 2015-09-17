/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "NDT_ATESTIGUAMIENTO_PREGUNTAS")
@NamedQueries({
    @NamedQuery(name = "NdtAtestiguamientoPreguntasDO.findAll", query = "SELECT n FROM NdtAtestiguamientoPreguntasDO n"),
    @NamedQuery(name = "NdtAtestiguamientoPreguntasDO.findByCveIdAtestiguamientos", query = "SELECT n FROM NdtAtestiguamientoPreguntasDO n WHERE n.cveIdAtestiguamientos = :cveIdAtestiguamientos"),
    @NamedQuery(name = "NdtAtestiguamientoPreguntasDO.findByFecRegistroAlta", query = "SELECT n FROM NdtAtestiguamientoPreguntasDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtAtestiguamientoPreguntasDO.findByFecRegistroBaja", query = "SELECT n FROM NdtAtestiguamientoPreguntasDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtAtestiguamientoPreguntasDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtAtestiguamientoPreguntasDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado"),
    @NamedQuery(name = "NdtAtestiguamientoPreguntasDO.findByCveIdUsuario", query = "SELECT n FROM NdtAtestiguamientoPreguntasDO n WHERE n.cveIdUsuario = :cveIdUsuario")})
public class NdtAtestiguamientoPreguntasDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_ATESTIGUAMIENTOS", nullable = false, precision = 22, scale = 0)
    private BigDecimal cveIdAtestiguamientos;
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
    @JoinColumn(name = "CVE_ID_PATRON_DICTAMEN", referencedColumnName = "CVE_ID_PATRON_DICTAMEN")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtPatronDictamenDO cveIdPatronDictamen;
    @JoinColumn(name = "CVE_ID_OPCION_PREGUNTA", referencedColumnName = "CVE_ID_OPCION_PREGUNTA")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcOpcionPreguntaDO cveIdOpcionPregunta;
    @JoinColumn(name = "CVE_ID_ATESTIGUAMIENTO", referencedColumnName = "CVE_ID_ATESTIGUAMIENTO")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcAtestiguamientoDO cveIdAtestiguamiento;

    public NdtAtestiguamientoPreguntasDO() {
    }

    public NdtAtestiguamientoPreguntasDO(BigDecimal cveIdAtestiguamientos) {
        this.cveIdAtestiguamientos = cveIdAtestiguamientos;
    }

    public BigDecimal getCveIdAtestiguamientos() {
        return cveIdAtestiguamientos;
    }

    public void setCveIdAtestiguamientos(BigDecimal cveIdAtestiguamientos) {
        this.cveIdAtestiguamientos = cveIdAtestiguamientos;
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

    public NdtPatronDictamenDO getCveIdPatronDictamen() {
        return cveIdPatronDictamen;
    }

    public void setCveIdPatronDictamen(NdtPatronDictamenDO cveIdPatronDictamen) {
        this.cveIdPatronDictamen = cveIdPatronDictamen;
    }

    public NdcOpcionPreguntaDO getCveIdOpcionPregunta() {
        return cveIdOpcionPregunta;
    }

    public void setCveIdOpcionPregunta(NdcOpcionPreguntaDO cveIdOpcionPregunta) {
        this.cveIdOpcionPregunta = cveIdOpcionPregunta;
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
        hash += (cveIdAtestiguamientos != null ? cveIdAtestiguamientos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtAtestiguamientoPreguntasDO)) {
            return false;
        }
        NdtAtestiguamientoPreguntasDO other = (NdtAtestiguamientoPreguntasDO) object;
        if ((this.cveIdAtestiguamientos == null && other.cveIdAtestiguamientos != null) || (this.cveIdAtestiguamientos != null && !this.cveIdAtestiguamientos.equals(other.cveIdAtestiguamientos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtAtestiguamientoPreguntasDO[ cveIdAtestiguamientos=" + cveIdAtestiguamientos + " ]";
    }
    
}
