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
@Table(name = "NDT_B1_RESPUESTA_ATESTIGUAMIEN")
@NamedQueries({
    @NamedQuery(name = "NdtB1RespuestaAtestiguamien.findAll", query = "SELECT n FROM NdtB1RespuestaAtestiguamienDO n"),
    @NamedQuery(name = "NdtB1RespuestaAtestiguamien.findByCveIdB1RespuestaAtestiguam", query = "SELECT n FROM NdtB1RespuestaAtestiguamienDO n WHERE n.cveIdB1RespuestaAtestiguam = :cveIdB1RespuestaAtestiguam"),
    @NamedQuery(name = "NdtB1RespuestaAtestiguamien.findByValorRespuesta", query = "SELECT n FROM NdtB1RespuestaAtestiguamienDO n WHERE n.valorRespuesta = :valorRespuesta"),
    @NamedQuery(name = "NdtB1RespuestaAtestiguamien.findByObservaciones", query = "SELECT n FROM NdtB1RespuestaAtestiguamienDO n WHERE n.observaciones = :observaciones"),
    @NamedQuery(name = "NdtB1RespuestaAtestiguamien.findByFecRegistroAlta", query = "SELECT n FROM NdtB1RespuestaAtestiguamienDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtB1RespuestaAtestiguamien.findByFecRegistroActualizado", query = "SELECT n FROM NdtB1RespuestaAtestiguamienDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado"),
    @NamedQuery(name = "NdtB1RespuestaAtestiguamien.findByFecRegistroBaja", query = "SELECT n FROM NdtB1RespuestaAtestiguamienDO n WHERE n.fecRegistroBaja = :fecRegistroBaja")})
public class NdtB1RespuestaAtestiguamienDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_B1_RESPUESTA_ATESTIGUAM", nullable = false, precision = 22, scale = 0)
    private Long cveIdB1RespuestaAtestiguam;
    @Size(max = 1000)
    @Column(name = "VALOR_RESPUESTA", length = 1000)
    private String valorRespuesta;
    @Size(max = 3000)
    @Column(name = "OBSERVACIONES", length = 3000)
    private String observaciones;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @OneToMany(mappedBy = "cveIdB1RespuestaAtestiguam", fetch = FetchType.LAZY)
    private List<NdtB1DetPagosOtrosEmpleadDO> ndtB1DetPagosOtrosEmpleadList;
    @JoinColumn(name = "CVE_ID_PATRON_DICTAMEN", referencedColumnName = "CVE_ID_PATRON_DICTAMEN")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtPatronDictamenDO cveIdPatronDictamen;
    @JoinColumn(name = "CVE_ID_OPCION_PREGUNTA", referencedColumnName = "CVE_ID_OPCION_PREGUNTA")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtOpcionPreguntaDO cveIdOpcionPregunta;
    @OneToMany(mappedBy = "cveIdB1RespuestaAtestiguam", fetch = FetchType.LAZY)
    private List<NdtB2DetPrestacionDO> ndtB2DetPrestacionList;
    @OneToMany(mappedBy = "cveIdB1RespuestaAtestiguam", fetch = FetchType.LAZY)
    private List<NdtB1DetOtrosIngXsalarioDO> ndtB1DetOtrosIngXsalarioList;
    @OneToMany(mappedBy = "cveIdB1RespuestaAtestiguam", fetch = FetchType.LAZY)
    private List<NdtB1DetOtrosPagXseparacDO> ndtB1DetOtrosPagXseparacList;

    public NdtB1RespuestaAtestiguamienDO() {
    }

    public NdtB1RespuestaAtestiguamienDO(Long cveIdB1RespuestaAtestiguam) {
        this.cveIdB1RespuestaAtestiguam = cveIdB1RespuestaAtestiguam;
    }

    public Long getCveIdB1RespuestaAtestiguam() {
        return cveIdB1RespuestaAtestiguam;
    }

    public void setCveIdB1RespuestaAtestiguam(Long cveIdB1RespuestaAtestiguam) {
        this.cveIdB1RespuestaAtestiguam = cveIdB1RespuestaAtestiguam;
    }

    public String getValorRespuesta() {
        return valorRespuesta;
    }

    public void setValorRespuesta(String valorRespuesta) {
        this.valorRespuesta = valorRespuesta;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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

    public List<NdtB1DetPagosOtrosEmpleadDO> getNdtB1DetPagosOtrosEmpleadList() {
        return ndtB1DetPagosOtrosEmpleadList;
    }

    public void setNdtB1DetPagosOtrosEmpleadList(List<NdtB1DetPagosOtrosEmpleadDO> ndtB1DetPagosOtrosEmpleadList) {
        this.ndtB1DetPagosOtrosEmpleadList = ndtB1DetPagosOtrosEmpleadList;
    }

    public NdtPatronDictamenDO getCveIdPatronDictamen() {
        return cveIdPatronDictamen;
    }

    public void setCveIdPatronDictamen(NdtPatronDictamenDO cveIdPatronDictamen) {
        this.cveIdPatronDictamen = cveIdPatronDictamen;
    }

    public NdtOpcionPreguntaDO getCveIdOpcionPregunta() {
        return cveIdOpcionPregunta;
    }

    public void setCveIdOpcionPregunta(NdtOpcionPreguntaDO cveIdOpcionPregunta) {
        this.cveIdOpcionPregunta = cveIdOpcionPregunta;
    }

    public List<NdtB2DetPrestacionDO> getNdtB2DetPrestacionList() {
        return ndtB2DetPrestacionList;
    }

    public void setNdtB2DetPrestacionList(List<NdtB2DetPrestacionDO> ndtB2DetPrestacionList) {
        this.ndtB2DetPrestacionList = ndtB2DetPrestacionList;
    }

    public List<NdtB1DetOtrosIngXsalarioDO> getNdtB1DetOtrosIngXsalarioList() {
        return ndtB1DetOtrosIngXsalarioList;
    }

    public void setNdtB1DetOtrosIngXsalarioList(List<NdtB1DetOtrosIngXsalarioDO> ndtB1DetOtrosIngXsalarioList) {
        this.ndtB1DetOtrosIngXsalarioList = ndtB1DetOtrosIngXsalarioList;
    }

    public List<NdtB1DetOtrosPagXseparacDO> getNdtB1DetOtrosPagXseparacList() {
        return ndtB1DetOtrosPagXseparacList;
    }

    public void setNdtB1DetOtrosPagXseparacList(List<NdtB1DetOtrosPagXseparacDO> ndtB1DetOtrosPagXseparacList) {
        this.ndtB1DetOtrosPagXseparacList = ndtB1DetOtrosPagXseparacList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdB1RespuestaAtestiguam != null ? cveIdB1RespuestaAtestiguam.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtB1RespuestaAtestiguamienDO)) {
            return false;
        }
        NdtB1RespuestaAtestiguamienDO other = (NdtB1RespuestaAtestiguamienDO) object;
        if ((this.cveIdB1RespuestaAtestiguam == null && other.cveIdB1RespuestaAtestiguam != null) || (this.cveIdB1RespuestaAtestiguam != null && !this.cveIdB1RespuestaAtestiguam.equals(other.cveIdB1RespuestaAtestiguam))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtB1RespuestaAtestiguamien[ cveIdB1RespuestaAtestiguam=" + cveIdB1RespuestaAtestiguam + " ]";
    }
    
}
