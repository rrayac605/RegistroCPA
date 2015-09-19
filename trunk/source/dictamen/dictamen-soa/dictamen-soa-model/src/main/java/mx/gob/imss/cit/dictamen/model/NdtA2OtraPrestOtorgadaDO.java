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
import javax.persistence.GenerationType;
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
@Table(name = "NDT_A2_OTRA_PREST_OTORGADA")
@NamedQueries({
    @NamedQuery(name = "NdtA2OtraPrestOtorgadaDO.findAll", query = "SELECT n FROM NdtA2OtraPrestOtorgadaDO n"),
    @NamedQuery(name = "NdtA2OtraPrestOtorgadaDO.findByCveIdA2Otraspresotorgadas", query = "SELECT n FROM NdtA2OtraPrestOtorgadaDO n WHERE n.cveIdA2Otraspresotorgadas = :cveIdA2Otraspresotorgadas"),
    @NamedQuery(name = "NdtA2OtraPrestOtorgadaDO.findByImpInstrumentosTrabajo", query = "SELECT n FROM NdtA2OtraPrestOtorgadaDO n WHERE n.impInstrumentosTrabajo = :impInstrumentosTrabajo"),
    @NamedQuery(name = "NdtA2OtraPrestOtorgadaDO.findByImpGastosPrevisionSocial", query = "SELECT n FROM NdtA2OtraPrestOtorgadaDO n WHERE n.impGastosPrevisionSocial = :impGastosPrevisionSocial"),
    @NamedQuery(name = "NdtA2OtraPrestOtorgadaDO.findByImpAlimentacion", query = "SELECT n FROM NdtA2OtraPrestOtorgadaDO n WHERE n.impAlimentacion = :impAlimentacion"),
    @NamedQuery(name = "NdtA2OtraPrestOtorgadaDO.findByImpHabitacion", query = "SELECT n FROM NdtA2OtraPrestOtorgadaDO n WHERE n.impHabitacion = :impHabitacion"),
    @NamedQuery(name = "NdtA2OtraPrestOtorgadaDO.findByImpAportacionAdicionalRcv", query = "SELECT n FROM NdtA2OtraPrestOtorgadaDO n WHERE n.impAportacionAdicionalRcv = :impAportacionAdicionalRcv"),
    @NamedQuery(name = "NdtA2OtraPrestOtorgadaDO.findByImpCuotaObrera", query = "SELECT n FROM NdtA2OtraPrestOtorgadaDO n WHERE n.impCuotaObrera = :impCuotaObrera"),
    @NamedQuery(name = "NdtA2OtraPrestOtorgadaDO.findByImpCuotaPatronalInfonavit", query = "SELECT n FROM NdtA2OtraPrestOtorgadaDO n WHERE n.impCuotaPatronalInfonavit = :impCuotaPatronalInfonavit"),
    @NamedQuery(name = "NdtA2OtraPrestOtorgadaDO.findByImpFondoPensiones", query = "SELECT n FROM NdtA2OtraPrestOtorgadaDO n WHERE n.impFondoPensiones = :impFondoPensiones"),
    @NamedQuery(name = "NdtA2OtraPrestOtorgadaDO.findByImpOtrasPrestaciones", query = "SELECT n FROM NdtA2OtraPrestOtorgadaDO n WHERE n.impOtrasPrestaciones = :impOtrasPrestaciones"),
    @NamedQuery(name = "NdtA2OtraPrestOtorgadaDO.findByImpTotal", query = "SELECT n FROM NdtA2OtraPrestOtorgadaDO n WHERE n.impTotal = :impTotal"),
    @NamedQuery(name = "NdtA2OtraPrestOtorgadaDO.findByCveIdUsuario", query = "SELECT n FROM NdtA2OtraPrestOtorgadaDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtA2OtraPrestOtorgadaDO.findByFecRegistroAlta", query = "SELECT n FROM NdtA2OtraPrestOtorgadaDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtA2OtraPrestOtorgadaDO.findByFecRegistroBaja", query = "SELECT n FROM NdtA2OtraPrestOtorgadaDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtA2OtraPrestOtorgadaDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtA2OtraPrestOtorgadaDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdtA2OtraPrestOtorgadaDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_A2_OTRASPRESOTORGADAS", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator( allocationSize=1,name = "NdtA2OtraPrestOtorgada_Id_Seq_Gen", sequenceName = "SEQ_NDTA2OTRAPRESTOTORGADA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NdtA2OtraPrestOtorgada_Id_Seq_Gen")
    private Long cveIdA2Otraspresotorgadas;
    @Column(name = "IMP_INSTRUMENTOS_TRABAJO", precision = 14, scale = 2)
    private Long impInstrumentosTrabajo;
    @Column(name = "IMP_GASTOS_PREVISION_SOCIAL", precision = 14, scale = 2)
    private Long impGastosPrevisionSocial;
    @Column(name = "IMP_ALIMENTACION", precision = 14, scale = 2)
    private Long impAlimentacion;
    @Column(name = "IMP_HABITACION", precision = 14, scale = 2)
    private Long impHabitacion;
    @Column(name = "IMP_APORTACION_ADICIONAL_RCV", precision = 14, scale = 2)
    private Long impAportacionAdicionalRcv;
    @Column(name = "IMP_CUOTA_OBRERA", precision = 14, scale = 2)
    private Long impCuotaObrera;
    @Column(name = "IMP_CUOTA_PATRONAL_INFONAVIT", precision = 14, scale = 2)
    private Long impCuotaPatronalInfonavit;
    @Column(name = "IMP_FONDO_PENSIONES", precision = 14, scale = 2)
    private Long impFondoPensiones;
    @Column(name = "IMP_OTRAS_PRESTACIONES", precision = 14, scale = 2)
    private Long impOtrasPrestaciones;
    @Column(name = "IMP_TOTAL", precision = 14, scale = 2)
    private Long impTotal;
    @Size(max = 18)
    @Column(name = "CVE_ID_USUARIO", length = 18)
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

    public NdtA2OtraPrestOtorgadaDO() {
    }

    public NdtA2OtraPrestOtorgadaDO(Long cveIdA2Otraspresotorgadas) {
        this.cveIdA2Otraspresotorgadas = cveIdA2Otraspresotorgadas;
    }

    public Long getCveIdA2Otraspresotorgadas() {
        return cveIdA2Otraspresotorgadas;
    }

    public void setCveIdA2Otraspresotorgadas(Long cveIdA2Otraspresotorgadas) {
        this.cveIdA2Otraspresotorgadas = cveIdA2Otraspresotorgadas;
    }

    public Long getImpInstrumentosTrabajo() {
        return impInstrumentosTrabajo;
    }

    public void setImpInstrumentosTrabajo(Long impInstrumentosTrabajo) {
        this.impInstrumentosTrabajo = impInstrumentosTrabajo;
    }

    public Long getImpGastosPrevisionSocial() {
        return impGastosPrevisionSocial;
    }

    public void setImpGastosPrevisionSocial(Long impGastosPrevisionSocial) {
        this.impGastosPrevisionSocial = impGastosPrevisionSocial;
    }

    public Long getImpAlimentacion() {
        return impAlimentacion;
    }

    public void setImpAlimentacion(Long impAlimentacion) {
        this.impAlimentacion = impAlimentacion;
    }

    public Long getImpHabitacion() {
        return impHabitacion;
    }

    public void setImpHabitacion(Long impHabitacion) {
        this.impHabitacion = impHabitacion;
    }

    public Long getImpAportacionAdicionalRcv() {
        return impAportacionAdicionalRcv;
    }

    public void setImpAportacionAdicionalRcv(Long impAportacionAdicionalRcv) {
        this.impAportacionAdicionalRcv = impAportacionAdicionalRcv;
    }

    public Long getImpCuotaObrera() {
        return impCuotaObrera;
    }

    public void setImpCuotaObrera(Long impCuotaObrera) {
        this.impCuotaObrera = impCuotaObrera;
    }

    public Long getImpCuotaPatronalInfonavit() {
        return impCuotaPatronalInfonavit;
    }

    public void setImpCuotaPatronalInfonavit(Long impCuotaPatronalInfonavit) {
        this.impCuotaPatronalInfonavit = impCuotaPatronalInfonavit;
    }

    public Long getImpFondoPensiones() {
        return impFondoPensiones;
    }

    public void setImpFondoPensiones(Long impFondoPensiones) {
        this.impFondoPensiones = impFondoPensiones;
    }

    public Long getImpOtrasPrestaciones() {
        return impOtrasPrestaciones;
    }

    public void setImpOtrasPrestaciones(Long impOtrasPrestaciones) {
        this.impOtrasPrestaciones = impOtrasPrestaciones;
    }

    public Long getImpTotal() {
        return impTotal;
    }

    public void setImpTotal(Long impTotal) {
        this.impTotal = impTotal;
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
        hash += (cveIdA2Otraspresotorgadas != null ? cveIdA2Otraspresotorgadas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtA2OtraPrestOtorgadaDO)) {
            return false;
        }
        NdtA2OtraPrestOtorgadaDO other = (NdtA2OtraPrestOtorgadaDO) object;
        if ((this.cveIdA2Otraspresotorgadas == null && other.cveIdA2Otraspresotorgadas != null) || (this.cveIdA2Otraspresotorgadas != null && !this.cveIdA2Otraspresotorgadas.equals(other.cveIdA2Otraspresotorgadas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtA2OtraPrestOtorgadaDO[ cveIdA2Otraspresotorgadas=" + cveIdA2Otraspresotorgadas + " ]";
    }
    
}
