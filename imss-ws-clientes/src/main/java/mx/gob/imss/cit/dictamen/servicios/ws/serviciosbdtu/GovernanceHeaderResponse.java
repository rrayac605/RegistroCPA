
package mx.gob.imss.cit.dictamen.servicios.ws.serviciosbdtu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for governanceHeaderResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="governanceHeaderResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sgbds" type="{http://servicios.dictamen.cit.imss.gob.mx/ws/ServiciosBDTU/}SGBDS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "governanceHeaderResponse", propOrder = {
    "sgbds"
})
public class GovernanceHeaderResponse {

    protected SGBDS sgbds;

    /**
     * Gets the value of the sgbds property.
     * 
     * @return
     *     possible object is
     *     {@link SGBDS }
     *     
     */
    public SGBDS getSgbds() {
        return sgbds;
    }

    /**
     * Sets the value of the sgbds property.
     * 
     * @param value
     *     allowed object is
     *     {@link SGBDS }
     *     
     */
    public void setSgbds(SGBDS value) {
        this.sgbds = value;
    }

}
