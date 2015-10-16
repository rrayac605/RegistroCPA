
package mx.gob.imss.cit.dictamen.servicios.ws.serviciosbdtu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for governanceHeaderRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="governanceHeaderRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sgbde" type="{http://servicios.dictamen.cit.imss.gob.mx/ws/ServiciosBDTU/}sgbde" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "governanceHeaderRequest", propOrder = {
    "sgbde"
})
public class GovernanceHeaderRequest {

    protected Sgbde sgbde;

    /**
     * Gets the value of the sgbde property.
     * 
     * @return
     *     possible object is
     *     {@link Sgbde }
     *     
     */
    public Sgbde getSgbde() {
        return sgbde;
    }

    /**
     * Sets the value of the sgbde property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sgbde }
     *     
     */
    public void setSgbde(Sgbde value) {
        this.sgbde = value;
    }

}
