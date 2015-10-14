$(document).ready(function() {
    /*verifica si existe el div para dialog de confirmacion*/
    if ($("#dialog-confirm-common").length == 0){
        $('body').append(
            "<div id='dialog-confirm-common' " +
            "title='Mensaje del Sistema' " +
            "class='ui-dialog-content' " +
            "style='width: auto; min-height: 18.2px; height: auto;'></div>");
    }
    /*verifica si existe el div para dialog de informacion*/
    if ($("#dialog-info-common").length == 0){
        $('body').append( "<div id='dialog-info-common' " +
        "title='Mensaje del Sistema' " +
        "class='ui-dialog-content' " +
        "style='width: auto; min-height: 18.2px; height: auto;'></div>");
    }

});

function showConfirm(e){
    dialogoConfirmarGenerico("dialog-confirm-common", null, merge({
        titulo : "Mensaje del Sistema",
        mensaje : "",
        error : false,
        callback : undefined,
        callbackForXButton : undefined,
        height : 220 ,
        width : 320,
        textoBotonAceptar : "ACEPTAR",
        textoBotonCancelar :""
    },e));
}

function showError(e){
    if (typeof e=='string'){
        dialogoConfirmarGenerico("dialog-info-common", null, {
            titulo : "Mensaje del Sistema",
            mensaje : e,
            error : true,
            callback : undefined,
            callbackForXButton : undefined,
            height : 220 ,
            width : 320,
            textoBotonAceptar : "ACEPTAR",
            textoBotonCancelar :""
        });
    }else if (typeof  e =='object'){
        if (e['action']){
            e['callback']=e['action'];
            e['callbackForXButton']=e['action'];
        }
        dialogoConfirmarGenerico("dialog-info-common", null, merge({
            titulo : "Mensaje del Sistema",
            mensaje : "",
            error : true,
            callback : undefined,
            callbackForXButton : undefined,
            height : 220 ,
            width : 320,
            textoBotonAceptar : "ACEPTAR",
            textoBotonCancelar :""
        },e));
    }

}

function showMessage(objectMessage) {
    if (typeof objectMessage == 'string') {
        dialogoConfirmarGenerico("dialog-info-common", null, {
            titulo : "Mensaje del Sistema",
            mensaje : objectMessage,
            error : false,
            callback : undefined,
            callbackForXButton : undefined,
            height : 220 ,
            width : 320,
            textoBotonAceptar : "ACEPTAR",
            textoBotonCancelar :""
        });
    } else {
        if (objectMessage['action']) {
        	objectMessage['callback'] = objectMessage['action'];
        	objectMessage['callbackForXButton'] = objectMessage['action'];
        }
        dialogoConfirmarGenerico("dialog-info-common", null, merge({
            titulo : "Mensaje del Sistema",
            mensaje : "",
            error : false,
            callback : undefined,
            callbackForXButton : undefined,
            height : 220 ,
            width : 320,
            textoBotonAceptar : "ACEPTAR",
            textoBotonCancelar :""
        }, objectMessage));
    }
}

function merge(defaultt,params){
    jQuery.each(params,function(property,value){
        defaultt[property]=value;
    });
    return defaultt;
}

function dialogoConfirmarGenerico(divId, objDialogo, opciones) {
	var configuracion = {
		titulo : "Mensaje del Sistema", 
		mensaje : "mensaje o alerta", 
		error : false, 
		callback : undefined, 
		callbackForXButton : undefined, 
		height : "auto" ,
		width : "400",
		textoBotonAceptar : "Aceptar",
		textoBotonCancelar : "Cancelar"
	};
	
	// Realiza un Merge entre el Objeto "opciones" (parametro) y el Objeto "configuracion", 
	// si en el objeto "opciones" no son definidos todos los atributos se toman por default 
	// los del Objeto "configuracion" y se sobreescriben aquellos que son enviados en
	// el Objeto "opciones".
	jQuery.extend(configuracion, opciones);
	

	var callback = configuracion.callback;
	var callbackForXButton = configuracion.callbackForXButton;
	
	// Si los atribus "textoBotonAceptar" y "textoBotonCancelar" son enviados como cadena vacia, 
	// no se renderiza el boton.
	
	function botonAceptar(textoBoton) {
		var boton = {
			text : textoBoton,
			click : function() {
				if (jQuery.isFunction(callback)) {
					callback();
				}
				$(this).dialog('close');
				$('#' + divId).html('');
			}
		}
		return boton;
	}

	function botonCancelar(textoBoton) {
		var boton = {
			text : textoBoton,
			click : function() {
				if (jQuery.isFunction(callbackForXButton)) {
					callbackForXButton();
				}
				$(this).dialog('close');
				$('#' + divId).html('');
			}
		}
		return boton;
	}

	var botones = [];
	if (configuracion.textoBotonAceptar != "") {
		botones.push( botonAceptar(configuracion.textoBotonAceptar));
	}
	if (configuracion.textoBotonCancelar != "") {
		botones.push( botonCancelar(configuracion.textoBotonCancelar));
	}


	$('#'+divId).append("<p> <span id='textoMensaje'>"+configuracion.mensaje+"</span> </p>");
	$("#textoMensaje").removeAttr("style");
	
	if (configuracion.error) {
		$("#textoMensaje").attr("style", "color: red;");
	} else {
		$("#textoMensaje").attr("style", "color: black;");
	}	
	
	objDialogo = $('#'+divId).dialog({
		autoOpen : false,
		resizable : false,
		modal : true,
		height : configuracion.height,
		width : configuracion.width,
		title : configuracion.titulo,
		close: function(event, ui) {
				    if ( event.originalEvent && $(event.originalEvent.target).closest(".ui-dialog-titlebar-close").length ) {
				    	if (callbackForXButton != undefined && jQuery.isFunction(callbackForXButton)) {
				    		callbackForXButton();
				    	}
				    }
				    $('#'+divId).html("");
  				},
  		buttons : botones
	});
	objDialogo.dialog('open');
}