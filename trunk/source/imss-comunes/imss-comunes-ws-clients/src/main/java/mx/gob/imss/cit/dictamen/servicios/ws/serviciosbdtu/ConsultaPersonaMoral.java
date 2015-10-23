
package mx.gob.imss.cit.dictamen.servicios.ws.serviciosbdtu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultaPersonaMoral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultaPersonaMoral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="governanceHeaderRequest" type="{http://servicios.dictamen.cit.imss.gob.mx/ws/ServiciosBDTU/}governanceHeaderRequest" minOccurs="0"/>
 *         &lt;element name="arg0" type="{http://servicios.dictamen.cit.imss.gob.mx/ws/ServiciosBDTU/}consultaPersonaMoralInput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaPersonaMoral", propOrder = {
    "governanceHeaderRequest",
    "arg0"
})
public class ConsultaPersonaMoral {

    protected GovernanceHeaderRequest governanceHeaderRequest;
    protected ConsultaPersonaMoralInput arg0;

    /**
     * Gets the value of the governanceHeaderRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GovernanceHeaderRequest }
     *     
     */
    public GovernanceHeaderRequest getGovernanceHeaderRequest() {
        return governanceHeaderRequest;
    }

    /**
     * Sets the value of the governanceHeaderRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GovernanceHeaderRequest }
     *     
     */
    public void setGovernanceHeaderRequest(GovernanceHeaderRequest value) {
        this.governanceHeaderRequest = value;
    }

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaPersonaMoralInput }
     *     
     */
    public ConsultaPersonaMoralInput getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaPersonaMoralInput }
     *     
     */
    public void setArg0(ConsultaPersonaMoralInput value) {
        this.arg0 = value;
    }

}
