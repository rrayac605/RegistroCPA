/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.ventanilla.model;

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
@Table(name = "NDT_RUBRO_ATESTIGUAMIENTO_DICT")
@NamedQueries({
    @NamedQuery(name = "NdtRubroAtestiguamientoDictDO.findAll", query = "SELECT n FROM NdtRubroAtestiguamientoDictDO n"),
    @NamedQuery(name = "NdtRubroAtestiguamientoDictDO.findByCveIdRubroAtestigDictamen", query = "SELECT n FROM NdtRubroAtestiguamientoDictDO n WHERE n.cveIdRubroAtestigDictamen = :cveIdRubroAtestigDictamen"),
    @NamedQuery(name = "NdtRubroAtestiguamientoDictDO.findByIndAplica", query = "SELECT n FROM NdtRubroAtestiguamientoDictDO n WHERE n.indAplica = :indAplica"),
    @NamedQuery(name = "NdtRubroAtestiguamientoDictDO.findByFecRegistroAlta", query = "SELECT n FROM NdtRubroAtestiguamientoDictDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtRubroAtestiguamientoDictDO.findByFecRegistroBaja", query = "SELECT n FROM NdtRubroAtestiguamientoDictDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtRubroAtestiguamientoDictDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtRubroAtestiguamientoDictDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado"),
    @NamedQuery(name = "NdtRubroAtestiguamientoDictDO.findByCveIdUsuario", query = "SELECT n FROM NdtRubroAtestiguamientoDictDO n WHERE n.cveIdUsuario = :cveIdUsuario")})
public class NdtRubroAtestiguamientoDictDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_RUBRO_ATESTIG_DICTAMEN", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator(name = "NdtRubroAtestiguamientoDict_Id_Seq_Gen", sequenceName = "SEQ_NDTRUBROATESTIGUAMIENTODIC", allocationSize=1)
    @GeneratedValue(generator = "NdtRubroAtestiguamientoDict_Id_Seq_Gen")
    private Long cveIdRubroAtestigDictamen;
    @Column(name = "IND_APLICA")
    private Short indAplica;
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
    @JoinColumn(name = "CVE_ID_ATESTIG_DICTAMEN", referencedColumnName = "CVE_ID_ATESTIG_DICTAMEN")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtAtestiguamientoDictamenDO cveIdAtestigDictamen;
    @JoinColumn(name = "CVE_ID_RUBRO", referencedColumnName = "CVE_ID_RUBRO")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcRubroDO cveIdRubro;
    @OneToMany(mappedBy = "cveIdRubroAtestigDictamen", fetch = FetchType.LAZY)
    private List<NdtAtestigPreguntasRespuestDO> ndtAtestigPreguntasRespuestDOList;

    public NdtRubroAtestiguamientoDictDO() {
    }

    public NdtRubroAtestiguamientoDictDO(Long cveIdRubroAtestigDictamen) {
        this.cveIdRubroAtestigDictamen = cveIdRubroAtestigDictamen;
    }

    public Long getCveIdRubroAtestigDictamen() {
        return cveIdRubroAtestigDictamen;
    }

    public void setCveIdRubroAtestigDictamen(Long cveIdRubroAtestigDictamen) {
        this.cveIdRubroAtestigDictamen = cveIdRubroAtestigDictamen;
    }

    public Short getIndAplica() {
        return indAplica;
    }

    public void setIndAplica(Short indAplica) {
        this.indAplica = indAplica;
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

    public NdtAtestiguamientoDictamenDO getCveIdAtestigDictamen() {
        return cveIdAtestigDictamen;
    }

    public void setCveIdAtestigDictamen(NdtAtestiguamientoDictamenDO cveIdAtestigDictamen) {
        this.cveIdAtestigDictamen = cveIdAtestigDictamen;
    }

    public NdcRubroDO getCveIdRubro() {
        return cveIdRubro;
    }

    public void setCveIdRubro(NdcRubroDO cveIdRubro) {
        this.cveIdRubro = cveIdRubro;
    }

    public List<NdtAtestigPreguntasRespuestDO> getNdtAtestigPreguntasRespuestDOList() {
        return ndtAtestigPreguntasRespuestDOList;
    }

    public void setNdtAtestigPreguntasRespuestDOList(List<NdtAtestigPreguntasRespuestDO> ndtAtestigPreguntasRespuestDOList) {
        this.ndtAtestigPreguntasRespuestDOList = ndtAtestigPreguntasRespuestDOList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdRubroAtestigDictamen != null ? cveIdRubroAtestigDictamen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtRubroAtestiguamientoDictDO)) {
            return false;
        }
        NdtRubroAtestiguamientoDictDO other = (NdtRubroAtestiguamientoDictDO) object;
        if ((this.cveIdRubroAtestigDictamen == null && other.cveIdRubroAtestigDictamen != null) || (this.cveIdRubroAtestigDictamen != null && !this.cveIdRubroAtestigDictamen.equals(other.cveIdRubroAtestigDictamen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtRubroAtestiguamientoDictDO[ cveIdRubroAtestigDictamen=" + cveIdRubroAtestigDictamen + " ]";
    }
    
}
