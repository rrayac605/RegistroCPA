/*
 * JS de control del Widget Dictamen
 */
$.getScript(context_path+"/static/resources/js/delta/wizard/dictamen/wizardDictamen.js");

var widgetDictamen = {
	wizardDictamen : function() {
		var idPersona = $("#idHdnIdPersona").val();
		
		WizardDictamenCtrl.init('wizardDictamenElectronico', idPersona);
		WizardDictamenCtrl.abrir();
	}
};

$("#abrirWizardDictamenWidget").live('click', function(e) {
	e.preventDefault();
	widgetDictamen.wizardDictamen();
});

$("#idRegistroContadorWidget").live('click', function() {
	widgetDictamen.wizardDictamen();
});