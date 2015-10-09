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
import javax.persistence.GeneratedValue;
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
@Table(name = "NDT_CARGA_DOCUMENTO")
@NamedQueries({
    @NamedQuery(name = "NdtCargaDocumentoDO.findAll", query = "SELECT n FROM NdtCargaDocumentoDO n"),
    @NamedQuery(name = "NdtCargaDocumentoDO.findByCveIdBitacoraCargaAsev", query = "SELECT n FROM NdtCargaDocumentoDO n WHERE n.cveIdBitacoraCargaAsev = :cveIdBitacoraCargaAsev"),
    @NamedQuery(name = "NdtCargaDocumentoDO.findByFecFechaCarga", query = "SELECT n FROM NdtCargaDocumentoDO n WHERE n.fecFechaCarga = :fecFechaCarga"),
    @NamedQuery(name = "NdtCargaDocumentoDO.findByFecRegistroAlta", query = "SELECT n FROM NdtCargaDocumentoDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtCargaDocumentoDO.findByFecRegistroBaja", query = "SELECT n FROM NdtCargaDocumentoDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtCargaDocumentoDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtCargaDocumentoDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado"),
    @NamedQuery(name = "NdtCargaDocumentoDO.findByCveIdUsuario", query = "SELECT n FROM NdtCargaDocumentoDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtCargaDocumentoDO.findByCvePatronRfcCpaPatron", query =  "SELECT A "
    		+"FROM NdtCargaDocumentoDO A, "
    		+"NdcEstadoCargaDocumentoDO E, "
    		+"NdcAseveracionesDO F, "
    		+"NdtPatronDictamenDO B, "
    		+"NdtPatronDictamenCpaDO C, "
    		+"NdtContadorPublicoAutDO D "
    		+"WHERE E.cveIdEstadoCargoDoc = A.cveIdEstadoCargoDoc.cveIdEstadoCargoDoc"
    		+" and F.cveIdAseveracion = A.cveIdAseveracion.cveIdAseveracion "
    		+" and A.cveIdPatronDictamen.cveIdPatronDictamen = B.cveIdPatronDictamen "
    		+" and C.cveIdPatronDictamen.cveIdPatronDictamen = B.cveIdPatronDictamen"
    		+" and D.cveIdCpa = C.cveIdCpa.cveIdCpa "
    	    +" and A.cveIdPatronDictamen.cveIdPatronDictamen =:cveIdPatronDictamen"
    	    +" and D.cveIdCpa =:cveIdCpa"
    		+" and B.desRfc =:desRfc"),
    @NamedQuery(name = "NdtCargaDocumentoDO.findByCveIdPatronDictamenAndCveIdAseveracion", query = "SELECT n FROM NdtCargaDocumentoDO n WHERE n.cveIdAseveracion.cveIdAseveracion = :cveIdAseveracion and n.cveIdPatronDictamen.cveIdPatronDictamen = :cveIdPatronDictamen")})
public class NdtCargaDocumentoDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_BITACORA_CARGA_ASEV", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator(name = "NdtCargaDocumento_Id_Seq_Gen", sequenceName = "SEQ_NDTCARGADOCUMENTO", allocationSize=1)
    @GeneratedValue(generator = "NdtCargaDocumento_Id_Seq_Gen")
    private Long cveIdBitacoraCargaAsev;
    @Column(name = "FEC_FECHA_CARGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecFechaCarga;
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
    @OneToMany(mappedBy = "cveIdBitacoraCargaAsev", fetch = FetchType.LAZY)
    private List<NdtBitacoraErroresDO> ndtBitacoraErroresDOList;
    @JoinColumn(name = "CVE_ID_PATRON_DICTAMEN", referencedColumnName = "CVE_ID_PATRON_DICTAMEN")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtPatronDictamenDO cveIdPatronDictamen;
    @JoinColumn(name = "CVE_ID_TIPO_DOCUMENTO", referencedColumnName = "CVE_ID_TIPO_DOCUMENTO")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcTipoDocumentoDO cveIdTipoDocumento;
    @JoinColumn(name = "CVE_ID_ESTADO_CARGO_DOC", referencedColumnName = "CVE_ID_ESTADO_CARGO_DOC")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcEstadoCargaDocumentoDO cveIdEstadoCargoDoc;
    @JoinColumn(name = "CVE_ID_ASEVERACION", referencedColumnName = "CVE_ID_ASEVERACION")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcAseveracionesDO cveIdAseveracion;

    public NdtCargaDocumentoDO() {
    }

    public NdtCargaDocumentoDO(Long cveIdBitacoraCargaAsev) {
        this.cveIdBitacoraCargaAsev = cveIdBitacoraCargaAsev;
    }

    public Long getCveIdBitacoraCargaAsev() {
        return cveIdBitacoraCargaAsev;
    }

    public void setCveIdBitacoraCargaAsev(Long cveIdBitacoraCargaAsev) {
        this.cveIdBitacoraCargaAsev = cveIdBitacoraCargaAsev;
    }

    public Date getFecFechaCarga() {
        return fecFechaCarga;
    }

    public void setFecFechaCarga(Date fecFechaCarga) {
        this.fecFechaCarga = fecFechaCarga;
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

    public List<NdtBitacoraErroresDO> getNdtBitacoraErroresDOList() {
        return ndtBitacoraErroresDOList;
    }

    public void setNdtBitacoraErroresDOList(List<NdtBitacoraErroresDO> ndtBitacoraErroresDOList) {
        this.ndtBitacoraErroresDOList = ndtBitacoraErroresDOList;
    }

    public NdtPatronDictamenDO getCveIdPatronDictamen() {
        return cveIdPatronDictamen;
    }

    public void setCveIdPatronDictamen(NdtPatronDictamenDO cveIdPatronDictamen) {
        this.cveIdPatronDictamen = cveIdPatronDictamen;
    }

    public NdcTipoDocumentoDO getCveIdTipoDocumento() {
        return cveIdTipoDocumento;
    }

    public void setCveIdTipoDocumento(NdcTipoDocumentoDO cveIdTipoDocumento) {
        this.cveIdTipoDocumento = cveIdTipoDocumento;
    }

    public NdcEstadoCargaDocumentoDO getCveIdEstadoCargoDoc() {
        return cveIdEstadoCargoDoc;
    }

    public void setCveIdEstadoCargoDoc(NdcEstadoCargaDocumentoDO cveIdEstadoCargoDoc) {
        this.cveIdEstadoCargoDoc = cveIdEstadoCargoDoc;
    }

    public NdcAseveracionesDO getCveIdAseveracion() {
        return cveIdAseveracion;
    }

    public void setCveIdAseveracion(NdcAseveracionesDO cveIdAseveracion) {
        this.cveIdAseveracion = cveIdAseveracion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdBitacoraCargaAsev != null ? cveIdBitacoraCargaAsev.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtCargaDocumentoDO)) {
            return false;
        }
        NdtCargaDocumentoDO other = (NdtCargaDocumentoDO) object;
        if ((this.cveIdBitacoraCargaAsev == null && other.cveIdBitacoraCargaAsev != null) || (this.cveIdBitacoraCargaAsev != null && !this.cveIdBitacoraCargaAsev.equals(other.cveIdBitacoraCargaAsev))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtCargaDocumentoDO[ cveIdBitacoraCargaAsev=" + cveIdBitacoraCargaAsev + " ]";
    }
    
}
