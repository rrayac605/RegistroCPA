/*crea data table para paginado de datos*/

var gridContadorPublico;
var contadorPublicoSeleccionado;
var urlListaContadorPublico = context_path+"/contadorPublico/obtenerLista.do";
var tblContadorPublico = "#tablaContadorPublico";
var cvdIdContadorPublico = "";
var vari;
var vari2;
var columnsContadorPublicAut = [ {
    mDataProp : "cveIdCpa",
    sTitle : "ID",
    bVisible : false
}, {
    mDataProp : "ditPersona.nomPrimerApellido",
    sTitle : "Apellido Paterno"
},{
    mDataProp : "ditPersona.nomSegundoApellido",
    sTitle : "Apellido Materno"
},{
    mDataProp : "ditPersona.nomNombre",
    sTitle : "Nombre"
},{
    mDataProp : "ditPersona.curp",
    sTitle : "Curp"
},{
    mDataProp : "numRegistroCpa",
    sTitle : "Registro IMSS"
},{
    mDataProp : "ndcEstadoCpa.desEstadoCpa",
    sTitle : "Estatus"
},{   
	sTitle : "Delegacion",
    fnRender : function(oObj) {      
    	return oObj.aData["listNdtR1DatosPersonales"][0].desDelegacion;
    }
},{   
    sTitle : "Subdelegacion",
    fnRender : function(objData) {
    	return objData.aData["listNdtR1DatosPersonales"][0].desSubdelegacion;
     }
}];

/*store changes on filter elements*/
var contadorPublicoFiltro={
	cpaApellidoPaterno:null,
	cpaApellidoMaterno:null,
	cpaNombre:null,
	cpaCurp:null,
	cpaNumeroRegistro:null,
	selectCpaStatus:null,
	selectCpaDelegacion:null,
	selectCpaSubdelegacion:null
};


function initContadoresPublicos(){
    gridContadorPublico = crearGridInfo(tblContadorPublico,
            columnsContadorPublicAut, urlListaContadorPublico);
        gridContadorPublico.fnPageChange('first');

        /*
         $('#idTblDatosInfoCole_filter input').keypress(function (tecla) {
         if ((tecla.charCode >= 0 && tecla.charCode <= 31) ||	//control
         (tecla.charCode >= 48 && tecla.charCode <= 57) ||	//n�meros
         (tecla.charCode >= 65 && tecla.charCode <= 90) ||	//May�sculas
         (tecla.charCode >= 97 && tecla.charCode <= 122) ||	//min�sculas
         (tecla.charCode == 127)) {							//del
         return true;
         }
         return false;
         });*/

        /*on blur event active search function*/
        $(".filter").change(function(){
            /*detect if element value has changed*/
            val=$.trim($(this).val());
            name=$(this).attr("name");
            if (val!=='') contadorPublicoFiltro[name]=val;
            else if (contadorPublicoFiltro[name]!==null) contadorPublicoFiltro[name]=null;
            /*trigger refresh datatable function*/
            gridContadorPublico.fnPageChange('first');
        });
        
        
        inicializandoCombos();
        $("#tablaContadorPublico_filter").hide();
}



/*  Funcion que crea la tabla de informacion del colegio */
function crearGridInfo(idGrid, columModel, source) {
    var gridInfo = $(idGrid).dataTable({
        "bJQueryUI": false,
        "bFilter" : true,
        "bInfo" : true,
        "bSort": false,
        "bPaginate" : true,
        "bAutoWidth" : false,
        "bServerSide": true,
        "bProcessing": false,
        "bLengthChange" : false,
        /*"oLanguage" : {
         "sSearch" : "<strong>FILTRAR POR ID:</strong>",
         "sZeroRecords" : "<center><strong style=\"font-size: small;\">Sin informaci&oacute;n que mostrar</strong></center>",
         "sInfo" : "Mostrando contadores p�blicos del _START_ al _END_",
         "sInfoEmpty" : "Mostrando 0 contadores p�blicos",
         "sInfoFiltered" : ""
         },*/
        "bDestroy": true,
        "iDisplayLength": 10,
        "sPaginationType": "bootstrap",
        "aaSorting" : [[0, 'asc']],
        "sAjaxSource": source,
        "aoColumns" : columModel,
        "fnServerData" : consultarContadorPublico,
        "iDeferLoading" : 0
    });

    /* Add a click handler to the rows */
    /*$("#idTblDatosInfoCole_filter tbody").click(function(event) {
     $(gridInfo.fnSettings().aoData).each(function() {
     $(this.nTr).removeClass('row_selected');
     });
     if (!$(event.target).hasClass('dataTables_empty')  &&
     !$(event.target.parentNode).hasClass('dataTables_empty') &&
     !$(event.target.parentNode.parentNode).hasClass('dataTables_empty') &&
     !$(event.target.parentNode.parentNode.parentNode).hasClass('dataTables_empty')) {

     if (!$(event.target.parentNode).hasClass('row_selected')) {
     $(event.target.parentNode).addClass('row_selected');
     haySeleccionado(gridInfo);
     }
     }
     });*/
    return gridInfo;
}

