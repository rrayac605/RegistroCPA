$(document).ready(function() {
	deshabilitarMenu();
	initEventosClickMenu();
	validarRegistroContador();
});

/**
 * Define el flujo que podria realizar el Contador autentificado
 * @returns {Boolean}
 */
function validarRegistroContador() {
	var registroContador = obtenerRegistroContador();
	
	if (registroContador != null && registroContador.errorFormGeneral != null && registroContador.errorFormGeneral != "") {
		deshabilitarEventoClickMenu();
		showError(registroContador.errorFormGeneral);
	} else if (registroContador != null) {
		if (registroContador.numRegistroCpa != null) {
    		if (registroContador.ndcEstadoCpa.cveIdEstadoCpa == 14) {
    			deshabilitarEventoClickMenu();
        		showMessage("Su Registro IMSS se encuentra Cancelado.");
    		} else {
    			habilitarMenu();
    			
    			// Se quitan temporalmente ya que no existen los servicios todavia
    			$("#idImgReactivacionContador").unbind("click");
    			$("#idHrefReactivacionContador").unbind("click");
    			$("#idImgAcreditacionMembresia").unbind("click");
    			$("#idHrefAcreditacionMembresia").unbind("click");
    			
    			
    			$("#idImgRegistroContador").unbind("click");
    			$("#idHrefRegistroContador").unbind("click");
    			$( "#idImgRegistroContador" ).css( "opacity", 0.2);
    			$( "#idHrefRegistroContador" ).css( "opacity", 0.2);
    		}
		} else if (registroContador.ndcEstadoCpa.cveIdEstadoCpa == 1) {
			deshabilitarEventoClickMenu();
			showMessage("Su solicitud de registro no ha sido aprobada.");
		} else if (registroContador.numRegistroCpa == null && registroContador.ndcEstadoCpa.cveIdEstadoCpa == 14) {
			deshabilitarEventoClickMenu();
    		showMessage("Su Registro IMSS se encuentra Cancelado.");
		} else if (registroContador.ndcEstadoCpa.cveIdEstadoCpa == 2) {
			$( "#idImgRegistroContador" ).css( "opacity", 100);
			$( "#idHrefRegistroContador" ).css( "opacity", 100);
		}
	} else {
		$("#idImgReactivacionContador").unbind("click");
		$("#idHrefReactivacionContador").unbind("click");
		$("#idImgActualizacionContador").unbind("click");
		$("#idHrefActualizacionContador").unbind("click");
		$("#idImgBajaContador").unbind("click");
		$("#idHrefBajaContador").unbind("click");
		$("#idImgAcreditacionMembresia").unbind("click");
		$("#idHrefAcreditacionMembresia").unbind("click");
		$( "#idImgRegistroContador" ).css( "opacity", 100);
		$( "#idHrefRegistroContador" ).css( "opacity", 100);
    	return true;
    }
	return false;
}

/**
 * Obtiene el registro de un contador publico autorizado
 * @returns NdtContadorPublicoAutDTO
 */
function obtenerRegistroContador() {
    var registroContador;
    $.blockUI();
    $.postJSON_Sync(context_path+"/dictamenV2/contador/registro/validaRegistroContador.do", null, function(data) {
    	registroContador = data;
    }).error(function(data) {
    	$.unblockUI();
	}).complete(function(data) {
		$.unblockUI();
	});
    return registroContador;
}

/**
 * Inicializa los eventos de las imagenes y los link del menu de servicios
 */
