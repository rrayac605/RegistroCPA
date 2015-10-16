var frmDatosGenerales;

$(document).ready(function() {
	
	jQuery("#idTxtTelFijoContador").keypress(function(tecla) {
	    if((tecla.charCode < 00 || tecla.charCode > 31) &&				//Caracteres ASCII de: control
	    		(tecla.charCode < 48 || tecla.charCode > 57) &&			//Caracteres ASCII de: numeros
	    		(tecla.charCode != 46) && (tecla.charCode != 127)) {	//Caracteres ASCII de: ., DEL
	    	return false;
	    }
	});

});

function initValidacionesDatosGenerales() {
	cargarValidacionConfirEmail();
	frmDatosGenerales = $("#idFrmDatosGenerales").validate({
		ignore: "",//esta propiedad se sobre escribe para que puedaas usar campos hidden
		rules: {
			txtEmailContador: {
				required : true,
				email: true
			},
			txtConfirEmailContador: {
				required : true,
				confirmacionEmail : true
			},
			txtTelFijoContador: {
				required : true,
				minlength : 12
			},
			txtNomInstituto: {
				required : true
			},
			txtNumCedula: {
				required : true,
				minlength : 13
			}
		},
		messages: {
			txtEmailContador: {
				required: "Este campo es obligatorio, no debe quedar vac\u00EDo",
				email: "Favor de ingresar una direcci\u00F3n electr\u00F3nica valida"
			},
			txtConfirEmailContador: {
				required : "Este campo es obligatorio, no debe quedar vac\u00EDo"
			},
			txtTelFijoContador: {
				required : "Este campo es obligatorio, no debe quedar vac\u00EDo",
				minlength: "El formato del tel\u00e9fono no es valido"
			},
			txtNomInstituto: {
				required : "Este campo es obligatorio, no debe quedar vac\u00EDo"
			},
			txtNumCedula: {
				required : "Este campo es obligatorio, no debe quedar vac\u00EDo",
				minlength: "El formato de la c\u00e9dula profesional no es valido"
			}
		},
		errorElement: "div"
	});
}

function cargarValidacionConfirEmail() {
	$.validator.addMethod("confirmacionEmail", function(value, elem, param) {
		if (value == $("#idTxtEmailContador").val()) {
			return true;
		} else {
			return false;
		}
	},"La confirmaci\u00F3n de la direcci\u00F3n electr\u00F3nica no es valida");
}

function llenarDatosGenerales() {
	if ($("#idHdnCveIdR1DatosPersonales").val() != null && $("#idHdnCveIdR1DatosPersonales").val() != "") {
		ndtContadorPublicoAutDTO.listNdtR1DatosPersonales[0].cveIdR1DatosPersonales = $("#idHdnCveIdR1DatosPersonales").val();
	}
	if ($("#idHdnCveIdPersonafContacto1").val() != null && $("#idHdnCveIdPersonafContacto1").val() != "") {
		ndtContadorPublicoAutDTO.listNdtR1DatosPersonales[0].listNdtR1Formacontactos[0].cveIdPersonafContacto
	}
	if ($("#idHdnCveIdPersonafContacto2").val() != null && $("#idHdnCveIdPersonafContacto2").val() != "") {
		ndtContadorPublicoAutDTO.listNdtR1DatosPersonales[0].listNdtR1Formacontactos[1].cveIdPersonafContacto
	}
	ndtContadorPublicoAutDTO.listNdtR1DatosPersonales[0].cveIdDomicilio = $("#idHdnCveIdDomicilio").val();
	ndtContadorPublicoAutDTO.listNdtR1DatosPersonales[0].cveIdPfdomFiscal = $("#idHdnCveIdPfdomFiscal").val();
	ndtContadorPublicoAutDTO.listNdtR1DatosPersonales[0].correoElectronico = $("#idTxtEmailContador").val();
	ndtContadorPublicoAutDTO.listNdtR1DatosPersonales[0].telefonoFijo = $("#idTxtTelFijoContador").val();
	ndtContadorPublicoAutDTO.listNdtR1DatosPersonales[0].desTituloExpedidoPor = $("#idTxtNomInstituto").val();
	ndtContadorPublicoAutDTO.listNdtR1DatosPersonales[0].cedulaProfesional = $("#idTxtNumCedula").val();
}