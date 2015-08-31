package mx.gob.imss.cit.dictamen.domicilio.to;

import java.math.BigDecimal;

import mx.gob.imss.cit.dictamen.commons.to.BaseTO;
import mx.gob.imss.cit.dictamen.enums.EstadoAdministracionEnum;

public class DomicilioTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TipoAmbitoTO ambito;
	private AsentamientoTO asentamiento;
	private String calle;
	private Integer clave;
	private CodigoPostalTO codigoPostal;
	private String colonia;
	private Long cvePersonaFisicaDom;
	private String descripcion;
	private TipoDomicilioTO dicTipoDomicilio;
	private DomicilioCaminoTO domicilioCamino;
	private DomicilioCarreteraTO domicilioCarretera;
	private EstadoAdministracionEnum estadoAdministracionAnteriorDomicilio;
	private EstadoAdministracionEnum estadoAdministracionDomicilio;
	private BigDecimal latitud;
	private LocalidadTO localidad;
	private BigDecimal longuitud;
	private Integer numExterior1;
	private Integer numExterior2;
	private String numExteriorAlf;
	private Integer numInterior1;
	private String numInteriorAlf;
	private Integer tipoBusquedaVialidad;
	private TipoDomicilioTO tipoDomicilio;
	private VialidadTO vialidadPrimaria;
	private VialidadTO vialidadReferenciaPosterior;
	private VialidadTO vialidadReferenciaPrimaria;
	private VialidadTO vialidadReferenciaSecundaria;
	public TipoAmbitoTO getAmbito() {
		return ambito;
	}
	public void setAmbito(TipoAmbitoTO ambito) {
		this.ambito = ambito;
	}
	public AsentamientoTO getAsentamiento() {
		return asentamiento;
	}
	public void setAsentamiento(AsentamientoTO asentamiento) {
		this.asentamiento = asentamiento;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public Integer getClave() {
		return clave;
	}
	public void setClave(Integer clave) {
		this.clave = clave;
	}
	public CodigoPostalTO getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(CodigoPostalTO codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	public Long getCvePersonaFisicaDom() {
		return cvePersonaFisicaDom;
	}
	public void setCvePersonaFisicaDom(Long cvePersonaFisicaDom) {
		this.cvePersonaFisicaDom = cvePersonaFisicaDom;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public TipoDomicilioTO getDicTipoDomicilio() {
		return dicTipoDomicilio;
	}
	public void setDicTipoDomicilio(TipoDomicilioTO dicTipoDomicilio) {
		this.dicTipoDomicilio = dicTipoDomicilio;
	}
	public DomicilioCaminoTO getDomicilioCamino() {
		return domicilioCamino;
	}
	public void setDomicilioCamino(DomicilioCaminoTO domicilioCamino) {
		this.domicilioCamino = domicilioCamino;
	}
	public DomicilioCarreteraTO getDomicilioCarretera() {
		return domicilioCarretera;
	}
	public void setDomicilioCarretera(DomicilioCarreteraTO domicilioCarretera) {
		this.domicilioCarretera = domicilioCarretera;
	}
	public EstadoAdministracionEnum getEstadoAdministracionAnteriorDomicilio() {
		return estadoAdministracionAnteriorDomicilio;
	}
	public void setEstadoAdministracionAnteriorDomicilio(EstadoAdministracionEnum estadoAdministracionAnteriorDomicilio) {
		this.estadoAdministracionAnteriorDomicilio = estadoAdministracionAnteriorDomicilio;
	}
	public EstadoAdministracionEnum getEstadoAdministracionDomicilio() {
		return estadoAdministracionDomicilio;
	}
	public void setEstadoAdministracionDomicilio(EstadoAdministracionEnum estadoAdministracionDomicilio) {
		this.estadoAdministracionDomicilio = estadoAdministracionDomicilio;
	}
	public BigDecimal getLatitud() {
		return latitud;
	}
	public void setLatitud(BigDecimal latitud) {
		this.latitud = latitud;
	}
	public LocalidadTO getLocalidad() {
		return localidad;
	}
	public void setLocalidad(LocalidadTO localidad) {
		this.localidad = localidad;
	}
	public BigDecimal getLonguitud() {
		return longuitud;
	}
	public void setLonguitud(BigDecimal longuitud) {
		this.longuitud = longuitud;
	}
	public Integer getNumExterior1() {
		return numExterior1;
	}
	public void setNumExterior1(Integer numExterior1) {
		this.numExterior1 = numExterior1;
	}
	public Integer getNumExterior2() {
		return numExterior2;
	}
	public void setNumExterior2(Integer numExterior2) {
		this.numExterior2 = numExterior2;
	}
	public String getNumExteriorAlf() {
		return numExteriorAlf;
	}
	public void setNumExteriorAlf(String numExteriorAlf) {
		this.numExteriorAlf = numExteriorAlf;
	}
	public Integer getNumInterior1() {
		return numInterior1;
	}
	public void setNumInterior1(Integer numInterior1) {
		this.numInterior1 = numInterior1;
	}
	public String getNumInteriorAlf() {
		return numInteriorAlf;
	}
	public void setNumInteriorAlf(String numInteriorAlf) {
		this.numInteriorAlf = numInteriorAlf;
	}
	public Integer getTipoBusquedaVialidad() {
		return tipoBusquedaVialidad;
	}
	public void setTipoBusquedaVialidad(Integer tipoBusquedaVialidad) {
		this.tipoBusquedaVialidad = tipoBusquedaVialidad;
	}
	public TipoDomicilioTO getTipoDomicilio() {
		return tipoDomicilio;
	}
	public void setTipoDomicilio(TipoDomicilioTO tipoDomicilio) {
		this.tipoDomicilio = tipoDomicilio;
	}
	public VialidadTO getVialidadPrimaria() {
		return vialidadPrimaria;
	}
	public void setVialidadPrimaria(VialidadTO vialidadPrimaria) {
		this.vialidadPrimaria = vialidadPrimaria;
	}
	public VialidadTO getVialidadReferenciaPosterior() {
		return vialidadReferenciaPosterior;
	}
	public void setVialidadReferenciaPosterior(VialidadTO vialidadReferenciaPosterior) {
		this.vialidadReferenciaPosterior = vialidadReferenciaPosterior;
	}
	public VialidadTO getVialidadReferenciaPrimaria() {
		return vialidadReferenciaPrimaria;
	}
	public void setVialidadReferenciaPrimaria(VialidadTO vialidadReferenciaPrimaria) {
		this.vialidadReferenciaPrimaria = vialidadReferenciaPrimaria;
	}
	public VialidadTO getVialidadReferenciaSecundaria() {
		return vialidadReferenciaSecundaria;
	}
	public void setVialidadReferenciaSecundaria(VialidadTO vialidadReferenciaSecundaria) {
		this.vialidadReferenciaSecundaria = vialidadReferenciaSecundaria;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ambito == null) ? 0 : ambito.hashCode());
		result = prime * result + ((asentamiento == null) ? 0 : asentamiento.hashCode());
		result = prime * result + ((calle == null) ? 0 : calle.hashCode());
		result = prime * result + ((clave == null) ? 0 : clave.hashCode());
		result = prime * result + ((codigoPostal == null) ? 0 : codigoPostal.hashCode());
		result = prime * result + ((colonia == null) ? 0 : colonia.hashCode());
		result = prime * result + ((cvePersonaFisicaDom == null) ? 0 : cvePersonaFisicaDom.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((dicTipoDomicilio == null) ? 0 : dicTipoDomicilio.hashCode());
		result = prime * result + ((domicilioCamino == null) ? 0 : domicilioCamino.hashCode());
		result = prime * result + ((domicilioCarretera == null) ? 0 : domicilioCarretera.hashCode());
		result = prime * result + ((estadoAdministracionAnteriorDomicilio == null) ? 0
				: estadoAdministracionAnteriorDomicilio.hashCode());
		result = prime * result
				+ ((estadoAdministracionDomicilio == null) ? 0 : estadoAdministracionDomicilio.hashCode());
		result = prime * result + ((latitud == null) ? 0 : latitud.hashCode());
		result = prime * result + ((localidad == null) ? 0 : localidad.hashCode());
		result = prime * result + ((longuitud == null) ? 0 : longuitud.hashCode());
		result = prime * result + ((numExterior1 == null) ? 0 : numExterior1.hashCode());
		result = prime * result + ((numExterior2 == null) ? 0 : numExterior2.hashCode());
		result = prime * result + ((numExteriorAlf == null) ? 0 : numExteriorAlf.hashCode());
		result = prime * result + ((numInterior1 == null) ? 0 : numInterior1.hashCode());
		result = prime * result + ((numInteriorAlf == null) ? 0 : numInteriorAlf.hashCode());
		result = prime * result + ((tipoBusquedaVialidad == null) ? 0 : tipoBusquedaVialidad.hashCode());
		result = prime * result + ((tipoDomicilio == null) ? 0 : tipoDomicilio.hashCode());
		result = prime * result + ((vialidadPrimaria == null) ? 0 : vialidadPrimaria.hashCode());
		result = prime * result + ((vialidadReferenciaPosterior == null) ? 0 : vialidadReferenciaPosterior.hashCode());
		result = prime * result + ((vialidadReferenciaPrimaria == null) ? 0 : vialidadReferenciaPrimaria.hashCode());
		result = prime * result
				+ ((vialidadReferenciaSecundaria == null) ? 0 : vialidadReferenciaSecundaria.hashCode());
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
		DomicilioTO other = (DomicilioTO) obj;
		if (ambito == null) {
			if (other.ambito != null)
				return false;
		} else if (!ambito.equals(other.ambito))
			return false;
		if (asentamiento == null) {
			if (other.asentamiento != null)
				return false;
		} else if (!asentamiento.equals(other.asentamiento))
			return false;
		if (calle == null) {
			if (other.calle != null)
				return false;
		} else if (!calle.equals(other.calle))
			return false;
		if (clave == null) {
			if (other.clave != null)
				return false;
		} else if (!clave.equals(other.clave))
			return false;
		if (codigoPostal == null) {
			if (other.codigoPostal != null)
				return false;
		} else if (!codigoPostal.equals(other.codigoPostal))
			return false;
		if (colonia == null) {
			if (other.colonia != null)
				return false;
		} else if (!colonia.equals(other.colonia))
			return false;
		if (cvePersonaFisicaDom == null) {
			if (other.cvePersonaFisicaDom != null)
				return false;
		} else if (!cvePersonaFisicaDom.equals(other.cvePersonaFisicaDom))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (dicTipoDomicilio == null) {
			if (other.dicTipoDomicilio != null)
				return false;
		} else if (!dicTipoDomicilio.equals(other.dicTipoDomicilio))
			return false;
		if (domicilioCamino == null) {
			if (other.domicilioCamino != null)
				return false;
		} else if (!domicilioCamino.equals(other.domicilioCamino))
			return false;
		if (domicilioCarretera == null) {
			if (other.domicilioCarretera != null)
				return false;
		} else if (!domicilioCarretera.equals(other.domicilioCarretera))
			return false;
		if (estadoAdministracionAnteriorDomicilio != other.estadoAdministracionAnteriorDomicilio)
			return false;
		if (estadoAdministracionDomicilio != other.estadoAdministracionDomicilio)
			return false;
		if (latitud == null) {
			if (other.latitud != null)
				return false;
		} else if (!latitud.equals(other.latitud))
			return false;
		if (localidad == null) {
			if (other.localidad != null)
				return false;
		} else if (!localidad.equals(other.localidad))
			return false;
		if (longuitud == null) {
			if (other.longuitud != null)
				return false;
		} else if (!longuitud.equals(other.longuitud))
			return false;
		if (numExterior1 == null) {
			if (other.numExterior1 != null)
				return false;
		} else if (!numExterior1.equals(other.numExterior1))
			return false;
		if (numExterior2 == null) {
			if (other.numExterior2 != null)
				return false;
		} else if (!numExterior2.equals(other.numExterior2))
			return false;
		if (numExteriorAlf == null) {
			if (other.numExteriorAlf != null)
				return false;
		} else if (!numExteriorAlf.equals(other.numExteriorAlf))
			return false;
		if (numInterior1 == null) {
			if (other.numInterior1 != null)
				return false;
		} else if (!numInterior1.equals(other.numInterior1))
			return false;
		if (numInteriorAlf == null) {
			if (other.numInteriorAlf != null)
				return false;
		} else if (!numInteriorAlf.equals(other.numInteriorAlf))
			return false;
		if (tipoBusquedaVialidad == null) {
			if (other.tipoBusquedaVialidad != null)
				return false;
		} else if (!tipoBusquedaVialidad.equals(other.tipoBusquedaVialidad))
			return false;
		if (tipoDomicilio == null) {
			if (other.tipoDomicilio != null)
				return false;
		} else if (!tipoDomicilio.equals(other.tipoDomicilio))
			return false;
		if (vialidadPrimaria == null) {
			if (other.vialidadPrimaria != null)
				return false;
		} else if (!vialidadPrimaria.equals(other.vialidadPrimaria))
			return false;
		if (vialidadReferenciaPosterior == null) {
			if (other.vialidadReferenciaPosterior != null)
				return false;
		} else if (!vialidadReferenciaPosterior.equals(other.vialidadReferenciaPosterior))
			return false;
		if (vialidadReferenciaPrimaria == null) {
			if (other.vialidadReferenciaPrimaria != null)
				return false;
		} else if (!vialidadReferenciaPrimaria.equals(other.vialidadReferenciaPrimaria))
			return false;
		if (vialidadReferenciaSecundaria == null) {
			if (other.vialidadReferenciaSecundaria != null)
				return false;
		} else if (!vialidadReferenciaSecundaria.equals(other.vialidadReferenciaSecundaria))
			return false;
		return true;
	}
	
	
}
