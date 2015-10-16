var frmDatosBajaVoluntaria;

$(document).ready(function() {
	
});

function llenarDatosBajaVoluntaria() {
	
	ndtContadorPublicoAutDTO.listNdtCpaEstatus[0].desComentarios = $("#idTxtAreaMotivoBajaVoluntaria").val();
	
}

function initValidacionesBajaVoluntaria() {
	cargarValidacionConfirEmail();
	frmDatosBajaVoluntaria = $("#idFrmDatosBajaVoluntaria").validate({
		ignore: "",//esta propiedad se sobre escribe para que puedaas usar campos hidden
		rules: {
			txtAreaMotivoBajaVoluntaria: {
				required : true
			}
		},
		messages: {
			txtAreaMotivoBajaVoluntaria: {
				required: "Este campo es obligatorio, no debe quedar vac\u00EDo"
			}
		},
		errorElement: "div"
	});
}