/*  Funcion que obtiene el arreglo de renglones seleccionados*/
function fnGetSelected(oTableLocal) {
    var aReturn = new Array();
    var aTrs = oTableLocal.fnGetNodes();
    for (var i = 0 ; i < aTrs.length ; i++) {
        if ($(aTrs[i]).hasClass('row_selected')) {
            aReturn.push( aTrs[i] );
        }
    }
    return aReturn;
}

function haySeleccionado(grid) {
    var position = fnGetSelected(grid);
    contadorPublicoSeleccionado = grid.fnGetData(position[0]);
    limpiaVarContadorPublico();
    if (contadorPublicoSeleccionado != null) {
        cvdIdContadorPublico = contadorPublicoSeleccionado.cveIdCpa;
        // llenaObjetoContadorPublico();
    }
}

function consultarContadorPublico(sSource, aoData, fnCallback) {
    var wrapper = new Object();
    wrapper.oForm = contadorPublicoFiltro;//new Object();
    wrapper.aoData = aoData;
    //if ($('#tablaContadorPublico_filter input').val().length > 3) {
    $.postJSON(sSource, wrapper, function(data) {
        //var listaContadores = data.aaData;
        fnCallback(data);
        /*if ($('#idTblDatosInfoCole_filter input').val().length >= 12 && listaContadores.length == 0) {
         var oDialogoGenerico;
         var opcionesDialogo = {
         titulo : "Mensaje del Sistema",
         mensaje : "No se encontr\u00f3 ning\u00fan dato. Favor de solicitar la alta del contador p�blico ante las oficinas del Sistema de Administraci\u00f3n Tributaria SAT.",
         error : false,
         callback : undefined,
         callbackForXButton : undefined,
         height : 250,
         width : 320,
         textoBotonAceptar : "ACEPTAR",
         textoBotonCancelar : ""
         };
         dialogoConfirmarGenerico("dialog-confirm-common", oDialogoGenerico, opcionesDialogo);
         }*/
    }).done(function() {
    }).error(function(response) {
    });
    //}
}

function limpiaVarContadorPublico() {
    cvdIdContadorPublico = "";
}

function validaSeleccionContadorPublico() {
    var selecContadorPublico = fnGetSelected(gridContadorPublico);
    return selecContadorPublico[0] != undefined &&
        cvdIdContadorPublico != null;
}


function initValidadorForma(){
	$("#frmDatosColegio").validate({
		ignore: "",//esta propiedad se sobre escribe para que puedaas usar campos hidden
		rules: {
			txtDatosColegioRFC: {
				required : true,
				minlength : 12
				},
			txtDatosColegioRazonSocial: {
				required : true
			}
		},
		messages: {
			txtDatosColegioRFC: {
				required: "Este campo es obligatorio",
				minlength: "Longitud err\u00F3nea (debe ser de 13 caracteres)"
			},
			txtDatosColegioRazonSocial: {
				required : "Este campo es obligatorio, no debe quedar vac\u00EDo"
			}
		},
		errorElement: "div"
	});
	
}

function inicializandoCombos(){	
	 $.postJSON(context_path+"/catalogosDictamen/recuperaEstatusCPA.do", null, function(data) {
		 var stringOptions = "<option value='-1'>--Por favor seleccione--</option>";
         $.each(data, function( index, item ) {
             stringOptions += "<option value='" + item.cveIdEstadoCpa + "'>" + item.desEstadoCpa + "</option>";
         });
         $("#selectCpaStatus").html(stringOptions);		 
	 });
	 
	 
	 $.postJSON(context_path+"/catalogosDictamen/recuperaDelegaciones.do", null, function(data) {		 
		 var stringOptions = "<option value='-1'>--Por favor seleccione--</option>";
         $.each(data, function( index, item ) {
             stringOptions += "<option value='" + item.claveOpcion + "'>" + item.descOpcion + "</option>";
         });
         $("#selectCpaDelegacion").html(stringOptions);		 
	 });
}


function recuperaSubdelegacionesPorDelegacion(){
	
	 $.postJSON(context_path+"/catalogosDictamen/recuperaListaSubDelegaciones.do", $("#selectCpaDelegacion").val(), function(data) {		 
		 var stringOptions = "<option value='-1'>--Por favor seleccione--</option>";
         $.each(data, function( index, item ) {
             stringOptions += "<option value='" + item.claveOpcion + "'>" + item.descOpcion + "</option>";
         });
         $("#selectCpaSubdelegacion").html(stringOptions);		 
	 });
	
	
}

