/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;


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
@Table(name = "NDT_MODELO_OPINION")
@NamedQueries({
    @NamedQuery(name = "NdtModeloOpinionDO.findAll", query = "SELECT n FROM NdtModeloOpinionDO n"),
    @NamedQuery(name = "NdtModeloOpinionDO.findByCveIdModeloOpinion", query = "SELECT n FROM NdtModeloOpinionDO n WHERE n.cveIdModeloOpinion = :cveIdModeloOpinion"),
    @NamedQuery(name = "NdtModeloOpinionDO.findByFecFechaPagoPrimerpago", query = "SELECT n FROM NdtModeloOpinionDO n WHERE n.fecFechaPagoPrimerpago = :fecFechaPagoPrimerpago"),
    @NamedQuery(name = "NdtModeloOpinionDO.findByNumNumeroConvenio", query = "SELECT n FROM NdtModeloOpinionDO n WHERE n.numNumeroConvenio = :numNumeroConvenio"),
    @NamedQuery(name = "NdtModeloOpinionDO.findByFecFechaConvenio", query = "SELECT n FROM NdtModeloOpinionDO n WHERE n.fecFechaConvenio = :fecFechaConvenio"),
    @NamedQuery(name = "NdtModeloOpinionDO.findByNumParcialidades", query = "SELECT n FROM NdtModeloOpinionDO n WHERE n.numParcialidades = :numParcialidades"),
    @NamedQuery(name = "NdtModeloOpinionDO.findByDesObservaciones", query = "SELECT n FROM NdtModeloOpinionDO n WHERE n.desObservaciones = :desObservaciones"),
    @NamedQuery(name = "NdtModeloOpinionDO.findByDesRubros", query = "SELECT n FROM NdtModeloOpinionDO n WHERE n.desRubros = :desRubros"),
    @NamedQuery(name = "NdtModeloOpinionDO.findByDesConceptos", query = "SELECT n FROM NdtModeloOpinionDO n WHERE n.desConceptos = :desConceptos"),
    @NamedQuery(name = "NdtModeloOpinionDO.findByDesMotivoSalvedad", query = "SELECT n FROM NdtModeloOpinionDO n WHERE n.desMotivoSalvedad = :desMotivoSalvedad"),
    @NamedQuery(name = "NdtModeloOpinionDO.findByDesLimitacionesInformacion", query = "SELECT n FROM NdtModeloOpinionDO n WHERE n.desLimitacionesInformacion = :desLimitacionesInformacion"),
    @NamedQuery(name = "NdtModeloOpinionDO.findByFecRegistroAlta", query = "SELECT n FROM NdtModeloOpinionDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtModeloOpinionDO.findByFecRegistroBaja", query = "SELECT n FROM NdtModeloOpinionDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtModeloOpinionDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtModeloOpinionDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado"),
    @NamedQuery(name = "NdtModeloOpinionDO.findByCveIdUsuario", query = "SELECT n FROM NdtModeloOpinionDO n WHERE n.cveIdUsuario = :cveIdUsuario")})
