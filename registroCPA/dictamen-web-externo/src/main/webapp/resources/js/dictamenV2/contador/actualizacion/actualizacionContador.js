var paginaActual = 1;
var totalPaginas = 3;

$(document).ready(function() {
	$.blockUI();
	ocultarDivsPaginas();
	ocultarBotones();
//	$("#idBtnFinalizarTramite").show();
	$("#idDivSeleccionActualizacionDatos").show();
	$("#idDivSubtituloPasoUno").show();
	$("#idDivDatosGenerales").show();
	$("#idDivDatosDespacho").show();
	$("#idDivDatosProfesionales").show();
	$("#idDivLabelDatosRequeridos").show();
	$("#idBtnContinuar").show();
	$("#idBtnCancelar").show();
	
	habilitarCamposGenerales();
	deshabilitarCamposDespacho();
	deshabilitarCamposColegio();
	
	initValidacionesDatosGenerales();
	initValidacionesDatosDespacho();
	initValidacionesDatosProfesionales();
	
	$("#idSltMostrarDatos").change(function() {
		if ($("#idSltMostrarDatos").val() == 1) {
			habilitarCamposGenerales();
			deshabilitarCamposDespacho();
			deshabilitarCamposColegio();
		} else if ($("#idSltMostrarDatos").val() == 2) {
			habilitarCamposDespacho();
			deshabilitarCamposGenerales();
			deshabilitarCamposColegio();
		} else if ($("#idSltMostrarDatos").val() == 3) {
			habilitarCamposColegio();
			deshabilitarCamposGenerales();
			deshabilitarCamposDespacho();
		}
	});
	
	$("#idBtnFinalizarTramite").click(function(e) {
	    if (ndtContadorPublicoAutDTO != null) {
	        try {
	            /*solicita iniciar componente de firma electronica*/
	            lanzarComponenteFirma({
	            	descripcionTipoSolicitud : "Actualización del Contador Público Autorizado",
					curp : ndtContadorPublicoAutDTO.usuarioSesion.curp,
					rfc : ndtContadorPublicoAutDTO.personaFiscal.rfc,
					nombreCompleto : ndtContadorPublicoAutDTO.usuarioSesion.nombreCompleto,
					afectado: [""],
					tipoAcuse: '1',
					acuse: 'CDCT'
	            });
	        } catch (err) {
	            $.unblockUI();
	        }
	    }
	    e.preventDefault();
	});
	$.unblockUI();
});

function cambiarPagina(sumaPagina) {
	if (paginaActual == totalPaginas && sumaPagina > 0) {
		return;
	} else if (paginaActual == 1 && sumaPagina < 0) {
		return;
	}
    paginaActual += sumaPagina;
	
	switch(paginaActual) {
		case 1:
			ocultarDivsPaginas();
			ocultarBotones();
			$("#idDivSeleccionActualizacionDatos").show();
			$("#idDivSubtituloPasoUno").show();
			$("#idDivDatosGenerales").show();
			$("#idDivDatosDespacho").show();
			$("#idDivDatosProfesionales").show();
			$("#idDivLabelDatosRequeridos").show();
			$("#idBtnContinuar").show();
			$("#idBtnCancelar").show();
			break;
		case 2:
			generarReportePreliminar();
			ocultarDivsPaginas();
			ocultarBotones();
			$("#idDivSubtituloPasoDos").show();
			$("#idDivVistaPreliminar").show();
			$("#idBtnCancelar").show();
			$("#idBtnFinalizarTramite").show();
			break;
		case 3:
			ocultarDivsPaginas();
			ocultarBotones();
			$("#idDivSubtituloPasoTres").show();
			$("#idDivResumenRegistro").show();
			$("#idBtnSalirTramite").show();
			break;
	}
}

function generarReportePreliminar() {
	$.blockUI();
	llenarNdtContadorPublicoAutDTO();
	ndtContadorPublicoAutDTO.listNdtCpaTramites[0].numTramiteNotaria = null;
	ndtContadorPublicoAutDTO.usuarioSesion = null;
	ndtContadorPublicoAutDTO.personaFiscal = null;
	$.postJSON(context_path+"/dictamenV2/contador/registro/generaParametrosPreliminares.do", ndtContadorPublicoAutDTO, function(data) {
		ndtContadorPublicoAutDTO = data;
		if (ndtContadorPublicoAutDTO != null) {
			if (ndtContadorPublicoAutDTO.errorFormGeneral == null || ndtContadorPublicoAutDTO.errorFormGeneral == "") {
				if (document.getElementById("idIframeVisualizador") == null) {
					$("<iframe id='idIframeVisualizador' " +
							"src='"+context_path+"/dictamenV2/contador/registro/visualizarPDF.do' " +
							"width='1000' height='800' frameborder='0' scrolling='auto'></iframe>").appendTo($("#idDivContenedorVizualizador"));
				} else {
					document.getElementById("idIframeVisualizador").src = context_path+"/dictamenV2/contador/registro/visualizarPDF.do";
				}
			} else {
				showError(ndtContadorPublicoAutDTO.errorFormGeneral);
			}
		}
	}).error(function(data) {
    	$.unblockUI();
	}).complete(function(data) {
		$.unblockUI();
	});
}

/*solo si no se ha logrado realizar la firma electronica*/
function firmaFallada() {
    $.unblockUI();
    showError("La validaci\u00f3n de la firma no pudo ser realizada.");
}