function initEventosClickMenu() {
	var urlSubmitRegistro = context_path + "/dictamenV2/contador/registro/init.do";
	var urlSubmitReactivacion = context_path + "/dictamenV2/contador/registro/init.do";
	var urlSubmitActualizacion = context_path + "/dictamenV2/contador/actualizacion/init.do";
	var urlSubmitBaja = context_path + "/dictamenV2/contador/bajaVoluntaria/init.do";
	var urlAcreditacionMembresia = context_path + "/dictamenV2/contador/registro/init.do";
	
	$('#idImgRegistroContador').click(function() {
		$('form#idFrmMenuServicios').attr('action', urlSubmitRegistro);
        $('form#idFrmMenuServicios').submit();
	});
	
	$('#idHrefRegistroContador').click(function() {
		$('form#idFrmMenuServicios').attr('action', urlSubmitRegistro);
        $('form#idFrmMenuServicios').submit();
	});
	
	$('#idImgReactivacionContador').click(function() {
		$('form#idFrmMenuServicios').attr('action', urlSubmitReactivacion);
        $('form#idFrmMenuServicios').submit();
	});
	
	$('#idHrefReactivacionContador').click(function() {
		$('form#idFrmMenuServicios').attr('action', urlSubmitReactivacion);
        $('form#idFrmMenuServicios').submit();
	});
	
	$('#idImgActualizacionContador').click(function() {
		$('form#idFrmMenuServicios').attr('action', urlSubmitActualizacion);
        $('form#idFrmMenuServicios').submit();
	});
	
	$('#idHrefActualizacionContador').click(function() {
		$('form#idFrmMenuServicios').attr('action', urlSubmitActualizacion);
        $('form#idFrmMenuServicios').submit();
	});
	
	$('#idImgBajaContador').click(function() {
		$('form#idFrmMenuServicios').attr('action', urlSubmitBaja);
        $('form#idFrmMenuServicios').submit();
	});
	
	$('#idHrefBajaContador').click(function() {
		$('form#idFrmMenuServicios').attr('action', urlSubmitBaja);
        $('form#idFrmMenuServicios').submit();
	});
	
	$('#idImgAcreditacionMembresia').click(function() {
		$('form#idFrmMenuServicios').attr('action', urlAcreditacionMembresia);
        $('form#idFrmMenuServicios').submit();
	});
	
	$('#idHrefAcreditacionMembresia').click(function() {
		$('form#idFrmMenuServicios').attr('action', urlAcreditacionMembresia);
        $('form#idFrmMenuServicios').submit();
	});
}

/**
 * habilita todas las imagenes del menu de servicios
 */
function habilitarMenu() {
	$( "#idImgRegistroContador" ).css( "opacity", 100);
	$( "#idImgReactivacionContador" ).css( "opacity", 100);
	$( "#idImgActualizacionContador" ).css( "opacity", 100);
	$( "#idHrefRegistroContador" ).css( "opacity", 100);
	$( "#idHrefReactivacionContador" ).css( "opacity", 100);
	$( "#idHrefActualizacionContador" ).css( "opacity", 100);
	$( "#idImgBajaContador" ).css( "opacity", 100);
	$( "#idImgAcreditacionMembresia" ).css( "opacity", 100);
	$( "#idHrefBajaContador" ).css( "opacity", 100);
	$( "#idHrefAcreditacionMembresia" ).css( "opacity", 100);
}

/**
 * deshabilita todas las imagenes del menu de servicios
 */
function deshabilitarMenu() {
	$( "#idImgRegistroContador" ).css( "opacity", 0.2);
	$( "#idImgReactivacionContador" ).css( "opacity", 0.2);
	$( "#idImgActualizacionContador" ).css( "opacity", 0.2);
	$( "#idHrefRegistroContador" ).css( "opacity", 0.2);
	$( "#idHrefReactivacionContador" ).css( "opacity", 0.2);
	$( "#idHrefActualizacionContador" ).css( "opacity", 0.2);
	$( "#idImgBajaContador" ).css( "opacity", 0.2);
	$( "#idImgAcreditacionMembresia" ).css( "opacity", 0.2);
	$( "#idHrefBajaContador" ).css( "opacity", 0.2);
	$( "#idHrefAcreditacionMembresia" ).css( "opacity", 0.2);
}

/**
 * Se quitan los eventos de onClick de las imagenes y los link del menu de servicios
 */
function deshabilitarEventoClickMenu() {
	$("#idImgRegistroContador").unbind("click");
	$("#idHrefRegistroContador").unbind("click");
	$("#idImgReactivacionContador").unbind("click");
	$("#idHrefReactivacionContador").unbind("click");
	$("#idImgActualizacionContador").unbind("click");
	$("#idHrefActualizacionContador").unbind("click");
	$("#idImgBajaContador").unbind("click");
	$("#idHrefBajaContador").unbind("click");
	$("#idImgAcreditacionMembresia").unbind("click");
	$("#idHrefAcreditacionMembresia").unbind("click");
}