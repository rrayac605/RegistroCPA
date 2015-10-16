
package mx.gob.imss.cit.dictamen.servicios.ws.serviciosbdtu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultaPersonaMoralOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultaPersonaMoralOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personaMoral" type="{http://servicios.dictamen.cit.imss.gob.mx/ws/ServiciosBDTU/}personaMoral" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaPersonaMoralOutput", propOrder = {
    "personaMoral"
})
public class ConsultaPersonaMoralOutput {

    protected PersonaMoral personaMoral;

    /**
     * Gets the value of the personaMoral property.
     * 
     * @return
     *     possible object is
     *     {@link PersonaMoral }
     *     
     */
    public PersonaMoral getPersonaMoral() {
        return personaMoral;
    }

    /**
     * Sets the value of the personaMoral property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaMoral }
     *     
     */
    public void setPersonaMoral(PersonaMoral value) {
        this.personaMoral = value;
    }

}
