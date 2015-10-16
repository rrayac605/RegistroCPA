/**
 * 
 */


$(document).ready(function() {
	
	$("#idOlMenuContador").selectable({
			selected : function(event, ui) {
				$(ui.selected).siblings().removeClass("ui-selected");	     
				this.opcionSeleccionada=ui.selected.id;
			},
			 stop: function( event, ui ) {
				 $("#seleccionFiltro").val(this.opcionSeleccionada);
				 $("#idFrmMenuRegistro").submit();
			 }			
		});

	
});