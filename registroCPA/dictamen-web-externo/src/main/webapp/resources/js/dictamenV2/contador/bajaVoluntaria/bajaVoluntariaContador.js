var paginaActual = 1;
var totalPaginas = 4;

$(document).ready(function() {
	$.blockUI();
	ocultarDivsPaginas();
	ocultarBotones();
	$("#idDivSubtituloPasoUno").show();
	validarBajaVoluntariaRegistro(confirmarRegistroContador);
	initValidacionesBajaVoluntaria();
	
	$("#idBtnFinalizarTramite").click(function(e) {
	    if (ndtContadorPublicoAutDTO != null) {
	        try {
	            /*solicita iniciar componente de firma electronica*/
	            lanzarComponenteFirma({
	            	descripcionTipoSolicitud : "Baja Voluntaria de Contador",
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

function validarBajaVoluntariaRegistro(callbackSuccess) {
	if (ndtContadorPublicoAutDTO != null) {
		if (ndtContadorPublicoAutDTO.errorFormGeneral == null || ndtContadorPublicoAutDTO.errorFormGeneral == "") {
			if (ndtContadorPublicoAutDTO.numRegistroCpa != null || ndtContadorPublicoAutDTO.numRegistroCpa != "") {
				/*si el estatus de registro imss es "CANCELADO"*/
		        if (ndtContadorPublicoAutDTO.ndcEstadoCpa.cveIdEstadoCpa == 14) {
		            showMessage("Su Registro IMSS se encuentra Cancelado.");
		        } else if (ndtContadorPublicoAutDTO.ndcEstadoCpa.cveIdEstadoCpa == 10) {
		            showMessage("Su solicitud no puede ser procesada, este tr\u00e1mite se encuentra en proceso.");
		        } else {
	                if (jQuery.isFunction(callbackSuccess)) {
	                    callbackSuccess(ndtContadorPublicoAutDTO);
	                }
		        }
			} else {
				showMessage("Usted no cuenta con un Registro IMSS de Contador P\u00fablico Autorizado.");
			}
		} else {
			showError(ndtContadorPublicoAutDTO.errorFormGeneral);
		}
	} else {
		showError({
			mensaje: "No se pudo obtener el registro del Contador P\u00FAblico Autorizado.",
			width: 420
		});
	}
}

function confirmarRegistroContador(ndtContadorPublicoAutDTO) {
    htmlTable = "<table id='tblDatosPersonales' style='width: 100%;' class='table table-striped table-bordered tbl-dictamen-dom'>" +
	    "<tr>" +
	        "<td>Apellido Paterno:</td>" +
	        "<td><input type='text' readonly='readonly' value='"+ndtContadorPublicoAutDTO.usuarioSesion.primerApellido+"'></td>" +
	    "</tr><tr>" +
	        "<td>Apellido Materno:</td>" +
	        "<td><input type='text' readonly='readonly' value='"+ndtContadorPublicoAutDTO.usuarioSesion.segundoApellido+"'></td>" +
	    "</tr><tr>" +
	        "<td>Nombre(s):</td>" +
	        "<td><input type='text' readonly='readonly' value='"+ndtContadorPublicoAutDTO.usuarioSesion.nombre+"'></td>" +
	    "</tr><tr>" +
	        "<td>CURP:</td>" +
	        "<td><input type='text' readonly='readonly' value='"+ndtContadorPublicoAutDTO.usuarioSesion.curp+"'></td>" +
	    "</tr><tr>" +
	        "<td>Registro IMSS:</td>" +
	        "<td><input type='text' readonly='readonly' value='"+ndtContadorPublicoAutDTO.numRegistroCpa+"'></td>" +
	    "</tr>" +
    "</table>";
    showConfirm({
    	titulo : "\u00BFEl Registro IMSS es correcto\u003F",
    	mensaje : htmlTable,
    	height : 415,
    	width : 400,
    	textoBotonAceptar : "SI",
    	textoBotonCancelar : "NO",
		callback: function () {
			cambiarPagina(1);
		},
		callbackForXButton: salirMenuServicios
	});
}

function cambiarPagina(sumaPagina) {
	if (paginaActual == totalPaginas && sumaPagina > 0) {
		return;
	} else if (paginaActual == 1 && sumaPagina < 0) {
		return;
	}
    paginaActual += sumaPagina;
	
	switch (paginaActual) {
		case 1:
			ocultarDivsPaginas();
			ocultarBotones();
			$("#idDivSubtituloPasoUno").show();
			validarBajaVoluntariaRegistro(confirmarRegistroContador);
			break;
		case 2:
			ocultarDivsPaginas();
			ocultarBotones();
			deshabilitarCamposGenerales();
			$("#idDivSubtituloPasoDos").show();
			$("#idDivDatosGenerales").show();
			$("#idTxtConfirEmailContador").hide();
			$("#idLblConfirEmailContador").hide();
			$("#idDivDescripcionDatosGenerales").hide();
			$("#idDivComentariosBajaVoluntaria").show();
			$("#idDivLabelDatosRequeridos").show();
			$("#idBtnContinuar").show();
			$("#idBtnCancelar").show();
			break;
		case 3:
			if (frmDatosBajaVoluntaria.form()) {
				generarReportePreliminar();
				ocultarDivsPaginas();
				ocultarBotones();
				$("#idDivSubtituloPasoTres").show();
				$("#idDivVistaPreliminar").show();
				$("#idBtnCancelar").show();
				$("#idBtnFinalizarTramite").show();
			} else {
				paginaActual -= 1;
			} 
			break;
		case 4:
			ocultarDivsPaginas();
			ocultarBotones();
			$("#idDivSubtituloPasoCuatro").show();
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
	$.postJSON(context_path + "/dictamenV2/contador/bajaVoluntaria/generaParametrosPreliminaresBajaVoluntaria.do", ndtContadorPublicoAutDTO, function(data) {
		ndtContadorPublicoAutDTO = data;
		if (ndtContadorPublicoAutDTO != null) {
			if (ndtContadorPublicoAutDTO.errorFormGeneral == null || ndtContadorPublicoAutDTO.errorFormGeneral == "") {
				if (document.getElementById("idIframeVisualizador") == null) {
					$("<iframe id='idIframeVisualizador' " +
							"src='"+context_path+"/dictamenV2/contador/bajaVoluntaria/visualizarPDF.do' " +
							"width='1000' height='800' frameborder='0' scrolling='auto'></iframe>").appendTo($("#idDivContenedorVizualizador"));
				} else {
					document.getElementById("idIframeVisualizador").src = context_path+"/dictamenV2/contador/bajaVoluntaria/visualizarPDF.do";
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
	$.postJSON(context_path+"/dictamenV2/contador/bajaVoluntaria/guardarBajaVoluntariaContador.do", ndtContadorPublicoAutDTO, function(data) {
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
				mensaje: "No se pudo realiza la solicitud de baja del Contador P\u00fablico Autorizado, Int\u00e9ntelo m\u00e1s tarde.",
				width: 420
			});
		}
	}).error(function(data) {
    	$.unblockUI();
	}).complete(function(data) {
		$.unblockUI();
	});
}

function llenarNdtContadorPublicoAutDTO() {
	llenarDatosBajaVoluntaria();
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
	$("#idDivSubtituloPasoCuatro").hide();
	$("#idDivDatosGenerales").hide();
	$("#idDivComentariosBajaVoluntaria").hide();
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

function salirMenuServicios() {
	$('form#idFrmBajaVoluntariaContador').attr('action', context_path);
    $('form#idFrmBajaVoluntariaContador').submit();
}