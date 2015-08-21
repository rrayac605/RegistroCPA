package mx.gob.imss.cit.dictamen.web.pages;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.web.pages.base.BasePage;
import mx.gob.imss.cit.dictamen.web.util.annotations.Reset;


@ManagedBean(name = "catalogoContadoresPage")
@ViewScoped
public class CatalogoContadoresPage extends BasePage {
	/**
	 * 
	 */
	private static final long serialVersionUID = -892163807103461436L;
	
	@Reset
	private boolean inicioConfigurado;
	
	@Reset
	boolean muestraDataTable;
	
	@Reset
	Long idStatus;
	
	@Reset
	Long idDelegacion;
	
	@Reset
	Long idSubDelegacion;
	
	@Reset
	private List<CatalogoTO> status;
	
	@Reset
	private List<CatalogoTO> delegacion;

	@Reset
	private List<CatalogoTO> subdelegaccion;

	@Reset
	private List<ContadorDataTable> contadores;
	
	/**
	 * @return the status
	 */
	public List<CatalogoTO> getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(List<CatalogoTO> status) {
		this.status = status;
	}

	/**
	 * @return the delegacion
	 */
	public List<CatalogoTO> getDelegacion() {
		return delegacion;
	}

	/**
	 * @param delegacion the delegacion to set
	 */
	public void setDelegacion(List<CatalogoTO> delegacion) {
		this.delegacion = delegacion;
	}

	/**
	 * @return the subdelegaccion
	 */
	public List<CatalogoTO> getSubdelegaccion() {
		return subdelegaccion;
	}

	/**
	 * @param subdelegaccion the subdelegaccion to set
	 */
	public void setSubdelegaccion(List<CatalogoTO> subdelegaccion) {
		this.subdelegaccion = subdelegaccion;
	}

	/**
	 * @return the idStatus
	 */
	public Long getIdStatus() {
		return idStatus;
	}

	/**
	 * @param idStatus the idStatus to set
	 */
	public void setIdStatus(Long idStatus) {
		this.idStatus = idStatus;
	}

	/**
	 * @return the idDelegacion
	 */
	public Long getIdDelegacion() {
		return idDelegacion;
	}

	/**
	 * @param idDelegacion the idDelegacion to set
	 */
	public void setIdDelegacion(Long idDelegacion) {
		this.idDelegacion = idDelegacion;
	}

	/**
	 * @return the idSubDelegacion
	 */
	public Long getIdSubDelegacion() {
		return idSubDelegacion;
	}

	/**
	 * @param idSubDelegacion the idSubDelegacion to set
	 */
	public void setIdSubDelegacion(Long idSubDelegacion) {
		this.idSubDelegacion = idSubDelegacion;
	}

	/**
	 * @return the contadores
	 */
	public List<ContadorDataTable> getContadores() {
		return contadores;
	}

	/**
	 * @param contadores the contadores to set
	 */
	public void setContadores(List<ContadorDataTable> contadores) {
		this.contadores = contadores;
	}

	/**
	 * @return the muestraDataTable
	 */
	public boolean isMuestraDataTable() {
		return muestraDataTable;
	}

	/**
	 * @param muestraDataTable the muestraDataTable to set
	 */
	public void setMuestraDataTable(boolean muestraDataTable) {
		this.muestraDataTable = muestraDataTable;
	}

	/**
	 * @return the inicioConfigurado
	 */
	public boolean isInicioConfigurado() {
		return inicioConfigurado;
	}

	/**
	 * @param inicioConfigurado the inicioConfigurado to set
	 */
	public void setInicioConfigurado(boolean inicioConfigurado) {
		this.inicioConfigurado = inicioConfigurado;
	}
	
	
	
}
