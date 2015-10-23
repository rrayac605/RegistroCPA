
package mx.gob.imss.cit.dictamen.servicios.ws.serviciosbdtu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultaSolicitudOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultaSolicitudOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="solicitud" type="{http://servicios.dictamen.cit.imss.gob.mx/ws/ServiciosBDTU/}solicitud" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaSolicitudOutput", propOrder = {
    "solicitud"
})
public class ConsultaSolicitudOutput {

    protected Solicitud solicitud;

    /**
     * Gets the value of the solicitud property.
     * 
     * @return
     *     possible object is
     *     {@link Solicitud }
     *     
     */
    public Solicitud getSolicitud() {
        return solicitud;
    }

    /**
     * Sets the value of the solicitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link Solicitud }
     *     
     */
    public void setSolicitud(Solicitud value) {
        this.solicitud = value;
    }

}
