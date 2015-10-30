package mx.gob.imss.cit.dictamen.contador.commons.to.domain;

import java.io.Serializable;

public class CodigoErrorTO implements Serializable {


    @SuppressWarnings("compatibility:-3533675097659243290")
    private static final long serialVersionUID = -2550276924102721333L;
    
    private String codigo;
    private String descripcion;
    private String id;

    public CodigoErrorTO() {
        super();
    }

    public CodigoErrorTO(String codigo, String descripcion, String id) {
        super();
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.id = id;
    }

    /**
     * Gets the value of the codigo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the descripcion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setId(String value) {
        this.id = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id=" + id);
        sb.append(", codigo=" + codigo);
        sb.append(", descripcion=" + descripcion);
        return sb.toString();
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof CodigoErrorTO)) {
            return false;
        }

        final CodigoErrorTO other = (CodigoErrorTO)object;

        if (!(comparar(codigo, other.codigo) && comparar(descripcion, other.descripcion) && comparar(id, other.id))) {
            return false;
        }

        return true;
    }

    private static boolean comparar(Object o1, Object o2) {
        if (o1 == null || o2 == null) {
            return false;
        } else if (!o1.equals(o2)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
}
