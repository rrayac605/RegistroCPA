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
@Table(name = "NDT_A9_1_OBRAS_CONSTRUCCION")
@NamedQueries({
    @NamedQuery(name = "NdtA91ObrasConstruccionDO.findAll", query = "SELECT n FROM NdtA91ObrasConstruccionDO n"),
    @NamedQuery(name = "NdtA91ObrasConstruccionDO.findByCveIdA91ObrasConstruccion", query = "SELECT n FROM NdtA91ObrasConstruccionDO n WHERE n.cveIdA91ObrasConstruccion = :cveIdA91ObrasConstruccion"),
    @NamedQuery(name = "NdtA91ObrasConstruccionDO.findByRfc", query = "SELECT n FROM NdtA91ObrasConstruccionDO n WHERE n.rfc = :rfc"),
    @NamedQuery(name = "NdtA91ObrasConstruccionDO.findByRegPatronal", query = "SELECT n FROM NdtA91ObrasConstruccionDO n WHERE n.regPatronal = :regPatronal"),
    @NamedQuery(name = "NdtA91ObrasConstruccionDO.findByCalle", query = "SELECT n FROM NdtA91ObrasConstruccionDO n WHERE n.calle = :calle"),
    @NamedQuery(name = "NdtA91ObrasConstruccionDO.findByNumExterior", query = "SELECT n FROM NdtA91ObrasConstruccionDO n WHERE n.numExterior = :numExterior"),
    @NamedQuery(name = "NdtA91ObrasConstruccionDO.findByNumInterior", query = "SELECT n FROM NdtA91ObrasConstruccionDO n WHERE n.numInterior = :numInterior"),
    @NamedQuery(name = "NdtA91ObrasConstruccionDO.findByColonia", query = "SELECT n FROM NdtA91ObrasConstruccionDO n WHERE n.colonia = :colonia"),
    @NamedQuery(name = "NdtA91ObrasConstruccionDO.findByDelegacion", query = "SELECT n FROM NdtA91ObrasConstruccionDO n WHERE n.delegacion = :delegacion"),
    @NamedQuery(name = "NdtA91ObrasConstruccionDO.findByCodigoPostal", query = "SELECT n FROM NdtA91ObrasConstruccionDO n WHERE n.codigoPostal = :codigoPostal"),
    @NamedQuery(name = "NdtA91ObrasConstruccionDO.findByEntidadFederativa", query = "SELECT n FROM NdtA91ObrasConstruccionDO n WHERE n.entidadFederativa = :entidadFederativa"),
    @NamedQuery(name = "NdtA91ObrasConstruccionDO.findByNumRegObraImss", query = "SELECT n FROM NdtA91ObrasConstruccionDO n WHERE n.numRegObraImss = :numRegObraImss"),
    @NamedQuery(name = "NdtA91ObrasConstruccionDO.findByFecInicioObra", query = "SELECT n FROM NdtA91ObrasConstruccionDO n WHERE n.fecInicioObra = :fecInicioObra"),
    @NamedQuery(name = "NdtA91ObrasConstruccionDO.findByFecFinObra", query = "SELECT n FROM NdtA91ObrasConstruccionDO n WHERE n.fecFinObra = :fecFinObra"),
    @NamedQuery(name = "NdtA91ObrasConstruccionDO.findByDesTipoPrivadaPublica", query = "SELECT n FROM NdtA91ObrasConstruccionDO n WHERE n.desTipoPrivadaPublica = :desTipoPrivadaPublica"),
    @NamedQuery(name = "NdtA91ObrasConstruccionDO.findByDesTipoFaseObra", query = "SELECT n FROM NdtA91ObrasConstruccionDO n WHERE n.desTipoFaseObra = :desTipoFaseObra"),
    @NamedQuery(name = "NdtA91ObrasConstruccionDO.findByNumContrato", query = "SELECT n FROM NdtA91ObrasConstruccionDO n WHERE n.numContrato = :numContrato"),
    @NamedQuery(name = "NdtA91ObrasConstruccionDO.findByImpContratado", query = "SELECT n FROM NdtA91ObrasConstruccionDO n WHERE n.impContratado = :impContratado"),
    @NamedQuery(name = "NdtA91ObrasConstruccionDO.findByNumSuperficieM2", query = "SELECT n FROM NdtA91ObrasConstruccionDO n WHERE n.numSuperficieM2 = :numSuperficieM2"),
    @NamedQuery(name = "NdtA91ObrasConstruccionDO.findByNumTrabajadores", query = "SELECT n FROM NdtA91ObrasConstruccionDO n WHERE n.numTrabajadores = :numTrabajadores"),
    @NamedQuery(name = "NdtA91ObrasConstruccionDO.findByImpTotalRemuneracionPagada", query = "SELECT n FROM NdtA91ObrasConstruccionDO n WHERE n.impTotalRemuneracionPagada = :impTotalRemuneracionPagada"),
    @NamedQuery(name = "NdtA91ObrasConstruccionDO.findByCveIdUsuario", query = "SELECT n FROM NdtA91ObrasConstruccionDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtA91ObrasConstruccionDO.findByFecRegistroAlta", query = "SELECT n FROM NdtA91ObrasConstruccionDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtA91ObrasConstruccionDO.findByFecRegistroBaja", query = "SELECT n FROM NdtA91ObrasConstruccionDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtA91ObrasConstruccionDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtA91ObrasConstruccionDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdtA91ObrasConstruccionDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_A9_1_OBRAS_CONSTRUCCION", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator(name = "NdtA91ObrasConstruccion_Id_Seq_Gen", sequenceName = "SEQ_NDTA91OBRASCONSTRUCCION")
    @GeneratedValue(generator = "NdtA91ObrasConstruccion_Id_Seq_Gen")
    private Long cveIdA91ObrasConstruccion;
    @Size(max = 13)
    @Column(name = "RFC", length = 13)
    private String rfc;
    @Size(max = 11)
    @Column(name = "REG_PATRONAL", length = 11)
    private String regPatronal;
    @Size(max = 100)
    @Column(name = "CALLE", length = 100)
    private String calle;
    @Size(max = 10)
    @Column(name = "NUM_EXTERIOR", length = 10)
    private String numExterior;
    @Size(max = 10)
    @Column(name = "NUM_INTERIOR", length = 10)
    private String numInterior;
    @Size(max = 100)
    @Column(name = "COLONIA", length = 100)
    private String colonia;
    @Size(max = 100)
    @Column(name = "DELEGACION", length = 100)
    private String delegacion;
    @Size(max = 5)
    @Column(name = "CODIGO_POSTAL", length = 5)
    private String codigoPostal;
    @Size(max = 50)
    @Column(name = "ENTIDAD_FEDERATIVA", length = 50)
    private String entidadFederativa;
    @Column(name = "NUM_REG_OBRA_IMSS")
    private Long numRegObraImss;
    @Column(name = "FEC_INICIO_OBRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecInicioObra;
    @Column(name = "FEC_FIN_OBRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecFinObra;
    @Size(max = 50)
    @Column(name = "DES_TIPO_PRIVADA_PUBLICA", length = 50)
    private String desTipoPrivadaPublica;
    @Size(max = 100)
    @Column(name = "DES_TIPO_FASE_OBRA", length = 100)
    private String desTipoFaseObra;
    @Size(max = 20)
    @Column(name = "NUM_CONTRATO", length = 20)
    private String numContrato;
    @Column(name = "IMP_CONTRATADO", precision = 14, scale = 2)
    private Long impContratado;
    @Column(name = "NUM_SUPERFICIE_M2")
    private Integer numSuperficieM2;
    @Column(name = "NUM_TRABAJADORES")
    private Integer numTrabajadores;
    @Column(name = "IMP_TOTAL_REMUNERACION_PAGADA", precision = 14, scale = 2)
    private Long impTotalRemuneracionPagada;
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

    public NdtA91ObrasConstruccionDO() {
    }

    public NdtA91ObrasConstruccionDO(Long cveIdA91ObrasConstruccion) {
        this.cveIdA91ObrasConstruccion = cveIdA91ObrasConstruccion;
    }

    public Long getCveIdA91ObrasConstruccion() {
        return cveIdA91ObrasConstruccion;
    }

    public void setCveIdA91ObrasConstruccion(Long cveIdA91ObrasConstruccion) {
        this.cveIdA91ObrasConstruccion = cveIdA91ObrasConstruccion;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getRegPatronal() {
        return regPatronal;
    }

    public void setRegPatronal(String regPatronal) {
        this.regPatronal = regPatronal;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumExterior() {
        return numExterior;
    }

    public void setNumExterior(String numExterior) {
        this.numExterior = numExterior;
    }

    public String getNumInterior() {
        return numInterior;
    }

    public void setNumInterior(String numInterior) {
        this.numInterior = numInterior;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getDelegacion() {
        return delegacion;
    }

    public void setDelegacion(String delegacion) {
        this.delegacion = delegacion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getEntidadFederativa() {
        return entidadFederativa;
    }

    public void setEntidadFederativa(String entidadFederativa) {
        this.entidadFederativa = entidadFederativa;
    }

    public Long getNumRegObraImss() {
        return numRegObraImss;
    }

    public void setNumRegObraImss(Long numRegObraImss) {
        this.numRegObraImss = numRegObraImss;
    }

    public Date getFecInicioObra() {
        return fecInicioObra;
    }

    public void setFecInicioObra(Date fecInicioObra) {
        this.fecInicioObra = fecInicioObra;
    }

    public Date getFecFinObra() {
        return fecFinObra;
    }

    public void setFecFinObra(Date fecFinObra) {
        this.fecFinObra = fecFinObra;
    }

    public String getDesTipoPrivadaPublica() {
        return desTipoPrivadaPublica;
    }

    public void setDesTipoPrivadaPublica(String desTipoPrivadaPublica) {
        this.desTipoPrivadaPublica = desTipoPrivadaPublica;
    }

    public String getDesTipoFaseObra() {
        return desTipoFaseObra;
    }

    public void setDesTipoFaseObra(String desTipoFaseObra) {
        this.desTipoFaseObra = desTipoFaseObra;
    }

    public String getNumContrato() {
        return numContrato;
    }

    public void setNumContrato(String numContrato) {
        this.numContrato = numContrato;
    }

    public Long getImpContratado() {
        return impContratado;
    }

    public void setImpContratado(Long impContratado) {
        this.impContratado = impContratado;
    }

    public Integer getNumSuperficieM2() {
        return numSuperficieM2;
    }

    public void setNumSuperficieM2(Integer numSuperficieM2) {
        this.numSuperficieM2 = numSuperficieM2;
    }

    public Integer getNumTrabajadores() {
        return numTrabajadores;
    }

    public void setNumTrabajadores(Integer numTrabajadores) {
        this.numTrabajadores = numTrabajadores;
    }

    public Long getImpTotalRemuneracionPagada() {
        return impTotalRemuneracionPagada;
    }

    public void setImpTotalRemuneracionPagada(Long impTotalRemuneracionPagada) {
        this.impTotalRemuneracionPagada = impTotalRemuneracionPagada;
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
        hash += (cveIdA91ObrasConstruccion != null ? cveIdA91ObrasConstruccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtA91ObrasConstruccionDO)) {
            return false;
        }
        NdtA91ObrasConstruccionDO other = (NdtA91ObrasConstruccionDO) object;
        if ((this.cveIdA91ObrasConstruccion == null && other.cveIdA91ObrasConstruccion != null) || (this.cveIdA91ObrasConstruccion != null && !this.cveIdA91ObrasConstruccion.equals(other.cveIdA91ObrasConstruccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtA91ObrasConstruccionDO[ cveIdA91ObrasConstruccion=" + cveIdA91ObrasConstruccion + " ]";
    }
    
}
