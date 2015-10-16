package mx.gob.imss.distss.dictamen.table.model;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 *     Clase modelo para campos de tablas
 * </p>
 * */
public class DescriptorCampo implements Serializable {

    private static final long serialVersionUID = 4608529072878099272L;
    private String clave;
    private String titulo;
    private String tipo="text";/*por defecto todos los campos son text*/
    private String formato="%s";/*por defecto el formato para todos los campos es %s*/
    private boolean filtro;
    private boolean sumatoria;
    private List<DescriptorCampo> campos;/*si el campo tiene subcampos*/

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public boolean isFiltro() {
        return filtro;
    }

    public void setFiltro(boolean filtro) {
        this.filtro = filtro;
    }

    public boolean isSumatoria() {
        return sumatoria;
    }

    public void setSumatoria(boolean sumatoria) {
        this.sumatoria = sumatoria;
    }

    public List<DescriptorCampo> getCampos() {
        return campos;
    }

    public void setCampos(List<DescriptorCampo> campos) {
        this.campos = campos;
    }

    /*
    public boolean isSimple(){
        return (getEntidad()==null || !getEntidad().contains("."));
    }*/
}
