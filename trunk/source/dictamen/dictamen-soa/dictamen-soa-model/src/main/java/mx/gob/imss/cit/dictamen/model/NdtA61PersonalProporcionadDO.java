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
@Table(name = "NDT_A6_1_PERSONAL_PROPORCIONAD")
@NamedQueries({
    @NamedQuery(name = "NdtA61PersonalProporcionadDO.findAll", query = "SELECT n FROM NdtA61PersonalProporcionadDO n"),
    @NamedQuery(name = "NdtA61PersonalProporcionadDO.findByCveIdA61Listadopersonal", query = "SELECT n FROM NdtA61PersonalProporcionadDO n WHERE n.cveIdA61Listadopersonal = :cveIdA61Listadopersonal"),
    @NamedQuery(name = "NdtA61PersonalProporcionadDO.findByDesFolioSipress", query = "SELECT n FROM NdtA61PersonalProporcionadDO n WHERE n.desFolioSipress = :desFolioSipress"),
    @NamedQuery(name = "NdtA61PersonalProporcionadDO.findByNomPrimerApellidoTrab", query = "SELECT n FROM NdtA61PersonalProporcionadDO n WHERE n.nomPrimerApellidoTrab = :nomPrimerApellidoTrab"),
    @NamedQuery(name = "NdtA61PersonalProporcionadDO.findByNomSegundoApellidoTrab", query = "SELECT n FROM NdtA61PersonalProporcionadDO n WHERE n.nomSegundoApellidoTrab = :nomSegundoApellidoTrab"),
    @NamedQuery(name = "NdtA61PersonalProporcionadDO.findByNomNombreTrab", query = "SELECT n FROM NdtA61PersonalProporcionadDO n WHERE n.nomNombreTrab = :nomNombreTrab"),
    @NamedQuery(name = "NdtA61PersonalProporcionadDO.findByNumNssTrab", query = "SELECT n FROM NdtA61PersonalProporcionadDO n WHERE n.numNssTrab = :numNssTrab"),
    @NamedQuery(name = "NdtA61PersonalProporcionadDO.findByRfcTrab", query = "SELECT n FROM NdtA61PersonalProporcionadDO n WHERE n.rfcTrab = :rfcTrab"),
    @NamedQuery(name = "NdtA61PersonalProporcionadDO.findByCurpTrab", query = "SELECT n FROM NdtA61PersonalProporcionadDO n WHERE n.curpTrab = :curpTrab"),
    @NamedQuery(name = "NdtA61PersonalProporcionadDO.findByCveIdUsuario", query = "SELECT n FROM NdtA61PersonalProporcionadDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtA61PersonalProporcionadDO.findByFecRegistroAlta", query = "SELECT n FROM NdtA61PersonalProporcionadDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtA61PersonalProporcionadDO.findByFecRegistroBaja", query = "SELECT n FROM NdtA61PersonalProporcionadDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtA61PersonalProporcionadDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtA61PersonalProporcionadDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdtA61PersonalProporcionadDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_A61_LISTADOPERSONAL", nullable = false, precision = 22, scale = 0)
    private Long cveIdA61Listadopersonal;
    @Size(max = 30)
    @Column(name = "DES_FOLIO_SIPRESS", length = 30)
    private String desFolioSipress;
    @Size(max = 100)
    @Column(name = "NOM_PRIMER_APELLIDO_TRAB", length = 100)
    private String nomPrimerApellidoTrab;
    @Size(max = 100)
    @Column(name = "NOM_SEGUNDO_APELLIDO_TRAB", length = 100)
    private String nomSegundoApellidoTrab;
    @Size(max = 100)
    @Column(name = "NOM_NOMBRE_TRAB", length = 100)
    private String nomNombreTrab;
    @Size(max = 11)
    @Column(name = "NUM_NSS_TRAB", length = 11)
    private String numNssTrab;
    @Size(max = 13)
    @Column(name = "RFC_TRAB", length = 13)
    private String rfcTrab;
    @Size(max = 18)
    @Column(name = "CURP_TRAB", length = 18)
    private String curpTrab;
    @Size(max = 20)
    @Column(name = "CVE_ID_USUARIO", length = 20)
    private String cveIdUsuario;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @JoinColumn(name = "CVE_ID_PATRON_DICTAMEN", referencedColumnName = "CVE_ID_PATRON_DICTAMEN")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtPatronDictamenDO cveIdPatronDictamen;

    public NdtA61PersonalProporcionadDO() {
    }

    public NdtA61PersonalProporcionadDO(Long cveIdA61Listadopersonal) {
        this.cveIdA61Listadopersonal = cveIdA61Listadopersonal;
    }

    public Long getCveIdA61Listadopersonal() {
        return cveIdA61Listadopersonal;
    }

    public void setCveIdA61Listadopersonal(Long cveIdA61Listadopersonal) {
        this.cveIdA61Listadopersonal = cveIdA61Listadopersonal;
    }

    public String getDesFolioSipress() {
        return desFolioSipress;
    }

    public void setDesFolioSipress(String desFolioSipress) {
        this.desFolioSipress = desFolioSipress;
    }

    public String getNomPrimerApellidoTrab() {
        return nomPrimerApellidoTrab;
    }

    public void setNomPrimerApellidoTrab(String nomPrimerApellidoTrab) {
        this.nomPrimerApellidoTrab = nomPrimerApellidoTrab;
    }

    public String getNomSegundoApellidoTrab() {
        return nomSegundoApellidoTrab;
    }

    public void setNomSegundoApellidoTrab(String nomSegundoApellidoTrab) {
        this.nomSegundoApellidoTrab = nomSegundoApellidoTrab;
    }

    public String getNomNombreTrab() {
        return nomNombreTrab;
    }

    public void setNomNombreTrab(String nomNombreTrab) {
        this.nomNombreTrab = nomNombreTrab;
    }

    public String getNumNssTrab() {
        return numNssTrab;
    }

    public void setNumNssTrab(String numNssTrab) {
        this.numNssTrab = numNssTrab;
    }

    public String getRfcTrab() {
        return rfcTrab;
    }

    public void setRfcTrab(String rfcTrab) {
        this.rfcTrab = rfcTrab;
    }

    public String getCurpTrab() {
        return curpTrab;
    }

    public void setCurpTrab(String curpTrab) {
        this.curpTrab = curpTrab;
    }

    public String getCveIdUsuario() {
        return cveIdUsuario;
    }

    public void setCveIdUsuario(String cveIdUsuario) {
        this.cveIdUsuario = cveIdUsuario;
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

    public NdtPatronDictamenDO getCveIdPatronDictamen() {
        return cveIdPatronDictamen;
    }

    public void setCveIdPatronDictamen(NdtPatronDictamenDO cveIdPatronDictamen) {
        this.cveIdPatronDictamen = cveIdPatronDictamen;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdA61Listadopersonal != null ? cveIdA61Listadopersonal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtA61PersonalProporcionadDO)) {
            return false;
        }
        NdtA61PersonalProporcionadDO other = (NdtA61PersonalProporcionadDO) object;
        if ((this.cveIdA61Listadopersonal == null && other.cveIdA61Listadopersonal != null) || (this.cveIdA61Listadopersonal != null && !this.cveIdA61Listadopersonal.equals(other.cveIdA61Listadopersonal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtA61PersonalProporcionadDO[ cveIdA61Listadopersonal=" + cveIdA61Listadopersonal + " ]";
    }
    
}
