package mx.gob.imss.distss.dictamen.service.business;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import mx.gob.imss.distss.dictamen.modelo.dto.NdtContadorPublicoAutDTO;
import mx.gob.imss.distss.dictamen.service.interfaces.NotariaServiceLocal;
import mx.gob.imss.distss.dictamen.service.interfaces.v2.ReporteServiceRemote;
import mx.gob.imss.distss.dictamen.util.ConstantesDictamen;
import mx.gob.imss.distss.dictamen.util.UtileriaFechas;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperRunManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;

@Stateless(name = "reporteServiceBusiness", mappedName = "reporteServiceBusiness")
public class ReporteServiceBusiness implements ReporteServiceRemote {
	
	private static final Logger logger = LoggerFactory.getLogger(ReporteServiceBusiness.class);

	@EJB
	NotariaServiceLocal notariaServiceLocal;

	/**
	 * Metodo para generar diferentes tipos de reportes de las notificaciones como son: 
	 * Acuse de Registro, Acuse de Publicaci�n, Acuse de Retiro
	 * @param jsonDocumentosAdjuntosDTO
	 * @return boolean
	 */
	@Override
	public boolean generarReportePDF(Map<String, Object> parametrosReporte, Integer tipoReporte) throws RuntimeException {
		byte[] byteArray = null;
		String rutaJasper = null;
		boolean flagEstado = false;
		try {
			if (parametrosReporte == null) {
				parametrosReporte = new HashMap<String, Object>();
			}
			
			parametrosLayout(parametrosReporte);
			
			switch (tipoReporte) {
				case ConstantesDictamen.TIPO_REPORTE_SOLICITUD_REGISTRO_CONTADOR:
					rutaJasper = "plantillasReportes/SolicitudRegistroContador.jasper";
					byteArray = obtenerPDFByteArray(rutaJasper, parametrosReporte);
					if (byteArray != null) {
						notariaServiceLocal.guardarArchivoFirmado(parametrosReporte.get("numTramiteNotaria").toString(), generaArchivo(byteArray), ConstantesDictamen.NOMBRE_ACUSE_SOLICITUD_REGISTRO);
					}
					break;
				case ConstantesDictamen.TIPO_REPORTE_SOLICITUD_BAJA_VOLUNTARIA:
					rutaJasper = "plantillasReportes/SolicitudBajaVoluntariaContador.jasper";
					byteArray = obtenerPDFByteArray(rutaJasper, parametrosReporte);
					if (byteArray != null) {
						notariaServiceLocal.guardarArchivoFirmado(parametrosReporte.get("numTramiteNotaria").toString(), generaArchivo(byteArray), ConstantesDictamen.NOMBRE_ACUSE_SOLICITUD_BAJA_VOLUNTARIA);
					}
					break;
			}
		} catch (Exception ex) {
			logger.info("ERROR: Al generar el reporte y el guardado en notaria.", ex);
			throw new RuntimeException("ERROR: Al generar el reporte y el guardado en notar\u00eda.", ex);
		}
		return flagEstado;
	}
	
	/**
	 * Metodo que nos sirve para mandar los parametros de los layout de los reportes
	 * @param parametrosReporte
	 */
	private void parametrosLayout(Map<String, Object> iReportParameter) throws RuntimeException {
		try {
			iReportParameter.put("imgLogoImss","imagenesReportes/logoImss.jpg");
			iReportParameter.put("imgGobiernoRepublica","imagenesReportes/gobiernoRepublica.png");
			iReportParameter.put("imgEscudoNacional","imagenesReportes/escudoNacional.jpg");
		} catch (Exception ex) {
			logger.info("ERROR: Al obtener los parametros del Layaout del reporte.", ex);
			throw new RuntimeException("ERROR: Al obtener los parametros del Layaout del reporte.", ex);
		}
	}
	
