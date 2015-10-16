
package mx.gob.imss.cit.dictamen.servicios.ws.serviciosbdtu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for obtenerEstadoTramiteOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="obtenerEstadoTramiteOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="governanceHeaderResponse" type="{http://servicios.dictamen.cit.imss.gob.mx/ws/ServiciosBDTU/}governanceHeaderResponse" minOccurs="0"/>
 *         &lt;element name="estadoSolicitud" type="{http://servicios.dictamen.cit.imss.gob.mx/ws/ServiciosBDTU/}estadoSolicitud" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerEstadoTramiteOutput", propOrder = {
    "governanceHeaderResponse",
    "estadoSolicitud"
})
public class ObtenerEstadoTramiteOutput {

    protected GovernanceHeaderResponse governanceHeaderResponse;
    protected EstadoSolicitud estadoSolicitud;

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
     * Gets the value of the estadoSolicitud property.
     * 
     * @return
     *     possible object is
     *     {@link EstadoSolicitud }
     *     
     */
    public EstadoSolicitud getEstadoSolicitud() {
        return estadoSolicitud;
    }

    /**
     * Sets the value of the estadoSolicitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoSolicitud }
     *     
     */
    public void setEstadoSolicitud(EstadoSolicitud value) {
        this.estadoSolicitud = value;
    }

}
