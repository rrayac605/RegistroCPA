function visualizarAcuseNotaria(idTramiteNotaria) {
	var visorDialog = $('#visorTramitesDictamen').dialog({
		autoOpen: false,
		modal:true,
		resizable:false,
		title:"Visor de Acuse",
		width: 890,
		height: 400,
		buttons: {
			"Aceptar": function() {
				$(this).dialog("close");
				$('#firmaIframe').hide();
			}
		}
	});

	$('form#formaAcuse #idTramite').val('{"tramite":"'+ idTramiteNotaria+'"}');
	$('#formaAcuse').submit();
	
//	$('form#formaAdjuntos #idTramite').val('{"tramite":"'+ idTramiteNotaria+'"}');
//	$('#formaAdjuntos').submit();
	
	visorDialog.dialog('open');
	$('#firmaIframe').show();
}