public class NdtModeloOpinionDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_MODELO_OPINION", nullable = false, precision = 22, scale = 0)
    private Long cveIdModeloOpinion;
    @Column(name = "FEC_FECHA_PAGO_PRIMERPAGO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecFechaPagoPrimerpago;
    @Size(max = 100)
    @Column(name = "NUM_NUMERO_CONVENIO", length = 100)
    private String numNumeroConvenio;
    @Column(name = "FEC_FECHA_CONVENIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecFechaConvenio;
    @Column(name = "NUM_PARCIALIDADES")
    private Integer numParcialidades;
    @Size(max = 3000)
    @Column(name = "DES_OBSERVACIONES", length = 3000)
    private String desObservaciones;
    @Size(max = 250)
    @Column(name = "DES_RUBROS", length = 250)
    private String desRubros;
    @Size(max = 250)
    @Column(name = "DES_CONCEPTOS", length = 250)
    private String desConceptos;
    @Size(max = 3000)
    @Column(name = "DES_MOTIVO_SALVEDAD", length = 3000)
    private String desMotivoSalvedad;
    @Size(max = 3000)
    @Column(name = "DES_LIMITACIONES_INFORMACION", length = 3000)
    private String desLimitacionesInformacion;
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
    @JoinColumn(name = "CVE_ID_TIPO_PAGO", referencedColumnName = "CVE_ID_TIPO_PAGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcTipoPagoDO cveIdTipoPago;
    @JoinColumn(name = "CVE_ID_TIPO_OPINION", referencedColumnName = "CVE_ID_TIPO_OPINION")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcTipoModeloOpinionDO cveIdTipoOpinion;
    @JoinColumn(name = "CVE_ID_FORMA_PAGO", referencedColumnName = "CVE_ID_FORMA_PAGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcFormaPagoDO cveIdFormaPago;

    public NdtModeloOpinionDO() {
    }

    public NdtModeloOpinionDO(Long cveIdModeloOpinion) {
        this.cveIdModeloOpinion = cveIdModeloOpinion;
    }

    public Long getCveIdModeloOpinion() {
        return cveIdModeloOpinion;
    }

    public void setCveIdModeloOpinion(Long cveIdModeloOpinion) {
        this.cveIdModeloOpinion = cveIdModeloOpinion;
    }

    public Date getFecFechaPagoPrimerpago() {
        return fecFechaPagoPrimerpago;
    }

    public void setFecFechaPagoPrimerpago(Date fecFechaPagoPrimerpago) {
        this.fecFechaPagoPrimerpago = fecFechaPagoPrimerpago;
    }

    public String getNumNumeroConvenio() {
        return numNumeroConvenio;
    }

    public void setNumNumeroConvenio(String numNumeroConvenio) {
        this.numNumeroConvenio = numNumeroConvenio;
    }

    public Date getFecFechaConvenio() {
        return fecFechaConvenio;
    }

    public void setFecFechaConvenio(Date fecFechaConvenio) {
        this.fecFechaConvenio = fecFechaConvenio;
    }

    public Integer getNumParcialidades() {
        return numParcialidades;
    }

    public void setNumParcialidades(Integer numParcialidades) {
        this.numParcialidades = numParcialidades;
    }

    public String getDesObservaciones() {
        return desObservaciones;
    }

    public void setDesObservaciones(String desObservaciones) {
        this.desObservaciones = desObservaciones;
    }

    public String getDesRubros() {
        return desRubros;
    }

    public void setDesRubros(String desRubros) {
        this.desRubros = desRubros;
    }

    public String getDesConceptos() {
        return desConceptos;
    }

    public void setDesConceptos(String desConceptos) {
        this.desConceptos = desConceptos;
    }

    public String getDesMotivoSalvedad() {
        return desMotivoSalvedad;
    }

    public void setDesMotivoSalvedad(String desMotivoSalvedad) {
        this.desMotivoSalvedad = desMotivoSalvedad;
    }

    public String getDesLimitacionesInformacion() {
        return desLimitacionesInformacion;
    }

    public void setDesLimitacionesInformacion(String desLimitacionesInformacion) {
        this.desLimitacionesInformacion = desLimitacionesInformacion;
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

    public NdcTipoPagoDO getCveIdTipoPago() {
        return cveIdTipoPago;
    }

    public void setCveIdTipoPago(NdcTipoPagoDO cveIdTipoPago) {
        this.cveIdTipoPago = cveIdTipoPago;
    }

    public NdcTipoModeloOpinionDO getCveIdTipoOpinion() {
        return cveIdTipoOpinion;
    }

    public void setCveIdTipoOpinion(NdcTipoModeloOpinionDO cveIdTipoOpinion) {
        this.cveIdTipoOpinion = cveIdTipoOpinion;
    }

    public NdcFormaPagoDO getCveIdFormaPago() {
        return cveIdFormaPago;
    }

    public void setCveIdFormaPago(NdcFormaPagoDO cveIdFormaPago) {
        this.cveIdFormaPago = cveIdFormaPago;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdModeloOpinion != null ? cveIdModeloOpinion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtModeloOpinionDO)) {
            return false;
        }
        NdtModeloOpinionDO other = (NdtModeloOpinionDO) object;
        if ((this.cveIdModeloOpinion == null && other.cveIdModeloOpinion != null) || (this.cveIdModeloOpinion != null && !this.cveIdModeloOpinion.equals(other.cveIdModeloOpinion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtModeloOpinionDO[ cveIdModeloOpinion=" + cveIdModeloOpinion + " ]";
    }
    
}
