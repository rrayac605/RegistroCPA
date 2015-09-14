/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;

import java.math.BigInteger;
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
@Table(name = "NDT_MEDIO_CONTACTO")
@NamedQueries({
    @NamedQuery(name = "NdtMedioContacto.findAll", query = "SELECT n FROM NdtMedioContactoDO n"),
    @NamedQuery(name = "NdtMedioContacto.findByCveIdMedioContacto", query = "SELECT n FROM NdtMedioContactoDO n WHERE n.cveIdMedioContacto = :cveIdMedioContacto"),
    @NamedQuery(name = "NdtMedioContacto.findByCorreoElectronico", query = "SELECT n FROM NdtMedioContactoDO n WHERE n.correoElectronico = :correoElectronico"),
    @NamedQuery(name = "NdtMedioContacto.findByTelefono", query = "SELECT n FROM NdtMedioContactoDO n WHERE n.telefono = :telefono"),
    @NamedQuery(name = "NdtMedioContacto.findByIndCorreoBuzonTributario", query = "SELECT n FROM NdtMedioContactoDO n WHERE n.indCorreoBuzonTributario = :indCorreoBuzonTributario"),
    @NamedQuery(name = "NdtMedioContacto.findByFecRegistroAlta", query = "SELECT n FROM NdtMedioContactoDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtMedioContacto.findByFecRegistroBaja", query = "SELECT n FROM NdtMedioContactoDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtMedioContacto.findByFecRegistroActualizado", query = "SELECT n FROM NdtMedioContactoDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdtMedioContactoDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_MEDIO_CONTACTO", nullable = false, precision = 22, scale = 0)
    private Long cveIdMedioContacto;
    @Size(max = 50)
    @Column(name = "CORREO_ELECTRONICO", length = 50)
    private String correoElectronico;
    @Size(max = 18)
    @Column(name = "TELEFONO", length = 18)
    private String telefono;
    @Column(name = "IND_CORREO_BUZON_TRIBUTARIO")
    private BigInteger indCorreoBuzonTributario;
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

    public NdtMedioContactoDO() {
    }

    public NdtMedioContactoDO(Long cveIdMedioContacto) {
        this.cveIdMedioContacto = cveIdMedioContacto;
    }

    public Long getCveIdMedioContacto() {
        return cveIdMedioContacto;
    }

    public void setCveIdMedioContacto(Long cveIdMedioContacto) {
        this.cveIdMedioContacto = cveIdMedioContacto;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public BigInteger getIndCorreoBuzonTributario() {
        return indCorreoBuzonTributario;
    }

    public void setIndCorreoBuzonTributario(BigInteger indCorreoBuzonTributario) {
        this.indCorreoBuzonTributario = indCorreoBuzonTributario;
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
        hash += (cveIdMedioContacto != null ? cveIdMedioContacto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtMedioContactoDO)) {
            return false;
        }
        NdtMedioContactoDO other = (NdtMedioContactoDO) object;
        if ((this.cveIdMedioContacto == null && other.cveIdMedioContacto != null) || (this.cveIdMedioContacto != null && !this.cveIdMedioContacto.equals(other.cveIdMedioContacto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtMedioContacto[ cveIdMedioContacto=" + cveIdMedioContacto + " ]";
    }
    
}
