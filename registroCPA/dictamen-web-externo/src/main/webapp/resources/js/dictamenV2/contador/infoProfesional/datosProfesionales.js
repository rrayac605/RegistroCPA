var frmDatosProfesionales;

$(document).ready(function() {
	$("#idBtnBuscarColegio").click(function(e) {
		obtenerColegio();
	});
});

function initValidacionesDatosProfesionales() {
	frmDatosProfesionales = $("#idFrmDatosProfesionales").validate({
		ignore: "",//esta propiedad se sobre escribe para que puedaas usar campos hidden
		rules: {
			txtRfcColegio: {
				required : true
			},
			txtNomColegio: {
				required : true
			}
		},
		messages: {
			txtRfcColegio: {
				required : "Este campo es obligatorio, no debe quedar vac\u00EDo"
			},
			txtNomColegio: {
				required : "Este campo es obligatorio, no debe quedar vac\u00EDo"
			}
		},
		errorElement: "div"
	});
}

function obtenerColegio() {
	$.blockUI();
	personaMoral.rfc = $("#idTxtRfcColegio").val();
	
	$.postJSON(context_path+"/dictamenV2/contador/registro/obtenerPersonaMoral.do", personaMoral, function(data) {
		$("#idHdnCveMoralColegio").val("");
		$("#idTxtRfcColegio").val("");
		$("#idTxtNomColegio").val("");
		var personaMoralRespuesta = data;
		if (personaMoralRespuesta != null) {
			if (personaMoralRespuesta.errorFormGeneral == null || personaMoralRespuesta.errorFormGeneral == "") {
				$("#idHdnCveMoralColegio").val(personaMoralRespuesta.cveMoral);
				$("#idTxtRfcColegio").val(personaMoralRespuesta.rfc);
				$("#idTxtNomColegio").val(personaMoralRespuesta.razonSocial);
			} else {
				showError(personaMoralRespuesta.errorFormGeneral);
			}
		} else {
			showError({
				mensaje: "No se encontraron coincidencias con el RFC proporcionado. Favor de verificarlo con el Despacho al que pertenece e intente nuevamente.",
				width: 420
			});
		}
	}).error(function(data) {
    	$.unblockUI();
	}).complete(function(data) {
		$.unblockUI();
	});
}

function llenarDatosProfesionales() {
	if ($("#idHdnCveIdR3ColegioXcontador").val() != null && $("#idHdnCveIdR3ColegioXcontador").val() != "") {
		ndtContadorPublicoAutDTO.listNdtR3Colegios[0].cveIdR3ColegioXcontador = $("#idHdnCveIdR3ColegioXcontador").val();
	}
	ndtContadorPublicoAutDTO.ndtColegioDTO.cveIdPersonaMoral = $("#idHdnCveMoralColegio").val();
	ndtContadorPublicoAutDTO.ndtColegioDTO.razonSocial = $("#idTxtNomColegio").val();
	ndtContadorPublicoAutDTO.ndtDespachosDTO.cveIdDespacho = $("#idHdnCveIdColegio").val();
	
}