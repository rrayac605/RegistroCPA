package mx.gob.imss.distss.dictamen.table.model;

import java.io.Serializable;
import java.util.Map;

public class Paginacion implements Serializable{

    private static final long serialVersionUID = -781780411628074468L;

    private Class classEntity;
    private Class classDTO;
    private int registroInicial;
    private int tamanioPagina;
    private Map<String,String> filtros;
    private Map<String,String> orden;

    public Paginacion(Class classEntity,Class classDTO,int registroInicial,int tamanioPagina,Map<String,String> filtros,
                      Map<String,String> orden){
        setClassEntity(classEntity);
        setClassDTO(classDTO);
        setRegistroInicial(registroInicial);
        setTamanioPagina(tamanioPagina);
        setFiltros(filtros);
        setOrden(orden);
    }

    public int getRegistroInicial() {
        return registroInicial;
    }

    public void setRegistroInicial(int registroInicial) {
        this.registroInicial = registroInicial;
    }

    public int getTamanioPagina() {
        return tamanioPagina;
    }

    public void setTamanioPagina(int tamanioPagina) {
        this.tamanioPagina = tamanioPagina;
    }

    public Class getClassEntity() {
        return classEntity;
    }

    public void setClassEntity(Class classEntity) {
        this.classEntity = classEntity;
    }

    public Map<String, String> getOrden() {
        return orden;
    }

    public void setOrden(Map<String, String> orden) {
        this.orden = orden;
    }

    public Map<String, String> getFiltros() {
        return filtros;
    }

    public void setFiltros(Map<String, String> filtros) {
        this.filtros = filtros;
    }

    public Class getClassDTO() {
        return classDTO;
    }

    public void setClassDTO(Class classDTO) {
        this.classDTO = classDTO;
    }
}
