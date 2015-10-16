var frmDatosDespacho;

$(document).ready(function() {
	
	initPatalla();
	
	$("#idChkTieneTrabajadores").attr('disabled','disabled');
	$("#idChkNoTieneTrabajadores").attr('disabled','disabled');
	$("#idTxtNumTrabajadores").prop('disabled', true);
	
	$("#idSltTpoDespacho").change(function() {
		if ($("#idSltTpoDespacho").val() == 2) {
			$( "#idChkTieneTrabajadores" ).removeAttr("disabled");
			$( "#idChkNoTieneTrabajadores" ).removeAttr("disabled");
			$("#idHdnValidaCheckbox").rules("add", "checkRequerido");
		} else {
			$("#idChkTieneTrabajadores").prop("checked", "");
			$("#idChkNoTieneTrabajadores").prop("checked", "");
			$("#idChkTieneTrabajadores").attr('disabled','disabled');
			$("#idChkNoTieneTrabajadores").attr('disabled','disabled');
			$("#idHdnValidaCheckbox").rules("remove", "checkRequerido");
			$("#idTxtNumTrabajadores").val("");
			$("#idTxtNumTrabajadores").prop('disabled', true);
		}
	});

	$("#idChkTieneTrabajadores").change(function() {
		if ($("#idChkTieneTrabajadores").is(':checked')) {
			$("#idChkNoTieneTrabajadores").prop("checked", "");
			$("#idTxtNumTrabajadores").prop('disabled', false);
			$("#idTxtNumTrabajadores").rules("add", {
		        required: true,
		        messages: {
		            required: "Este campo es obligatorio"
		        }
		    });
		} else {
			$("#idTxtNumTrabajadores").prop('disabled', true);
			$("#idTxtNumTrabajadores").rules("remove", "checkRequerido");
		}
	});
	
	$("#idChkNoTieneTrabajadores").change(function() {
		if ($("#idChkNoTieneTrabajadores").is(':checked')) {
			$("#idChkTieneTrabajadores").prop("checked", "");
			$("#idTxtNumTrabajadores").val("");
			$("#idTxtNumTrabajadores").prop('disabled', true);
		}
	});
	
	$("#idBtnBuscarDespacho").click(function(e) {
		obtenerDespacho();
	});
	
	jQuery("#idTxtTelOficinaDespacho").keypress(function(tecla) {
	    if((tecla.charCode < 00 || tecla.charCode > 31) &&				//Caracteres ASCII de: control
	    		(tecla.charCode < 48 || tecla.charCode > 57) &&			//Caracteres ASCII de: numeros
	    		(tecla.charCode != 46) && (tecla.charCode != 127)) {	//Caracteres ASCII de: ., DEL
	    	return false;
	    }
	});
	
});

function initPatalla() {
	$("#idSltTpoDespacho").val($("#idHdnTpoDespacho").val());
	$("#idSltCargoDesemp").val($("#idHdnCargoContador").val());
	
	if (ndtContadorPublicoAutDTO.listNdtR2Despachos[0].numTrabajadoresContratados != null && ndtContadorPublicoAutDTO.listNdtR2Despachos[0].numTrabajadoresContratados != "") {
		$("#idChkTieneTrabajadores").prop("checked", "checked");
		$("#idChkNoTieneTrabajadores").prop("checked", "");
	} else {
		if ($("#idHdnCveIdDespacho").val() != "") {
			$("#idChkTieneTrabajadores").prop("checked", "");
			$("#idChkNoTieneTrabajadores").prop("checked", "checked");
		}
	}
}

function initValidacionesDatosDespacho() {
	cargarValidacionComboRequerido();
	cargarValidacionCheckRequerido();
	frmDatosDespacho = $("#idFrmDatosDespacho").validate({
		ignore: "",//esta propiedad se sobre escribe para que puedaas usar campos hidden
		rules: {
			sltTpoDespacho: {
				comboRequerido : true
			},
			sltCargoDesemp: {
				comboRequerido : true
			},
			txtTelOficinaDespacho: {
				required : true,
				minlength : 12
			},
			txtRfcDespacho: {
				required : true,
				minlength : 12
			},
			txtRazonSocialDespacho: {
				required : true
			}
		},
		messages: {
			txtTelOficinaDespacho: {
				required : "Este campo es obligatorio, no debe quedar vac\u00EDo",
				minlength: "El formato del tel\u00e9fono no es valido"
			},
			txtRfcDespacho: {
				required : "Este campo es obligatorio, no debe quedar vac\u00EDo",
				minlength: "El formato del RFC no es valido"
			},
			txtRazonSocialDespacho: {
				required : "Este campo es obligatorio, no debe quedar vac\u00EDo"
			}
		},
		errorElement: "div"
	});
}

