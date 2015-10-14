/*
 * JS de control del Portlet Dictamen
 */
$.getScript(context_path+"/static/resources/js/delta/wizard/dictamen/wizardDictamen.js");

var portletDictamen = {
	wizardDictamen : function() {
		var idPersona = $("#idHdnIdPersona").val();
		
		WizardDictamenCtrl.init('wizardDictamenElectronico', idPersona);
		WizardDictamenCtrl.abrir();
	}
};

$("#abrirWizardDictamenPortlet").click(function(e) {
	e.preventDefault();
	portletDictamen.wizardDictamen();
});
