/**
 * 
 */

$(document).ready(function(){
	
	console.log("Inicializando Pantalla Menu");
	ocultarSecciones();
	
});


function selectTipoCatalogo(){

	ocultarSecciones();
	switch($("#selectTipoCatalogo").val()){
	case "1":
		$("#contadoresPublicosAutorizadosDIV").show();
		initContadoresPublicos();
		break;
	case "2":
		$("#despachosDIV").show();
		
		break;
	case "3":
		$("#colegiosAsociacionesDIV").show();
		break;
	}
	
	
}

function ocultarSecciones(){
	$("#contadoresPublicosAutorizadosDIV").hide();
	$("#despachosDIV").hide();
	$("#colegiosAsociacionesDIV").hide();
	
}