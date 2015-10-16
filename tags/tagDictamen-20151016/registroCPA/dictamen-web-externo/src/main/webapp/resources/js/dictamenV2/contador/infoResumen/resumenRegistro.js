$(document).ready(function() {
	$("#idLinkActualizacionContador").click(function(e) {
		var urlSubmitActualizacion = context_path + "/dictamenV2/contador/actualizacion/init.do";
		$('form#idFrmResumenRegistro').attr('action', urlSubmitActualizacion);
        $('form#idFrmResumenRegistro').submit();
	});
});

function visualizarAcuse() {
	visualizarAcuseNotaria(ndtContadorPublicoAutDTO.listNdtCpaTramites[0].reciboNotaria);
}