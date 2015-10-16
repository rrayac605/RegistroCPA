package mx.gob.imss.distss.dictamen.modelo.dto;

public interface Reportable {
    String getNumTramiteNotaria();
    String getUrlAcuseNotaria();
    String getCadenaOriginal();
    void setNumTramiteNotaria(String numTramiteNotaria);
    void setUrlAcuseNotaria(String urlAcuseNotaria);
    void setCadenaOriginal(String cadenaOriginal);
}
