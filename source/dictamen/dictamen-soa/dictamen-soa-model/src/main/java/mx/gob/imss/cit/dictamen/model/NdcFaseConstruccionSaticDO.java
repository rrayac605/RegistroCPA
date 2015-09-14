/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author ajfuentes
 */
@Entity
@Table(name = "NDC_FASE_CONSTRUCCION_SATIC")
@NamedQueries({
    @NamedQuery(name = "NdcFaseConstruccionSatic.findAll", query = "SELECT n FROM NdcFaseConstruccionSaticDO n"),
    @NamedQuery(name = "NdcFaseConstruccionSatic.findByCveIdFaseConstruccion", query = "SELECT n FROM NdcFaseConstruccionSaticDO n WHERE n.cveIdFaseConstruccion = :cveIdFaseConstruccion"),
    @NamedQuery(name = "NdcFaseConstruccionSatic.findByDesFaseConstruccion", query = "SELECT n FROM NdcFaseConstruccionSaticDO n WHERE n.desFaseConstruccion = :desFaseConstruccion"),
    @NamedQuery(name = "NdcFaseConstruccionSatic.findByDiceQueSeraSegunCatSatic", query = "SELECT n FROM NdcFaseConstruccionSaticDO n WHERE n.diceQueSeraSegunCatSatic = :diceQueSeraSegunCatSatic"),
    @NamedQuery(name = "NdcFaseConstruccionSatic.findBySeCargaraDelLadoDeLaBdtu", query = "SELECT n FROM NdcFaseConstruccionSaticDO n WHERE n.seCargaraDelLadoDeLaBdtu = :seCargaraDelLadoDeLaBdtu")})
public class NdcFaseConstruccionSaticDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_FASE_CONSTRUCCION", nullable = false, precision = 22, scale = 0)
    private Long cveIdFaseConstruccion;
    @Size(max = 18)
    @Column(name = "DES_FASE_CONSTRUCCION", length = 18)
    private String desFaseConstruccion;
    @Size(max = 18)
    @Column(name = "DICE_QUE_SERA_SEGUN_CAT_SATIC", length = 18)
    private String diceQueSeraSegunCatSatic;
    @Size(max = 18)
    @Column(name = "SE_CARGARA_DEL_LADO_DE_LA_BDTU", length = 18)
    private String seCargaraDelLadoDeLaBdtu;

    public NdcFaseConstruccionSaticDO() {
    }

    public NdcFaseConstruccionSaticDO(Long cveIdFaseConstruccion) {
        this.cveIdFaseConstruccion = cveIdFaseConstruccion;
    }

    public Long getCveIdFaseConstruccion() {
        return cveIdFaseConstruccion;
    }

    public void setCveIdFaseConstruccion(Long cveIdFaseConstruccion) {
        this.cveIdFaseConstruccion = cveIdFaseConstruccion;
    }

    public String getDesFaseConstruccion() {
        return desFaseConstruccion;
    }

    public void setDesFaseConstruccion(String desFaseConstruccion) {
        this.desFaseConstruccion = desFaseConstruccion;
    }

    public String getDiceQueSeraSegunCatSatic() {
        return diceQueSeraSegunCatSatic;
    }

    public void setDiceQueSeraSegunCatSatic(String diceQueSeraSegunCatSatic) {
        this.diceQueSeraSegunCatSatic = diceQueSeraSegunCatSatic;
    }

    public String getSeCargaraDelLadoDeLaBdtu() {
        return seCargaraDelLadoDeLaBdtu;
    }

    public void setSeCargaraDelLadoDeLaBdtu(String seCargaraDelLadoDeLaBdtu) {
        this.seCargaraDelLadoDeLaBdtu = seCargaraDelLadoDeLaBdtu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdFaseConstruccion != null ? cveIdFaseConstruccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdcFaseConstruccionSaticDO)) {
            return false;
        }
        NdcFaseConstruccionSaticDO other = (NdcFaseConstruccionSaticDO) object;
        if ((this.cveIdFaseConstruccion == null && other.cveIdFaseConstruccion != null) || (this.cveIdFaseConstruccion != null && !this.cveIdFaseConstruccion.equals(other.cveIdFaseConstruccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdcFaseConstruccionSatic[ cveIdFaseConstruccion=" + cveIdFaseConstruccion + " ]";
    }
    
}
