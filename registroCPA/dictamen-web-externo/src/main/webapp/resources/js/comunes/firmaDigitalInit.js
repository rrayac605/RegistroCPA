// Variable para obtener dinamicamente el hostname del aplicativo
var server_name = window.location.hostname;

$(document).ready(function() {
    try {
        setupFirmaDigital(
                'firmaDigitalComponent',
                'doctosRequeridosTramite',
                function (r) {
                    if ((typeof firmaExitosa != 'undefined') && $.isFunction(firmaExitosa)) {
                        firmaExitosa({
                            cadenaOriginal: r.contenedores[0].cadori,
                            recibo: r.firmas[0],
                            reciboNotarial: r.folio,
                            urlAcuseFirma: r.acuse,
                            serialCertificado: r.serie_cert,
                            strIniciaVigenciaCertificado: r.vigIni,
                            strFinVigenciaCertificado: r.vigFin,
                            codRespuesta: r.Resultado,
                            curp: r.curp,
                            idSolicitud: r.folio,
                            rfc: r.rfc
                        });
                    } else {
                        //el implementador no ha sobreescrito la funcion firmaExitosa(respuesta);
                        throw new Exception("La firma se ha realizado correctamente pero no se ha encontrado " +
                        "la funci\u00f3n firmaExitosa(respuesta)");
                    }
                },
                function () {
                    //si el usuario implementa la funcion firmaFallada se da prioridad a esa funcion
                    if ((typeof firmaFallada != 'undefined') && $.isFunction(firmaFallada)) {
                        //solo si el implementador sobreescribe la funcion para recuperar fallo de la firma
                        firmaFallada();
                    } else {
                        showError("La validaci\u00f3n de la firma no pudo ser realizada.");
                    }
                }
        );
    } catch (err) {
        showError("Lo sentimos el componente de firma digital no se ha logrado iniciar");
    }
});

function setupFirmaDigital(id1, id2, successCallback, errorCallback) {
    parent.FirmaDigitalCtrl.init(id1, id2);
    parent.FirmaDigitalCtrl.setOnCloseCallback(function() {
        if ( parent.FirmaDigitalCtrl.datosSalida != null && parent.FirmaDigitalCtrl.datosSalida.Resultado == 0) {
            if (jQuery.isFunction(successCallback)) {
                successCallback(parent.FirmaDigitalCtrl.datosSalida);
            }
        } else if (jQuery.isFunction(errorCallback)) {
            errorCallback();
        }
    });
}

function lanzarComponenteFirma(params) {
    var componenteFirma = {
        idTipoSolicitud : 2,
        descripcionTipoSolicitud : "",
        idTipoTramite : 1,
        folioSolicitud : 123, //$('#idFolioSolicitud').val(),
        curp : "",
        rfc : "",
        validarRFC : true,
        registroPatronal : "NOVUTEK351BR",
        nombreCompleto : "",
        fechaElectronica : new Date(),
        cad_original : "Cadena Original", //$('#idCadenaOriginal').val(),
        tipo_operacion : 'firmaCMS',
        firma_archivo : false,
        min_archivos : 0,
        max_archivos : 0,
        afectado: [""],
        tipoAcuse: '1',
        acuse: 'CDCT'
    };
    jQuery.each(params,function(property,value) {
        componenteFirma[property]=value;
    });
    iniciarFirmaDigital(componenteFirma);
}


function visualizaAcuse(tramite) {
    parent.idTramiteNotaria = tramite;
    parent.funcionVisor();
}

//Funcion inicializar la Firma Digital
var iniciarFirmaDigital = function (componenteFirma) {
    //Se settean los valores de entrada
    parent.FirmaDigitalCtrl.datosEntrada.rfc = componenteFirma.rfc;
    parent.FirmaDigitalCtrl.datosEntrada.val_rfc = componenteFirma.validarRFC;
    parent.FirmaDigitalCtrl.datosEntrada.cad_original = componenteFirma.cad_original;
    parent.FirmaDigitalCtrl.datosEntrada.firma_archivo = componenteFirma.firma_archivo;
    parent.FirmaDigitalCtrl.datosEntrada.min_archivos = componenteFirma.min_archivos;
    parent.FirmaDigitalCtrl.datosEntrada.max_archivos = componenteFirma.max_archivos;
    
    parent.FirmaDigitalCtrl.datosEntrada.origen = server_name;
    parent.FirmaDigitalCtrl.datosEntrada.operacion = componenteFirma.tipo_operacion; //"autentica";
    parent.FirmaDigitalCtrl.datosEntrada.aplicacion = "nuevoDictamenElectronico";
    parent.FirmaDigitalCtrl.datosEntrada.salida = "rfc,curp,rfc_rl,curp_rl,serie_cert,contenedores,acuse,firmas,vigencias";
    parent.FirmaDigitalCtrl.datosEntrada.acuse = 'AcuseV1.0';
    
    parent.FirmaDigitalCtrl.datosEntrada.idTipoSolicitud = componenteFirma.idTipoSolicitud;
    parent.FirmaDigitalCtrl.datosEntrada.descripcionTipoSolicitud = componenteFirma.descripcionTipoSolicitud;
    parent.FirmaDigitalCtrl.datosEntrada.idTipoTramite = componenteFirma.idTipoTramite;
    
    parent.FirmaDigitalCtrl.datosEntrada.folioSolicitud = componenteFirma.folioSolicitud;
    parent.FirmaDigitalCtrl.datosEntrada.curp = componenteFirma.curp;
    parent.FirmaDigitalCtrl.datosEntrada.registroPatronal = componenteFirma.registroPatronal;
    parent.FirmaDigitalCtrl.datosEntrada.nombreCompleto = componenteFirma.nombreCompleto;
    parent.FirmaDigitalCtrl.datosEntrada.fechaElectronica = componenteFirma.fechaElectronica;
    parent.FirmaDigitalCtrl.datosEntrada.afectado = componenteFirma.afectado;
    parent.FirmaDigitalCtrl.datosEntrada.representados = componenteFirma.representados;
    parent.FirmaDigitalCtrl.datosEntrada.domicilioActualizado = componenteFirma.domicilioActualizado;
    parent.FirmaDigitalCtrl.datosEntrada.afectadoNuevosValores = componenteFirma.afectadoNuevosValores;
    parent.FirmaDigitalCtrl.datosEntrada.mediosContacto = componenteFirma.mediosContacto;
    parent.FirmaDigitalCtrl.datosEntrada.tipoAcuse = componenteFirma.tipoAcuse;
    parent.FirmaDigitalCtrl.datosEntrada.acuse = componenteFirma.acuse;
    
    if (componenteFirma.mostrarCartaTerminos) {
        parent.FirmaDigitalCtrl.datosEntrada.mostrarCartaTerminos = componenteFirma.mostrarCartaTerminos;
    } else {
        parent.FirmaDigitalCtrl.datosEntrada.mostrarCartaTerminos = false;
    }
	
    parent.FirmaDigitalCtrl.firmaDigital();
};