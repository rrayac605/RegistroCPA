package mx.gob.imss.distss.dictamen.contador.integration.impl;

import gob.imss.webservice.sat.rfc.cliente.EntradaSAT;
import gob.imss.webservice.sat.rfc.cliente.Identificacion;
import gob.imss.webservice.sat.rfc.cliente.SalidaSAT;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.contador.commons.exception.DictamenContadorException;
import mx.gob.imss.cit.dictamen.contador.integration.api.SolicitudRegistroIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.CatalogoDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.ColegioDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.ContadorPublicoAutDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DatosContactoDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DespachoDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.InfoProfesional;
import mx.gob.imss.cit.dictamen.contador.integration.api.exception.DictamenContadorNegocioException;
import mx.gob.imss.cit.dictamen.contador.services.ConsultaSATService;
import mx.gob.imss.distss.dictamen.contador.integration.util.TransformerIntegrationUtils;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;


@Remote({mx.gob.imss.cit.dictamen.contador.integration.api.SolicitudRegistroIntegrator.class})
@Stateless
public class SolicitudRegistroServiceIntegrator implements SolicitudRegistroIntegrator {

	private static final Logger LOG=Logger.getLogger(SolicitudRegistroServiceIntegrator.class);

	@EJB
	ConsultaSATService consultaSATService;
	
	@Override
	public ContadorPublicoAutDTO obtenerContadorPublicoAutDTO(String curp, String rfc) throws DictamenContadorNegocioException {
		EntradaSAT entrada = new EntradaSAT();
		entrada.setRfc(rfc);
		ContadorPublicoAutDTO contador = null;
		try {
			SalidaSAT salida = consultaSATService.obtenerDomicilioFiscal(entrada);
			if(salida != null && !salida.getUbicacion().isEmpty()){
				contador = new ContadorPublicoAutDTO();
				contador.setContacto(new DatosContactoDTO());
				contador.setInfoProf(new InfoProfesional());
				contador.setCurp(salida.getIdentificacion().get(0).getCURP());
				contador.setRfc(salida.getRFCOriginal());
				contador.setNombre(buscarRazonSocial(salida.getIdentificacion()));
				contador.setDomicilio(TransformerIntegrationUtils.transformer(salida.getUbicacion().get(0)));
			}

		} catch (DictamenContadorException e) {
			LOG.error(e.getMessage(),e);
			throw new DictamenContadorNegocioException(e.getMessage(), e);
		}
		return contador;
	}

	@Override
	public boolean guardarDatosContador(ContadorPublicoAutDTO contador) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<CatalogoDTO> obtenerCatalogoCargos() {
		List<CatalogoDTO> cargos = new ArrayList<CatalogoDTO>();
		CatalogoDTO cargo = new CatalogoDTO();
		cargo.setId(1L);
		cargo.setDescripcion("Director");
		cargos.add(cargo);
		cargo = new CatalogoDTO();
		cargo.setId(2L);
		cargo.setDescripcion("Socio");
		cargos.add(cargo);
		cargo = new CatalogoDTO();
		cargo.setId(3L);
		cargo.setDescripcion("Gerente");
		cargos.add(cargo);
		cargo = new CatalogoDTO();
		cargo.setId(4L);
		cargo.setDescripcion("Auditor");
		cargos.add(cargo);
		return cargos;
	}
	
	@Override
	public DespachoDTO obtenerDespachoDTO(String rfc) throws DictamenContadorNegocioException {
		EntradaSAT entrada = new EntradaSAT();
		entrada.setRfc(rfc);
		DespachoDTO despacho = null;
		try {
			SalidaSAT salida = consultaSATService.obtenerDomicilioFiscal(entrada);
			if(salida != null && !salida.getUbicacion().isEmpty()){
				despacho = new DespachoDTO();
				despacho.setRfc(salida.getRFCOriginal());
				despacho.setRazonSocial(buscarRazonSocial(salida.getIdentificacion()));
				despacho.setDomicilio(TransformerIntegrationUtils.transformer(salida.getUbicacion().get(0)));
			}
		} catch (DictamenContadorException e) {
			LOG.error(e.getMessage(),e);
			throw new DictamenContadorNegocioException(e.getMessage(), e);
		}
		return despacho;
	}
	
	private String buscarRazonSocial(List<Identificacion> list) {
		String razonSocial = null;
		for(Identificacion ubi : list){
			if(StringUtils.isNotBlank(ubi.getRazonSoc())){
				razonSocial = ubi.getRazonSoc();
			} else if(StringUtils.isNotBlank(ubi.getNomComercial())){
				razonSocial = ubi.getNomComercial();
			} else{
				razonSocial = ubi.getNombre();
			}
		}
		return razonSocial;
	}

	@Override
	public ColegioDTO obtenerColegioDTO(String rfc) throws DictamenContadorNegocioException {
		EntradaSAT entrada = new EntradaSAT();
		entrada.setRfc(rfc);
		ColegioDTO colegio = null;
		try {
			SalidaSAT salida = consultaSATService.obtenerDomicilioFiscal(entrada);
			if(salida != null && !salida.getUbicacion().isEmpty()){
				colegio = new ColegioDTO();
				colegio.setRfc(salida.getRFCOriginal());
				colegio.setRazonSocial(buscarRazonSocial(salida.getIdentificacion()));
				colegio.setDomicilio(TransformerIntegrationUtils.transformer(salida.getUbicacion().get(0)));
			}

		} catch (DictamenContadorException e) {
			LOG.error(e.getMessage(),e);
			throw new DictamenContadorNegocioException(e.getMessage(), e);
		}
		return colegio;
	}

}
