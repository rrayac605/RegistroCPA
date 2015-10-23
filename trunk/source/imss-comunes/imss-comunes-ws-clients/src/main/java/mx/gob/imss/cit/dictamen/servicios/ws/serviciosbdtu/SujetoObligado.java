
package mx.gob.imss.cit.dictamen.servicios.ws.serviciosbdtu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sujetoObligado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sujetoObligado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cveIdSujetoObligado" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idPersonaFisica" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idPersonaMoral" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sujetoObligado", propOrder = {
    "cveIdSujetoObligado",
    "idPersonaFisica",
    "idPersonaMoral"
})
public class SujetoObligado {

    protected Long cveIdSujetoObligado;
    protected Long idPersonaFisica;
    protected Long idPersonaMoral;

    /**
     * Gets the value of the cveIdSujetoObligado property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCveIdSujetoObligado() {
        return cveIdSujetoObligado;
    }

    /**
     * Sets the value of the cveIdSujetoObligado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCveIdSujetoObligado(Long value) {
        this.cveIdSujetoObligado = value;
    }

    /**
     * Gets the value of the idPersonaFisica property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdPersonaFisica() {
        return idPersonaFisica;
    }

    /**
     * Sets the value of the idPersonaFisica property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdPersonaFisica(Long value) {
        this.idPersonaFisica = value;
    }

    /**
     * Gets the value of the idPersonaMoral property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdPersonaMoral() {
        return idPersonaMoral;
    }

    /**
     * Sets the value of the idPersonaMoral property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdPersonaMoral(Long value) {
        this.idPersonaMoral = value;
    }

}
