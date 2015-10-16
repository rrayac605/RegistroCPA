package mx.gob.imss.distss.dictamen.web.controller.pagination;

import mx.gob.imss.ctirss.delta.framework.base.model.AbstractModel;

import java.io.Serializable;

/**
 *  Clase modelo para filtro en paginado de contador público
 *
 * @author Héctor Lorenzo López
 * @date 07/07/2015
 * */
public class FiltroContadorPublico extends AbstractModel implements Serializable{

    private static final long serialVersionUID = 2116450827219021148L;
	private String cpaApellidoPaterno;
	private String cpaApellidoMaterno;
	private String cpaNombre;
	private String cpaCurp;
	private String cpaNumeroRegistro;
	private String selectCpaStatus;
	private String selectCpaDelegacion;
	private String selectCpaSubdelegacion;
	
	
	public String getCpaApellidoPaterno() {
		return cpaApellidoPaterno;
	}
	public void setCpaApellidoPaterno(String cpaApellidoPaterno) {
		this.cpaApellidoPaterno = cpaApellidoPaterno;
	}
	public String getCpaApellidoMaterno() {
		return cpaApellidoMaterno;
	}
	public void setCpaApellidoMaterno(String cpaApellidoMaterno) {
		this.cpaApellidoMaterno = cpaApellidoMaterno;
	}
	public String getCpaNombre() {
		return cpaNombre;
	}
	public void setCpaNombre(String cpaNombre) {
		this.cpaNombre = cpaNombre;
	}
	public String getCpaCurp() {
		return cpaCurp;
	}
	public void setCpaCurp(String cpaCurp) {
		this.cpaCurp = cpaCurp;
	}
	public String getCpaNumeroRegistro() {
		return cpaNumeroRegistro;
	}
	public void setCpaNumeroRegistro(String cpaNumeroRegistro) {
		this.cpaNumeroRegistro = cpaNumeroRegistro;
	}
	public String getSelectCpaStatus() {
		return selectCpaStatus;
	}
	public void setSelectCpaStatus(String selectCpaStatus) {
		this.selectCpaStatus = selectCpaStatus;
	}
	public String getSelectCpaDelegacion() {
		return selectCpaDelegacion;
	}
	public void setSelectCpaDelegacion(String selectCpaDelegacion) {
		this.selectCpaDelegacion = selectCpaDelegacion;
	}
	public String getSelectCpaSubdelegacion() {
		return selectCpaSubdelegacion;
	}
	public void setSelectCpaSubdelegacion(String selectCpaSubdelegacion) {
		this.selectCpaSubdelegacion = selectCpaSubdelegacion;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
