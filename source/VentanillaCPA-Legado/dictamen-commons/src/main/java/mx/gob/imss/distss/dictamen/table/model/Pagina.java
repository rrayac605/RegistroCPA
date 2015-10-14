package mx.gob.imss.distss.dictamen.table.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

public class Pagina<T> implements Serializable{

    private static final long serialVersionUID = 7521339781548327750L;

    private int totalRegistros;
    private List<T> registros;

    public int getTotalRegistros() {
        return totalRegistros;
    }

    public void setTotalRegistros(int totalRegistros) {
        this.totalRegistros = totalRegistros;
    }

    public List<T> getRegistros() {
        return registros;
    }

    public void setRegistros(List<T> registros) {
        this.registros = registros;
    }


}
