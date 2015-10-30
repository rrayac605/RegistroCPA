package mx.gob.imss.cit.dictamen.contador.commons.enums;

public enum ContadorReporteEnum {
	RP001(0, "Reporte Activacion Contador", "Reporte Activacion Contador"),
	RP002(0, "Reporte Reactivacion Contador", "Reporte Activacion Contador"),
	RP003(0, "Reporte Acreditacion Contador", "Reporte Activacion Contador");
    private Integer id;
    private String codigo;
    private String descripcion;


    private ContadorReporteEnum(Integer id, String codigo, String descripcion) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

   
    public ContadorReporteEnum buscarCatalogoPorId(Integer id) {
        for (ContadorReporteEnum tipo : values()) {
            if (tipo.getId() == id) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Valor inválido de id para obtener instancia ContadorReporteEnum: " + id);
    }
}
