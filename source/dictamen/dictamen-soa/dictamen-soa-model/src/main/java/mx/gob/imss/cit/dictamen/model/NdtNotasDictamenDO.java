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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author ajfuentes
 */
@Entity
@Table(name = "NDT_NOTAS_DICTAMEN")
@NamedQueries({
    @NamedQuery(name = "NdtNotasDictamenDO.findAll", query = "SELECT n FROM NdtNotasDictamenDO n"),
    @NamedQuery(name = "NdtNotasDictamenDO.findByCveIdNotasAseveraciones", query = "SELECT n FROM NdtNotasDictamenDO n WHERE n.cveIdNotasAseveraciones = :cveIdNotasAseveraciones"),
    @NamedQuery(name = "NdtNotasDictamenDO.findByDesNotasAsevA1", query = "SELECT n FROM NdtNotasDictamenDO n WHERE n.desNotasAsevA1 = :desNotasAsevA1"),
    @NamedQuery(name = "NdtNotasDictamenDO.findByDesNotasAsevA2", query = "SELECT n FROM NdtNotasDictamenDO n WHERE n.desNotasAsevA2 = :desNotasAsevA2"),
    @NamedQuery(name = "NdtNotasDictamenDO.findByDesNotasAsevA3", query = "SELECT n FROM NdtNotasDictamenDO n WHERE n.desNotasAsevA3 = :desNotasAsevA3"),
    @NamedQuery(name = "NdtNotasDictamenDO.findByDesNotasAsevA4", query = "SELECT n FROM NdtNotasDictamenDO n WHERE n.desNotasAsevA4 = :desNotasAsevA4"),
    @NamedQuery(name = "NdtNotasDictamenDO.findByDesNotasAsevA5", query = "SELECT n FROM NdtNotasDictamenDO n WHERE n.desNotasAsevA5 = :desNotasAsevA5"),
    @NamedQuery(name = "NdtNotasDictamenDO.findByDesNotasAsevA6", query = "SELECT n FROM NdtNotasDictamenDO n WHERE n.desNotasAsevA6 = :desNotasAsevA6"),
    @NamedQuery(name = "NdtNotasDictamenDO.findByDesNotasAsevA7", query = "SELECT n FROM NdtNotasDictamenDO n WHERE n.desNotasAsevA7 = :desNotasAsevA7"),
    @NamedQuery(name = "NdtNotasDictamenDO.findByDesNotasAsevA8", query = "SELECT n FROM NdtNotasDictamenDO n WHERE n.desNotasAsevA8 = :desNotasAsevA8"),
    @NamedQuery(name = "NdtNotasDictamenDO.findByDesNotasAsevA91", query = "SELECT n FROM NdtNotasDictamenDO n WHERE n.desNotasAsevA91 = :desNotasAsevA91"),
    @NamedQuery(name = "NdtNotasDictamenDO.findByDesNotasAsevA92", query = "SELECT n FROM NdtNotasDictamenDO n WHERE n.desNotasAsevA92 = :desNotasAsevA92")})
