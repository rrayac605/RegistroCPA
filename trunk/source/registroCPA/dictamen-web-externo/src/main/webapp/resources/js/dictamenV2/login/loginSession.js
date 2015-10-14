var frmLoginSession;

$(document).ready(function() {
	initValidacionesLogin();
	restriccionCampos();
	
	$("#idBtnContinuarLogin").click(function(e) {
		if (frmLoginSession.form()) {
			$('form#idFrmLoginSession').submit();
		}
	});
});

function initValidacionesLogin() {
	frmLoginSession = $("#idFrmLoginSession").validate({
		ignore: "",//esta propiedad se sobre escribe para que puedaas usar campos hidden
		rules: {
			txtCurpLogin: {
				required : true,
				minlength : 18
			},
			txtRfcLogin: {
				required : true,
				minlength : 12
			}
		},
		messages: {
			txtCurpLogin: {
				required: "Campo requerido",
				minlength: "El formato de la CURP no es valido"
			},
			txtRfcLogin: {
				required : "Campo requerido",
				minlength: "El formato del RFC no es valido"
			}
		},
		errorElement: "div"
	});
}

/**
 * Método que impide la inserción de un caracter no válido
 */
function restriccionCampos() {
	$("#idTxtCurpLogin").keypress(function (tecla) {
		if ((tecla.charCode >= 0 && tecla.charCode <= 31) ||		//control
			(tecla.charCode >= 48 && tecla.charCode <= 57) ||	//números
			(tecla.charCode >= 65 && tecla.charCode <= 90) ||	//Mayúsculas
			(tecla.charCode >= 97 && tecla.charCode <= 122) ||	//minúsculas
			(tecla.charCode == 127)) {							//del
			return true;
		}
		return false;
	});	$("#idTxtRfcLogin").keypress(function (tecla) {
		if ((tecla.charCode >= 0 && tecla.charCode <= 31) ||		//control
			(tecla.charCode >= 48 && tecla.charCode <= 57) ||	//números
			(tecla.charCode >= 65 && tecla.charCode <= 90) ||	//Mayúsculas
			(tecla.charCode >= 97 && tecla.charCode <= 122) ||	//minúsculas
			(tecla.charCode == 127)) {							//del
			return true;
		}
		return false;
	});
}