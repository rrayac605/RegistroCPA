var paginaActual = 1;
var totalPaginas = 7;

$(document).ready(function() {
	ocultarDivsPaginas();
	ocultarBotones();
	$("#idDivDatosGenerales").show();
	$("#idBtnContinuar").show();
	$("#idBtnCancelar").show();
	$("#idLinkAvisoPrivacidad").show();
	$("#idDivLabelDatosRequeridos").show();
	initValidacionesDatosGenerales();
	initValidacionesDatosDespacho();
	initValidacionesDatosProfesionales();
	
	$("#idBtnFinalizarTramite").click(function(e) {
	    if (ndtContadorPublicoAutDTO != null) {
	        try {
	            /*solicita iniciar componente de firma electronica*/
	            lanzarComponenteFirma({
	            	descripcionTipoSolicitud : "Registro del Contador",
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
			alert();
			ocultarDivsPaginas();
			ocultarBotones();
			$("#idDivDatosGenerales").show();
			$("#idBtnContinuar").show();
			$("#idBtnCancelar").show();
			$("#idLinkAvisoPrivacidad").show();
			$("#idDivLabelDatosRequeridos").show();
			$("#idLinkPaginaUno").removeClass("disabled").addClass("active");
			$("#idLinkPaginaDos").removeClass("active").addClass("disabled");
			$("#idLinkPaginaTres").removeClass("active").addClass("disabled");
			$("#idLinkPaginaCuatro").removeClass("active").addClass("disabled");
			$("#idLinkPaginaCinco").removeClass("active").addClass("disabled");
			$("#idLinkPaginaSeis").removeClass("active").addClass("disabled");
			$("#idLinkPaginaSiete").removeClass("active").addClass("disabled");
			break;
		case 2:
			if (frmDatosGenerales.form()) {
				ocultarDivsPaginas();
				ocultarBotones();
				$("#idDivDatosDespacho").show();
				$("#idBtnAnterior").show();
				$("#idBtnContinuar").show();
				$("#idBtnCancelar").show();
				$("#idDivLabelDatosRequeridos").show();
				$("#idLinkPaginaUno").removeClass("active").addClass("disabled");
				$("#idLinkPaginaDos").removeClass("disabled").addClass("active");
				$("#idLinkPaginaTres").removeClass("active").addClass("disabled");
				$("#idLinkPaginaCuatro").removeClass("active").addClass("disabled");
				$("#idLinkPaginaCinco").removeClass("active").addClass("disabled");
				$("#idLinkPaginaSeis").removeClass("active").addClass("disabled");
				$("#idLinkPaginaSiete").removeClass("active").addClass("disabled");
			} else {
				paginaActual -= 1;
			}
			break;
		case 3:
			if (frmDatosDespacho.form()) {
				ocultarDivsPaginas();
				ocultarBotones();
				$("#idDivDatosProfesionales").show();
				$("#idBtnAnterior").show();
				$("#idBtnContinuar").show();
				$("#idBtnCancelar").show();
				$("#idDivLabelDatosRequeridos").show();
				$("#idLinkPaginaUno").removeClass("active").addClass("disabled");
				$("#idLinkPaginaDos").removeClass("active").addClass("disabled");
				$("#idLinkPaginaTres").removeClass("disabled").addClass("active");
				$("#idLinkPaginaCuatro").removeClass("active").addClass("disabled");
				$("#idLinkPaginaCinco").removeClass("active").addClass("disabled");
				$("#idLinkPaginaSeis").removeClass("active").addClass("disabled");
				$("#idLinkPaginaSiete").removeClass("active").addClass("disabled");
			} else {
				paginaActual -= 1;
			}
			break;
		case 4:
			if (frmDatosProfesionales.form()) {
				ocultarDivsPaginas();
				ocultarBotones();
				$("#idDivDatosDocumentos").show();
				$("#idBtnAnterior").show();
				$("#idBtnContinuar").show();
				$("#idBtnCancelar").show();
				$("#idLinkPaginaUno").removeClass("active").addClass("disabled");
				$("#idLinkPaginaDos").removeClass("active").addClass("disabled");
				$("#idLinkPaginaTres").removeClass("active").addClass("disabled");
				$("#idLinkPaginaCuatro").removeClass("disabled").addClass("active");
				$("#idLinkPaginaCinco").removeClass("active").addClass("disabled");
				$("#idLinkPaginaSeis").removeClass("active").addClass("disabled");
				$("#idLinkPaginaSiete").removeClass("active").addClass("disabled");
			} else {
				paginaActual -= 1;
			}
			break;
		case 5:
			generarReportePreliminar();
			ocultarDivsPaginas();
			ocultarBotones();
			$("#idDivVistaPreliminar").show();
			$("#idBtnAnterior").show();
			$("#idBtnContinuar").show();
			$("#idBtnCancelar").show();
			$("#idLinkPaginaUno").removeClass("active").addClass("disabled");
			$("#idLinkPaginaDos").removeClass("active").addClass("disabled");
			$("#idLinkPaginaTres").removeClass("active").addClass("disabled");
			$("#idLinkPaginaCuatro").removeClass("active").addClass("disabled");
			$("#idLinkPaginaCinco").removeClass("disabled").addClass("active");
			$("#idLinkPaginaSeis").removeClass("active").addClass("disabled");
			$("#idLinkPaginaSiete").removeClass("active").addClass("disabled");
			break;
		case 6:
			ocultarDivsPaginas();
			ocultarBotones();
			$("#idDivTerminosCondiciones").show();
			$("#idBtnFinalizarTramite").show();
			$("#idBtnCancelarTerminos").show();
			$("#idLinkPaginaUno").removeClass("active").addClass("disabled");
			$("#idLinkPaginaDos").removeClass("active").addClass("disabled");
			$("#idLinkPaginaTres").removeClass("active").addClass("disabled");
			$("#idLinkPaginaCuatro").removeClass("active").addClass("disabled");
			$("#idLinkPaginaCinco").removeClass("active").addClass("disabled");
			$("#idLinkPaginaSeis").removeClass("disabled").addClass("active");
			$("#idLinkPaginaSiete").removeClass("active").addClass("disabled");
			break;
		case 7:
			ocultarDivsPaginas();
			ocultarBotones();
			$("#idDivResumenRegistro").show();
			$("#idBtnSalirTramite").show();
			$("#idLinkPaginaUno").removeClass("active").addClass("disabled");
			$("#idLinkPaginaDos").removeClass("active").addClass("disabled");
			$("#idLinkPaginaTres").removeClass("active").addClass("disabled");
			$("#idLinkPaginaCuatro").removeClass("active").addClass("disabled");
			$("#idLinkPaginaCinco").removeClass("active").addClass("disabled");
			$("#idLinkPaginaSeis").removeClass("disabled").addClass("active");
			$("#idLinkPaginaSiete").removeClass("active").addClass("disabled");
			break;
	}
}

function ocultarDivsPaginas() {
	$("#idDivDatosGenerales").hide();
	$("#idDivDatosDespacho").hide();
	$("#idDivDatosProfesionales").hide();
	$("#idDivDatosDocumentos").hide();
	$("#idDivVistaPreliminar").hide();
	$("#idDivTerminosCondiciones").hide();
	$("#idDivResumenRegistro").hide();
	$("#idDivLabelDatosRequeridos").hide();
}

function ocultarBotones() {
	$("#idBtnAnterior").hide();
	$("#idBtnContinuar").hide();
	$("#idBtnCancelar").hide();
	$("#idBtnFinalizarTramite").hide();
	$("#idBtnCancelarTerminos").hide();
	$("#idBtnSalirTramite").hide();
	$("#idLinkAvisoPrivacidad").hide();
}

function confirmarDatosRegistro() {
    var htmlTable = "<div class='col-md-offset-2 row'>" +
    		"<h3>Los datos a enviar son los siguientes:</h3>" +
    	"</div>" +
    	"<br/>" +
    	"<form:form id='idFrmConfirmarDatosRegistro' class='form-horizontal' role='form'>" +
    		"<div class='form-group'>" +
    			"<label style='text-align:left;' class='col-md-offset-2 col-md-2 control-label'>" +
    				"Nombre:" +
    			"</label>" +
    			"<div class='col-sm-5'>" +
    				"<input type='text' id='idTxtNomContador' class='form-control' disabled='disabled' value='"+ndtContadorPublicoAutDTO.usuarioSesion.nombreCompleto+"'>" +
    			"</div>" +
    		"</div>" +
    		"<div class='form-group'>" +
				"<label style='text-align:left;' class='col-md-offset-2 col-md-2 control-label'>" +
					"RFC:" +
				"</label>" +
				"<div class='col-sm-5'>" +
					"<input type='text' id='idTxtRfcContador' class='form-control' disabled='disabled' value='"+ndtContadorPublicoAutDTO.personaFiscal.rfc+"'>" +
				"</div>" +
			"</div>" +
    		"<div class='form-group'>" +
				"<label style='text-align:left;' class='col-md-offset-2 col-md-2 control-label'>" +
					"Escuela:" +
				"</label>" +
				"<div class='col-sm-5'>" +
					"<input type='text' id='idTxtInstitutoContador' class='form-control' disabled='disabled' value='"+$("#idTxtNomInstituto").val()+"'>" +
				"</div>" +
			"</div>" +
			"<div class='form-group'>" +
				"<label style='text-align:left;' class='col-md-offset-2 col-md-2 control-label'>" +
					"C\u00e9dula profesional:" +
				"</label>" +
				"<div class='col-sm-5'>" +
					"<input type='text' id='idTxtCedulaContador' class='form-control' disabled='disabled' value='"+$("#idTxtNumCedula").val()+"'>" +
				"</div>" +
			"</div>" +
			"<br/>" +
			"<div class='form-group'>" +
				"<label style='text-align:left;' class='col-md-offset-2 col-md-2 control-label'>" +
					"Despacho:" +
				"</label>" +
				"<div class='col-sm-5'>" +
					"<input type='text' id='idTxtDespachoContador' class='form-control' disabled='disabled' value='"+$("#idTxtRazonSocialDespacho").val()+"'>" +
				"</div>" +
			"</div>" +
			"<div class='form-group'>" +
				"<label style='text-align:left;' class='col-md-offset-2 col-md-2 control-label'>" +
					"RFC:" +
				"</label>" +
				"<div class='col-sm-5'>" +
					"<input type='text' id='idTxtRfcDespachoContador' class='form-control' disabled='disabled' value='"+$("#idTxtRfcDespacho").val()+"'>" +
				"</div>" +
			"</div>" +
			"<br/>" +
			"<div class='form-group'>" +
				"<label style='text-align:left;' class='col-md-offset-2 col-md-2 control-label'>" +
					"Colegio o Asociaci\u00F3n:" +
				"</label>" +
				"<div class='col-sm-5'>" +
					"<input type='text' id='idTxtColegioContador' class='form-control' disabled='disabled' value='"+$("#idTxtNomColegio").val()+"'>" +
				"</div>" +
			"</div>" +
			"<div class='form-group'>" +
				"<label style='text-align:left;' class='col-md-offset-2 col-md-2 control-label'>" +
					"RFC:" +
				"</label>" +
				"<div class='col-sm-5'>" +
					"<input type='text' id='idTxtRfcColegioContador' class='form-control' disabled='disabled' value='"+$("#idTxtRfcColegio").val()+"'>" +
				"</div>" +
			"</div>" +
			"<br/>" +
    	"</form:form>";
    var opcionesDialogo = {
        mensaje : htmlTable,
        callback : function() {
//        	$("#idDivDatosGenerales").hide();
//			$("#idDivDatosDespacho").hide();
//			$("#idDivDatosProfesionales").hide();
//			$("#idDivDatosDocumentos").show();
//			$("#idDivResumenRegistro").hide();
//			$("#idBtnAnterior").show();
//			$("#idBtnContinuar").hide();
//			$("#idBtnFinalizarTramite").show();
//			$("#idBtnCancelar").show();
//			$("#idBtnSalirTramite").hide();
//			$("#idLinkAvisoPrivacidad").hide();
//			$("#idLinkPaginaUno").removeClass("active").addClass("disabled");
//			$("#idLinkPaginaDos").removeClass("active").addClass("disabled");
//			$("#idLinkPaginaTres").removeClass("disabled").addClass("active");
//			$("#idLinkPaginaCuatro").removeClass("active").addClass("disabled");
        },
        callbackForXButton : function() {
        	paginaActual = 2;
        },
        height : 750,
        width : 960,
        textoBotonCancelar : "Cancelar"
    };
    showConfirm(opcionesDialogo);
    $("#dialog-confirm-common").css("overflow-x",'hidden')
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
	ndtContadorPublicoAutDTO.usuarioSesion = null;
	ndtContadorPublicoAutDTO.personaFiscal = null;
	$.postJSON(context_path+"/dictamenV2/contador/registro/registroContador.do", ndtContadorPublicoAutDTO, function(data) {
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
				mensaje: "No se pudo registrar al Contador Publico Autorizado.",
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

function generarReportePreliminar() {
	$.blockUI();
	llenarNdtContadorPublicoAutDTO();
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