public class NdtNotasDictamenDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_NOTAS_ASEVERACIONES", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator( allocationSize=1,name = "NdtNotasDictamen_Id_Seq_Gen", sequenceName = "SEQ_NDTNOTASDICTAMEN")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NdtNotasDictamens_Id_Seq_Gen")
    private Long cveIdNotasAseveraciones;
    @Size(max = 1000)
    @Column(name = "DES_NOTAS_ASEV_A1", length = 1000)
    private String desNotasAsevA1;
    @Size(max = 1000)
    @Column(name = "DES_NOTAS_ASEV_A2", length = 1000)
    private String desNotasAsevA2;
    @Size(max = 1000)
    @Column(name = "DES_NOTAS_ASEV_A3", length = 1000)
    private String desNotasAsevA3;
    @Size(max = 1000)
    @Column(name = "DES_NOTAS_ASEV_A4", length = 1000)
    private String desNotasAsevA4;
    @Size(max = 1000)
    @Column(name = "DES_NOTAS_ASEV_A5", length = 1000)
    private String desNotasAsevA5;
    @Size(max = 1000)
    @Column(name = "DES_NOTAS_ASEV_A6", length = 1000)
    private String desNotasAsevA6;
    @Size(max = 1000)
    @Column(name = "DES_NOTAS_ASEV_A7", length = 1000)
    private String desNotasAsevA7;
    @Size(max = 1000)
    @Column(name = "DES_NOTAS_ASEV_A8", length = 1000)
    private String desNotasAsevA8;
    @Size(max = 1000)
    @Column(name = "DES_NOTAS_ASEV_A91", length = 1000)
    private String desNotasAsevA91;
    @Size(max = 1000)
    @Column(name = "DES_NOTAS_ASEV_A92", length = 1000)
    private String desNotasAsevA92;
    @JoinColumn(name = "CVE_ID_PATRON_DICTAMEN", referencedColumnName = "CVE_ID_PATRON_DICTAMEN")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtPatronDictamenDO cveIdPatronDictamen;

    public NdtNotasDictamenDO() {
    }

    public NdtNotasDictamenDO(Long cveIdNotasAseveraciones) {
        this.cveIdNotasAseveraciones = cveIdNotasAseveraciones;
    }

    public Long getCveIdNotasAseveraciones() {
        return cveIdNotasAseveraciones;
    }

    public void setCveIdNotasAseveraciones(Long cveIdNotasAseveraciones) {
        this.cveIdNotasAseveraciones = cveIdNotasAseveraciones;
    }

    public String getDesNotasAsevA1() {
        return desNotasAsevA1;
    }

    public void setDesNotasAsevA1(String desNotasAsevA1) {
        this.desNotasAsevA1 = desNotasAsevA1;
    }

    public String getDesNotasAsevA2() {
        return desNotasAsevA2;
    }

    public void setDesNotasAsevA2(String desNotasAsevA2) {
        this.desNotasAsevA2 = desNotasAsevA2;
    }

    public String getDesNotasAsevA3() {
        return desNotasAsevA3;
    }

    public void setDesNotasAsevA3(String desNotasAsevA3) {
        this.desNotasAsevA3 = desNotasAsevA3;
    }

    public String getDesNotasAsevA4() {
        return desNotasAsevA4;
    }

    public void setDesNotasAsevA4(String desNotasAsevA4) {
        this.desNotasAsevA4 = desNotasAsevA4;
    }

    public String getDesNotasAsevA5() {
        return desNotasAsevA5;
    }

    public void setDesNotasAsevA5(String desNotasAsevA5) {
        this.desNotasAsevA5 = desNotasAsevA5;
    }

    public String getDesNotasAsevA6() {
        return desNotasAsevA6;
    }

    public void setDesNotasAsevA6(String desNotasAsevA6) {
        this.desNotasAsevA6 = desNotasAsevA6;
    }

    public String getDesNotasAsevA7() {
        return desNotasAsevA7;
    }

    public void setDesNotasAsevA7(String desNotasAsevA7) {
        this.desNotasAsevA7 = desNotasAsevA7;
    }

    public String getDesNotasAsevA8() {
        return desNotasAsevA8;
    }

    public void setDesNotasAsevA8(String desNotasAsevA8) {
        this.desNotasAsevA8 = desNotasAsevA8;
    }

    public String getDesNotasAsevA91() {
        return desNotasAsevA91;
    }

    public void setDesNotasAsevA91(String desNotasAsevA91) {
        this.desNotasAsevA91 = desNotasAsevA91;
    }

    public String getDesNotasAsevA92() {
        return desNotasAsevA92;
    }

    public void setDesNotasAsevA92(String desNotasAsevA92) {
        this.desNotasAsevA92 = desNotasAsevA92;
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
        hash += (cveIdNotasAseveraciones != null ? cveIdNotasAseveraciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtNotasDictamenDO)) {
            return false;
        }
        NdtNotasDictamenDO other = (NdtNotasDictamenDO) object;
        if ((this.cveIdNotasAseveraciones == null && other.cveIdNotasAseveraciones != null) || (this.cveIdNotasAseveraciones != null && !this.cveIdNotasAseveraciones.equals(other.cveIdNotasAseveraciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtNotasDictamenDO[ cveIdNotasAseveraciones=" + cveIdNotasAseveraciones + " ]";
    }
    
}
