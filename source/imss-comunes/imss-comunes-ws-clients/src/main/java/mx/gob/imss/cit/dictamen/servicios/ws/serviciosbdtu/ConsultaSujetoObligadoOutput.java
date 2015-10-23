
package mx.gob.imss.cit.dictamen.servicios.ws.serviciosbdtu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultaSujetoObligadoOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultaSujetoObligadoOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sujetoObligado" type="{http://servicios.dictamen.cit.imss.gob.mx/ws/ServiciosBDTU/}sujetoObligado" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaSujetoObligadoOutput", propOrder = {
    "sujetoObligado"
})
public class ConsultaSujetoObligadoOutput {

    protected SujetoObligado sujetoObligado;

    /**
     * Gets the value of the sujetoObligado property.
     * 
     * @return
     *     possible object is
     *     {@link SujetoObligado }
     *     
     */
    public SujetoObligado getSujetoObligado() {
        return sujetoObligado;
    }

    /**
     * Sets the value of the sujetoObligado property.
     * 
     * @param value
     *     allowed object is
     *     {@link SujetoObligado }
     *     
     */
    public void setSujetoObligado(SujetoObligado value) {
        this.sujetoObligado = value;
    }

}
