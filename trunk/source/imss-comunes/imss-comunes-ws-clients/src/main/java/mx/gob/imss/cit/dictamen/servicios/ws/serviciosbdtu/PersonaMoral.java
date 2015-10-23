
package mx.gob.imss.cit.dictamen.servicios.ws.serviciosbdtu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for personaMoral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="personaMoral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cveFisica" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cveMoral" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idPersona" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rfc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personaMoral", propOrder = {
    "cveFisica",
    "cveMoral",
    "idPersona",
    "razonSocial",
    "rfc"
})
public class PersonaMoral {

    protected Long cveFisica;
    protected Long cveMoral;
    protected Long idPersona;
    protected String razonSocial;
    protected String rfc;

    /**
     * Gets the value of the cveFisica property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCveFisica() {
        return cveFisica;
    }

    /**
     * Sets the value of the cveFisica property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCveFisica(Long value) {
        this.cveFisica = value;
    }

    /**
     * Gets the value of the cveMoral property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCveMoral() {
        return cveMoral;
    }

    /**
     * Sets the value of the cveMoral property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCveMoral(Long value) {
        this.cveMoral = value;
    }

    /**
     * Gets the value of the idPersona property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdPersona() {
        return idPersona;
    }

    /**
     * Sets the value of the idPersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdPersona(Long value) {
        this.idPersona = value;
    }

    /**
     * Gets the value of the razonSocial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Sets the value of the razonSocial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocial(String value) {
        this.razonSocial = value;
    }

    /**
     * Gets the value of the rfc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Sets the value of the rfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfc(String value) {
        this.rfc = value;
    }

}
