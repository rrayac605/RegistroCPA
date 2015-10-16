
package mx.gob.imss.cit.dictamen.servicios.ws.serviciosbdtu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sgbde complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sgbde">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextoEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaPeticion" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="folio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idCanal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idOperacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idOrganizacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idServicio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idSistema" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idZona" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombreTramite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoIdEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sgbde", propOrder = {
    "contextoEntidad",
    "fechaPeticion",
    "folio",
    "idCanal",
    "idEntidad",
    "idOperacion",
    "idOrganizacion",
    "idServicio",
    "idSistema",
    "idZona",
    "nombreTramite",
    "tipoIdEntidad"
})
public class Sgbde {

    protected String contextoEntidad;
    @XmlSchemaType(name = "anySimpleType")
    protected Object fechaPeticion;
    protected String folio;
    protected int idCanal;
    protected String idEntidad;
    protected int idOperacion;
    protected int idOrganizacion;
    protected int idServicio;
    protected int idSistema;
    protected int idZona;
    protected String nombreTramite;
    protected String tipoIdEntidad;

    /**
     * Gets the value of the contextoEntidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextoEntidad() {
        return contextoEntidad;
    }

    /**
     * Sets the value of the contextoEntidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextoEntidad(String value) {
        this.contextoEntidad = value;
    }

    /**
     * Gets the value of the fechaPeticion property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFechaPeticion() {
        return fechaPeticion;
    }

    /**
     * Sets the value of the fechaPeticion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFechaPeticion(Object value) {
        this.fechaPeticion = value;
    }

    /**
     * Gets the value of the folio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolio() {
        return folio;
    }

    /**
     * Sets the value of the folio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolio(String value) {
        this.folio = value;
    }

    /**
     * Gets the value of the idCanal property.
     * 
     */
    public int getIdCanal() {
        return idCanal;
    }

    /**
     * Sets the value of the idCanal property.
     * 
     */
    public void setIdCanal(int value) {
        this.idCanal = value;
    }

    /**
     * Gets the value of the idEntidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdEntidad() {
        return idEntidad;
    }

    /**
     * Sets the value of the idEntidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdEntidad(String value) {
        this.idEntidad = value;
    }

    /**
     * Gets the value of the idOperacion property.
     * 
     */
    public int getIdOperacion() {
        return idOperacion;
    }

    /**
     * Sets the value of the idOperacion property.
     * 
     */
    public void setIdOperacion(int value) {
        this.idOperacion = value;
    }

    /**
     * Gets the value of the idOrganizacion property.
     * 
     */
    public int getIdOrganizacion() {
        return idOrganizacion;
    }

    /**
     * Sets the value of the idOrganizacion property.
     * 
     */
    public void setIdOrganizacion(int value) {
        this.idOrganizacion = value;
    }

    /**
     * Gets the value of the idServicio property.
     * 
     */
    public int getIdServicio() {
        return idServicio;
    }

    /**
     * Sets the value of the idServicio property.
     * 
     */
    public void setIdServicio(int value) {
        this.idServicio = value;
    }

    /**
     * Gets the value of the idSistema property.
     * 
     */
    public int getIdSistema() {
        return idSistema;
    }

    /**
     * Sets the value of the idSistema property.
     * 
     */
    public void setIdSistema(int value) {
        this.idSistema = value;
    }

    /**
     * Gets the value of the idZona property.
     * 
     */
    public int getIdZona() {
        return idZona;
    }

    /**
     * Sets the value of the idZona property.
     * 
     */
    public void setIdZona(int value) {
        this.idZona = value;
    }

    /**
     * Gets the value of the nombreTramite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreTramite() {
        return nombreTramite;
    }

    /**
     * Sets the value of the nombreTramite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreTramite(String value) {
        this.nombreTramite = value;
    }

    /**
     * Gets the value of the tipoIdEntidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIdEntidad() {
        return tipoIdEntidad;
    }

    /**
     * Sets the value of the tipoIdEntidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIdEntidad(String value) {
        this.tipoIdEntidad = value;
    }

}
