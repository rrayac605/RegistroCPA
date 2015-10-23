
package mx.gob.imss.cit.dictamen.servicios.ws.serviciosbdtu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for obtenerEstadoTramiteInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="obtenerEstadoTramiteInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="governanceHeaderRequest" type="{http://servicios.dictamen.cit.imss.gob.mx/ws/ServiciosBDTU/}governanceHeaderRequest" minOccurs="0"/>
 *         &lt;element name="idTramite" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerEstadoTramiteInput", propOrder = {
    "governanceHeaderRequest",
    "idTramite"
})
public class ObtenerEstadoTramiteInput {

    protected GovernanceHeaderRequest governanceHeaderRequest;
    protected Long idTramite;

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
     * Gets the value of the idTramite property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdTramite() {
        return idTramite;
    }

    /**
     * Sets the value of the idTramite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdTramite(Long value) {
        this.idTramite = value;
    }

}
