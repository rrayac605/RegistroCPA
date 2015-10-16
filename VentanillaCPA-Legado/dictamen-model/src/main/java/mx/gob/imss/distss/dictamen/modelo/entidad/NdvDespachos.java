package mx.gob.imss.distss.dictamen.modelo.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({ @NamedQuery(name = "NdvDespachos.findAll", query = "select o from NdvDespachos o") })
@Table(name = "NDV_DESPACHOS")
public class NdvDespachos implements Serializable {
    
	private static final long serialVersionUID = 3689603271051083126L;
    
	@Id
    @Column(name = "CVE_ID_DESPACHO")
    private Long cveIdDespacho;
    
    @Column(name = "CVE_ID_PERSONA_MORAL")
    private Long cveIdPersonaMoral;
    
    @Column(length = 100)
    private String calle;
    
    @Column(length = 5)
    private String codigo;
    
    @Column(name = "CVE_ID_PMDOM_FISCAL")
    private Long cveIdPmdomFiscal;
    
    @Column(name = "DENOMINACION_RAZON_SOCIAL")
    private String denominacionRazonSocial;
    
    @Column(name = "ENTIDAD_FEDERATIVA", length = 50)
    private String entidadFederativa;
    
    @Column(length = 100)
    private String municipio;
    
    @Column(name = "NOMBRE_COMERCIAL")
    private String nombreComercial;
    
    @Column(name = "NUM_EXTERIOR", length = 250)
    private String numExterior;
    
    @Column(name = "NUM_INTERIOR", length = 250)
    private String numInterior;
    
    @Column(length = 50)
    private String rfc;
    
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Long getCveIdDespacho() {
        return cveIdDespacho;
    }

    public void setCveIdDespacho(Long cveIdDespacho) {
        this.cveIdDespacho = cveIdDespacho;
    }

    public Long getCveIdPersonaMoral() {
        return cveIdPersonaMoral;
    }

    public void setCveIdPersonaMoral(Long cveIdPersonaMoral) {
        this.cveIdPersonaMoral = cveIdPersonaMoral;
    }

    public Long getCveIdPmdomFiscal() {
        return cveIdPmdomFiscal;
    }

    public void setCveIdPmdomFiscal(Long cveIdPmdomFiscal) {
        this.cveIdPmdomFiscal = cveIdPmdomFiscal;
    }

    public String getDenominacionRazonSocial() {
        return denominacionRazonSocial;
    }

    public void setDenominacionRazonSocial(String denominacionRazonSocial) {
        this.denominacionRazonSocial = denominacionRazonSocial;
    }

    public String getEntidadFederativa() {
        return entidadFederativa;
    }

    public void setEntidadFederativa(String entidadFederativa) {
        this.entidadFederativa = entidadFederativa;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
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

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
}