function firmaExitosa(firmaResponse) {
	$.blockUI();
	ndtContadorPublicoAutDTO.listNdtCpaTramites[0].reciboNotaria = firmaResponse.reciboNotarial;
	ndtContadorPublicoAutDTO.listNdtCpaTramites[0].urlAcuseNotaria = firmaResponse.urlAcuseFirma;
	llenarNdtContadorPublicoAutDTO();
	$.postJSON(context_path+"/dictamenV2/contador/actualizacion/actualizarContador.do", ndtContadorPublicoAutDTO, function(data) {
		ndtContadorPublicoAutDTO = data;
		if (ndtContadorPublicoAutDTO != null) {
			if (ndtContadorPublicoAutDTO.errorFormGeneral == null || ndtContadorPublicoAutDTO.errorFormGeneral == "") {
				llenarTablaResumenTramite(ndtContadorPublicoAutDTO);
				cambiarPagina(1);
			} else {
				showError(ndtContadorPublicoAutDTO.errorFormGeneral);
			}
		} else {
			showError({
				mensaje: "No se pudo actualizar al Contador P\u00fablico Autorizado, Int\u00e9ntelo m\u00e1s tarde.",
				width: 420
			});
		}
	}).error(function(data) {
    	$.unblockUI();
	}).complete(function(data) {
		$.unblockUI();
	});
}

function salirMenuServicios() {
	$('form#idFrmRegistroContador').attr('action', context_path);
    $('form#idFrmRegistroContador').submit();
}

function llenarNdtContadorPublicoAutDTO() {
	llenarDatosGenerales();
	llenarDatosDespacho();
	llenarDatosProfesionales();
}

function llenarTablaResumenTramite(ndtContadorPublicoAutDTO) {
	$("#idTxtFolioTramiteResumen").text(ndtContadorPublicoAutDTO.listNdtCpaTramites[0].cveIdTramite);
	$("#idTxtFecRegistroContadorResumen").text(ndtContadorPublicoAutDTO.fecRegistroAlta);
	$("#idTxtRfcContadorResumen").text(ndtContadorPublicoAutDTO.usuarioSesion.rfc);
	$("#idTxtRazSocialDespachoResumen").text(ndtContadorPublicoAutDTO.ndtDespachosDTO.razonSocial);
	$("#idTxtNomContadorResumen").text(ndtContadorPublicoAutDTO.usuarioSesion.nombreCompleto);
}

function ocultarDivsPaginas() {
	$("#idDivSubtituloPasoUno").hide();
	$("#idDivSubtituloPasoDos").hide();
	$("#idDivSubtituloPasoTres").hide();
	$("#idDivSeleccionActualizacionDatos").hide();
	$("#idDivDatosGenerales").hide();
	$("#idDivDatosDespacho").hide();
	$("#idDivDatosProfesionales").hide();
	$("#idDivLabelDatosRequeridos").hide();
	$("#idDivVistaPreliminar").hide();
	$("#idDivResumenRegistro").hide();
}

function ocultarBotones() {
	$("#idBtnContinuar").hide();
	$("#idBtnCancelar").hide();
	$("#idBtnFinalizarTramite").hide();
	$("#idBtnSalirTramite").hide();
}

function deshabilitarCamposGenerales() {
	$("#idTxtEmailContador").attr('disabled','disabled');
	$("#idTxtConfirEmailContador").attr('disabled','disabled');
	$("#idTxtTelFijoContador").attr('disabled','disabled');
	$("#idTxtNomInstituto").attr('disabled','disabled');
	$("#idTxtNumCedula").attr('disabled','disabled');
}

function deshabilitarCamposDespacho() {
	$("#idSltTpoDespacho").attr('disabled','disabled');
	$("#idChkTieneTrabajadores").attr('disabled','disabled');
	$("#idChkNoTieneTrabajadores").attr('disabled','disabled');
	$("#idTxtNumTrabajadores").attr('disabled','disabled');
	$("#idSltCargoDesemp").attr('disabled','disabled');
	$("#idTxtTelOficinaDespacho").attr('disabled','disabled');
	$("#idTxtRfcDespacho").attr('disabled','disabled');
	$("#idBtnBuscarDespacho").attr('disabled','disabled');
}

function deshabilitarCamposColegio() {
	$("#idTxtRfcColegio").attr('disabled','disabled');
	$("#idBtnBuscarColegio").attr('disabled','disabled');
}

function habilitarCamposGenerales() {
	$("#idTxtEmailContador").attr('disabled', false);
	$("#idTxtConfirEmailContador").attr('disabled', false);
	$("#idTxtTelFijoContador").attr('disabled', false);
	$("#idTxtNomInstituto").attr('disabled', false);
	$("#idTxtNumCedula").attr('disabled', false);
}

function habilitarCamposDespacho() {
	$("#idSltTpoDespacho").attr('disabled', false);
	$("#idChkTieneTrabajadores").attr('disabled', false);
	$("#idChkNoTieneTrabajadores").attr('disabled', false);
	$("#idTxtNumTrabajadores").attr('disabled', false);
	$("#idSltCargoDesemp").attr('disabled', false);
	$("#idTxtTelOficinaDespacho").attr('disabled', false);
	$("#idTxtRfcDespacho").attr('disabled', false);
	$("#idBtnBuscarDespacho").attr('disabled', false);
}

function habilitarCamposColegio() {
	$("#idTxtRfcColegio").attr('disabled', false);
	$("#idBtnBuscarColegio").attr('disabled', false);
}