function cargarValidacionComboRequerido() {
    $.validator.addMethod("comboRequerido", function(value, elem, param) {
        if (value != "default" && value != "" && value != null) {
            return true;
        } else {
            return false;
        }
        return false;
    },"Este campo es obligatorio, seleccione una opci\u00F3n");
}

function cargarValidacionCheckRequerido() {
	$.validator.addMethod("checkRequerido", function(value, elem, param) {
		if ($("#idChkTieneTrabajadores").is(':checked') || $("#idChkNoTieneTrabajadores").is(':checked')) {
			return true;
		} else {
			return false;
		}
	},"Selecciona una de las opciones");
}

function obtenerDespacho() {
	$.blockUI();
	personaMoral.rfc = $("#idTxtRfcDespacho").val();
	$.postJSON(context_path+"/dictamenV2/contador/registro/obtenerPersonaMoral.do", personaMoral, function(data) {
		$("#idHdnCveMoralDespacho").val("");
		$("#idTxtRfcDespacho").val("");
		$("#idTxtRazonSocialDespacho").val("");
		$("#idHdnCveIdPmdomFiscalDespacho").val("");
		$("#idHdnCveIdDomicilioDespacho").val("");
		var personaMoralRespuesta = data;
		if (personaMoralRespuesta != null) {
			if (personaMoralRespuesta.errorFormGeneral == null || personaMoralRespuesta.errorFormGeneral == "") {
				$("#idHdnCveMoralDespacho").val(personaMoralRespuesta.cveMoral);
				$("#idTxtRfcDespacho").val(personaMoralRespuesta.rfc);
				$("#idTxtRazonSocialDespacho").val(personaMoralRespuesta.razonSocial);
				if (personaMoralRespuesta.domicilioFiscal != null) {
					$("#idHdnCveIdDomicilioDespacho").val(personaMoralRespuesta.domicilioFiscal.clave);
				}
				if (personaMoralRespuesta.mediosContactoFiscales != null && personaMoralRespuesta.mediosContactoFiscales.length > 0) {
					for (var int = 0; int < personaMoralRespuesta.mediosContactoFiscales.length; int++) {
						if (personaMoralRespuesta.mediosContactoFiscales[int].tipoMedioContacto.idTipoMedioContacto == 2) {
							$("#idTxtTelOficinaDespacho").val(personaMoralRespuesta.mediosContactoFiscales[int].tipoMedioContacto.idTipoMedioContacto);
						}
					}
				}
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

function llenarDatosDespacho() {
	if ($("#idHdnCveIdR2Despacho").val() != null && $("#idHdnCveIdR2Despacho").val() != "") {
		ndtContadorPublicoAutDTO.listNdtR2Despachos[0].cveIdR2Despacho = $("#idHdnCveIdR2Despacho").val();
	}
	
	ndtContadorPublicoAutDTO.listNdtR2Despachos[0].indTipoCpa = $("#idSltTpoDespacho").val();
	if ($("#idChkTieneTrabajadores").is(':checked')) {
		ndtContadorPublicoAutDTO.listNdtR2Despachos[0].indCuentaconTrab = "Si";
	} else if ($("#idChkNoTieneTrabajadores").is(':checked')) {
		ndtContadorPublicoAutDTO.listNdtR2Despachos[0].indCuentaconTrab = "No";
	}
	ndtContadorPublicoAutDTO.listNdtR2Despachos[0].numTrabajadoresContratados = $("#idTxtNumTrabajadores").val();
	ndtContadorPublicoAutDTO.listNdtR2Despachos[0].cargoQueDesempena = $("#idSltCargoDesemp").val();
	ndtContadorPublicoAutDTO.listNdtR2Despachos[0].telefonoFijo = $("#idTxtTelOficinaDespacho").val();
	ndtContadorPublicoAutDTO.listNdtR2Despachos[0].cveIdPmdomFiscal = $("#idHdnCveIdPmdomFiscalDespacho").val();
	ndtContadorPublicoAutDTO.listNdtR2Despachos[0].cveIdDomicilio = $("#idHdnCveIdDomicilioDespacho").val();
	ndtContadorPublicoAutDTO.ndtDespachosDTO.cveIdPersonaMoral = $("#idHdnCveMoralDespacho").val();
	ndtContadorPublicoAutDTO.ndtDespachosDTO.razonSocial = $("#idTxtRazonSocialDespacho").val();
	ndtContadorPublicoAutDTO.ndtDespachosDTO.cveIdDespacho = $("#idHdnCveIdDespacho").val();
	
}