	/**
	 * Metodo que construye el reporte con los parametros enviados y es creado como un arreglo de bytes 
	 * @param rutaJasper
	 * @param parametrosReporte
	 * @return byte[]
	 */
	public byte[] obtenerPDFByteArray(String rutaJasper, Map<String, Object> parametrosReporte) throws RuntimeException {
		byte[] byteArray = null;
		InputStream inputStream = null;
		try {
			inputStream = new ClassPathResource(rutaJasper).getInputStream();
			byteArray = JasperRunManager.runReportToPdf(inputStream, parametrosReporte, new JREmptyDataSource());
		} catch (FileNotFoundException ex) {
			logger.error("ERROR: No se encontro el archivo jasper.", ex);
			throw new RuntimeException("ERROR: No se encontro el archivo jasper.", ex);
		} catch (JRException ex) {
			logger.error("ERROR: No se pudo crear el arreglo de byte del reporte ", ex);
			throw new RuntimeException("Error al generar el reporte y el guardado en notar\u00eda.", ex);
		} catch (IOException e) {
			e.printStackTrace();
			logger.error("ERROR: No se encontro el archivo jasper ", e);
			throw new RuntimeException("Error al generar el reporte y el guardado en notar\u00eda.", e);
		} finally {
            if (inputStream != null) {
                try {
                	inputStream.close();
                } catch (IOException ex) {
                    logger.error("ERROR: No se pudo cerrar el inputStream.", ex);
                    throw new RuntimeException("ERROR: No se pudo cerrar el inputStream.", ex);
                }
            }
        }
		return byteArray;
	}
	
	public String generaArchivo(byte[] bytes) throws RuntimeException {
		String acusePdf = null;
		try {
			acusePdf = org.apache.soap.encoding.soapenc.Base64.encode(bytes);
		} catch (Exception ex) {
			logger.error("ERROR: No se pudo obtner el encoding Base64 de los Bytes para generar el archivo del Reporte.", ex);
            throw new RuntimeException("ERROR: No se pudo obtner el encoding Base64 de los Bytes para generar el archivo del Reporte.", ex);
		}
		return acusePdf;
	}
	
