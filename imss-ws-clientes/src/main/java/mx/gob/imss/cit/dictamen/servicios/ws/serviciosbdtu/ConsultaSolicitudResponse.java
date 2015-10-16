
package mx.gob.imss.cit.dictamen.servicios.ws.serviciosbdtu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultaSolicitudResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultaSolicitudResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="governanceHeaderResponse" type="{http://servicios.dictamen.cit.imss.gob.mx/ws/ServiciosBDTU/}governanceHeaderResponse" minOccurs="0"/>
 *         &lt;element name="return" type="{http://servicios.dictamen.cit.imss.gob.mx/ws/ServiciosBDTU/}consultaSolicitudOutput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaSolicitudResponse", propOrder = {
    "governanceHeaderResponse",
    "_return"
})
public class ConsultaSolicitudResponse {

    protected GovernanceHeaderResponse governanceHeaderResponse;
    @XmlElement(name = "return")
    protected ConsultaSolicitudOutput _return;

    /**
     * Gets the value of the governanceHeaderResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GovernanceHeaderResponse }
     *     
     */
    public GovernanceHeaderResponse getGovernanceHeaderResponse() {
        return governanceHeaderResponse;
    }

    /**
     * Sets the value of the governanceHeaderResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GovernanceHeaderResponse }
     *     
     */
    public void setGovernanceHeaderResponse(GovernanceHeaderResponse value) {
        this.governanceHeaderResponse = value;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaSolicitudOutput }
     *     
     */
    public ConsultaSolicitudOutput getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaSolicitudOutput }
     *     
     */
    public void setReturn(ConsultaSolicitudOutput value) {
        this._return = value;
    }

}
