package mx.gob.imss.distss.dictamen.table.model;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 *     Clase modelo para tablas
 * </p>
 * */
public class DescriptorTabla implements Serializable{

    private static final long serialVersionUID = -4573528472631202621L;
    private String entidad;
    private String dto;
    private String clave;
    private String titulo;
    private Class classEntity;
    private Class classDTO;

    private List<DescriptorCampo> campos;

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<DescriptorCampo> getCampos() {
        return campos;
    }

    public void setCampos(List<DescriptorCampo> campos) {
        this.campos = campos;
    }

    public String getDto() {
        return dto;
    }

    public void setDto(String dto) {
        this.dto = dto;
    }

    public Class getClassEntity() {
        return classEntity;
    }

    public Class getClassDTO() {
        return classDTO;
    }

    public void setClassEntity(Class classEntity) {
        this.classEntity = classEntity;
    }

    public void setClassDTO(Class classDTO) {
        this.classDTO = classDTO;
    }

    public boolean containsSumatorias(){
        for (DescriptorCampo campo:getCampos()){
            if (campo.isSumatoria())return true;
        }
        return false;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
