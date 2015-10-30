/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.ventanilla.model;

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
@Table(name = "NDT_DOCUMENTO_PROBATORIO")
@NamedQueries({
    @NamedQuery(name = "NdtDocumentoProbatorioDO.findAll", query = "SELECT n FROM NdtDocumentoProbatorioDO n"),
    @NamedQuery(name = "NdtDocumentoProbatorioDO.findByCveIdDoctoProbatorio", query = "SELECT n FROM NdtDocumentoProbatorioDO n WHERE n.cveIdDoctoProbatorio = :cveIdDoctoProbatorio"),
    @NamedQuery(name = "NdtDocumentoProbatorioDO.findByUrlDocumentoProb", query = "SELECT n FROM NdtDocumentoProbatorioDO n WHERE n.urlDocumentoProb = :urlDocumentoProb"),
    @NamedQuery(name = "NdtDocumentoProbatorioDO.findByFecRegistroAlta", query = "SELECT n FROM NdtDocumentoProbatorioDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtDocumentoProbatorioDO.findByFecRegistroBaja", query = "SELECT n FROM NdtDocumentoProbatorioDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtDocumentoProbatorioDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtDocumentoProbatorioDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado"),
    @NamedQuery(name = "NdtDocumentoProbatorioDO.findByCveIdUsuario", query = "SELECT n FROM NdtDocumentoProbatorioDO n WHERE n.cveIdUsuario = :cveIdUsuario")})
public class NdtDocumentoProbatorioDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_DOCTO_PROBATORIO", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator(name = "NdtDocumentoProbatorio_Id_Seq_Gen", sequenceName = "SEQ_NDTDOCUMENTOPROBATORIO", allocationSize=1)
    @GeneratedValue(generator = "NdtDocumentoProbatorio_Id_Seq_Gen")
    private Long cveIdDoctoProbatorio;
    @Size(max = 250)
    @Column(name = "URL_DOCUMENTO_PROB", length = 250)
    private String urlDocumentoProb;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @Size(max = 18)
    @Column(name = "CVE_ID_USUARIO", length = 18)
    private String cveIdUsuario;
    @JoinColumn(name = "CVE_ID_CPA_TRAMITE", referencedColumnName = "CVE_ID_CPA_TRAMITE")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtCpaTramiteDO cveIdCpaTramite;
    @JoinColumn(name = "CVE_ID_CPA", referencedColumnName = "CVE_ID_CPA")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtContadorPublicoAutDO cveIdCpa;

    public NdtDocumentoProbatorioDO() {
    }

    public NdtDocumentoProbatorioDO(Long cveIdDoctoProbatorio) {
        this.cveIdDoctoProbatorio = cveIdDoctoProbatorio;
    }

    public Long getCveIdDoctoProbatorio() {
        return cveIdDoctoProbatorio;
    }

    public void setCveIdDoctoProbatorio(Long cveIdDoctoProbatorio) {
        this.cveIdDoctoProbatorio = cveIdDoctoProbatorio;
    }

    public String getUrlDocumentoProb() {
        return urlDocumentoProb;
    }

    public void setUrlDocumentoProb(String urlDocumentoProb) {
        this.urlDocumentoProb = urlDocumentoProb;
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

    public NdtCpaTramiteDO getCveIdCpaTramite() {
        return cveIdCpaTramite;
    }

    public void setCveIdCpaTramite(NdtCpaTramiteDO cveIdCpaTramite) {
        this.cveIdCpaTramite = cveIdCpaTramite;
    }

    public NdtContadorPublicoAutDO getCveIdCpa() {
        return cveIdCpa;
    }

    public void setCveIdCpa(NdtContadorPublicoAutDO cveIdCpa) {
        this.cveIdCpa = cveIdCpa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdDoctoProbatorio != null ? cveIdDoctoProbatorio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtDocumentoProbatorioDO)) {
            return false;
        }
        NdtDocumentoProbatorioDO other = (NdtDocumentoProbatorioDO) object;
        if ((this.cveIdDoctoProbatorio == null && other.cveIdDoctoProbatorio != null) || (this.cveIdDoctoProbatorio != null && !this.cveIdDoctoProbatorio.equals(other.cveIdDoctoProbatorio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtDocumentoProbatorioDO[ cveIdDoctoProbatorio=" + cveIdDoctoProbatorio + " ]";
    }
    
}
