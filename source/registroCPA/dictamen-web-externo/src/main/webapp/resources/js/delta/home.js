// Variable para obtener dinamicamente el hostname del aplicativo
var server_name = window.location.hostname;
var tiempoEspera = 180;
var tiempoIntervaloEspera = 30;

$(document).ready(function() {
	//Se inicializa el widget
	widget.init();
	//Se inicializa el portlet
	portlet.init();
	
	// Se inicializa el componente de Firma Digital
	FirmaDigitalCtrl.init('firmaDigitalComponent', 'doctosRequeridosTramite');
	
	// Se inicializa el componente de Procesando Solicitud
    ProcesandoSolicitudCtrl.init('procesandoSolicitudComponent', tiempoEspera, tiempoIntervaloEspera);
    ProcesandoSolicitudCtrl.setOnCloseCallback(function() {});
    
    var conector = new CometCtrl();
    conector.init(false);
});

//Funcion inicializar la Firma Digital
var iniciarFirmaDigital = function (componenteFirma) {
    //Se settean los valores de entrada
    FirmaDigitalCtrl.datosEntrada.rfc = componenteFirma.rfc;
    FirmaDigitalCtrl.datosEntrada.val_rfc = componenteFirma.validarRFC;
    FirmaDigitalCtrl.datosEntrada.cad_original = componenteFirma.cad_original;
    FirmaDigitalCtrl.datosEntrada.firma_archivo = componenteFirma.firma_archivo;
    FirmaDigitalCtrl.datosEntrada.min_archivos = componenteFirma.min_archivos;
    FirmaDigitalCtrl.datosEntrada.max_archivos = componenteFirma.max_archivos;
    
    FirmaDigitalCtrl.datosEntrada.origen = server_name;
    FirmaDigitalCtrl.datosEntrada.operacion = componenteFirma.tipo_operacion; //"autentica";
    FirmaDigitalCtrl.datosEntrada.aplicacion = "nuevoDictamenElectronico";
    FirmaDigitalCtrl.datosEntrada.salida = "rfc,curp,rfc_rl,curp_rl,serie_cert,contenedores,acuse,firmas,vigencias";
    FirmaDigitalCtrl.datosEntrada.acuse = 'AcuseV1.0';
    
    FirmaDigitalCtrl.datosEntrada.idTipoSolicitud = componenteFirma.idTipoSolicitud;
    FirmaDigitalCtrl.datosEntrada.descripcionTipoSolicitud = componenteFirma.descripcionTipoSolicitud;
    FirmaDigitalCtrl.datosEntrada.idTipoTramite = componenteFirma.idTipoTramite;
    
    FirmaDigitalCtrl.datosEntrada.folioSolicitud = componenteFirma.folioSolicitud;
    FirmaDigitalCtrl.datosEntrada.curp = componenteFirma.curp;
    FirmaDigitalCtrl.datosEntrada.registroPatronal = componenteFirma.registroPatronal;
    FirmaDigitalCtrl.datosEntrada.nombreCompleto = componenteFirma.nombreCompleto;
    FirmaDigitalCtrl.datosEntrada.fechaElectronica = componenteFirma.fechaElectronica;
    FirmaDigitalCtrl.datosEntrada.afectado = componenteFirma.afectado;
    FirmaDigitalCtrl.datosEntrada.representados = componenteFirma.representados;
    FirmaDigitalCtrl.datosEntrada.domicilioActualizado = componenteFirma.domicilioActualizado;
    FirmaDigitalCtrl.datosEntrada.afectadoNuevosValores = componenteFirma.afectadoNuevosValores;
    FirmaDigitalCtrl.datosEntrada.mediosContacto = componenteFirma.mediosContacto;
    FirmaDigitalCtrl.datosEntrada.tipoAcuse = componenteFirma.tipoAcuse;
    FirmaDigitalCtrl.datosEntrada.acuse = componenteFirma.acuse;
    
    if (componenteFirma.mostrarCartaTerminos) {
        FirmaDigitalCtrl.datosEntrada.mostrarCartaTerminos = componenteFirma.mostrarCartaTerminos;
    } else {
        FirmaDigitalCtrl.datosEntrada.mostrarCartaTerminos = false;
    }
	
    FirmaDigitalCtrl.firmaDigital();
};


/**
 * Funcion para hacer uso del visor de Notaria, el cual despliega un Div donde se accede al reporte que fue enviado.
 */
var idTramiteNotaria;
var funcionVisor = function() {
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