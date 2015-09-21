package mx.gob.imss.cit.dictamen.commons.to.sat.individuo;

import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.derechohabiente.UnidadMedicaFamiliarTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.CURPTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.EntidadFederativaTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.PaisTO;

public class FisicaTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String altaEnImss;
	private Integer anioRegistroNac;
	private String busqAprox;
	private CURPTO cartaNaturalizacion;
	private CURPTO certificadoNacionalidadMexicoana;
	private String curp;
	private String curpRenapo;
	private String cveStatusRenapo;
	private Long cveFisica;
	private DatosPersonalesSATTO datosPersonalesSAT;
	private CURPTO documentosMigratorio;
	private EstadoCivilTO estadoCivil;
	private String estadosFormateados;
	private String estatusRenapo;
	private Date fechaBaja;
	private Date fechaDefuncion;
	private Date fechaModificacion;
	private Date fechaNacimiento;
	private String fechaNacimientoFormateada;
	private Date fechaRegistro;
	private CURPTO formaMigratoriaTurista;
	private EntidadFederativaTO lugarNacimiento;
	private Integer mesRegistroNac;
	private String nombre;
	private String nombreCompleto;
	private String nss;
	private String nssCifrado;
	private Integer numeroLineaArchivo;
	private CURPTO numeroUnicoExtranjero;
	private CURPTO oficioSolicitudRefugiado;
	private PaisTO pais;
	private String primerApellido;
	private List<RegimenTO> regimenes;
	private String segundoApellido;
	private SexoTO sexo;
	private List<SituacionSATTO> situacionesSAT;
	private String subEstadosFormateados;
	private TipoPoderTO tipoPoder;
	private UnidadMedicaFamiliarTO umf;
	public String getAltaEnImss() {
		return altaEnImss;
	}
	public void setAltaEnImss(String altaEnImss) {
		this.altaEnImss = altaEnImss;
	}
	public Integer getAnioRegistroNac() {
		return anioRegistroNac;
	}
	public void setAnioRegistroNac(Integer anioRegistroNac) {
		this.anioRegistroNac = anioRegistroNac;
	}
	public String getBusqAprox() {
		return busqAprox;
	}
	public void setBusqAprox(String busqAprox) {
		this.busqAprox = busqAprox;
	}
	public CURPTO getCartaNaturalizacion() {
		return cartaNaturalizacion;
	}
	public void setCartaNaturalizacion(CURPTO cartaNaturalizacion) {
		this.cartaNaturalizacion = cartaNaturalizacion;
	}
	public CURPTO getCertificadoNacionalidadMexicoana() {
		return certificadoNacionalidadMexicoana;
	}
	public void setCertificadoNacionalidadMexicoana(CURPTO certificadoNacionalidadMexicoana) {
		this.certificadoNacionalidadMexicoana = certificadoNacionalidadMexicoana;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public String getCurpRenapo() {
		return curpRenapo;
	}
	public void setCurpRenapo(String curpRenapo) {
		this.curpRenapo = curpRenapo;
	}
	public String getCveStatusRenapo() {
		return cveStatusRenapo;
	}
	public void setCveStatusRenapo(String cveStatusRenapo) {
		this.cveStatusRenapo = cveStatusRenapo;
	}
	public Long getCveFisica() {
		return cveFisica;
	}
	public void setCveFisica(Long cveFisica) {
		this.cveFisica = cveFisica;
	}
	public DatosPersonalesSATTO getDatosPersonalesSAT() {
		return datosPersonalesSAT;
	}
	public void setDatosPersonalesSAT(DatosPersonalesSATTO datosPersonalesSAT) {
		this.datosPersonalesSAT = datosPersonalesSAT;
	}
	public CURPTO getDocumentosMigratorio() {
		return documentosMigratorio;
	}
	public void setDocumentosMigratorio(CURPTO documentosMigratorio) {
		this.documentosMigratorio = documentosMigratorio;
	}
	public EstadoCivilTO getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivilTO estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getEstadosFormateados() {
		return estadosFormateados;
	}
	public void setEstadosFormateados(String estadosFormateados) {
		this.estadosFormateados = estadosFormateados;
	}
	public String getEstatusRenapo() {
		return estatusRenapo;
	}
	public void setEstatusRenapo(String estatusRenapo) {
		this.estatusRenapo = estatusRenapo;
	}
	public Date getFechaBaja() {
		return fechaBaja;
	}
	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	public Date getFechaDefuncion() {
		return fechaDefuncion;
	}
	public void setFechaDefuncion(Date fechaDefuncion) {
		this.fechaDefuncion = fechaDefuncion;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getFechaNacimientoFormateada() {
		return fechaNacimientoFormateada;
	}
	public void setFechaNacimientoFormateada(String fechaNacimientoFormateada) {
		this.fechaNacimientoFormateada = fechaNacimientoFormateada;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public CURPTO getFormaMigratoriaTurista() {
		return formaMigratoriaTurista;
	}
	public void setFormaMigratoriaTurista(CURPTO formaMigratoriaTurista) {
		this.formaMigratoriaTurista = formaMigratoriaTurista;
	}
	public EntidadFederativaTO getLugarNacimiento() {
		return lugarNacimiento;
	}
	public void setLugarNacimiento(EntidadFederativaTO lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}
	public Integer getMesRegistroNac() {
		return mesRegistroNac;
	}
	public void setMesRegistroNac(Integer mesRegistroNac) {
		this.mesRegistroNac = mesRegistroNac;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getNss() {
		return nss;
	}
	public void setNss(String nss) {
		this.nss = nss;
	}
	public String getNssCifrado() {
		return nssCifrado;
	}
	public void setNssCifrado(String nssCifrado) {
		this.nssCifrado = nssCifrado;
	}
	public Integer getNumeroLineaArchivo() {
		return numeroLineaArchivo;
	}
	public void setNumeroLineaArchivo(Integer numeroLineaArchivo) {
		this.numeroLineaArchivo = numeroLineaArchivo;
	}
	public CURPTO getNumeroUnicoExtranjero() {
		return numeroUnicoExtranjero;
	}
	public void setNumeroUnicoExtranjero(CURPTO numeroUnicoExtranjero) {
		this.numeroUnicoExtranjero = numeroUnicoExtranjero;
	}
	public CURPTO getOficioSolicitudRefugiado() {
		return oficioSolicitudRefugiado;
	}
	public void setOficioSolicitudRefugiado(CURPTO oficioSolicitudRefugiado) {
		this.oficioSolicitudRefugiado = oficioSolicitudRefugiado;
	}
	public PaisTO getPais() {
		return pais;
	}
	public void setPais(PaisTO pais) {
		this.pais = pais;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public List<RegimenTO> getRegimenes() {
		return regimenes;
	}
	public void setRegimenes(List<RegimenTO> regimenes) {
		this.regimenes = regimenes;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public SexoTO getSexo() {
		return sexo;
	}
	public void setSexo(SexoTO sexo) {
		this.sexo = sexo;
	}
	public List<SituacionSATTO> getSituacionesSAT() {
		return situacionesSAT;
	}
	public void setSituacionesSAT(List<SituacionSATTO> situacionesSAT) {
		this.situacionesSAT = situacionesSAT;
	}
	public String getSubEstadosFormateados() {
		return subEstadosFormateados;
	}
	public void setSubEstadosFormateados(String subEstadosFormateados) {
		this.subEstadosFormateados = subEstadosFormateados;
	}
	public TipoPoderTO getTipoPoder() {
		return tipoPoder;
	}
	public void setTipoPoder(TipoPoderTO tipoPoder) {
		this.tipoPoder = tipoPoder;
	}
	public UnidadMedicaFamiliarTO getUmf() {
		return umf;
	}
	public void setUmf(UnidadMedicaFamiliarTO umf) {
		this.umf = umf;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((altaEnImss == null) ? 0 : altaEnImss.hashCode());
		result = prime * result + ((anioRegistroNac == null) ? 0 : anioRegistroNac.hashCode());
		result = prime * result + ((busqAprox == null) ? 0 : busqAprox.hashCode());
		result = prime * result + ((cartaNaturalizacion == null) ? 0 : cartaNaturalizacion.hashCode());
		result = prime * result
				+ ((certificadoNacionalidadMexicoana == null) ? 0 : certificadoNacionalidadMexicoana.hashCode());
		result = prime * result + ((curp == null) ? 0 : curp.hashCode());
		result = prime * result + ((curpRenapo == null) ? 0 : curpRenapo.hashCode());
		result = prime * result + ((cveFisica == null) ? 0 : cveFisica.hashCode());
		result = prime * result + ((cveStatusRenapo == null) ? 0 : cveStatusRenapo.hashCode());
		result = prime * result + ((datosPersonalesSAT == null) ? 0 : datosPersonalesSAT.hashCode());
		result = prime * result + ((documentosMigratorio == null) ? 0 : documentosMigratorio.hashCode());
		result = prime * result + ((estadoCivil == null) ? 0 : estadoCivil.hashCode());
		result = prime * result + ((estadosFormateados == null) ? 0 : estadosFormateados.hashCode());
		result = prime * result + ((estatusRenapo == null) ? 0 : estatusRenapo.hashCode());
		result = prime * result + ((fechaBaja == null) ? 0 : fechaBaja.hashCode());
		result = prime * result + ((fechaDefuncion == null) ? 0 : fechaDefuncion.hashCode());
		result = prime * result + ((fechaModificacion == null) ? 0 : fechaModificacion.hashCode());
		result = prime * result + ((fechaNacimiento == null) ? 0 : fechaNacimiento.hashCode());
		result = prime * result + ((fechaNacimientoFormateada == null) ? 0 : fechaNacimientoFormateada.hashCode());
		result = prime * result + ((fechaRegistro == null) ? 0 : fechaRegistro.hashCode());
		result = prime * result + ((formaMigratoriaTurista == null) ? 0 : formaMigratoriaTurista.hashCode());
		result = prime * result + ((lugarNacimiento == null) ? 0 : lugarNacimiento.hashCode());
		result = prime * result + ((mesRegistroNac == null) ? 0 : mesRegistroNac.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((nombreCompleto == null) ? 0 : nombreCompleto.hashCode());
		result = prime * result + ((nss == null) ? 0 : nss.hashCode());
		result = prime * result + ((nssCifrado == null) ? 0 : nssCifrado.hashCode());
		result = prime * result + ((numeroLineaArchivo == null) ? 0 : numeroLineaArchivo.hashCode());
		result = prime * result + ((numeroUnicoExtranjero == null) ? 0 : numeroUnicoExtranjero.hashCode());
		result = prime * result + ((oficioSolicitudRefugiado == null) ? 0 : oficioSolicitudRefugiado.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
		result = prime * result + ((primerApellido == null) ? 0 : primerApellido.hashCode());
		result = prime * result + ((regimenes == null) ? 0 : regimenes.hashCode());
		result = prime * result + ((segundoApellido == null) ? 0 : segundoApellido.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		result = prime * result + ((situacionesSAT == null) ? 0 : situacionesSAT.hashCode());
		result = prime * result + ((subEstadosFormateados == null) ? 0 : subEstadosFormateados.hashCode());
		result = prime * result + ((tipoPoder == null) ? 0 : tipoPoder.hashCode());
		result = prime * result + ((umf == null) ? 0 : umf.hashCode());
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
		FisicaTO other = (FisicaTO) obj;
		if (altaEnImss == null) {
			if (other.altaEnImss != null)
				return false;
		} else if (!altaEnImss.equals(other.altaEnImss))
			return false;
		if (anioRegistroNac == null) {
			if (other.anioRegistroNac != null)
				return false;
		} else if (!anioRegistroNac.equals(other.anioRegistroNac))
			return false;
		if (busqAprox == null) {
			if (other.busqAprox != null)
				return false;
		} else if (!busqAprox.equals(other.busqAprox))
			return false;
		if (cartaNaturalizacion == null) {
			if (other.cartaNaturalizacion != null)
				return false;
		} else if (!cartaNaturalizacion.equals(other.cartaNaturalizacion))
			return false;
		if (certificadoNacionalidadMexicoana == null) {
			if (other.certificadoNacionalidadMexicoana != null)
				return false;
		} else if (!certificadoNacionalidadMexicoana.equals(other.certificadoNacionalidadMexicoana))
			return false;
		if (curp == null) {
			if (other.curp != null)
				return false;
		} else if (!curp.equals(other.curp))
			return false;
		if (curpRenapo == null) {
			if (other.curpRenapo != null)
				return false;
		} else if (!curpRenapo.equals(other.curpRenapo))
			return false;
		if (cveFisica == null) {
			if (other.cveFisica != null)
				return false;
		} else if (!cveFisica.equals(other.cveFisica))
			return false;
		if (cveStatusRenapo == null) {
			if (other.cveStatusRenapo != null)
				return false;
		} else if (!cveStatusRenapo.equals(other.cveStatusRenapo))
			return false;
		if (datosPersonalesSAT == null) {
			if (other.datosPersonalesSAT != null)
				return false;
		} else if (!datosPersonalesSAT.equals(other.datosPersonalesSAT))
			return false;
		if (documentosMigratorio == null) {
			if (other.documentosMigratorio != null)
				return false;
		} else if (!documentosMigratorio.equals(other.documentosMigratorio))
			return false;
		if (estadoCivil == null) {
			if (other.estadoCivil != null)
				return false;
		} else if (!estadoCivil.equals(other.estadoCivil))
			return false;
		if (estadosFormateados == null) {
			if (other.estadosFormateados != null)
				return false;
		} else if (!estadosFormateados.equals(other.estadosFormateados))
			return false;
		if (estatusRenapo == null) {
			if (other.estatusRenapo != null)
				return false;
		} else if (!estatusRenapo.equals(other.estatusRenapo))
			return false;
		if (fechaBaja == null) {
			if (other.fechaBaja != null)
				return false;
		} else if (!fechaBaja.equals(other.fechaBaja))
			return false;
		if (fechaDefuncion == null) {
			if (other.fechaDefuncion != null)
				return false;
		} else if (!fechaDefuncion.equals(other.fechaDefuncion))
			return false;
		if (fechaModificacion == null) {
			if (other.fechaModificacion != null)
				return false;
		} else if (!fechaModificacion.equals(other.fechaModificacion))
			return false;
		if (fechaNacimiento == null) {
			if (other.fechaNacimiento != null)
				return false;
		} else if (!fechaNacimiento.equals(other.fechaNacimiento))
			return false;
		if (fechaNacimientoFormateada == null) {
			if (other.fechaNacimientoFormateada != null)
				return false;
		} else if (!fechaNacimientoFormateada.equals(other.fechaNacimientoFormateada))
			return false;
		if (fechaRegistro == null) {
			if (other.fechaRegistro != null)
				return false;
		} else if (!fechaRegistro.equals(other.fechaRegistro))
			return false;
		if (formaMigratoriaTurista == null) {
			if (other.formaMigratoriaTurista != null)
				return false;
		} else if (!formaMigratoriaTurista.equals(other.formaMigratoriaTurista))
			return false;
		if (lugarNacimiento == null) {
			if (other.lugarNacimiento != null)
				return false;
		} else if (!lugarNacimiento.equals(other.lugarNacimiento))
			return false;
		if (mesRegistroNac == null) {
			if (other.mesRegistroNac != null)
				return false;
		} else if (!mesRegistroNac.equals(other.mesRegistroNac))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (nombreCompleto == null) {
			if (other.nombreCompleto != null)
				return false;
		} else if (!nombreCompleto.equals(other.nombreCompleto))
			return false;
		if (nss == null) {
			if (other.nss != null)
				return false;
		} else if (!nss.equals(other.nss))
			return false;
		if (nssCifrado == null) {
			if (other.nssCifrado != null)
				return false;
		} else if (!nssCifrado.equals(other.nssCifrado))
			return false;
		if (numeroLineaArchivo == null) {
			if (other.numeroLineaArchivo != null)
				return false;
		} else if (!numeroLineaArchivo.equals(other.numeroLineaArchivo))
			return false;
		if (numeroUnicoExtranjero == null) {
			if (other.numeroUnicoExtranjero != null)
				return false;
		} else if (!numeroUnicoExtranjero.equals(other.numeroUnicoExtranjero))
			return false;
		if (oficioSolicitudRefugiado == null) {
			if (other.oficioSolicitudRefugiado != null)
				return false;
		} else if (!oficioSolicitudRefugiado.equals(other.oficioSolicitudRefugiado))
			return false;
		if (pais == null) {
			if (other.pais != null)
				return false;
		} else if (!pais.equals(other.pais))
			return false;
		if (primerApellido == null) {
			if (other.primerApellido != null)
				return false;
		} else if (!primerApellido.equals(other.primerApellido))
			return false;
		if (regimenes == null) {
			if (other.regimenes != null)
				return false;
		} else if (!regimenes.equals(other.regimenes))
			return false;
		if (segundoApellido == null) {
			if (other.segundoApellido != null)
				return false;
		} else if (!segundoApellido.equals(other.segundoApellido))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		if (situacionesSAT == null) {
			if (other.situacionesSAT != null)
				return false;
		} else if (!situacionesSAT.equals(other.situacionesSAT))
			return false;
		if (subEstadosFormateados == null) {
			if (other.subEstadosFormateados != null)
				return false;
		} else if (!subEstadosFormateados.equals(other.subEstadosFormateados))
			return false;
		if (tipoPoder == null) {
			if (other.tipoPoder != null)
				return false;
		} else if (!tipoPoder.equals(other.tipoPoder))
			return false;
		if (umf == null) {
			if (other.umf != null)
				return false;
		} else if (!umf.equals(other.umf))
			return false;
		return true;
	}
	
}
