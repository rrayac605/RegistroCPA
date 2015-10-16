
var WizardDictamenCtrl = {

	/*
	 * Funcion para inicializar la configuracion
	 */
	init : function(_contenedor, _idPersona) {

		this.config.contenedor = _contenedor;
		this.config.idPersona = _idPersona;

		/*
		 * Se crea una variable para el control del dialogo que sera a traves de
		 * un iFrame
		 */
		var d = null;
		
		if ($('#' + _contenedor).length == 0) {
			d = $('#' + _contenedor, parent.document);
		} else {
			d = $('#' + _contenedor);
		}
		
		/*
		 * Configuracion del dialogo
		 */
		this.dialogo = d.dialog({
			title : this.config.title,
			autoOpen : false,
			width : 900,
			height : 630,
			modal : true,
			resizable : false,
			autoResize : true,
			overlay : {
				opacity : 0.5,
				background : "black"
			},
			position : {
				my : "top",
				at : "top",
				of : window,
				offset : "0 10"
			}
		});

		/*
		 * Configuramos el metodo onClose del dialogo
		 * 
		 */
		this.dialogo.dialog({
			close : function(event, ui) {
				$(this).dialog('destroy').empty();
			}
		});
	},
	/*
	 * 
	 */
	setOnCloseCallback : function(_fnCallback) {
		this.callbacks = _fnCallback;
	},
	/*
	 * Datos de configuracion inicial de la consulta de la persona moral.
	 */
	config : {
		url : context_path+"/wizard/dictamen/initWizardDictamen.do",
		title : "IMSS Digital",
		contenedor : {},
		idPersona : null
	},
	/*
	 * Callback a invocar cuando se termine la invocacion de la consulta
	 */
	callbacks : {},

	dialogo : {},

	/**
	 * 
	 */
	abrir : function() {

		this.dialogo.dialog('open');

		var url = this.config.url + this.config.idPersona;

		$('#' + this.config.contenedor).html(
				'<iframe width="100%" height="100%" id="wizardDictamenFrame" src="' + url
						+ ' frameborder="0"'
						+ 'onload="set_size(\'wizardDictamenFrame\')" frameborder="0" />');

	},

	cerrar : function() {
		// Cerramos el dialogo
		this.dialogo.dialog('close');
	}
};
