
package mx.gob.imss.cit.dictamen.servicios.ws.serviciosbdtu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for solicitud complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="solicitud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estadoSolicitud" type="{http://servicios.dictamen.cit.imss.gob.mx/ws/ServiciosBDTU/}estadoSolicitud" minOccurs="0"/>
 *         &lt;element name="fechaActualizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaSolicitud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noFolioSolicitud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="solicitudId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sujetoObligado" type="{http://servicios.dictamen.cit.imss.gob.mx/ws/ServiciosBDTU/}sujetoObligado" minOccurs="0"/>
 *         &lt;element name="tipoSolicitud" type="{http://servicios.dictamen.cit.imss.gob.mx/ws/ServiciosBDTU/}tipoSolicitud" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitud", propOrder = {
    "estadoSolicitud",
    "fechaActualizacion",
    "fechaSolicitud",
    "noFolioSolicitud",
    "observacion",
    "solicitudId",
    "sujetoObligado",
    "tipoSolicitud"
})
public class Solicitud {

    protected EstadoSolicitud estadoSolicitud;
    protected String fechaActualizacion;
    protected String fechaSolicitud;
    protected String noFolioSolicitud;
    protected String observacion;
    protected Long solicitudId;
    protected SujetoObligado sujetoObligado;
    protected TipoSolicitud tipoSolicitud;

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

    /**
     * Gets the value of the fechaActualizacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaActualizacion() {
        return fechaActualizacion;
    }

    /**
     * Sets the value of the fechaActualizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaActualizacion(String value) {
        this.fechaActualizacion = value;
    }

    /**
     * Gets the value of the fechaSolicitud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    /**
     * Sets the value of the fechaSolicitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaSolicitud(String value) {
        this.fechaSolicitud = value;
    }

    /**
     * Gets the value of the noFolioSolicitud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoFolioSolicitud() {
        return noFolioSolicitud;
    }

    /**
     * Sets the value of the noFolioSolicitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoFolioSolicitud(String value) {
        this.noFolioSolicitud = value;
    }

    /**
     * Gets the value of the observacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacion() {
        return observacion;
    }

    /**
     * Sets the value of the observacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacion(String value) {
        this.observacion = value;
    }

    /**
     * Gets the value of the solicitudId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSolicitudId() {
        return solicitudId;
    }

    /**
     * Sets the value of the solicitudId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSolicitudId(Long value) {
        this.solicitudId = value;
    }

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

    /**
     * Gets the value of the tipoSolicitud property.
     * 
     * @return
     *     possible object is
     *     {@link TipoSolicitud }
     *     
     */
    public TipoSolicitud getTipoSolicitud() {
        return tipoSolicitud;
    }

    /**
     * Sets the value of the tipoSolicitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoSolicitud }
     *     
     */
    public void setTipoSolicitud(TipoSolicitud value) {
        this.tipoSolicitud = value;
    }

}
