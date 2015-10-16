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
@Table(name = "NDT_A8_BALANZA_COMPROBACION")
@NamedQueries({
    @NamedQuery(name = "NdtA8BalanzaComprobacionDO.findAll", query = "SELECT n FROM NdtA8BalanzaComprobacionDO n"),
    @NamedQuery(name = "NdtA8BalanzaComprobacionDO.findByCveIdA8BalanzaComprobacion", query = "SELECT n FROM NdtA8BalanzaComprobacionDO n WHERE n.cveIdA8BalanzaComprobacion = :cveIdA8BalanzaComprobacion"),
    @NamedQuery(name = "NdtA8BalanzaComprobacionDO.findByNumNivel", query = "SELECT n FROM NdtA8BalanzaComprobacionDO n WHERE n.numNivel = :numNivel"),
    @NamedQuery(name = "NdtA8BalanzaComprobacionDO.findByNumCuenta", query = "SELECT n FROM NdtA8BalanzaComprobacionDO n WHERE n.numCuenta = :numCuenta"),
    @NamedQuery(name = "NdtA8BalanzaComprobacionDO.findByDesNombreCuentaSubcuenta", query = "SELECT n FROM NdtA8BalanzaComprobacionDO n WHERE n.desNombreCuentaSubcuenta = :desNombreCuentaSubcuenta"),
    @NamedQuery(name = "NdtA8BalanzaComprobacionDO.findByImpSaldoInicial", query = "SELECT n FROM NdtA8BalanzaComprobacionDO n WHERE n.impSaldoInicial = :impSaldoInicial"),
    @NamedQuery(name = "NdtA8BalanzaComprobacionDO.findByImpDebe", query = "SELECT n FROM NdtA8BalanzaComprobacionDO n WHERE n.impDebe = :impDebe"),
    @NamedQuery(name = "NdtA8BalanzaComprobacionDO.findByImpHaber", query = "SELECT n FROM NdtA8BalanzaComprobacionDO n WHERE n.impHaber = :impHaber"),
    @NamedQuery(name = "NdtA8BalanzaComprobacionDO.findByImpSaldoFinal", query = "SELECT n FROM NdtA8BalanzaComprobacionDO n WHERE n.impSaldoFinal = :impSaldoFinal"),
    @NamedQuery(name = "NdtA8BalanzaComprobacionDO.findByCveIdUsuario", query = "SELECT n FROM NdtA8BalanzaComprobacionDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtA8BalanzaComprobacionDO.findByFecRegistroAlta", query = "SELECT n FROM NdtA8BalanzaComprobacionDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtA8BalanzaComprobacionDO.findByFecRegistroBaja", query = "SELECT n FROM NdtA8BalanzaComprobacionDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtA8BalanzaComprobacionDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtA8BalanzaComprobacionDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdtA8BalanzaComprobacionDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_A8_BALANZA_COMPROBACION", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator(name = "NdtA8BalanzaComprobacion_Id_Seq_Gen", sequenceName = "SEQ_NDTA8BALANZACOMPROBACION", allocationSize=1)
    @GeneratedValue(generator = "NdtA8BalanzaComprobacion_Id_Seq_Gen")
    private Long cveIdA8BalanzaComprobacion;
    @Column(name = "NUM_NIVEL")
    private Short numNivel;
    @Size(max = 15)
    @Column(name = "NUM_CUENTA", length = 15)
    private String numCuenta;
    @Size(max = 100)
    @Column(name = "DES_NOMBRE_CUENTA_SUBCUENTA", length = 100)
    private String desNombreCuentaSubcuenta;
    @Column(name = "IMP_SALDO_INICIAL", precision = 14, scale = 2)
    private Long impSaldoInicial;
    @Column(name = "IMP_DEBE", precision = 14, scale = 2)
    private Long impDebe;
    @Column(name = "IMP_HABER", precision = 14, scale = 2)
    private Long impHaber;
    @Column(name = "IMP_SALDO_FINAL", precision = 14, scale = 2)
    private Long impSaldoFinal;
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
    @JoinColumn(name = "CVE_ID_PATRON_ASOCIADO", referencedColumnName = "CVE_ID_PATRON_ASOCIADO")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtPatronAsociadoDO cveIdPatronAsociado;

    public NdtA8BalanzaComprobacionDO() {
    }

    public NdtA8BalanzaComprobacionDO(Long cveIdA8BalanzaComprobacion) {
        this.cveIdA8BalanzaComprobacion = cveIdA8BalanzaComprobacion;
    }

    public Long getCveIdA8BalanzaComprobacion() {
        return cveIdA8BalanzaComprobacion;
    }

    public void setCveIdA8BalanzaComprobacion(Long cveIdA8BalanzaComprobacion) {
        this.cveIdA8BalanzaComprobacion = cveIdA8BalanzaComprobacion;
    }

    public Short getNumNivel() {
        return numNivel;
    }

    public void setNumNivel(Short numNivel) {
        this.numNivel = numNivel;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getDesNombreCuentaSubcuenta() {
        return desNombreCuentaSubcuenta;
    }

    public void setDesNombreCuentaSubcuenta(String desNombreCuentaSubcuenta) {
        this.desNombreCuentaSubcuenta = desNombreCuentaSubcuenta;
    }

    public Long getImpSaldoInicial() {
        return impSaldoInicial;
    }

    public void setImpSaldoInicial(Long impSaldoInicial) {
        this.impSaldoInicial = impSaldoInicial;
    }

    public Long getImpDebe() {
        return impDebe;
    }

    public void setImpDebe(Long impDebe) {
        this.impDebe = impDebe;
    }

    public Long getImpHaber() {
        return impHaber;
    }

    public void setImpHaber(Long impHaber) {
        this.impHaber = impHaber;
    }

    public Long getImpSaldoFinal() {
        return impSaldoFinal;
    }

    public void setImpSaldoFinal(Long impSaldoFinal) {
        this.impSaldoFinal = impSaldoFinal;
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

    public NdtPatronAsociadoDO getCveIdPatronAsociado() {
        return cveIdPatronAsociado;
    }

    public void setCveIdPatronAsociado(NdtPatronAsociadoDO cveIdPatronAsociado) {
        this.cveIdPatronAsociado = cveIdPatronAsociado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdA8BalanzaComprobacion != null ? cveIdA8BalanzaComprobacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtA8BalanzaComprobacionDO)) {
            return false;
        }
        NdtA8BalanzaComprobacionDO other = (NdtA8BalanzaComprobacionDO) object;
        if ((this.cveIdA8BalanzaComprobacion == null && other.cveIdA8BalanzaComprobacion != null) || (this.cveIdA8BalanzaComprobacion != null && !this.cveIdA8BalanzaComprobacion.equals(other.cveIdA8BalanzaComprobacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtA8BalanzaComprobacionDO[ cveIdA8BalanzaComprobacion=" + cveIdA8BalanzaComprobacion + " ]";
    }
    
}