	/**
	 * Funcion que genera los parametros que se envian al reporte en el caso de una solicitud de registro,
	 * valida que ninguno de ellos se envie nulo
	 * @param ndtContadorPublicoAutDTO
	 * @return
	 * @throws RuntimeException
	 */
	public Map<String,Object> generaParametrosRegistroContador (NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO) throws RuntimeException {
		final Map<String, Object> iReportParameter = new HashMap<String, Object>();
		
		parametrosLayout(iReportParameter);
		
		try {
			if (ndtContadorPublicoAutDTO != null) {
				iReportParameter.put("fecha", UtileriaFechas.parseDateToString(new Date(), "dd/MM/yyyy"));
				iReportParameter.put("numTramiteNotaria", ndtContadorPublicoAutDTO.getListNdtCpaTramites() != null ? 
						ndtContadorPublicoAutDTO.getListNdtCpaTramites().get(0) != null ? 
						ndtContadorPublicoAutDTO.getListNdtCpaTramites().get(0).getNumTramiteNotaria() != null ? 
						ndtContadorPublicoAutDTO.getListNdtCpaTramites().get(0).getNumTramiteNotaria() : "" : "" : "");
				iReportParameter.put("nombreCompleto", ndtContadorPublicoAutDTO.getUsuarioSesion() != null ? 
						ndtContadorPublicoAutDTO.getUsuarioSesion().getNombreCompleto() != null ? 
						ndtContadorPublicoAutDTO.getUsuarioSesion().getNombreCompleto() : "" : "");
				iReportParameter.put("RFC", ndtContadorPublicoAutDTO.getUsuarioSesion() != null ? 
						ndtContadorPublicoAutDTO.getUsuarioSesion().getRfc() != null ? 
						ndtContadorPublicoAutDTO.getUsuarioSesion().getRfc() : "" : "");
				iReportParameter.put("CURP", ndtContadorPublicoAutDTO.getUsuarioSesion() != null ? 
						ndtContadorPublicoAutDTO.getUsuarioSesion().getCurp() != null ? 
						ndtContadorPublicoAutDTO.getUsuarioSesion().getCurp() : "" : "");
				StringBuilder domicilioFiscal = null;
				if (ndtContadorPublicoAutDTO.getPersonaFiscal() != null && ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal() != null) {
					domicilioFiscal = new StringBuilder();
					domicilioFiscal.append(ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getCalle() != null ? 
							ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getCalle() +" " : "");
					domicilioFiscal.append(ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getNumExterior1() != null ? 
							ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getNumExterior1() +"" : "");
					domicilioFiscal.append(ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getNumExteriorAlf() != null ? 
							ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getNumExteriorAlf() +" " : "");
					domicilioFiscal.append(ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getNumInterior() != null ? 
							ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getNumInterior() +" " : "");
					domicilioFiscal.append(ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getNumInteriorAlf() != null ? 
							ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getNumInteriorAlf() +" " : "");
					if (ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento() != null) {
						if (ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento().getLocalidad() != null && 
								ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento().getLocalidad().getMunicipio() != null && 
								ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento().getLocalidad().getMunicipio().getEntidadFederativa() != null) {
							domicilioFiscal.append(ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento().getLocalidad().getMunicipio().getEntidadFederativa().getNombre() != null ?
									ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento().getLocalidad().getMunicipio().getEntidadFederativa().getNombre() +" " : "");
						}
						if (ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento().getLocalidad() != null && 
								ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento().getLocalidad().getMunicipio() != null) {
							domicilioFiscal.append(ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento().getLocalidad().getMunicipio().getNombre() != null ?
									ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento().getLocalidad().getMunicipio().getNombre() +" " : "");
						}
						domicilioFiscal.append(ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento().getNombre() != null ? 
								ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento().getNombre() +" " : "");
					}
					if (ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getCodigoPostal() != null) {
						domicilioFiscal.append(ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getCodigoPostal().getCodigoPostal() != null ?
								ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getCodigoPostal().getCodigoPostal() : "");
					}
				}
				iReportParameter.put("domicilioFiscal", domicilioFiscal.toString() != null ? domicilioFiscal.toString() : "");
				
				String numeroCedula = "";
				if (ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales() != null && !ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().isEmpty()) {
					numeroCedula = ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).getCedulaProfesional();
					if (numeroCedula == null) {
						numeroCedula = "";
					}
				}
				iReportParameter.put("numeroCedulaProfesional", numeroCedula);
				iReportParameter.put("razonSocialDespacho", ndtContadorPublicoAutDTO.getNdtDespachosDTO() != null ? 
						ndtContadorPublicoAutDTO.getNdtDespachosDTO().getRazonSocial() != null ? 
						ndtContadorPublicoAutDTO.getNdtDespachosDTO().getRazonSocial() : "" : "");
				iReportParameter.put("razonSocialColegio", ndtContadorPublicoAutDTO.getNdtColegioDTO() != null ? 
						ndtContadorPublicoAutDTO.getNdtColegioDTO().getRazonSocial() != null ? 
						ndtContadorPublicoAutDTO.getNdtColegioDTO().getRazonSocial() : "" : "");
				String tipoCurp = "";
				if (ndtContadorPublicoAutDTO.getUsuarioSesion() != null && ndtContadorPublicoAutDTO.getUsuarioSesion().getCurp() != null) {
					tipoCurp = ndtContadorPublicoAutDTO.getUsuarioSesion().getCurp().substring(12, 13);
					if (tipoCurp != "NE") {
						tipoCurp = "Mexicana";
					} else {
						tipoCurp = "Extranjera";
					}
				}
				iReportParameter.put("nacionalidad", tipoCurp);
				iReportParameter.put("cadenaOriginal", ndtContadorPublicoAutDTO.getCadenaOriginal() != null ? 
						ndtContadorPublicoAutDTO.getCadenaOriginal() : "");
				String selloDigitalIMSS = "";
				if (ndtContadorPublicoAutDTO.getListNdtCpaTramites() != null && !ndtContadorPublicoAutDTO.getListNdtCpaTramites().isEmpty()) {
					selloDigitalIMSS = ndtContadorPublicoAutDTO.getListNdtCpaTramites().get(0).getSelloDigitalImss();
					if (selloDigitalIMSS == null) {
						selloDigitalIMSS = "";
					}
				}
				iReportParameter.put("selloDigitalIMSS", selloDigitalIMSS);
			}
		} catch (Exception ex) {
			logger.error("ERROR: al generar los par\u00e1metros preliminares del reporte de solicitud de registro de un contador publico.", ex);
			throw new RuntimeException("ERROR: al generar los par\u00e1metros preliminares del reporte de solicitud de registro de un contador publico.", ex);
		}
		return iReportParameter;
	}
	
	@Override
	public byte[] generarReportePreliminar(Map<String, Object> parametrosReporte, Integer tipoReporte) {
		byte[] byteArray = null;
		String rutaJasper = null;
		
		try {
			switch (tipoReporte) {
				case ConstantesDictamen.TIPO_REPORTE_SOLICITUD_REGISTRO_CONTADOR:
					rutaJasper = "plantillasReportes/SolicitudRegistroContador.jasper";
					byteArray = obtenerPDFByteArray(rutaJasper, parametrosReporte);
					break;
				case ConstantesDictamen.TIPO_REPORTE_SOLICITUD_BAJA_VOLUNTARIA:
					rutaJasper = "plantillasReportes/SolicitudBajaVoluntariaContador.jasper";
					byteArray = obtenerPDFByteArray(rutaJasper, parametrosReporte);
					break;
			}
		} catch (Exception ex) {
			logger.error("ERROR: No se pudo generar el arreglo de bytes del reporte para la visualizacion preliminar.", ex);
            throw new RuntimeException("ERROR: No se pudo generar el arreglo de bytes del reporte para la visualizacion preliminar.", ex);
		}
		return byteArray;
	}

	@Override
	public Map<String, Object> generaParametrosBajaVoluntariaContador(NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO) {
		final Map<String, Object> iReportParameter = new HashMap<String, Object>();
		
		parametrosLayout(iReportParameter);
		
		try {
			if (ndtContadorPublicoAutDTO != null) {
				iReportParameter.put("fecha", UtileriaFechas.parseDateToString(new Date(), "dd/MM/yyyy"));
				iReportParameter.put("numTramiteNotaria", ndtContadorPublicoAutDTO.getListNdtCpaTramites() != null ? 
						ndtContadorPublicoAutDTO.getListNdtCpaTramites().get(0) != null ? 
						ndtContadorPublicoAutDTO.getListNdtCpaTramites().get(0).getNumTramiteNotaria() != null ? 
						ndtContadorPublicoAutDTO.getListNdtCpaTramites().get(0).getNumTramiteNotaria() : "" : "" : "");
				iReportParameter.put("nombreCompleto", ndtContadorPublicoAutDTO.getUsuarioSesion() != null ? 
						ndtContadorPublicoAutDTO.getUsuarioSesion().getNombreCompleto() != null ? 
						ndtContadorPublicoAutDTO.getUsuarioSesion().getNombreCompleto() : "" : "");
				iReportParameter.put("RFC", ndtContadorPublicoAutDTO.getUsuarioSesion() != null ? 
						ndtContadorPublicoAutDTO.getUsuarioSesion().getRfc() != null ? 
						ndtContadorPublicoAutDTO.getUsuarioSesion().getRfc() : "" : "");
				iReportParameter.put("CURP", ndtContadorPublicoAutDTO.getUsuarioSesion() != null ? 
						ndtContadorPublicoAutDTO.getUsuarioSesion().getCurp() != null ? 
						ndtContadorPublicoAutDTO.getUsuarioSesion().getCurp() : "" : "");
				iReportParameter.put("numRegistroCpa", ndtContadorPublicoAutDTO.getNumRegistroCpa() != null ? 
						ndtContadorPublicoAutDTO.getNumRegistroCpa().toString() : "");
				StringBuilder domicilioFiscal = null;
				if (ndtContadorPublicoAutDTO.getPersonaFiscal() != null && ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal() != null) {
					domicilioFiscal = new StringBuilder();
					domicilioFiscal.append(ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getCalle() != null ? 
							ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getCalle() +" " : "");
					domicilioFiscal.append(ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getNumExterior1() != null ? 
							ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getNumExterior1() +"" : "");
					domicilioFiscal.append(ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getNumExteriorAlf() != null ? 
							ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getNumExteriorAlf() +" " : "");
					domicilioFiscal.append(ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getNumInterior() != null ? 
							ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getNumInterior() +" " : "");
					domicilioFiscal.append(ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getNumInteriorAlf() != null ? 
							ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getNumInteriorAlf() +" " : "");
					if (ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento() != null) {
						if (ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento().getLocalidad() != null && 
								ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento().getLocalidad().getMunicipio() != null && 
								ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento().getLocalidad().getMunicipio().getEntidadFederativa() != null) {
							domicilioFiscal.append(ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento().getLocalidad().getMunicipio().getEntidadFederativa().getNombre() != null ?
									ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento().getLocalidad().getMunicipio().getEntidadFederativa().getNombre() +" " : "");
						}
						if (ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento().getLocalidad() != null && 
								ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento().getLocalidad().getMunicipio() != null) {
							domicilioFiscal.append(ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento().getLocalidad().getMunicipio().getNombre() != null ?
									ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento().getLocalidad().getMunicipio().getNombre() +" " : "");
						}
						domicilioFiscal.append(ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento().getNombre() != null ? 
								ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento().getNombre() +" " : "");
					}
					if (ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getCodigoPostal() != null) {
						domicilioFiscal.append(ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getCodigoPostal().getCodigoPostal() != null ?
								ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getCodigoPostal().getCodigoPostal() : "");
					}
				}
				iReportParameter.put("domicilioFiscal", domicilioFiscal.toString() != null ? domicilioFiscal.toString() : "");
				
				String numeroCedula = "";
				if (ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales() != null && !ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().isEmpty()) {
					numeroCedula = ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).getCedulaProfesional();
					if (numeroCedula == null) {
						numeroCedula = "";
					}
				}
				iReportParameter.put("numeroCedulaProfesional", numeroCedula);
				iReportParameter.put("cadenaOriginal", ndtContadorPublicoAutDTO.getCadenaOriginal() != null ? 
						ndtContadorPublicoAutDTO.getCadenaOriginal() : "");
				String selloDigitalIMSS = "";
				if (ndtContadorPublicoAutDTO.getListNdtCpaTramites() != null && !ndtContadorPublicoAutDTO.getListNdtCpaTramites().isEmpty()) {
					selloDigitalIMSS = ndtContadorPublicoAutDTO.getListNdtCpaTramites().get(0).getSelloDigitalImss();
					if (selloDigitalIMSS == null) {
						selloDigitalIMSS = "";
					}
				}
				iReportParameter.put("selloDigitalIMSS", selloDigitalIMSS);
			}
		} catch (Exception ex) {
			logger.error("ERROR: al generar los par\u00e1metros preliminares del reporte de solicitud de baja voluntaria de un contador publico.", ex);
			throw new RuntimeException("ERROR: al generar los par\u00e1metros preliminares del reporte de solicitud de baja voluntaria de un contador publico.", ex);
		}
		return iReportParameter;
	}

}
