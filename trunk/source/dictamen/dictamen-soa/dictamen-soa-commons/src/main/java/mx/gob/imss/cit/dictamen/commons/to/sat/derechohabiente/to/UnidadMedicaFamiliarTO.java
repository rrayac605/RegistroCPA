package mx.gob.imss.cit.dictamen.commons.to.sat.derechohabiente.to;

import java.math.BigDecimal;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.DomicilioTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to.SubdelegacionTO;

public class UnidadMedicaFamiliarTO extends BaseTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5304288046801751158L;
	private ClavePresupuestalTO clavePresupuestal;
	private String descripcion;
	private String desDireccion;
	private DomicilioTO domicilio;
	private BigDecimal generacionCita;
	private Long idUMF;
	private BigDecimal indUmfCfe;
	private NivelAtencionTO nivelatencion;
	private BigDecimal noConsultoria;
	private BigDecimal noEconomico;
	private String nombreCorto;
	private SubdelegacionTO subdelegacion;
	private TipoUMFTO tipoUMF;
	public ClavePresupuestalTO getClavePresupuestal() {
		return clavePresupuestal;
	}
	public void setClavePresupuestal(ClavePresupuestalTO clavePresupuestal) {
		this.clavePresupuestal = clavePresupuestal;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDesDireccion() {
		return desDireccion;
	}
	public void setDesDireccion(String desDireccion) {
		this.desDireccion = desDireccion;
	}
	public DomicilioTO getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(DomicilioTO domicilio) {
		this.domicilio = domicilio;
	}
	public BigDecimal getGeneracionCita() {
		return generacionCita;
	}
	public void setGeneracionCita(BigDecimal generacionCita) {
		this.generacionCita = generacionCita;
	}
	public Long getIdUMF() {
		return idUMF;
	}
	public void setIdUMF(Long idUMF) {
		this.idUMF = idUMF;
	}
	public BigDecimal getIndUmfCfe() {
		return indUmfCfe;
	}
	public void setIndUmfCfe(BigDecimal indUmfCfe) {
		this.indUmfCfe = indUmfCfe;
	}
	public NivelAtencionTO getNivelatencion() {
		return nivelatencion;
	}
	public void setNivelatencion(NivelAtencionTO nivelatencion) {
		this.nivelatencion = nivelatencion;
	}
	public BigDecimal getNoConsultoria() {
		return noConsultoria;
	}
	public void setNoConsultoria(BigDecimal noConsultoria) {
		this.noConsultoria = noConsultoria;
	}
	public BigDecimal getNoEconomico() {
		return noEconomico;
	}
	public void setNoEconomico(BigDecimal noEconomico) {
		this.noEconomico = noEconomico;
	}
	public String getNombreCorto() {
		return nombreCorto;
	}
	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}
	public SubdelegacionTO getSubdelegacion() {
		return subdelegacion;
	}
	public void setSubdelegacion(SubdelegacionTO subdelegacion) {
		this.subdelegacion = subdelegacion;
	}
	public TipoUMFTO getTipoUMF() {
		return tipoUMF;
	}
	public void setTipoUMF(TipoUMFTO tipoUMF) {
		this.tipoUMF = tipoUMF;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clavePresupuestal == null) ? 0 : clavePresupuestal.hashCode());
		result = prime * result + ((desDireccion == null) ? 0 : desDireccion.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((domicilio == null) ? 0 : domicilio.hashCode());
		result = prime * result + ((generacionCita == null) ? 0 : generacionCita.hashCode());
		result = prime * result + ((idUMF == null) ? 0 : idUMF.hashCode());
		result = prime * result + ((indUmfCfe == null) ? 0 : indUmfCfe.hashCode());
		result = prime * result + ((nivelatencion == null) ? 0 : nivelatencion.hashCode());
		result = prime * result + ((noConsultoria == null) ? 0 : noConsultoria.hashCode());
		result = prime * result + ((noEconomico == null) ? 0 : noEconomico.hashCode());
		result = prime * result + ((nombreCorto == null) ? 0 : nombreCorto.hashCode());
		result = prime * result + ((subdelegacion == null) ? 0 : subdelegacion.hashCode());
		result = prime * result + ((tipoUMF == null) ? 0 : tipoUMF.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UnidadMedicaFamiliarTO other = (UnidadMedicaFamiliarTO) obj;
		if (clavePresupuestal == null) {
			if (other.clavePresupuestal != null)
				return false;
		} else if (!clavePresupuestal.equals(other.clavePresupuestal))
			return false;
		if (desDireccion == null) {
			if (other.desDireccion != null)
				return false;
		} else if (!desDireccion.equals(other.desDireccion))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (domicilio == null) {
			if (other.domicilio != null)
				return false;
		} else if (!domicilio.equals(other.domicilio))
			return false;
		if (generacionCita == null) {
			if (other.generacionCita != null)
				return false;
		} else if (!generacionCita.equals(other.generacionCita))
			return false;
		if (idUMF == null) {
			if (other.idUMF != null)
				return false;
		} else if (!idUMF.equals(other.idUMF))
			return false;
		if (indUmfCfe == null) {
			if (other.indUmfCfe != null)
				return false;
		} else if (!indUmfCfe.equals(other.indUmfCfe))
			return false;
		if (nivelatencion == null) {
			if (other.nivelatencion != null)
				return false;
		} else if (!nivelatencion.equals(other.nivelatencion))
			return false;
		if (noConsultoria == null) {
			if (other.noConsultoria != null)
				return false;
		} else if (!noConsultoria.equals(other.noConsultoria))
			return false;
		if (noEconomico == null) {
			if (other.noEconomico != null)
				return false;
		} else if (!noEconomico.equals(other.noEconomico))
			return false;
		if (nombreCorto == null) {
			if (other.nombreCorto != null)
				return false;
		} else if (!nombreCorto.equals(other.nombreCorto))
			return false;
		if (subdelegacion == null) {
			if (other.subdelegacion != null)
				return false;
		} else if (!subdelegacion.equals(other.subdelegacion))
			return false;
		if (tipoUMF == null) {
			if (other.tipoUMF != null)
				return false;
		} else if (!tipoUMF.equals(other.tipoUMF))
			return false;
		return true;
	}
	
}
